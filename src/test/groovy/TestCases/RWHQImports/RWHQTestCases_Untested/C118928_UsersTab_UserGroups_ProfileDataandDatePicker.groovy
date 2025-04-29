import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C118928 - Users Tab - User Groups - Profile Data and Date Picker
class C118928_UsersTab_UserGroups_ProfileDataandDatePicker
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
        new actions.general.Navigate().run("Area to Navigate to":/Profile/.toString())
        //Edit Your Profile
        new actions.UserProfile.EditYourProfile().run("Screen Name":/Jane Doe/.toString(),"First Name":/BI/.toString(),"Last Name":/Admin/.toString(),"Job Title":/QA/.toString(),"Department":/Innovation/.toString(),"Location":/United States/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Navigate to Groups Tab":true,"Create Edit or Delete":/Create/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("Group Name":/CustomAppGroup/.toString(),"User":/End User/.toString(),"Add or Remove":/Add/.toString(),"Action":/Create Group/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Setup/.toString())
        //Set Participants in Pipeline Setup Page
        new actions.PipelineSetup.SetParticipantsinPipelineSetupPage().run("General Access":/CustomAppGroup/.toString(),"General Access Add or Remove":/Add/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Go to Community
        new actions.SetupEnterpriseCommunities.GotoCommunity().run("Community Name to go to":/Developers Community/.toString())
        //Navigate Community
        new actions.SetupEnterpriseCommunities.NavigateCommunity().run("Community Page":/Setup/.toString())
        //Set Community Setup Exports For Users Tab
        new actions.SetupCommunityExports.SetCommunitySetupExportsForUsersTab().run("Report Options":/User Groups/.toString(),"Format":/csv/.toString(),"Include user profile data":true,"Include ALL user group":true)
        //Verify Generated Report in any Setup Exports
        new actions.SetupExports.VerifyGeneratedReportinSetupExports().run("Report Name Starts with":/Developers Community_User_Groups/.toString(),"Number of Matches":/1/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Users/.toString(),"Report Name Starts with":/Developers Community_User_Groups/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Developers Community_User_Groups*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Group","Screen Name","Email Address","First Name","Last Name","Job Title","Department","Location","Photo","External ID"],"Number of Matches":/1/.toString(),"Total Number of Rows":/14/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Users/.toString(),"Report Name Starts with":/Developers Community_User_Groups/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Developers Community_User_Groups*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["CustomAppGroup","End User","bi.enduser1@brightidea.com"],"Number of Matches":/1/.toString(),"Total Number of Rows":/14/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Users/.toString(),"Report Name Starts with":/Developers Community_User_Groups/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Developers Community_User_Groups*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["ALL","Jane Doe","bi.adminuser1@brightidea.com","BI","Admin","QA","Innovation","United States"],"Number of Matches":/1/.toString(),"Total Number of Rows":/14/.toString())
        //Remove Report from Enterprise and Community Setup Exports
        new actions.SetupEnterpriseExports.RemoveReportfromEnterpriseSetupExports().run("Section":/Users/.toString(),"Instance":/1/.toString(),"Report Name Starts with":/Developers Community_User_Groups/.toString(),"Action":/Delete Report/.toString())
        //Verify Generated Report in any Setup Exports
        new actions.SetupExports.VerifyGeneratedReportinSetupExports().run("Report Name Starts with":/Developers Community_User_Groups/.toString(),"Number of Matches":/0/.toString())
        //Set Community Setup Exports For Users Tab
        new actions.SetupCommunityExports.SetCommunitySetupExportsForUsersTab().run("Report Options":/User Groups/.toString(),"Format":/xlsx/.toString(),"Include user profile data":true,"Include ALL user group":true)
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Users/.toString(),"Report Name Starts with":/Developers Community_User_Groups/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Developers Community_User_Groups*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Group","Screen Name","Email Address","First Name","Last Name","Job Title","Department","Location","Photo","External ID"],"Number of Matches":/1/.toString(),"Total Number of Rows":/14/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Users/.toString(),"Report Name Starts with":/Developers Community_User_Groups/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Developers Community_User_Groups*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["ALL","Pipeline Admin","pipelineadmin@test.com"],"Number of Matches":/1/.toString(),"Total Number of Rows":/14/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Users/.toString(),"Report Name Starts with":/Developers Community_User_Groups/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Developers Community_User_Groups*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["ALL","Jane Doe","bi.adminuser1@brightidea.com","BI","Admin","QA","Innovation","United States"],"Number of Matches":/1/.toString(),"Total Number of Rows":/14/.toString())
        //Remove Report from Enterprise and Community Setup Exports
        new actions.SetupEnterpriseExports.RemoveReportfromEnterpriseSetupExports().run("Section":/Users/.toString(),"Instance":/1/.toString(),"Report Name Starts with":/Developers Community_User_Groups/.toString(),"Action":/Delete Report/.toString())
        //Verify Generated Report in any Setup Exports
        new actions.SetupExports.VerifyGeneratedReportinSetupExports().run("Report Name Starts with":/Developers Community_User_Groups/.toString(),"Number of Matches":/0/.toString())
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