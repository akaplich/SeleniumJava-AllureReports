import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C131331 - Memo - Collab Editor - Filter Comments, All, Open, Assigned To Me, Resolved
class C131331_Memo_CollabEditor_FilterComments_All_Open_AssignedToMe_Resolved
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
        //Wait
        new actions.general.Wait().run("Seconds":/3/.toString())
        //Collab Editor - Set Memo Title
        new actions.Memo.ColabEditorSetMemoTitle().run("New Title":/Comment Test/.toString(),"Action":/Submit/.toString())
        //Collab Editor - Set Text
        new actions.Memo.ColabEditorSetText().run("Text":/Brightidea1/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Control + A/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/BUTTON[contains(@class,'f-slate-comment-btn')]/.toString())
        //Collab Editor - Add Comment
        new actions.Memo.CollabEditorAddComment().run("Comment":/evaluator assigned/.toString(),"Parent or Reply":/Parent/.toString(),"Action":/Comment/.toString(),"Tag Usernames":/Evaluator/.toString(),"Tag Email":/evaluator@test.com/.toString(),"Assign to Username":/Evaluator/.toString())
        //Collab Editor - Set Text
        new actions.Memo.ColabEditorSetText().run("Text":/ space/.toString())
        //Send Keyboard Action
        new actions.selenium.SendKeyboardAction().run("Button":/ENTER/.toString())
        //Send Keyboard Action
        new actions.selenium.SendKeyboardAction().run("Button":/ENTER/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/1/.toString())
        //Collab Editor - Set Text
        new actions.Memo.ColabEditorSetText().run("Text":/Innovation/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Shift + Up/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/BUTTON[contains(@class,'f-slate-comment-btn')]/.toString())
        //Collab Editor - Add Comment
        new actions.Memo.CollabEditorAddComment().run("Comment":/regular comment one/.toString(),"Parent or Reply":/Parent/.toString(),"Action":/Comment/.toString())
        //Collab Editor - Set Text
        new actions.Memo.ColabEditorSetText().run("Text":/ space/.toString())
        //Send Keyboard Action
        new actions.selenium.SendKeyboardAction().run("Button":/ENTER/.toString())
        //Send Keyboard Action
        new actions.selenium.SendKeyboardAction().run("Button":/ENTER/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/1/.toString())
        //Collab Editor - Set Text
        new actions.Memo.ColabEditorSetText().run("Text":/Ideas/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Shift + Up/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/BUTTON[contains(@class,'f-slate-comment-btn')]/.toString())
        //Collab Editor - Add Comment
        new actions.Memo.CollabEditorAddComment().run("Comment":/tagged comment/.toString(),"Parent or Reply":/Parent/.toString(),"Action":/Comment/.toString(),"Tag Usernames":/Evaluator/.toString(),"Tag Email":/evaluator@test.com/.toString())
        //Copy Current URL
        variables."currentURL" = new actions.selenium.CopyCurrentURL().run([:])
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Close All Browsers
        new actions.selenium.CloseBrowser().run([:])
        //Open Browser
        new actions.selenium.Browser().run("URL":/${variables."affiliateURL"}/.toString(),"Browser Type":/Chrome/.toString())
        //Login
        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."currentURL"}/.toString())
        //Collab Editor - Verify Memo Comment
        new actions.Memo.CollabEditorVerifyMemoComment().run("Where to verify the comments?":/Dropdown List from Top Bar/.toString(),"Click Open/Close Comments in Top Bar":true,"Filtered Comment Count (if filter is on)":/Comments (3)/.toString())
        //Collab Editor - Set Comment Filter
        new actions.Memo.CollabEditorSetCommentFilter().run("Filter Option":/Assigned to me/.toString())
        //Collab Editor - Verify Memo Comment
        new actions.Memo.CollabEditorVerifyMemoComment().run("Where to verify the comments?":/Dropdown List from Top Bar/.toString(),"Comment Count":/1/.toString(),"Commenter Name":/System Admin/.toString(),"Comment to Verify":/evaluator assigned/.toString(),"Tagged Users":/Evaluator/.toString(),"Number of Matches":/1/.toString(),"Assigned to":/Evaluator/.toString(),"Filtered Comment Count (if filter is on)":/Comment (1)/.toString())
        //Collab Editor - Set Comment Filter
        new actions.Memo.CollabEditorSetCommentFilter().run("Filter Option":/Open/.toString())
        //Collab Editor - Verify Memo Comment
        new actions.Memo.CollabEditorVerifyMemoComment().run("Where to verify the comments?":/Dropdown List from Top Bar/.toString(),"Comment Count":/3/.toString(),"Commenter Name":/System Admin/.toString(),"Comment to Verify":/tagged comment/.toString(),"Tagged Users":/Evaluator/.toString(),"Number of Matches":/1/.toString(),"Filtered Comment Count (if filter is on)":/Comments (3)/.toString())
        //Collab Editor - Verify Memo Comment
        new actions.Memo.CollabEditorVerifyMemoComment().run("Where to verify the comments?":/Dropdown List from Top Bar/.toString(),"Comment Count":/3/.toString(),"Commenter Name":/System Admin/.toString(),"Comment to Verify":/regular comment one/.toString(),"Number of Matches":/1/.toString(),"Filtered Comment Count (if filter is on)":/Comments (3)/.toString())
        //Collab Editor - Verify Memo Comment
        new actions.Memo.CollabEditorVerifyMemoComment().run("Where to verify the comments?":/Dropdown List from Top Bar/.toString(),"Comment Count":/3/.toString(),"Commenter Name":/System Admin/.toString(),"Comment to Verify":/evaluator assigned/.toString(),"Tagged Users":/Evaluator/.toString(),"Number of Matches":/1/.toString(),"Assigned to":/Evaluator/.toString(),"Filtered Comment Count (if filter is on)":/Comments (3)/.toString())
        //Collab Editor - Set Memo Comment Edit Menu
        new actions.Memo.SetMemoCommentEditMenu().run("Where to edit the comments?":/Dropdown List from Top Bar/.toString(),"What Comment to Edit":/evaluator assigned/.toString(),"Menu Option":/Mark as resolved/.toString())
        try{
            //Collab Editor - Set Comment Filter
            new actions.Memo.CollabEditorSetCommentFilter().run("Filter Option":/Resolved/.toString())
        }
       catch(all){}catch(Error err){}
        //Collab Editor - Verify Memo Comment
        new actions.Memo.CollabEditorVerifyMemoComment().run("Where to verify the comments?":/Dropdown List from Top Bar/.toString(),"Comment Count":/1/.toString(),"Commenter Name":/System Admin/.toString(),"Comment to Verify":/evaluator assigned/.toString(),"Tagged Users":/Evaluator/.toString(),"Marked As Resolved":true,"Number of Matches":/1/.toString(),"Filtered Comment Count (if filter is on)":/Comment (1)/.toString())
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