import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C118926 - Users Tab - User Activity - Profile Data and Date Picker
class C118926_UsersTab_UserActivity_ProfileDataandDatePicker
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
        //Delete this when Scheduler feature is enabled for everyone
        Action66ec7933e12425a91ee5d983([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Profile/.toString())
        //Edit Your Profile
        new actions.UserProfile.EditYourProfile().run("First Name":/BI/.toString(),"Last Name":/Admin/.toString(),"Job Title":/QA/.toString(),"Department":/Innovation/.toString(),"Location":/United States/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Set Vote in View Idea page
        new actions.ViewIdea.SetVoteinViewIdeapage().run("Vote":/Up/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Solve App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Disable Scheduler
        new actions.SetupScheduler.SetDisableScheduler().run("Status":/Active/.toString(),"Enable Submission":true,"Enable Voting":true,"Action":/Disable Schedule/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Solve App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/solve test idea1/.toString())
        //Set Vote in View Idea page
        new actions.ViewIdea.SetVoteinViewIdeapage().run("Vote":/Up/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Go to Community
        new actions.SetupEnterpriseCommunities.GotoCommunity().run("Community Name to go to":/Developers Community/.toString())
        //Navigate Community
        new actions.SetupEnterpriseCommunities.NavigateCommunity().run("Community Page":/Setup/.toString())
        //Set Community Setup Exports For Users Tab
        new actions.SetupCommunityExports.SetCommunitySetupExportsForUsersTab().run("Report Options":/User Activity/.toString(),"Format":/csv/.toString(),"Include user profile data":true)
        //Verify Generated Report in any Setup Exports
        new actions.SetupExports.VerifyGeneratedReportinSetupExports().run("Report Name Starts with":/Developers Community_User_Activity/.toString(),"Number of Matches":/1/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Users/.toString(),"Report Name Starts with":/Developers Community_User_Activity/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Developers Community_User_Activity*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Screen Name","Email Address","Last Visit","Create_date","User_create_month_year","Total Points","Submissions","Drafts","Comments","Promotes","Demotes","Registered","Invited a Friend","Friend Registered","Promote Votes","Number of submissions viewed"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Users/.toString(),"Report Name Starts with":/Developers Community_User_Activity-/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Developers Community_User_Activity*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Submissions","Comments","Promotes","Demotes","Registered","Invited a Friend","Friend Registered","Promote Votes","Status Change","Screen Name","First Name","Last Name","Job Title","Department","Admin Status","Active","External ID","Photo","Location"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Users/.toString(),"Report Name Starts with":/Developers Community_User_Activity-/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Developers Community_User_Activity*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Screen Name","Email","First Name","Last Name","Job Title","Department","Location","Photo","Admin Status (Y/N)","Active","External ID"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Users/.toString(),"Report Name Starts with":/Developers Community_User_Activity-/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Developers Community_User_Activity*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["System Admin","bi.adminuser1@brightidea.com","BI","Admin","QA","Innovation","United States"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
        //Remove Report from Enterprise and Community Setup Exports
        new actions.SetupEnterpriseExports.RemoveReportfromEnterpriseSetupExports().run("Section":/Users/.toString(),"Instance":/1/.toString(),"Report Name Starts with":/Developers Community_User_Activity/.toString(),"Action":/Delete Report/.toString())
        //Set Community Setup Exports For Users Tab
        new actions.SetupCommunityExports.SetCommunitySetupExportsForUsersTab().run("Report Options":/User Activity/.toString(),"Format":/xlsx/.toString(),"Include user profile data":true)
        //Verify Generated Report in any Setup Exports
        new actions.SetupExports.VerifyGeneratedReportinSetupExports().run("Report Name Starts with":/Developers Community_User_Activity-/.toString(),"Number of Matches":/1/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Users/.toString(),"Report Name Starts with":/Developers Community_User_Activity-/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Developers Community_User_Activity*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Screen Name","Create_date","Email Address","Total Points","Submissions","Promotes","Registered","Last Visit"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Users/.toString(),"Report Name Starts with":/Developers Community_User_Activity-/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Developers Community_User_Activity*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Submissions","Comments","Promotes","Demotes","Registered","Invited a Friend","Friend Registered","Promote Votes","Status Change"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Users/.toString(),"Report Name Starts with":/Developers Community_User_Activity-/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Developers Community_User_Activity*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Screen Name","Email","First Name","Last Name","Job Title","Department","Location","Photo","Admin Status (Y/N)","Active","External ID"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Users/.toString(),"Report Name Starts with":/Developers Community_User_Activity-/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Developers Community_User_Activity*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["System Admin","bi.adminuser1@brightidea.com","BI","Admin","QA","Innovation","United States"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
        //Remove Report from Enterprise and Community Setup Exports
        new actions.SetupEnterpriseExports.RemoveReportfromEnterpriseSetupExports().run("Section":/Users/.toString(),"Instance":/1/.toString(),"Report Name Starts with":/Developers Community_User_Activity/.toString(),"Action":/Delete Report/.toString())
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
    //Delete this when Scheduler feature is enabled for everyone
    public static def Action66ec7933e12425a91ee5d983(def params){
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for BIOnly Beta tab
        new actions.SetupBI.SetEnterpriseSetupforBIOnlyBetatab().run("Scheduler updates":true,"Sync Phase and Scheduler Content":true)

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