package TestCases

import BaseClasses.TestBase
import actions.API.Utils.CopyAffiliate
import actions.API.Utils.DeleteAffiliate
import actions.Utils.SettoLabEnvironment
import actions.Webstorm.VerifyWebstormHome
import actions.WebstormCreation.CreateAppWebstorm
import actions.general.Login
import actions.general.Navigate
import actions.selenium.Browser
import actions.selenium.CloseWindow
import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C84 - Pipeline Creation - Create Pitch App
class TC_C84_CreatePitchApp extends TestBase{
    //private static def variables = [:]
    //private static def basestateDefault = [:]

    @BeforeSuite
    public void beforeState(){
        variables."URL" = /https:\/\/test.brightideatest.com/
        variables."Browser" = /Chrome/
        variables."TestRail_RunName" = null
        variables."TestRail_ExecutionName" = null
        variables."CodeEnvironment" = /Default/
        variables."Database" = null
    }
    @Test
    public void testcase(){
        //Basestate
        // Need to write a replacement for https://rwhq2.brightidea.cloud/index.html?action=58123c20fa4ee77809f468f6&project=Brightidea
        // This Basestate action Description:
        // General basestate: Copy Master Affiliate and login as bi.adminuser1@brightidea.com by default unless otherwise specified for 'Username Email' field
        Action58123c20fa4ee77809f468f6(basestateDefault)

        //Navigate
        new Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create App Webstorm
        new CreateAppWebstorm().run("App Name":/Pitch/.toString(),
                "Sponsor Name":/NonBI System Admin/.toString(),
                "Sponsor Add or Remove":/Add/.toString(),
                "Webstorm Title":/Pitch event title/.toString(),
                "Description":/Pitch event description/.toString(),
                "Moderators":/Moderator/.toString(),
                "Moderators Add or Remove":/Add/.toString(),
                "Action":/Create/.toString())
        //Verify Initiative Home
        //new VerifyWebstormHome().run("Webstorm Title":/Pitch event title/.toString(),
        //       "Webstorm Description":/Pitch event description/.toString())
        new VerifyWebstormHome().run(false, "Pitch event title", "Pitch event description")

    }
    //Basestate
    public static def Action58123c20fa4ee77809f468f6(def params){
        //Create Affiliate based on Master Affiliate
        variables."affiliateURL" = new CopyAffiliate().run(
                "Licensing Model":/${params."Licensing Model"}/.toString(),
                "Unlimited Brightidea Administrator License Type":/${params."Unlimited Brightidea Administrator License Type"}/.toString(),
                "Brightidea Administrator License Type Purchased Count":/${params."Brightidea Administrator License Type Purchased Count"}/.toString(),
                "Unlimited Idea Box Manager License Type":/${params."Unlimited Idea Box Manager License Type"}/.toString(),
                "Idea Box Manager License Type Purchased Count":/${params."Idea Box Manager License Type Purchased Count"}/.toString())
        println("Affiliate URL: ${variables."affiliateURL"}")
        //Open Browser
        /*
        new Browser().run(
                "Run Browser in Incognito":/${params."Run Browser in Incognito"}/.toString(),
                "URL":/${variables."affiliateURL"}/.toString(),
                "Browser Type":/${variables."Browser"}/.toString())
         */
        Browser.getInstance()
        new Browser().run(variables."affiliateURL")

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
