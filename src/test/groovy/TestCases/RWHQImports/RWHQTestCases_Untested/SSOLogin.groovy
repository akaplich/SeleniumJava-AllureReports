package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//SSO Login
class SSOLogin
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
        new actions.general.NavigatetoSSOAffiliate().run("DomainName":/ssoaffiliateforautomation/.toString())
        //Set SSO Login
        new actions.SSOLogin.SetSSOLogin().run("SSO Test":true,"Username":/bi.adminuser1@brightidea.com/.toString(),"Password":/Brightidea!16/.toString())
        //Verify Webstorms in Large Visual Webstorm List
        new actions.Widgets.VerifyWebstormsinLargeVisualWebstormList().run("Webstorm Title":/Custom App/.toString(),"Number of Matches":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Home/.toString())
        //Copy Current URL
        variables."currentURL" = new actions.selenium.CopyCurrentURL().run([:])
        //Log Out
        new actions.general.LogOut().run([:])
        //Close All Browsers
        new actions.selenium.CloseBrowser().run([:])
        //Open Browser
        new actions.selenium.Browser().run("Run Browser in Incognito":/TRUE/.toString(),"URL":/${variables."currentURL"}/.toString(),"Browser Type":/Chrome/.toString())
        //Public Log In
        new actions.general.PublicLogOut().run([:])
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/*[@id='auth_0']/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/*[@id='page_auth_0']/.toString())
        //Set SSO Login
        new actions.SSOLogin.SetSSOLogin().run("Username":/bi.adminuser1@brightidea.com/.toString())
        //Set SSO Login
        new actions.SSOLogin.SetSSOLogin().run("Dont wait to load":true,"Password":/Brightidea!16/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Home/.toString())
        //Verify Initiative Home
        new actions.Webstorm.VerifyWebstormHome().run("Initiative Title":/Custom App/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
    }
    @AfterMethod
    public void afterState(){
        //Close All Browsers
        new actions.selenium.CloseBrowser().run([:])
    }
}