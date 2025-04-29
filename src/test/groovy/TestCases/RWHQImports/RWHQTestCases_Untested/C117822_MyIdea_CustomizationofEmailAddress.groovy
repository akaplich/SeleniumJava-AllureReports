package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C117822 - My Idea - Customization of Email Address
class C117822_MyIdea_CustomizationofEmailAddress
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
        //Return Affiliate Name
        variables."affName" = new actions.general.ReturnAffiliateName().run("Affiliate URL":/${variables."affiliateURL"}/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Add User in People page
        new actions.People.AddUserinPeoplepage().run("Email Address":/annabrightidea1@yahoo.com/.toString(),"First Name":/Gmail/.toString(),"Last Name":/User/.toString(),"Screen Name":/Gmail User/.toString(),"Action":/Add User/.toString())
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
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("Mail Address":/test1/.toString())
        //Send Email
        new actions.Email.SendEmail().run("To Email":/${variables."email"}/.toString(),"Sender's Email":/annabrightidea1@yahoo.com/.toString(),"Sender's Password":/coothhthkgxqqztx/.toString(),"Email Subject":/Posted My Idea via Email1/.toString(),"Email Body":/This is the first my idea submitted through email/.toString(),"Sender Host":/smtp.mail.yahoo.com/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Return Email for My Ideas
        variables."email" = new actions.Enterprise.UserHomepage.SetEmailforMyIdeas().run([:])
        //Send Email
        new actions.Email.SendEmail().run("To Email":/${variables."email"}/.toString(),"Sender's Email":/annabrightidea1@yahoo.com/.toString(),"Sender's Password":/coothhthkgxqqztx/.toString(),"Email Subject":/Posted My Idea via Email2/.toString(),"Email Body":/This is the second my idea submitted through email/.toString(),"Sender Host":/smtp.mail.yahoo.com/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/annabrightidea1@yahoo.com/.toString(),"Password":/brightidea1/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/10/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Verify Idea in My Ideas List
        new actions.Enterprise.UserHomepage.VerifyIdeainMyIdeasList().run("Thumbnail":/Default/.toString(),"Title":/Posted My Idea via Email2/.toString(),"Row Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Access My Idea on View My Idea
        new actions.Enterprise.UserHomepage.AccessMyIdeaonViewMyIdea().run("Access View My Idea modal":/Posted My Idea via Email2/.toString())
        //Verify View My Idea in User Homepage
        new actions.Enterprise.UserHomepage.VerifyViewMyIdeainUserHomepage().run("Idea Title":/Posted My Idea via Email2/.toString(),"Idea Description":/This is the second my idea submitted through email/.toString())
        //Verify Idea in My Ideas List
        new actions.Enterprise.UserHomepage.VerifyIdeainMyIdeasList().run("Thumbnail":/Default/.toString(),"Title":/Posted My Idea via Email1/.toString(),"Number of Matches":/0/.toString())
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