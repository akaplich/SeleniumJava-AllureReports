import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C132329 - Resend Action Items - With Update Assignees in Single Scale Open and Completed AI
class C132329_ResendActionItems_WithUpdateAssigneesinSingleScaleOpenandCompletedAI
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
        new actions.PipelineStepsConfigure.ConfigureSingleScaleStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Single Scale/.toString(),"Individual Assignment User":/System Admin,Moderator/.toString(),"Individual Assignment User Add or Remove":/Add,Add/.toString(),"Resend action items when submissions return to Step":true,"Action":/Update/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/Quick add for single scale resend/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Quick add for single scale resend/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Single Scale/.toString(),"Action":/Change Step/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Quick add for single scale resend/.toString())
        //Verify Assignee In Update Assignee Modal
        new actions.PipelineStepsView.VerifyAssigneeInUpdateAssigneeModal().run("Open Modal":true,"Assignee under Completed or Incomplete Action Items":/Assignees with incomplete action items/.toString(),"Assignee":/Moderator/.toString(),"Number of Matches":/1/.toString())
        //Verify Assignee In Update Assignee Modal
        new actions.PipelineStepsView.VerifyAssigneeInUpdateAssigneeModal().run("Open Modal":false,"Assignee under Completed or Incomplete Action Items":/Assignees with incomplete action items/.toString(),"Assignee":/System Admin/.toString(),"Number of Matches":/1/.toString())
        //Set Update Assignee Modal
        new actions.PipelineStepsView.SetUpdateAssigneeModal().run("Open Modal":false,"Additional Assignee":/analyst,Evaluator/.toString(),"Additional Assignee Add or Remove":/Add,Add/.toString(),"Action":/Update Assignments/.toString())
        //Verify Assignee In Update Assignee Modal
        new actions.PipelineStepsView.VerifyAssigneeInUpdateAssigneeModal().run("Open Modal":true,"Assignee under Completed or Incomplete Action Items":/Assignees with incomplete action items/.toString(),"Assignee":/Evaluator/.toString(),"Number of Matches":/1/.toString())
        //Verify Assignee In Update Assignee Modal
        new actions.PipelineStepsView.VerifyAssigneeInUpdateAssigneeModal().run("Open Modal":false,"Assignee under Completed or Incomplete Action Items":/Assignees with incomplete action items/.toString(),"Assignee":/analyst/.toString(),"Number of Matches":/1/.toString())
        //Verify Assignee In Update Assignee Modal
        new actions.PipelineStepsView.VerifyAssigneeInUpdateAssigneeModal().run("Open Modal":false,"Assignee under Completed or Incomplete Action Items":/Assignees with incomplete action items/.toString(),"Assignee":/Moderator/.toString(),"Number of Matches":/1/.toString())
        //Verify Assignee In Update Assignee Modal
        new actions.PipelineStepsView.VerifyAssigneeInUpdateAssigneeModal().run("Open Modal":false,"Assignee under Completed or Incomplete Action Items":/Assignees with incomplete action items/.toString(),"Assignee":/System Admin/.toString(),"Number of Matches":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/Quick add for single scale resend/.toString())
        //Set Single Scale for Idea in Action Items page
        new actions.ActionItems.SetSingleScaleforIdeainActionItemspage().run("What is your initial impression of this idea":/7/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/Quick add for single scale resend/.toString())
        //Set Single Scale for Idea in Action Items page
        new actions.ActionItems.SetSingleScaleforIdeainActionItemspage().run("What is your initial impression of this idea":/4/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Quick add for single scale resend/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Scorecarding/.toString(),"Action":/Change Step/.toString())
        //Drag and Drop Ideas in Pipeline Steps
        new actions.PipelineStepsView.DragandDropIdeasinPipelineSteps().run("Idea Title":/Quick add for single scale resend/.toString(),"Step":/Single Scale/.toString())
        //Set Resend Action Items Modal
        new actions.PipelineStepsConfigure.SetResendActionItemsModal().run("Action":/Continue/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Quick add for single scale resend/.toString())
        //Verify Assignee In Update Assignee Modal
        new actions.PipelineStepsView.VerifyAssigneeInUpdateAssigneeModal().run("Open Modal":true,"Assignee under Completed or Incomplete Action Items":/Assignees with incomplete action items/.toString(),"Assignee":/Moderator/.toString(),"Number of Matches":/1/.toString())
        //Verify Assignee In Update Assignee Modal
        new actions.PipelineStepsView.VerifyAssigneeInUpdateAssigneeModal().run("Open Modal":false,"Assignee under Completed or Incomplete Action Items":/Assignees with incomplete action items/.toString(),"Assignee":/analyst/.toString(),"Number of Matches":/1/.toString())
        //Verify Assignee In Update Assignee Modal
        new actions.PipelineStepsView.VerifyAssigneeInUpdateAssigneeModal().run("Open Modal":false,"Assignee under Completed or Incomplete Action Items":/Assignees with incomplete action items/.toString(),"Assignee":/System Admin/.toString(),"Number of Matches":/1/.toString())
        //Verify Assignee In Update Assignee Modal
        new actions.PipelineStepsView.VerifyAssigneeInUpdateAssigneeModal().run("Open Modal":false,"Assignee under Completed or Incomplete Action Items":/Assignees with complete action items/.toString(),"Assignee":/Evaluator/.toString(),"Number of Matches":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/Quick add for single scale resend/.toString())
        //Set Single Scale for Idea in Action Items page
        new actions.ActionItems.SetSingleScaleforIdeainActionItemspage().run("What is your initial impression of this idea":/5/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/moderator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/Quick add for single scale resend/.toString())
        //Set Single Scale for Idea in Action Items page
        new actions.ActionItems.SetSingleScaleforIdeainActionItemspage().run("What is your initial impression of this idea":/6/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Verify Action Items in Progress in Manage Step Page
        new actions.PipelineManageSteps.VerifyActionItemsinProgressinManageStep().run("Step Name to Manage (optional)":/Single Scale/.toString(),"Count to verify":/3\/4/.toString(),"Evaluator":/System Admin/.toString(),"Number of assigned items":/1/.toString(),"Number of remaining items":/0/.toString(),"Percent Complete Bar - Completed":/100%/.toString(),"Number of Matches":/1/.toString())
        //Verify Action Items in Progress in Manage Step Page
        new actions.PipelineManageSteps.VerifyActionItemsinProgressinManageStep().run("Count to verify":/3\/4/.toString(),"Evaluator":/Moderator/.toString(),"Number of assigned items":/1/.toString(),"Number of remaining items":/0/.toString(),"Percent Complete Bar - Completed":/100%/.toString(),"Number of Matches":/1/.toString())
        //Verify Action Items in Progress in Manage Step Page
        new actions.PipelineManageSteps.VerifyActionItemsinProgressinManageStep().run("Count to verify":/3\/4/.toString(),"Evaluator":/Evaluator/.toString(),"Number of assigned items":/1/.toString(),"Number of remaining items":/0/.toString(),"Percent Complete Bar - Completed":/100%/.toString(),"Number of Matches":/1/.toString())
        //Verify Action Items in Progress in Manage Step Page
        new actions.PipelineManageSteps.VerifyActionItemsinProgressinManageStep().run("Count to verify":/3\/4/.toString(),"Evaluator":/analyst/.toString(),"Number of assigned items":/1/.toString(),"Number of remaining items":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Currently in Step table for Manage Judging
        new actions.PipelineManageSteps.VerifyCurrentlyinSteptableforManageJudging().run("Overall Score":/5.00/.toString(),"Idea Name":/Quick add for single scale resend/.toString(),"Number of Matches":/1/.toString())
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