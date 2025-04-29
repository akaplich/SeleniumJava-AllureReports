import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C129990 - Move Ideas - Notify Submitters ON - Idea Moved Email - One Notification per Idea
class C129990_MoveIdeas_NotifySubmittersON_IdeaMovedEmail_OneNotificationperIdea
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
        //Disable Apps V3
        Action67d84bbf3e876c6a0e91b2a2([:])
        //Create Mailinator User
        new actions.Mailinator.CreateMailinatorUser().run("Email":/brightC129990/.toString(),"First Name":/Email/.toString(),"Last Name":/Test User/.toString(),"Screen Name":/Email Test User/.toString(),"Finally Login as What User":/bi.adminuser1@brightidea.com/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Pipeline A/.toString(),"Description":/desc/.toString(),"Action":/Create/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Pipeline Setup/.toString())
        //Set Pipeline Setup Communications Tab
        new actions.PipelineCommunications.SetPipelineCommunicationsTab().run("Select Tab":/Emails/.toString(),"Email":/New Idea Submitted/.toString(),"Email Recipient":/Idea Submitter/.toString(),"Email Subject":/C129990 Submission Confirmation/.toString(),"Enable this email alert":false,"Action":/Save/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/brightc129990@mailinator.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pipeline A/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/test idea3/.toString(),"Description":/desc/.toString(),"Category":/New Product/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pipeline A/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/test idea4/.toString(),"Description":/desc/.toString(),"Category":/New Product/.toString(),"Action":/Submit Idea/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pipeline A/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Select Multiple Ideas in Pipeline Steps
        new actions.PipelineStepsView.SelectMultipleIdeasinPipelineSteps().run("Idea Names":["test idea3","test idea4"])
        //Set New Move Ideas in Pipeline Steps page
        new actions.PipelineStepsView.NewMoveIdeasinPipelineStepspage().run("Move To Pipeline":/Custom App/.toString(),"Category":/New Product/.toString(),"Status":/Submitted/.toString(),"Notify submitter(s)":true,"Action":/Move Idea/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/30/.toString())
        //Verify Email
        new actions.Mailinator.VerifyEmail().run("Email Address":/brightc129990/.toString(),"Subject":/Pipeline A: Idea was moved/.toString(),"Email Should Be Received":true)
        //Verify Email
        new actions.Mailinator.VerifyEmail().run("Email Address":/brightc129990/.toString(),"Subject":/Pipeline A: Idea was moved/.toString(),"Email Should Be Received":true)
        //Verify Email
        new actions.Mailinator.VerifyEmail().run("Email Address":/brightc129990/.toString(),"Subject":/Pipeline A: Idea was moved/.toString(),"Email Should Be Received":false)
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
    //Disable Apps V3
    public static def Action67d84bbf3e876c6a0e91b2a2(def params){
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for BIOnly Beta tab
        new actions.SetupBI.SetEnterpriseSetupforBIOnlyBetatab().run("Activate Apps V3":false,"Apps v3 Pre-launch Enhancements":false)

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