package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C131780 - Submissions - Days In Current Status
class C131780_Submissions_DaysInCurrentStatus
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
        new actions.selenium.Browser().run("URL":/https:\/\/anna81.brightideatest.com/.toString(),"Browser Type":/Chrome/.toString())
        try{
            //Login
            new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        }
       catch(all){}catch(Error err){}
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Memo Feb 27 - Do Not Change (C131779, C131780)/.toString(),"Area to Navigate to":/Setup/.toString())
        //Calculate Days Difference
        variables."daysInStatus" = new actions.Utils.CalculatethenumberofDays().run("Start Date":/02-09-2024/.toString(),"End Date":/today/.toString())
        //Set Webstorm Setup Exports for Submissions tab
        new actions.SetupExports.SetWebstormSetupExportsforSubmissionstab().run("Report Options":/Submissions/.toString(),"Format":/csv/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Submissions/.toString(),"Report Name Starts with":/Memos/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Memos-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Previous Status","Date Memo Entered Current Status","Days In Current Status"],"Number of Matches":/1/.toString(),"Total Number of Rows":/4/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Submissions/.toString(),"Report Name Starts with":/Memos/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Memos-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["D467","Incubate","02/09/2024","${daysInStatus}"],"Number of Matches":/1/.toString(),"Total Number of Rows":/4/.toString())
    }
    @AfterMethod
    public void afterState(){
        //Remove Report from Setup Exports
        new actions.SetupExports.RemoveReportfromSetupExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Memos/.toString(),"Instance":/1/.toString(),"Action":/Delete Report/.toString())
    }
}