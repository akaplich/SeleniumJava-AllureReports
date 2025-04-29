package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131150 - WB - Shared - Top Bar for View Only User
class C131150_WB_Shared_TopBarforViewOnlyUser
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
        Action58123c20fa4ee77809f468f6("Run Browser in Incognito":/TRUE/.toString())
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
        new actions.selenium.Browser().run("Run Browser in Incognito":/TRUE/.toString(),"URL":/${variables."affiliateURL"}/.toString(),"Browser Type":/Chrome/.toString())
        //Login
        new actions.general.Login().run("Email":/moderator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."currentURL"}/.toString())
        //Set Whiteboard Top Bar
        new actions.Whiteboards.SetWhiteboardMenuDropdowninTopBar().run("Menu Option":/Whiteboard Help.../.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Window Name":/Getting Started with Whiteboard – Brightidea Support Portal/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."currentURL"}/.toString())
        try{
            //Set Whiteboard Top Bar
            new actions.Whiteboards.SetWhiteboardMenuDropdowninTopBar().run("Menu Option":/Preferences/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/UL[@class='f-dropdown-options']\/LI\/DIV[@class='f-menu-item']\/*[contains(.,'Preferences')]/.toString(),"Should Element Exist":false,"Number of Matches":/0/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Set Whiteboard Top Bar
        new actions.Whiteboards.SetWhiteboardMenuDropdowninTopBar().run("Menu Option":/Keyboard Shortcuts.../.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/*[contains(@class,'fractal-modal-header')]\/\/*[contains(@class,'close-button')]/.toString())
        //Set Whiteboard Top Bar
        new actions.Whiteboards.SetWhiteboardMenuDropdowninTopBar().run("Menu Option":/File/.toString(),"Sub Option":/Share.../.toString())
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/*[contains(@class,'f-disable-share')]/.toString(),"Should Element Exist":true,"Number of Matches":/1/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Escape/.toString())
        //Set Whiteboard Top Bar
        new actions.Whiteboards.SetWhiteboardMenuDropdowninTopBar().run("Create My Own":true)
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Window Name":/Untitled Whiteboard/.toString())
        //Set Whiteboard Top Bar
        new actions.Whiteboards.SetWhiteboardMenuDropdowninTopBar().run("Menu Option":/Edit/.toString(),"Sub Option":/Delete.../.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."currentURL"}/.toString())
        //Set Whiteboard Top Bar
        new actions.Whiteboards.SetWhiteboardMenuDropdowninTopBar().run("Menu Option":/File/.toString(),"Sub Option":/New Whiteboard/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Window Name":/Untitled Whiteboard/.toString())
        //Set Whiteboard Top Bar
        new actions.Whiteboards.SetWhiteboardMenuDropdowninTopBar().run("Menu Option":/Edit/.toString(),"Sub Option":/Delete.../.toString())
        //Close All Browsers
        new actions.selenium.CloseBrowser().run([:])
        //Open Browser
        new actions.selenium.Browser().run("URL":/${variables."affiliateURL"}/.toString(),"Browser Type":/Chrome/.toString())
        //Login
        new actions.general.Login().run("Email":/moderator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."currentURL"}/.toString())
        //Set Whiteboard Top Bar
        new actions.Whiteboards.SetWhiteboardMenuDropdowninTopBar().run("Menu Option":/File/.toString(),"Sub Option":/Save as Template.../.toString())
        //Whiteboard - Set Save As Template
        new actions.Whiteboards.WhiteboardSetSaveAsTemplate().run("Template Name":/test template C131150/.toString(),"Action":/Save Template/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/10/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/1/.toString())
        //Whiteboard - Set Share
        new actions.Whiteboards.SetShareWhiteboard().run("User(s)":/End User/.toString(),"User Add or Remove":/Add/.toString(),"Send Invite":true,"Anyone with link...":/can use/.toString(),"Action":/Close/.toString(),"Copy Link":true)
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."currentURL"}/.toString())
        //Set Whiteboard Top Bar
        new actions.Whiteboards.SetWhiteboardMenuDropdowninTopBar().run("Menu Option":/File/.toString(),"Sub Option":/Link to Record.../.toString())
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/SPAN[@class='title']\/SPAN[.='Link Whiteboard to Idea']/.toString(),"Should Element Exist":true,"Number of Matches":/1/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Escape/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Set Whiteboard Top Bar
        new actions.Whiteboards.SetWhiteboardMenuDropdowninTopBar().run("Menu Option":/File/.toString(),"Sub Option":/Save a Copy/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Window Name":/Copy of TestLink/.toString())
        //Verify Whiteboard Title
        new actions.Whiteboards.VerifyWhiteboardTitle().run("Title":/Copy of TestLink/.toString())
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