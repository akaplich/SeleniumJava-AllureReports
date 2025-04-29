import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C129117 - Required Dependent - Update Required Dependent of Dependent - Moderator
class C129117_RequiredDependent_UpdateRequiredDependentofDependent_Moderator
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
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Test App/.toString(),"Description":/desc/.toString(),"Moderators":/moderator@test.com/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Parent1/.toString(),"Additional Question Type":/Multiple Choice/.toString(),"Additional Question Answers":/Parent1-1,Parent1-2,Parent1-3/.toString(),"Additional Question Answers Actions":/Add,Add,Add/.toString(),"Save Form":true)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Child1/.toString(),"Additional Question Type":/Checkbox/.toString(),"Additional Question Answers":/Child1-1,Child1-2,Child1-3/.toString(),"Additional Question Answers Actions":/Add,Add,Add/.toString())
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Child1/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Set Dependent Answer":true,"Set Dependent Answer Dropdown":/Parent1-1/.toString(),"Required":true,"Save Form":true)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Child2/.toString(),"Additional Question Type":/Multiple Choice/.toString(),"Additional Question Answers":/Child2-1,Child2-2,Child2-3/.toString(),"Additional Question Answers Actions":/Add,Add,Add/.toString())
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Child2/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Set Dependent Answer":true,"Set Dependent Answer Dropdown":/Child1-2/.toString(),"Required":true,"Save Form":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Test App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Idea Title Question - Title":/Title/.toString(),"Idea Title Question - Value":/test idea1/.toString(),"Description Question - Title":/Description/.toString(),"Description Question - Value":/desc/.toString(),"Category Question - Title":/Category/.toString(),"Category Question - Value":/Operations/.toString(),"Multiple Choice - Title":/Parent1/.toString(),"Multiple Choice - Value":/Parent1-3/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Test App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Edit Step in Pipeline Steps page
        new actions.PipelineStepsView.EditStepinPipelineStepspage().run("Step to Edit":/Submitted/.toString(),"Tool Type":/Scorecard/.toString(),"Action":/Save/.toString())
        //Configure Review Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureReviewStepinNewModalinPipelineStepspage().run("Individual Assignment User":/Evaluator/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Action":/Create Project/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/moderator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Test App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Access Pipeline Manage Steps for a Step
        new actions.PipelineStepsView.AccessPipelineManageStepsforaStep().run("Step Name":/Submitted/.toString())
        //Access Idea in Pipeline Manage Currently in Step Page
        new actions.PipelineManageSteps.AccessIdeainPipelineManageCurrentlyinStepPage().run("Idea name":/test idea1/.toString())
        //Set NGA View Idea Description Tab Radiobutton
        new actions.NGAViewIdeaFields.SetNGAViewIdeaRadioButton().run("Field Name":/Parent1/.toString(),"Field Value":/Parent1-1/.toString(),"Action":/Save/.toString())
        //Set NGA View Idea Description Tab Checkbox
        new actions.NGAViewIdeaFields.SetNGAViewIdeaCheckbox().run("Field Name":/Child1/.toString(),"Checkbox Name":/Child1-2/.toString(),"Checkbox Check":/TRUE/.toString(),"Action":/Save/.toString())
        //Set NGA View Idea Description Tab Radiobutton
        new actions.NGAViewIdeaFields.SetNGAViewIdeaRadioButton().run("Field Name":/Child2/.toString(),"Action":/Save/.toString())
        //Verify Error Field in NGA View Idea page
        new actions.NGAViewIdeaFields.VerifyErrorFieldNGAViewIdea().run("Field Name":/Child2/.toString(),"Should Error Exist":true)
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Set NGA View Idea Description Tab Radiobutton
        new actions.NGAViewIdeaFields.SetNGAViewIdeaRadioButton().run("Field Name":/Child2/.toString(),"Field Value":/Child2-2/.toString(),"Action":/Save/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Verify NGA View Idea Description Tab Field Value
        new actions.NGAViewIdea.VerifyNGAViewIdeaDescriptionTabFieldValue().run("Field Name":/Child2/.toString(),"Field Value":/Child2-2/.toString())
        //Set NGA View Idea Description Tab Radiobutton
        new actions.NGAViewIdeaFields.SetNGAViewIdeaRadioButton().run("Field Name":/Child2/.toString(),"Field Value":/Child2-3/.toString(),"Action":/Save/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Verify NGA View Idea Description Tab Field Value
        new actions.NGAViewIdea.VerifyNGAViewIdeaDescriptionTabFieldValue().run("Field Name":/Child2/.toString(),"Field Value":/Child2-3/.toString())
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