package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C131371 - Memo - Comments - Anyone With Link Can Edit
class C131371_Memo_Comments_AnyoneWithLinkCanEdit
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
        new actions.Memo.ColabEditorSetMemoTitle().run("New Title":/C131371/.toString(),"Action":/Submit/.toString())
        //Collab Editor/Userhome - Memo Share Dialog -  Set Participants
        new actions.Memo.MemoShareDialogSetParticipants().run("Click Share Button":true,"Anyone With Link":/can edit/.toString(),"Action":/Close/.toString())
        //Collab Editor - Set Text
        new actions.Memo.ColabEditorSetText().run("Text":/Aenean cursus nunc orci, ac sollicitudin purus vestibulum sit amet. In gravida, leo et scelerisque rutrum, orci libero aliquam lectus, sed molestie massa libero eget ligula. Aliquam commodo vulputate lacinia. Nullam mollis, lectus non congue suscipit, tortor augue elementum odio, eget condimentum est libero et mi. Mauris eu nunc odio. Maecenas dignissim ligula nisi, vitae commodo neque molestie a. Sed dapibus tincidunt sodales./.toString(),"Key(s)":/ENTER/.toString())
        //Collab Editor - Set Text
        new actions.Memo.ColabEditorSetText().run("Focus on paragraph (not working)":/Last/.toString(),"Text":/Morbi condimentum pretium erat ut euismod. /.toString(),"Key(s)":/Enter/.toString())
        //Collab Editor - Set Text
        new actions.Memo.ColabEditorSetText().run("Focus on paragraph (not working)":/Last/.toString(),"Text":/Nullam scelerisque nec metus nec vestibulum. Morbi metus dolor, tincidunt eget eleifend rhoncus, aliquet nec massa. Donec aliquet magna non massa maximus, vel luctus nisl viverra./.toString(),"Key(s)":/Enter/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Shift + Up/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/BUTTON[contains(@class,'f-slate-comment-btn')]/.toString())
        //Collab Editor - Add Comment
        new actions.Memo.CollabEditorAddComment().run("Comment":/comment from System Admin/.toString(),"Parent or Reply":/Parent/.toString(),"Action":/Comment/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Escape/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Up/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Shift + Up/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/BUTTON[contains(@class,'f-slate-comment-btn')]/.toString())
        //Collab Editor - Add Comment
        new actions.Memo.CollabEditorAddComment().run("Comment":/comment mark me resolved/.toString(),"Parent or Reply":/Parent/.toString(),"Action":/Comment/.toString())
        //Copy Current URL
        variables."currentURL" = new actions.selenium.CopyCurrentURL().run([:])
        //Collab Editor - Click Go Back Button
        new actions.Memo.ColabEditorClickGoBackButton().run([:])
        //Log Out
        new actions.general.LogOut().run([:])
        //Close All Browsers
        new actions.selenium.CloseBrowser().run([:])
        //Open Browser
        new actions.selenium.Browser().run("URL":/${variables."affiliateURL"}/.toString(),"Browser Type":/Chrome/.toString())
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."currentURL"}/.toString())
        try{
            //Collab Editor - Set Memo Comment Edit Menu
            new actions.Memo.SetMemoCommentEditMenu().run("Where to edit the comments?":/Comment Popover Next to Document/.toString(),"What Comment to Edit":/comment mark me resolved/.toString(),"Menu Option":/Edit/.toString(),"Edited Comment":/edited comment/.toString())
        }
       catch(all){}catch(Error err){}
        //Collab Editor - Verify Memo Comment
        new actions.Memo.CollabEditorVerifyMemoComment().run("Where to verify the comments?":/Comment Popover Next to Document/.toString(),"Comment Count":/2/.toString(),"Commenter Name":/System Admin/.toString(),"Comment to Verify":/comment mark me resolved/.toString(),"Number of Matches":/1/.toString())
        try{
            //Collab Editor - Set Memo Comment Edit Menu
            new actions.Memo.SetMemoCommentEditMenu().run("Where to edit the comments?":/Comment Popover Next to Document/.toString(),"What Comment to Edit":/comment mark me resolved/.toString(),"Menu Option":/Delete/.toString(),"Delete Action":/Delete/.toString())
        }
       catch(all){}catch(Error err){}
        //Collab Editor - Verify Memo Comment
        new actions.Memo.CollabEditorVerifyMemoComment().run("Where to verify the comments?":/Comment Popover Next to Document/.toString(),"Comment Count":/2/.toString(),"Commenter Name":/System Admin/.toString(),"Comment to Verify":/comment mark me resolved/.toString(),"Number of Matches":/1/.toString())
        //Collab Editor - Set Memo Comment Edit Menu
        new actions.Memo.SetMemoCommentEditMenu().run("Where to edit the comments?":/Comment Popover Next to Document/.toString(),"What Comment to Edit":/comment mark me resolved/.toString(),"Menu Option":/Copy Link/.toString())
        //Collab Editor - Set Memo Comment Edit Menu
        new actions.Memo.SetMemoCommentEditMenu().run("Where to edit the comments?":/Comment Popover Next to Document/.toString(),"What Comment to Edit":/comment mark me resolved/.toString(),"Menu Option":/Mark as resolved/.toString())
        //Collab Editor - Verify Memo Comment
        new actions.Memo.CollabEditorVerifyMemoComment().run("Where to verify the comments?":/Comment Popover Next to Document/.toString(),"Comment Count":/1/.toString(),"Commenter Name":/System Admin/.toString(),"Comment to Verify":/comment from System Admin/.toString(),"Marked As Resolved":true,"Number of Matches":/1/.toString())
        //Collab Editor - Set Text
        new actions.Memo.ColabEditorSetText().run([:])
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Shift + Down/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/BUTTON[contains(@class,'f-slate-comment-btn')]/.toString())
        //Collab Editor - Add Comment
        new actions.Memo.CollabEditorAddComment().run("Comment":/comment from End User/.toString(),"Parent or Reply":/Parent/.toString(),"Action":/Comment/.toString())
        //Collab Editor - Verify Memo Comment
        new actions.Memo.CollabEditorVerifyMemoComment().run("Where to verify the comments?":/Comment Popover Next to Document/.toString(),"Comment Count":/2/.toString(),"Commenter Name":/End User/.toString(),"Comment to Verify":/comment from End User/.toString(),"Number of Matches":/1/.toString())
        //Collab Editor - Set Memo Comment Edit Menu
        new actions.Memo.SetMemoCommentEditMenu().run("Where to edit the comments?":/Dropdown List from Top Bar/.toString(),"Click Open/Close Comments in Top Bar":true,"What Comment to Edit":/comment from End User/.toString(),"Menu Option":/Edit/.toString(),"Edited Comment":/edited comment form End User/.toString())
        //Collab Editor - Set Text
        new actions.Memo.ColabEditorSetText().run([:])
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Down/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Shift + Down/.toString())
        //Collab Editor -  Set ToolBar Options
        new actions.Memo.CollabEditorSetToolBarOptions().run("Comments":true)
        //Collab Editor - Add Comment
        new actions.Memo.CollabEditorAddComment().run("Comment":/comment for Evaluator/.toString(),"Parent or Reply":/Parent/.toString(),"Action":/Comment/.toString(),"Tag Usernames":/Evaluator/.toString(),"Tag Email":/evaluator@test.com/.toString(),"Assign to Username":/Evaluator/.toString())
        //Collab Editor - Verify Memo Comment
        new actions.Memo.CollabEditorVerifyMemoComment().run("Where to verify the comments?":/Comment Popover Next to Document/.toString(),"Comment Count":/3/.toString(),"Commenter Name":/End User/.toString(),"Comment to Verify":/comment for Evaluator/.toString(),"Marked As Resolved":true,"Number of Matches":/1/.toString())
        //Collab Editor - Verify Memo Comment
        new actions.Memo.CollabEditorVerifyMemoComment().run("Where to verify the comments?":/Dropdown List from Top Bar/.toString(),"Click Open/Close Comments in Top Bar":true,"Comment Count":/4/.toString(),"Commenter Name":/System Admin/.toString(),"Comment to Verify":/comment mark me resolved/.toString(),"Marked As Resolved":true,"Number of Matches":/1/.toString())
        //Collab Editor - Verify Memo Comment
        new actions.Memo.CollabEditorVerifyMemoComment().run("Where to verify the comments?":/Dropdown List from Top Bar/.toString(),"Comment Count":/4/.toString(),"Commenter Name":/System Admin/.toString(),"Comment to Verify":/comment from System Admin/.toString(),"Number of Matches":/1/.toString())
        //Collab Editor - Verify Memo Comment
        new actions.Memo.CollabEditorVerifyMemoComment().run("Where to verify the comments?":/Dropdown List from Top Bar/.toString(),"Comment Count":/4/.toString(),"Commenter Name":/End User/.toString(),"Comment to Verify":/comment form End User/.toString(),"Number of Matches":/1/.toString())
        //Collab Editor - Verify Memo Comment
        new actions.Memo.CollabEditorVerifyMemoComment().run("Where to verify the comments?":/Dropdown List from Top Bar/.toString(),"Comment Count":/4/.toString(),"Commenter Name":/End User/.toString(),"Comment to Verify":/comment for Evaluator/.toString(),"Tagged Users":/Evaluator/.toString(),"Number of Matches":/1/.toString(),"Assigned to":/Evaluator/.toString())
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