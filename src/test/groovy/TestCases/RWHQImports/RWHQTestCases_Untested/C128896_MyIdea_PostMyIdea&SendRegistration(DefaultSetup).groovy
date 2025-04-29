import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C128896 - My Idea - Post My Idea & Send Registration (Default Setup)
class C128896_MyIdea_PostMyIdeaAndSendRegistration(DefaultSetup)
{
    private static def variables = [:]

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
        Action58123c20fa4ee77809f468f6([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString(),"My Ideas":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("My Ideas Email Capture":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Return Email for My Ideas
        variables."email" = new actions.Enterprise.UserHomepage.SetEmailforMyIdeas().run([:])
        //Send Email
        new actions.Email.SendEmail().run("To Email":/${variables."email"}/.toString(),"Sender's Email":/annabrightidea1@yahoo.com/.toString(),"Sender's Password":/coothhthkgxqqztx/.toString(),"Email Subject":/My Email Idea1/.toString(),"Email Body":/Description for My Email Idea1/.toString(),"Sender Host":/smtp.mail.yahoo.com/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/150/.toString())
        //Return Affiliate Name
        variables."affName" = new actions.general.ReturnAffiliateName().run("Affiliate URL":/${variables."affiliateURL"}/.toString())
        //Get Registration Link From Non-Mailinator Email
        variables."link" = new actions.Email.GetRegistrationLinkFromNonMailinatorEmail().run("Sender Host":/imap.mail.yahoo.com/.toString(),"Sender's Email":/annabrightidea1@yahoo.com/.toString(),"Password":/coothhthkgxqqztx/.toString(),"Folder":/INBOX/.toString(),"Email Subject to Look For":/You've been invited to join ${variables."affName"}!/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        //Complete User Registration
        new actions.general.CompleteUserRegistration().run("Password":/brightidea1/.toString(),"Confirm Password":/brightidea1/.toString(),"First Name":/Gmail/.toString(),"Last Name":/User/.toString(),"Screen Name":/Gmail User/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Verify Idea in My Ideas List
        new actions.Enterprise.UserHomepage.VerifyIdeainMyIdeasList().run("Thumbnail":/Default/.toString(),"Title":/My Email Idea1/.toString(),"Row Number":/1/.toString(),"Number of Matches":/1/.toString())
    }
    //Basestate
    public static def Action58123c20fa4ee77809f468f6(def params){
        //Create Affiliate based on Master Affiliate
        variables."affiliateURL" = new actions.API.Utils.CopyAffiliate().run("Licensing Model":/${params."Licensing Model"}/.toString(),"Unlimited Brightidea Administrator License Type":/${params."Unlimited Brightidea Administrator License Type"}/.toString(),"Brightidea Administrator License Type Purchased Count":/${params."Brightidea Administrator License Type Purchased Count"}/.toString(),"Unlimited Idea Box Manager License Type":/${params."Unlimited Idea Box Manager License Type"}/.toString(),"Idea Box Manager License Type Purchased Count":/${params."Idea Box Manager License Type Purchased Count"}/.toString())
        //Open Browser
        new actions.selenium.Browser().run("Run Browser in Incognito":/${params."Run Browser in Incognito"}/.toString(),"URL":/${variables."affiliateURL"}/.toString(),"Browser Type":/${variables."Browser"}/.toString())
        //Login
        new actions.general.Login().run("Email":/${params."Username Email"}/.toString(),"Password":/brightidea1/.toString())
        //Set to Lab Environment
        new actions.Utils.SettoLabEnvironment().run("Email":/${params."Username Email"}/.toString())

    }
    //Afterstate
    public static def Action581259c8fa4ee77809f46905(def params){
        try{
            //Close Current Window
            new actions.selenium.CloseWindow().run([:])
        }
       catch(all){}catch(Error err){}
        //Delete Affiliate
        new actions.API.Utils.DeleteAffiliate().run([:])

    }
    @AfterMethod
    public void afterState(){
        //Afterstate
        Action581259c8fa4ee77809f46905([:])
    }
}