import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C131454 - WB - Marker - Select & Drag Object from Empty Space
class C131454_WB_Marker_SelectAndDragObjectfromEmptySpace
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
        new actions.Whiteboards.CreateWhiteboardFromUserhome().run("Create New or Choose Template":/New Blank Whiteboard/.toString())
        //Set Whiteboard Title
        new actions.Whiteboards.EditTitleOfWhiteboard().run("Title":/C131454/.toString(),"Action":/Submit/.toString())
        //Click on Whiteboard Tool
        new actions.Whiteboards.ClickOnWhiteboardTool().run("Tool Type":/Shapes/.toString())
        //Set Marker or Move Tool in Whiteboard
        new actions.Whiteboards.SetMarkerToolToWhiteboard().run("X coordinate1":/250/.toString(),"Y coordinate1":/250/.toString(),"X coordinate2":/300/.toString(),"Y coordinate2":/200/.toString(),"X coordinate3":/0/.toString(),"Y coordinate3":/0/.toString())
        //Click on Whiteboard Tool
        new actions.Whiteboards.ClickOnWhiteboardTool().run("Tool Type":/Marker/.toString())
        //Click on Whiteboard Canvas
        new actions.Whiteboards.ClickOnWhiteboardCanvas().run("X coordinate":/250/.toString(),"Y coordinate":/250/.toString(),"Single Double or Right Click":/Single Click/.toString())
        //Set Marker or Move Tool in Whiteboard
        new actions.Whiteboards.SetMarkerToolToWhiteboard().run("X coordinate1":/0/.toString(),"Y coordinate1":/0/.toString(),"X coordinate2":/50/.toString(),"Y coordinate2":/100/.toString(),"X coordinate3":/50/.toString(),"Y coordinate3":/-100/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Escape/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/1/.toString())
        //Set Marker or Move Tool in Whiteboard
        new actions.Whiteboards.SetMarkerToolToWhiteboard().run("X coordinate1":/0/.toString(),"Y coordinate1":/0/.toString(),"X coordinate2":/-405/.toString(),"Y coordinate2":/-410/.toString(),"X coordinate3":/0/.toString(),"Y coordinate3":/0/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Escape/.toString())
        //Click on Whiteboard Canvas
        new actions.Whiteboards.ClickOnWhiteboardCanvas().run("X coordinate":/0/.toString(),"Y coordinate":/0/.toString(),"Single Double or Right Click":/Single Click/.toString())
        //Set Marker or Move Tool in Whiteboard
        new actions.Whiteboards.SetMarkerToolToWhiteboard().run("X coordinate1":/-50/.toString(),"Y coordinate1":/50/.toString(),"X coordinate2":/100/.toString(),"Y coordinate2":/0/.toString(),"X coordinate3":/0/.toString(),"Y coordinate3":/0/.toString())
        //Compare Images
        new actions.selenium.CompareImages().run("Expected Image File":/C131454_Expected3282025.png/.toString(),"Actual Image Name":/C131454_actual.png/.toString(),"Crop Screenshot Start at X":/200/.toString(),"Crop Screenshot Start at Y":/230/.toString(),"Crop Screenshot Width":/720/.toString(),"Crop Screenshot Height":/300/.toString(),"Allowed Number of Different Pixels":/50/.toString())
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
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C131454_actual.png/.toString())
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