package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C118925 - Users Tab - User Activity
class C118925_UsersTab_UserActivity
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
        //Go to Community
        new actions.SetupEnterpriseCommunities.GotoCommunity().run("Community Name to go to":/Developers Community/.toString())
        //Navigate Community
        new actions.SetupEnterpriseCommunities.NavigateCommunity().run("Community Page":/Setup/.toString())
        //Set Community Setup Exports For Users Tab
        new actions.SetupCommunityExports.SetCommunitySetupExportsForUsersTab().run("Report Options":/User Activity/.toString(),"Format":/csv/.toString())
        //Verify Generated Report in any Setup Exports
        new actions.SetupExports.VerifyGeneratedReportinSetupExports().run("Report Name Starts with":/Developers Community_User_Activity/.toString(),"Number of Matches":/1/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Users/.toString(),"Report Name Starts with":/Developers Community_User_Activity/.toString(),"Instance":/1/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/10/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/*_User_Activity-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Screen Name","Email Address","Last Visit","Create_date","User_create_month_year","Total Points","Submissions","Drafts","Comments","Promotes","Demotes","Registered","Invited a Friend","Friend Registered","Promote Votes","Number of submissions viewed"],"Number of Matches":/1/.toString(),"Total Number of Rows":/2/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Users/.toString(),"Report Name Starts with":/Developers Community_User_Activity/.toString(),"Instance":/1/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/10/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/*_User_Activity-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Number of submissions viewed","Submissions","Comments","Promotes","Demotes","Registered","Invited a Friend","Friend Registered","Promote Votes","Status Change","Admin Status"],"Number of Matches":/1/.toString(),"Total Number of Rows":/2/.toString())
        //Remove Report from Enterprise and Community Setup Exports
        new actions.SetupEnterpriseExports.RemoveReportfromEnterpriseSetupExports().run("Section":/Users/.toString(),"Instance":/1/.toString(),"Report Name Starts with":/Developers Community_User_Activity/.toString(),"Action":/Delete Report/.toString())
        //Verify Generated Report in any Setup Exports
        new actions.SetupExports.VerifyGeneratedReportinSetupExports().run("Report Name Starts with":/Developers Community_User_Activity/.toString(),"Number of Matches":/0/.toString())
        //Set Community Setup Exports For Users Tab
        new actions.SetupCommunityExports.SetCommunitySetupExportsForUsersTab().run("Report Options":/User Activity/.toString(),"Format":/xlsx/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Users/.toString(),"Report Name Starts with":/Developers Community_User_Activity/.toString(),"Instance":/1/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/10/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/*_User_Activity-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Screen Name","Email Address","Last Visit","Create_date","User_create_month_year","Total Points","Submissions","Drafts","Comments","Promotes","Demotes","Registered","Invited a Friend","Friend Registered","Promote Votes"],"Number of Matches":/1/.toString(),"Total Number of Rows":/2/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Users/.toString(),"Report Name Starts with":/Developers Community_User_Activity/.toString(),"Instance":/1/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/10/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/*_User_Activity-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Number of submissions viewed","Submissions","Comments","Promotes","Demotes","Registered","Invited a Friend","Friend Registered","Promote Votes","Status Change","Admin Status"],"Number of Matches":/1/.toString(),"Total Number of Rows":/2/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Users/.toString(),"Report Name Starts with":/Developers Community_User_Activity/.toString(),"Instance":/1/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/10/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/*_User_Activity-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Submissions","Comments","Promotes","Demotes","Registered","Invited a Friend","Friend Registered","Promote Votes","Status Change"],"Number of Matches":/1/.toString(),"Total Number of Rows":/2/.toString())
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