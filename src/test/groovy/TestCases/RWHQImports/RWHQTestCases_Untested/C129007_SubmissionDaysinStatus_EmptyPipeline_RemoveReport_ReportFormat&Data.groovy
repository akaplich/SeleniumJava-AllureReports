import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C129007 - Submission Days in Status - Empty Pipeline, Remove Report, Report Format & Data
class C129007_SubmissionDaysinStatus_EmptyPipeline_RemoveReport_ReportFormatAndData
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
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Test App/.toString(),"Description":/desc/.toString(),"Action":/Create/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Webstorm Setup Exports for Submissions tab
        new actions.SetupExports.SetWebstormSetupExportsforSubmissionstab().run("Report Options":/Submission Days in Status/.toString(),"Format":/csv/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Submissions/.toString(),"Report Name Starts with":/Submission_Days_in_Status/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Submission_Days_in_Status-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Code","Title","Category","Status","Submitted","Days since Submitted"],"Number of Matches":/1/.toString(),"Total Number of Rows":/1/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Submissions/.toString(),"Report Name Starts with":/Submission_Days_in_Status/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Submission_Days_in_Status-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Days in Submitted","Days in Pending","Days in Under Review"],"Number of Matches":/1/.toString(),"Total Number of Rows":/1/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Submissions/.toString(),"Report Name Starts with":/Submission_Days_in_Status/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Submission_Days_in_Status-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Days in Completed","On Hold","Days in In Progress"],"Number of Matches":/1/.toString(),"Total Number of Rows":/1/.toString())
        //Remove Report from Setup Exports
        new actions.SetupExports.RemoveReportfromSetupExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Submission_Days_in_Status/.toString(),"Instance":/1/.toString(),"Action":/Delete Report/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Test App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/test idea3/.toString(),"Description":/desc/.toString(),"Category":/New Product/.toString(),"Action":/Submit Idea/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Webstorm Setup Exports for Submissions tab
        new actions.SetupExports.SetWebstormSetupExportsforSubmissionstab().run("Report Options":/Submission Days in Status/.toString(),"Format":/xlsx/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Submissions/.toString(),"Report Name Starts with":/Submission_Days_in_Status/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Submission_Days_in_Status-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["test idea3","0"],"Number of Matches":/1/.toString(),"Total Number of Rows":/2/.toString())
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