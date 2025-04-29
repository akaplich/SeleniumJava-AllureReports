package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C10787 - Submissions - Report Format & Data
class C10787_Submissions_ReportFormatAndData
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
        //Set Enterprise Setup Exports for Submissions tab
        new actions.SetupEnterpriseExports.SetEnterpriseExportsforSubmissionstab().run("Report Options":/Submissions/.toString(),"Format":/xlsx/.toString())
        //Verify Generated Report in any Setup Exports
        new actions.SetupExports.VerifyGeneratedReportinSetupExports().run("Report Name Starts with":/Submissions/.toString(),"Number of Matches":/1/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Submissions/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Submissions-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Initiative","Initiative ID","Code","Category","Submitted","Submitter","Submitter email","Submission Team","Title","Description"],"Number of Matches":/1/.toString(),"Total Number of Rows":/7/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Submissions/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Submissions-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Status","Stage","Step","Score","Count of Comments","Number of Views"],"Number of Matches":/1/.toString(),"Total Number of Rows":/7/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Submissions/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Submissions-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["D107","Operations"],"Number of Matches":/1/.toString(),"Total Number of Rows":/7/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Submissions/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Submissions-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["D105","Quick Add"],"Number of Matches":/1/.toString(),"Total Number of Rows":/7/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Submissions/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Submissions-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["D102","New Product"],"Number of Matches":/1/.toString(),"Total Number of Rows":/7/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Submissions/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Submissions-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["D108","Solution"],"Number of Matches":/1/.toString(),"Total Number of Rows":/7/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Submissions/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Submissions-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["D106","Solution"],"Number of Matches":/1/.toString(),"Total Number of Rows":/7/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Submissions/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Submissions-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["D103","Solution"],"Number of Matches":/1/.toString(),"Total Number of Rows":/7/.toString())
        //Remove Report from Enterprise and Community Setup Exports
        new actions.SetupEnterpriseExports.RemoveReportfromEnterpriseSetupExports().run("Section":/Submissions/.toString(),"Instance":/1/.toString(),"Report Name Starts with":/Submissions/.toString(),"Action":/Delete Report/.toString())
        //Set Enterprise Setup Exports for Submissions tab
        new actions.SetupEnterpriseExports.SetEnterpriseExportsforSubmissionstab().run("Report Options":/Submissions/.toString(),"Format":/xlsx/.toString())
        //Verify Generated Report in any Setup Exports
        new actions.SetupExports.VerifyGeneratedReportinSetupExports().run("Report Name Starts with":/Submissions/.toString(),"Number of Matches":/1/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Submissions/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Submissions-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["D103","Solution"],"Number of Matches":/1/.toString(),"Total Number of Rows":/7/.toString())
        //Remove Report from Enterprise and Community Setup Exports
        new actions.SetupEnterpriseExports.RemoveReportfromEnterpriseSetupExports().run("Section":/Submissions/.toString(),"Instance":/1/.toString(),"Report Name Starts with":/Submissions/.toString(),"Action":/Delete Report/.toString())
        //Verify Generated Report in any Setup Exports
        new actions.SetupExports.VerifyGeneratedReportinSetupExports().run("Report Name Starts with":/Submissions/.toString(),"Number of Matches":/0/.toString())
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