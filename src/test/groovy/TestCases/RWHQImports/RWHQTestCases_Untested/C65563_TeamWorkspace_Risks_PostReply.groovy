package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C65563 - Team Workspace - Risks - Post Reply
class C65563_TeamWorkspace_Risks_PostReply
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
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Test Custom App/.toString(),"Description":/desc/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Test Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Idea1/.toString(),"Action":/Submit/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Test Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Team Workspace Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforTeamWorkspaceTab().run("Team Workspace":true,"Business Model Tab":true,"Risks Tab":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Test Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Idea1/.toString())
        //Access Team Workspace
        new actions.ViewIdea.TeamWorkspace.AccessTeamWorkspace().run([:])
        //Set Risks in Riskiest Assumptions in Team Workspace
        new actions.ViewIdea.TeamWorkspace.SetRisksinRiskiestAssumptionsinTeamWorkspace().run("Set Tab (optional)":/Riskiest Assumptions/.toString(),"Add or Edit":/Add/.toString(),"Risk":/Risk1/.toString(),"Status":/Not Started/.toString(),"Row Number":/1/.toString())
        //Set Risk Comments in Team Workspace
        new actions.ViewIdea.TeamWorkspace.SetRiskCommentsinTeamWorkspace().run("Risk to be Commented":/Risk1/.toString(),"Type of Comment":/Comment/.toString(),"Comment":/Parent Risk/.toString())
        //Set Risk Comments in Team Workspace
        new actions.ViewIdea.TeamWorkspace.SetRiskCommentsinTeamWorkspace().run("Risk to be Commented":/Risk1/.toString(),"Type of Comment":/Reply/.toString(),"Comment":/Parent Risk/.toString(),"Reply Comment":/Reply1/.toString())
        //Verify Risk Comment in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyRiskCommentinTeamWorkspace().run("Risk to be Commented":/Risk1/.toString(),"Comment":/Parent Risk/.toString(),"User":/System Admin/.toString(),"Total Replies":/1/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Risk Comment Replies in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyRiskCommentRepliesinTeamWorkspace().run("Risk to be Commented":/Risk1/.toString(),"Comment":/Parent Risk/.toString(),"Reply":/Reply1/.toString(),"User":/System Admin/.toString(),"Placement Number":/1/.toString())
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