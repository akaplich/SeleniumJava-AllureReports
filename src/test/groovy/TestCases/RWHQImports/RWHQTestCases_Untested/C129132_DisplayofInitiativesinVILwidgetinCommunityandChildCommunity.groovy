import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C129132 - Display of Initiatives in VIL widget in Community and Child Community
class C129132_DisplayofInitiativesinVILwidgetinCommunityandChildCommunity
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
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Test Custom App1/.toString(),"Description":/desc/.toString(),"Action":/Create/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Test Custom App2/.toString(),"Description":/desc/.toString(),"Action":/Create/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Select Community
        new actions.SetupEnterpriseCommunities.SelectCommunity().run("Community Name":/QA Community/.toString())
        //Update Community
        new actions.SetupEnterpriseCommunities.UpdateCommunity().run("Apps":/Custom App,Evaluators app,Solve App/.toString(),"Checkbox Check":/TRUE,TRUE,TRUE/.toString())
        //Go to Community
        new actions.SetupEnterpriseCommunities.GotoCommunity().run("Community Name to go to":/QA Community/.toString())
        //Set Widget Controller
        new actions.Widgets.SetWidgetController().run("Widget Edit Mode":/Enable/.toString())
        //Set Visual Webstorm List Large
        new actions.Widgets.SetVisualWebstormListLarge().run("Widget Name":/Visual Initiative List (Large)/.toString(),"WebStorms from List":/Custom App/.toString(),"WebStorm Checkbox Check":/FALSE/.toString())
        //Navigate Community
        new actions.SetupEnterpriseCommunities.NavigateCommunity().run("Community Page":/Community Home/.toString())
        //Verify Webstorms in Large Visual Webstorm List
        new actions.Widgets.VerifyWebstormsinLargeVisualWebstormList().run("Webstorm Title":/Custom App/.toString(),"Number of Matches":/0/.toString())
        //Verify Webstorms in Large Visual Webstorm List
        new actions.Widgets.VerifyWebstormsinLargeVisualWebstormList().run("Webstorm Title":/Solve App/.toString(),"Number of Matches":/1/.toString())
        //Verify Webstorms in Large Visual Webstorm List
        new actions.Widgets.VerifyWebstormsinLargeVisualWebstormList().run("Webstorm Title":/Evaluators app/.toString(),"Number of Matches":/1/.toString())
        //Verify Webstorms in Large Visual Webstorm List
        new actions.Widgets.VerifyWebstormsinLargeVisualWebstormList().run("Webstorm Title":/Test Custom App2/.toString(),"Number of Matches":/0/.toString())
        //Verify Webstorms in Large Visual Webstorm List
        new actions.Widgets.VerifyWebstormsinLargeVisualWebstormList().run("Webstorm Title":/Test Custom App1/.toString(),"Number of Matches":/0/.toString())
        //Verify Visual Initiative List Small Widget
        new actions.Widgets.VerifyVisualInitiativeListSmallWidget().run("Initiative Title":/Custom App/.toString(),"Number of Matches":/0/.toString())
        //Verify Visual Initiative List Small Widget
        new actions.Widgets.VerifyVisualInitiativeListSmallWidget().run("Initiative Title":/Test Custom App1/.toString(),"Number of Matches":/0/.toString())
        //Verify Visual Initiative List Small Widget
        new actions.Widgets.VerifyVisualInitiativeListSmallWidget().run("Initiative Title":/Test Custom App2/.toString(),"Number of Matches":/0/.toString())
        //Verify Visual Initiative List Small Widget
        new actions.Widgets.VerifyVisualInitiativeListSmallWidget().run("Initiative Title":/Solve App/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Visual Initiative List Small Widget
        new actions.Widgets.VerifyVisualInitiativeListSmallWidget().run("Initiative Title":/Evaluators app/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Navigate Community
        new actions.SetupEnterpriseCommunities.NavigateCommunity().run("Community Page":/Setup/.toString())
        //Add Community
        new actions.SetupEnterpriseCommunities.AddCommunity().run("Community Name":/Child QA Community/.toString(),"Action":/Create/.toString())
        //Select Community
        new actions.SetupEnterpriseCommunities.SelectCommunity().run("Community Name":/Child QA Community/.toString())
        //Update Community
        new actions.SetupEnterpriseCommunities.UpdateCommunity().run("Apps":/Test Custom App1,Test Custom App2,Custom App/.toString(),"Checkbox Check":/TRUE,TRUE,TRUE/.toString())
        //Navigate Community
        new actions.SetupEnterpriseCommunities.NavigateCommunity().run("Community Page":/Setup/.toString())
        //Go to Community
        new actions.SetupEnterpriseCommunities.GotoCommunity().run("Community Name to go to":/Child QA Community/.toString())
        //Set Widget Controller
        new actions.Widgets.SetWidgetController().run("Add Widget from Selection":/Visual Initiative List (Large)/.toString())
        //Set Widget Controller
        new actions.Widgets.SetWidgetController().run("Add Widget from Selection":/Visual Initiative List (Small)/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Verify Webstorms in Large Visual Webstorm List
        new actions.Widgets.VerifyWebstormsinLargeVisualWebstormList().run("Webstorm Title":/Custom App/.toString(),"Number of Matches":/1/.toString())
        //Verify Webstorms in Large Visual Webstorm List
        new actions.Widgets.VerifyWebstormsinLargeVisualWebstormList().run("Webstorm Title":/Solve App/.toString(),"Number of Matches":/0/.toString())
        //Verify Webstorms in Large Visual Webstorm List
        new actions.Widgets.VerifyWebstormsinLargeVisualWebstormList().run("Webstorm Title":/Evaluators app/.toString(),"Number of Matches":/0/.toString())
        //Verify Webstorms in Large Visual Webstorm List
        new actions.Widgets.VerifyWebstormsinLargeVisualWebstormList().run("Webstorm Title":/Test Custom App2/.toString(),"Number of Matches":/1/.toString())
        //Verify Webstorms in Large Visual Webstorm List
        new actions.Widgets.VerifyWebstormsinLargeVisualWebstormList().run("Webstorm Title":/Test Custom App1/.toString(),"Number of Matches":/1/.toString())
        //Verify Visual Initiative List Small Widget
        new actions.Widgets.VerifyVisualInitiativeListSmallWidget().run("Initiative Title":/Custom App/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Visual Initiative List Small Widget
        new actions.Widgets.VerifyVisualInitiativeListSmallWidget().run("Initiative Title":/Test Custom App1/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Visual Initiative List Small Widget
        new actions.Widgets.VerifyVisualInitiativeListSmallWidget().run("Initiative Title":/Test Custom App2/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Visual Initiative List Small Widget
        new actions.Widgets.VerifyVisualInitiativeListSmallWidget().run("Initiative Title":/Solve App/.toString(),"Number of Matches":/0/.toString())
        //Verify Visual Initiative List Small Widget
        new actions.Widgets.VerifyVisualInitiativeListSmallWidget().run("Initiative Title":/Evaluators app/.toString(),"Number of Matches":/0/.toString())
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