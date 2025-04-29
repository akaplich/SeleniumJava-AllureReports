package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C130742 - Top Ideas By Category - No Idea Empty State
class C130742_TopIdeasByCategory_NoIdeaEmptyState
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
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Steps/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/New Product Idea/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Quick Add Idea/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Process Improvement Idea/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/New Product Idea/.toString())
        //Change Idea Category in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaCategoryinPipelineStepspage().run("Category":/New Product/.toString(),"Action":/Change Category/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Process Improvement Idea/.toString())
        //Change Idea Category in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaCategoryinPipelineStepspage().run("Category":/Process Improvement/.toString(),"Action":/Change Category/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Top Ideas/.toString())
        //Search Idea in Top Ideas
        new actions.PipelineTopIdeas.SearchIdeaInTopIdeas().run("Search Value":/test/.toString(),"Search with 'Enter'?":false)
        //Verify Stacks in Top Ideas
        new actions.PipelineTopIdeas.VerifyStacksInTopIdeas().run("Stack":/Quick Add/.toString(),"Idea Count":/0/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Stacks in Top Ideas
        new actions.PipelineTopIdeas.VerifyStacksInTopIdeas().run("Stack":/New Product/.toString(),"Idea Count":/0/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Stacks in Top Ideas
        new actions.PipelineTopIdeas.VerifyStacksInTopIdeas().run("Stack":/Process Improvement/.toString(),"Idea Count":/0/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Stacks in Top Ideas
        new actions.PipelineTopIdeas.VerifyStacksInTopIdeas().run("Stack":/Marketing & Branding/.toString(),"Idea Count":/0/.toString(),"Placement Number":/4/.toString(),"Number of Matches":/1/.toString())
        //Verify Stacks in Top Ideas
        new actions.PipelineTopIdeas.VerifyStacksInTopIdeas().run("Stack":/Strategy/.toString(),"Idea Count":/0/.toString(),"Placement Number":/5/.toString(),"Number of Matches":/1/.toString())
        //Search Idea in Top Ideas
        new actions.PipelineTopIdeas.SearchIdeaInTopIdeas().run("Clear Search":true)
        //Wait
        new actions.general.Wait().run("Seconds":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Process Improvement Idea/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Search Idea in Top Ideas
        new actions.PipelineTopIdeas.SearchIdeaInTopIdeas().run("Search Value":/process improvements/.toString(),"Search with 'Enter'?":true)
        //Verify Stacks in Top Ideas
        new actions.PipelineTopIdeas.VerifyStacksInTopIdeas().run("Stack":/Quick Add/.toString(),"Idea Count":/0/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Stacks in Top Ideas
        new actions.PipelineTopIdeas.VerifyStacksInTopIdeas().run("Stack":/New Product/.toString(),"Idea Count":/0/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Stacks in Top Ideas
        new actions.PipelineTopIdeas.VerifyStacksInTopIdeas().run("Stack":/Process Improvement/.toString(),"Idea Count":/0/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Stacks in Top Ideas
        new actions.PipelineTopIdeas.VerifyStacksInTopIdeas().run("Stack":/Marketing & Branding/.toString(),"Idea Count":/0/.toString(),"Placement Number":/4/.toString(),"Number of Matches":/1/.toString())
        //Verify Stacks in Top Ideas
        new actions.PipelineTopIdeas.VerifyStacksInTopIdeas().run("Stack":/Strategy/.toString(),"Idea Count":/0/.toString(),"Placement Number":/5/.toString(),"Number of Matches":/1/.toString())
        //Search Idea in Top Ideas
        new actions.PipelineTopIdeas.SearchIdeaInTopIdeas().run("Clear Search":true)
        //Wait
        new actions.general.Wait().run("Seconds":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Quick Add Idea/.toString(),"Stack Name Memo belongs to":/Quick Add/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Set Global Filter in Top Ideas
        new actions.IdeaBoard.SetGlobalIdeaFilterBIW().run("Invoke Filter":true,"Object Type":[],"Status":["Implemented"],"Stage":[],"Step":[],"Category":[],"Owner":[],"Tags":[],"Clear Individual Filters":[],"Action":/Save/.toString(),"Filter Button Should be Active":true)
        //Verify Stacks in Top Ideas
        new actions.PipelineTopIdeas.VerifyStacksInTopIdeas().run("Stack":/Quick Add/.toString(),"Idea Count":/0/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Stacks in Top Ideas
        new actions.PipelineTopIdeas.VerifyStacksInTopIdeas().run("Stack":/New Product/.toString(),"Idea Count":/0/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Stacks in Top Ideas
        new actions.PipelineTopIdeas.VerifyStacksInTopIdeas().run("Stack":/Process Improvement/.toString(),"Idea Count":/0/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Stacks in Top Ideas
        new actions.PipelineTopIdeas.VerifyStacksInTopIdeas().run("Stack":/Marketing & Branding/.toString(),"Idea Count":/0/.toString(),"Placement Number":/4/.toString(),"Number of Matches":/1/.toString())
        //Verify Stacks in Top Ideas
        new actions.PipelineTopIdeas.VerifyStacksInTopIdeas().run("Stack":/Strategy/.toString(),"Idea Count":/0/.toString(),"Placement Number":/5/.toString(),"Number of Matches":/1/.toString())
        //Set Global Filter in Top Ideas
        new actions.IdeaBoard.SetGlobalIdeaFilterBIW().run("Invoke Filter":true,"Object Type":[],"Status":[],"Stage":[],"Step":[],"Category":[],"Owner":[],"Tags":[],"Clear Individual Filters":[])
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/DIV[contains(@class,'f-footer')]\/\/BUTTON[contains(.,'Clear Filters')]/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Process Improvement Idea/.toString(),"Stack Name Memo belongs to":/Process Improvement/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
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