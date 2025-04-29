package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131420 - WB - Link To Object
class C131420_WB_LinkToObject
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
        new actions.Whiteboards.EditTitleOfWhiteboard().run("Title":/C131420/.toString(),"Action":/Submit/.toString())
        //Whiteboard - Set Zoom
        new actions.Whiteboards.WhiteboardSetZoom().run("Click on Zoom button":/-/.toString())
        //Whiteboard - Set Zoom
        new actions.Whiteboards.WhiteboardSetZoom().run("Click on Zoom button":/-/.toString())
        //Click on Whiteboard Tool
        new actions.Whiteboards.ClickOnWhiteboardTool().run("Tool Type":/Sticky Note/.toString())
        //Add Sticky Note to Whiteboard
        new actions.Whiteboards.AddStickyNoteToWhiteboard().run("Add via Double Click or Drag and Drop":/Single Click/.toString(),"Select Placement of the Color Option":/2/.toString(),"X coordinate":/100/.toString(),"Y coordinate":/100/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/c131420 link to this sticky/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Escape/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Control + K/.toString())
        //Get Clipboard Content
        variables."copiedString" = new actions.selenium.GetClipboardContent().run([:])
        //Click on Whiteboard Canvas
        new actions.Whiteboards.ClickOnWhiteboardCanvas().run("X coordinate":/300/.toString(),"Y coordinate":/300/.toString(),"Single Double or Right Click":/Single Click/.toString())
        //Click on Whiteboard Tool
        new actions.Whiteboards.ClickOnWhiteboardTool().run("Tool Type":/Shapes/.toString())
        //Set Shapes Tool in Whiteboard
        new actions.Whiteboards.SetShapesToolWhiteboard().run("Add via Single Click or Drag and Drop":/Single Click/.toString(),"Select Shape (if other than square)":/triangle/.toString(),"X coordinate":/100/.toString(),"Y coordinate":/500/.toString())
        //Go Back From Whiteboard
        new actions.Whiteboards.GoBackFromWhiteboard().run([:])
        //Log Out
        new actions.general.LogOut().run([:])
        //Close All Browsers
        new actions.selenium.CloseBrowser().run([:])
        //Open Browser
        new actions.selenium.Browser().run("URL":/${variables."affiliateURL"}/.toString(),"Browser Type":/Chrome/.toString())
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."copiedString"}/.toString())
        try{
            //Compare Images
            new actions.selenium.CompareImages().run("Expected Image File":/C131420_1_Expected3282025.png/.toString(),"Actual Image Name":/C131420_1_actual.png/.toString(),"Crop Screenshot Start at X":/0/.toString(),"Crop Screenshot Start at Y":/75/.toString(),"Crop Screenshot Width":/2000/.toString(),"Crop Screenshot Height":/850/.toString(),"Allowed Number of Different Pixels":/200/.toString())
        }
       catch(all){println all}catch(Error err){println err}
        //Go Back From Whiteboard
        new actions.Whiteboards.GoBackFromWhiteboard().run([:])
        //Create Whiteboard or Edit Template
        new actions.Whiteboards.CreateWhiteboardFromUserhome().run("Create New or Choose Template":/New Blank Whiteboard/.toString())
        //Set Whiteboard Title
        new actions.Whiteboards.EditTitleOfWhiteboard().run("Title":/C131420_2/.toString(),"Action":/Submit/.toString())
        //Whiteboard - Set Zoom
        new actions.Whiteboards.WhiteboardSetZoom().run("Click on Zoom button":/-/.toString())
        //Whiteboard - Set Zoom
        new actions.Whiteboards.WhiteboardSetZoom().run("Click on Zoom button":/-/.toString())
        //Click on Whiteboard Tool
        new actions.Whiteboards.ClickOnWhiteboardTool().run("Tool Type":/Sticky Note/.toString())
        //Add Sticky Note to Whiteboard
        new actions.Whiteboards.AddStickyNoteToWhiteboard().run("Add via Double Click or Drag and Drop":/Single Click/.toString(),"Select Placement of the Color Option":/3/.toString(),"X coordinate":/100/.toString(),"Y coordinate":/100/.toString())
        //Click on Whiteboard Canvas
        new actions.Whiteboards.ClickOnWhiteboardCanvas().run("X coordinate":/5/.toString(),"Y coordinate":/5/.toString(),"Single Double or Right Click":/Right Click/.toString())
        //Whiteboard - Set Right Click on Object
        new actions.Whiteboards.SetRightClickonStickyNote().run("Right Click on Sticky Note":false,"Link to selected object":true)
        //Get Clipboard Content
        variables."copiedString" = new actions.selenium.GetClipboardContent().run([:])
        //Go Back From Whiteboard
        new actions.Whiteboards.GoBackFromWhiteboard().run([:])
        //Log Out
        new actions.general.LogOut().run([:])
        //Close All Browsers
        new actions.selenium.CloseBrowser().run([:])
        //Open Browser
        new actions.selenium.Browser().run("URL":/${variables."affiliateURL"}/.toString(),"Browser Type":/Chrome/.toString())
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."copiedString"}/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/3/.toString())
        try{
            //Compare Images
            new actions.selenium.CompareImages().run("Expected Image File":/C131420_2_Expected3282025.png/.toString(),"Actual Image Name":/C131420_2_actual.png/.toString(),"Crop Screenshot Start at X":/0/.toString(),"Crop Screenshot Start at Y":/75/.toString(),"Crop Screenshot Width":/2000/.toString(),"Crop Screenshot Height":/850/.toString(),"Allowed Number of Different Pixels":/200/.toString())
        }
       catch(all){println all}catch(Error err){println err}
        //Go Back From Whiteboard
        new actions.Whiteboards.GoBackFromWhiteboard().run([:])
        //Create Whiteboard or Edit Template
        new actions.Whiteboards.CreateWhiteboardFromUserhome().run("Create New or Choose Template":/New Blank Whiteboard/.toString())
        //Set Whiteboard Title
        new actions.Whiteboards.EditTitleOfWhiteboard().run("Title":/C131420_3/.toString(),"Action":/Submit/.toString())
        //Click on Whiteboard Tool
        new actions.Whiteboards.ClickOnWhiteboardTool().run("Tool Type":/Shapes/.toString())
        //Set Shapes Tool in Whiteboard
        new actions.Whiteboards.SetShapesToolWhiteboard().run("Add via Single Click or Drag and Drop":/Single Click/.toString(),"Select Shape (if other than square)":/circle/.toString(),"X coordinate":/300/.toString(),"Y coordinate":/500/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Control + A/.toString())
        //Whiteboard - Set Share
        new actions.Whiteboards.SetShareWhiteboard().run("Click Share Button":true,"Link to selected object":true,"Copy Link":true)
        //Get Clipboard Content
        variables."copiedString" = new actions.selenium.GetClipboardContent().run([:])
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."copiedString"}/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/3/.toString())
        //Compare Images
        new actions.selenium.CompareImages().run("Expected Image File":/C131420_3_Expected3282025.png/.toString(),"Actual Image Name":/C131420_3_actual.png/.toString(),"Crop Screenshot Start at X":/0/.toString(),"Crop Screenshot Start at Y":/75/.toString(),"Crop Screenshot Width":/2000/.toString(),"Crop Screenshot Height":/850/.toString(),"Allowed Number of Different Pixels":/200/.toString())
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
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/difference.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C131420_1_actual.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C131420_2_actual.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C131420_3_actual.png/.toString())
        }
       catch(all){}catch(Error err){}
        //Afterstate
        Action581259c8fa4ee77809f46905([:])
    }
}