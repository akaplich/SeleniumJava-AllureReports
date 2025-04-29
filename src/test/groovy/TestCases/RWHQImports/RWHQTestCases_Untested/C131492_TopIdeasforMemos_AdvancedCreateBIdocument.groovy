import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C131492 - Top Ideas for Memos > Advanced Create BI document
class C131492_TopIdeasforMemos_AdvancedCreateBIdocument
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
        new actions.WebstormCreation.CreateMemoWebstorm().run("Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Memo1/.toString(),"Description":/desc/.toString(),"Vanity URL":/teamsite1/.toString(),"General Access":/ALL/.toString(),"General Access Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Memo1/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Memo or Idea":/Idea/.toString(),"Title":/Idea in Process Improvement/.toString(),"Category":/Process Improvement/.toString(),"Status":/Active Development 📄/.toString(),"Action":/Submit/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Memo or Idea":/Memo/.toString(),"Title":/Memo in Process Improvement/.toString(),"Category":/Process Improvement/.toString(),"Status":/Active Development 📄/.toString(),"Action":/Submit/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Memo or Idea":/Idea/.toString(),"Title":/Idea in Organizational Improvement/.toString(),"Category":/Organizational Improvement/.toString(),"Status":/Paused ⏸/.toString(),"Action":/Submit/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Memo or Idea":/Memo/.toString(),"Title":/Memo in Organizational Improvement/.toString(),"Category":/Organizational Improvement/.toString(),"Status":/Paused ⏸/.toString(),"Action":/Submit/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/memo1\/boards\/bestIdea\/eu/.toString())
        //Set Global Filter in Top Ideas
        new actions.IdeaBoard.SetGlobalIdeaFilterBIW().run("Invoke Filter":true,"Object Type":[],"Status":["Paused ⏸","Incubate 🐣"],"Stage":[],"Step":[],"Category":[],"Owner":[],"Tags":[],"Clear Individual Filters":[],"Action":/Save/.toString())
        //Set Quick Add Memo dropdown
        new actions.PipelineStepsView.SetQuickAddMemodropdown().run("Menu Item":/Advanced create.../.toString())
        //Set Advanced Create Memo
        new actions.MTS.SetAdvancedCreateMemo().run("Start a blank memo or with a template?":/Executive Summary/.toString(),"Action on Start a blank memo or with a template slide":/Next/.toString(),"Select visibility for your memo":/Add to Batch/.toString(),"Action on Select visibility for your memo slide":/Done/.toString())
        //Collab Editor - Set Memo Title
        new actions.Memo.ColabEditorSetMemoTitle().run("New Title":/Executive Summary or Quick Take doc/.toString(),"Action":/Submit/.toString())
        //Collab Editor - Verify Text
        new actions.Memo.CollabEditorVerifyText().run("Expected Text":/Executive Summary or Quick Take/.toString(),"Align":/left/.toString(),"Text Font":/Lato/.toString(),"Font Size":/16/.toString(),"Font Color":/rgb(237,125,49)/.toString(),"Should Text Exist":true)
        //Collab Editor - Verify Text
        new actions.Memo.CollabEditorVerifyText().run("Expected Text":/Action plan\/tasks/.toString(),"Align":/left/.toString(),"Text Font":/Lato/.toString(),"Font Size":/12/.toString(),"Font Color":/rgb(0,0,0)/.toString(),"Should Text Exist":true)
        //Collab Editor - Click Go Back Button
        new actions.Memo.ColabEditorClickGoBackButton().run([:])
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Memo in Organizational Improvement/.toString(),"Stack Name Memo belongs to":/Organizational Improvement/.toString(),"Image":/Memo/.toString(),"Status":/Paused ⏸/.toString(),"Activity Indicator Displayed":true,"Activity Indicator":/green/.toString(),"Last Activity":/by System Admin/.toString(),"Last Activity Displayed":true,"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Open Action Items Count":/0/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Idea in Organizational Improvement/.toString(),"Stack Name Memo belongs to":/Organizational Improvement/.toString(),"Image":/Idea/.toString(),"Status":/Paused ⏸/.toString(),"Open Action Items Count":/0/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Idea in Process Improvement/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Image":/Idea/.toString(),"Status":/Paused ⏸/.toString(),"Open Action Items Count":/0/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Memo in Process Improvement/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Image":/Memo/.toString(),"Status":/Active Development 📄/.toString(),"Activity Indicator Displayed":true,"Activity Indicator":/green/.toString(),"Last Activity":/by System Admin/.toString(),"Last Activity Displayed":true,"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Open Action Items Count":/0/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Executive Summary or Quick Take/.toString(),"Stack Name Memo belongs to":/Quick Add/.toString(),"Image":/Memo/.toString(),"Status":/Incubate 🐣/.toString(),"Activity Indicator Displayed":true,"Activity Indicator":/green/.toString(),"Last Activity":/by System Admin/.toString(),"Last Activity Displayed":true,"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Open Action Items Count":/0/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
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