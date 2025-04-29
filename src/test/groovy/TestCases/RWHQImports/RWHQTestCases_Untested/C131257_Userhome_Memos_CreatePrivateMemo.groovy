package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131257 - Userhome - Memos - Create Private Memo
class C131257_Userhome_Memos_CreatePrivateMemo
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
        new actions.Memo.ColabEditorSetMemoTitle().run("New Title":/Users Private Memo/.toString(),"Action":/Submit/.toString())
        //Collab Editor - Set Text
        new actions.Memo.ColabEditorSetText().run("Text":/This is Users private memo/.toString())
        //Collab Editor - Click Go Back Button
        new actions.Memo.ColabEditorClickGoBackButton().run([:])
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Set Filter for Memo in Userhomepage
        new actions.Memo.SetFilterforMemo().run("Tab":/All Memos/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/Users Private Memo/.toString(),"Memo Icon Type":/Brightidea/.toString(),"User Name":/System Admin/.toString(),"Status":/Private/.toString(),"Thumbnail Image Displayed":true,"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Set Filter for Memo in Userhomepage
        new actions.Memo.SetFilterforMemo().run("Tab":/Private/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/Users Private Memo/.toString(),"Memo Icon Type":/Brightidea/.toString(),"User Name":/System Admin/.toString(),"Status":/Private/.toString(),"Thumbnail Image Displayed":true,"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Set Filter for Memo in Userhomepage
        new actions.Memo.SetFilterforMemo().run("Tab":/Memos in Batch/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/Users Private Memo/.toString(),"Memo Icon Type":/Brightidea/.toString(),"Date":/a few seconds ago/.toString(),"User Name":/System Admin/.toString(),"Status":/Private/.toString(),"Thumbnail Image Displayed":true,"Number of Matches":/0/.toString())
        //Set Filter for Memo in Userhomepage
        new actions.Memo.SetFilterforMemo().run("Tab":/Shared with me/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/Users Private Memo/.toString(),"Memo Icon Type":/Brightidea/.toString(),"Date":/a few seconds ago/.toString(),"User Name":/System Admin/.toString(),"Status":/Private/.toString(),"Thumbnail Image Displayed":true,"Number of Matches":/0/.toString())
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