package TestCases.RWHQImports.SmokeTests

import BaseClasses.TestBase
import actions.API.Utils.CopyAffiliate
import actions.API.Utils.DeleteAffiliate
import actions.IdeaBoard.AccessIdeainIdeaBoardpage30
import actions.IdeaBoard.VerifyIdeainIdeaBoardpage30
import actions.PostIdea.SetCustomAppPostIdea
import actions.Utils.SettoLabEnvironment
import actions.ViewIdea.VerifyIdeainViewIdeapage
import actions.general.Login
import actions.general.NavigateWebStormAdminBar
import actions.general.Wait
import actions.selenium.Browser
import actions.selenium.CloseWindow
import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C44 - Submit new valid Idea with all Required fields
class TC_C44_SubmitNewValidIdeaWithAllRequiredFields  extends TestBase {
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
        Action58123c20fa4ee77809f468f6(variables)
        //Navigate WebStorm or MTS
        new NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new SetCustomAppPostIdea().run("Title":/Idea Title/.toString(),"Description":/Idea Description/.toString(),"Category":/New Product/.toString(),"Required Short Question":/required short/.toString(),"Action":/Submit Idea/.toString())
        //Wait
        new Wait().run("Seconds":/10/.toString())
        //Verify Idea in Idea Board page
        new VerifyIdeainIdeaBoardpage30().run("Idea Name":/Idea Title/.toString(),"Image":true,"Status":/Submitted/.toString(),"Username":/System Admin/.toString(),"Description":/Idea Description/.toString(),"Votes":/1/.toString(),"Comments":/0/.toString(),"Number of Matches":/1/.toString())
        //Access Idea in Idea Board page
        new AccessIdeainIdeaBoardpage30().run("Idea Name":/Idea Title/.toString())
        //Verify Idea in View Idea page
        new VerifyIdeainViewIdeapage().run("Idea Name":/Idea Title/.toString(),"Idea Image":true,"Creator username":/System Admin/.toString(),"Category":/New Product/.toString(),"Status":/Submitted/.toString(),"Description":/Idea Description/.toString(),"Stage":/Collection/.toString(),"Points":/1/.toString(),"Votes":/1/.toString(),"Rank":/1/.toString(),"Comments":/0/.toString(),"Favorited":/0/.toString(),"Linked Submissions":[])
    }
    //Basestate
    public static def Action58123c20fa4ee77809f468f6(def params){
        //Create Affiliate based on Master Affiliate
        variables."affiliateURL" = new CopyAffiliate().run("Licensing Model":/${params."Licensing Model"}/.toString(),"Unlimited Brightidea Administrator License Type":/${params."Unlimited Brightidea Administrator License Type"}/.toString(),"Brightidea Administrator License Type Purchased Count":/${params."Brightidea Administrator License Type Purchased Count"}/.toString(),"Unlimited Idea Box Manager License Type":/${params."Unlimited Idea Box Manager License Type"}/.toString(),"Idea Box Manager License Type Purchased Count":/${params."Idea Box Manager License Type Purchased Count"}/.toString())
        //Open Browser
        new Browser().run("Run Browser in Incognito":/${params."Run Browser in Incognito"}/.toString(),"URL":/${variables."affiliateURL"}/.toString(),"Browser Type":/${variables."Browser"}/.toString())
        //Login
        new Login().run("Email":/${params."Username Email"}/.toString(),"Password":/brightidea1/.toString())
        //Set to Lab Environment
        new SettoLabEnvironment().run("Email":/${params."Username Email"}/.toString())

    }
    //Afterstate
    public static def Action581259c8fa4ee77809f46905(def params){
        try{
            //Close Current Window
            new CloseWindow().run([:])
        }
        catch(all){}catch(Error err){}
        //Delete Affiliate
        new DeleteAffiliate().run([:])

    }
    @AfterMethod
    public void afterState(){
        //Afterstate
        Action581259c8fa4ee77809f46905([:])
    }
}

