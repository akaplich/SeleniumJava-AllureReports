import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132210 - Update Assignee - Single Scale - Add new evaluator with resend toggle on
class C132210_UpdateAssignee_SingleScale_Addnewevaluatorwithresendtoggleon
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
        //Delete this after  Resend Action Items Part 1 toggle is Enabled
        Action64fbb434c9d98c8414b3179d([:])
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Single Scale Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureSingleScaleStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Single Scale/.toString(),"Individual Assignment User":/End User,Evaluator,analyst/.toString(),"Individual Assignment User Add or Remove":/Add,Add,Add/.toString(),"Resend action items when submissions return to Step":true,"Action":/Update/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/singlescale idea/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/singlescale idea/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Single Scale/.toString(),"Action":/Change Step/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/singlescale idea/.toString())
        //Set Single Scale for Idea in Action Items page
        new actions.ActionItems.SetSingleScaleforIdeainActionItemspage().run("What is your initial impression of this idea":/7/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/singlescale idea/.toString())
        //Verify Assignee In Update Assignee Modal
        new actions.PipelineStepsView.VerifyAssigneeInUpdateAssigneeModal().run("Open Modal":true,"Assignee under Completed or Incomplete Action Items":/Assignees with complete action items/.toString(),"Assignee":/Evaluator/.toString(),"Number of Matches":/1/.toString())
        //Verify Assignee In Update Assignee Modal
        new actions.PipelineStepsView.VerifyAssigneeInUpdateAssigneeModal().run("Open Modal":false,"Assignee under Completed or Incomplete Action Items":/Assignees with incomplete action items/.toString(),"Assignee":/analyst/.toString(),"Number of Matches":/1/.toString())
        //Verify Assignee In Update Assignee Modal
        new actions.PipelineStepsView.VerifyAssigneeInUpdateAssigneeModal().run("Open Modal":false,"Assignee under Completed or Incomplete Action Items":/Assignees with incomplete action items/.toString(),"Assignee":/End User/.toString(),"Number of Matches":/1/.toString())
        //Set Update Assignee Modal
        new actions.PipelineStepsView.SetUpdateAssigneeModal().run("Open Modal":false,"Additional Assignee":/Moderator/.toString(),"Additional Assignee Add or Remove":/Add/.toString(),"Action":/Update Assignments/.toString())
        //Verify Assignee In Update Assignee Modal
        new actions.PipelineStepsView.VerifyAssigneeInUpdateAssigneeModal().run("Open Modal":true,"Assignee under Completed or Incomplete Action Items":/Assignees with complete action items/.toString(),"Assignee":/Evaluator/.toString(),"Number of Matches":/1/.toString())
        //Verify Assignee In Update Assignee Modal
        new actions.PipelineStepsView.VerifyAssigneeInUpdateAssigneeModal().run("Open Modal":false,"Assignee under Completed or Incomplete Action Items":/Assignees with incomplete action items/.toString(),"Assignee":/analyst/.toString(),"Number of Matches":/1/.toString())
        //Verify Assignee In Update Assignee Modal
        new actions.PipelineStepsView.VerifyAssigneeInUpdateAssigneeModal().run("Open Modal":false,"Assignee under Completed or Incomplete Action Items":/Assignees with incomplete action items/.toString(),"Assignee":/End User/.toString(),"Number of Matches":/1/.toString())
        //Verify Assignee In Update Assignee Modal
        new actions.PipelineStepsView.VerifyAssigneeInUpdateAssigneeModal().run("Open Modal":false,"Assignee under Completed or Incomplete Action Items":/Assignees with incomplete action items/.toString(),"Assignee":/Moderator/.toString(),"Number of Matches":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline List/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Action Items Manager/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/singlescale idea/.toString(),"Assignee":/End User/.toString(),"Step":/Single Scale/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/singlescale idea/.toString(),"Assignee":/Moderator/.toString(),"Step":/Single Scale/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/singlescale idea/.toString(),"Assignee":/analyst/.toString(),"Step":/Single Scale/.toString(),"Number of Matches":/1/.toString())
        //Verify Completed table for Action Items page
        new actions.ActionItems.VerifyCompletedtableforActionItemspage().run("Title":/singlescale idea/.toString(),"Assignee":/Evaluator/.toString(),"Number of Matches":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Verify Action Items in Progress in Manage Step Page
        new actions.PipelineManageSteps.VerifyActionItemsinProgressinManageStep().run("Step Name to Manage (optional)":/Single Scale/.toString(),"Count to verify":/1\/4/.toString(),"Row Number":/1/.toString(),"Evaluator":/End User/.toString(),"Number of assigned items":/1/.toString(),"Number of remaining items":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Action Items in Progress in Manage Step Page
        new actions.PipelineManageSteps.VerifyActionItemsinProgressinManageStep().run("Row Number":/2/.toString(),"Evaluator":/Evaluator/.toString(),"Number of assigned items":/1/.toString(),"Number of remaining items":/0/.toString(),"Percent Complete Bar - Completed":/100%/.toString(),"Number of Matches":/1/.toString())
        //Verify Action Items in Progress in Manage Step Page
        new actions.PipelineManageSteps.VerifyActionItemsinProgressinManageStep().run("Row Number":/3/.toString(),"Evaluator":/Moderator/.toString(),"Number of assigned items":/1/.toString(),"Number of remaining items":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Action Items in Progress in Manage Step Page
        new actions.PipelineManageSteps.VerifyActionItemsinProgressinManageStep().run("Row Number":/4/.toString(),"Evaluator":/analyst/.toString(),"Number of assigned items":/1/.toString(),"Number of remaining items":/1/.toString(),"Number of Matches":/1/.toString())
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
    //Delete this after  Resend Action Items Part 1 toggle is Enabled
    public static def Action64fbb434c9d98c8414b3179d(def params){
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for Beta tab
        new actions.SetupBeta.SetEnterpriseSetupforBetatab().run("Resend Action Items - Single Scale, Scorecard, and Development Steps":true)

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