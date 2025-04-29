package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C63103 - Top Indicators - Unique Logins
class C63103_TopIndicators_UniqueLogins
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
        new actions.selenium.Browser().run("Browser Type":/Chrome/.toString())
        //Navigate to Other Affiliate
        new actions.general.NavigatetoSSOAffiliate().run("DomainName":/ssoaffiliateforautomation/.toString())
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Geography Chart/.toString(),"Area to Navigate to":/Pipeline Dashboard/.toString())
        //Verify the Top Indicators on Overall Tab in Business Impact tab
        new actions.PipelineDashBoard.VerifytheTopIndicatorsonOverallTabinBusinessImpacttab().run("Top Indicator":/Unique Visitors/.toString(),"Value":/2/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
    }
    @AfterMethod
    public void afterState(){
        //Close All Browsers
        new actions.selenium.CloseBrowser().run([:])
    }
}