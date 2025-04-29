package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131398 - MTS homepage > Memo Tab > Sorting
class C131398_MTShomepage_MemoTab_Sorting
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Unlimited Brightidea Administrator License Type":/1/.toString(),"Unlimited Idea Box Manager License Type":/1/.toString(),"Run Browser in Incognito":/TRUE/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for Ideas Memo tab
        new actions.SetupIdeas.SetEnterpriseSetupforIdeasMemotab().run("Google Docs":true,"One Drive":true)
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/app\/apps/.toString())
        //Create Memo Webstorm
        new actions.WebstormCreation.CreateMemoWebstorm().run("Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Memo Program testing/.toString(),"Description":/desc/.toString(),"Vanity URL":/teamsite1/.toString(),"General Access":/ALL/.toString(),"General Access Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/https:\/\/brightidea.onelogin.com\/portal/.toString())
        try{
            //Set SSO Login
            new actions.SSOLogin.SetSSOLogin().run("Username":/bi.adminuser1@brightidea.com/.toString(),"Password":/Brightidea!16/.toString())
        }
       catch(all){}catch(Error err){}
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/mts\/teamsite1/.toString())
        //Verify and Set MTS tab on homepage
        new actions.MTS.SetMTStabonhomepage().run("Should Tab Exist":true,"Heading":/MY STUFF/.toString(),"Tabs":/Memos/.toString(),"Placement Number of Tab":/3/.toString(),"Should User Click on Tab":true)
        //Set Hover Menu on Memo Template Tiles
        new actions.MTS.SetHoverMenuonMemoTemplateTiles().run("Template":/Blank Document/.toString(),"Menu Option":/Link to existing.../.toString())
        //Set Add Existing Document
        new actions.MTS.SetLinktoExistingMemo().run("Link":/https:\/\/docs.google.com\/document\/d\/1FK8YWDIK6swJ-4xSLh3LYfTAvn7nFNPnThoa1fH4j-A\/edit/.toString(),"Action":/Confirm/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/1/.toString())
        try{
            //Set 3rd party login
            new actions.MTS.SetOneDriveForSystemAdmin().run("Email Address":/bi.adminuser1@brightidea.com/.toString(),"Type of 3rd Party Document":/Google/.toString(),"Verify its you on Google":true)
        }
       catch(all){}catch(Error err){}
        //Wait
        new actions.general.Wait().run("Seconds":/7/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/0/.toString())
        //Set Hover Menu on Memo Template Tiles
        new actions.MTS.SetHoverMenuonMemoTemplateTiles().run("Template":/Blank Document/.toString(),"Menu Option":/Link to existing.../.toString())
        //Set Add Existing Document
        new actions.MTS.SetLinktoExistingMemo().run("Link":/https:\/\/brightidea-my.sharepoint.com\/:w:\/p\/sraje\/Eb6ZPCXGTcdHoKAGT86Q61oBM1egA93ftaQyV36ZpTOw8Q/.toString(),"Action":/Confirm/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/2/.toString())
        try{
            //Set 3rd party login
            new actions.MTS.SetOneDriveForSystemAdmin().run("Email Address":/bi.adminuser1@brightidea.com/.toString(),"Type of 3rd Party Document":/OneDrive/.toString())
        }
       catch(all){}catch(Error err){}
        //Wait
        new actions.general.Wait().run("Seconds":/10/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/0/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Memo Program testing/.toString(),"Area to Navigate to":/Memo Top Ideas/.toString())
        //Set Create Memo Dropdown
        new actions.MTS.SetCreateMemoDropdown().run("Source of Dropdown":/Quick Add/.toString(),"Menu Option":/Advanced create.../.toString())
        //Set Advanced Create Memo
        new actions.MTS.SetAdvancedCreateMemo().run("Start a blank memo or with a template?":/Executive Summary/.toString(),"Action on Start a blank memo or with a template slide":/Next/.toString(),"Select an editor to draft your Memo within":/Brightidea Memo/.toString(),"Action on Select an editor to draft your Memo within slide":/Next/.toString(),"Select visibility for your memo":/Add to Batch/.toString(),"Action on Select visibility for your memo slide":/Done/.toString())
        //Collab Editor - Set Memo Title
        new actions.Memo.ColabEditorSetMemoTitle().run("New Title":/Executive Summary batched memo/.toString(),"Action":/Submit/.toString())
        //Collab Editor - Click Go Back Button
        new actions.Memo.ColabEditorClickGoBackButton().run([:])
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/mts\/teamsite1/.toString())
        //Verify and Set MTS tab on homepage
        new actions.MTS.SetMTStabonhomepage().run("Should Tab Exist":true,"Heading":/MY STUFF/.toString(),"Tabs":/Memos/.toString(),"Placement Number of Tab":/3/.toString(),"Should User Click on Tab":true)
        //Set Hover Menu on Memo Template Tiles
        new actions.MTS.SetHoverMenuonMemoTemplateTiles().run("Template":/External & Internal FAQs/.toString(),"Menu Option":/Advanced create.../.toString())
        //Set Advanced Create Memo
        new actions.MTS.SetAdvancedCreateMemo().run("Select an editor to draft your Memo within":/Brightidea Memo/.toString(),"Action on Select an editor to draft your Memo within slide":/Next/.toString(),"Select visibility for your memo":/Add to Batch/.toString(),"Action on Select visibility for your memo slide":/Done/.toString())
        //Collab Editor - Set Memo Title
        new actions.Memo.ColabEditorSetMemoTitle().run("New Title":/Ztesting memo/.toString(),"Action":/Submit/.toString())
        //Collab Editor/Userhome - Memo Share Dialog -  Set Participants
        new actions.Memo.MemoShareDialogSetParticipants().run("Click Share Button":true,"User(s)":/System Admin/.toString(),"Permission (required)":/can view/.toString(),"Send Invite":/TRUE/.toString(),"Anyone With Link":/can comment/.toString(),"Action":/Close/.toString())
        //Collab Editor - Click Go Back Button
        new actions.Memo.ColabEditorClickGoBackButton().run([:])
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/mts\/teamsite1/.toString())
        //Verify and Set MTS tab on homepage
        new actions.MTS.SetMTStabonhomepage().run("Should Tab Exist":true,"Heading":/MY STUFF/.toString(),"Tabs":/Memos/.toString(),"Placement Number of Tab":/3/.toString(),"Should User Click on Tab":true)
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/Automation One drive doc1.docx/.toString(),"Memo Icon Type":/Onedrive/.toString(),"User Name":/System Admin/.toString(),"Status":/Private/.toString(),"Thumbnail Image Displayed":true,"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/Executive Summary batched memo/.toString(),"Memo Icon Type":/Brightidea/.toString(),"User Name":/System Admin/.toString(),"Status":/Incubate 🐣/.toString(),"Thumbnail Image Displayed":true,"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/testing1 gdocument/.toString(),"Memo Icon Type":/Google/.toString(),"User Name":/System Admin/.toString(),"Status":/Private/.toString(),"Thumbnail Image Displayed":true,"Placement Number":/4/.toString(),"Number of Matches":/1/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/Ztesting memo/.toString(),"Memo Icon Type":/Brightidea/.toString(),"User Name":/End User/.toString(),"Status":/Incubate 🐣/.toString(),"Thumbnail Image Displayed":true,"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Set Sort for Memos in Userhomepage
        new actions.Memo.SetSortforMemosinUserhomepage().run("Sort":/Alphabetical by title (A-Z)/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/Automation One drive doc1.docx/.toString(),"Memo Icon Type":/Onedrive/.toString(),"User Name":/System Admin/.toString(),"Status":/Private/.toString(),"Thumbnail Image Displayed":true,"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/Executive Summary batched memo/.toString(),"Memo Icon Type":/Brightidea/.toString(),"User Name":/System Admin/.toString(),"Status":/Incubate 🐣/.toString(),"Thumbnail Image Displayed":true,"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/testing1 gdocument/.toString(),"Memo Icon Type":/Google/.toString(),"User Name":/System Admin/.toString(),"Status":/Private/.toString(),"Thumbnail Image Displayed":true,"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/Ztesting memo/.toString(),"Memo Icon Type":/Brightidea/.toString(),"User Name":/End User/.toString(),"Status":/Incubate 🐣/.toString(),"Thumbnail Image Displayed":true,"Placement Number":/4/.toString(),"Number of Matches":/1/.toString())
        //Set Sort for Memos in Userhomepage
        new actions.Memo.SetSortforMemosinUserhomepage().run("Sort":/Alphabetical by title (Z-A)/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/Automation One drive doc1.docx/.toString(),"Memo Icon Type":/Onedrive/.toString(),"User Name":/System Admin/.toString(),"Status":/Private/.toString(),"Thumbnail Image Displayed":true,"Placement Number":/4/.toString(),"Number of Matches":/1/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/Executive Summary batched memo/.toString(),"Memo Icon Type":/Brightidea/.toString(),"User Name":/System Admin/.toString(),"Status":/Incubate 🐣/.toString(),"Thumbnail Image Displayed":true,"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/testing1 gdocument/.toString(),"Memo Icon Type":/Google/.toString(),"User Name":/System Admin/.toString(),"Status":/Private/.toString(),"Thumbnail Image Displayed":true,"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/Ztesting memo/.toString(),"Memo Icon Type":/Brightidea/.toString(),"User Name":/End User/.toString(),"Status":/Incubate 🐣/.toString(),"Thumbnail Image Displayed":true,"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Set Filter for Memo in Userhomepage
        new actions.Memo.SetFilterforMemo().run("Tab":/Memos in Batch/.toString())
        //Set Sort for Memos in Userhomepage
        new actions.Memo.SetSortforMemosinUserhomepage().run("Sort":/Created date (new to old)/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/Automation One drive doc1.docx/.toString(),"Memo Icon Type":/Onedrive/.toString(),"User Name":/System Admin/.toString(),"Status":/Private/.toString(),"Thumbnail Image Displayed":true,"Number of Matches":/0/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/Executive Summary batched memo/.toString(),"Memo Icon Type":/Brightidea/.toString(),"User Name":/System Admin/.toString(),"Status":/Incubate 🐣/.toString(),"Thumbnail Image Displayed":true,"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/testing1 gdocument/.toString(),"Memo Icon Type":/Google/.toString(),"User Name":/System Admin/.toString(),"Status":/Private/.toString(),"Thumbnail Image Displayed":true,"Number of Matches":/0/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/Ztesting memo/.toString(),"Memo Icon Type":/Brightidea/.toString(),"User Name":/End User/.toString(),"Status":/Incubate 🐣/.toString(),"Thumbnail Image Displayed":true,"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Set Sort for Memos in Userhomepage
        new actions.Memo.SetSortforMemosinUserhomepage().run("Sort":/Created date (old to new)/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/Automation One drive doc1.docx/.toString(),"Memo Icon Type":/Onedrive/.toString(),"User Name":/System Admin/.toString(),"Status":/Private/.toString(),"Thumbnail Image Displayed":true,"Number of Matches":/0/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/Executive Summary batched memo/.toString(),"Memo Icon Type":/Brightidea/.toString(),"User Name":/System Admin/.toString(),"Status":/Incubate 🐣/.toString(),"Thumbnail Image Displayed":true,"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/testing1 gdocument/.toString(),"Memo Icon Type":/Google/.toString(),"User Name":/System Admin/.toString(),"Status":/Private/.toString(),"Thumbnail Image Displayed":true,"Number of Matches":/0/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/Ztesting memo/.toString(),"Memo Icon Type":/Brightidea/.toString(),"User Name":/End User/.toString(),"Status":/Incubate 🐣/.toString(),"Thumbnail Image Displayed":true,"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
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