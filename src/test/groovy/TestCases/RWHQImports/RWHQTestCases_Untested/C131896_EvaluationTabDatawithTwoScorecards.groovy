package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131896 - Evaluation Tab Data with Two Scorecards
class C131896_EvaluationTabDatawithTwoScorecards
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
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Pipeline Setup/.toString())
        //Set Templates in Scorecard Templates
        new actions.PipelineSetup.SetTemplatesScorecardTemplates().run("Template Title to Select":/General Evaluation Scorecard/.toString())
        //Set Action for Selected Scorecard Template
        new actions.PipelineSetup.SetActionSelectedScorecardTemplate().run("Action Dropdown Option":/Save as New Template/.toString(),"Save as New Template Name":/Scorecard One/.toString())
        //Add/Edit Question or Save Form on Scorecard Template
        new actions.PipelineSetup.AddQuestionSaveFormScorecardTemlates().run("Question to Edit":/What is the strategic impact\/alignment with our enterprise objectives?/.toString())
        //Set Question in Scorecard Template
        new actions.PipelineSetup.SetQuestionScorecardTemplate().run("Added Question Order Number":/1/.toString(),"Question Type":/Multiple Choice (one answer)/.toString(),"Answers":/High,Low,Med/.toString(),"Points":/0,10,25/.toString(),"Action":/Save/.toString())
        //Add/Edit Question or Save Form on Scorecard Template
        new actions.PipelineSetup.AddQuestionSaveFormScorecardTemlates().run("Question to Edit":/What is the estimated level of enterprise benefit?/.toString())
        //Set Question in Scorecard Template
        new actions.PipelineSetup.SetQuestionScorecardTemplate().run("Added Question Order Number":/3/.toString(),"Question Type":/Multiple Choice (one answer)/.toString(),"Question":/What is the estimated level of enterprise benefit?/.toString(),"Answers":/Low,Mid,High/.toString(),"Points":/5,10,25/.toString(),"Action":/Save/.toString())
        //Add/Edit Question or Save Form on Scorecard Template
        new actions.PipelineSetup.AddQuestionSaveFormScorecardTemlates().run("Question to Edit":/What is the revenue potential of the idea?/.toString())
        //Set Question in Scorecard Template
        new actions.PipelineSetup.SetQuestionScorecardTemplate().run("Added Question Order Number":/5/.toString(),"Question Type":/Multiple Choice (one answer)/.toString(),"Question":/What is the revenue potential of the idea?/.toString(),"Answers":/$1M to $5M,Less than $1M,Greater than $5M/.toString(),"Points":/25,15,0/.toString())
        //Add/Edit Question or Save Form on Scorecard Template
        new actions.PipelineSetup.AddQuestionSaveFormScorecardTemlates().run("Save Form":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Create Step in Pipeline Steps page
        new actions.PipelineStepsView.CreateStepinPipelineStepspage().run("Step Name":/Scorecard Two/.toString(),"Select Tool Type":/Scorecard/.toString(),"Select Stage":/Evaluation/.toString(),"Action":/Create/.toString())
        //Configure Scorecard Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureScorecardStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":"","Assignment Method":/Individual Assignment/.toString(),"Individual Assignment User":/Evaluator,System Admin/.toString(),"Individual Assignment User Add or Remove":/Add,Add/.toString(),"Scorecard Template":/Scorecard One/.toString(),"Evaluation Results":true,"Display on Submissions Evaluation tab when:":/First Action Item for the Submission is complete/.toString(),"Results are visible to":/Administrators only/.toString(),"Action":/Activate/.toString())
        //Configure Scorecard Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureScorecardStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Scorecarding/.toString(),"Individual Assignment User":/Evaluator,System Admin/.toString(),"Individual Assignment User Add or Remove":/Add,Add/.toString(),"Evaluation Results":true,"Display on Submissions Evaluation tab when:":/First Action Item for the Submission is complete/.toString(),"Results are visible to":/Administrators only/.toString(),"Action":/Update/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Quick Add Idea for Scorecard/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Quick Add Idea for Scorecard/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Scorecarding/.toString(),"Action":/Change Step/.toString())
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/Quick Add Idea for Scorecard/.toString())
        //Set General Evaluation Scorecard for Idea in Action Items page
        new actions.ActionItems.SetGeneralEvaluationScorecardforIdeainActionItemspage().run("What is the strategic impact":/Low/.toString(),"What is the likely timeframe to implement":/More than 12 months/.toString(),"What is the estimated level of enterprise":/High/.toString(),"What resource level would need to be dedicated":/less than 1/.toString(),"What is the revenue potential of the idea":/Less than $1M/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/Quick Add Idea for Scorecard/.toString())
        //Set General Evaluation Scorecard for Idea in Action Items page
        new actions.ActionItems.SetGeneralEvaluationScorecardforIdeainActionItemspage().run("What is the strategic impact":/Low/.toString(),"What is the likely timeframe to implement":/6-12 months/.toString(),"What is the estimated level of enterprise":/High/.toString(),"What resource level would need to be dedicated":/less than 1/.toString(),"What is the revenue potential of the idea":/Greater than $5M/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Quick Add Idea for Scorecard/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Scorecard Two/.toString(),"Action":/Change Step/.toString())
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/Quick Add Idea for Scorecard/.toString())
        //Set General Evaluation Scorecard for Idea in Action Items page
        new actions.ActionItems.SetGeneralEvaluationScorecardforIdeainActionItemspage().run("What is the strategic impact":/Med/.toString(),"What is the likely timeframe to implement":/3-6 months/.toString(),"What is the estimated level of enterprise":/High/.toString(),"What resource level would need to be dedicated":/4-6/.toString(),"What is the revenue potential of the idea":/Greater than $5M/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/Quick Add Idea for Scorecard/.toString())
        //Set General Evaluation Scorecard for Idea in Action Items page
        new actions.ActionItems.SetGeneralEvaluationScorecardforIdeainActionItemspage().run("What is the strategic impact":/High/.toString(),"What is the likely timeframe to implement":/6-12 months/.toString(),"What is the estimated level of enterprise":/Low/.toString(),"What resource level would need to be dedicated":/More than 6/.toString(),"What is the revenue potential of the idea":/$1M to $5M/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Quick Add Idea for Scorecard/.toString())
        //Verify Evaluations Tab Ribbon in Vew Idea page
        new actions.ViewIdea.VerifyEvaluationstabRibboninVewIdeapage().run("Overall Score":/59.6% Overall Score/.toString(),"Total Evaluation":/50 Percentile of 1 Submission/.toString(),"Completed Evaluation":/2 \/ 2 Evaluations Completed/.toString(),"Position Number":/1/.toString())
        //Verify Evaluations Tab Chart on View Idea
        new actions.ViewIdea.VerifyEvaluationsTabChartonViewIdea().run("Should Chart Exist":true,"Number of Matches":/2/.toString())
        //Verify Evaluators List With Score on Evaluation Tab
        new actions.ViewIdea.VerifyEvaluatorsListWithScoreonEvaluationTab().run("Placement Number of Evaluator":/1/.toString(),"Evaluator Name":/System Admin/.toString(),"Score":/69.6%/.toString())
        //Verify Evaluators List With Score on Evaluation Tab
        new actions.ViewIdea.VerifyEvaluatorsListWithScoreonEvaluationTab().run("Placement Number of Evaluator":/2/.toString(),"Evaluator Name":/Evaluator/.toString(),"Score":/49.6%/.toString())
        //Set Scrolling on Page to Top or Bottom
        new actions.Utils.ScrollPagetoToporBottom().run("Top or Bottom":/Bottom/.toString())
        //Set Scrolling on Page to Top or Bottom
        new actions.Utils.ScrollPagetoToporBottom().run("Top or Bottom":/Bottom/.toString())
        //Verify Breakdown Score in Evaluation Tab
        new actions.ViewIdea.VerifyBreakdownScoreinEvaluationTab().run("Breakdown":/(59.6% - 137\/230)/.toString(),"Question":/What is the strategic impact\/alignment with our enterprise objectives?/.toString(),"Points":/17.5 \/ 25/.toString())
        //Verify Breakdown Score in Evaluation Tab
        new actions.ViewIdea.VerifyBreakdownScoreinEvaluationTab().run("Breakdown":/(59.6% - 137\/230)/.toString(),"Question":/What is the likely timeframe to implement this idea?/.toString(),"Points":/8.5 \/ 15/.toString())
        //Verify Breakdown Score in Evaluation Tab
        new actions.ViewIdea.VerifyBreakdownScoreinEvaluationTab().run("Breakdown":/(59.6% - 137\/230)/.toString(),"Question":/What is the estimated level of enterprise benefit?/.toString(),"Points":/15 \/ 25/.toString())
        //Verify Breakdown Score in Evaluation Tab
        new actions.ViewIdea.VerifyBreakdownScoreinEvaluationTab().run("Breakdown":/(59.6% - 137\/230)/.toString(),"Question":/What resource level would need to be dedicated to implement the idea?/.toString(),"Points":/7.5 \/ 25/.toString())
        //Verify Breakdown Score in Evaluation Tab
        new actions.ViewIdea.VerifyBreakdownScoreinEvaluationTab().run("Breakdown":/(59.6% - 137\/230)/.toString(),"Question":/What is the revenue potential of the idea?/.toString(),"Points":/20 \/ 25/.toString())
        //Set Scrolling on Page to Top or Bottom
        new actions.Utils.ScrollPagetoToporBottom().run("Top or Bottom":/Bottom/.toString())
        //Set Scrolling on Page to Top or Bottom
        new actions.Utils.ScrollPagetoToporBottom().run("Top or Bottom":/Bottom/.toString())
        //Verify Evaluations Tab Ribbon in Vew Idea page
        new actions.ViewIdea.VerifyEvaluationstabRibboninVewIdeapage().run("Overall Score":/50.9% Overall Score/.toString(),"Total Evaluation":/50 Percentile of 1 Submission/.toString(),"Completed Evaluation":/2 \/ 2 Evaluations Completed/.toString(),"Position Number":/2/.toString())
        //Verify Evaluators List With Score on Evaluation Tab
        new actions.ViewIdea.VerifyEvaluatorsListWithScoreonEvaluationTab().run("Widget Instance Number":/2/.toString(),"Placement Number of Evaluator":/1/.toString(),"Evaluator Name":/Evaluator/.toString(),"Score":/62.6%/.toString())
        //Set Scrolling on Page to Top or Bottom
        new actions.Utils.ScrollPagetoToporBottom().run("Top or Bottom":/Bottom/.toString())
        //Set Scrolling on Page to Top or Bottom
        new actions.Utils.ScrollPagetoToporBottom().run("Top or Bottom":/Bottom/.toString())
        //Verify Breakdown Score in Evaluation Tab
        new actions.ViewIdea.VerifyBreakdownScoreinEvaluationTab().run("Breakdown":/(50.9% - 117\/230)/.toString(),"Question":/What is the strategic impact\/alignment with our enterprise objectives?/.toString(),"Points":/0 \/ 25/.toString())
        //Verify Breakdown Score in Evaluation Tab
        new actions.ViewIdea.VerifyBreakdownScoreinEvaluationTab().run("Breakdown":/(50.9% - 117\/230)/.toString(),"Question":/What is the likely timeframe to implement this idea?/.toString(),"Points":/6 \/ 15/.toString())
        //Verify Breakdown Score in Evaluation Tab
        new actions.ViewIdea.VerifyBreakdownScoreinEvaluationTab().run("Breakdown":/(50.9% - 117\/230)/.toString(),"Question":/What is the estimated level of enterprise benefit?/.toString(),"Points":/25 \/ 25/.toString())
        //Verify Breakdown Score in Evaluation Tab
        new actions.ViewIdea.VerifyBreakdownScoreinEvaluationTab().run("Breakdown":/(50.9% - 117\/230)/.toString(),"Question":/What resource level would need to be dedicated to implement the idea?/.toString(),"Points":/15 \/ 25/.toString())
        //Verify Breakdown Score in Evaluation Tab
        new actions.ViewIdea.VerifyBreakdownScoreinEvaluationTab().run("Breakdown":/(50.9% - 117\/230)/.toString(),"Question":/What is the revenue potential of the idea?/.toString(),"Points":/12.5 \/ 25/.toString())
        //Verify Evaluators List With Score on Evaluation Tab
        new actions.ViewIdea.VerifyEvaluatorsListWithScoreonEvaluationTab().run("Widget Instance Number":/2/.toString(),"Placement Number of Evaluator":/2/.toString(),"Evaluator Name":/System Admin/.toString(),"Score":/39.1%/.toString())
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