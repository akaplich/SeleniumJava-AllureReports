import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C130627 - Merge Ideas - Your Idea Was Merged Email Notification - ON
class C130627_MergeIdeas_YourIdeaWasMergedEmailNotification_ON
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
        //Delete this action after Merge Ideas Enabled
        Action6046b11b0aed291c14abae76([:])
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Pipeline Setup/.toString())
        //Set Pipeline Setup Communications Tab
        new actions.PipelineCommunications.SetPipelineCommunicationsTab().run("Select Tab":/Emails/.toString(),"Email":/Idea Merged/.toString(),"Email Recipient":/Idea Submitter/.toString(),"Email Subject":/[WEBSTORM_NAME]: [SUBMISSION_NAME] was merged/.toString(),"Action":/Save/.toString())
        //Set Pipeline Setup Communications Tab
        new actions.PipelineCommunications.SetPipelineCommunicationsTab().run("Select Tab":/Emails/.toString(),"Email":/New Idea Submitted/.toString(),"Email Recipient":/Idea Submitter/.toString(),"Email Subject":/test/.toString(),"Enable this email alert":false,"Action":/Save/.toString())
        //Set Pipeline Setup Communications Tab
        new actions.PipelineCommunications.SetPipelineCommunicationsTab().run("Select Tab":/Emails/.toString(),"Email":/Idea Status Changed/.toString(),"Email Recipient":/Idea Submitter/.toString(),"Email Subject":/test/.toString(),"Enable this email alert":false,"Action":/Save/.toString())
        //Set Pipeline Setup Communications Tab
        new actions.PipelineCommunications.SetPipelineCommunicationsTab().run("Select Tab":/Emails/.toString(),"Email":/Tag(s) Added to an Idea/.toString(),"Email Recipient":/Idea Submitter/.toString(),"Email Subject":/test/.toString(),"Enable this email alert":false,"Action":/Save/.toString())
        //Create Mailinator User
        new actions.Mailinator.CreateMailinatorUser().run("Email":/brightC130627_2team/.toString(),"Finally Login as What User":/bi.adminuser1@brightidea.com/.toString())
        //Create Mailinator User
        new actions.Mailinator.CreateMailinatorUser().run("Email":/brightC130627_2/.toString(),"Finally Login as What User":/brightC130627_2@mailinator.com/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/1child/.toString(),"Submitter":/Team/.toString(),"Submitter Team User":/Auto/.toString(),"Submitter Team User Add or Remove":/Add/.toString(),"Description":/desc/.toString(),"Category":/New Product/.toString(),"Required Short Question":/test/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/2child/.toString(),"Submitter":/Team/.toString(),"Submitter Team User":/Auto/.toString(),"Submitter Team User Add or Remove":/Add/.toString(),"Description":/desc/.toString(),"Category":/New Product/.toString(),"Required Short Question":/test/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/3child/.toString(),"Submitter":/Team/.toString(),"Submitter Team User":/Auto/.toString(),"Submitter Team User Add or Remove":/Add/.toString(),"Description":/desc/.toString(),"Category":/New Product/.toString(),"Required Short Question":/test/.toString(),"Action":/Submit Idea/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline List/.toString())
        //Select Ideas in Pipeline List View
        new actions.PipelineList.SelectIdeasPipelineListView().run("Idea Title(s)":/1child,test idea1/.toString())
        //Set Merge Ideas in Pipeline Steps & List
        new actions.PipelineStepsView.SetMergeIdeasInPipelineStepsList().run("Verify Order of Ideas:":[],"Select Parent":/test idea1/.toString(),"Action":/Merge Ideas/.toString())
        //Verify Email
        new actions.Mailinator.VerifyEmail().run("Email Address":/brightC130627_2/.toString(),"Subject":/Custom App: Idea was merged/.toString(),"From":/noreply@brightidea.com/.toString(),"Full From":/noreply@brightidea.com <noreply@brightidea.com>/.toString())
        //Verify Email
        new actions.Mailinator.VerifyEmail().run("Email Address":/brightC130627_2team/.toString(),"Subject":/Custom App: Idea was merged/.toString(),"From":/noreply@brightidea.com/.toString(),"Full From":/noreply@brightidea.com <noreply@brightidea.com>/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline List/.toString())
        //Select Ideas in Pipeline List View
        new actions.PipelineList.SelectIdeasPipelineListView().run("Idea Title(s)":/2child,test idea2/.toString())
        //Set Merge Ideas in Pipeline Steps & List
        new actions.PipelineStepsView.SetMergeIdeasInPipelineStepsList().run("Verify Order of Ideas:":[],"Select Parent":/test idea2/.toString(),"Action":/Merge Ideas/.toString())
        //Verify Email
        new actions.Mailinator.VerifyEmail().run("Email Address":/brightC130627_2/.toString(),"Subject":/Custom App: Idea was merged/.toString(),"From":/noreply@brightidea.com/.toString(),"Full From":/noreply@brightidea.com <noreply@brightidea.com>/.toString())
        //Verify Email
        new actions.Mailinator.VerifyEmail().run("Email Address":/brightC130627_2team/.toString(),"Subject":/Custom App: Idea was merged/.toString(),"From":/noreply@brightidea.com/.toString(),"Full From":/noreply@brightidea.com <noreply@brightidea.com>/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea2/.toString())
        //Set Merge Ideas on View Idea
        new actions.ViewIdea.SetMergeIdeasOnViewIdeaPage().run("Submission Title":/3child/.toString(),"Add or Remove":/Add/.toString(),"Action":/Save Changes/.toString())
        //Verify Email
        new actions.Mailinator.VerifyEmail().run("Email Address":/brightC130627_2/.toString(),"Subject":/Custom App: Idea was merged/.toString(),"From":/noreply@brightidea.com/.toString(),"Full From":/noreply@brightidea.com <noreply@brightidea.com>/.toString())
        //Verify Email
        new actions.Mailinator.VerifyEmail().run("Email Address":/brightC130627_2team/.toString(),"Subject":/Custom App: Idea was merged/.toString(),"From":/noreply@brightidea.com/.toString(),"Full From":/noreply@brightidea.com <noreply@brightidea.com>/.toString())
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
    //Delete this action after Merge Ideas Enabled
    public static def Action6046b11b0aed291c14abae76(def params){
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for Beta tab
        new actions.SetupBeta.SetEnterpriseSetupforBetatab().run("Parent-child Merge Ideas":true)

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