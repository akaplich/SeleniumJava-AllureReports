import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C129102 - Required Dependent - Checkbox, Date, Multi Choice
class C129102_RequiredDependent_Checkbox_Date_MultiChoice
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
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Parent Checkbox/.toString(),"Additional Question Type":/Checkbox/.toString(),"Additional Question Answers":/Answer 1,Answer 2,Answer 3,Check 1,Check 2,Check 3/.toString(),"Additional Question Answers Actions":/Remove,Remove,Remove,Add,Add,Add/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Checkbox Child/.toString(),"Additional Question Type":/Checkbox/.toString(),"Additional Question Answers":/Answer 1,Answer 2,Answer 3,Checkchild 1,Checkchild 2,Checkchild 3/.toString(),"Additional Question Answers Actions":/Remove,Remove,Remove,Add,Add,Add/.toString())
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Checkbox Child/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Body":/Instructions for checkbox child/.toString(),"Set Dependent Answer":true,"Set Dependent Answer Dropdown":/Check 1/.toString(),"Required":true)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Date Child/.toString(),"Additional Question Type":/Date/.toString())
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Date Child/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Body":/Instructions for date child/.toString(),"Set Dependent Answer":true,"Set Dependent Answer Dropdown":/Check 2/.toString(),"Required":true)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Multichoice Child/.toString(),"Additional Question Type":/Multiple Choice/.toString(),"Additional Question Answers":/Answer 1,Answer 2,Answer 3,Multichild 1,Multichild 2,Multichild 3/.toString(),"Additional Question Answers Actions":/Remove,Remove,Remove,Add,Add,Add/.toString())
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Multichoice Child/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Body":/Instructions for multichoice child/.toString(),"Set Dependent Answer":true,"Set Dependent Answer Dropdown":/Check 3/.toString(),"Required":true,"Save Form":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Test App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Checkbox Question - Title":/Parent Checkbox/.toString(),"Checkbox Question - Value":/Check 1/.toString(),"Checkbox Check":/TRUE/.toString())
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Checkbox Question - Title":/Checkbox Child/.toString(),"Checkbox Question - Value":/Checkchild 1/.toString(),"Checkbox Check":/TRUE/.toString())
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Checkbox Question - Title":/Parent Checkbox/.toString(),"Checkbox Question - Value":/Check 2/.toString(),"Checkbox Check":/TRUE/.toString(),"Date Question - Title":/Date Child/.toString(),"Date Question - Value":/01\/01\/2021/.toString())
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Checkbox Question - Title":/Parent Checkbox/.toString(),"Checkbox Question - Value":/Check 3/.toString(),"Checkbox Check":/TRUE/.toString(),"Multiple Choice - Title":/Multichoice Child/.toString(),"Multiple Choice - Value":/Multichild 1/.toString())
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