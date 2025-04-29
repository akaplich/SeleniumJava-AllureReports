package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C131369 - Memo - Comments - Users Comment on Same Text
class C131369_Memo_Comments_UsersCommentonSameText
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
        //Use this action to enable Memo Updates in System Manager Affiliates
        Action6388ddf31dac76f4246846d6([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Memos/.toString())
        //Set Memo Template Tile
        new actions.MTS.SetMemoTemplateTile().run("Template":/Blank Document/.toString())
        //Collab Editor - Set Memo Title
        new actions.Memo.ColabEditorSetMemoTitle().run("New Title":/C131369/.toString(),"Action":/Submit/.toString())
        //Copy Current URL
        variables."currentURL" = new actions.selenium.CopyCurrentURL().run([:])
        //Collab Editor - Set Text
        new actions.Memo.ColabEditorSetText().run("Text":/comment/.toString(),"Key(s)":/Shift + Up/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/BUTTON[contains(@class,'f-slate-comment-btn')]/.toString())
        //Collab Editor - Add Comment
        new actions.Memo.CollabEditorAddComment().run("Comment":/comment from System Admin/.toString(),"Action":/Comment/.toString())
        //Collab Editor - Click Go Back Button
        new actions.Memo.ColabEditorClickGoBackButton().run([:])
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."currentURL"}/.toString())
        //Collab Editor - Set Text
        new actions.Memo.ColabEditorSetText().run("Key(s)":/Shift + Down/.toString())
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/BUTTON[contains(@class,'f-slate-comment-btn')]/.toString(),"Should Element Exist":false)
        try{
            //Collab Editor -  Set ToolBar Options
            new actions.Memo.CollabEditorSetToolBarOptions().run("Comments":true)
        }
       catch(all){}catch(Error err){}
        try{
            //Collab Editor - Add Comment
            new actions.Memo.CollabEditorAddComment().run("Comment":/comment from End User/.toString(),"Action":/Comment/.toString())
        }
       catch(all){}catch(Error err){}
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Collab Editor - Verify Memo Comment
        new actions.Memo.CollabEditorVerifyMemoComment().run("Where to verify the comments?":/Comment Popover Next to Document/.toString(),"Comment Count":/1/.toString(),"Commenter Name":/System Admin/.toString(),"Comment to Verify":/comment from System Admin/.toString(),"Number of Matches":/1/.toString())
        //Collab Editor - Verify Memo Comment
        new actions.Memo.CollabEditorVerifyMemoComment().run("Where to verify the comments?":/Dropdown List from Top Bar/.toString(),"Click Open/Close Comments in Top Bar":true,"Comment Count":/1/.toString(),"Commenter Name":/System Admin/.toString(),"Comment to Verify":/comment from System Admin/.toString(),"Number of Matches":/1/.toString())
        //Collab Editor - Set Text
        new actions.Memo.ColabEditorSetText().run("Key(s)":/Shift + Down/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Right/.toString())
        try{
            //Collab Editor - Set Text
            new actions.Memo.ColabEditorSetText().run("Text":/ t/.toString(),"Key(s)":/Shift + Up/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Click on Element
            new actions.selenium.Click().run("ID":/\/\/BUTTON[contains(@class,'f-slate-comment-btn')]/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Collab Editor - Add Comment
            new actions.Memo.CollabEditorAddComment().run("Comment":/comment from End User/.toString(),"Action":/Comment/.toString())
        }
       catch(all){}catch(Error err){}
        //Refresh
        new actions.selenium.Refresh().run([:])
        try{
            //Collab Editor - Verify Memo Comment
            new actions.Memo.CollabEditorVerifyMemoComment().run("Where to verify the comments?":/Comment Popover Next to Document/.toString(),"Comment Count":/2/.toString(),"Commenter Name":/End User/.toString(),"Comment to Verify":/comment from End User/.toString(),"Number of Matches":/1/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Collab Editor - Verify Memo Comment
            new actions.Memo.CollabEditorVerifyMemoComment().run("Where to verify the comments?":/Dropdown List from Top Bar/.toString(),"Click Open/Close Comments in Top Bar":true,"Comment Count":/2/.toString(),"Commenter Name":/End User/.toString(),"Comment to Verify":/comment from End User/.toString(),"Number of Matches":/1/.toString())
        }
       catch(all){}catch(Error err){}
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
    //Use this action to enable Memo Updates in System Manager Affiliates
    public static def Action6388ddf31dac76f4246846d6(def params){
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for BIOnly Beta tab
        new actions.SetupBI.SetEnterpriseSetupforBIOnlyBetatab().run("Enable memos on Userhome":true,"Create Memo Wizard":true,"Memo BI Templates":true,"Show Memo tab in system setup":true,"Memo AI, Content Updates":true)
        //Wait
        new actions.general.Wait().run("Seconds":/15/.toString())

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