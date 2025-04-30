package actions.API.Utils;

import actions.API.HttpClient
import actions.API.Utils.BIAdminLogin
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import utils.Settings

class CopyAffiliate{
    private static final Logger logger = LoggerFactory.getLogger(CopyAffiliate.class);
    public static String run(String licensingModel = null,
                             String unlimitedBA = null,
                             String baLicenseCount = null,
                             String unlimitedIdeaBox = null,
                             String ideaBoxLicenseCount = null) {
        def params = [
            "Licensing Model"                              : licensingModel,
            "Unlimited Brightidea Administrator License Type": unlimitedBA,
            "Brightidea Administrator License Type Purchased Count": baLicenseCount,
            "Unlimited Idea Box Manager License Type"      : unlimitedIdeaBox,
            "Idea Box Manager License Type Purchased Count": ideaBoxLicenseCount
        ]
        return run(params)
    }

    public static String run(def params){
        //RETURNS: Name of the affiliate created
        //Login
        BIAdminLogin.run()

        //First affiliate gets created
        //Define affiliate name to be created, use current time in miliseconds to keep it unique
        def name = null
        if(params."New Affiliate Name" != null){
            name = params."New Affiliate Name"
            logger.debug("Using Passed in Name: ${name}")
        }else{
            name = "auto"+System.currentTimeMillis().toString() + (100000 + new Random().nextInt(900000)).toString()
            logger.debug("Generated Name: ${name}")
        }

        def body = [:]
        String URLPath = System.getProperty("environment.url", Settings.getProperty("environment.url"));
        logger.debug("URLPath: ${URLPath}")
        def qaSourceId,sandboxSourceId
        
        
        if(params."Licensing Model"=="Standard Licensing Model"){         
           def BALicenseCount,IdeaBoxLicenseCount,unlimitedIdeaBox,unlimitedBA
           //templatemaster (OD991953)
           qaSourceId = "B774E28C-1DF1-11EB-AE0A-0A2B3ED5F0CD"
           //templatemaster (OD304446)
           sandboxSourceId = "D0CDEA7F-1DF1-11EB-A91B-0A119DDF7D5E"
            
            if(params."Brightidea Administrator License Type Purchased Count" == null) {
                BALicenseCount = ""
            } else {
                BALicenseCount = params."Brightidea Administrator License Type Purchased Count"
            }
            if(params."Idea Box Manager License Type Purchased Count" == null) {
                IdeaBoxLicenseCount = ""
            } else {
                IdeaBoxLicenseCount = params."Idea Box Manager License Type Purchased Count"
            }
            if(params."Unlimited Brightidea Administrator License Type" == null) {
                unlimitedBA = "0"
            } else {
                unlimitedBA = params."Unlimited Brightidea Administrator License Type"
            }
            if(params."Unlimited Idea Box Manager License Type" == null) {
                unlimitedIdeaBox = "0"
            } else {
                unlimitedIdeaBox = params."Unlimited Idea Box Manager License Type"
            }
           
           body = [          
                name:name,
                pricing:"standard",
                licenses:"3",
                company:name,
                domain:name,
                test_automation:1,
                pricing_model: "standard",
				admin_unlimited: "${unlimitedBA}",
               	admin_count: "${BALicenseCount}",
				idea_box_admin_unlimited: "${unlimitedIdeaBox}",
				idea_box_admin_count: "${IdeaBoxLicenseCount}",
                db_name:"OnDemand_MySQLAutomation"
            ]            
        } else {
          //BI (OD3334)	  
          qaSourceId = "04D55223-E8D3-42E5-A0BC-AA21E89B27E8"
          //masteraffiliate (OD28338)
          sandboxSourceId = "395D9C3F-E320-4CE1-A99C-FF52506E0D75"
            
          body = [          
                name:name,
                pricing:"admin_based",
                pricing_model:"admin_based",
                licenses:"3",
                company:name,
                domain:name,
                test_automation:1,
                //db_name:"OnDemand_MySQL"
                db_name:"OnDemand_MySQLAutomation"
            ]
        }
             def response = HttpClient.MainMakeRequest(Type:"POST",Path:"/bi/bi_xt_create_affiliate.bix",Body:body,RequestContentType:"application/x-www-form-urlencoded",ContentType:"application/json","App Environment":"BI Admin").responseData
             logger.debug("Create Affiliate Response: ${response}")
             logger.debug("Affiliate Name = ${name}")
             HttpClient.affiliatename = name
             def affiliateid = response.affiliate_id
             HttpClient.setAffiliateid(affiliateid)
             logger.debug("AffiliateID = ${affiliateid}")
             def systemid = response.system_id
             HttpClient.setSystemid(systemid)
             logger.debug("SystemID = ${systemid}")
             
             //Now copy an affiliate to a newly created one
             def sourceid
             def host
             logger.debug("URLPath: ${URLPath}")
             switch(URLPath.split("\\.")[0]){
                 case "brightideatest":
                 sourceid = "${qaSourceId}"
                 host = "test.brightideatest"
                 break
                 case "brightideasandbox":
                 sourceid = "${sandboxSourceId}"
                 host = "sandbox.brightideasandbox"
                 break
                 case "eu.com":
                 sourceid = "2F4AABDD-4A83-11E9-A56B-02FE20D32D18"
                 host = "eu.eu.brightidea"
                 break
             }
             assert sourceid != null : "Source ID is null. Ensure the URLPath is correctly set and matches a valid case."
             body = [
                 source: sourceid,
                 destination: systemid,
                 affiliate_data: "bi_affiliate,profile,member,group,role,ent_widget,label,ent_navigation,newsletter,status,business_impact_configuration,campaign,ws_navigation,category,campaign_widget,campaign_group,ws_campaign_terms,ws_role_xref,form,pipeline_folder,stage,step,ess_question,tag,idea,comment,vote,file,bi_transaction_point,bi_css,action_item,app_disabled,app_configured", //"bi_affiliate,profile,member,group,role,ent_widget,label,ent_navigation,newsletter,status,campaign,ws_navigation,category,campaign_widget,campaign_group,ws_campaign_terms,ws_role_xref,form,pipeline_folder,stage,step,ess_question,idea,comment,vote,file,bi_transaction_point,bi_css,action_item",
                 hostname: host,
                 affiliate_id: affiliateid,
	             rmq: 1
             ]
             response = HttpClient.MainMakeRequest(Type:"POST",Path:"/bi/bi_xt_copy_affiliate.bix",Body:body,RequestContentType:"application/x-www-form-urlencoded",ContentType:"application/json","App Environment":"BI Admin").responseData
        	def id = response.id
            logger.debug("Affiliate to be Copied - Response ID: ${id}")
            logger.debug("Affiliate Copy - Response: ${response}")
             //Wait until the affiliate gets fully copied
             int i = 0
             while(true){
                 response = HttpClient.MainMakeRequest(RequestContentType:"text/plain",ContentType:"application/json",Type:"GET",Path:"/bi/bi_copy_affiliate_status.bix?id=${id}","App Environment":"BI Admin","Dont Print":true).responseData
                 logger.debug("Waiting for Affiliate to Copy: ${response} , Attempting for the ${i+1} time...")
                 if(!response.copy && !response.search){
                     assert i < 150,"Copy Affiliate timed out"
                     sleep(2000)
                     i++
                 }else{
                     logger.debug("Affiliate copied with Copy:${response.copy} and Search:${response.search} in ${i*2} seconds")
                     i = 0
                     while(true & !response.search){//add search test cases indicator; go here is must have search
                         //waiting on Search to copy 
                         logger.debug("Waiting on Searchindex to complete ...")
                         response = HttpClient.MainMakeRequest(RequestContentType:"text/plain",ContentType:"application/json",Type:"GET",Path:"/bi/bi_copy_affiliate_status.bix?id=${id}","App Environment":"BI Admin","Dont Print":true).responseData
                         if(!response.search){
                             //search not copied yet
                             assert i < 60,"Copy Affiliate timed out due to Searchindex after ${i} seconds"
                             sleep(4000)
                             i++
                         }else{
                             //search copied
                             logger.debug("Affiliate copied. Search:${response.search}. Searchindex completed in ${i} seconds")
                             logger.debug("Affiliate copied. Search:${response.search}. Searchindex completed in ${i} seconds")
                             break
                         }
                     }
                     break
                 }
                 /*
                 if(!response.status){
                     assert i < 150,"Copy Affiliate timed out"
                     sleep(2000)
                     i++
                         }
                 else{
                     break
                 }*/
             }

             //Lets see if sleep fixes the login issue
             //sleep(10000)
			
        if(URLPath.split("\\.")[1]=="eu"){
            return "https://${name}.eu.brightidea.com"
        }
            else {
                return "https://${name}.${URLPath}"
            }

            }
    }