package TestCases.RWHQImports

import BaseClasses.TestBase
import actions.API.Utils.CopyAffiliate
import actions.API.Utils.DeleteAffiliate
import actions.Utils.SettoLabEnvironment
import actions.Webstorm.VerifyWebstormHome
import actions.WebstormCreation.CreateAppWebstorm
import actions.general.Login
import actions.general.Navigate
import actions.general.Wait
import actions.selenium.Browser
import actions.selenium.CloseWindow
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

//C84 - Pipeline Creation - Create Pitch App
class TC_C84_CreatePitchApp extends TestBase{
    private static final Logger logger = LoggerFactory.getLogger(TC_C84_CreatePitchApp.class);
    private static def params = [:]

    @BeforeAll
    public static void beforeState(){
        params."Username Email" = "bi.adminuser1@brightidea.com"
        params."Run Browser in Incognito" = null
        params."affiliateURL" = null
    }

    @Test
    public void testcase(){
        //Basestate
        // Need to write a replacement for https://rwhq2.brightidea.cloud/index.html?action=58123c20fa4ee77809f468f6&project=Brightidea
        // This Basestate action Description:
        // General basestate: Copy Master Affiliate and login as bi.adminuser1@brightidea.com by default unless otherwise specified for 'Username Email' field
        Action58123c20fa4ee77809f468f6(params)

        //Navigate
        new Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create App Webstorm
        // This action is currently broken
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
        /*
        String affiliateURL = new CopyAffiliate().run(
                "Licensing Model":/${params."Licensing Model"}/.toString(),
                "Unlimited Brightidea Administrator License Type":/${params."Unlimited Brightidea Administrator License Type"}/.toString(),
                "Brightidea Administrator License Type Purchased Count":/${params."Brightidea Administrator License Type Purchased Count"}/.toString(),
                "Unlimited Idea Box Manager License Type":/${params."Unlimited Idea Box Manager License Type"}/.toString(),
                "Idea Box Manager License Type Purchased Count":/${params."Idea Box Manager License Type Purchased Count"}/.toString())
        */
        // This sets all params to their default value which is null
        params."affiliateURL" = new CopyAffiliate().run()
        //Open Browser
        new Browser().run(
                "Run Browser in Incognito":/${params."Run Browser in Incognito"}/.toString(),
                "URL":/${params."affiliateURL"}/.toString(),
                "Browser Type":/${params."Browser"}/.toString())



        //Login
        new Login().run("Email":/${params."Username Email"}/.toString(),
                "Password":/brightidea1/.toString())
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
    @AfterEach
    public void afterState(){
        //Afterstate
        Action581259c8fa4ee77809f46905([:])
    }
}
