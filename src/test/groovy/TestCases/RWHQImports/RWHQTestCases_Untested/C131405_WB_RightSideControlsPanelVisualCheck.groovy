package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131405 - WB - Right Side Controls Panel Visual Check
class C131405_WB_RightSideControlsPanelVisualCheck
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
        new actions.Whiteboards.EditTitleOfWhiteboard().run("Title":/C131405_sticky/.toString(),"Action":/Submit/.toString())
        //Click on Whiteboard Tool
        new actions.Whiteboards.ClickOnWhiteboardTool().run("Tool Type":/Sticky Note/.toString())
        //Add Sticky Note to Whiteboard
        new actions.Whiteboards.AddStickyNoteToWhiteboard().run("Add via Double Click or Drag and Drop":/Single Click/.toString(),"X coordinate":/740/.toString(),"Y coordinate":/657/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/idea1/.toString())
        //Set Right Side Controls in Whiteboard
        new actions.Whiteboards.SetRightSideControlsWhiteboard().run("Fill Color":/3498DB/.toString(),"Fill Color Opacity":/50/.toString(),"Text Font":/Balsamiq Sans/.toString(),"Font Color":/4188AB/.toString(),"Font Size":/18/.toString())
        //Set Right Side Controls in Whiteboard
        new actions.Whiteboards.SetRightSideControlsWhiteboard().run("X":/-465/.toString(),"Y":/103.5/.toString())
        //Set Right Side Controls in Whiteboard
        new actions.Whiteboards.SetRightSideControlsWhiteboard().run("R":/0/.toString())
        //Click on Whiteboard Canvas
        new actions.Whiteboards.ClickOnWhiteboardCanvas().run("X coordinate":/-100/.toString(),"Y coordinate":/0/.toString(),"Single Double or Right Click":/Single Click/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Control + A/.toString())
        //Compare Images
        new actions.selenium.CompareImages().run("Element ID (optional)":/\/\/DIV[contains(@class,'f-canvas-controls-container')]/.toString(),"Expected Image File":/C131405_2_expected.png/.toString(),"Actual Image Name":/C131405_2_actual.png/.toString(),"Crop Screenshot Start at X":/0/.toString(),"Crop Screenshot Start at Y":/0/.toString(),"Crop Screenshot Width":/230/.toString(),"Crop Screenshot Height":/800/.toString(),"Allowed Number of Different Pixels":/100/.toString())
        //Click on Whiteboard Tool
        new actions.Whiteboards.ClickOnWhiteboardTool().run("Tool Type":/Shapes/.toString())
        //Set Shapes Tool in Whiteboard
        new actions.Whiteboards.SetShapesToolWhiteboard().run("Add via Single Click or Drag and Drop":/Single Click/.toString(),"Select Shape (if other than square)":/square/.toString(),"X coordinate":/250/.toString(),"Y coordinate":/250/.toString())
        //Set Right Side Controls in Whiteboard
        new actions.Whiteboards.SetRightSideControlsWhiteboard().run("Update Rounded Corner":true,"Rounded Corners Radius":/30/.toString(),"Add Border":true)
        //Set Right Side Controls in Whiteboard
        new actions.Whiteboards.SetRightSideControlsWhiteboard().run("X":/-951/.toString(),"Y":/-302/.toString())
        //Compare Images
        new actions.selenium.CompareImages().run("Element ID (optional)":/\/\/DIV[contains(@class,'f-canvas-controls-container')]/.toString(),"Expected Image File":/C131405_1_expected.png/.toString(),"Actual Image Name":/C131405_1_actual.png/.toString(),"Crop Screenshot Start at X":/0/.toString(),"Crop Screenshot Start at Y":/0/.toString(),"Crop Screenshot Width":/230/.toString(),"Crop Screenshot Height":/800/.toString(),"Allowed Number of Different Pixels":/100/.toString())
        //Go Back From Whiteboard
        new actions.Whiteboards.GoBackFromWhiteboard().run([:])
        //Create Whiteboard or Edit Template
        new actions.Whiteboards.CreateWhiteboardFromUserhome().run("Create New or Choose Template":/New Blank Whiteboard/.toString())
        //Set Whiteboard Title
        new actions.Whiteboards.EditTitleOfWhiteboard().run("Title":/C131405_template/.toString(),"Action":/Submit/.toString())
        //Click on Whiteboard Tool
        new actions.Whiteboards.ClickOnWhiteboardTool().run("Tool Type":/Templates/.toString())
        //Set Add Template on Whiteboard Page
        new actions.Whiteboards.SetAddTemplateWhiteboardPage().run("Template Title":/5 Whys/.toString(),"Action":/Add Template/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Compare Images
        new actions.selenium.CompareImages().run("Element ID (optional)":/\/\/DIV[contains(@class,'f-canvas-controls-container')]/.toString(),"Expected Image File":/C131405_3_expected.png/.toString(),"Actual Image Name":/C131405_3_actual.png/.toString(),"Crop Screenshot Start at X":/0/.toString(),"Crop Screenshot Start at Y":/0/.toString(),"Crop Screenshot Width":/230/.toString(),"Crop Screenshot Height":/1000/.toString(),"Allowed Number of Different Pixels":/100/.toString())
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
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C131405_1_actual.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C131405_2_actual.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C131405_3_actual.png/.toString())
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