import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C130795 - Top Ideas By Category - Quick Search Visible and Hidden Ideas as Admin, Moderator, Analyst
class C130795_TopIdeasByCategory_QuickSearchVisibleandHiddenIdeasasAdmin_Moderator_Analyst
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
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Advanced Ideabox/.toString(),"Sponsor Name":/pipelinesponsor@mailinator.com/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Idea Box BIW/.toString(),"Description":/this is idea box app Test App/.toString(),"Pipeline Administrators":/pipelineadmin@test.com/.toString(),"Administrators Add or Remove":/Add/.toString(),"Moderators":/moderator@test.com/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString(),"Action on General Information Tab":/Continue/.toString(),"Action on Design Tab":/Continue/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Pipeline Setup/.toString())
        //Set Roles in Pipeline Setup Page
        new actions.PipelineSetup.SetRolesinPipelineSetupPage().run("Navigate to Tab":true,"Analysts":/analyst/.toString(),"Analysts Add or Remove":/Add/.toString(),"Click Save":true)
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Top Ideas/.toString())
        //Quick Add Idea in Top Ideas
        new actions.PipelineTopIdeas.QuickAddIdeaInTopIdeas().run("Click Quick Add to Trigger Dialog":true,"Title":/Technology Update Hidden1/.toString(),"Action":/Submit/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/2/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Site Setup Ideas for Top Ideas
        new actions.SetupIdeas.SetSiteSetupIdeasforTopIdeas().run("Top Ideas by Category":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Idea Box BIW/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/Techno Update Visible1/.toString(),"Description":/Visual Interpretations ideas/.toString(),"Category":/New Product/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Idea Box BIW/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/Technology Update Visible1/.toString(),"Description":/Visual Interpretations ideas/.toString(),"Category":/New Product/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Idea Box BIW/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/Technology Update Visible2/.toString(),"Description":/Visual/.toString(),"Category":/Strategy/.toString(),"Action":/Submit Idea/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/pipelineadmin@test.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Idea Box BIW/.toString(),"Area to Navigate to":/Top Ideas/.toString())
        //Verify Set in Top Ideas
        new actions.IdeaBoard.VerifySetBIWView().run("Set Name":/by Category/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Techno Update Visible1/.toString(),"Stack Name Memo belongs to":/New Product/.toString(),"Number of Matches":/1/.toString())
        //Search Idea in Top Ideas
        new actions.PipelineTopIdeas.SearchIdeaInTopIdeas().run("Search Value":/technology/.toString(),"Search with 'Enter'?":false)
        //Verify Stacks in Top Ideas
        new actions.PipelineTopIdeas.VerifyStacksInTopIdeas().run("Stack":/Quick Add/.toString(),"Idea Count":/1/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Stacks in Top Ideas
        new actions.PipelineTopIdeas.VerifyStacksInTopIdeas().run("Stack":/New Product/.toString(),"Idea Count":/1/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Stacks in Top Ideas
        new actions.PipelineTopIdeas.VerifyStacksInTopIdeas().run("Stack":/Process Improvement/.toString(),"Idea Count":/0/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Stacks in Top Ideas
        new actions.PipelineTopIdeas.VerifyStacksInTopIdeas().run("Stack":/Marketing & Branding/.toString(),"Idea Count":/0/.toString(),"Placement Number":/4/.toString(),"Number of Matches":/1/.toString())
        //Verify Stacks in Top Ideas
        new actions.PipelineTopIdeas.VerifyStacksInTopIdeas().run("Stack":/Strategy/.toString(),"Idea Count":/1/.toString(),"Placement Number":/5/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Techno Update Visible1/.toString(),"Stack Name Memo belongs to":/New Product/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Technology Update Visible1/.toString(),"Stack Name Memo belongs to":/New Product/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Technology Update Visible2/.toString(),"Stack Name Memo belongs to":/Strategy/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Technology Update Hidden1/.toString(),"Stack Name Memo belongs to":/Quick Add/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/moderator@test.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Idea Box BIW/.toString(),"Area to Navigate to":/Top Ideas/.toString())
        //Verify Set in Top Ideas
        new actions.IdeaBoard.VerifySetBIWView().run("Set Name":/by Category/.toString())
        //Search Idea in Top Ideas
        new actions.PipelineTopIdeas.SearchIdeaInTopIdeas().run("Search Value":/technology/.toString(),"Search with 'Enter'?":false)
        //Verify Stacks in Top Ideas
        new actions.PipelineTopIdeas.VerifyStacksInTopIdeas().run("Stack":/Quick Add/.toString(),"Idea Count":/1/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Stacks in Top Ideas
        new actions.PipelineTopIdeas.VerifyStacksInTopIdeas().run("Stack":/New Product/.toString(),"Idea Count":/1/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Stacks in Top Ideas
        new actions.PipelineTopIdeas.VerifyStacksInTopIdeas().run("Stack":/Process Improvement/.toString(),"Idea Count":/0/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Stacks in Top Ideas
        new actions.PipelineTopIdeas.VerifyStacksInTopIdeas().run("Stack":/Marketing & Branding/.toString(),"Idea Count":/0/.toString(),"Placement Number":/4/.toString(),"Number of Matches":/1/.toString())
        //Verify Stacks in Top Ideas
        new actions.PipelineTopIdeas.VerifyStacksInTopIdeas().run("Stack":/Strategy/.toString(),"Idea Count":/1/.toString(),"Placement Number":/5/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Technology Update Visible1/.toString(),"Stack Name Memo belongs to":/New Product/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Technology Update Visible2/.toString(),"Stack Name Memo belongs to":/Strategy/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Technology Update Hidden1/.toString(),"Stack Name Memo belongs to":/Quick Add/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/analyst@test.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Idea Box BIW/.toString(),"Area to Navigate to":/Top Ideas/.toString())
        //Verify Set in Top Ideas
        new actions.IdeaBoard.VerifySetBIWView().run("Set Name":/by Category/.toString())
        //Search Idea in Top Ideas
        new actions.PipelineTopIdeas.SearchIdeaInTopIdeas().run("Search Value":/technology/.toString(),"Search with 'Enter'?":false)
        //Verify Stacks in Top Ideas
        new actions.PipelineTopIdeas.VerifyStacksInTopIdeas().run("Stack":/Quick Add/.toString(),"Idea Count":/1/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Stacks in Top Ideas
        new actions.PipelineTopIdeas.VerifyStacksInTopIdeas().run("Stack":/New Product/.toString(),"Idea Count":/1/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Stacks in Top Ideas
        new actions.PipelineTopIdeas.VerifyStacksInTopIdeas().run("Stack":/Process Improvement/.toString(),"Idea Count":/0/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Stacks in Top Ideas
        new actions.PipelineTopIdeas.VerifyStacksInTopIdeas().run("Stack":/Marketing & Branding/.toString(),"Idea Count":/0/.toString(),"Placement Number":/4/.toString(),"Number of Matches":/1/.toString())
        //Verify Stacks in Top Ideas
        new actions.PipelineTopIdeas.VerifyStacksInTopIdeas().run("Stack":/Strategy/.toString(),"Idea Count":/1/.toString(),"Placement Number":/5/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Technology Update Visible1/.toString(),"Stack Name Memo belongs to":/New Product/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Technology Update Visible2/.toString(),"Stack Name Memo belongs to":/Strategy/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Technology Update Hidden1/.toString(),"Stack Name Memo belongs to":/Quick Add/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Search Idea in Top Ideas
        new actions.PipelineTopIdeas.SearchIdeaInTopIdeas().run("Clear Search":true)
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Techno Update Visible1/.toString(),"Stack Name Memo belongs to":/New Product/.toString(),"Number of Matches":/1/.toString())
        //Verify Stacks in Top Ideas
        new actions.PipelineTopIdeas.VerifyStacksInTopIdeas().run("Stack":/New Product/.toString(),"Idea Count":/2/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
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