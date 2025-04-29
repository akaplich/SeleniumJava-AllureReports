import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132032 - Evaluation reordering - Evaluations Link should go to right most step
class C132032_Evaluationreordering_EvaluationsLinkshouldgotorightmoststep
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
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Scorecard idea1/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Scorecard idea2/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Scorecard idea3/.toString(),"Action":/Submit/.toString())
        //Configure Scorecard Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureScorecardStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Scorecarding/.toString(),"Assignment Method":/Individual Assignment/.toString(),"Individual Assignment User":/Evaluator/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Action":/Update/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Scorecard idea1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Scorecarding/.toString(),"Action":/Change Step/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Scorecard idea2/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Scorecarding/.toString(),"Action":/Change Step/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Scorecard idea3/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Scorecarding/.toString(),"Action":/Change Step/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Judging Idea1/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Judging Idea2/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Judging Idea3/.toString(),"Action":/Submit/.toString())
        //Configure Judging Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureJudgingStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Judging/.toString(),"Judges":/Evaluator/.toString(),"Judges Add or Remove":/Add/.toString(),"Action":/Activate/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Judging Idea1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Judging/.toString(),"Action":/Change Step/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Judging Idea2/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Judging/.toString(),"Action":/Change Step/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Judging Idea3/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Judging/.toString(),"Action":/Change Step/.toString())
        //Configure Single Scale Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureSingleScaleStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Single Scale/.toString(),"Assignment Method":/Individual Assignment/.toString(),"Individual Assignment User":/Evaluator/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Action":/Update/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Single Scale/.toString(),"Action":/Change Step/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea2/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Single Scale/.toString(),"Action":/Change Step/.toString())
        //Set Update Order from Pipeline Steps View
        new actions.PipelineStepsView.SetUpdateOrderfromPipelineStepsView().run("Step Name to Configure (optional)":/Judging/.toString(),"Tool Type":/Judging/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Set Drag and Drop Ideas in Update Tooltype Order Modal
        new actions.PipelineStepsView.SetDragandDropIdeasinUpdateTooltypeOrderModal().run("Idea to drag":/Judging Idea3/.toString(),"New Row Number":/1/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Set Drag and Drop Ideas in Update Tooltype Order Modal
        new actions.PipelineStepsView.SetDragandDropIdeasinUpdateTooltypeOrderModal().run("Idea to drag":/Judging Idea1/.toString(),"New Row Number":/1/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Set Update ToolType Order Modal
        new actions.PipelineStepsView.SetUpdateToolTypeOrder().run("Action":/Save Changes/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/New evaluation order saved!/.toString(),"Should Exist":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Verify Action Items in Progress in Manage Step Page
        new actions.PipelineManageSteps.VerifyActionItemsinProgressinManageStep().run("Step Name to Manage (optional)":/Judging/.toString(),"Evaluator":/Evaluator/.toString())
        //Set Share Evaluation Reordering in Manage Step Page 
        new actions.PipelineManageSteps.SetConfigureLinkinManageStepPage().run("Share Options":/Copy Evaluation Link/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Evaluation link copied!/.toString(),"Should Exist":true)
        //Get Clipboard Content
        variables."copiedString" = new actions.selenium.GetClipboardContent().run([:])
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."copiedString"}/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/7/.toString())
        //Verify New Evaluation Order
        new actions.ActionItems.VerifyNewEvaluationOrder().run("Title":/Judging Idea1/.toString(),"Order":/1/.toString(),"Completed":false,"Row Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify New Evaluation Order
        new actions.ActionItems.VerifyNewEvaluationOrder().run("Title":/Judging Idea3/.toString(),"Order":/2/.toString(),"Completed":false,"Row Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify New Evaluation Order
        new actions.ActionItems.VerifyNewEvaluationOrder().run("Title":/Judging Idea2/.toString(),"Order":/3/.toString(),"Completed":false,"Row Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify New Evaluation Order
        new actions.ActionItems.VerifyNewEvaluationOrder().run("Title":/test idea1/.toString(),"Number of Matches":/0/.toString())
        //Verify New Evaluation Order
        new actions.ActionItems.VerifyNewEvaluationOrder().run("Title":/test idea2/.toString(),"Number of Matches":/0/.toString())
        //Verify New Evaluation Order
        new actions.ActionItems.VerifyNewEvaluationOrder().run("Title":/quick add1/.toString(),"Number of Matches":/0/.toString())
        //Verify New Evaluation Order
        new actions.ActionItems.VerifyNewEvaluationOrder().run("Title":/scorecard idea1/.toString(),"Number of Matches":/0/.toString())
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