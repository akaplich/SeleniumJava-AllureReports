package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C17622 - Visual WebStorm List (Large) - Idea count
class C17622_VisualWebStormList_Large_Ideacount
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
        //Verify Webstorms in Large Visual Webstorm List
        new actions.Widgets.VerifyWebstormsinLargeVisualWebstormList().run("Webstorm Title":/Custom App/.toString(),"Idea Count":/3/.toString(),"Number of Matches":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/Idea4/.toString(),"Description":/Description/.toString(),"Category":/Operations/.toString(),"Required Short Question":/Required Short Question/.toString(),"Action":/Submit Idea/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Verify Webstorms in Large Visual Webstorm List
        new actions.Widgets.VerifyWebstormsinLargeVisualWebstormList().run("Webstorm Title":/Custom App/.toString(),"Idea Count":/4/.toString(),"Number of Matches":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/quick idea4/.toString(),"Action":/Submit/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Verify Webstorms in Large Visual Webstorm List
        new actions.Widgets.VerifyWebstormsinLargeVisualWebstormList().run("Webstorm Title":/Custom App/.toString(),"Idea Count":/5/.toString(),"Number of Matches":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/quick add1/.toString(),"Step Name idea belongs to":/Review/.toString())
        //Delete Ideas in Pipeline Steps page
        new actions.PipelineStepsView.DeleteIdeasinPipelineStepsViewpage().run("Action":/Delete/.toString())
        //Set Delete Idea or Pipeline in all places
        new actions.PipelineStepsView.SetDeleteIdea().run("I understand":true,"Action":/Delete Ideas/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Verify Webstorms in Large Visual Webstorm List
        new actions.Widgets.VerifyWebstormsinLargeVisualWebstormList().run("Webstorm Title":/Custom App/.toString(),"Idea Count":/4/.toString(),"Number of Matches":/1/.toString())
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