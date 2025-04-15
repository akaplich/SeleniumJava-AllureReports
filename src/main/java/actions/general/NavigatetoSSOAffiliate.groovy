package actions.general;

import actions.selenium.Browser
import utils.Settings

class NavigatetoSSOAffiliate{
    public static void run(def params){
        def CodeEnvironment  = Settings.getProperty("environment.CodeEnvironment");
        String URLPath = Settings.getProperty("environment.url");
        if(URLPath.contains("sandbox")){
            if (params."DomainName".contains("sso")){
            	Browser.Driver.get("https://${params."DomainName"}1.brightideasandbox.com") //added "1", had to create a new affiliate in SB    
            } else if(params."DomainName".contains("licenseManager")){
                Browser.Driver.get("https://www.brightideasandbox.com/licenseManager")
            } else {
                Browser.Driver.get("https://${params."DomainName"}.brightideasandbox.com")
            }
        } else if(URLPath.contains("test")) {
             if(params."DomainName".contains("licenseManager")){
                Browser.Driver.get("https://www.brightideatest.com/licenseManager")
             } else {
            Browser.Driver.get("https://${params."DomainName"}.brightideatest.com")} 
        } else {
            //Browser.Driver.get("https://shefalimysql.brightidea.com")
            Browser.Driver.get(params."DomainName")
        }
    }
}