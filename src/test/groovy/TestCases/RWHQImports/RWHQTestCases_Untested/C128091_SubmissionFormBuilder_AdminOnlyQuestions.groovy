import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C128091 - Submission Form Builder - Admin Only Questions
class C128091_SubmissionFormBuilder_AdminOnlyQuestions
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
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for BIOnly Beta tab
        new actions.SetupBI.SetEnterpriseSetupforBIOnlyBetatab().run("User Selection field":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Test App/.toString(),"Description":/desc/.toString(),"Action":/Create/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("WebStorm Name":/Test App/.toString(),"Area to Navigate to":/Site Setup/.toString())
        //Set Webstorm Setup for Beta Beta tab
        new actions.SetupBeta.SetWebstormSetupforBetaBetatab().run("Enable Administrator Permission option in Submission Questions":true)
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("WebStorm Name":/Test App/.toString(),"Area to Navigate to":/Site Setup/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Admin Checkbox/.toString(),"Additional Question Type":/Checkbox/.toString(),"Administrator Only":true)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Admin Multi/.toString(),"Additional Question Type":/Multiple Choice/.toString(),"Administrator Only":true)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Admin Dropdown/.toString(),"Additional Question Type":/Dropdown/.toString(),"Administrator Only":true)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Admin Date/.toString(),"Additional Question Type":/Date/.toString(),"Administrator Only":true)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Admin Number/.toString(),"Additional Question Type":/Number/.toString(),"Administrator Only":true)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Admin Long Text/.toString(),"Additional Question Type":/Long Answer/.toString(),"Administrator Only":true)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Admin Short Text/.toString(),"Additional Question Type":/Short Answer/.toString(),"Administrator Only":true)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Admin User Selection/.toString(),"Additional Question Type":/User Selection/.toString(),"Administrator Only":true,"Save Form":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Test App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Idea Title Question - Title":/Title/.toString(),"Idea Title Question - Value":/test idea3/.toString(),"Description Question - Title":/Description/.toString(),"Description Question - Value":/desc/.toString(),"Category Question - Title":/Category/.toString(),"Category Question - Value":/New Product/.toString(),"Checkbox Question - Title":/Admin Checkbox/.toString(),"Checkbox Question - Value":/Answer 1/.toString(),"Checkbox Check":/TRUE/.toString(),"Date Question - Title":/Admin Date/.toString(),"Date Question - Value":/01\/01\/2020/.toString(),"Number Question - Title":/Admin Number/.toString(),"Number Question - Value":/123/.toString(),"Multiple Choice - Title":/Admin Multi/.toString(),"Multiple Choice - Value":/Answer 2/.toString(),"Dropdown Question - Title":/Admin Dropdown/.toString(),"Dropdown Question - Value":/Answer 2/.toString(),"Short Answer - Title":/Admin Short Text/.toString(),"Short Answer - Value":/test short/.toString(),"Long Answer - Title":/Admin Long Text/.toString(),"Long Answer - Value":/test long/.toString(),"User Selection - Title":/Admin User Selection/.toString(),"User Selection - Value":/Moderator/.toString(),"User Selection Question Add or Remove":/Add/.toString(),"Action":/Submit Idea/.toString())
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("Idea Name":/test idea3/.toString(),"Number of Matches":/1/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Test App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Admin/.toString(),"Should Exist":false)
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/test idea4/.toString(),"Description":/desc/.toString(),"Category":/New Product/.toString(),"Action":/Submit Idea/.toString())
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("Idea Name":/test idea4/.toString(),"Number of Matches":/1/.toString())
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