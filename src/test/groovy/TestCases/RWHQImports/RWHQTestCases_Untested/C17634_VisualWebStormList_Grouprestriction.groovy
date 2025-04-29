package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C17634- Visual WebStorm List - Group restriction
class C17634_VisualWebStormList_Grouprestriction
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
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/New Custom Pipeline/.toString(),"Description":/New Custom Pipeline Description/.toString(),"General Access":/ALL,End User,End User 2/.toString(),"General Access Add or Remove":/Remove,Add,Add/.toString(),"Action":/Create/.toString(),"Action on Design Tab":/Continue/.toString())
        //Verify Initiative Home
        new actions.Webstorm.VerifyWebstormHome().run("Webstorm Title":/New Custom Pipeline/.toString(),"Webstorm Description":/New Custom Pipeline Description/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Set Widget Controller
        new actions.Widgets.SetWidgetController().run("Widget Edit Mode":/Enable/.toString(),"Add Widget from Selection":/Visual Initiative List (Small)/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/moderator@test.com/.toString())
        //Verify Webstorms in Large Visual Webstorm List
        new actions.Widgets.VerifyWebstormsinLargeVisualWebstormList().run("Webstorm Title":/New Custom Pipeline/.toString(),"Number of Matches":/0/.toString())
        try{
            //Access Widget Visual Webstorm List Small Link
            new actions.Widgets.AccessWidgetVisualWebstormListSmallLink().run("Link Name":/New Custom Pipeline/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Navigate WebStorm or MTS
            new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/New Custom Pipeline/.toString(),"Area to Navigate to":/Post Idea/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Set Custom and Other App Post Idea
            new actions.PostIdea.SetCustomAppPostIdea().run("Title":/Idea1/.toString(),"Description":/Desc/.toString(),"Category":/Operations/.toString(),"Required Short Question":/Required Short Question/.toString(),"Action":/Submit Idea/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("Idea Name":/Idea1/.toString(),"Number of Matches":/0/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString())
        //Verify Webstorms in Large Visual Webstorm List
        new actions.Widgets.VerifyWebstormsinLargeVisualWebstormList().run("Webstorm Title":/New Custom Pipeline/.toString(),"Number of Matches":/1/.toString())
        //Access Widget Visual Webstorm List Small Link
        new actions.Widgets.AccessWidgetVisualWebstormListSmallLink().run("Link Name":/New Custom Pipeline/.toString())
        //Verify Initiative Home
        new actions.Webstorm.VerifyWebstormHome().run("Webstorm Title":/New Custom Pipeline/.toString(),"Webstorm Description":/New Custom Pipeline Description/.toString())
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