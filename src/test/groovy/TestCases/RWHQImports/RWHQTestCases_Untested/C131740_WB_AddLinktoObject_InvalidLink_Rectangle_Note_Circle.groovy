import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C131740 - WB - Add Link to Object - Invalid Link (Rectangle, Note, Circle)
class C131740_WB_AddLinktoObject_InvalidLink_Rectangle_Note_Circle
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
        new actions.Whiteboards.CreateWhiteboardFromUserhome().run("Create New or Choose Template":/New Blank Whiteboard/.toString())
        //Set Whiteboard Title
        new actions.Whiteboards.EditTitleOfWhiteboard().run("Title":/C131740/.toString(),"Action":/Submit/.toString())
        //Click on Whiteboard Tool
        new actions.Whiteboards.ClickOnWhiteboardTool().run("Tool Type":/Shapes/.toString())
        //Set Shapes Tool in Whiteboard
        new actions.Whiteboards.SetShapesToolWhiteboard().run("Add via Single Click or Drag and Drop":/Single Click/.toString(),"X coordinate":/250/.toString(),"Y coordinate":/250/.toString())
        //Set Right Side Controls in Whiteboard
        new actions.Whiteboards.SetRightSideControlsWhiteboard().run("Links - Add":true)
        //Set Whiteboard Add Link Dialog
        new actions.Whiteboards.SetWhiteboardAddLinkDialog().run("URL":/www.example.com\/path with space/.toString(),"Action":/Submit/.toString())
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/*[contains(@class,'modal-body')]\/\/*[contains(@class,'error') and text()='Please enter a valid url']/.toString(),"Should Element Exist":true,"Number of Matches":/1/.toString())
        //Set Whiteboard Add Link Dialog
        new actions.Whiteboards.SetWhiteboardAddLinkDialog().run("Action":/Cancel/.toString())
        //Click on Whiteboard Tool
        new actions.Whiteboards.ClickOnWhiteboardTool().run("Tool Type":/Sticky Note/.toString())
        //Add Sticky Note to Whiteboard
        new actions.Whiteboards.AddStickyNoteToWhiteboard().run("Add via Double Click or Drag and Drop":/Single Click/.toString(),"X coordinate":/100/.toString(),"Y coordinate":/100/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/test note/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Escape/.toString())
        //Set Right Side Controls in Whiteboard
        new actions.Whiteboards.SetRightSideControlsWhiteboard().run("Links - Add":true)
        //Set Whiteboard Add Link Dialog
        new actions.Whiteboards.SetWhiteboardAddLinkDialog().run("URL":/http:\/\/example/.toString(),"Action":/Submit/.toString())
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/*[contains(@class,'modal-body')]\/\/*[contains(@class,'error') and text()='Please enter a valid url']/.toString(),"Should Element Exist":true,"Number of Matches":/1/.toString())
        //Set Whiteboard Add Link Dialog
        new actions.Whiteboards.SetWhiteboardAddLinkDialog().run("Action":/Cancel/.toString())
        //Set Right Side Controls in Whiteboard
        new actions.Whiteboards.SetRightSideControlsWhiteboard().run("Links - Add":true)
        //Set Whiteboard Add Link Dialog
        new actions.Whiteboards.SetWhiteboardAddLinkDialog().run("URL":/http:\/\//.toString(),"Action":/Submit/.toString())
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/*[contains(@class,'modal-body')]\/\/*[contains(@class,'error') and text()='Please enter a valid url']/.toString(),"Should Element Exist":true,"Number of Matches":/1/.toString())
        //Set Whiteboard Add Link Dialog
        new actions.Whiteboards.SetWhiteboardAddLinkDialog().run("Action":/Cancel/.toString())
        //Click on Whiteboard Tool
        new actions.Whiteboards.ClickOnWhiteboardTool().run("Tool Type":/Shapes/.toString())
        //Set Shapes Tool in Whiteboard
        new actions.Whiteboards.SetShapesToolWhiteboard().run("Add via Single Click or Drag and Drop":/Single Click/.toString(),"Select Shape (if other than square)":/circle/.toString(),"X coordinate":/100/.toString(),"Y coordinate":/0/.toString())
        //Set Right Side Controls in Whiteboard
        new actions.Whiteboards.SetRightSideControlsWhiteboard().run("Links - Add":true)
        //Set Whiteboard Add Link Dialog
        new actions.Whiteboards.SetWhiteboardAddLinkDialog().run("URL":/http:\/\/www.example.c/.toString(),"Action":/Submit/.toString())
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/*[contains(@class,'modal-body')]\/\/*[contains(@class,'error') and text()='Please enter a valid url']/.toString(),"Should Element Exist":true,"Number of Matches":/1/.toString())
        //Set Whiteboard Add Link Dialog
        new actions.Whiteboards.SetWhiteboardAddLinkDialog().run("Action":/Submit/.toString())
        //Set Whiteboard Add Link Dialog
        new actions.Whiteboards.SetWhiteboardAddLinkDialog().run("Action":/Cancel/.toString())
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