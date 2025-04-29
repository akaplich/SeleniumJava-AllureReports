package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C17687 - Edit Blog
class C17687_EditBlog
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
        new actions.general.Navigate().run("Area to Navigate to":/Blog/.toString())
        //Set Enterprise Blog Topics Widget
        new actions.EnterpriseBlogs.SetEnterpriseBlogTopicsWidget().run("Blog Topic":/Custom App/.toString(),"Action":/Create/.toString())
        //Set Blog Post
        new actions.EnterpriseBlogs.SetBlogPost().run("Add or Edit":/Add/.toString(),"Title":/First Blog Post/.toString(),"Tags":/firstblog/.toString(),"Add or Delete Tags":/Add/.toString(),"Content":/First Blog posted in custom app/.toString(),"Blog Topic":/Custom App/.toString(),"Action":/Post/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Blog/.toString())
        //Access Blog from Enterprise Blog List
        new actions.EnterpriseBlogs.AccessBlogfromEnterpriseBlogList().run("Blog Title":/First Blog Post/.toString(),"Blog Topic":/Custom App/.toString())
        //Set Blog Post
        new actions.EnterpriseBlogs.SetBlogPost().run("Add or Edit":/Edit/.toString(),"Title":/First Blog Post Edited/.toString(),"Action":/Save Changes/.toString())
        //Verify Enterprise and Initiative View Blog
        new actions.EnterpriseBlogs.VerifyEnterpriseViewBlog().run("Title":/First Blog Post Edited/.toString(),"Topic":/Custom App/.toString(),"Content":/First Blog posted in custom app/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Blog/.toString())
        //Verify Enterprise Blog List
        new actions.EnterpriseBlogs.VerifyEnterpriseBlogList().run("Title":/First Blog Post Edited/.toString(),"Topic":/Custom App/.toString(),"Posted By":/System Admin/.toString(),"Tags":/firstblog/.toString(),"Content":/First Blog posted in custom app/.toString(),"Comment Count":/0/.toString(),"Number of Matches":/1/.toString())
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