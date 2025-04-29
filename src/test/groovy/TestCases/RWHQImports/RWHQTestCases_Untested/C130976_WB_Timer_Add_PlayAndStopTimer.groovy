package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C130976 - WB - Timer - Add, Play & Stop Timer
class C130976_WB_Timer_Add_PlayAndStopTimer
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
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString(),"Highlights":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Whiteboards/.toString())
        //Create Whiteboard or Edit Template
        new actions.Whiteboards.CreateWhiteboardFromUserhome().run("Create New or Choose Template":/New Blank Whiteboard/.toString(),"Should it wait for page to load":true)
        //Click on Whiteboard Tool
        new actions.Whiteboards.ClickOnWhiteboardTool().run("Click on ToolKit":true,"Tool Type":/Timer/.toString())
        //Verify Timer in Whiteboards
        new actions.Whiteboards.VerifyTimerWhiteboards().run("Timer Should be Present":true,"Timer Should be Running, Paused, Initialized or Minimilized":/init/.toString(),"Minutes Value":/03/.toString())
        //Set Timer on Whiteboard Page
        new actions.Whiteboards.SetTimerWhiteboardPage().run("Action":/Start Timer/.toString())
        //Verify Timer in Whiteboards
        new actions.Whiteboards.VerifyTimerWhiteboards().run("Timer Should be Present":true,"Timer Should be Running, Paused, Initialized or Minimilized":/running/.toString(),"Minutes Value":/02/.toString(),"Timer Set By":/System Admin/.toString())
        //Set Timer on Whiteboard Page
        new actions.Whiteboards.SetTimerWhiteboardPage().run("Action":/Pause Timer/.toString())
        //Verify Timer in Whiteboards
        new actions.Whiteboards.VerifyTimerWhiteboards().run("Timer Should be Present":true,"Timer Should be Running, Paused, Initialized or Minimilized":/paused/.toString(),"Minutes Value":/02/.toString(),"Timer Set By":/System Admin/.toString())
        //Set Timer on Whiteboard Page
        new actions.Whiteboards.SetTimerWhiteboardPage().run("Action":/Resume Timer/.toString())
        //Set Timer on Whiteboard Page
        new actions.Whiteboards.SetTimerWhiteboardPage().run("Action":/Stop Timer/.toString())
        //Verify Timer in Whiteboards
        new actions.Whiteboards.VerifyTimerWhiteboards().run("Timer Should be Present":true,"Timer Should be Running, Paused, Initialized or Minimilized":/init/.toString(),"Minutes Value":/03/.toString())
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