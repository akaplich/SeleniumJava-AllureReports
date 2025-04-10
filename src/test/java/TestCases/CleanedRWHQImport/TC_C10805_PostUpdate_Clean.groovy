package TestCases.CleanedRWHQImport

import BaseClasses.TestBase
import actions.API.Utils.CopyAffiliate
import actions.API.Utils.DeleteAffiliate
import actions.Utils.SettoLabEnvironment
import actions.Widgets.*
import actions.general.Login
import actions.general.NavigateWebStormAdminBar
import actions.general.Wait
import actions.selenium.Browser
import actions.selenium.CloseWindow
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.testng.annotations.AfterMethod
import org.testng.annotations.BeforeSuite
import org.testng.annotations.Test

//C10805 - Post Update
class TC_C10805_PostUpdate_Clean extends TestBase{
    private static final Logger logger = LoggerFactory.getLogger(TC_C10805_PostUpdate_Clean.class);
    private static Browser browser = Browser.getInstance()

    //private static def variables = [:]
    private static def params = [:]

    @BeforeSuite
    public void beforeState() {
        params."Username Email" = "bi.adminuser1@brightidea.com"
        params."Password" = "brightidea1"
        params."Run Browser in Incognito" = null
    }

    @Test
    public void testcase(){
        // Create Affiliate
        // Copy affiliate has been updated to set all params to null if they are not passed in
        // The following command will generate a legacy affiliate
        String affiliateURL = new CopyAffiliate().run()

        // Login
        browser.run("URL":affiliateURL)
        new Login().run("Email":/${params."Username Email"}/.toString(),"Password":/${params."Password"}/.toString())

        //Set to Lab Environment
        new SettoLabEnvironment().run("Email":/${params."Username Email"}/.toString())
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


    @AfterMethod
    public void afterState(){
        try{
            //Close Current Window
            new CloseWindow().run([:])
        }
        catch(all){}catch(Error err){}
        //Delete Affiliate
        new DeleteAffiliate().run([:])
    }
}
