package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C131506 - Top Ideas for Memos > Owner
class C131506_TopIdeasforMemos_Owner
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
        new actions.general.Navigate().run("Area to Navigate to":/Profile/.toString())
        //Edit Your Profile
        new actions.UserProfile.EditYourProfile().run("Display Picture":/Image9.jpg/.toString(),"Display Picture Change or Remove":/Change/.toString(),"First Name":/Nick/.toString(),"Last Name":/Fury/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/app\/apps/.toString())
        //Create Memo Webstorm
        new actions.WebstormCreation.CreateMemoWebstorm().run("Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Memo1/.toString(),"Description":/desc/.toString(),"Vanity URL":/teamsite1/.toString(),"General Access":/ALL/.toString(),"General Access Add or Remove":/Add/.toString(),"Admin Field Name":/Pipeline Administrators/.toString(),"Pipeline Administrators":/Pipeline Admin/.toString(),"Administrators Add or Remove":/Add/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Memo1/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Memo or Idea":/Idea/.toString(),"Title":/End User Idea1/.toString(),"Author":/End User/.toString(),"Author Add or Remove":/Add/.toString(),"Category":/Process Improvement/.toString(),"Status":/Active Development 📄/.toString(),"Action":/Submit/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Memo or Idea":/Memo/.toString(),"Title":/End User Memo/.toString(),"Author":/End User/.toString(),"Author Add or Remove":/Add/.toString(),"Category":/Process Improvement/.toString(),"Status":/Active Development 📄/.toString(),"Action":/Submit/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Memo or Idea":/Memo/.toString(),"Title":/System Admin Memo/.toString(),"Category":/Process Improvement/.toString(),"Status":/Green Light ✅/.toString(),"Action":/Submit/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Memo or Idea":/Idea/.toString(),"Title":/System Admin Idea/.toString(),"Category":/Process Improvement/.toString(),"Status":/Incubate 🐣/.toString(),"Action":/Submit/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/memo1\/boards\/bestIdea\/eu?/.toString())
        //Set Global Filter in Top Ideas
        new actions.IdeaBoard.SetGlobalIdeaFilterBIW().run("Invoke Filter":true,"Object Type":["Memo"],"Status":[],"Stage":[],"Step":[],"Category":[],"Owner":["Nick Fury"],"Tags":[],"Clear Individual Filters":[],"Action":/Save/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/End User Idea1/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Image":/Idea/.toString(),"Status":/Active Development 📄/.toString(),"Collaborator Count":/0/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/End User Memo/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Image":/Memo/.toString(),"Status":/Active Development 📄/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Open Action Items Count":/0/.toString(),"Collaborator Count":/0/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/System Admin Memo/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Image":/Memo/.toString(),"Status":/Green Light ✅/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Open Action Items Count":/0/.toString(),"Owner Display Picture":/TRUE/.toString(),"Owner Name":/Nick Fury/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/System Admin Idea/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Image":/Idea/.toString(),"Status":/Incubate 🐣/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Open Action Items Count":/0/.toString(),"Number of Matches":/0/.toString())
        //Set Global Filter in Top Ideas
        new actions.IdeaBoard.SetGlobalIdeaFilterBIW().run("Invoke Filter":true,"Object Type":[],"Status":[],"Stage":[],"Step":[],"Category":[],"Owner":["End User"],"Tags":[],"Clear Individual Filters":["Object Type"],"Action":/Save/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/End User Idea1/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Image":/Idea/.toString(),"Status":/Active Development 📄/.toString(),"Owner Display Picture":/FALSE/.toString(),"Owner Name":/End User/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/End User Memo/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Image":/Memo/.toString(),"Status":/Active Development 📄/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Open Action Items Count":/0/.toString(),"Owner Display Picture":/FALSE/.toString(),"Owner Name":/End User/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/System Admin Memo/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Image":/Memo/.toString(),"Status":/Green Light ✅/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Open Action Items Count":/0/.toString(),"Owner Display Picture":/TRUE/.toString(),"Owner Name":/Nick Fury/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/System Admin Idea/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Image":/Idea/.toString(),"Status":/Incubate 🐣/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Open Action Items Count":/0/.toString(),"Number of Matches":/0/.toString())
        //Set Global Filter in Top Ideas
        new actions.IdeaBoard.SetGlobalIdeaFilterBIW().run("Invoke Filter":true,"Object Type":[],"Status":[],"Stage":[],"Step":[],"Category":[],"Owner":[],"Tags":[],"Clear Filters":true,"Clear Individual Filters":[])
        //Set Global Filter in Top Ideas
        new actions.IdeaBoard.SetGlobalIdeaFilterBIW().run("Invoke Filter":true,"Object Type":[],"Status":[],"Stage":[],"Step":[],"Category":[],"Owner":["Not Assigned"],"Tags":[],"Clear Individual Filters":[],"Action":/Save/.toString(),"Filter Button Should be Active":true)
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/End User Idea1/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Image":/Idea/.toString(),"Status":/Active Development 📄/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/End User Memo/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Image":/Memo/.toString(),"Status":/Active Development 📄/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Open Action Items Count":/0/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/System Admin Memo/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Image":/Memo/.toString(),"Status":/Green Light ✅/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Open Action Items Count":/0/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/System Admin Idea/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Image":/Idea/.toString(),"Status":/Incubate 🐣/.toString(),"Progress Bar":/0/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Open Action Items Count":/0/.toString(),"Owner Display Picture":/?/.toString(),"Owner Name":/Not Assigned/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
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