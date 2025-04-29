package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131073 - Word Limit - Post Idea End User
class C131073_WordLimit_PostIdeaEndUser
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
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Test App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Idea Title Question - Title":/Title/.toString(),"Idea Title Question - Value":/Word Count Test Title/.toString(),"Description Question - Title":/Description/.toString(),"Description Question - Value":/Description for word count and we will be entering 20 words in this field and not more than that. Done./.toString())
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/DIV[@id='idea-form-description']\/\/*[@id='word-limiter-region']\/*[contains(.,'20\/20 Words')]/.toString(),"Should Element Exist":true,"Number of Matches":/1/.toString())
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/DIV[@id='idea-form-description']\/\/DIV[@id='tiptip_content' and .='Word limit reached']/.toString(),"Should Element Exist":true,"Number of Matches":/1/.toString())
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Description Question - Title":/Description/.toString(),"Description Question - Value":/Description for word count and we will be entering 20 words in this field and not more than that. Done another word/.toString(),"Short Answer - Title":/Short Answer Question/.toString(),"Short Answer - Value":/Word limit here is 5/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/DIV[contains(@class,'question-section')]\/LEGEND[contains(.,'Short Answer Question')]\/..\/INPUT/.toString())
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/DIV[contains(@class,'question-section')]\/LEGEND[contains(.,'Short Answer Question')]\/..\/..\/\/DIV[@id='tiptip_content' and .='Word limit reached']/.toString(),"Should Element Exist":true,"Number of Matches":/1/.toString())
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/DIV[contains(@class,'question-section')]\/LEGEND[contains(.,'Short Answer Question')]\/..\/\/*[@id='word-limiter-region']\/*[contains(.,'5\/5 Words')]/.toString(),"Should Element Exist":true,"Number of Matches":/1/.toString())
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Short Answer - Title":/Short Answer Question/.toString(),"Short Answer - Value":/Word limit here is 5 another word/.toString(),"Long Answer - Title":/Long Answer Question/.toString(),"Long Answer - Value":/Word limit here is 11 words and we can't enter more/.toString())
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/DIV[contains(@class,'question-section')]\/LEGEND[contains(.,'Long Answer Question')]\/..\/\/DIV[@id='tiptip_content' and .='Word limit reached']/.toString(),"Should Element Exist":true,"Number of Matches":/1/.toString())
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/DIV[contains(@class,'question-section')]\/LEGEND[contains(.,'Long Answer Question')]\/..\/\/*[@id='word-limiter-region']\/*[contains(.,'11\/11 Words')]/.toString(),"Should Element Exist":true,"Number of Matches":/1/.toString())
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Idea Title Question - Title":/Title/.toString(),"Idea Title Question - Value":/New Idea/.toString(),"Category Question - Title":/Category/.toString(),"Category Question - Value":/New Product/.toString(),"Long Answer - Title":/Long Answer Question/.toString(),"Long Answer - Value":/Word limit here is 11 words and we can't enter more another word/.toString(),"Action":/Submit Idea/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/New Idea/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/another word/.toString(),"Should Exist":false)
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