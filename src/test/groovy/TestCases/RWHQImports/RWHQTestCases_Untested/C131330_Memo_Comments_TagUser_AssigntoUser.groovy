package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C131330 - Memo - Comments - Tag User, Assign to User
class C131330_Memo_Comments_TagUser_AssigntoUser
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
        new actions.Memo.ColabEditorSetMemoTitle().run("New Title":/Comment Test/.toString(),"Action":/Submit/.toString())
        //Collab Editor - Set Text
        new actions.Memo.ColabEditorSetText().run("Text":/Navigate/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Control + A/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/BUTTON[contains(@class,'f-slate-comment-btn')]/.toString())
        //Collab Editor - Add Comment
        new actions.Memo.CollabEditorAddComment().run("Comment":/comment from System Admin/.toString(),"Parent or Reply":/Parent/.toString(),"Action":/Comment/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Copy Current URL
        variables."currentURL" = new actions.selenium.CopyCurrentURL().run([:])
        //Collab Editor - Click Go Back Button
        new actions.Memo.ColabEditorClickGoBackButton().run([:])
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."currentURL"}/.toString())
        //Collab Editor - Add Comment
        new actions.Memo.CollabEditorAddComment().run("Comment":/reply from End User for /.toString(),"Parent or Reply":/Reply Via Container Next to Doc/.toString(),"Reply To Comment":/comment from System Admin/.toString(),"Action":/Comment/.toString(),"Tag Usernames":/Evaluator/.toString(),"Tag Email":/evaluator@test.com/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/10/.toString())
        //Collab Editor - Add Comment
        new actions.Memo.CollabEditorAddComment().run("Comment":/this goes to /.toString(),"Parent or Reply":/Reply Via Container Next to Doc/.toString(),"Reply To Comment":/reply from End User for/.toString(),"Action":/Comment/.toString(),"Tag Usernames":/analyst/.toString(),"Tag Email":/analyst@test.com/.toString(),"Assign to Username":/analyst/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/10/.toString())
        //Collab Editor - Verify Memo Comment
        new actions.Memo.CollabEditorVerifyMemoComment().run("Where to verify the comments?":/Comment Popover Next to Document/.toString(),"Comment Count":/3/.toString(),"Placement Number (+1 if assigned)":/2/.toString(),"Commenter Name":/System Admin/.toString(),"Comment to Verify":/comment from System Admin/.toString(),"Number of Matches":/1/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/2/.toString())
        //Collab Editor - Verify Memo Comment
        new actions.Memo.CollabEditorVerifyMemoComment().run("Where to verify the comments?":/Comment Popover Next to Document/.toString(),"Comment Count":/3/.toString(),"Placement Number (+1 if assigned)":/3/.toString(),"Commenter Name":/End User/.toString(),"Comment to Verify":/reply from End User/.toString(),"Tagged Users":/Evaluator/.toString(),"Number of Matches":/1/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/2/.toString())
        //Collab Editor - Verify Memo Comment
        new actions.Memo.CollabEditorVerifyMemoComment().run("Where to verify the comments?":/Comment Popover Next to Document/.toString(),"Comment Count":/3/.toString(),"Placement Number (+1 if assigned)":/4/.toString(),"Commenter Name":/End User/.toString(),"Comment to Verify":/this goes to/.toString(),"Tagged Users":/analyst/.toString(),"Number of Matches":/1/.toString(),"Assigned to":/analyst/.toString())
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