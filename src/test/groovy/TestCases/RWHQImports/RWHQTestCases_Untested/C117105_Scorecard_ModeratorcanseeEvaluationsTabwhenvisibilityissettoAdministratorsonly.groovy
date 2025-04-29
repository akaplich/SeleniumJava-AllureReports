import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C117105 - Scorecard - Moderator can see Evaluations Tab when visibility is set to Administrators only
class C117105_Scorecard_ModeratorcanseeEvaluationsTabwhenvisibilityissettoAdministratorsonly
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
        //Configure Scorecard Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureScorecardStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Scorecarding/.toString(),"Individual Assignment User":/Evaluator/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Evaluation Results":true,"Display on Submissions Evaluation tab when:":/First Action Item for the Submission is complete/.toString(),"Results are visible to":/Administrators only/.toString(),"Action":/Update/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Scorecarding/.toString(),"Action":/Change Step/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/test idea1/.toString())
        //Set General Evaluation Scorecard for Idea in Action Items page
        new actions.ActionItems.SetGeneralEvaluationScorecardforIdeainActionItemspage().run("What is the strategic impact":/High/.toString(),"What is the likely timeframe to implement":/1-3 months/.toString(),"What is the estimated level of enterprise":/High/.toString(),"What resource level would need to be dedicated":/less than 1/.toString(),"What is the revenue potential of the idea":/Less than $1M/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/moderator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Verify Evaluations Tab Ribbon in Vew Idea page
        new actions.ViewIdea.VerifyEvaluationstabRibboninVewIdeapage().run("Overall Score":/69.6% Overall Score (%)/.toString(),"Total Evaluation":/50 Percentile of 1 Submission/.toString(),"Completed Evaluation":/1 \/ 1 Evaluations Completed/.toString())
        //Verify Evaluations Tab Chart on View Idea
        new actions.ViewIdea.VerifyEvaluationsTabChartonViewIdea().run("Should Chart Exist":true,"Number of Matches":/1/.toString())
        //Verify Evaluators List With Score on Evaluation Tab
        new actions.ViewIdea.VerifyEvaluatorsListWithScoreonEvaluationTab().run("Placement Number of Evaluator":/1/.toString(),"Evaluator Name":/Evaluator/.toString(),"Score":/69.6%/.toString())
        //Set Scrolling on Page to Top or Bottom
        new actions.Utils.ScrollPagetoToporBottom().run("Top or Bottom":/Bottom/.toString())
        //Verify Breakdown Score in Evaluation Tab
        new actions.ViewIdea.VerifyBreakdownScoreinEvaluationTab().run("Breakdown":/(69.6% - 80\/115)/.toString(),"Question":/What is the strategic impact\/alignment with our enterprise objectives?/.toString(),"Points":/25 \/ 25/.toString())
        //Verify Breakdown Score in Evaluation Tab
        new actions.ViewIdea.VerifyBreakdownScoreinEvaluationTab().run("Breakdown":/(69.6% - 80\/115)/.toString(),"Question":/What is the likely timeframe to implement this idea?/.toString(),"Points":/15 \/ 15/.toString())
        //Verify Breakdown Score in Evaluation Tab
        new actions.ViewIdea.VerifyBreakdownScoreinEvaluationTab().run("Breakdown":/(69.6% - 80\/115)/.toString(),"Question":/What is the estimated level of enterprise benefit?/.toString(),"Points":/25 \/ 25/.toString())
        //Verify Breakdown Score in Evaluation Tab
        new actions.ViewIdea.VerifyBreakdownScoreinEvaluationTab().run("Breakdown":/(69.6% - 80\/115/.toString(),"Question":/What resource level would need to be dedicated to implement the idea?/.toString(),"Points":/15 \/ 25/.toString())
        //Verify Breakdown Score in Evaluation Tab
        new actions.ViewIdea.VerifyBreakdownScoreinEvaluationTab().run("Breakdown":/(69.6% - 80\/115)/.toString(),"Question":/What is the revenue potential of the idea?/.toString(),"Points":/0 \/ 25/.toString())
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