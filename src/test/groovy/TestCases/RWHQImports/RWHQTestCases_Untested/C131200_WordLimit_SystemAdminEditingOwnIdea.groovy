package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131200 - Word Limit - System Admin Editing Own Idea
class C131200_WordLimit_SystemAdminEditingOwnIdea
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
        //Disable Apps V3
        Action67d84bbf3e876c6a0e91b2a2([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Test App/.toString(),"Description":/desc/.toString(),"Action":/Create/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Description/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Word Limit":/20/.toString(),"Click on Done":true)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Short Answer Question/.toString(),"Additional Question Type":/Short Answer/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Long Answer Question/.toString(),"Additional Question Type":/Long Answer/.toString(),"Save Form":true)
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Short Answer Question/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Word Limit":/5/.toString(),"Click on Done":true)
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Long Answer Question/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Word Limit":/11/.toString(),"Click on Done":true,"Save Form":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Test App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/New Idea/.toString(),"Description":/Description for word count and we will be entering 20 words in this field and not more than that. Done./.toString(),"Category":/Strategy/.toString(),"Short Answer Question":/Word limit here is 5./.toString(),"Long Answer Question":/Word limit here is 11 words and we can't enter more'./.toString(),"Action":/Submit Idea/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/New Idea/.toString())
        //Set View Idea Description Tab Text Field
        new actions.ViewIdeaFields.SetViewIdeaDescriptionTabTextField().run("Field Name":/Description/.toString(),"Field Value":/Description for word count and we will be entering 20 words in this field and not more than that. Done. Extra/.toString())
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/*[@id='tiptip_content' and .='Word limit reached']/.toString(),"Should Element Exist":true,"Number of Matches":/1/.toString())
        //Verify Text in Element
        new actions.selenium.VerifyText().run("ID":/\/\/*[@id='idea-description-edit-wrapper']\/\/UL[@class='redactor-statusbar']\/LI/.toString(),"Contains Text":/20\/20 Words/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/*[@id='idea-description-edit-save-btn']/.toString())
        //Set View Idea Description Tab Text Field
        new actions.ViewIdeaFields.SetViewIdeaDescriptionTabTextField().run("Field Name":/Short Answer Question/.toString(),"Field Value":/Word limit here is 5. Extra/.toString())
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/*[@id='tiptip_content' and .='Word limit reached']/.toString(),"Should Element Exist":true,"Number of Matches":/1/.toString())
        //Verify Text in Element
        new actions.selenium.VerifyText().run("ID":/\/\/*[starts-with(@id,'question-title-holder')]\/DIV[@class='question-title' and contains(.,'Short Answer Question')]\/..\/..\/DIV[@class='question-answer-edit-wrapper']\/\/DIV[@class='word-limit-text']/.toString(),"Contains Text":/5\/5 Words/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/*[starts-with(@id,'submit-btn')]/.toString())
        //Set View Idea Description Tab Text Field
        new actions.ViewIdeaFields.SetViewIdeaDescriptionTabTextField().run("Field Name":/Long Answer Question/.toString(),"Field Value":/Word limit here is 11 words and we can't enter more'. Extra/.toString())
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/*[@id='tiptip_content' and .='Word limit reached']/.toString(),"Should Element Exist":true,"Number of Matches":/1/.toString())
        //Verify Text in Element
        new actions.selenium.VerifyText().run("ID":/\/\/*[starts-with(@id,'question-title-holder')]\/DIV[@class='question-title' and contains(.,'Long Answer Question')]\/..\/..\/DIV[@class='question-answer-edit-wrapper']\/\/UL[@class='redactor-statusbar']\/LI/.toString(),"Contains Text":/11\/11 Words/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/*[starts-with(@id,'question-title-holder')]\/DIV[@class='question-title' and contains(.,'Long Answer Question')]\/..\/..\/DIV[@class='question-answer-edit-wrapper']\/\/DIV[@class='question-answer-edit-buttons-container']\/\/DIV[starts-with(@id,'submit-btn')]/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Verify Idea in View Idea page
        new actions.ViewIdea.VerifyIdeainViewIdeapage().run("Idea Name":/New Idea/.toString(),"Description":/Description for word count and we will be entering 20 words in this field and not more than that. Done.xtra/.toString(),"Linked Submissions":[])
        //Verify View Idea Description Tab Field Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldValue().run("Field Name":/Long Answer Question/.toString(),"Field Value":/Word limit here is 11 words and we can't enter more'.xtra/.toString())
        //Verify View Idea Description Tab Field Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldValue().run("Field Name":/Short Answer Question/.toString(),"Field Value":/Word limit here is 5./.toString())
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
    //Disable Apps V3
    public static def Action67d84bbf3e876c6a0e91b2a2(def params){
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for BIOnly Beta tab
        new actions.SetupBI.SetEnterpriseSetupforBIOnlyBetatab().run("Activate Apps V3":false,"Apps v3 Pre-launch Enhancements":false)

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