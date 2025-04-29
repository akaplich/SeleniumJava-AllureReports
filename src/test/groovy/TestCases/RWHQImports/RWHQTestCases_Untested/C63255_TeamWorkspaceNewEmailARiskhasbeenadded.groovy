import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C63255 - Team Workspace New Email A Risk has been added
class C63255_TeamWorkspaceNewEmailARiskhasbeenadded
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
        //Create Mailinator User
        new actions.Mailinator.CreateMailinatorUser().run("Email":/brightC63255test3/.toString(),"Enterprise System Administrator":false,"Finally Login as What User":/bi.adminuser1@brightidea.com/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Team Workspace Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforTeamWorkspaceTab().run("Team Workspace":true,"Risks Tab":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Access Team Workspace
        new actions.ViewIdea.TeamWorkspace.AccessTeamWorkspace().run([:])
        //Set Workspace Team
        new actions.ViewIdea.TeamWorkspace.SetWorkspaceTeam().run("User":/Auto/.toString(),"Add or Remove or Set Leader":/Add/.toString(),"Action":/Update/.toString())
        //Verify Email
        new actions.Mailinator.VerifyEmail().run("Email Address":/brightC63255test3/.toString(),"Subject":/You have been invited to collaborate on test idea1/.toString())
        //Set Risks in Riskiest Assumptions in Team Workspace
        new actions.ViewIdea.TeamWorkspace.SetRisksinRiskiestAssumptionsinTeamWorkspace().run("Set Tab (optional)":/Riskiest Assumptions/.toString(),"Add or Edit":/Add/.toString(),"Risk":/This is my new risk1/.toString(),"Row Number":/1/.toString())
        //Verify Risks in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyRiskiestAssumptionsinTeamWorkspace().run("Risk":/This is my new risk1/.toString(),"Placement Number":/1/.toString())
        //Verify Email
        new actions.Mailinator.VerifyEmail().run("Email Address":/brightC63255test3/.toString(),"Subject":/System Admin added a new Risk to test idea1/.toString())
        //Set Risks in Riskiest Assumptions in Team Workspace
        new actions.ViewIdea.TeamWorkspace.SetRisksinRiskiestAssumptionsinTeamWorkspace().run("Add or Edit":/Add/.toString(),"Risk":/This is my new risk2/.toString(),"Row Number":/2/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Get Link from Team Workspace Email
        variables."link" = new actions.Mailinator.GetLinkfromTeamWorkspaceEmail().run("Email Address":/brightC63255test3/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        //Login
        new actions.general.Login().run("Webstorm Login":true,"Email":/brightC63255test3@mailinator.com/.toString(),"Password":/brightidea1/.toString())
        //Verify Risks in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyRiskiestAssumptionsinTeamWorkspace().run("Risk":/This is my new risk1/.toString(),"Status":/Not Started/.toString(),"Placement Number":/1/.toString())
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