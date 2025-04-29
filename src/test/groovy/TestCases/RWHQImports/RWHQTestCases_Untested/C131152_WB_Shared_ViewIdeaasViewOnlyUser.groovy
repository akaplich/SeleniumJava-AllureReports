package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131152 - WB - Shared - View Idea as View Only User
class C131152_WB_Shared_ViewIdeaasViewOnlyUser
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
        new actions.Whiteboards.EditTitleOfWhiteboard().run("Title":/TestLink/.toString(),"Action":/Submit/.toString())
        //Click on Whiteboard Tool
        new actions.Whiteboards.ClickOnWhiteboardTool().run("Tool Type":/Sticky Note/.toString())
        //Add Sticky Note to Whiteboard
        new actions.Whiteboards.AddStickyNoteToWhiteboard().run("Add via Double Click or Drag and Drop":/Single Click/.toString(),"X coordinate":/950/.toString(),"Y coordinate":/500/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/IdeaLink/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Escape/.toString())
        //Whiteboard - Set Right Click on Object
        new actions.Whiteboards.SetRightClickonStickyNote().run("Right Click on Sticky Note":true,"Add to pipeline":/Custom App/.toString(),"Add to pipeline Action":/Add/.toString())
        //Click on Whiteboard Canvas
        new actions.Whiteboards.ClickOnWhiteboardCanvas().run("X coordinate":/30/.toString(),"Y coordinate":/70/.toString(),"Single Double or Right Click":/Right Click/.toString())
        //Whiteboard - Set Right Click on Object
        new actions.Whiteboards.SetRightClickonStickyNote().run("View idea details":true)
        //Set and Verify Toggle Visibility
        new actions.ViewIdea30.SetToggleVisibility().run("Toggle Visibility":true)
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Close Idea Modal":true)
        //Copy Current URL
        variables."currentURL" = new actions.selenium.CopyCurrentURL().run([:])
        //Whiteboard - Set Share
        new actions.Whiteboards.SetShareWhiteboard().run("Click Share Button":true,"Anyone with link...":/can view/.toString(),"Action":/Close/.toString())
        //Go Back From Whiteboard
        new actions.Whiteboards.GoBackFromWhiteboard().run([:])
        //Log Out
        new actions.general.LogOut().run([:])
        //Close All Browsers
        new actions.selenium.CloseBrowser().run([:])
        //Open Browser
        new actions.selenium.Browser().run("URL":/${variables."affiliateURL"}/.toString(),"Browser Type":/Chrome/.toString())
        //Login
        new actions.general.Login().run("Email":/analyst@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."currentURL"}/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/SPAN[contains(@class,'f-canvas-name')]/.toString())
        //Click on Whiteboard Canvas
        new actions.Whiteboards.ClickOnWhiteboardCanvas().run("X coordinate":/1260/.toString(),"Y coordinate":/620/.toString(),"Single Double or Right Click":/Single Click/.toString())
        try{
            //Whiteboard - Set Right Click on Object
            new actions.Whiteboards.SetRightClickonStickyNote().run("Right Click on Sticky Note":true,"View idea details":true)
        }
       catch(all){}catch(Error err){}
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/*[@class='f-canvas-right-click-menu']\/\/*[text()='Send to pipeline...']/.toString(),"Should Element Exist":false,"Number of Matches":/0/.toString())
        //Click on Whiteboard Canvas
        new actions.Whiteboards.ClickOnWhiteboardCanvas().run("X coordinate":/54/.toString(),"Y coordinate":/55/.toString(),"Single Double or Right Click":/Single Click/.toString())
        //Verify Idea on View Idea 30
        new actions.ViewIdea30.VerifyIdeaonViewIdea3().run("Template":/Medium Header/.toString(),"View As":/End User/.toString(),"Idea Name":/IdeaLink(D113)/.toString(),"Idea Image":true,"Category":/Quick Add/.toString(),"Submitter Name":/System Admin/.toString())
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