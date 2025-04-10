package BaseClasses

import actions.selenium.Browser
import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod

public class TestBase {

    @BeforeSuite
    public void beforeState(){

    }
    @AfterMethod
    public void afterState(){
        Browser.quit();
    }

    public static Map getBaseStateParams(String type) {
        Map baseStateParams = [:]
        if(type == "legacy"){
            baseStateParams."Username Email" = "bi.adminuser1@brightidea.com"
            baseStateParams."Licensing Model" = null
            baseStateParams."Unlimited Brightidea Administrator License Type" = null
            baseStateParams."Brightidea Administrator License Type Purchased Count" = null
            baseStateParams."Unlimited Idea Box Manager License Type" = null
            baseStateParams."Idea Box Manager License Type Purchased Count" = null
            baseStateParams."Run Browser in Incognito" = null
        }
        return baseStateParams
    }

}