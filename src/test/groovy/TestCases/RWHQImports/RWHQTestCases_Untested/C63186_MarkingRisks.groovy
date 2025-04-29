package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C63186 - Marking Risks
class C63186_MarkingRisks
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
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Team Workspace Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforTeamWorkspaceTab().run("Team Workspace":true,"Business Model Tab":true,"Type of Model":/Business Model Canvas/.toString(),"Risks Tab":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Access Team Workspace
        new actions.ViewIdea.TeamWorkspace.AccessTeamWorkspace().run([:])
        //Set Risks in Riskiest Assumptions in Team Workspace
        new actions.ViewIdea.TeamWorkspace.SetRisksinRiskiestAssumptionsinTeamWorkspace().run("Set Tab (optional)":/Riskiest Assumptions/.toString(),"Add or Edit":/Add/.toString(),"Risk":/This is my new risk1/.toString(),"Related Area":/Key Partners/.toString(),"Row Number":/1/.toString())
        //Set Risks in Riskiest Assumptions in Team Workspace
        new actions.ViewIdea.TeamWorkspace.SetRisksinRiskiestAssumptionsinTeamWorkspace().run("Add or Edit":/Add/.toString(),"Risk":/This is my new risk2/.toString(),"Row Number":/2/.toString())
        //Verify Risks in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyRiskiestAssumptionsinTeamWorkspace().run("Risk":/This is my new risk1/.toString(),"Status":/Not Started/.toString(),"Related Area":/Key Partners/.toString(),"Placement Number":/1/.toString())
        //Verify Risks in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyRiskiestAssumptionsinTeamWorkspace().run("Risk":/This is my new risk2/.toString(),"Status":/Not Started/.toString(),"Placement Number":/2/.toString())
        //Set Risks in Riskiest Assumptions in Team Workspace
        new actions.ViewIdea.TeamWorkspace.SetRisksinRiskiestAssumptionsinTeamWorkspace().run("Add or Edit":/Edit/.toString(),"Status":/Validated/.toString(),"Row Number":/1/.toString())
        //Verify Risks in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyRiskiestAssumptionsinTeamWorkspace().run("Risk":/This is my new risk1/.toString(),"Status":/Validated/.toString(),"Related Area":/Key Partners/.toString(),"Placement Number":/1/.toString())
        //Verify Risks in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyRiskiestAssumptionsinTeamWorkspace().run("Risk":/This is my new risk2/.toString(),"Status":/Not Started/.toString(),"Placement Number":/2/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Access Business Impact From":/Team Workspace/.toString())
        //Verify Risks in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyRiskiestAssumptionsinTeamWorkspace().run("Verify in Which Tab (optional)":/Riskiest Assumptions/.toString(),"Risk":/This is my new risk1/.toString(),"Status":/Validated/.toString(),"Related Area":/Key Partners/.toString(),"Placement Number":/1/.toString())
        //Verify Risks in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyRiskiestAssumptionsinTeamWorkspace().run("Risk":/This is my new risk2/.toString(),"Status":/Not Started/.toString(),"Placement Number":/2/.toString())
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