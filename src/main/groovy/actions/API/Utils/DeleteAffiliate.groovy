package actions.API.Utils;

import actions.API.HttpClient
import actions.API.Utils.BIAdminLogin
import actions.Utils.SystemManagerHelper
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class DeleteAffiliate{
    private static final Logger logger = LoggerFactory.getLogger(DeleteAffiliate.class);

    public static void run(def params){
        logger.debug("Params: ${params}")
        //systemid (optional) = Id for the affiliate that will get deleted, if not specified then will use HttpClient.systemid or System Manager helper if System Manager was used
        //Login
        BIAdminLogin.run()
		
        if(params.systemid){println("Systemid Not Null: ${params.systemid}")}
        if(!params.systemid){
            params.systemid=SystemManagerHelper.getSystemId()
        }
        if(!params.systemid){
            println("System Manager Not Used to Create Affiliate")
            params.systemid=HttpClient.getSystemid()}
        println("Systemid Set ${params.systemid}")
        def body = [
            //all_dbs:params.db_name,
            all_affiliates:params.systemid
        ]
        def response = HttpClient.MainMakeRequest(Type:"POST",Path:"/bi/bi_xt_really_delete_affiliate.bix",Body:body,RequestContentType:"application/x-www-form-urlencoded",ContentType:"text/html","App Environment":"BI Admin")
    }
}