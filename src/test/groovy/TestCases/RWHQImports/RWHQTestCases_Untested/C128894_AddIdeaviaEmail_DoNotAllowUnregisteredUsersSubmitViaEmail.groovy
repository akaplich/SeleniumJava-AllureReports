import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C128894 - Add Idea via Email - Do Not Allow Unregistered Users Submit Via Email
class C128894_AddIdeaviaEmail_DoNotAllowUnregisteredUsersSubmitViaEmail
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
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for Beta tab
        new actions.SetupBeta.SetEnterpriseSetupforBetatab().run("Allow Unregistered Users Submit Via Email":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Pipeline Setup/.toString())
        //Set Pipeline Setup Communications Tab
        new actions.PipelineCommunications.SetPipelineCommunicationsTab().run("Select Tab":/Emails/.toString(),"Email":/New Idea Submitted/.toString(),"Email Recipient":/Idea Submitter/.toString(),"Email Subject":/C128894 Submission Confirmation/.toString(),"Action":/Save/.toString())
        //Set Pipeline Setup Communications Tab
        new actions.PipelineCommunications.SetPipelineCommunicationsTab().run("Select Tab":/Emails/.toString(),"Email":/New Idea Submitted/.toString(),"Email Recipient":/Idea Submitter/.toString(),"Email Subject":/C128894 Submission Confirmation/.toString(),"Action":/Save/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Mail Idea Submission
        variables."createdMailbox" = new actions.SetupMail.SetWebstormSetupMailIdeaSubmission().run("Affiliate URL":/${variables."affiliateURL"}/.toString(),"Mailbox":/testmail/.toString(),"Category":/Operations/.toString(),"Action":/Create Mailbox/.toString())
        //Send Email
        new actions.Email.SendEmail().run("To Email":/${variables."createdMailbox"}/.toString(),"Sender's Email":/annabrightidea1@yahoo.com/.toString(),"Sender's Password":/coothhthkgxqqztx/.toString(),"Email Subject":/Email Idea1/.toString(),"Email Body":/Description for Email Idea1/.toString(),"Sender Host":/smtp.mail.yahoo.com/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("Idea Name":/Email Idea1/.toString(),"Number of Matches":/0/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Add User in People page
        new actions.People.AddUserinPeoplepage().run("Email Address":/annabrightidea1@yahoo.com/.toString(),"First Name":/C128894/.toString(),"Last Name":/Test User/.toString(),"Screen Name":/Email Test User/.toString(),"Action":/Add User/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/15/.toString())
        //Return Affiliate Name
        variables."affName" = new actions.general.ReturnAffiliateName().run("Affiliate URL":/${variables."affiliateURL"}/.toString())
        //Get Registration Link From Non-Mailinator Email
        variables."link" = new actions.Email.GetRegistrationLinkFromNonMailinatorEmail().run("Sender Host":/imap.mail.yahoo.com/.toString(),"Sender's Email":/annabrightidea1@yahoo.com/.toString(),"Password":/coothhthkgxqqztx/.toString(),"Folder":/INBOX/.toString(),"Email Subject to Look For":/You've been invited to join ${variables."affName"}!/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        //Complete User Registration
        new actions.general.CompleteUserRegistration().run("Password":/brightidea1/.toString(),"Confirm Password":/brightidea1/.toString(),"First Name":/Gmail/.toString(),"Last Name":/User/.toString(),"Screen Name":/Gmail User/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/30/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("Idea Name":/Email Idea1/.toString(),"Number of Matches":/0/.toString())
        //Verify Email Not Mailinator
        new actions.Email.VerifyEmailNotMailinator().run("Sender Host":/imap.mail.yahoo.com/.toString(),"Sender's Email":/annabrightidea1@yahoo.com/.toString(),"Password":/coothhthkgxqqztx/.toString(),"Email Subject to Look For":/C128894 Submission Confirmation/.toString(),"Email Should Exist":false,"Folder":/INBOX/.toString())
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