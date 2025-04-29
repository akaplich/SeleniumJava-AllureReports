import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131508 - WB - Shared - Anyone With Link Can View - System Admins
class C131508_WB_Shared_AnyoneWithLinkCanView_SystemAdmins
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
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString(),"Highlights":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Whiteboards/.toString())
        //Create Whiteboard or Edit Template
        new actions.Whiteboards.CreateWhiteboardFromUserhome().run("Create New or Choose Template":/New Blank Whiteboard/.toString())
        //Set Whiteboard Title
        new actions.Whiteboards.EditTitleOfWhiteboard().run("Title":/C131508/.toString(),"Action":/Submit/.toString())
        //Whiteboard - Set Share
        new actions.Whiteboards.SetShareWhiteboard().run("Click Share Button":true,"Anyone with link...":/can view/.toString(),"Action":/Close/.toString())
        //Copy Current URL
        variables."currentURL" = new actions.selenium.CopyCurrentURL().run([:])
        //Go Back From Whiteboard
        new actions.Whiteboards.GoBackFromWhiteboard().run([:])
        //Log Out
        new actions.general.LogOut().run([:])
        //Close All Browsers
        new actions.selenium.CloseBrowser().run([:])
        //Open Browser
        new actions.selenium.Browser().run("URL":/${variables."affiliateURL"}/.toString(),"Browser Type":/Chrome/.toString())
        //Login
        new actions.general.Login().run("Email":/nonbisysadmin@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."currentURL"}/.toString())
        try{
            //Set Whiteboard Title
            new actions.Whiteboards.EditTitleOfWhiteboard().run("Title":/C131508Updated/.toString(),"Action":/Submit/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Whiteboard Title
        new actions.Whiteboards.VerifyWhiteboardTitle().run("Title":/C131508/.toString())
        try{
            //Click on Whiteboard Tool
            new actions.Whiteboards.ClickOnWhiteboardTool().run("Tool Type":/Shapes/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Set Shapes Tool in Whiteboard
            new actions.Whiteboards.SetShapesToolWhiteboard().run("Add via Single Click or Drag and Drop":/Single Click/.toString(),"X coordinate":/250/.toString(),"Y coordinate":/250/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Smart Matrix & Other Elements Exists On Whiteboard
        new actions.Whiteboards.VerifySmartMatrixExists().run("Element (skip if verifying text)":/Rectangle 1/.toString(),"Should Exist":false)
        try{
            //Set Whiteboard Top Bar
            new actions.Whiteboards.SetWhiteboardMenuDropdowninTopBar().run("Menu Option":/Preferences/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/UL[@class='f-dropdown-options']\/LI\/DIV[@class='f-menu-item']\/*[contains(.,'Preferences')]/.toString(),"Should Element Exist":false,"Number of Matches":/0/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Escape/.toString())
        //Set Whiteboard Top Bar
        new actions.Whiteboards.SetWhiteboardMenuDropdowninTopBar().run("Menu Option":/File/.toString(),"Sub Option":/Share.../.toString())
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/*[contains(@class,'f-disable-share')]/.toString(),"Should Element Exist":true,"Number of Matches":/1/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Escape/.toString())
        try{
            //Set Whiteboard Top Bar
            new actions.Whiteboards.SetWhiteboardMenuDropdowninTopBar().run("Menu Option":/Edit/.toString(),"Sub Option":/Delete.../.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/UL[@class='f-dropdown-options']\/LI\/DIV[@class='f-menu-item']\/*[contains(.,'Delete')]/.toString(),"Should Element Exist":false,"Number of Matches":/0/.toString())
        try{
            //Set Whiteboard Top Bar
            new actions.Whiteboards.SetWhiteboardMenuDropdowninTopBar().run("Menu Option":/Edit/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/UL[@class='f-dropdown-options']\/LI\/DIV[@class='f-menu-item']\/*[contains(.,'Rename')]/.toString(),"Should Element Exist":false,"Number of Matches":/0/.toString())
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