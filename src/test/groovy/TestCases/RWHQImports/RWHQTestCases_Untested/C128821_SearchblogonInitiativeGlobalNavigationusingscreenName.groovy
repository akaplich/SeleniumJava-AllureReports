import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C128821 - Search blog on Initiative Global Navigation using screenName
class C128821_SearchblogonInitiativeGlobalNavigationusingscreenName
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
        new actions.EnterpriseBlogs.SetBlogPost().run("Add or Edit":/Add/.toString(),"Title":/First Blog Post/.toString(),"Tags":/firstblog/.toString(),"Add or Delete Tags":/Add/.toString(),"Content":/automation purpose/.toString(),"Action":/Post/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Home/.toString())
        //Search Global Enterprise/Webstorm/Community
        new actions.Search.SearchEnterpriseWebstorm().run("Search Value":/System Admin/.toString())
        //Verify On Global Search Result
        new actions.Search.VerifyOnGlobalSearchResult().run("Type":/Blog Posts/.toString(),"Title":/First Blog Post/.toString(),"Description":/automation purpose/.toString(),"Number of Matches":/1/.toString(),"Click on the result":true)
        //Verify Enterprise and Initiative View Blog
        new actions.EnterpriseBlogs.VerifyEnterpriseViewBlog().run("Title":/First Blog Post/.toString(),"Tags":/firstblog/.toString(),"Content":/automation purpose/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/moderator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Home/.toString())
        //Search Global Enterprise/Webstorm/Community
        new actions.Search.SearchEnterpriseWebstorm().run("Search Value":/System Admin/.toString())
        //Verify On Global Search Result
        new actions.Search.VerifyOnGlobalSearchResult().run("Type":/Blog Posts/.toString(),"Title":/First Blog Post/.toString(),"Description":/automation purpose/.toString(),"Number of Matches":/1/.toString(),"Click on the result":true)
        //Verify Enterprise and Initiative View Blog
        new actions.EnterpriseBlogs.VerifyEnterpriseViewBlog().run("Title":/First Blog Post/.toString(),"Tags":/firstblog/.toString(),"Content":/automation purpose/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/pipelineadmin@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Home/.toString())
        //Search Global Enterprise/Webstorm/Community
        new actions.Search.SearchEnterpriseWebstorm().run("Search Value":/System Admin/.toString())
        //Verify On Global Search Result
        new actions.Search.VerifyOnGlobalSearchResult().run("Type":/Blog Posts/.toString(),"Title":/First Blog Post/.toString(),"Description":/automation purpose/.toString(),"Number of Matches":/1/.toString(),"Click on the result":true)
        //Verify Enterprise and Initiative View Blog
        new actions.EnterpriseBlogs.VerifyEnterpriseViewBlog().run("Title":/First Blog Post/.toString(),"Tags":/firstblog/.toString(),"Content":/automation purpose/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/analyst@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Home/.toString())
        //Search Global Enterprise/Webstorm/Community
        new actions.Search.SearchEnterpriseWebstorm().run("Search Value":/System Admin/.toString())
        //Verify On Global Search Result
        new actions.Search.VerifyOnGlobalSearchResult().run("Type":/Blog Posts/.toString(),"Title":/First Blog Post/.toString(),"Description":/automation purpose/.toString(),"Number of Matches":/1/.toString(),"Click on the result":true)
        //Verify Enterprise and Initiative View Blog
        new actions.EnterpriseBlogs.VerifyEnterpriseViewBlog().run("Title":/First Blog Post/.toString(),"Tags":/firstblog/.toString(),"Content":/automation purpose/.toString())
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