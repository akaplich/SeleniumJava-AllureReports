package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C118921 - Submissions Tab - Step Change History
class C118921_SubmissionsTab_StepChangeHistory
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
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Pipeline A/.toString(),"Description":/desc/.toString(),"Action":/Create/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Steps/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Idea a1/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Idea a2/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Idea a3/.toString(),"Action":/Submit/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Select Community
        new actions.SetupEnterpriseCommunities.SelectCommunity().run("Community Name":/Developers Community/.toString())
        //Update Community
        new actions.SetupEnterpriseCommunities.UpdateCommunity().run("Apps":/Pipeline A/.toString(),"Checkbox Check":/TRUE/.toString())
        //Go to Community
        new actions.SetupEnterpriseCommunities.GotoCommunity().run("Community Name to go to":/Developers Community/.toString())
        //Navigate Community
        new actions.SetupEnterpriseCommunities.NavigateCommunity().run("Community Page":/Setup/.toString())
        //Set Community Setup Exports for Submissions Tab
        new actions.SetupCommunityExports.SetCommunitySetupExportsforSubmissionsTab().run("Report Options":/Submission Step Change History/.toString(),"Format":/csv/.toString())
        //Verify Generated Report in any Setup Exports
        new actions.SetupExports.VerifyGeneratedReportinSetupExports().run("Report Name Starts with":/Developers Community/.toString(),"Number of Matches":/1/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Developers Community_Submissions_Step_Change_History/.toString(),"Instance":/1/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/*Submissions_Step_Change_History*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Initiative","Code","Title","Step","Date Entered Step","Date Left Step","Days in Step","Next Step","User Name","User Email","Member ID"],"Number of Matches":/1/.toString(),"Total Number of Rows":/4/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Developers Community_Submissions_Step_Change_History/.toString(),"Instance":/1/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/*_Submissions_Step_Change_History*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Pipeline A","D113","Idea a1","Submitted"],"Number of Matches":/1/.toString(),"Total Number of Rows":/4/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Developers Community_Submissions_Step_Change_History/.toString(),"Instance":/1/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/*_Submissions_Step_Change_History*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Pipeline A","D114","Idea a2","Submitted"],"Number of Matches":/1/.toString(),"Total Number of Rows":/4/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Developers Community/.toString(),"Instance":/1/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/*_Submissions_Step_Change_History*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Pipeline A","D115","Idea a3","Submitted"],"Number of Matches":/1/.toString(),"Total Number of Rows":/4/.toString())
        //Remove Report from Enterprise and Community Setup Exports
        new actions.SetupEnterpriseExports.RemoveReportfromEnterpriseSetupExports().run("Section":/Submissions/.toString(),"Instance":/1/.toString(),"Report Name Starts with":/Developers Community_Submissions_Step_Change_History/.toString(),"Action":/Delete Report/.toString())
        //Verify Generated Report in any Setup Exports
        new actions.SetupExports.VerifyGeneratedReportinSetupExports().run("Report Name Starts with":/Developers Community_Submissions_Step_Change_History/.toString(),"Number of Matches":/0/.toString())
        //Set Community Setup Exports for Submissions Tab
        new actions.SetupCommunityExports.SetCommunitySetupExportsforSubmissionsTab().run("Report Options":/Submission Step Change History/.toString(),"Format":/xlsx/.toString())
        //Verify Generated Report in any Setup Exports
        new actions.SetupExports.VerifyGeneratedReportinSetupExports().run("Report Name Starts with":/Developers Community_Submissions_Step_Change_History/.toString(),"Number of Matches":/1/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Developers Community_Submissions_Step_Change_History/.toString(),"Instance":/1/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/*_Submissions_Step_Change_History*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Initiative","Code","Title","Step","Date Entered Step","Date Left Step","Days in Step","Next Step","User Name","User Email","Member ID"],"Number of Matches":/1/.toString(),"Total Number of Rows":/4/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Developers Community/.toString(),"Instance":/1/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/*_Submissions_Step_Change_History*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Pipeline A","D113","Idea a1","Submitted"],"Number of Matches":/1/.toString(),"Total Number of Rows":/4/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Developers Community/.toString(),"Instance":/1/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/*_Submissions_Step_Change_History*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Pipeline A","D114","Idea a2","Submitted"],"Number of Matches":/1/.toString(),"Total Number of Rows":/4/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Developers Community/.toString(),"Instance":/1/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/*_Submissions_Step_Change_History*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Pipeline A","D115","Idea a3","Submitted"],"Number of Matches":/1/.toString(),"Total Number of Rows":/4/.toString())
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