package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C65603 - Add Idea via Email - Add Tag
class C65603_AddIdeaviaEmail_AddTag
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
        variables."affiliateURL" = Action58123c20fa4ee77809f468f6([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Add User in People page
        new actions.People.AddUserinPeoplepage().run("Email Address":/annabrightidea1@yahoo.com/.toString(),"First Name":/Gmail/.toString(),"Last Name":/User/.toString(),"Screen Name":/Gmail User/.toString(),"Action":/Add User/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Mail Idea Submission
        variables."createdMailbox" = new actions.SetupMail.SetWebstormSetupMailIdeaSubmission().run("Affiliate URL":/${variables."affiliateURL"}/.toString(),"Mailbox":/testmail/.toString(),"Category":/Operations/.toString(),"Action":/Create Mailbox/.toString())
        //Send Email
        new actions.Email.SendEmail().run("To Email":/${variables."createdMailbox"}/.toString(),"Sender's Email":/annabrightidea1@yahoo.com/.toString(),"Sender's Password":/coothhthkgxqqztx/.toString(),"Email Subject":/Posted Idea via Email Title/.toString(),"Email Body":/Posted Idea via Email Description #innovationtag/.toString(),"Sender Host":/smtp.mail.yahoo.com/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/60/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Posted Idea via Email Title/.toString(),"Status":/Submitted/.toString(),"Username":/Gmail User/.toString(),"Description":/Posted Idea via Email Description/.toString(),"Instance":/1/.toString())
        //Verify Idea in View Idea page
        new actions.ViewIdea.VerifyIdeainViewIdeapage().run("Idea Name":/Posted Idea via Email Title/.toString(),"Category":/Operations/.toString(),"Status":/Submitted/.toString(),"Tag":/innovationtag/.toString(),"Tag Should Exist":/TRUE/.toString(),"Linked Submissions":[])
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