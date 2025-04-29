import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C119558 - Save Evaluator Data - Removed Assignee in Currently in Step Page
class C119558_SaveEvaluatorData_RemovedAssigneeinCurrentlyinStepPage
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
        Action58123c20fa4ee77809f468f6("Run Browser in Incognito":/TRUE/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Scorecard Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureScorecardStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Scorecarding/.toString(),"Individual Assignment User":/System Admin,End User,Evaluator/.toString(),"Individual Assignment User Add or Remove":/Add,Add,Add/.toString(),"Action":/Update/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Quick add Idea1/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Quick add Idea2/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Quick add Idea1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Scorecarding/.toString(),"Action":/Change Step/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Quick add Idea2/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Scorecarding/.toString(),"Action":/Change Step/.toString())
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/Quick add Idea1/.toString())
        //Set General Evaluation Scorecard for Idea in Action Items page
        new actions.ActionItems.SetGeneralEvaluationScorecardforIdeainActionItemspage().run("What is the strategic impact":/High/.toString(),"What is the likely timeframe to implement":/1-3 months/.toString(),"What is the estimated level of enterprise":/High/.toString(),"What resource level would need to be dedicated":/less than 1/.toString(),"What is the revenue potential of the idea":/Less than $1M/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Close All Browsers
        new actions.selenium.CloseBrowser().run([:])
        //Open Browser
        new actions.selenium.Browser().run("URL":/${variables."affiliateURL"}/.toString(),"Browser Type":/Chrome/.toString())
        //Login
        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/Quick add Idea2/.toString())
        //Set General Evaluation Scorecard for Idea in Action Items page
        new actions.ActionItems.SetGeneralEvaluationScorecardforIdeainActionItemspage().run("What is the strategic impact":/High/.toString(),"What is the likely timeframe to implement":/3-6 months/.toString(),"What is the estimated level of enterprise":/High/.toString(),"What resource level would need to be dedicated":/less than 1/.toString(),"What is the revenue potential of the idea":/Less than $1M/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Close All Browsers
        new actions.selenium.CloseBrowser().run([:])
        //Open Browser
        new actions.selenium.Browser().run("URL":/${variables."affiliateURL"}/.toString(),"Browser Type":/Chrome/.toString())
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Scorecard Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureScorecardStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Scorecarding/.toString(),"Individual Assignment User":/Evaluator/.toString(),"Individual Assignment User Add or Remove":/Remove/.toString(),"Action":/Update/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/30/.toString())
        //Verify Currently in Step Table for Manage Scorecard
        new actions.PipelineManageSteps.VerifyCurrentlyinStepTableforManageScorecard().run("Step Name to Manage (optional)":/Scorecarding/.toString(),"Idea Name":/Quick add Idea2/.toString(),"Code":/D114/.toString(),"Overall Score":/65.22/.toString(),"Percentile":/0/.toString(),"Variance":/0/.toString(),"Comment Count":/0/.toString(),"Vote Score":/1/.toString(),"Views":/0/.toString(),"Evaluators":/End User,System Admin,Evaluator (Removed)/.toString(),"Individual Evaluator Score":/?,?,65.22/.toString(),"Number of Matches":/1/.toString())
        //Access Idea in Pipeline Manage Currently in Step Page
        new actions.PipelineManageSteps.AccessIdeainPipelineManageCurrentlyinStepPage().run("Idea name":/Quick add Idea2/.toString())
        //Verify the Evaluators that Completed the Scorecard
        new actions.PipelineManageSteps.VerifytheEvaluatorsthatCompletedtheScorecard().run("Idea (optional)":/Quick add Idea2/.toString(),"Question":/What is the strategic impact\/alignment with our enterprise objectives?/.toString(),"Answer":/High/.toString(),"Evaluator":/Evaluator (Removed)/.toString(),"Number of Matches":/1/.toString())
        //Verify the Evaluators that Completed the Scorecard
        new actions.PipelineManageSteps.VerifytheEvaluatorsthatCompletedtheScorecard().run("Question":/What is the likely timeframe to implement this idea?/.toString(),"Answer":/3-6 months/.toString(),"Evaluator":/Evaluator (Removed)/.toString(),"Number of Matches":/1/.toString())
        //Verify the Evaluators that Completed the Scorecard
        new actions.PipelineManageSteps.VerifytheEvaluatorsthatCompletedtheScorecard().run("Question":/What resource level would need to be dedicated to implement the idea?/.toString(),"Answer":/less than 1/.toString(),"Evaluator":/Evaluator (Removed)/.toString(),"Number of Matches":/1/.toString())
        //Verify the Evaluators that Completed the Scorecard
        new actions.PipelineManageSteps.VerifytheEvaluatorsthatCompletedtheScorecard().run("Question":/What is the likely timeframe to implement this idea?/.toString(),"Answer":/3-6 months/.toString(),"Evaluator":/Evaluator (Removed)/.toString(),"Number of Matches":/1/.toString())
        //Verify the Evaluators that Completed the Scorecard
        new actions.PipelineManageSteps.VerifytheEvaluatorsthatCompletedtheScorecard().run("Question":/What is the revenue potential of the idea?/.toString(),"Answer":/Less than $1M/.toString(),"Evaluator":/Evaluator (Removed)/.toString(),"Number of Matches":/1/.toString())
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