import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C127988 - Community Search - Search Blog Post from as well as outside the community
class C127988_CommunitySearch_SearchBlogPostfromaswellasoutsidethecommunity
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
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Blog/.toString())
        //Set Blog Post
        new actions.EnterpriseBlogs.SetBlogPost().run("Add or Edit":/Add/.toString(),"Title":/Custom Blog/.toString(),"Content":/First Blog posted in custom app/.toString(),"Action":/Post/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Solve App/.toString(),"Area to Navigate to":/Blog/.toString())
        //Set Blog Post
        new actions.EnterpriseBlogs.SetBlogPost().run("Add or Edit":/Add/.toString(),"Title":/Solve Blog/.toString(),"Content":/First Blog posted in solve app/.toString(),"Action":/Post/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Go to Community
        new actions.SetupEnterpriseCommunities.GotoCommunity().run("Community Name to go to":/Developers Community/.toString())
        //Search Global Enterprise/Webstorm/Community
        new actions.Search.SearchEnterpriseWebstorm().run("Search Value":/Custom Blog/.toString())
        //Verify On Global Search Result
        new actions.Search.VerifyOnGlobalSearchResult().run("Title":/Custom Blog/.toString(),"Number of Matches":/1/.toString(),"Click on the result":true)
        //Verify Enterprise and Initiative View Blog
        new actions.EnterpriseBlogs.VerifyEnterpriseViewBlog().run("Title":/Custom Blog/.toString(),"Content":/First Blog posted in custom app/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Go to Community
        new actions.SetupEnterpriseCommunities.GotoCommunity().run("Community Name to go to":/Developers Community/.toString())
        //Search Global Enterprise/Webstorm/Community
        new actions.Search.SearchEnterpriseWebstorm().run("Search Value":/Solve Blog/.toString())
        //Verify On Global Search Result
        new actions.Search.VerifyOnGlobalSearchResult().run("Title":/Solve Blog/.toString(),"Number of Matches":/0/.toString())
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