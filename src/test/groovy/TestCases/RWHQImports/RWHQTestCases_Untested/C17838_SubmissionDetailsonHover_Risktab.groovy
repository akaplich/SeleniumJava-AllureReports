package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C17838  -Submission Details on Hover - Risk tab
class C17838_SubmissionDetailsonHover_Risktab
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
        new actions.SetupIdeas.SetWebstormSetupIdeasforTeamWorkspaceTab().run("Team Workspace":true,"Milestones Tab":true,"Risks Tab":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Add or Update":/Add/.toString(),"Access Business Impact From":/View Idea/.toString())
        //Set Date Version and Notes for Financial Summary in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetDateandNotesforFinancialSummaryinBusinessImpacttab().run("Date":/12\/12\/2019/.toString())
        //Set Costs in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetCostsinBusinessImpacttab().run("Add or Edit Costs":/Add/.toString(),"Year":/2019/.toString(),"Current Year":/2019/.toString(),"Cost Title":/Cost test idea1/.toString(),"Projected Cost":/84271/.toString(),"Actual Cost":/43244/.toString(),"Row Number":/1/.toString())
        //Set Benefits in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetBenefitsinBusinessImpacttab().run("Add or Edit Benefits":/Add/.toString(),"Year":/2019/.toString(),"Current Year":/2019/.toString(),"Benefit Type":/Cost Avoidance/.toString(),"Projected Benefit":/10000/.toString(),"Actual Benefit":/9500/.toString(),"Row Number of the Benefit":/1/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Action":/Save Version/.toString())
        //Access Team Workspace
        new actions.ViewIdea.TeamWorkspace.AccessTeamWorkspace().run([:])
        //Set Risks in Riskiest Assumptions in Team Workspace
        new actions.ViewIdea.TeamWorkspace.SetRisksinRiskiestAssumptionsinTeamWorkspace().run("Set Tab (optional)":/Riskiest Assumptions/.toString(),"Add or Edit":/Add/.toString(),"Risk":/Risk1/.toString(),"Status":/In Progress/.toString(),"Row Number":/1/.toString())
        //Set Risks in Riskiest Assumptions in Team Workspace
        new actions.ViewIdea.TeamWorkspace.SetRisksinRiskiestAssumptionsinTeamWorkspace().run("Add or Edit":/Add/.toString(),"Risk":/Risk2/.toString(),"Status":/In Progress/.toString(),"Row Number":/2/.toString())
        //Set Risks in Riskiest Assumptions in Team Workspace
        new actions.ViewIdea.TeamWorkspace.SetRisksinRiskiestAssumptionsinTeamWorkspace().run("Add or Edit":/Add/.toString(),"Risk":/Risk3/.toString(),"Status":/Not Started/.toString(),"Row Number":/3/.toString())
        //Set Risks in Riskiest Assumptions in Team Workspace
        new actions.ViewIdea.TeamWorkspace.SetRisksinRiskiestAssumptionsinTeamWorkspace().run("Add or Edit":/Add/.toString(),"Risk":/Risk4/.toString(),"Status":/Not Started/.toString(),"Row Number":/4/.toString())
        //Set Risks in Riskiest Assumptions in Team Workspace
        new actions.ViewIdea.TeamWorkspace.SetRisksinRiskiestAssumptionsinTeamWorkspace().run("Add or Edit":/Add/.toString(),"Risk":/Risk5/.toString(),"Status":/Not Started/.toString(),"Row Number":/5/.toString())
        //Set Risks in Riskiest Assumptions in Team Workspace
        new actions.ViewIdea.TeamWorkspace.SetRisksinRiskiestAssumptionsinTeamWorkspace().run("Add or Edit":/Add/.toString(),"Risk":/Risk6/.toString(),"Status":/Not Started/.toString(),"Row Number":/6/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Dashboard/.toString())
        //Navigate To Pipeline DashBoard Tab
        new actions.PipelineDashBoard.NavigateToPipelineDashBoardTab().run("Tab":/Business Impact Tab/.toString())
        //Navigate To The Tab In Submission Hover in Business Impact Tab
        new actions.PipelineDashBoard.NavigateToTheTabInSubmissionHover().run("Idea":/test idea1/.toString(),"Tab":/Risky Assumptions/.toString())
        //Verify and Access Risks on the Submission Hover in Business Impact Tab 
        new actions.PipelineDashBoard.VerifyRisksontheSubmissionHoverinBusinessImpactTab().run("Unresolved Risk":/Risk1/.toString(),"Row Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify and Access Risks on the Submission Hover in Business Impact Tab 
        new actions.PipelineDashBoard.VerifyRisksontheSubmissionHoverinBusinessImpactTab().run("Unresolved Risk":/Risk2/.toString(),"Row Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify and Access Risks on the Submission Hover in Business Impact Tab 
        new actions.PipelineDashBoard.VerifyRisksontheSubmissionHoverinBusinessImpactTab().run("Unresolved Risk":/Risk3/.toString(),"Row Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify and Access Risks on the Submission Hover in Business Impact Tab 
        new actions.PipelineDashBoard.VerifyRisksontheSubmissionHoverinBusinessImpactTab().run("Unresolved Risk":/Risk4/.toString(),"Row Number":/4/.toString(),"Number of Matches":/1/.toString())
        //Verify and Access Risks on the Submission Hover in Business Impact Tab 
        new actions.PipelineDashBoard.VerifyRisksontheSubmissionHoverinBusinessImpactTab().run("Unresolved Risk":/Risk5/.toString(),"Row Number":/5/.toString(),"Number of Matches":/1/.toString())
        //Verify and Access Risks on the Submission Hover in Business Impact Tab 
        new actions.PipelineDashBoard.VerifyRisksontheSubmissionHoverinBusinessImpactTab().run("Unresolved Risk":/Risk6/.toString(),"Number of Matches":/0/.toString())
        //Verify and Access Risks on the Submission Hover in Business Impact Tab 
        new actions.PipelineDashBoard.VerifyRisksontheSubmissionHoverinBusinessImpactTab().run("View All Risks":true)
        //Verify Risks in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyRiskiestAssumptionsinTeamWorkspace().run("Risk":/Risk1/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Risks in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyRiskiestAssumptionsinTeamWorkspace().run("Risk":/Risk2/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Risks in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyRiskiestAssumptionsinTeamWorkspace().run("Risk":/Risk3/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Risks in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyRiskiestAssumptionsinTeamWorkspace().run("Risk":/Risk4/.toString(),"Placement Number":/4/.toString(),"Number of Matches":/1/.toString())
        //Verify Risks in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyRiskiestAssumptionsinTeamWorkspace().run("Risk":/Risk5/.toString(),"Placement Number":/5/.toString(),"Number of Matches":/1/.toString())
        //Verify Risks in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyRiskiestAssumptionsinTeamWorkspace().run("Risk":/Risk6/.toString(),"Placement Number":/6/.toString(),"Number of Matches":/1/.toString())
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