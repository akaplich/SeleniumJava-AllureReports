import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132104 - Update Assignee - Review - Category assignment
class C132104_UpdateAssignee_Review_Categoryassignment
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
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Create Step in Pipeline Steps page
        new actions.PipelineStepsView.CreateStepinPipelineStepspage().run("Step Name":/New Review Step/.toString(),"Select Tool Type":/Review/.toString(),"Select Stage":/Collection/.toString(),"Action":/Create/.toString())
        //Configure Review Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureReviewStepinNewModalinPipelineStepspage().run("Assignment Method":/Category Assignment/.toString(),"Category":/New Product,New Product,Operations,Marketing & Branding,Strategy,Quick Add\/New Categories/.toString(),"Category Assignment User":/End User,Evaluator,System Admin,End User,System Admin,End User/.toString(),"Category Assignment User Add or Remove":/Add,Add,Add,Add,Add,Add/.toString(),"Action":/Activate/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/New Review Step/.toString(),"Action":/Change Step/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea2/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/New Review Step/.toString(),"Action":/Change Step/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Action Items Manager/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/test idea1/.toString(),"Category":/New Product/.toString(),"Assignee":/Evaluator/.toString(),"Step":/New Review Step/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/test idea1/.toString(),"Category":/New Product/.toString(),"Assignee":/End User/.toString(),"Step":/New Review Step/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/test idea2/.toString(),"Category":/Operations/.toString(),"Assignee":/System Admin/.toString(),"Step":/New Review Step/.toString(),"Number of Matches":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea1/.toString())
        //Verify Assignee In Update Assignee Modal
        new actions.PipelineStepsView.VerifyAssigneeInUpdateAssigneeModal().run("Open Modal":true,"Assignee under Completed or Incomplete Action Items":/Assignees with incomplete action items/.toString(),"Assignee":/Evaluator/.toString(),"Display Image":/E/.toString(),"Number of Matches":/1/.toString())
        //Verify Assignee In Update Assignee Modal
        new actions.PipelineStepsView.VerifyAssigneeInUpdateAssigneeModal().run("Open Modal":false,"Assignee under Completed or Incomplete Action Items":/Assignees with incomplete action items/.toString(),"Assignee":/End User/.toString(),"Number of Matches":/1/.toString())
        //Set Update Assignee Modal
        new actions.PipelineStepsView.SetUpdateAssigneeModal().run("Additional Assignee":/End User 2/.toString(),"Additional Assignee Add or Remove":/Add/.toString(),"Action":/Update Assignments/.toString())
        //Verify Assignee In Update Assignee Modal
        new actions.PipelineStepsView.VerifyAssigneeInUpdateAssigneeModal().run("Open Modal":true,"Assignee under Completed or Incomplete Action Items":/Assignees with incomplete action items/.toString(),"Assignee":/Evaluator/.toString(),"Display Image":/E/.toString(),"Number of Matches":/1/.toString())
        //Verify Assignee In Update Assignee Modal
        new actions.PipelineStepsView.VerifyAssigneeInUpdateAssigneeModal().run("Open Modal":false,"Assignee under Completed or Incomplete Action Items":/Assignees with incomplete action items/.toString(),"Assignee":/End User/.toString(),"Number of Matches":/1/.toString())
        //Verify Assignee In Update Assignee Modal
        new actions.PipelineStepsView.VerifyAssigneeInUpdateAssigneeModal().run("Open Modal":false,"Assignee under Completed or Incomplete Action Items":/Assignees with incomplete action items/.toString(),"Assignee":/End User 2/.toString(),"Number of Matches":/1/.toString())
        //Set Update Assignee Modal
        new actions.PipelineStepsView.SetUpdateAssigneeModal().run("Action":/Cancel/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Action Items Manager/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/test idea1/.toString(),"Category":/New Product/.toString(),"Assignee":/Evaluator/.toString(),"Step":/New Review Step/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/test idea1/.toString(),"Category":/New Product/.toString(),"Assignee":/End User/.toString(),"Step":/New Review Step/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/test idea1/.toString(),"Category":/New Product/.toString(),"Assignee":/End User 2/.toString(),"Step":/New Review Step/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/test idea2/.toString(),"Category":/Operations/.toString(),"Assignee":/System Admin/.toString(),"Step":/New Review Step/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/test idea2/.toString(),"Category":/Operations/.toString(),"Assignee":/End User 2/.toString(),"Step":/New Review Step/.toString(),"Number of Matches":/0/.toString())
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