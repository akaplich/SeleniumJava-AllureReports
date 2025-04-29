import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C129136 - Required Dependent - Number, Dropdown, Long Text
class C129136_RequiredDependent_Number_Dropdown_LongText
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
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Parent Dropdown/.toString(),"Additional Question Type":/Dropdown/.toString(),"Additional Question Answers":/Answer 1,Answer 2,Answer 3,Drop 1,Drop 2,Drop 3/.toString(),"Additional Question Answers Actions":/Remove,Remove,Remove,Add,Add,Add/.toString(),"Save Form":true)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Number Child/.toString(),"Additional Question Type":/Number/.toString())
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Number Child/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Body":/Instructions for Number Child/.toString(),"Set Dependent Answer":true,"Set Dependent Answer Dropdown":/Drop 1/.toString(),"Required":true,"Save Form":true)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Dropdown Child/.toString(),"Additional Question Type":/Dropdown/.toString(),"Additional Question Answers":/Answer 1,Answer 2,Answer 3,Dropchild 1,Dropchild 2,Dropchild 3/.toString(),"Additional Question Answers Actions":/Remove,Remove,Remove,Add,Add,Add/.toString())
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Dropdown Child/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Body":/Instructions for Dropdown Child/.toString(),"Set Dependent Answer":true,"Set Dependent Answer Dropdown":/Drop 2/.toString(),"Required":true,"Save Form":true)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Long Text Child/.toString(),"Additional Question Type":/Long Answer/.toString())
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Long Text Child/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Body":/Instructions for Long Text Child/.toString(),"Set Dependent Answer":true,"Set Dependent Answer Dropdown":/Drop 3/.toString(),"Required":true,"Save Form":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Test App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Idea Title Question - Title":/Title/.toString(),"Idea Title Question - Value":/test idea/.toString(),"Category Question - Title":/Category/.toString(),"Category Question - Value":/Operations/.toString(),"Dropdown Question - Title":/Parent Dropdown/.toString(),"Dropdown Question - Value":/Drop 1/.toString())
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Number Question - Title":/Number Child/.toString(),"Number Question - Value":/23/.toString())
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Dropdown Question - Title":/Parent Dropdown/.toString(),"Dropdown Question - Value":/Drop 2/.toString())
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Dropdown Question - Title":/Dropdown Child/.toString(),"Dropdown Question - Value":/Dropchild 2/.toString())
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Dropdown Question - Title":/Parent Dropdown/.toString(),"Dropdown Question - Value":/Drop 3/.toString(),"Long Answer - Title":/Long Text Child/.toString(),"Long Answer - Value":/test/.toString())
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