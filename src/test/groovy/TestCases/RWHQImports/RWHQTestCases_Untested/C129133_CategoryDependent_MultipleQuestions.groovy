package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C129133 - Category Dependent - Multiple Questions
class C129133_CategoryDependent_MultipleQuestions
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
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for BIOnly Beta tab
        new actions.SetupBI.SetEnterpriseSetupforBIOnlyBetatab().run("User Selection field":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Test App/.toString(),"Description":/desc/.toString(),"Action":/Create/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Dependent Date/.toString(),"Additional Question Type":/Date/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Dependent Multiple Choice/.toString(),"Additional Question Type":/Multiple Choice/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Dependent Short Text/.toString(),"Additional Question Type":/Short Answer/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Dependent User Selection/.toString(),"Additional Question Type":/User Selection/.toString(),"Save Form":true)
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Dependent Date/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Body":/Instructions/.toString(),"Set Dependent Answer":true,"Set Dependent Answer Dropdown":/Category: Operations/.toString())
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Dependent Multiple Choice/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Body":/Instructions/.toString(),"Set Dependent Answer":true,"Set Dependent Answer Dropdown":/Category: Operations/.toString())
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Dependent Short Text/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Body":/Instructions/.toString(),"Set Dependent Answer":true,"Set Dependent Answer Dropdown":/Category: Operations/.toString(),"Required":true)
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Dependent User Selection/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Body":/Instructions/.toString(),"Set Dependent Answer":true,"Set Dependent Answer Dropdown":/Category: Operations/.toString(),"Save Form":true)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Dependent Number/.toString(),"Additional Question Type":/Number/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Dependent Dropdown/.toString(),"Additional Question Type":/Dropdown/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Dependent Long Text/.toString(),"Additional Question Type":/Long Answer/.toString(),"Save Form":true)
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Dependent Number/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Body":/Instructions2/.toString(),"Set Dependent Answer":true,"Set Dependent Answer Dropdown":/Category: Strategy/.toString())
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Dependent Dropdown/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Body":/Instructions3/.toString(),"Set Dependent Answer":true,"Set Dependent Answer Dropdown":/Category: Strategy/.toString())
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Dependent Long Text/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Body":/Instructions4/.toString(),"Set Dependent Answer":true,"Set Dependent Answer Dropdown":/Category: Strategy/.toString(),"Required":true,"Save Form":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Test App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Idea Title Question - Title":/Title/.toString(),"Idea Title Question - Value":/test idea Operations/.toString(),"Description Question - Title":/Description/.toString(),"Description Question - Value":/desc/.toString(),"Category Question - Title":/Category/.toString(),"Category Question - Value":/Operations/.toString(),"Date Question - Title":/Dependent Date/.toString(),"Date Question - Value":/01\/01\/2021/.toString(),"Multiple Choice - Title":/Dependent Multiple Choice/.toString(),"Multiple Choice - Value":/Answer 2/.toString(),"User Selection - Title":/Dependent User Selection/.toString(),"User Selection - Value":/End User 2/.toString(),"User Selection Question Add or Remove":/Add/.toString(),"Action":/Submit Idea/.toString())
        //Verify Error Field in Post Idea page
        new actions.PostIdea.VerifyErrorFieldinPostIdeapage().run("Field Name":/Dependent Short Text/.toString(),"Should Error Exist":true)
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Short Answer - Title":/Dependent Short Text/.toString(),"Short Answer - Value":/short test/.toString(),"Action":/Submit Idea/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea Operations/.toString())
        //Verify View Idea Description Tab Field Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldValue().run("Field Name":/Dependent Date/.toString(),"Field Value":/01\/01\/2021/.toString())
        //Verify View Idea Description Tab Field Multi Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldMultiValue().run("Field Name":/Dependent Multiple Choice/.toString(),"Field Value":/Answer 2/.toString())
        //Verify View Idea Description Tab Field Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldValue().run("Field Name":/Dependent Short Text/.toString(),"Field Value":/short test/.toString())
        //Verify View Idea Description Tab Field Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldValue().run("Field Name":/Dependent User Selection/.toString(),"Field Value":/End User 2/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Test App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        try{
            //Set Post Idea Fields
            new actions.PostIdea.SetPostIdeaFields().run("Idea Title Question - Title":/Title/.toString(),"Idea Title Question - Value":/test idea Strategy/.toString(),"Description Question - Title":/Description/.toString(),"Description Question - Value":/desc/.toString(),"Category Question - Title":/Category/.toString(),"Category Question - Value":/Strategy/.toString(),"Number Question - Title":/Dependent Number/.toString(),"Number Question - Value":/123.456/.toString(),"Dropdown Question - Title":/Dependent Dropdown/.toString(),"Dropdown Question - Value":/Answer 2/.toString(),"Action":/Submit Idea/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Error Field in Post Idea page
        new actions.PostIdea.VerifyErrorFieldinPostIdeapage().run("Field Name":/Dependent Long Text/.toString(),"Should Error Exist":true)
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Long Answer - Title":/Dependent Long Text/.toString(),"Long Answer - Value":/long test/.toString(),"Action":/Submit Idea/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea Strategy/.toString())
        //Verify View Idea Description Tab Field Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldValue().run("Field Name":/Dependent Number/.toString(),"Field Value":/123.456/.toString())
        //Verify View Idea Description Tab Field Multi Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldMultiValue().run("Field Name":/Dependent Dropdown/.toString(),"Field Value":/Answer 2/.toString())
        //Verify View Idea Description Tab Field Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldValue().run("Field Name":/Dependent Long Text/.toString(),"Field Value":/long test/.toString())
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