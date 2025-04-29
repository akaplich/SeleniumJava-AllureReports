package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C128747 - Cross Affiliate - New Blogs
class C128747_CrossAffiliate_NewBlogs
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
        //Open Browser
        new actions.selenium.Browser().run("Run Browser in Incognito":/TRUE/.toString(),"Browser Type":/Chrome/.toString())
        //Navigate to Other Affiliate
        new actions.general.NavigatetoSSOAffiliate().run("DomainName":/crossaffiliatetesting1/.toString())
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Blog/.toString())
        //Set Enterprise Blog Topics Widget
        new actions.EnterpriseBlogs.SetEnterpriseBlogTopicsWidget().run("Blog Topic":/Topic2/.toString(),"Action":/Create/.toString())
        //Set Blog Post
        new actions.EnterpriseBlogs.SetBlogPost().run("Add or Edit":/Add/.toString(),"Title":/Cross Affiliate Blog Post2/.toString(),"Content":/desc/.toString(),"Blog Topic":/Topic2/.toString(),"Action":/Post/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Navigate to Other Affiliate
        new actions.general.NavigatetoSSOAffiliate().run("DomainName":/crossaffiliatetesting2/.toString())
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Blog/.toString())
        //Verify Number of Blog Topics and Blog Posts
        new actions.EnterpriseBlogs.VerifyNumberofBlogTopics().run("Total Number of Blog List Records":/0/.toString(),"Total Number of Blog Post Records":/0/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
    }
    @AfterMethod
    public void afterState(){
        //Navigate to Other Affiliate
        new actions.general.NavigatetoSSOAffiliate().run("DomainName":/crossaffiliatetesting1/.toString())
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Blog/.toString())
        //Delete Blog Topic From Enterprise Blog List
        new actions.EnterpriseBlogs.DeleteBlogTopicFromEnterpriseBlogList().run("Blog to be Deleted":/Topic2/.toString())
        //Close All Browsers
        new actions.selenium.CloseBrowser().run([:])
    }
}