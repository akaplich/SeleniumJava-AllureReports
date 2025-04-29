package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C39859 - Add Comment Via Email
class C39859_AddCommentViaEmail
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
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Mail Idea Submission
        variables."createdMailbox" = new actions.SetupMail.SetWebstormSetupMailIdeaSubmission().run("Affiliate URL":/${variables."affiliateURL"}/.toString(),"Mailbox":/testmail/.toString(),"Category":/Operations/.toString(),"Action":/Create Mailbox/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Mail Idea Comments
        new actions.SetupMail.SetWebstormSetupMailIdeaComments().run("Enable idea email reply":true,"Action":/Save Changes/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Add User in People page
        new actions.People.AddUserinPeoplepage().run("Email Address":/annabrightidea1@yahoo.com/.toString(),"First Name":/Email/.toString(),"Last Name":/Test User/.toString(),"Screen Name":/Email Test User/.toString(),"Action":/Add User/.toString())
        //Send Email
        new actions.Email.SendEmail().run("To Email":/${variables."createdMailbox"}/.toString(),"Sender's Email":/annabrightidea1@yahoo.com/.toString(),"Sender's Password":/coothhthkgxqqztx/.toString(),"Email Subject":/Email Idea1/.toString(),"Email Body":/Description for Email Idea1/.toString(),"Sender Host":/smtp.mail.yahoo.com/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/30/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Email Idea1/.toString())
        //Add Comment in View Idea page
        new actions.ViewIdeaComment.AddCommentinViewIdeapage().run("Comment":/comment for email idea1/.toString())
        //Reply To And Remove Email
        new actions.Email.ReplyToAndRemoveEmail().run("Sender Host":/imap.mail.yahoo.com/.toString(),"Sender's Email":/annabrightidea1@yahoo.com/.toString(),"Password":/coothhthkgxqqztx/.toString(),"Folder":/INBOX/.toString(),"Affiliate URL":/${variables."affiliateURL"}/.toString(),"Email Subject to Look For":/Custom App: A comment has been made on your Idea!/.toString(),"Email Body":/Respond to test comment/.toString(),"Remove Email":true)
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Email Idea1/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Verify Comment in View Idea page
        new actions.ViewIdeaComment.VerifyCommentinViewIdeapage().run("Comment Section":/Reply/.toString(),"Type of Comment":/General Access/.toString(),"Comment":/Respond to test comment/.toString(),"User":/Email Test User/.toString(),"Number of Matches":/1/.toString())
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