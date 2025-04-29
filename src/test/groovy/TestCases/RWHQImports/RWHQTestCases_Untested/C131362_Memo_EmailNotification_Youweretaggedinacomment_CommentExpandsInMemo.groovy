import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131362 - Memo - Email Notification - 'You were tagged in a comment ' - Comment Expands In Memo
class C131362_Memo_EmailNotification_Youweretaggedinacomment_CommentExpandsInMemo
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
        //Create Mailinator User
        new actions.Mailinator.CreateMailinatorUser().run("Email":/brightC131362/.toString(),"First Name":/Anna/.toString(),"Last Name":/Test/.toString(),"Screen Name":/Anna Test/.toString(),"Finally Login as What User":/bi.adminuser1@brightidea.com/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString())
        //Use this action to enable Memo Updates in System Manager Affiliates
        Action6388ddf31dac76f4246846d6([:])
        //Return Affiliate Name
        variables."affName" = new actions.general.ReturnAffiliateName().run("Affiliate URL":/${variables."affiliateURL"}/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Memos/.toString())
        //Set Memo Template Tile
        new actions.MTS.SetMemoTemplateTile().run("Template":/Blank Document/.toString())
        //Collab Editor - Set Memo Title
        new actions.Memo.ColabEditorSetMemoTitle().run("New Title":/C131362 Memo/.toString(),"Action":/Submit/.toString())
        //Collab Editor - Set Text
        new actions.Memo.ColabEditorSetText().run("Text":/email test/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Shift + Up/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/BUTTON[contains(@class,'f-slate-comment-btn')]/.toString())
        //Collab Editor - Add Comment
        new actions.Memo.CollabEditorAddComment().run("Comment":/just another comment/.toString(),"Parent or Reply":/Parent/.toString(),"Action":/Comment/.toString())
        //Collab Editor - Set Text
        new actions.Memo.ColabEditorSetText().run("Focus on paragraph (not working)":/Last/.toString(),"Key(s)":/ENTER/.toString())
        //Collab Editor - Set Text
        new actions.Memo.ColabEditorSetText().run("Focus on paragraph (not working)":/Last/.toString(),"Text":/ space/.toString())
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
        new actions.Memo.CollabEditorAddComment().run("Comment":/comment for/.toString(),"Parent or Reply":/Parent/.toString(),"Action":/Comment/.toString(),"Tag Usernames":/Anna/.toString(),"Tag Email":/brightC131362@mailinator.com/.toString())
        //Collab Editor - Click Go Back Button
        new actions.Memo.ColabEditorClickGoBackButton().run([:])
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/brightC131362@mailinator.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Get Link From Comment Made on Idea Email
        variables."commentLink" = new actions.Mailinator.GetLinkFromCommentMadeonIdeaEmail().run("Email Address":/brightC131362@mailinator.com/.toString(),"Email Subject":/You were tagged in a comment in C131362 Memo/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."commentLink"}/.toString())
        //Collab Editor - Verify Memo Comment
        new actions.Memo.CollabEditorVerifyMemoComment().run("Where to verify the comments?":/Comment Popover Next to Document/.toString(),"Comment Count":/2/.toString(),"Commenter Name":/System Admin/.toString(),"Comment to Verify":/comment for Anna Test/.toString(),"Number of Matches":/1/.toString())
        //Collab Editor - Add Comment
        new actions.Memo.CollabEditorAddComment().run("Comment":/reply from Anna/.toString(),"Parent or Reply":/Reply/.toString(),"Reply To Comment":/comment from Anna/.toString(),"Action":/Comment/.toString())
        //Collab Editor - Verify Memo Comment
        new actions.Memo.CollabEditorVerifyMemoComment().run("Where to verify the comments?":/Dropdown List from Top Bar/.toString(),"Click Open/Close Comments in Top Bar":true,"Commenter Name":/Anna Test/.toString(),"Comment to Verify":/reply from Anna/.toString(),"Expand Replies":true,"Parent Comment (for verifying a reply)":/comment for Anna Test/.toString(),"Number of Matches":/1/.toString())
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