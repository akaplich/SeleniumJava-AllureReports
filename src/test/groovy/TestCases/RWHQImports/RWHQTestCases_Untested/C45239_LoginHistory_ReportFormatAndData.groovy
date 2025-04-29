package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C45239 - Login History - Report Format & Data
class C45239_LoginHistory_ReportFormatAndData
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
        //Log Out
        new actions.general.LogOut().run([:])
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Public Webstorm Home/.toString())
        //Login
        new actions.general.Login().run("Webstorm Login":true,"Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Public Webstorm Home/.toString())
        //Login
        new actions.general.Login().run("Webstorm Login":true,"Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Exports for Login History Tab
        new actions.SetupExports.SetWebstormSetupExportsforLoginHistorytab().run("Report Options":/Login History/.toString(),"Format":/csv/.toString())
        //Verify Generated Report in any Setup Exports
        new actions.SetupExports.VerifyGeneratedReportinSetupExports().run("Report Name Starts with":/Login_history/.toString(),"Number of Matches":/1/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Login History/.toString(),"Report Name Starts with":/Login_history/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Login_history-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Screen Name","Email Address","Login Date","Platform"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Login History/.toString(),"Report Name Starts with":/Login_history/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Login_history-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["System Admin","bi.adminuser1@brightidea.com"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Login History/.toString(),"Report Name Starts with":/Login_history/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Login_history-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["End User","bi.enduser1@brightidea.com"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
        //Remove Report from Setup Exports
        new actions.SetupExports.RemoveReportfromSetupExports().run("Section":/Login History/.toString(),"Report Name Starts with":/Login_history/.toString(),"Instance":/1/.toString(),"Action":/Delete Report/.toString())
        //Set Webstorm Setup Exports for Login History Tab
        new actions.SetupExports.SetWebstormSetupExportsforLoginHistorytab().run("Report Options":/Login History/.toString(),"Format":/xlsx/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Login History/.toString(),"Report Name Starts with":/Login_history/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Login_history-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["System Admin","bi.adminuser1@brightidea.com"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
        //Remove Report from Setup Exports
        new actions.SetupExports.RemoveReportfromSetupExports().run("Section":/Login History/.toString(),"Report Name Starts with":/Login_history/.toString(),"Instance":/1/.toString(),"Action":/Delete Report/.toString())
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