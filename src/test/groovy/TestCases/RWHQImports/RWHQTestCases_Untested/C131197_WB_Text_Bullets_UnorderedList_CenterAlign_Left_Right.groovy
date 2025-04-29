import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131197 - WB - Text - Bullets - Unordered List, Center Align,Left,Right
class C131197_WB_Text_Bullets_UnorderedList_CenterAlign_Left_Right
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
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Escape/.toString())
        //Set Right Side Controls in Whiteboard
        new actions.Whiteboards.SetRightSideControlsWhiteboard().run("Bullets: unordered list":true)
        //Set Right Side Controls in Whiteboard
        new actions.Whiteboards.SetRightSideControlsWhiteboard().run("Horizontal Alignment":/Align center/.toString())
        //Compare Images
        new actions.selenium.CompareImages().run("Expected Image File":/C131197_1_expected3282025.png/.toString(),"Actual Image Name":/C131197_1_actual.png/.toString(),"Crop Screenshot Start at X":/200/.toString(),"Crop Screenshot Start at Y":/200/.toString(),"Crop Screenshot Width":/750/.toString(),"Crop Screenshot Height":/250/.toString(),"Do Not Scroll":true)
        //Set Right Side Controls in Whiteboard
        new actions.Whiteboards.SetRightSideControlsWhiteboard().run("Horizontal Alignment":/Align left/.toString())
        //Compare Images
        new actions.selenium.CompareImages().run("Expected Image File":/C131197_2_expected3282025.png/.toString(),"Actual Image Name":/C131197_2_actual.png/.toString(),"Crop Screenshot Start at X":/200/.toString(),"Crop Screenshot Start at Y":/200/.toString(),"Crop Screenshot Width":/750/.toString(),"Crop Screenshot Height":/250/.toString(),"Do Not Scroll":true)
        //Set Right Side Controls in Whiteboard
        new actions.Whiteboards.SetRightSideControlsWhiteboard().run("Horizontal Alignment":/Align right/.toString())
        //Compare Images
        new actions.selenium.CompareImages().run("Expected Image File":/C131197_3_expected3282025.png/.toString(),"Actual Image Name":/C131197_3_actual.png/.toString(),"Crop Screenshot Start at X":/200/.toString(),"Crop Screenshot Start at Y":/200/.toString(),"Crop Screenshot Width":/750/.toString(),"Crop Screenshot Height":/250/.toString(),"Do Not Scroll":true)
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
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C131197_1_actual.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C131197_2_actual.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C131197_3_actual.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/difference.png/.toString())
        }
       catch(all){}catch(Error err){}
    }
}