package actions.Utils;

import actions.selenium.Browser
import org.json.simple.JSONObject
import org.json.simple.JSONArray
import org.json.simple.parser.JSONParser;
import actions.selenium.GetText
import actions.Utils.SystemManagerHelper
import actions.general.Login

class RetrunSystemID{
    public static String run(def params){
   		//def systemInfolink = SystemManagerHelper.getAffiliateURL()+"/_system/list?affiliate="+SystemManagerHelper.getAffiliateId()   
        def systemInfolink
        if(params."affiliateURL" && params."affiliateID"){systemInfolink = params."affiliateURL"+"/_system/list?affiliate="+params."affiliateID"}
        else{systemInfolink = SystemManagerHelper.getAffiliateURL()+"/_system/list?affiliate="+SystemManagerHelper.getAffiliateId()}
        println("systemInfolink ${systemInfolink}")
        
        Login.run(Email:"bi.adminuser1@brightidea.com", Password:"brightidea1", "Verify if Logged In On Enterprise homepage":false)
        Browser.Driver.navigate().to("${systemInfolink}")
        String jsonStr =  GetText.run(ID:"//BODY/PRE")
        println("System Info Returned: ${jsonStr}")
        JSONParser parser = new JSONParser();
        JSONObject systemInfo = (JSONObject) parser.parse(jsonStr);
        JSONArray systemList =(JSONArray)systemInfo.get("system_list")
        JSONObject systemListJsn = systemList.get(0)
        String systemId = systemListJsn.get("system_id")
        
        println("Affiliate System ID: ${systemId}")
        SystemManagerHelper.setSystemId(systemId)
        return systemId
    }
}