import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C131574 - MTS Homepage > Backlog As End User (incl Filter, Nav Highlight)
class C131574_MTSHomepage_BacklogAsEndUser_inclFilter_NavHighlight
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
        new actions.WebstormCreation.CreateMemoWebstorm().run("Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Memo Program testing/.toString(),"Description":/desc/.toString(),"Vanity URL":/teamsite1/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"General Access":/ALL/.toString(),"General Access Add or Remove":/Add/.toString(),"Admin Field Name":/Pipeline Administrators/.toString(),"Pipeline Administrators":/Pipeline Admin,System Admin/.toString(),"Administrators Add or Remove":/Add,Remove/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Memo Program testing/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Memo or Idea":/Memo/.toString(),"Title":/Memo Stopped, Drafting/.toString(),"Category":/Process Improvement/.toString(),"Status":/Stopped ⛔️/.toString(),"Action":/Submit/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Memo or Idea":/Memo/.toString(),"Title":/Memo Incubate, Collaboration/.toString(),"Category":/Process Improvement/.toString(),"Status":/Incubate 🐣/.toString(),"Action":/Submit/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Memo or Idea":/Memo/.toString(),"Title":/Memo In Flight/.toString(),"Category":/Process Improvement/.toString(),"Status":/In-flight 🔥/.toString(),"Action":/Submit/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Memo or Idea":/Memo/.toString(),"Title":/Memo Development/.toString(),"Category":/Process Improvement/.toString(),"Status":/Active Development 📄/.toString(),"Action":/Submit/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Memo or Idea":/Memo/.toString(),"Title":/Memo Green Light/.toString(),"Category":/Process Improvement/.toString(),"Status":/Green Light ✅/.toString(),"Action":/Submit/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Memo or Idea":/Memo/.toString(),"Title":/Idea Paused/.toString(),"Category":/Process Improvement/.toString(),"Status":/Paused ⏸/.toString(),"Action":/Submit/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Memo or Idea":/Memo/.toString(),"Title":/Idea Paused, Hidden/.toString(),"Category":/Process Improvement/.toString(),"Status":/Paused ⏸/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Memo Stopped, Drafting/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Drafting/.toString(),"Action":/Change Step/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Memo Incubate, Collaboration/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Collaboration/.toString(),"Action":/Change Step/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Idea Paused, Hidden/.toString())
        //Change Idea Visibility in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaVisibilityinPipelineStepspage().run("Visibility":/Hidden/.toString(),"Action":/Change Visibility/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser2@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("Area to Navigate to":/Memo Team Site/.toString(),"Memo Team Site Link":/teamsite1/.toString())
        //Verify and Set MTS tab on homepage
        new actions.MTS.SetMTStabonhomepage().run("Should Tab Exist":true,"Heading":/EXPLORE/.toString(),"Tabs":/Backlog/.toString(),"Placement Number of Tab":/2/.toString(),"Should User Click on Tab":true)
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/UL[contains(@class,'f-sidebar-tabs')]\/\/LI[contains(@class,'f-selected')]\/\/*[.='Backlog']/.toString(),"Should Element Exist":true,"Number of Matches":/2/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Memo Stopped, Drafting/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Idea Paused, Hidden/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Status":/Paused ⏸/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Idea Paused/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Status":/Paused ⏸/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Idea Code":/D116/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Memo Incubate, Collaboration/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Status":/Incubate 🐣/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Memo In Flight/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Status":/In-flight 🔥/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Idea Code":/D113/.toString(),"Placement Number":/4/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Memo Development/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Status":/Active Development 📄/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Idea Code":/D114/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Memo Green Light/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Status":/Green Light ✅/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Idea Code":/D115/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Set Global Filter in Top Ideas
        new actions.IdeaBoard.SetGlobalIdeaFilterBIW().run("Invoke Filter":true,"Object Type":[],"Status":[],"Stage":[],"Step":["Backlog"],"Category":[],"Owner":[],"Tags":[],"Clear Individual Filters":[],"Action":/Save/.toString())
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/UL[contains(@class,'f-sidebar-tabs')]\/\/LI[not(contains(@class,'f-selected'))]\/\/*[.='Backlog']/.toString(),"Should Element Exist":true,"Number of Matches":/2/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Memo Stopped, Drafting/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Step":/Drafting/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Idea Paused, Hidden/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Status":/Paused ⏸/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Idea Paused/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Status":/Paused ⏸/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Idea Code":/D116/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Memo Incubate, Collaboration/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Status":/Incubate 🐣/.toString(),"Step":/Collaboration/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Memo In Flight/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Status":/In-flight 🔥/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Idea Code":/D113/.toString(),"Placement Number":/4/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Memo Development/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Status":/Active Development 📄/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Idea Code":/D114/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Memo Green Light/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Status":/Green Light ✅/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Idea Code":/D115/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
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