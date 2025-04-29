package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C131938 - WB - Shapes - Transparency Hotkeys
class C131938_WB_Shapes_TransparencyHotkeys
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
        //Click on Whiteboard Tool
        new actions.Whiteboards.ClickOnWhiteboardTool().run("Tool Type":/Shapes/.toString())
        //Set Shapes Tool in Whiteboard
        new actions.Whiteboards.SetShapesToolWhiteboard().run("Add via Single Click or Drag and Drop":/Single Click/.toString(),"Select Shape (if other than square)":/star/.toString(),"X coordinate":/250/.toString(),"Y coordinate":/250/.toString())
        //Set Right Side Controls in Whiteboard
        new actions.Whiteboards.SetRightSideControlsWhiteboard().run("Fill Color":/E74C3C/.toString(),"Add Border":true,"Border Width":/5/.toString())
        //Click on Whiteboard Canvas
        new actions.Whiteboards.ClickOnWhiteboardCanvas().run("X coordinate":/-100/.toString(),"Y coordinate":/0/.toString(),"Single Double or Right Click":/Single Click/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Control + A/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/5/.toString())
        //Verify Right Side Controls in Whiteboard 
        new actions.Whiteboards.VerifyRightSideControlsWhiteboard().run("Fill Color Opacity":/50/.toString(),"Border Collapsed":false,"Border Opacity":/50/.toString())
        //Compare Images
        new actions.selenium.CompareImages().run("Expected Image File":/C131938_1_expected.png/.toString(),"Actual Image Name":/C131938_1_actual.png/.toString(),"Crop Screenshot Start at X":/100/.toString(),"Crop Screenshot Start at Y":/150/.toString(),"Crop Screenshot Width":/400/.toString(),"Crop Screenshot Height":/350/.toString(),"Allowed Number of Different Pixels":/100/.toString())
        //Click on Whiteboard Canvas
        new actions.Whiteboards.ClickOnWhiteboardCanvas().run("X coordinate":/-100/.toString(),"Y coordinate":/0/.toString(),"Single Double or Right Click":/Single Click/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Control + A/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/00/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/2/.toString())
        //Verify Right Side Controls in Whiteboard 
        new actions.Whiteboards.VerifyRightSideControlsWhiteboard().run("Fill Color Opacity":/0/.toString(),"Border Collapsed":true)
        //Compare Images
        new actions.selenium.CompareImages().run("Expected Image File":/C131938_2_expected.png/.toString(),"Actual Image Name":/C131938_2_actual.png/.toString(),"Crop Screenshot Start at X":/100/.toString(),"Crop Screenshot Start at Y":/150/.toString(),"Crop Screenshot Width":/400/.toString(),"Crop Screenshot Height":/350/.toString(),"Allowed Number of Different Pixels":/100/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/0/.toString())
        //Verify Right Side Controls in Whiteboard 
        new actions.Whiteboards.VerifyRightSideControlsWhiteboard().run("Fill Color Opacity":/100/.toString(),"View Border":true,"Border Collapsed":false,"Border Width":/5/.toString(),"Border Opacity":/100/.toString())
        //Compare Images
        new actions.selenium.CompareImages().run("Expected Image File":/C131938_3_expected.png/.toString(),"Actual Image Name":/C131938_3_actual.png/.toString(),"Crop Screenshot Start at X":/100/.toString(),"Crop Screenshot Start at Y":/150/.toString(),"Crop Screenshot Width":/400/.toString(),"Crop Screenshot Height":/350/.toString(),"Allowed Number of Different Pixels":/100/.toString())
        //Go Back From Whiteboard
        new actions.Whiteboards.GoBackFromWhiteboard().run([:])
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Whiteboards/.toString())
        //Create Whiteboard or Edit Template
        new actions.Whiteboards.CreateWhiteboardFromUserhome().run("Create New or Choose Template":/New Blank Whiteboard/.toString())
        //Click on Whiteboard Tool
        new actions.Whiteboards.ClickOnWhiteboardTool().run("Click on ToolKit":true,"Tool Type":/Place Image/.toString())
        //Set Change Background or Other Modal Tab
        new actions.WebstormHomepage.SetChangeBackgroundmodal().run("Tab":/Upload/.toString())
        //Set Upload your Own Background
        new actions.WebstormHomepage.SetUploadyourOwnBackground().run("Choose File":/Image3.jpg/.toString(),"Wait for Image to load":true,"Action":/Add Image/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/5/.toString())
        //Verify Right Side Controls in Whiteboard 
        new actions.Whiteboards.VerifyRightSideControlsWhiteboard().run("Fill Color Opacity":/50/.toString(),"View Border":true,"Border Collapsed":false,"Border Opacity":/50/.toString())
        //Compare Images
        new actions.selenium.CompareImages().run("Expected Image File":/C131938_4_expected.png/.toString(),"Actual Image Name":/C131938_4_actual.png/.toString(),"Crop Screenshot Start at X":/400/.toString(),"Crop Screenshot Start at Y":/150/.toString(),"Crop Screenshot Width":/1200/.toString(),"Crop Screenshot Height":/900/.toString(),"Allowed Number of Different Pixels":/100/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/0/.toString())
        //Verify Right Side Controls in Whiteboard 
        new actions.Whiteboards.VerifyRightSideControlsWhiteboard().run("Fill Color Opacity":/100/.toString(),"View Border":true,"Border Opacity":/100/.toString())
        //Compare Images
        new actions.selenium.CompareImages().run("Expected Image File":/C131938_5_expected.png/.toString(),"Actual Image Name":/C131938_5_actual.png/.toString(),"Crop Screenshot Start at X":/400/.toString(),"Crop Screenshot Start at Y":/150/.toString(),"Crop Screenshot Width":/1200/.toString(),"Crop Screenshot Height":/900/.toString(),"Allowed Number of Different Pixels":/100/.toString())
        //Go Back From Whiteboard
        new actions.Whiteboards.GoBackFromWhiteboard().run([:])
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Whiteboards/.toString())
        //Create Whiteboard or Edit Template
        new actions.Whiteboards.CreateWhiteboardFromUserhome().run("Create New or Choose Template":/New Blank Whiteboard/.toString())
        //Click on Whiteboard Tool
        new actions.Whiteboards.ClickOnWhiteboardTool().run("Tool Type":/Marker/.toString())
        //Set Marker or Move Tool in Whiteboard
        new actions.Whiteboards.SetMarkerToolToWhiteboard().run("Select Position of the Color Option":/2/.toString(),"X coordinate1":/50/.toString(),"Y coordinate1":/10/.toString(),"X coordinate2":/50/.toString(),"Y coordinate2":/20/.toString(),"X coordinate3":/30/.toString(),"Y coordinate3":/50/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Escape/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/1/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Control + A/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/1/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/3/.toString())
        //Verify Right Side Controls in Whiteboard 
        new actions.Whiteboards.VerifyRightSideControlsWhiteboard().run("Fill Color":/1AA89C/.toString(),"Fill Color Opacity":/30/.toString(),"View Border":true)
        //Compare Images
        new actions.selenium.CompareImages().run("Expected Image File":/C131938_6_expected.png/.toString(),"Actual Image Name":/C131938_6_actual.png/.toString(),"Crop Screenshot Start at X":/60/.toString(),"Crop Screenshot Start at Y":/150/.toString(),"Crop Screenshot Width":/400/.toString(),"Crop Screenshot Height":/350/.toString(),"Allowed Number of Different Pixels":/100/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/0/.toString())
        //Verify Right Side Controls in Whiteboard 
        new actions.Whiteboards.VerifyRightSideControlsWhiteboard().run("Fill Color":/1AA89C/.toString(),"Fill Color Opacity":/100/.toString())
        //Compare Images
        new actions.selenium.CompareImages().run("Expected Image File":/C131938_7_expected.png/.toString(),"Actual Image Name":/C131938_7_actual.png/.toString(),"Crop Screenshot Start at X":/60/.toString(),"Crop Screenshot Start at Y":/150/.toString(),"Crop Screenshot Width":/400/.toString(),"Crop Screenshot Height":/350/.toString(),"Allowed Number of Different Pixels":/100/.toString())
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
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/difference.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C131938_6_actual.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C131938_5_actual.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C131938_4_actual.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C131938_3_actual.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C131938_2_actual.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C131938_1_actual.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C131938_0_actual.png/.toString())
        }
       catch(all){}catch(Error err){}
    }
}