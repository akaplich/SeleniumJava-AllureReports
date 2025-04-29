import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C129108 - Required Dependent - Update Required Parent
class C129108_RequiredDependent_UpdateRequiredParent
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
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Parent1/.toString(),"Additional Question Type":/Multiple Choice/.toString(),"Additional Question Answers":/Answer 1,Answer 2,Answer 3,Parent1-1,Parent1-2,Parent1-3/.toString(),"Additional Question Answers Actions":/Remove,Remove,Remove,Add,Add,Add/.toString(),"Save Form":true)
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Parent1/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Required":true,"Save Form":true)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Child1/.toString(),"Additional Question Type":/Dropdown/.toString(),"Additional Question Answers":/Answer 1,Answer 2,Answer 3,Child1-1,Child1-2,Child1-3/.toString(),"Additional Question Answers Actions":/Remove,Remove,Remove,Add,Add,Add/.toString(),"Save Form":true)
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Child1/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Set Dependent Answer":true,"Set Dependent Answer Dropdown":/Parent1-3/.toString(),"Required":true,"Save Form":true)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Child2/.toString(),"Additional Question Type":/Long Answer/.toString())
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Child2/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Set Dependent Answer":true,"Set Dependent Answer Dropdown":/Child1-3/.toString(),"Required":true,"Save Form":true)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Child3/.toString(),"Additional Question Type":/Short Answer/.toString())
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Child3/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Set Dependent Answer":true,"Set Dependent Answer Dropdown":/Parent1-1/.toString(),"Required":true,"Save Form":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Test App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Idea Title Question - Title":/Title/.toString(),"Idea Title Question - Value":/test idea/.toString(),"Description Question - Title":/Description/.toString(),"Description Question - Value":/desc/.toString(),"Category Question - Title":/Category/.toString(),"Category Question - Value":/Operations/.toString(),"Multiple Choice - Title":/Parent1/.toString(),"Multiple Choice - Value":/Parent1-1/.toString(),"Short Answer - Title":/Child3/.toString(),"Short Answer - Value":/test Child3/.toString(),"Action":/Submit Idea/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea/.toString())
        //Verify View Idea Description Tab Field Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldValue().run("Field Name":/Child3/.toString(),"Field Value":/test Child3/.toString())
        //Set View Idea Description Tab Radiobutton
        new actions.ViewIdeaFields.SetViewIdeaDescriptionTabRadiobutton().run("Field Name":/Parent1/.toString(),"Field Value":/Parent1-3/.toString(),"Action":/Save/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Child3/.toString(),"Should Exist":false)
        //Set View Idea Description Tab Dropdown
        new actions.ViewIdeaFields.SetViewIdeaDescriptionTabDropdown().run("Field Name":/Child1/.toString(),"Field Value":/Child1-3/.toString(),"Action":/Save/.toString())
        //Set View Idea Description Tab Text Field
        new actions.ViewIdeaFields.SetViewIdeaDescriptionTabTextField().run("Field Name":/Child2/.toString(),"Field Value":/test Child2/.toString(),"Action":/Save/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Test App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea/.toString())
        //Verify View Idea Description Tab Field Multi Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldMultiValue().run("Field Name":/Child1/.toString(),"Field Value":/Child1-3/.toString())
        //Verify View Idea Description Tab Field Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldValue().run("Field Name":/Child2/.toString(),"Field Value":/test Child2/.toString())
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