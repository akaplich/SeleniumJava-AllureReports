package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C63239 - NGA View Idea - Engage with Other Users
class C63239_NGAViewIdea_EngagewithOtherUsers
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
        //Set Enterprise Setup Ideas for Ideas tab
        new actions.SetupIdeas.SetEnterpriseSetupIdeasIdeaSettingsTab().run("Unified Commenting Experience":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Access Pipeline Manage Steps for a Step
        new actions.PipelineStepsView.AccessPipelineManageStepsforaStep().run("Step Name":/Review/.toString())
        //Access Idea in Pipeline Manage Currently in Step Page
        new actions.PipelineManageSteps.AccessIdeainPipelineManageCurrentlyinStepPage().run("Idea name":/test idea1/.toString())
        //Set User Flyover in NGA View Idea
        new actions.NGAViewIdea.SetUserFlyoverNGAViewIdea().run("Comment Poster Username":/End User/.toString(),"Action":/Message/.toString())
        //Set Message in NGA View Idea Message Popup
        new actions.NGAViewIdea.SetMessageNGAViewIdeaMessagePopup().run("Subject":/Test Subject/.toString(),"Message Body":/Test Body/.toString(),"Action":/Send/.toString())
        //Set User Flyover in NGA View Idea
        new actions.NGAViewIdea.SetUserFlyoverNGAViewIdea().run("Comment Poster Username":/End User/.toString(),"Action":/Follow/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/My Activity/.toString())
        //Verify People I am Following in my Activity page
        new actions.MyActivity.VerifyPeopleIamFollowinginmyActivitypage().run("People":/End User/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Access Pipeline Manage Steps for a Step
        new actions.PipelineStepsView.AccessPipelineManageStepsforaStep().run("Step Name":/Review/.toString())
        //Access Idea in Pipeline Manage Currently in Step Page
        new actions.PipelineManageSteps.AccessIdeainPipelineManageCurrentlyinStepPage().run("Idea name":/test idea1/.toString())
        //Set User Flyover in NGA View Idea
        new actions.NGAViewIdea.SetUserFlyoverNGAViewIdea().run("Comment Poster Username":/End User/.toString(),"Action":/Profile/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Window Name":/Profile/.toString())
        //Verify and Access Submissions in My Activity page
        new actions.MyActivity.VerifySubmissionsinMyActivitypage().run("Value Type to Verify":/COMMENT ON IDEAS/.toString(),"Idea Name":/test idea1/.toString(),"Number of Matches":/1/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/My Activity/.toString())
        //Access tabs for Messages in My Activity Page
        new actions.MyActivity.AccesstabsforMessagesinMyActivityPage().run("Select Tab":/Unread/.toString())
        //Verify Message in My Activity Page
        new actions.MyActivity.VerifyMessageinMyActivityPage().run("Recipient or Sender":/System Admin/.toString(),"Subject":/Test Subject/.toString(),"Message body":/Test Body/.toString())
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