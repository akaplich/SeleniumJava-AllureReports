import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C129539 - Voting on Card - Promote and Demote reason without text
class C129539_VotingonCard_PromoteandDemotereasonwithouttext
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
        //Delete this action when Voting on IdeaBoards Toggle is disabled
        Action5ef6819cc0c2515013bae6a3([:])
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Voting tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforNewVotingtab().run("Enable Promote Reason":true,"Enable Demote Reason":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Set Voting in Idea Boards Page
        new actions.IdeaBoard.SetVotinginIdeaBoardsPage().run("Idea to be Voted":/test idea1/.toString(),"Promote or Demote":/Promote/.toString())
        //Set Promote or Demote Reason in IdeaBoards and View Idea Page
        new actions.IdeaBoard.SetPromoteorDemoteReasoninIdeaBoards().run("Enter Reason":"","Action":/Promote/.toString())
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("View Type":/Gallery/.toString(),"Idea Name":/test idea1/.toString(),"Votes":/1/.toString(),"Vote Count on Voting UI":/1/.toString(),"Number of Matches":/1/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString(),"Votes":/1/.toString())
        //Verify Votes tab in View Idea page
        new actions.ViewIdea.VerifyVotestabinViewIdeapage().run("Types of Vote":/Promotes/.toString(),"User":/System Admin/.toString(),"Promote or Demote Reason":"","Number of Matches":/0/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Set Voting in Idea Boards Page
        new actions.IdeaBoard.SetVotinginIdeaBoardsPage().run("Idea to be Voted":/test idea1/.toString(),"Promote or Demote":/Promote/.toString())
        //Set Promote or Demote Reason in IdeaBoards and View Idea Page
        new actions.IdeaBoard.SetPromoteorDemoteReasoninIdeaBoards().run("Enter Reason":/ /.toString(),"Action":/Promote/.toString())
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("View Type":/Gallery/.toString(),"Idea Name":/test idea1/.toString(),"Votes":/1/.toString(),"Vote Count on Voting UI":/1/.toString(),"Number of Matches":/1/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString(),"Votes":/1/.toString())
        //Verify Votes tab in View Idea page
        new actions.ViewIdea.VerifyVotestabinViewIdeapage().run("Types of Vote":/Promotes/.toString(),"User":/System Admin/.toString(),"Promote or Demote Reason":/ /.toString(),"Number of Matches":/0/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Set Voting in Idea Boards Page
        new actions.IdeaBoard.SetVotinginIdeaBoardsPage().run("Idea to be Voted":/test idea1/.toString(),"Promote or Demote":/Demote/.toString())
        //Set Promote or Demote Reason in IdeaBoards and View Idea Page
        new actions.IdeaBoard.SetPromoteorDemoteReasoninIdeaBoards().run("Enter Reason":"","Action":/Demote/.toString())
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("View Type":/Gallery/.toString(),"Idea Name":/test idea1/.toString(),"Votes":/1/.toString(),"Vote Count on Voting UI":/1/.toString(),"Number of Matches":/1/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString(),"Votes":/1/.toString())
        //Verify Votes tab in View Idea page
        new actions.ViewIdea.VerifyVotestabinViewIdeapage().run("Types of Vote":/Demotes/.toString(),"User":/System Admin/.toString(),"Promote or Demote Reason":"","Number of Matches":/0/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Set Voting in Idea Boards Page
        new actions.IdeaBoard.SetVotinginIdeaBoardsPage().run("Idea to be Voted":/test idea1/.toString(),"Promote or Demote":/Demote/.toString())
        //Set Promote or Demote Reason in IdeaBoards and View Idea Page
        new actions.IdeaBoard.SetPromoteorDemoteReasoninIdeaBoards().run("Enter Reason":/ /.toString(),"Action":/Demote/.toString())
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("View Type":/Gallery/.toString(),"Idea Name":/test idea1/.toString(),"Votes":/1/.toString(),"Vote Count on Voting UI":/1/.toString(),"Number of Matches":/1/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString(),"Votes":/1/.toString())
        //Verify Votes tab in View Idea page
        new actions.ViewIdea.VerifyVotestabinViewIdeapage().run("Types of Vote":/Demotes/.toString(),"User":/System Admin/.toString(),"Promote or Demote Reason":/ /.toString(),"Number of Matches":/0/.toString())
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
    //Delete this action when Voting on IdeaBoards Toggle is disabled
    public static def Action5ef6819cc0c2515013bae6a3(def params){
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup BI Deprecated
        new actions.SetupBI.SetWebstormSetupBIDeprecated().run("New Idea Card Design":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Idea Board
        new actions.SetupIdeas.SetWebstormSetuptoIdeaBoard().run("Voting on Idea Boards":true)

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