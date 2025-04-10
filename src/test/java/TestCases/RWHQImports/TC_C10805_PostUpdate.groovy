package TestCases.RWHQImports

import BaseClasses.TestBase
import actions.API.Utils.CopyAffiliate
import actions.API.Utils.DeleteAffiliate
import actions.Utils.SettoLabEnvironment
import actions.Widgets.SetWidget
import actions.Widgets.SetWidgetController
import actions.Widgets.SetWidgetPostUpdate
import actions.Widgets.VerifyWidgetExists
import actions.Widgets.VerifyWidgetUpdates
import actions.general.Login
import actions.general.NavigateWebStormAdminBar
import actions.general.Wait
import actions.selenium.Browser
import actions.selenium.CloseWindow
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C10805 - Post Update
class TC_C10805_PostUpdate extends TestBase{
    private static final Logger logger = LoggerFactory.getLogger(TC_C10805_PostUpdate.class);
    private static Browser browser = Browser.getInstance()

    //private static def variables = [:]
    private static def params = [:]

    @BeforeSuite
    public void beforeState() {
        params."Username Email" = "bi.adminuser1@brightidea.com"
        params."Licensing Model" = null
        params."Unlimited Brightidea Administrator License Type" = null
        params."Brightidea Administrator License Type Purchased Count" = null
        params."Unlimited Idea Box Manager License Type" = null
        params."Idea Box Manager License Type Purchased Count" = null
        params."Run Browser in Incognito" = null
    }

    @Test
    public void testcase(){
        //Basestate
        Action58123c20fa4ee77809f468f6(params)
        //Navigate WebStorm or MTS
        new NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Home/.toString())
        //Set Widget Controller
        new SetWidgetController().run("Widget Edit Mode":/Enable/.toString(),"Add Widget from Selection":/Post Update 2.0/.toString())
        //Navigate WebStorm or MTS
        new NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Home/.toString())
        //Set Widget Post Update
        new SetWidgetPostUpdate().run("What are you working on":/post update test/.toString())
        //Verify Widget Updates
        new VerifyWidgetUpdates().run("Update Text Contains":/post update test/.toString(),"Number of Matches":/1/.toString())
        //Set Widget
        new SetWidget().run("Name of Widget to Modify":/Post Update/.toString(),"Remove":true)
        //Verify Widget Exists
        new VerifyWidgetExists().run("Widget Name":/Post Update/.toString(),"Number of Matches":/0/.toString())
    }
    //Basestate
    public static def Action58123c20fa4ee77809f468f6(def params){
        //Create Affiliate based on Master Affiliate
        /*
        String affiliateURL = new CopyAffiliate().run("Licensing Model":/${params."Licensing Model"}/.toString(),
                "Unlimited Brightidea Administrator License Type":/${params."Unlimited Brightidea Administrator License Type"}/.toString(),
                "Brightidea Administrator License Type Purchased Count":/${params."Brightidea Administrator License Type Purchased Count"}/.toString(),
                "Unlimited Idea Box Manager License Type":/${params."Unlimited Idea Box Manager License Type"}/.toString(),
                "Idea Box Manager License Type Purchased Count":/${params."Idea Box Manager License Type Purchased Count"}/.toString())
        */
        String affiliateURL = new CopyAffiliate().run()
        //Open Browser
        /*
        new Browser().run(
                "Run Browser in Incognito":/${params."Run Browser in Incognito"}/.toString(),
                "URL":/${variables."affiliateURL"}/.toString())
                "Browser Type":/${variables."Browser"}/.toString())
         */
        browser.run("URL":affiliateURL)
        new Wait().run("5")
        //Login
        new Login().run("Email":/${params."Username Email"}/.toString(),"Password":/brightidea1/.toString())

        //Set to Lab Environment
        new SettoLabEnvironment().run("Email":/${params."Username Email"}/.toString())

    }
    //Afterstate
    public static def Action581259c8fa4ee77809f46905(def params){
        try{
            //Close Current Window
            new CloseWindow().run([:])
        }
        catch(all){}catch(Error err){}
        //Delete Affiliate
        new DeleteAffiliate().run([:])

    }
    @AfterMethod
    public void afterState(){
        //Afterstate
        Action581259c8fa4ee77809f46905([:])
    }
}
