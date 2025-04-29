import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132105 - Update Assignee - Single Scale - from List and Manage step
class C132105_UpdateAssignee_SingleScale_fromListandManagestep
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
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Single Scale Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureSingleScaleStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Single Scale/.toString(),"Individual Assignment User":/End User,Evaluator,analyst/.toString(),"Individual Assignment User Add or Remove":/Add,Add,Add/.toString(),"Action":/Update/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/singlescale idea/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/singlescale idea/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Single Scale/.toString(),"Action":/Change Step/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Single Scale/.toString(),"Action":/Change Step/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline List/.toString())
        //Select Ideas in Pipeline List View
        new actions.PipelineList.SelectIdeasPipelineListView().run("Idea Title(s)":/singlescale idea/.toString())
        //Set Update Assignee Modal
        new actions.PipelineStepsView.SetUpdateAssigneeModal().run("Open Modal":true,"Additional Assignee":/End User 2,Moderator/.toString(),"Additional Assignee Add or Remove":/Add,Add/.toString(),"Action":/Update Assignments/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/moderator@test.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/singlescale idea/.toString())
        //Set Single Scale for Idea in Action Items page
        new actions.ActionItems.SetSingleScaleforIdeainActionItemspage().run("What is your initial impression of this idea":/7/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline List/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Action Items Manager/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/singlescale idea/.toString(),"Assignee":/Evaluator/.toString(),"Step":/Single Scale/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/test idea1/.toString(),"Assignee":/Evaluator/.toString(),"Step":/Single Scale/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/singlescale idea/.toString(),"Assignee":/End User/.toString(),"Step":/Single Scale/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/test idea1/.toString(),"Assignee":/End User/.toString(),"Step":/Single Scale/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/singlescale idea/.toString(),"Assignee":/analyst/.toString(),"Step":/Single Scale/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/test idea1/.toString(),"Assignee":/analyst/.toString(),"Step":/Single Scale/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/singlescale idea/.toString(),"Assignee":/Moderator/.toString(),"Step":/Single Scale/.toString(),"Number of Matches":/0/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/singlescale idea/.toString(),"Assignee":/End User 2/.toString(),"Step":/Single Scale/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/test idea1/.toString(),"Assignee":/End User 2/.toString(),"Step":/Single Scale/.toString(),"Number of Matches":/0/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/test idea1/.toString(),"Assignee":/Moderator/.toString(),"Step":/Single Scale/.toString(),"Number of Matches":/0/.toString())
        //Verify Completed table for Action Items page
        new actions.ActionItems.VerifyCompletedtableforActionItemspage().run("Title":/singlescale idea/.toString(),"Assignee":/Moderator/.toString(),"Number of Matches":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Access Pipeline Manage Steps for a Step
        new actions.PipelineStepsView.AccessPipelineManageStepsforaStep().run("Step Name":/Single Scale/.toString())
        //Access Idea in Pipeline Manage Currently in Step Page
        new actions.PipelineManageSteps.AccessIdeainPipelineManageCurrentlyinStepPage().run("Idea name":/singlescale idea/.toString(),"Click on Checkbox":true)
        //Set Actions Menu in Manage Steps Pages
        new actions.PipelineManageSteps.SetActionsMenuinManageStepsPages().run("Actions Menu Option":/Update Assignees.../.toString())
        //Verify Assignee In Update Assignee Modal
        new actions.PipelineStepsView.VerifyAssigneeInUpdateAssigneeModal().run("Open Modal":false,"Assignee under Completed or Incomplete Action Items":/Assignees with incomplete action items/.toString(),"Assignee":/Evaluator/.toString(),"Display Image":/E/.toString(),"Number of Matches":/1/.toString())
        //Verify Assignee In Update Assignee Modal
        new actions.PipelineStepsView.VerifyAssigneeInUpdateAssigneeModal().run("Open Modal":false,"Assignee under Completed or Incomplete Action Items":/Assignees with incomplete action items/.toString(),"Assignee":/End User/.toString(),"Number of Matches":/1/.toString())
        //Verify Assignee In Update Assignee Modal
        new actions.PipelineStepsView.VerifyAssigneeInUpdateAssigneeModal().run("Open Modal":false,"Assignee under Completed or Incomplete Action Items":/Assignees with incomplete action items/.toString(),"Assignee":/analyst/.toString(),"Display Image":/A/.toString(),"Number of Matches":/1/.toString())
        //Verify Assignee In Update Assignee Modal
        new actions.PipelineStepsView.VerifyAssigneeInUpdateAssigneeModal().run("Open Modal":false,"Assignee under Completed or Incomplete Action Items":/Assignees with complete action items/.toString(),"Assignee":/Moderator/.toString(),"Display Image":/M/.toString(),"Number of Matches":/1/.toString())
        //Verify Assignee In Update Assignee Modal
        new actions.PipelineStepsView.VerifyAssigneeInUpdateAssigneeModal().run("Open Modal":false,"Assignee under Completed or Incomplete Action Items":/Assignees with incomplete action items/.toString(),"Assignee":/End User 2/.toString(),"Display Image":/E/.toString(),"Number of Matches":/1/.toString())
        //Set Update Assignee Modal
        new actions.PipelineStepsView.SetUpdateAssigneeModal().run("Action":/Update Assignments/.toString(),"Remove Assignee from incomplete or complete action items":/analyst,Moderator/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Action Items Manager/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/singlescale idea/.toString(),"Assignee":/Evaluator/.toString(),"Step":/Single Scale/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/test idea1/.toString(),"Assignee":/Evaluator/.toString(),"Step":/Single Scale/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/singlescale idea/.toString(),"Assignee":/End User/.toString(),"Step":/Single Scale/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/test idea1/.toString(),"Assignee":/End User/.toString(),"Step":/Single Scale/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/singlescale idea/.toString(),"Assignee":/analyst/.toString(),"Step":/Single Scale/.toString(),"Number of Matches":/0/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/test idea1/.toString(),"Assignee":/analyst/.toString(),"Step":/Single Scale/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/singlescale idea/.toString(),"Assignee":/Moderator/.toString(),"Step":/Single Scale/.toString(),"Number of Matches":/0/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/singlescale idea/.toString(),"Assignee":/End User 2/.toString(),"Step":/Single Scale/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/test idea1/.toString(),"Assignee":/End User 2/.toString(),"Step":/Single Scale/.toString(),"Number of Matches":/0/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/test idea1/.toString(),"Assignee":/Moderator/.toString(),"Step":/Single Scale/.toString(),"Number of Matches":/0/.toString())
        //Verify Completed table for Action Items page
        new actions.ActionItems.VerifyCompletedtableforActionItemspage().run("Title":/singlescale idea/.toString(),"Assignee":/Moderator/.toString(),"Number of Matches":/0/.toString())
        //Verify Canceled table for Action Items Manager
        new actions.ActionItemsManager.VerifyCanceledtableforActionItemsManager().run("Title":/singlescale idea/.toString(),"Assignee":/analyst/.toString(),"Pipeline":/Custom App/.toString(),"Number of Matches":/1/.toString())
        //Verify Canceled table for Action Items Manager
        new actions.ActionItemsManager.VerifyCanceledtableforActionItemsManager().run("Title":/singlescale idea/.toString(),"Assignee":/Moderator/.toString(),"Pipeline":/Custom App/.toString(),"Number of Matches":/1/.toString())
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