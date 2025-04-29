import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131433 - WB - Text - Add Bullet to Single Line, Dash + Space Adds Bullet
class C131433_WB_Text_AddBullettoSingleLine_Dash_SpaceAddsBullet
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
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Whiteboards/.toString())
        //Create Whiteboard or Edit Template
        new actions.Whiteboards.CreateWhiteboardFromUserhome().run("Create New or Choose Template":/New Blank Whiteboard/.toString())
        //Set Whiteboard Title
        new actions.Whiteboards.EditTitleOfWhiteboard().run("Title":/C131433/.toString(),"Action":/Submit/.toString())
        //Whiteboard - Set Zoom
        new actions.Whiteboards.WhiteboardSetZoom().run("Click on Zoom button":/+/.toString())
        //Whiteboard - Set Zoom
        new actions.Whiteboards.WhiteboardSetZoom().run("Click on Zoom button":/+/.toString())
        //Click on Whiteboard Tool
        new actions.Whiteboards.ClickOnWhiteboardTool().run("Tool Type":/Text/.toString())
        //Whiteboard - Set Text Box
        new actions.Whiteboards.WhiteboardSetTextBox().run("X coordinate":/250/.toString(),"Y coordinate":/250/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/1/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/test1/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Enter/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/- test2/.toString())
        //Verify Right Side Controls in Whiteboard 
        new actions.Whiteboards.VerifyRightSideControlsWhiteboard().run("Bullets: unordered list":true,"Bullets: ordered list":false)
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Up/.toString())
        //Verify Right Side Controls in Whiteboard 
        new actions.Whiteboards.VerifyRightSideControlsWhiteboard().run("Text Font":/Lato/.toString(),"Bullets: unordered list":false)
        //Go Back From Whiteboard
        new actions.Whiteboards.GoBackFromWhiteboard().run([:])
        //Create Whiteboard or Edit Template
        new actions.Whiteboards.CreateWhiteboardFromUserhome().run("Create New or Choose Template":/New Blank Whiteboard/.toString())
        //Set Whiteboard Title
        new actions.Whiteboards.EditTitleOfWhiteboard().run("Title":/C131433_2/.toString(),"Action":/Submit/.toString())
        //Whiteboard - Set Zoom
        new actions.Whiteboards.WhiteboardSetZoom().run("Click on Zoom button":/+/.toString())
        //Whiteboard - Set Zoom
        new actions.Whiteboards.WhiteboardSetZoom().run("Click on Zoom button":/+/.toString())
        //Click on Whiteboard Tool
        new actions.Whiteboards.ClickOnWhiteboardTool().run("Tool Type":/Text/.toString())
        //Whiteboard - Select Text Type
        new actions.Whiteboards.SetTextToolWhiteboard().run("Select Option":/Text block/.toString())
        //Whiteboard - Set Text Box
        new actions.Whiteboards.WhiteboardSetTextBox().run("X coordinate":/250/.toString(),"Y coordinate":/250/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/test1/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Enter/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/test2/.toString())
        //Set Right Side Controls in Whiteboard
        new actions.Whiteboards.SetRightSideControlsWhiteboard().run("Bullets: unordered list":true)
        //Verify Right Side Controls in Whiteboard 
        new actions.Whiteboards.VerifyRightSideControlsWhiteboard().run("Bullets: unordered list":true)
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Up/.toString())
        //Verify Right Side Controls in Whiteboard 
        new actions.Whiteboards.VerifyRightSideControlsWhiteboard().run("Bullets: unordered list":false,"Bullets: ordered list":false)
        //Click on Whiteboard Canvas
        new actions.Whiteboards.ClickOnWhiteboardCanvas().run("X coordinate":/100/.toString(),"Y coordinate":/100/.toString(),"Single Double or Right Click":/Single Click/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/1/.toString())
        //Click on Whiteboard Canvas
        new actions.Whiteboards.ClickOnWhiteboardCanvas().run("X coordinate":/-100/.toString(),"Y coordinate":/-100/.toString(),"Single Double or Right Click":/Single Click/.toString())
        //Verify Right Side Controls in Whiteboard 
        new actions.Whiteboards.VerifyRightSideControlsWhiteboard().run("Text Font":/Lato/.toString(),"Bullets: unordered list":false)
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
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C131433_1_actual.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C131433_2_actual.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/difference.png/.toString())
        }
       catch(all){}catch(Error err){}
        //Afterstate
        Action581259c8fa4ee77809f46905([:])
    }
}