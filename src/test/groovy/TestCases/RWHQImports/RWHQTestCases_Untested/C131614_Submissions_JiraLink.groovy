package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131614 - Submissions - Jira Link
class C131614_Submissions_JiraLink
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
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/https:\/\/anna81.brightideatest.com/.toString())
        //Login
        new actions.general.Login().run("Email":/nonbisysadmin@test.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Jira Test - Do Not Change/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Exports for Submissions tab
        new actions.SetupExports.SetWebstormSetupExportsforSubmissionstab().run("Report Options":/Submissions/.toString(),"Format":/xlsx/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Submissions/.toString(),"Report Name Starts with":/Ideas/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Ideas-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Jira Link"],"Number of Matches":/1/.toString(),"Total Number of Rows":/2/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Submissions/.toString(),"Report Name Starts with":/Ideas/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Ideas-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["https://brightidea.jira.com/browse/BJCT-183"],"Number of Matches":/1/.toString(),"Total Number of Rows":/2/.toString())
        //Remove Report from Setup Exports
        new actions.SetupExports.RemoveReportfromSetupExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Ideas/.toString(),"Instance":/1/.toString(),"Action":/Delete Report/.toString())
    }
    @AfterMethod
    public void afterState(){
        try{
            //Log Out
            new actions.general.LogOut().run([:])
        }
       catch(all){}catch(Error err){}
        //Close All Browsers
        new actions.selenium.CloseBrowser().run([:])
    }
}