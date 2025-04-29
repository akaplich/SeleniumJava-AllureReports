import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131505 - Top Ideas for Memos > Collaborators Count for 3rd party documents
class C131505_TopIdeasforMemos_CollaboratorsCountfor3rdpartydocuments
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
        new actions.WebstormCreation.CreateMemoWebstorm().run("Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Memo1/.toString(),"Description":/desc/.toString(),"Vanity URL":/teamsite1/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"General Access":/ALL/.toString(),"General Access Add or Remove":/Add/.toString(),"Admin Field Name":/Pipeline Administrators/.toString(),"Pipeline Administrators":/Pipeline Admin/.toString(),"Administrators Add or Remove":/Add/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/memo1\/boards\/bestIdea\/eu?/.toString())
        //Set Create Memo Dropdown
        new actions.MTS.SetCreateMemoDropdown().run("Source of Dropdown":/Quick Add/.toString(),"Menu Option":/Link to existing.../.toString())
        //Set Add Existing Document
        new actions.MTS.SetLinktoExistingMemo().run("Link":/https:\/\/docs.google.com\/document\/d\/1FK8YWDIK6swJ-4xSLh3LYfTAvn7nFNPnThoa1fH4j-A\/edit/.toString(),"Action":/Confirm/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/1/.toString())
        //Set 3rd party login
        new actions.MTS.SetOneDriveForSystemAdmin().run("Email Address":/bi.adminuser1@brightidea.com/.toString(),"Type of 3rd Party Document":/Google/.toString())
        try{
            //Set SSO Login
            new actions.SSOLogin.SetSSOLogin().run("Username":/bi.adminuser1@brightidea.com/.toString(),"Password":/Brightidea!16/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Set 3rd party login
            new actions.MTS.SetOneDriveForSystemAdmin().run("Verify its you on Google":true)
        }
       catch(all){}catch(Error err){}
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/0/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/memo1\/boards\/bestIdea\/eu?/.toString())
        //Set Create Memo Dropdown
        new actions.MTS.SetCreateMemoDropdown().run("Source of Dropdown":/Quick Add/.toString(),"Menu Option":/Link to existing.../.toString())
        //Set Add Existing Document
        new actions.MTS.SetLinktoExistingMemo().run("Link":/https:\/\/brightidea-my.sharepoint.com\/:w:\/p\/sraje\/Eb6ZPCXGTcdHoKAGT86Q61oBM1egA93ftaQyV36ZpTOw8Q/.toString(),"Action":/Confirm/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/2/.toString())
        //Set 3rd party login
        new actions.MTS.SetOneDriveForSystemAdmin().run("Email Address":/bi.adminuser1@brightidea.com/.toString(),"Type of 3rd Party Document":/OneDrive/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/0/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Automation One drive doc1.docx/.toString(),"Stack Name Memo belongs to":/Quick Add/.toString(),"Image":/Memo/.toString(),"Status":/Incubate 🐣/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Open Action Items Count":/0/.toString(),"Collaborator Count":/0/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/testing1 gdocument/.toString(),"Stack Name Memo belongs to":/Quick Add/.toString(),"Image":/Memo/.toString(),"Status":/Incubate 🐣/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Open Action Items Count":/0/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/testing1 gdocument/.toString(),"Stack Name Memo belongs to":/Quick Add/.toString(),"Image":/Memo/.toString(),"Status":/Incubate 🐣/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Open Action Items Count":/0/.toString(),"Collaborator Count":/0/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Automation One drive doc1.docx/.toString(),"Stack Name Memo belongs to":/Quick Add/.toString(),"Image":/Memo/.toString(),"Status":/Incubate 🐣/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Open Action Items Count":/0/.toString(),"Number of Matches":/1/.toString())
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