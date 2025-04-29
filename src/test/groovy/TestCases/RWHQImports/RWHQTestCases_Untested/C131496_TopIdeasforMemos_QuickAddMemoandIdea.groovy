package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131496 - Top Ideas for Memos > Quick Add Memo and Idea
class C131496_TopIdeasforMemos_QuickAddMemoandIdea
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
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Memo1/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Memo or Idea":/Memo/.toString(),"Title":/Memo1/.toString(),"Author":/End User/.toString(),"Author Add or Remove":/Add/.toString(),"Category":/New Product or Offering/.toString(),"Status":/Active Development 📄/.toString(),"Action":/Submit/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Memo or Idea":/Idea/.toString(),"Title":/Idea1/.toString(),"Author":/End User/.toString(),"Author Add or Remove":/Add/.toString(),"Category":/Organizational Improvement/.toString(),"Status":/In-flight 🔥/.toString(),"Action":/Submit/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/memo1\/boards\/bestIdea\/eu?/.toString())
        //Set Global Filter in Top Ideas
        new actions.IdeaBoard.SetGlobalIdeaFilterBIW().run("Invoke Filter":true,"Object Type":[],"Status":[],"Stage":[],"Step":[],"Category":["Strategic Initiative","Process Improvement"],"Owner":[],"Tags":[],"Clear Individual Filters":[],"Action":/Save/.toString())
        //Verify Stacks in Top Ideas
        new actions.PipelineTopIdeas.VerifyStacksInTopIdeas().run("Stack":/Strategic Initiative/.toString(),"Idea Count":/0/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Stacks in Top Ideas
        new actions.PipelineTopIdeas.VerifyStacksInTopIdeas().run("Stack":/New Product/.toString(),"Idea Count":/0/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Stacks in Top Ideas
        new actions.PipelineTopIdeas.VerifyStacksInTopIdeas().run("Stack":/Organizational Improvement/.toString(),"Idea Count":/0/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Stacks in Top Ideas
        new actions.PipelineTopIdeas.VerifyStacksInTopIdeas().run("Stack":/Process Improvement/.toString(),"Idea Count":/0/.toString(),"Placement Number":/4/.toString(),"Number of Matches":/1/.toString())
        //Verify Stacks in Top Ideas
        new actions.PipelineTopIdeas.VerifyStacksInTopIdeas().run("Stack":/Other/.toString(),"Idea Count":/0/.toString(),"Placement Number":/5/.toString(),"Number of Matches":/1/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Memo or Idea":/Memo/.toString(),"Title":/Memo2/.toString(),"Category":/Process Improvement/.toString(),"Status":/Incubate 🐣/.toString(),"Action":/Submit/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Memo2/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Image":/Memo/.toString(),"Status":/Incubate 🐣/.toString(),"Activity Indicator Displayed":true,"Activity Indicator":/green/.toString(),"Last Activity":/by System Admin/.toString(),"Last Activity Displayed":true,"Progress Bar":/0/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Open Action Items Count":/0/.toString(),"Owner Display Picture":/FALSE/.toString(),"Owner Name":/System Admin/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Idea1/.toString(),"Stack Name Memo belongs to":/Organizational Improvement/.toString(),"Image":/Memo/.toString(),"Status":/In-flight 🔥/.toString(),"Progress Bar":/0/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Open Action Items Count":/0/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Memo1/.toString(),"Stack Name Memo belongs to":/New Product or Offering/.toString(),"Image":/Memo/.toString(),"Status":/Active Development 📄/.toString(),"Activity Indicator Displayed":true,"Activity Indicator":/green/.toString(),"Last Activity":/by System Admin/.toString(),"Last Activity Displayed":true,"Progress Bar":/0/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Open Action Items Count":/0/.toString(),"Number of Matches":/0/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Memo or Idea":/Idea/.toString(),"Title":/Idea2/.toString(),"Action":/Submit/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Memo2/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Image":/Memo/.toString(),"Status":/Incubate 🐣/.toString(),"Activity Indicator Displayed":true,"Activity Indicator":/green/.toString(),"Last Activity":/by System Admin/.toString(),"Last Activity Displayed":true,"Progress Bar":/0/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Open Action Items Count":/0/.toString(),"Owner Display Picture":/FALSE/.toString(),"Owner Name":/System Admin/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Idea1/.toString(),"Stack Name Memo belongs to":/Organizational Improvement/.toString(),"Image":/Idea/.toString(),"Status":/In-flight 🔥/.toString(),"Progress Bar":/0/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Open Action Items Count":/0/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Memo1/.toString(),"Stack Name Memo belongs to":/New Product or Offering/.toString(),"Image":/Memo/.toString(),"Status":/Active Development 📄/.toString(),"Activity Indicator Displayed":true,"Activity Indicator":/green/.toString(),"Last Activity":/by System Admin/.toString(),"Last Activity Displayed":true,"Progress Bar":/0/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Open Action Items Count":/0/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Idea2/.toString(),"Stack Name Memo belongs to":/Quick Add/.toString(),"Image":/Idea/.toString(),"Status":/Incubate 🐣/.toString(),"Progress Bar":/0/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Open Action Items Count":/0/.toString(),"Number of Matches":/0/.toString())
        //Set Global Filter in Top Ideas
        new actions.IdeaBoard.SetGlobalIdeaFilterBIW().run("Invoke Filter":true,"Object Type":[],"Status":[],"Stage":[],"Step":[],"Category":[],"Owner":[],"Tags":[],"Clear Filters":true,"Clear Individual Filters":[])
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Memo2/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Image":/Memo/.toString(),"Status":/Incubate 🐣/.toString(),"Activity Indicator Displayed":true,"Activity Indicator":/green/.toString(),"Last Activity":/by System Admin/.toString(),"Last Activity Displayed":true,"Progress Bar":/0/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Open Action Items Count":/0/.toString(),"Owner Display Picture":/FALSE/.toString(),"Owner Name":/System Admin/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Idea1/.toString(),"Stack Name Memo belongs to":/Organizational Improvement/.toString(),"Image":/Idea/.toString(),"Status":/In-flight 🔥/.toString(),"Progress Bar":/0/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Open Action Items Count":/0/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Memo1/.toString(),"Stack Name Memo belongs to":/New Product or Offering/.toString(),"Image":/Memo/.toString(),"Status":/Active Development 📄/.toString(),"Activity Indicator Displayed":true,"Activity Indicator":/green/.toString(),"Last Activity":/by System Admin/.toString(),"Last Activity Displayed":true,"Progress Bar":/0/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Open Action Items Count":/0/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Idea2/.toString(),"Stack Name Memo belongs to":/Quick Add/.toString(),"Image":/Idea/.toString(),"Status":/Incubate 🐣/.toString(),"Progress Bar":/0/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Open Action Items Count":/0/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
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