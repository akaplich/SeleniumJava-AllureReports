import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131531 - WB - Add Table, Background, Border, Font, Add Column, Add Row
class C131531_WB_AddTable_Background_Border_Font_AddColumn_AddRow
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Unlimited Brightidea Administrator License Type":/1/.toString(),"Unlimited Idea Box Manager License Type":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Whiteboards/.toString())
        //Create Whiteboard or Edit Template
        new actions.Whiteboards.CreateWhiteboardFromUserhome().run("Create New or Choose Template":/New Blank Whiteboard/.toString(),"Should it wait for page to load":true)
        //Set Whiteboard Title
        new actions.Whiteboards.EditTitleOfWhiteboard().run("Title":/C131531/.toString(),"Action":/Submit/.toString())
        //Click on Whiteboard Tool
        new actions.Whiteboards.ClickOnWhiteboardTool().run("Tool Type":/Toolkit/.toString())
        //Set Toolkit from left Toolbar
        new actions.Whiteboards.SetToolkitfromleftToolbar().run("Toolkit Option":/Table/.toString())
        //Whiteboard - Set Add Table
        new actions.Whiteboards.WhiteboardSetAddTable().run("Rows":/2/.toString(),"Columns":/3/.toString(),"X coordinate":/740/.toString(),"Y coordinate":/350/.toString())
        //Click on Whiteboard Canvas
        new actions.Whiteboards.ClickOnWhiteboardCanvas().run("X coordinate":/100/.toString(),"Y coordinate":/100/.toString(),"Single Double or Right Click":/Single Click/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/1/.toString())
        //Click on Whiteboard Canvas
        new actions.Whiteboards.ClickOnWhiteboardCanvas().run("X coordinate":/0/.toString(),"Y coordinate":/0/.toString(),"Single Double or Right Click":/Double Click/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/C131531 /.toString())
        //Verify Right Side Controls in Whiteboard 
        new actions.Whiteboards.VerifyRightSideControlsWhiteboard().run("Text Font":/Lato/.toString(),"Font Size":/14/.toString(),"Font Color":/444647/.toString())
        //Set Right Side Controls in Whiteboard
        new actions.Whiteboards.SetRightSideControlsWhiteboard().run("Font Color":/F1C40F/.toString(),"Font Size":/20/.toString())
        //Set Right Side Controls in Whiteboard
        new actions.Whiteboards.SetRightSideControlsWhiteboard().run("Text Font":/Architects Daughter/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/C131531/.toString())
        //Verify Right Side Controls in Whiteboard 
        new actions.Whiteboards.VerifyRightSideControlsWhiteboard().run("Text Font":/Architects Daughter/.toString(),"Font Color":/F1C40F/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Left/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Left/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Left/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Left/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Left/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Left/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Left/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Left/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Left/.toString())
        //Verify Right Side Controls in Whiteboard 
        new actions.Whiteboards.VerifyRightSideControlsWhiteboard().run("Text Font":/Lato/.toString(),"Font Size":/14/.toString(),"Font Color":/444647/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Click on Whiteboard Canvas
        new actions.Whiteboards.ClickOnWhiteboardCanvas().run("X coordinate":/10/.toString(),"Y coordinate":/10/.toString(),"Single Double or Right Click":/Single Click/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Control + A/.toString())
        //Verify Right Side Controls in Whiteboard 
        new actions.Whiteboards.VerifyRightSideControlsWhiteboard().run("Border Color":/444647/.toString(),"Text Font":/Mixed/.toString(),"Font Size":/14/.toString(),"Font Color":/444647/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/DIV[@class='f-canvas-control-section']\/\/SPAN[contains(@class,'f-canvas-control-heading') and .='Background Color']\/..\/BUTTON/.toString())
        //Set Right Side Controls in Whiteboard
        new actions.Whiteboards.SetRightSideControlsWhiteboard().run("Fill Color":/3498DB/.toString(),"Fill Color Opacity":/100/.toString())
        //Click on Whiteboard Canvas
        new actions.Whiteboards.ClickOnWhiteboardCanvas().run("X coordinate":/0/.toString(),"Y coordinate":/-200/.toString(),"Single Double or Right Click":/Single Click/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Control + A/.toString())
        //Verify Right Side Controls in Whiteboard 
        new actions.Whiteboards.VerifyRightSideControlsWhiteboard().run("Fill Color":/3498DB/.toString(),"Fill Color Opacity":/100/.toString(),"Border Color":/444647/.toString(),"Text Font":/Mixed/.toString(),"Font Size":/14/.toString(),"Font Color":/444647/.toString())
        //Set Right Side Controls in Whiteboard
        new actions.Whiteboards.SetRightSideControlsWhiteboard().run("Add Row Top":true)
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Click on Whiteboard Canvas
        new actions.Whiteboards.ClickOnWhiteboardCanvas().run("X coordinate":/10/.toString(),"Y coordinate":/10/.toString(),"Single Double or Right Click":/Single Click/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Control + A/.toString())
        //Set Right Side Controls in Whiteboard
        new actions.Whiteboards.SetRightSideControlsWhiteboard().run("Add Row Bottom":true)
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Click on Whiteboard Canvas
        new actions.Whiteboards.ClickOnWhiteboardCanvas().run("X coordinate":/10/.toString(),"Y coordinate":/10/.toString(),"Single Double or Right Click":/Single Click/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Control + A/.toString())
        //Set Right Side Controls in Whiteboard
        new actions.Whiteboards.SetRightSideControlsWhiteboard().run("Add Column Left":true)
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Click on Whiteboard Canvas
        new actions.Whiteboards.ClickOnWhiteboardCanvas().run("X coordinate":/10/.toString(),"Y coordinate":/10/.toString(),"Single Double or Right Click":/Single Click/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Control + A/.toString())
        //Set Right Side Controls in Whiteboard
        new actions.Whiteboards.SetRightSideControlsWhiteboard().run("Add Column Right":true)
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Verify Smart Matrix & Other Elements Exists On Whiteboard
        new actions.Whiteboards.VerifySmartMatrixExists().run("Element (skip if verifying text)":/Table Cell 20/.toString(),"Should Exist":true)
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
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C131531_actual.png/.toString())
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