import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C128056 - Submission Form Builder - Add Additional Questions of All Types
class C128056_SubmissionFormBuilder_AddAdditionalQuestionsofAllTypes
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
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Sub Form Test1/.toString(),"Description":/description/.toString(),"Action":/Create/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Checkbox Question/.toString(),"Additional Question Type":/Checkbox/.toString(),"Additional Question Answers":/Answer1,Answer2,Answer3,Answer4/.toString(),"Additional Question Answers Actions":/Add,Add,Add,Add/.toString(),"Additional Question Tooltip":/I am checkbox tooltip/.toString(),"Save Form":false)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Date Question/.toString(),"Additional Question Type":/Date/.toString(),"Additional Question Tooltip":/I am date tooltip/.toString(),"Save Form":false)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Number Question/.toString(),"Additional Question Type":/Number/.toString(),"Additional Question Tooltip":/I am number tooltip/.toString(),"Save Form":false)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Multiple Choice Question/.toString(),"Additional Question Type":/Multiple Choice/.toString(),"Additional Question Answers":/Answer1,Answer2,Answer3,Answer4/.toString(),"Additional Question Answers Actions":/Add,Add,Add,Add/.toString(),"Additional Question Tooltip":/I am multichoice tooltip/.toString(),"Save Form":false)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Dropdown Question/.toString(),"Additional Question Type":/Dropdown/.toString(),"Additional Question Answers":/Answer1,Answer2,Answer3,Answer4/.toString(),"Additional Question Answers Actions":/Add,Add,Add,Add/.toString(),"Additional Question Tooltip":/I am dropdown tooltip/.toString(),"Save Form":false)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Short Answer Question/.toString(),"Additional Question Type":/Short Answer/.toString(),"Additional Question Tooltip":/I am short answer tooltip/.toString(),"Save Form":false)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Long Answer Question/.toString(),"Additional Question Type":/Long Answer/.toString(),"Additional Question Tooltip":/I am long answer tooltip/.toString(),"Save Form":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Sub Form Test1/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/test idea3/.toString(),"Description":/desc/.toString(),"Category":/New Product/.toString(),"Multiple Choice Question":/Answer4/.toString(),"Checkbox Question Name":/Answer4/.toString(),"Checkbox Check":/Answer4/.toString(),"Short Answer Question":/short answer here/.toString(),"Long Answer Question":/long answer here/.toString(),"Dropdown Question":/Answer4/.toString(),"Date Question":/01\/01\/2020/.toString(),"Number Question":/12345/.toString(),"Action":/Submit Idea/.toString())
        //Verify Idea in Idea Board page TEMP
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("Idea Name":/test idea3/.toString(),"Number of Matches":/1/.toString())
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