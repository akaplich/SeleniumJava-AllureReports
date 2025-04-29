package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C65574 - Team Workspace - Risks - Edit Comment
class C65574_TeamWorkspace_Risks_EditComment
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
        new actions.SetupIdeas.SetWebstormSetupIdeasforTeamWorkspaceTab().run("Team Workspace":true,"Risks Tab":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Test Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Idea1/.toString())
        //Access Team Workspace
        new actions.ViewIdea.TeamWorkspace.AccessTeamWorkspace().run([:])
        //Set Risks in Riskiest Assumptions in Team Workspace
        new actions.ViewIdea.TeamWorkspace.SetRisksinRiskiestAssumptionsinTeamWorkspace().run("Set Tab (optional)":/Riskiest Assumptions/.toString(),"Add or Edit":/Add/.toString(),"Risk":/First Risk/.toString(),"Status":/Not Started/.toString(),"Row Number":/1/.toString())
        //Set Risk Comments in Team Workspace
        new actions.ViewIdea.TeamWorkspace.SetRiskCommentsinTeamWorkspace().run("Risk to be Commented":/First Risk/.toString(),"Type of Comment":/Comment/.toString(),"Comment":/First Comment on First Risk/.toString())
        //Edit or Delete Risk Comments in Team Workspace
        new actions.ViewIdea.TeamWorkspace.EditorDeleteRiskCommentsinTeamWorkspace().run("Risk":/First Risk/.toString(),"Edit or Delete":/Edit/.toString(),"Comment or reply to be modified":/First Comment on First Risk/.toString(),"New comment or reply":/First Comment on First Risk Edited/.toString(),"Action":/EditCancel/.toString())
        //Verify Risk Comment in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyRiskCommentinTeamWorkspace().run("Risk to be Commented":/First Risk/.toString(),"Comment":/First Comment on First Risk/.toString(),"User":/System Admin/.toString(),"Total Replies":/0/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Edit or Delete Risk Comments in Team Workspace
        new actions.ViewIdea.TeamWorkspace.EditorDeleteRiskCommentsinTeamWorkspace().run("Risk":/First Risk/.toString(),"Edit or Delete":/Edit/.toString(),"Comment or reply to be modified":/First Comment on First Risk/.toString(),"New comment or reply":/First Comment on First Risk Edited/.toString(),"Action":/Save/.toString())
        //Verify Risk Comment in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyRiskCommentinTeamWorkspace().run("Risk to be Commented":/First Risk/.toString(),"Comment":/First Comment on First Risk Edited/.toString(),"User":/System Admin/.toString(),"Total Replies":/0/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
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