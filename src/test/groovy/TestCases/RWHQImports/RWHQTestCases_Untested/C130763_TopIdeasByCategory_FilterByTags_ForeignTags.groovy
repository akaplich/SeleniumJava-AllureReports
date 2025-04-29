import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C130763 - Top Ideas By Category - Filter By Tags, Foreign Tags
class C130763_TopIdeasByCategory_FilterByTags_ForeignTags
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
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Site Setup Ideas for Top Ideas
        new actions.SetupIdeas.SetSiteSetupIdeasforTopIdeas().run("Top Ideas by Category":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Idea Box BIW/.toString(),"Area to Navigate to":/Top Ideas/.toString())
        //Quick Add Idea in Top Ideas
        new actions.PipelineTopIdeas.QuickAddIdeaInTopIdeas().run("Click Quick Add to Trigger Dialog":true,"Title":/test idea1/.toString(),"Action":/Submit/.toString())
        //Quick Add Idea in Top Ideas
        new actions.PipelineTopIdeas.QuickAddIdeaInTopIdeas().run("Click Quick Add to Trigger Dialog":true,"Title":/test idea4/.toString(),"Category":/New Product/.toString(),"Action":/Submit/.toString())
        //Quick Add Idea in Top Ideas
        new actions.PipelineTopIdeas.QuickAddIdeaInTopIdeas().run("Click Quick Add to Trigger Dialog":true,"Title":/test idea5/.toString(),"Category":/New Product/.toString(),"Action":/Submit/.toString())
        //Quick Add Idea in Top Ideas
        new actions.PipelineTopIdeas.QuickAddIdeaInTopIdeas().run("Click Quick Add to Trigger Dialog":true,"Title":/test idea2/.toString(),"Category":/Marketing & Branding/.toString(),"Action":/Submit/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Steps/.toString())
        //Select Multiple Ideas in Pipeline Steps
        new actions.PipelineStepsView.SelectMultipleIdeasinPipelineSteps().run("Idea Names":["test idea4","test idea5"])
        //Add Idea Tag in Pipeline Steps page
        new actions.PipelineStepsView.AddIdeaTaginPipelineStepspage().run("Tag Name":/москва/.toString(),"Tag Add or Remove":/Add/.toString(),"Action":/Add Tags/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/1/.toString())
        //Select Multiple Ideas in Pipeline Steps
        new actions.PipelineStepsView.SelectMultipleIdeasinPipelineSteps().run("Idea Names":["test idea2"])
        //Add Idea Tag in Pipeline Steps page
        new actions.PipelineStepsView.AddIdeaTaginPipelineStepspage().run("Tag Name":/москва,c130763/.toString(),"Tag Add or Remove":/Add,Add/.toString(),"Action":/Add Tags/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Top Ideas/.toString())
        //Set Global Filter in Top Ideas
        new actions.IdeaBoard.SetGlobalIdeaFilterBIW().run("Invoke Filter":true,"Object Type":[],"Status":[],"Stage":[],"Step":[],"Category":[],"Owner":[],"Tags":["москва"],"Clear Individual Filters":[],"Action":/Save/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/test idea4/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/test idea5/.toString(),"Stack Name Memo belongs to":/New Product/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/test idea2/.toString(),"Stack Name Memo belongs to":/Marketing & Branding/.toString(),"Number of Matches":/1/.toString())
        //Set Global Filter in Top Ideas
        new actions.IdeaBoard.SetGlobalIdeaFilterBIW().run("Invoke Filter":true,"Object Type":[],"Status":[],"Stage":[],"Step":[],"Category":[],"Owner":[],"Tags":["москва","c130763"],"Clear Individual Filters":[],"Action":/Save/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/test idea4/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/test idea5/.toString(),"Stack Name Memo belongs to":/New Product/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/test idea2/.toString(),"Stack Name Memo belongs to":/Marketing & Branding/.toString(),"Number of Matches":/1/.toString())
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