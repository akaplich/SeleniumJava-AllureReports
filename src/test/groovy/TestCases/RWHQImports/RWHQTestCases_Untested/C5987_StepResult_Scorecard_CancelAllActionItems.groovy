import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C5987 - Step Result - Scorecard - Cancel All Action Items
class C5987_StepResult_Scorecard_CancelAllActionItems
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
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Display Step Results/.toString(),"Description":/about/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Display Step Results/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/cancel me/.toString(),"Description":/about/.toString(),"Category":/New Product/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Display Step Results/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Edit Step in Pipeline Steps page
        new actions.PipelineStepsView.EditStepinPipelineStepspage().run("Step to Edit":/Initial Screen/.toString(),"Step Name":/Initial Screen/.toString(),"Tool Type":/Scorecard/.toString(),"Action":/Save/.toString())
        //Configure Scorecard Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureScorecardStepinNewModalinPipelineStepspage().run("Assignment Method":/Individual Assignment/.toString(),"Individual Assignment User":/System Admin/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Action":/Activate/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/cancel me/.toString(),"Idea ID":/D113/.toString(),"Step Name idea belongs to":/Submitted/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Initial Screen/.toString(),"Action":/Change Step/.toString())
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/View All/.toString())
        //Set Actions Dropdown in the Action Items Manager
        new actions.ActionItemsManager.SetActionsDropdownintheActionItemsManager().run("Select Ideas":/cancel me/.toString(),"Check":/TRUE/.toString(),"Action":/Cancel/.toString(),"Sub Action":/Cancel Action Item/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Display Step Results/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Verify Step Results in Steps View page
        new actions.PipelineStepsView.VerifyStepResultsinStepsViewpage().run("Step Name":/Initial Screen/.toString(),"Idea Code":/D113/.toString(),"Number of Matches":/0/.toString())
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