package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C10791 - Voting History - Report Format & Data
class C10791_VotingHistory_ReportFormatAndData
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
        new actions.SetupEnterpriseExports.SetEnterpriseExportsforSubmissionstab().run("Report Options":/Voting History/.toString(),"Format":/csv/.toString())
        //Verify Generated Report in any Setup Exports
        new actions.SetupExports.VerifyGeneratedReportinSetupExports().run("Report Name Starts with":/Votes_history/.toString(),"Number of Matches":/1/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Votes_history/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Votes_history-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Initiative","Initiative ID","Code","Title","Voter","Voter Email","Votes","Chips","Vote Score","Vote Date"],"Number of Matches":/1/.toString(),"Total Number of Rows":/7/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Votes_history/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Votes_history-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Evaluators app","D108","eval idea 1","Sri","pipelinesponsor@test.com","Promoted","1"],"Number of Matches":/1/.toString(),"Total Number of Rows":/7/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Votes_history/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Votes_history-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Custom App","D107","test idea2","Sri","pipelinesponsor@test.com","Promoted","1"],"Number of Matches":/1/.toString(),"Total Number of Rows":/7/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Votes_history/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Votes_history-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["D106","solve test idea1","Sri","Promoted","1"],"Number of Matches":/1/.toString(),"Total Number of Rows":/7/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Votes_history/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Votes_history-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["D105","quick add1","Sri","Promoted","1"],"Number of Matches":/1/.toString(),"Total Number of Rows":/7/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Votes_history/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Votes_history-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["D103","solve test idea2","Sri","Promoted","1"],"Number of Matches":/1/.toString(),"Total Number of Rows":/7/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Votes_history/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Votes_history-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["D102","test idea1","Sri","Promoted","1"],"Number of Matches":/1/.toString(),"Total Number of Rows":/7/.toString())
        //Remove Report from Enterprise and Community Setup Exports
        new actions.SetupEnterpriseExports.RemoveReportfromEnterpriseSetupExports().run("Section":/Submissions/.toString(),"Instance":/1/.toString(),"Report Name Starts with":/Votes_history/.toString(),"Action":/Delete Report/.toString())
        //Set Enterprise Setup Exports for Submissions tab
        new actions.SetupEnterpriseExports.SetEnterpriseExportsforSubmissionstab().run("Report Options":/Voting History/.toString(),"Format":/xlsx/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Votes_history/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Votes_history-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["D107","test idea2","Sri","Promoted","1"],"Number of Matches":/1/.toString(),"Total Number of Rows":/7/.toString())
        //Remove Report from Enterprise and Community Setup Exports
        new actions.SetupEnterpriseExports.RemoveReportfromEnterpriseSetupExports().run("Section":/Submissions/.toString(),"Instance":/1/.toString(),"Report Name Starts with":/Votes_history/.toString(),"Action":/Delete Report/.toString())
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