package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C131432 - Top Ideas for Memos > Card Mode
class C131432_TopIdeasforMemos_CardMode
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Unlimited Brightidea Administrator License Type":/1/.toString(),"Unlimited Idea Box Manager License Type":/1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/app\/apps/.toString())
        //Create Memo Webstorm
        new actions.WebstormCreation.CreateMemoWebstorm().run("Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Memo1/.toString(),"Description":/desc/.toString(),"Vanity URL":/teamsite1/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"General Access":/ALL/.toString(),"General Access Add or Remove":/Add/.toString(),"Admin Field Name":/Pipeline Administrators/.toString(),"Pipeline Administrators":/Pipeline Admin/.toString(),"Administrators Add or Remove":/Add/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Verify and Set MTS tab on homepage
        new actions.MTS.SetMTStabonhomepage().run("Should Tab Exist":true,"Heading":/MY STUFF/.toString(),"Tabs":/Memos/.toString(),"Placement Number of Tab":/3/.toString(),"Should User Click on Tab":true)
        //Set Hover Menu on Memo Template Tiles
        new actions.MTS.SetHoverMenuonMemoTemplateTiles().run("Template":/Blank Document/.toString(),"Menu Option":/Advanced create.../.toString())
        //Set Advanced Create Memo
        new actions.MTS.SetAdvancedCreateMemo().run("Select visibility for your memo":/Add to Batch/.toString(),"Action on Select visibility for your memo slide":/Done/.toString())
        //Collab Editor - Set Memo Title
        new actions.Memo.ColabEditorSetMemoTitle().run("New Title":/Batched Memo/.toString(),"Action":/Submit/.toString())
        //Collab Editor - Click Go Back Button
        new actions.Memo.ColabEditorClickGoBackButton().run([:])
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Memo1/.toString(),"Area to Navigate to":/Memo Top Ideas/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Batched Memo/.toString(),"Stack Name Memo belongs to":/Quick Add/.toString(),"Image":/Memo/.toString(),"Status":/Incubate 🐣/.toString(),"Activity Indicator Displayed":true,"Activity Indicator":/green/.toString(),"Last Activity":/by System Admin/.toString(),"Last Activity Displayed":true,"Progress Bar":/0/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Open Action Items Count":/0/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Memo or Idea":/Idea/.toString(),"Title":/Quick Add Idea/.toString(),"Author":/End User/.toString(),"Author Add or Remove":/Add/.toString(),"Category":/Process Improvement/.toString(),"Status":/Stopped ⛔️/.toString(),"Action":/Submit/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Batched Memo/.toString(),"Stack Name Memo belongs to":/Quick Add/.toString(),"Image":/Memo/.toString(),"Status":/Incubate 🐣/.toString(),"Activity Indicator Displayed":true,"Activity Indicator":/green/.toString(),"Last Activity":/by System Admin/.toString(),"Last Activity Displayed":true,"Progress Bar":/0/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Open Action Items Count":/0/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Quick Add Idea/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Image":/Idea/.toString(),"Status":/Stopped ⛔️/.toString(),"Activity Indicator Displayed":false,"Last Activity Displayed":false,"Progress Bar":/0/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Open Action Items Count":/0/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Set and Verify Top Ideas Gear Menu
        new actions.TopIdeas.SetTopIdeasGearMenu().run("Click on gear icon":true,"Option":/Advanced/.toString()," Click on Option":false,"Option Selected":true)
        //Set and Verify Top Ideas Gear Menu
        new actions.TopIdeas.SetTopIdeasGearMenu().run("Click on gear icon":false,"Option":/Simple/.toString()," Click on Option":true,"Option Selected":true)
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Batched Memo/.toString(),"Stack Name Memo belongs to":/Quick Add/.toString(),"Image":/Memo/.toString(),"Status":/Incubate 🐣/.toString(),"Activity Indicator Displayed":true,"Activity Indicator":/green/.toString(),"Last Activity":/by System Admin/.toString(),"Last Activity Displayed":true,"Progress Bar":/0/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Open Action Items Count":/0/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Batched Memo/.toString(),"Stack Name Memo belongs to":/Quick Add/.toString(),"Image":/Memo/.toString(),"Status":/Incubate 🐣/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Quick Add Idea/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Image":/Idea/.toString(),"Status":/Stopped ⛔️/.toString(),"Activity Indicator Displayed":false,"Last Activity Displayed":false,"Progress Bar":/0/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Open Action Items Count":/0/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Quick Add Idea/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Image":/Idea/.toString(),"Status":/Stopped ⛔️/.toString(),"Activity Indicator Displayed":false,"Last Activity Displayed":false,"Number of Matches":/1/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/memo1\/boards\/bestIdea\/eu?/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Batched Memo/.toString(),"Stack Name Memo belongs to":/Quick Add/.toString(),"Image":/Memo/.toString(),"Status":/Incubate 🐣/.toString(),"Activity Indicator Displayed":true,"Activity Indicator":/green/.toString(),"Last Activity":/by System Admin/.toString(),"Last Activity Displayed":true,"Progress Bar":/0/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Open Action Items Count":/0/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Batched Memo/.toString(),"Stack Name Memo belongs to":/Quick Add/.toString(),"Image":/Memo/.toString(),"Status":/Incubate 🐣/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Quick Add Idea/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Image":/Idea/.toString(),"Status":/Stopped ⛔️/.toString(),"Activity Indicator Displayed":false,"Last Activity Displayed":false,"Progress Bar":/0/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Open Action Items Count":/0/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Quick Add Idea/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Image":/Idea/.toString(),"Status":/Stopped ⛔️/.toString(),"Activity Indicator Displayed":false,"Last Activity Displayed":false,"Number of Matches":/1/.toString())
        //Set and Verify Top Ideas Gear Menu
        new actions.TopIdeas.SetTopIdeasGearMenu().run("Click on gear icon":true,"Option":/Simple/.toString()," Click on Option":false,"Option Selected":true)
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