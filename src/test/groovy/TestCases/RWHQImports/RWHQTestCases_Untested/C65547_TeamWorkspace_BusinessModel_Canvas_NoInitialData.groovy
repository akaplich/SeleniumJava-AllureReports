import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C65547 - Team Workspace - Business Model - Canvas - No Initial Data
class C65547_TeamWorkspace_BusinessModel_Canvas_NoInitialData
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
        new actions.SetupIdeas.SetWebstormSetupIdeasforTeamWorkspaceTab().run("Team Workspace":true,"Business Model Tab":true,"Type of Model":/Business Model Canvas/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Access Team Workspace
        new actions.ViewIdea.TeamWorkspace.AccessTeamWorkspace().run([:])
        //Verify Business Model Canvas in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyBusinessModelCanvasinTeamWorkspace().run("Value Proposition":/What value do we deliver to the customer? Which one of our customers' problems are we helping to solve? What bundles of products and services are we offering to each segment? Which customer needs are we satisfying? What is the minimum viable product?/.toString(),"Customer Segment(s)":/For whom are we creating value? Who are our most important customers? What are the customer archetypes?/.toString(),"Channels":/Through which channels do our customer segments want to be reached? How do other companies reach them now? Which ones work best? Which ones are most cost-efficient? How are we integrating them with customer routines?/.toString(),"Customer Relationships":/How do we get, keep, and grow customers? Which customer relationships have we established? How are they integrated with the rest of our business model? How costly are they?/.toString(),"Revenue Streams":/For what value are our customers really willing to pay? For what do they currently pay? What is the revenue model? What are the pricing tactics?/.toString(),"Key Partners":/Who are our key partners? Who are our key suppliers? Which key resources are we acquiring from our partners? Which key activities do partners perform?/.toString(),"Key Activities":/What key activities do our value propositions require? Our distribution channels? Customer relationships? Revenue streams?/.toString(),"Key Resources":/What key resources do our value propositions require? Our distribution channels? Customer relationships? Revenue streams?/.toString(),"Cost Structure":/What are the most important costs inherent to our business model? Which key resources are most expensive? Which key activities are most expensive?/.toString())
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