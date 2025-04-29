import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131853 - Memo Team site after Idea Submission as all users
class C131853_MemoTeamsiteafterIdeaSubmissionasallusers
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Unlimited Brightidea Administrator License Type":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString(),"Route users to Memo Team Site":true,"Activities":true)
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/app\/apps/.toString())
        //Create Memo Webstorm
        new actions.WebstormCreation.CreateMemoWebstorm().run("Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/memo1/.toString(),"Description":/desc/.toString(),"Vanity URL":/memo1/.toString(),"General Access":/ALL/.toString(),"General Access Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/memo1/.toString(),"Area to Navigate to":/Pipeline Setup/.toString())
        //Set Roles in Pipeline Setup Page
        new actions.PipelineSetup.SetRolesinPipelineSetupPage().run("Type of Licensing Model":/Standard Licensing Model/.toString(),"Navigate to Tab":true,"Admin Field Name":/Pipeline Administrators/.toString(),"Administrators":/Pipeline Admin/.toString(),"Administrators Add or Remove":/Add/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Analysts":/analyst/.toString(),"Analysts Add or Remove":/Add/.toString(),"Click Save":true)
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/memo1\/submit/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Wait for Page to Load":true,"Title":/SA Idea1/.toString(),"Description":/desc/.toString(),"Category":/Strategic Initiative/.toString(),"Action":/Submit Idea/.toString())
        //Verify Idea in Pipeline Steps page
        new actions.PipelineStepsView.VerifyIdeainPipelineStepsViewpage().run("Idea Name":/SA Idea1/.toString(),"Step Name idea belongs to":/Backlog/.toString(),"Number of Matches":/1/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/pipelineadmin@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/memo1\/submit/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Wait for Page to Load":true,"Title":/PA Idea1/.toString(),"Description":/desc/.toString(),"Category":/Strategic Initiative/.toString(),"Action":/Submit Idea/.toString())
        //Verify Idea in Pipeline Steps page
        new actions.PipelineStepsView.VerifyIdeainPipelineStepsViewpage().run("Idea Name":/PA Idea1/.toString(),"Step Name idea belongs to":/Backlog/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Pipeline Steps page
        new actions.PipelineStepsView.VerifyIdeainPipelineStepsViewpage().run("Idea Name":/SA Idea1/.toString(),"Step Name idea belongs to":/Backlog/.toString(),"Number of Matches":/1/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/moderator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/memo1\/submit/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Wait for Page to Load":true,"Title":/Mod Idea1/.toString(),"Description":/desc/.toString(),"Category":/Strategic Initiative/.toString(),"Action":/Submit Idea/.toString())
        //Verify Idea in Pipeline Steps page
        new actions.PipelineStepsView.VerifyIdeainPipelineStepsViewpage().run("Idea Name":/PA Idea1/.toString(),"Step Name idea belongs to":/Backlog/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Pipeline Steps page
        new actions.PipelineStepsView.VerifyIdeainPipelineStepsViewpage().run("Idea Name":/SA Idea1/.toString(),"Step Name idea belongs to":/Backlog/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Pipeline Steps page
        new actions.PipelineStepsView.VerifyIdeainPipelineStepsViewpage().run("Idea Name":/Mod Idea1/.toString(),"Step Name idea belongs to":/Backlog/.toString(),"Number of Matches":/1/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/analyst@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/memo1\/submit/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Wait for Page to Load":true,"Title":/analyst Idea1/.toString(),"Description":/desc/.toString(),"Category":/Strategic Initiative/.toString(),"Action":/Submit Idea/.toString())
        //Verify Idea in Pipeline Steps page
        new actions.PipelineStepsView.VerifyIdeainPipelineStepsViewpage().run("Idea Name":/PA Idea1/.toString(),"Step Name idea belongs to":/Backlog/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Pipeline Steps page
        new actions.PipelineStepsView.VerifyIdeainPipelineStepsViewpage().run("Idea Name":/SA Idea1/.toString(),"Step Name idea belongs to":/Backlog/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Pipeline Steps page
        new actions.PipelineStepsView.VerifyIdeainPipelineStepsViewpage().run("Idea Name":/Mod Idea1/.toString(),"Step Name idea belongs to":/Backlog/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Pipeline Steps page
        new actions.PipelineStepsView.VerifyIdeainPipelineStepsViewpage().run("Idea Name":/analyst Idea1/.toString(),"Step Name idea belongs to":/Backlog/.toString(),"Number of Matches":/1/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/memo1\/submit/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Wait for Page to Load":true,"Title":/eu Idea1/.toString(),"Description":/desc/.toString(),"Category":/Strategic Initiative/.toString(),"Action":/Submit Idea/.toString())
        //Verify Idea in Pipeline Steps View for End Users
        new actions.IdeaBoard.VerifyIdeainPipelineStepsViewforEndUsers().run("Tab":/Recent/.toString(),"Idea Name":/eu Idea1/.toString(),"Step idea belongs to":/Backlog/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Pipeline Steps View for End Users
        new actions.IdeaBoard.VerifyIdeainPipelineStepsViewforEndUsers().run("Idea Name":/SA Idea1/.toString(),"Step idea belongs to":/Backlog/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Pipeline Steps View for End Users
        new actions.IdeaBoard.VerifyIdeainPipelineStepsViewforEndUsers().run("Idea Name":/PA Idea1/.toString(),"Step idea belongs to":/Backlog/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Pipeline Steps View for End Users
        new actions.IdeaBoard.VerifyIdeainPipelineStepsViewforEndUsers().run("Idea Name":/Mod Idea1/.toString(),"Step idea belongs to":/Backlog/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Pipeline Steps View for End Users
        new actions.IdeaBoard.VerifyIdeainPipelineStepsViewforEndUsers().run("Idea Name":/analyst Idea1/.toString(),"Step idea belongs to":/Backlog/.toString(),"Number of Matches":/1/.toString())
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