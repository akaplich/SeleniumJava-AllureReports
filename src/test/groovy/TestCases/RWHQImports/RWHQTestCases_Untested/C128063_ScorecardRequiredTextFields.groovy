package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C128063 - Scorecard Required Text Fields
class C128063_ScorecardRequiredTextFields
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
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Home/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Pipeline Setup/.toString())
        //Set Templates in Scorecard Templates
        new actions.PipelineSetup.SetTemplatesScorecardTemplates().run([:])
        //Create Empty Template in Scorecards - Templates
        new actions.PipelineSetup.CreateEmptyTemplateScorecardsTemplates().run("Template Title":/Test Template1/.toString(),"Action":/Create/.toString())
        //Add/Edit Question or Save Form on Scorecard Template
        new actions.PipelineSetup.AddQuestionSaveFormScorecardTemlates().run("Add Question":true)
        //Set Question in Scorecard Template
        new actions.PipelineSetup.SetQuestionScorecardTemplate().run("Added Question Order Number":/1/.toString(),"Question Type":/Long Answer/.toString(),"Required to Answer":true,"Question":/Long Answer - Required/.toString(),"Short Name":/Short Name Test/.toString(),"Tooltip":/Test Tooltip/.toString(),"Action":/Save/.toString())
        //Add/Edit Question or Save Form on Scorecard Template
        new actions.PipelineSetup.AddQuestionSaveFormScorecardTemlates().run("Add Question":true)
        //Set Question in Scorecard Template
        new actions.PipelineSetup.SetQuestionScorecardTemplate().run("Added Question Order Number":/2/.toString(),"Question Type":/Long Answer/.toString(),"Question":/Long Answer1/.toString(),"Short Name":/Short Name Test/.toString(),"Tooltip":/Test Tooltip/.toString(),"Action":/Save/.toString())
        //Add/Edit Question or Save Form on Scorecard Template
        new actions.PipelineSetup.AddQuestionSaveFormScorecardTemlates().run("Add Question":true)
        //Set Question in Scorecard Template
        new actions.PipelineSetup.SetQuestionScorecardTemplate().run("Added Question Order Number":/3/.toString(),"Question Type":/Short Answer/.toString(),"Question":/Short Answer1/.toString(),"Short Name":/Short Name Test/.toString(),"Tooltip":/Test Tooltip/.toString(),"Action":/Save/.toString())
        //Add/Edit Question or Save Form on Scorecard Template
        new actions.PipelineSetup.AddQuestionSaveFormScorecardTemlates().run("Add Question":true)
        //Set Question in Scorecard Template
        new actions.PipelineSetup.SetQuestionScorecardTemplate().run("Added Question Order Number":/4/.toString(),"Question Type":/Short Answer/.toString(),"Required to Answer":true,"Question":/Short Answer - Required/.toString(),"Short Name":/Short Name Test/.toString(),"Tooltip":/Test Tooltip/.toString(),"Action":/Save/.toString())
        //Add/Edit Question or Save Form on Scorecard Template
        new actions.PipelineSetup.AddQuestionSaveFormScorecardTemlates().run("Save Form":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Scorecard Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureScorecardStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Scorecarding/.toString(),"Individual Assignment User":/System Admin/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Scorecard Template":/Test Template1/.toString(),"Action":/Update/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/quick add1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Scorecarding/.toString(),"Action":/Change Step/.toString())
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/quick add1/.toString())
        //Set Evaluation Scorecard for Idea in Action Items page
        new actions.ActionItems.SetEvaluationScorecardIdeaActionItemspage().run("Submit Scorecard":true)
        //Verify Error Field in Scorecard Action Item Page
        new actions.ActionItems.VerifyErrorFieldScorecardActionItemPage().run("Field Name":/Short Answer - Required/.toString(),"Should Error Exist":true)
        //Verify Error Field in Scorecard Action Item Page
        new actions.ActionItems.VerifyErrorFieldScorecardActionItemPage().run("Field Name":/Long Answer - Required/.toString(),"Should Error Exist":true)
        //Verify Error Field in Scorecard Action Item Page
        new actions.ActionItems.VerifyErrorFieldScorecardActionItemPage().run("Field Name":/Long Answer1/.toString(),"Should Error Exist":false)
        //Verify Error Field in Scorecard Action Item Page
        new actions.ActionItems.VerifyErrorFieldScorecardActionItemPage().run("Field Name":/Short Answer1/.toString(),"Should Error Exist":false)
        //Set Evaluation Scorecard for Idea in Action Items page
        new actions.ActionItems.SetEvaluationScorecardIdeaActionItemspage().run("Short Text - Question":/Short Answer - Required/.toString(),"Short Text - Answer":/test/.toString(),"Submit Scorecard":true)
        //Verify Error Field in Scorecard Action Item Page
        new actions.ActionItems.VerifyErrorFieldScorecardActionItemPage().run("Field Name":/Long Answer - Required/.toString(),"Should Error Exist":true)
        //Verify Error Field in Scorecard Action Item Page
        new actions.ActionItems.VerifyErrorFieldScorecardActionItemPage().run("Field Name":/Short Answer - Required/.toString(),"Should Error Exist":false)
        //Set Evaluation Scorecard for Idea in Action Items page
        new actions.ActionItems.SetEvaluationScorecardIdeaActionItemspage().run("Short Text - Question":/Short Answer - Required/.toString(),"Short Text - Answer":/<EMPTY>/.toString(),"Long Text - Question":/Long Answer - Required/.toString(),"Long Text - Answer":/test/.toString(),"Submit Scorecard":true)
        //Verify Error Field in Scorecard Action Item Page
        new actions.ActionItems.VerifyErrorFieldScorecardActionItemPage().run("Field Name":/Short Answer - Required/.toString(),"Should Error Exist":true)
        //Set Evaluation Scorecard for Idea in Action Items page
        new actions.ActionItems.SetEvaluationScorecardIdeaActionItemspage().run("Short Text - Question":/Short Answer - Required/.toString(),"Short Text - Answer":/TEST/.toString(),"Submit Scorecard":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Action Items/.toString())
        //Verify Completed table for Action Items page
        new actions.ActionItems.VerifyCompletedtableforActionItemspage().run("Verify in Which List (optional)":/My Action Items/.toString(),"Completed Tab Value":/1/.toString(),"Title":/quick add1/.toString(),"Number of Matches":/1/.toString())
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