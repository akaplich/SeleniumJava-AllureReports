import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C131399 - MTS homepage > Memo Tab > Deleting Memo as Owner
class C131399_MTShomepage_MemoTab_DeletingMemoasOwner
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
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/mts\/teamsite1/.toString())
        //Verify and Set MTS tab on homepage
        new actions.MTS.SetMTStabonhomepage().run("Should Tab Exist":true,"Heading":/MY STUFF/.toString(),"Tabs":/Memos/.toString(),"Placement Number of Tab":/3/.toString(),"Should User Click on Tab":true)
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/testing1 gdocument/.toString(),"Memo Icon Type":/Google/.toString(),"User Name":/System Admin/.toString(),"Status":/Private/.toString(),"Thumbnail Image Displayed":true,"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Memo in Userhome/VI3 - Set Memo Ellipse Dropdown or Open Document
        new actions.Memo.SetEllipseDropdownForMemo().run("Memo Title (Required)":/testing1 gdocument/.toString(),"Click Ellipse Menu":true,"Menu Item":/Delete…/.toString(),"Delete Action":/Delete/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/7/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/testing1 gdocument/.toString(),"Memo Icon Type":/Google/.toString(),"User Name":/System Admin/.toString(),"Status":/Private/.toString(),"Thumbnail Image Displayed":true,"Number of Matches":/0/.toString())
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
        //Collab Editor - Click Go Back Button
        new actions.Memo.ColabEditorClickGoBackButton().run([:])
        //Set Filter for Memo in Userhomepage
        new actions.Memo.SetFilterforMemo().run("Tab":/Memos in Batch/.toString())
        //Memo in Userhome/VI3 - Set Memo Ellipse Dropdown or Open Document
        new actions.Memo.SetEllipseDropdownForMemo().run("Memo Title (Required)":/Ztesting memo/.toString(),"Click Ellipse Menu":true,"Menu Item":/Delete…/.toString(),"Delete Action":/Delete/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/Ztesting memo/.toString(),"Memo Icon Type":/Brightidea/.toString(),"User Name":/End User/.toString(),"Status":/Incubate 🐣/.toString(),"Thumbnail Image Displayed":true,"Number of Matches":/0/.toString())
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