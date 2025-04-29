import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C118916 - Submissions Tab - Submissions - Profile Data and Date Picker
class C118916_SubmissionsTab_Submissions_ProfileDataandDatePicker
{
//    private static def variables = [:]
//
//    @BeforeSuite
//    public void beforeState(){
//        variables."URL" = /https:\/\/test.brightideatest.com/
//        variables."Browser" = /Chrome/
//        variables."TestRail_RunName" = null
//        variables."TestRail_ExecutionName" = null
//        variables."CodeEnvironment" = /Default/
//        variables."Database" = null
//    }
//    @Test
//    public void testcase(){
//        //Basestate
//        Action58123c20fa4ee77809f468f6([:])
//        //Navigate
//        new actions.general.Navigate().run("Area to Navigate to":/Profile/.toString())
//        //Edit Your Profile
//        new actions.UserProfile.EditYourProfile().run("First Name":/BI/.toString(),"Last Name":/Admin/.toString(),"Job Title":/QA/.toString(),"Department":/Innovation/.toString())
//        //Navigate WebStorm or MTS
//        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
//        //Set Custom and Other App Post Idea
//        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/New Idea/.toString(),"Description":/New Idea Desc/.toString(),"Category":/Operations/.toString(),"Required Short Question":/Short Question Desc/.toString(),"Action":/Submit Idea/.toString())
//        //Navigate
//        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
//        //Select Community
//        new actions.SetupEnterpriseCommunities.SelectCommunity().run("Community Name":/Developers Community/.toString())
//        //Update Community
//        new actions.SetupEnterpriseCommunities.UpdateCommunity().run("Apps":/Solve App/.toString(),"Checkbox Check":/TRUE/.toString())
//        //Go to Community
//        new actions.SetupEnterpriseCommunities.GotoCommunity().run("Community Name to go to":/Developers Community/.toString())
//        //Navigate Community
//        new actions.SetupEnterpriseCommunities.NavigateCommunity().run("Community Page":/Setup/.toString())
//        //Set Community Setup Exports for Submissions Tab
//        new actions.SetupCommunityExports.SetCommunitySetupExportsforSubmissionsTab().run("Report Options":/Submissions/.toString(),"Format":/csv/.toString(),"Include user profile data":true)
//        //Download Generated Report From Enterprise and Community Exports
//        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Developers Community_Submissions/.toString(),"Instance":/1/.toString())
//        //Verify File Data
//        new actions.general.VerifyFileData().run("File Name":/*Submissions-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Initiative","Initiative ID","Code","Category","Submitted","Submitter","Submitter email","Submission Team","Title","Description","Status","Stage","Step","Score"],"Number of Matches":/1/.toString(),"Total Number of Rows":/12/.toString())
//        //Download Generated Report From Enterprise and Community Exports
//        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Developers Community_Submissions/.toString(),"Instance":/1/.toString())
//        //Verify File Data
//        new actions.general.VerifyFileData().run("File Name":/*Submissions-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Count of Comments","Number of Views","Projected Benefit ($)","Projected Cost ($)","Actual Benefit ($)","Actual Cost ($)","Non-Financial Benefit","Associated Tags","Has Attachment?","Submitted From","External ID"],"Number of Matches":/1/.toString(),"Total Number of Rows":/12/.toString())
//        //Download Generated Report From Enterprise and Community Exports
//        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Developers Community_Submissions/.toString(),"Instance":/1/.toString())
//        //Verify File Data
//        new actions.general.VerifyFileData().run("File Name":/*Submissions-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Screen Name","Email","First Name","Last Name","Job Title","Department","Location","Photo","Submitted From","External ID"],"Number of Matches":/1/.toString(),"Total Number of Rows":/12/.toString())
//        //Download Generated Report From Enterprise and Community Exports
//        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Developers Community_Submissions/.toString(),"Instance":/1/.toString())
//        //Verify File Data
//        new actions.general.VerifyFileData().run("File Name":/*Submissions-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["D106","Solution"],"Number of Matches":/1/.toString(),"Total Number of Rows":/12/.toString())
//        //Download Generated Report From Enterprise and Community Exports
//        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Developers Community_Submissions/.toString(),"Instance":/1/.toString())
//        //Verify File Data
//        new actions.general.VerifyFileData().run("File Name":/*Submissions-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["System Admin","bi.adminuser1@brightidea.com","BI","Admin","QA","Innovation"],"Number of Matches":/1/.toString(),"Total Number of Rows":/12/.toString())
//        //Remove Report from Enterprise and Community Setup Exports
//        new actions.SetupEnterpriseExports.RemoveReportfromEnterpriseSetupExports().run("Section":/Submissions/.toString(),"Instance":/1/.toString(),"Report Name Starts with":/Developers Community_Submissions/.toString(),"Action":/Delete Report/.toString())
//        //Set Community Setup Exports for Submissions Tab
//        new actions.SetupCommunityExports.SetCommunitySetupExportsforSubmissionsTab().run("Report Options":/Submissions/.toString(),"Format":/xlsx/.toString(),"Include user profile data":true)
//        //Verify Generated Report in any Setup Exports
//        new actions.SetupExports.VerifyGeneratedReportinSetupExports().run("Report Name Starts with":/Developers Community_Submissions/.toString(),"Number of Matches":/1/.toString())
//        //Download Generated Report From Enterprise and Community Exports
//        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Developers Community_Submissions/.toString(),"Instance":/1/.toString())
//        //Wait
//        new actions.general.Wait().run("Seconds":/15/.toString())
//        //Verify File Data
//        new actions.general.VerifyFileData().run("File Name":/*Submissions-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Initiative","Initiative ID","Code","Category","Submitted","Submitter","Submitter email","Submission Team","Title","Description","Status","Stage","Step","Score"],"Number of Matches":/1/.toString(),"Total Number of Rows":/7/.toString())
//        //Download Generated Report From Enterprise and Community Exports
//        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Developers Community_Submissions/.toString(),"Instance":/1/.toString())
//        //Verify File Data
//        new actions.general.VerifyFileData().run("File Name":/*Submissions-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Count of Comments","Number of Views","Projected Benefit ($)","Projected Cost ($)","Actual Benefit ($)","Actual Cost ($)","Non-Financial Benefit","Associated Tags","Has Attachment?","Submitted From","External ID"],"Number of Matches":/1/.toString(),"Total Number of Rows":/7/.toString())
//        //Download Generated Report From Enterprise and Community Exports
//        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Developers Community_Submissions/.toString(),"Instance":/1/.toString())
//        //Verify File Data
//        new actions.general.VerifyFileData().run("File Name":/*Submissions-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Screen Name","Email","First Name","Last Name","Job Title","Department","Location","Photo","Submitted From","External ID"],"Number of Matches":/1/.toString(),"Total Number of Rows":/7/.toString())
//        //Download Generated Report From Enterprise and Community Exports
//        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Developers Community_Submissions/.toString(),"Instance":/1/.toString())
//        //Verify File Data
//        new actions.general.VerifyFileData().run("File Name":/*Submissions-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["D107","Operations"],"Number of Matches":/1/.toString(),"Total Number of Rows":/7/.toString())
//        //Download Generated Report From Enterprise and Community Exports
//        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Developers Community_Submissions/.toString(),"Instance":/1/.toString())
//        //Verify File Data
//        new actions.general.VerifyFileData().run("File Name":/*Submissions-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["System Admin","bi.adminuser1@brightidea.com","BI","Admin","QA","Innovation"],"Number of Matches":/1/.toString(),"Total Number of Rows":/7/.toString())
//        //Download Generated Report From Enterprise and Community Exports
//        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Developers Community_Submissions/.toString(),"Instance":/1/.toString())
//        //Verify File Data
//        new actions.general.VerifyFileData().run("File Name":/*Submissions-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["D106","Solution"],"Number of Matches":/1/.toString(),"Total Number of Rows":/7/.toString())
//        //Download Generated Report From Enterprise and Community Exports
//        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Developers Community_Submissions/.toString(),"Instance":/1/.toString())
//        //Verify File Data
//        new actions.general.VerifyFileData().run("File Name":/*Submissions-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["D108","Solution"],"Number of Matches":/0/.toString(),"Total Number of Rows":/7/.toString())
//        //Remove Report from Enterprise and Community Setup Exports
//        new actions.SetupEnterpriseExports.RemoveReportfromEnterpriseSetupExports().run("Section":/Submissions/.toString(),"Instance":/1/.toString(),"Report Name Starts with":/Developers Community_Submissions/.toString(),"Action":/Delete Report/.toString())
//    }
//    //Basestate
//    public static def Action58123c20fa4ee77809f468f6(def params){
//        //Create Affiliate based on Master Affiliate
//        variables."affiliateURL" = new actions.API.Utils.CopyAffiliate().run("Licensing Model":/${params."Licensing Model"}/.toString(),"Unlimited Brightidea Administrator License Type":/${params."Unlimited Brightidea Administrator License Type"}/.toString(),"Brightidea Administrator License Type Purchased Count":/${params."Brightidea Administrator License Type Purchased Count"}/.toString(),"Unlimited Idea Box Manager License Type":/${params."Unlimited Idea Box Manager License Type"}/.toString(),"Idea Box Manager License Type Purchased Count":/${params."Idea Box Manager License Type Purchased Count"}/.toString())
//        //Open Browser
//        new actions.selenium.Browser().run("Run Browser in Incognito":/${params."Run Browser in Incognito"}/.toString(),"URL":/${variables."affiliateURL"}/.toString(),"Browser Type":/${variables."Browser"}/.toString())
//        //Login
//        new actions.general.Login().run("Email":/${params."Username Email"}/.toString(),"Password":/brightidea1/.toString())
//        //Set to Lab Environment
//        new actions.Utils.SettoLabEnvironment().run("Email":/${params."Username Email"}/.toString())
//
//    }
//    //Afterstate
//    public static def Action581259c8fa4ee77809f46905(def params){
//        try{
//            //Close Current Window
//            new actions.selenium.CloseWindow().run([:])
//        }
//       catch(all){}catch(Error err){}
//        //Delete Affiliate
//        new actions.API.Utils.DeleteAffiliate().run([:])
//
//    }
//    @AfterMethod
//    public void afterState(){
//        //Afterstate
//        Action581259c8fa4ee77809f46905([:])
//    }
}