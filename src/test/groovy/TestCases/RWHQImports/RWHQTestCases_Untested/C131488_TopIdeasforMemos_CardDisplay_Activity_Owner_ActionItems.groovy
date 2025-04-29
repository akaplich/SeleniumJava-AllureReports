import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131488 - Top Ideas for Memos > Card Display (Activity, Owner, Action Items)
class C131488_TopIdeasforMemos_CardDisplay_Activity_Owner_ActionItems
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
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Memo or Idea":/Idea/.toString(),"Title":/Idea in Drafting step/.toString(),"Author":/End User/.toString(),"Author Add or Remove":/Add/.toString(),"Category":/Process Improvement/.toString(),"Status":/Paused ⏸/.toString(),"Action":/Submit/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Memo or Idea":/Memo/.toString(),"Title":/Memo in Backlog stage/.toString(),"Author":/Moderator/.toString(),"Author Add or Remove":/Add/.toString(),"Category":/Organizational Improvement/.toString(),"Status":/Stopped/.toString(),"Action":/Submit/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Memo or Idea":/Memo/.toString(),"Title":/Memo in Review step/.toString(),"Category":/Process Improvement/.toString(),"Status":/In-flight/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Memo in Review step/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Review/.toString(),"Action":/Change Step/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Idea in Drafting step/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Drafting/.toString(),"Action":/Change Step/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/analyst@test.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/memo1\/boards\/bestIdea\/eu/.toString())
        //Set and Verify Top Ideas Gear Menu
        new actions.TopIdeas.SetTopIdeasGearMenu().run("Click on gear icon":true,"Option":/Activity/.toString()," Click on Option":true)
        //Set and Verify Top Ideas Gear Menu
        new actions.TopIdeas.SetTopIdeasGearMenu().run("Option":/Owner/.toString()," Click on Option":true)
        //Set and Verify Top Ideas Gear Menu
        new actions.TopIdeas.SetTopIdeasGearMenu().run("Option":/Action Items/.toString()," Click on Option":true)
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Memo in Backlog stage/.toString(),"Stack Name Memo belongs to":/Organizational Improvement/.toString(),"Image":/Memo/.toString(),"Status":/Stopped ⛔️/.toString(),"Activity Indicator Displayed":true,"Activity Indicator":/green/.toString(),"Last Activity":/by System Admin/.toString(),"Last Activity Displayed":true,"Progress Bar":/0/.toString(),"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Idea Code":/D112/.toString(),"Owner Display Picture":/FALSE/.toString(),"Owner Name":/Moderator/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Memo in Backlog stage/.toString(),"Stack Name Memo belongs to":/Organizational Improvement/.toString(),"Image":/Memo/.toString(),"Activity Indicator Displayed":false,"Last Activity Displayed":false,"Stage":/Backlog/.toString(),"Step":/Backlog/.toString(),"Idea Code":/D112/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Memo in Review step/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Image":/Memo/.toString(),"Status":/In-flight 🔥/.toString(),"Activity Indicator Displayed":false,"Last Activity Displayed":false,"Stage":/Active Development/.toString(),"Step":/Review/.toString(),"Idea Code":/D113/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Memo in Review step/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Image":/Memo/.toString(),"Status":/In-flight 🔥/.toString(),"Activity Indicator Displayed":true,"Activity Indicator":/green/.toString(),"Last Activity":/by System Admin/.toString(),"Last Activity Displayed":true,"Stage":/Active Development/.toString(),"Step":/Review/.toString(),"Open Action Items Count":/0/.toString(),"Idea Code":/D113/.toString(),"Owner Display Picture":/?/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Idea in Drafting step/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Image":/Idea/.toString(),"Status":/Paused ⏸/.toString(),"Stage":/Active Development/.toString(),"Step":/Drafting/.toString(),"Open Action Items Count":/0/.toString(),"Idea Code":/D111/.toString(),"Owner Display Picture":/TRUE/.toString(),"Owner Name":/End User/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Idea in Drafting step/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Image":/Idea/.toString(),"Status":/Paused ⏸/.toString(),"Stage":/Active Development/.toString(),"Step":/Drafting/.toString(),"Idea Code":/D111/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
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