package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C17574 - Affiliate Summary - Report Format & Data
class C17574_AffiliateSummary_ReportFormatAndData
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
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Exports for SiteWide Tab
        new actions.SetupEnterpriseExports.SetEnterpriseExportsForSiteWideTab().run("Format":/csv/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Site-Wide/.toString(),"Report Name Starts with":/Affiliate/.toString(),"Instance":/1/.toString())
        //Verify Affiliate Summary Report
        new actions.SetupEnterpriseExports.VerifyAffiliateSummaryReport().run("File Name":/Affiliate-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":/3,0,3,1,0,0/.toString(),"Number of Rows":/2/.toString())
        //Remove Report from Enterprise and Community Setup Exports
        new actions.SetupEnterpriseExports.RemoveReportfromEnterpriseSetupExports().run("Section":/Site-Wide/.toString(),"Instance":/1/.toString(),"Report Name Starts with":/Affiliate/.toString(),"Action":/Delete Report/.toString())
        //Set Enterprise Setup Exports for SiteWide Tab
        new actions.SetupEnterpriseExports.SetEnterpriseExportsForSiteWideTab().run("Format":/xlsx/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Site-Wide/.toString(),"Report Name Starts with":/Affiliate/.toString(),"Instance":/1/.toString())
        //Verify Affiliate Summary Report
        new actions.SetupEnterpriseExports.VerifyAffiliateSummaryReport().run("File Name":/Affiliate-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":/3,0,3,1,0,0/.toString(),"Number of Rows":/2/.toString())
        //Remove Report from Enterprise and Community Setup Exports
        new actions.SetupEnterpriseExports.RemoveReportfromEnterpriseSetupExports().run("Section":/Site-Wide/.toString(),"Instance":/1/.toString(),"Report Name Starts with":/Affiliate/.toString(),"Action":/Delete Report/.toString())
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