package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C10721 - Initiatives - Report Format & Data
class C10721_Initiatives_ReportFormatAndData
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
        //Set Enterprise and Community Setup Exports for Initiatives tab
        new actions.SetupEnterpriseExports.SetEnterpriseExportsforInitiativestab().run("Report Options":/Initiatives/.toString(),"Format":/csv/.toString())
        //Verify Generated Report in any Setup Exports
        new actions.SetupExports.VerifyGeneratedReportinSetupExports().run("Report Name Starts with":/All_initiatives/.toString(),"Number of Matches":/1/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Initiatives/.toString(),"Report Name Starts with":/All_initiatives/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/All_initiatives-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Date Created","Status","Initiative","Initiative ID"],"Number of Matches":/1/.toString(),"Total Number of Rows":/4/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Initiatives/.toString(),"Report Name Starts with":/All_initiatives/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/All_initiatives-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Description","Active Users","Access Groups","Sponsor","Administrators"],"Number of Matches":/1/.toString(),"Total Number of Rows":/4/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Initiatives/.toString(),"Report Name Starts with":/All_initiatives/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/All_initiatives-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Submissions","Communities","Meta Keywords"],"Number of Matches":/1/.toString(),"Total Number of Rows":/4/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Initiatives/.toString(),"Report Name Starts with":/All_initiatives/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/All_initiatives-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Closed","Evaluators app","Evaluators app desc","All","Sri","Pipeline Admin"],"Number of Matches":/1/.toString(),"Total Number of Rows":/4/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Initiatives/.toString(),"Report Name Starts with":/All_initiatives/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/All_initiatives-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["1","Developers Community"],"Number of Matches":/1/.toString(),"Total Number of Rows":/4/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Initiatives/.toString(),"Report Name Starts with":/All_initiatives/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/All_initiatives-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Solve App","Solve App Desc"],"Number of Matches":/1/.toString(),"Total Number of Rows":/4/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Initiatives/.toString(),"Report Name Starts with":/All_initiatives/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/All_initiatives-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Custom App","Custom App Desc"],"Number of Matches":/1/.toString(),"Total Number of Rows":/4/.toString())
        //Remove Report from Enterprise and Community Setup Exports
        new actions.SetupEnterpriseExports.RemoveReportfromEnterpriseSetupExports().run("Section":/Initiatives/.toString(),"Instance":/1/.toString(),"Report Name Starts with":/All_initiatives/.toString(),"Action":/Delete Report/.toString())
        //Set Enterprise and Community Setup Exports for Initiatives tab
        new actions.SetupEnterpriseExports.SetEnterpriseExportsforInitiativestab().run("Report Options":/Initiatives/.toString(),"Format":/xlsx/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Initiatives/.toString(),"Report Name Starts with":/All_initiatives/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/All_initiatives-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Date Created","Status","Initiative","Initiative ID"],"Number of Matches":/1/.toString(),"Total Number of Rows":/4/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Initiatives/.toString(),"Report Name Starts with":/All_initiatives/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/All_initiatives-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Evaluators app","Evaluators app desc"],"Number of Matches":/1/.toString(),"Total Number of Rows":/4/.toString())
        //Remove Report from Enterprise and Community Setup Exports
        new actions.SetupEnterpriseExports.RemoveReportfromEnterpriseSetupExports().run("Section":/Initiatives/.toString(),"Instance":/1/.toString(),"Report Name Starts with":/All_initiatives/.toString(),"Action":/Delete Report/.toString())
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