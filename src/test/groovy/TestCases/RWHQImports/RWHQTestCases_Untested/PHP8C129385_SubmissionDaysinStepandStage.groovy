package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//PHP8 C129385 - Submission Days in Step and Stage
class PHP8C129385_SubmissionDaysinStepandStage
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
        //Set Enterprise Setup for BIOnly Beta tab
        new actions.SetupBI.SetEnterpriseSetupforBIOnlyBetatab().run("Step and Stage Exports":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Exports for Submissions tab
        new actions.SetupExports.SetWebstormSetupExportsforSubmissionstab().run("Report Options":/Submission Days in Step and Stage/.toString(),"Format":/csv/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Submissions/.toString(),"Report Name Starts with":/Submission_Days_in_Step_Stage/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Submission_Days_in_Step_Stage-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Code","Title","Category","Status","Submitted","Days since Submitted","Review"],"Number of Matches":/1/.toString(),"Total Number of Rows":/4/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Submissions/.toString(),"Report Name Starts with":/Submission_Days_in_Step_Stage/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Submission_Days_in_Step_Stage-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["D102","test idea1","New Product"],"Number of Matches":/1/.toString(),"Total Number of Rows":/4/.toString())
        //Remove Report from Setup Exports
        new actions.SetupExports.RemoveReportfromSetupExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Submission_Days/.toString(),"Instance":/1/.toString(),"Action":/Delete Report/.toString())
        //Set Webstorm Setup Exports for Submissions tab
        new actions.SetupExports.SetWebstormSetupExportsforSubmissionstab().run("Report Options":/Submission Days in Step and Stage/.toString(),"Format":/xlsx/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Submissions/.toString(),"Report Name Starts with":/Submission_Days/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Submission_Days_in_Step_Stage-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Code","Title","Category","Status","Submitted","Days since Submitted","Review"],"Number of Matches":/1/.toString(),"Total Number of Rows":/4/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Submissions/.toString(),"Report Name Starts with":/Submission_Days_in_Step_Stage/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Submission_Days_in_Step_Stage-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["D102","test idea1","New Product"],"Number of Matches":/1/.toString(),"Total Number of Rows":/4/.toString())
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