import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C130819 - Top Ideas By Category - Add, Rename, Delete List
class C130819_TopIdeasByCategory_Add_Rename_DeleteList
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
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Advanced Ideabox/.toString(),"Sponsor Name":/pipelinesponsor@mailinator.com/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/BIW Auto/.toString(),"Description":/this is idea box app Test App/.toString(),"Pipeline Administrators":/pipelineadmin@test.com/.toString(),"Administrators Add or Remove":/Add/.toString(),"Moderators":/moderator@test.com/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString(),"Action on General Information Tab":/Continue/.toString(),"Action on Design Tab":/Continue/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Site Setup Ideas for Top Ideas
        new actions.SetupIdeas.SetSiteSetupIdeasforTopIdeas().run("Top Ideas by Category":true)
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Top Ideas/.toString())
        //Click on My Lists in Top Ideas
        new actions.PipelineTopIdeas.TriggerMyLists().run("Click My Lists":true,"Quick My Lists Button Should Be Active After Click":true)
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/BUTTON[.='Create a List']/.toString(),"Should Element Exist":true,"Number of Matches":/1/.toString())
        //Click on My Lists in Top Ideas
        new actions.PipelineTopIdeas.TriggerMyLists().run("Click My Lists":true,"Quick My Lists Button Should Be Active After Click":false)
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/BUTTON[.='Create a List']/.toString(),"Should Element Exist":false)
        //Click on My Lists in Top Ideas
        new actions.PipelineTopIdeas.TriggerMyLists().run("Click My Lists":true,"Quick My Lists Button Should Be Active After Click":true)
        //Set My Lists in Top Ideas
        new actions.PipelineTopIdeas.SetListinTopIdeas().run("Select Action":/Add New List/.toString(),"New List Name":/testList1/.toString(),"Action":/Save/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Verify/Open My List in Top Idea
        new actions.PipelineTopIdeas.VerifyMyListInTopIdeas().run("My List Name":/testList1/.toString(),"Should Exist":true)
        //Set My Lists in Top Ideas
        new actions.PipelineTopIdeas.SetListinTopIdeas().run("Select Action":/Rename/.toString(),"List to perform action on":/testList1/.toString(),"New List Name":/updatedList/.toString(),"Action":/Save/.toString())
        //Verify/Open My List in Top Idea
        new actions.PipelineTopIdeas.VerifyMyListInTopIdeas().run("My List Name":/testList1/.toString(),"Should Exist":false)
        //Verify/Open My List in Top Idea
        new actions.PipelineTopIdeas.VerifyMyListInTopIdeas().run("My List Name":/updatedList/.toString(),"Should Exist":true)
        //Set My Lists in Top Ideas
        new actions.PipelineTopIdeas.SetListinTopIdeas().run("Select Action":/Delete/.toString(),"List to perform action on":/updatedList/.toString(),"Action":/Save/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Verify/Open My List in Top Idea
        new actions.PipelineTopIdeas.VerifyMyListInTopIdeas().run("My List Name":/updatedList/.toString(),"Should Exist":false)
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