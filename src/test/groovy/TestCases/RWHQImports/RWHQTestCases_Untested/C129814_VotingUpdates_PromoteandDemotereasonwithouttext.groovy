import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C129814 - Voting Updates - Promote and Demote reason without text
class C129814_VotingUpdates_PromoteandDemotereasonwithouttext
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
        //Delete this action after Voting UI Toggle is Enabled in Fall Release
        Action5f332530c0c25150132f3617([:])
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Voting tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforNewVotingtab().run("Enable Promote Reason":true,"Enable Demote Reason":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Set new Voting in View Idea Page
        new actions.ViewIdea.SetnewVotinginViewIdeaPage().run("Promote or Demote":/Promote/.toString())
        //Set Promote or Demote Reason in IdeaBoards and View Idea Page
        new actions.IdeaBoard.SetPromoteorDemoteReasoninIdeaBoards().run("Enter Reason":"","Action":/Promote/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Verify Idea in View Idea page
        new actions.ViewIdea.VerifyIdeainViewIdeapage().run("Idea Name":/test idea1/.toString(),"Points":/1/.toString(),"Votes":/1/.toString(),"Linked Submissions":[],"Vote Count on Voting UI":/1/.toString())
        //Verify Votes tab in View Idea page
        new actions.ViewIdea.VerifyVotestabinViewIdeapage().run("Types of Vote":/Promotes/.toString(),"User":/System Admin/.toString(),"Promote or Demote Reason":"","Number of Matches":/0/.toString())
        //Set new Voting in View Idea Page
        new actions.ViewIdea.SetnewVotinginViewIdeaPage().run("Promote or Demote":/Promote/.toString())
        //Set Promote or Demote Reason in IdeaBoards and View Idea Page
        new actions.IdeaBoard.SetPromoteorDemoteReasoninIdeaBoards().run("Enter Reason":/ /.toString(),"Action":/Promote/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Verify Idea in View Idea page
        new actions.ViewIdea.VerifyIdeainViewIdeapage().run("Idea Name":/test idea1/.toString(),"Points":/1/.toString(),"Votes":/1/.toString(),"Linked Submissions":[],"Vote Count on Voting UI":/1/.toString())
        //Verify Votes tab in View Idea page
        new actions.ViewIdea.VerifyVotestabinViewIdeapage().run("Types of Vote":/Promotes/.toString(),"User":/System Admin/.toString(),"Promote or Demote Reason":/ /.toString(),"Number of Matches":/0/.toString())
        //Set new Voting in View Idea Page
        new actions.ViewIdea.SetnewVotinginViewIdeaPage().run("Promote or Demote":/Demote/.toString())
        //Set Promote or Demote Reason in IdeaBoards and View Idea Page
        new actions.IdeaBoard.SetPromoteorDemoteReasoninIdeaBoards().run("Enter Reason":"","Action":/Demote/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Verify Idea in View Idea page
        new actions.ViewIdea.VerifyIdeainViewIdeapage().run("Idea Name":/test idea1/.toString(),"Points":/1/.toString(),"Votes":/1/.toString(),"Linked Submissions":[],"Vote Count on Voting UI":/1/.toString())
        //Verify Votes tab in View Idea page
        new actions.ViewIdea.VerifyVotestabinViewIdeapage().run("Types of Vote":/Demotes/.toString(),"User":/System Admin/.toString(),"Promote or Demote Reason":"","Number of Matches":/0/.toString())
        //Set new Voting in View Idea Page
        new actions.ViewIdea.SetnewVotinginViewIdeaPage().run("Promote or Demote":/Demote/.toString())
        //Set Promote or Demote Reason in IdeaBoards and View Idea Page
        new actions.IdeaBoard.SetPromoteorDemoteReasoninIdeaBoards().run("Enter Reason":/ /.toString(),"Action":/Demote/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Verify Idea in View Idea page
        new actions.ViewIdea.VerifyIdeainViewIdeapage().run("Idea Name":/test idea1/.toString(),"Points":/1/.toString(),"Votes":/1/.toString(),"Linked Submissions":[],"Vote Count on Voting UI":/1/.toString())
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
    //Delete this action after Voting UI Toggle is Enabled in Fall Release
    public static def Action5f332530c0c25150132f3617(def params){
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Voting tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforNewVotingtab().run("New Voting Buttons":true)

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