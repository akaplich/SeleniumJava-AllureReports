package TestCases.RWHQImports.SmokeTests

import BaseClasses.TestBase
import actions.API.Utils.CopyAffiliate
import actions.API.Utils.DeleteAffiliate
import actions.Enterprise.UserHomepage.NavigateTabUserHomepage
import actions.SetupSite.SetEnterpriseSetupSiteUserHomepage
import actions.Utils.SettoLabEnvironment
import actions.Whiteboards.ClickOnWhiteboardCanvas
import actions.Whiteboards.ClickOnWhiteboardTool
import actions.Whiteboards.CreateWhiteboardFromUserhome
import actions.Whiteboards.EditTitleOfWhiteboard
import actions.Whiteboards.SendKeysToWhiteboard
import actions.Whiteboards.VerifySmartMatrixExists
import actions.Whiteboards.WhiteboardSetTextBox
import actions.general.Login
import actions.general.Navigate
import actions.selenium.Browser
import actions.selenium.CloseWindow
import actions.selenium.Refresh
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.slf4j.Logger
import org.slf4j.LoggerFactory

//C130972 - WB - Text - Add & Remove Text
class TC_C130972_WB_Text_AddAndRemoveText extends TestBase {
    private static final Logger logger = LoggerFactory.getLogger(TC_C130972_WB_Text_AddAndRemoveText.class);
    private static def variables = [:]

    @BeforeAll
    public static void beforeState(){
        logger.debug("TC_C130972 beforeState");
        variables."URL" = /https:\/\/test.brightideatest.com/
        variables."Browser" = /Chrome/
        variables."TestRail_RunName" = null
        variables."TestRail_ExecutionName" = null
        variables."CodeEnvironment" = /Default/
        variables."Database" = null
    }
    @Test
    @Tag("Smoke")
    public void testcase(){
        //Basestate
        Action58123c20fa4ee77809f468f6([:])
        //Navigate
        new Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site User Homepage
        new SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString())
        //Navigate
        new Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new NavigateTabUserHomepage().run("Tab":/Whiteboards/.toString())
        //Create Whiteboard or Edit Template
        new CreateWhiteboardFromUserhome().run("Create New or Choose Template":/New Blank Whiteboard/.toString(),"Should it wait for page to load":true)
        //Set Whiteboard Title
        new EditTitleOfWhiteboard().run("Title":/C130972/.toString(),"Action":/Submit/.toString())
        //Click on Whiteboard Tool
        new ClickOnWhiteboardTool().run("Tool Type":/Text/.toString())
        //Whiteboard - Set Text Box
        new WhiteboardSetTextBox().run("X coordinate":/250/.toString(),"Y coordinate":/250/.toString())
        //Send Key(s) To Whiteboard
        new SendKeysToWhiteboard().run("Key(s) to send":/tc130972/.toString())
        //Refresh
        new Refresh().run([:])
        //Verify Smart Matrix & Other Elements Exists On Whiteboard
        new VerifySmartMatrixExists().run("Verify This Actual Text":/tc130972/.toString(),"Should Exist":true)
        //Click on Whiteboard Canvas
        new ClickOnWhiteboardCanvas().run("X coordinate":/10/.toString(),"Y coordinate":/5/.toString(),"Single Double or Right Click":/Single Click/.toString())
        //Send Key(s) To Whiteboard
        new SendKeysToWhiteboard().run("Key(s) to send":/Delete/.toString())
        //Verify Smart Matrix & Other Elements Exists On Whiteboard
        new VerifySmartMatrixExists().run("Element (skip if verifying text)":/Text 1/.toString(),"Should Exist":false)
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
        captureScreenshot("TC_C130972_WB_Text_AddAndRemoveText")
        try{
            //Close Current Window
            new CloseWindow().run([:])
        }
        catch(all){}catch(Error err){}
        //Delete Affiliate
        new DeleteAffiliate().run([:])

    }
    @AfterEach
    public void afterState(){
        logger.debug("TC_C130972 afterState");
        //Afterstate
        Action581259c8fa4ee77809f46905([:])

        if (Browser.Driver != null) {
            logger.debug("Quitting Driver in TestBase");
            Browser.Driver.quit(); // Ensure the WebDriver quits
        }
    }
}
