import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C131359 - MTS homepage > Filtering Memos in Pipeline and Backlog Tab as per Selected MTS
class C131359_MTShomepage_FilteringMemosinPipelineandBacklogTabasperSelectedMTS
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
        new actions.WebstormCreation.CreateMemoWebstorm().run("Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Memo Program testing1/.toString(),"Description":/desc/.toString(),"Vanity URL":/teamsite1/.toString(),"General Access":/ALL/.toString(),"General Access Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/app\/apps/.toString())
        //Create Memo Webstorm
        new actions.WebstormCreation.CreateMemoWebstorm().run("Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Memo Program testing2/.toString(),"Description":/desc/.toString(),"Vanity URL":/teamsite2/.toString(),"General Access":/ALL/.toString(),"General Access Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Memo Program testing1/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Memo or Idea":/Memo/.toString(),"Title":/Memo1/.toString(),"Category":/Process Improvement/.toString(),"Status":/Stopped ⛔️/.toString(),"Action":/Submit/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Memo Program testing2/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Memo or Idea":/Memo/.toString(),"Title":/Memo2/.toString(),"Category":/Process Improvement/.toString(),"Status":/Paused ⏸/.toString(),"Action":/Submit/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("Area to Navigate to":/Memo Team Site/.toString(),"Memo Team Site Link":/teamsite1/.toString())
        //Verify and Set MTS tab on homepage
        new actions.MTS.SetMTStabonhomepage().run("Should Tab Exist":true,"Heading":/EXPLORE/.toString(),"Tabs":/Pipeline/.toString(),"Placement Number of Tab":/3/.toString(),"Should User Click on Tab":true)
        //Verify Idea in Pipeline Steps View for End Users
        new actions.IdeaBoard.VerifyIdeainPipelineStepsViewforEndUsers().run("Tab":/Recent/.toString(),"Idea Name":/Memo1/.toString(),"Step idea belongs to":/Backlog/.toString(),"Stage idea belongs to":/Backlog/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Pipeline Steps View for End Users
        new actions.IdeaBoard.VerifyIdeainPipelineStepsViewforEndUsers().run("Idea Name":/Memo2/.toString(),"Step idea belongs to":/Backlog/.toString(),"Stage idea belongs to":/Backlog/.toString(),"Number of Matches":/0/.toString())
        //Set Memos in the Memos Dropdown
        new actions.MTS.SetMemosintheMemosdropdown().run("Memo":/Memo Program testing2/.toString())
        //Verify and Set MTS tab on homepage
        new actions.MTS.SetMTStabonhomepage().run("Should Tab Exist":true,"Heading":/EXPLORE/.toString(),"Tabs":/Pipeline/.toString(),"Placement Number of Tab":/3/.toString(),"Should User Click on Tab":true)
        //Verify Idea in Pipeline Steps View for End Users
        new actions.IdeaBoard.VerifyIdeainPipelineStepsViewforEndUsers().run("Tab":/Recent/.toString(),"Idea Name":/Memo1/.toString(),"Step idea belongs to":/Backlog/.toString(),"Stage idea belongs to":/Backlog/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Pipeline Steps View for End Users
        new actions.IdeaBoard.VerifyIdeainPipelineStepsViewforEndUsers().run("Idea Name":/Memo2/.toString(),"Step idea belongs to":/Backlog/.toString(),"Stage idea belongs to":/Backlog/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify and Set MTS tab on homepage
        new actions.MTS.SetMTStabonhomepage().run("Should Tab Exist":true,"Heading":/EXPLORE/.toString(),"Tabs":/Backlog/.toString(),"Placement Number of Tab":/2/.toString(),"Should User Click on Tab":true)
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Memo2/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Status":/Paused ⏸/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Set Memos in the Memos Dropdown
        new actions.MTS.SetMemosintheMemosdropdown().run("Memo":/Memo Program testing1/.toString())
        //Verify and Set MTS tab on homepage
        new actions.MTS.SetMTStabonhomepage().run("Should Tab Exist":true,"Heading":/EXPLORE/.toString(),"Tabs":/Backlog/.toString(),"Placement Number of Tab":/2/.toString(),"Should User Click on Tab":true)
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Memo1/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Status":/Stopped ⛔️/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
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