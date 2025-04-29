import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C131207 - Word Limit - NGA View Idea - Moderator Edits End Users Idea
class C131207_WordLimit_NGAViewIdea_ModeratorEditsEndUsersIdea
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
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Test App/.toString(),"Description":/desc/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Description/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Word Limit":/20/.toString(),"Click on Done":true,"Save Form":true)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Short Answer Question/.toString(),"Additional Question Type":/Short Answer/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Long Answer Question/.toString(),"Additional Question Type":/Long Answer/.toString(),"Save Form":true)
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Short Answer Question/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Word Limit":/5/.toString())
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Long Answer Question/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Word Limit":/11/.toString(),"Save Form":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Test App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Edit Step in Pipeline Steps page
        new actions.PipelineStepsView.EditStepinPipelineStepspage().run("Step to Edit":/Submitted/.toString(),"Tool Type":/Scorecard/.toString(),"Action":/Save/.toString())
        //Configure Scorecard Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureScorecardStepinNewModalinPipelineStepspage().run("Individual Assignment User":/evaluator@test.com/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Action":/Activate/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Test App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Idea Title Question - Title":/Title/.toString(),"Idea Title Question - Value":/Word Count Test Title/.toString(),"Description Question - Title":/Description/.toString(),"Description Question - Value":/Description for word count and we will be entering 20 words in this field and not more than that. Done./.toString(),"Category Question - Title":/Category/.toString(),"Category Question - Value":/New Product/.toString(),"Short Answer - Title":/Short Answer Question/.toString(),"Short Answer - Value":/Word limit here is 5 another word./.toString(),"Long Answer - Title":/Long Answer Question/.toString(),"Long Answer - Value":/Word limit here is 11 words and we can't enter more./.toString(),"Action":/Submit Idea/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/moderator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Test App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Access Pipeline Manage Steps for a Step
        new actions.PipelineStepsView.AccessPipelineManageStepsforaStep().run("Step Name":/Submitted/.toString())
        //Access Idea in Pipeline Manage Currently in Step Page
        new actions.PipelineManageSteps.AccessIdeainPipelineManageCurrentlyinStepPage().run("Idea name":/Word Count Test Title/.toString())
        //Set NGA View Idea Description Tab Text Field
        new actions.NGAViewIdea.SetNGAViewIdeaDescriptionTabTextField().run("Field Name":/Description/.toString(),"Field Value":/Description for word count and we will be entering 20 words in this field and not more than that. Done. Extra/.toString())
        try{
            //Verify Text in Element
            new actions.selenium.VerifyText().run("ID":/\/\/*[@id='idea-description-edit-wrapper']\/\/UL[@class='redactor-statusbar']\/LI/.toString(),"Contains Text":/20\/20 Words/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Verify Element
            new actions.general.VerifyElement().run("ID":/\/\/*[@id='tiptip_content' and .='Word limit reached']/.toString(),"Should Element Exist":true,"Number of Matches":/1/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Verify Idea in NGA View Idea page
            new actions.NGAViewIdea.VerifyIdeainNGAViewIdeapage().run("Idea Name":/Word Count Test Title/.toString(),"Description":/Description for word count and we will be entering 20 words in this field and not more than that. Done.xtra/.toString())
        }
       catch(all){}catch(Error err){}
        //Set Custom App Submission Form Fields in NGA View Idea
        new actions.NGAViewIdea.SetCustomAppSubmissionFormFieldsinNGAViewIdea().run("Long Answer Question":/Word limit here is 11 words and we can't enter more. Extra/.toString())
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/*[@id='tiptip_content' and .='Word limit reached']/.toString(),"Should Element Exist":true,"Number of Matches":/1/.toString())
        //Verify Text in Element
        new actions.selenium.VerifyText().run("ID":/\/\/*[starts-with(@id,'question-title-wrapper')]\/DIV[@class='question-title' and contains(.,'Long Answer Question')]\/..\/..\/DIV[@class='question-answer-edit-wrapper']\/\/UL[@class='redactor-statusbar']\/LI/.toString(),"Contains Text":/11\/11 Words/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/*[starts-with(@id,'question-title-wrapper')]\/DIV[@class='question-title' and contains(.,'Long Answer Question')]\/..\/..\/DIV[@class='question-answer-edit-wrapper']\/\/DIV[@class='question-answer-edit-buttons-container']\/\/DIV[starts-with(@id,'submit-btn')]/.toString())
        //Verify NGA View Idea Description Tab Field Value
        new actions.NGAViewIdea.VerifyNGAViewIdeaDescriptionTabFieldValue().run("Field Name":/Long Answer Question/.toString(),"Field Value":/Word limit here is 11 words and we can't enter more.xtra/.toString())
        //Set Custom App Submission Form Fields in NGA View Idea
        new actions.NGAViewIdea.SetCustomAppSubmissionFormFieldsinNGAViewIdea().run("Short Answer Question":/Word limit here is 5 another word. Extra/.toString())
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/*[@id='tiptip_content' and .='Word limit reached']/.toString(),"Should Element Exist":true,"Number of Matches":/1/.toString())
        //Verify Text in Element
        new actions.selenium.VerifyText().run("ID":/\/\/*[starts-with(@id,'question-title-wrapper')]\/DIV[@class='question-title' and contains(.,'Short Answer Question')]\/..\/..\/DIV[@class='question-answer-edit-wrapper']\/\/DIV[@class='word-limit-text']/.toString(),"Contains Text":/5\/5 Words/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/*[starts-with(@id,'submit-btn')]/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Wait
        new actions.general.Wait().run("Seconds":/2/.toString())
        //Verify NGA View Idea Description Tab Field Value
        new actions.NGAViewIdea.VerifyNGAViewIdeaDescriptionTabFieldValue().run("Field Name":/Short Answer Question/.toString(),"Field Value":/Word limit here is 5/.toString())
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