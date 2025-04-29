import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132037 - Action Item Score Percentage After Updating Template
class C132037_ActionItemScorePercentageAfterUpdatingTemplate
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Unlimited Brightidea Administrator License Type":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Apply Filter on Apps Pillar 2.0
        new actions.AppsPillar.ApplyFilterAppsPillar20().run("Filter Option":/Build/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Custom for Scorecard Title/.toString(),"Description":/Custom for Scorecard Description/.toString(),"Action":/Create/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Pipeline Setup/.toString())
        //Set Templates in Scorecard Templates
        new actions.PipelineSetup.SetTemplatesScorecardTemplates().run([:])
        //Create Empty Template in Scorecards - Templates
        new actions.PipelineSetup.CreateEmptyTemplateScorecardsTemplates().run("Template Title":/Test Template1/.toString(),"Action":/Create/.toString())
        //Add/Edit Question or Save Form on Scorecard Template
        new actions.PipelineSetup.AddQuestionSaveFormScorecardTemlates().run("Add Question":true)
        //Set Question in Scorecard Template
        new actions.PipelineSetup.SetQuestionScorecardTemplate().run("Added Question Order Number":/1/.toString(),"Question Type":/Multiple Choice (one answer)/.toString(),"Question":/Multiple Choice - One Answer/.toString(),"Short Name":/MC Test/.toString(),"Tooltip":/Test Tooltip One Answer/.toString(),"Answers":/High,Low,Med/.toString(),"Points":/10,20,30/.toString(),"Action":/Save/.toString())
        //Add/Edit Question or Save Form on Scorecard Template
        new actions.PipelineSetup.AddQuestionSaveFormScorecardTemlates().run("Save Form":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom for Scorecard Title/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Edit Step in Pipeline Steps page
        new actions.PipelineStepsView.EditStepinPipelineStepspage().run("Step to Edit":/Scorecarding/.toString(),"Tool Type":/Scorecard/.toString(),"Action":/Save/.toString())
        //Configure Scorecard Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureScorecardStepinNewModalinPipelineStepspage().run("Assignment Method":/Individual Assignment/.toString(),"Individual Assignment User":/System Admin,Evaluator/.toString(),"Individual Assignment User Add or Remove":/Add,Add/.toString(),"Scorecard Template":/Test Template1/.toString(),"Evaluation Results":true,"Display on Submissions Evaluation tab when:":/First Action Item for the Submission is complete/.toString(),"Results are visible to":/Administrators only/.toString(),"Action":/Activate/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/Quick Add Idea for Scorecard/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Quick Add Idea for Scorecard/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Scorecarding/.toString(),"Action":/Change Step/.toString())
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/Quick Add Idea for Scorecard/.toString())
        //Set Evaluation Scorecard for Idea in Action Items page
        new actions.ActionItems.SetEvaluationScorecardIdeaActionItemspage().run("Multi Choice One Answer - Question":/Multiple Choice - One Answer/.toString(),"Multi Choice One - Answer(s)":/Med/.toString(),"Submit Scorecard":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/Quick Add Idea for Scorecard/.toString())
        //Set Evaluation Scorecard for Idea in Action Items page
        new actions.ActionItems.SetEvaluationScorecardIdeaActionItemspage().run("Multi Choice One Answer - Question":/Multiple Choice - One Answer/.toString(),"Multi Choice One - Answer(s)":/High/.toString(),"Submit Scorecard":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom for Scorecard Title/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Verify Currently in Step Table for Manage Scorecard
        new actions.PipelineManageSteps.VerifyCurrentlyinStepTableforManageScorecard().run("Step Name to Manage (optional)":/Scorecarding/.toString(),"Idea Name":/Quick Add Idea for Scorecard/.toString(),"Code":/D111/.toString(),"Overall Score":/66.67/.toString(),"Percentile":/0/.toString(),"Variance":/1111.22/.toString(),"Comment Count":/0/.toString(),"Vote Score":/1/.toString(),"Views":/0/.toString(),"Evaluators":/Evaluator,System Admin/.toString(),"Individual Evaluator Score":/33.33,100/.toString(),"Number of Matches":/1/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Pipeline Setup/.toString())
        //Set Templates in Scorecard Templates
        new actions.PipelineSetup.SetTemplatesScorecardTemplates().run("Template Title to Select":/Test Template1/.toString())
        //Add/Edit Question or Save Form on Scorecard Template
        new actions.PipelineSetup.AddQuestionSaveFormScorecardTemlates().run("Question to Edit":/Multiple Choice - One Answer/.toString())
        //Set Question in Scorecard Template
        new actions.PipelineSetup.SetQuestionScorecardTemplate().run("Added Question Order Number":/1/.toString(),"Question Type":/Multiple Choice (one answer)/.toString(),"Answers":/High,Low,Med/.toString(),"Points":/10,15,25/.toString(),"Action":/Save/.toString())
        //Set Action for Selected Scorecard Template
        new actions.PipelineSetup.SetActionSelectedScorecardTemplate().run("Go Back":true)
        //Save Scorecard Template Change Impact Existing Action Items Modal
        new actions.PipelineSetup.SaveScorecardTemplateChangeImpactExistingActionItemsModal().run("Action":/Save Changes/.toString())
        //Set Templates in Scorecard Templates
        new actions.PipelineSetup.SetTemplatesScorecardTemplates().run("Template Title to Select":/Test Template1/.toString())
        //Add/Edit Question or Save Form on Scorecard Template
        new actions.PipelineSetup.AddQuestionSaveFormScorecardTemlates().run("Question to Edit":/Multiple Choice - One Answer/.toString())
        //Set Question in Scorecard Template
        new actions.PipelineSetup.SetQuestionScorecardTemplate().run("Added Question Order Number":/1/.toString(),"Question Type":/Multiple Choice (one answer)/.toString(),"Answers":/High,Low,Med/.toString(),"Points":/5,15,25/.toString(),"Action":/Save/.toString())
        //Add/Edit Question or Save Form on Scorecard Template
        new actions.PipelineSetup.AddQuestionSaveFormScorecardTemlates().run("Save Form":true)
        //Save Scorecard Template Change Impact Existing Action Items Modal
        new actions.PipelineSetup.SaveScorecardTemplateChangeImpactExistingActionItemsModal().run("Action":/Save Changes/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom for Scorecard Title/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Verify Currently in Step Table for Manage Scorecard
        new actions.PipelineManageSteps.VerifyCurrentlyinStepTableforManageScorecard().run("Step Name to Manage (optional)":/Scorecarding/.toString(),"Idea Name":/Quick Add Idea for Scorecard/.toString(),"Code":/D111/.toString(),"Overall Score":/60/.toString(),"Percentile":/0/.toString(),"Variance":/1600/.toString(),"Comment Count":/0/.toString(),"Vote Score":/1/.toString(),"Views":/0/.toString(),"Evaluators":/Evaluator,System Admin/.toString(),"Individual Evaluator Score":/20,100/.toString(),"Number of Matches":/1/.toString())
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/View All/.toString())
        //Verify Completed table for Action Items page
        new actions.ActionItems.VerifyCompletedtableforActionItemspage().run("Verify in Which List (optional)":/My Action Items/.toString(),"Title":/Quick Add Idea for Scorecard/.toString(),"Number of Matches":/1/.toString())
        //Access Action Item in My Action Items/Action Items Manager table
        new actions.ActionItems.AccessActionIteminMyActionItemsActionItemsManagertable().run("Access in Which List":/My Action Items/.toString(),"Title":/Quick Add Idea for Scorecard/.toString())
        //Verify Completed table for Action Items page
        new actions.ActionItems.VerifyCompletedtableforActionItemspage().run("Verify in Which List (optional)":/My Action Items/.toString(),"Title":/Quick Add Idea for Scorecard/.toString(),"Score":/100/.toString(),"Number of Matches":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom for Scorecard Title/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Quick Add Idea for Scorecard/.toString())
        //Set Tab in View Idea 3
        new actions.ViewIdea30.SetTabinViewIdea3().run("Tab":/Evaluation/.toString())
        //Verify Evaluations Tab Ribbon in Vew Idea page
        new actions.ViewIdea.VerifyEvaluationstabRibboninVewIdeapage().run("Click on Evaluation Tab on View Idea 2":false,"Overall Score":/60% Overall Score/.toString(),"Total Evaluation":/50 Percentile of 1 Submission/.toString(),"Completed Evaluation":/2 \/ 2 Evaluations Completed/.toString(),"Position Number":/1/.toString())
        //Verify Evaluations Tab Chart on View Idea
        new actions.ViewIdea.VerifyEvaluationsTabChartonViewIdea().run("Should Chart Exist":true,"Number of Matches":/1/.toString())
        //Verify Evaluators List With Score on Evaluation Tab
        new actions.ViewIdea.VerifyEvaluatorsListWithScoreonEvaluationTab().run("Placement Number of Evaluator":/1/.toString(),"Evaluator Name":/System Admin/.toString(),"Score":/100%/.toString())
        //Verify Evaluators List With Score on Evaluation Tab
        new actions.ViewIdea.VerifyEvaluatorsListWithScoreonEvaluationTab().run("Placement Number of Evaluator":/2/.toString(),"Evaluator Name":/Evaluator/.toString(),"Score":/20%/.toString())
        //Set Scrolling on Page to Top or Bottom
        new actions.Utils.ScrollPagetoToporBottom().run("Top or Bottom":/Bottom/.toString())
        //Verify Breakdown Score in Evaluation Tab
        new actions.ViewIdea.VerifyBreakdownScoreinEvaluationTab().run("Breakdown":/(60.0% - 30\/50)/.toString(),"Question":/Multiple Choice - One Answer/.toString(),"Points":/15 \/ 25/.toString())
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