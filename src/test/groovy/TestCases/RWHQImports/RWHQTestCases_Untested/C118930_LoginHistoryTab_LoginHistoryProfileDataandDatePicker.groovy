import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C118930 - Login History Tab - Login History Profile Data and Date Picker
class C118930_LoginHistoryTab_LoginHistoryProfileDataandDatePicker
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
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Solve App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup for Beta Beta tab
        new actions.SetupBeta.SetWebstormSetupforBetaBetatab().run("Unified Login Page":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup for Beta Beta tab
        new actions.SetupBeta.SetWebstormSetupforBetaBetatab().run("Unified Login Page":false)
        //Log Out
        new actions.general.LogOut().run([:])
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/CustomApp/.toString())
        //Login
        new actions.general.Login().run("Webstorm Login":true,"Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Profile/.toString())
        //Edit Your Profile
        new actions.UserProfile.EditYourProfile().run("First Name":/BI/.toString(),"Last Name":/User/.toString(),"Job Title":/QA/.toString(),"Department":/Innovation/.toString(),"Location":/United States/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/SolveApp/.toString())
        //Login
        new actions.general.Login().run("Webstorm Login":true,"Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Select Community
        new actions.SetupEnterpriseCommunities.SelectCommunity().run("Community Name":/Developers Community/.toString())
        //Update Community
        new actions.SetupEnterpriseCommunities.UpdateCommunity().run("Apps":/Solve App/.toString(),"Checkbox Check":/TRUE/.toString())
        //Go to Community
        new actions.SetupEnterpriseCommunities.GotoCommunity().run("Community Name to go to":/Developers Community/.toString())
        //Navigate Community
        new actions.SetupEnterpriseCommunities.NavigateCommunity().run("Community Page":/Setup/.toString())
        //Set Community Setup Exports for Login History tab
        new actions.SetupCommunityExports.SetCommunitySetupExportsforLoginHistorytab().run("Report Options":/Login History/.toString(),"Format":/csv/.toString(),"Include user profile data":true)
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Login/.toString(),"Report Name Starts with":/Developers Community_Login_History/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Developers Community_Login_History*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Initiative","Initiative ID","Screen Name","Email Address","Login Date and Time","Platform"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Login/.toString(),"Report Name Starts with":/Developers Community_Login_History/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Developers Community_Login_History*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Screen Name","First Name","Last Name","Job Title","Department","Location","Photo","External ID"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Login/.toString(),"Report Name Starts with":/Developers Community_Login_History/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Developers Community_Login_History*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["System Admin","bi.adminuser1@brightidea.com"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Login/.toString(),"Report Name Starts with":/Developers Community_Login_History/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Developers Community_Login_History*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["End User","bi.enduser1@brightidea.com"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Login/.toString(),"Report Name Starts with":/Developers Community_Login_History/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Developers Community_Login_History*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["End User","BI","User","QA","Innovation","United States"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Login/.toString(),"Report Name Starts with":/Developers Community_Login_History/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Developers Community_Login_History*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Desktop Browser"],"Number of Matches":/2/.toString(),"Total Number of Rows":/3/.toString())
        //Remove Report from Enterprise and Community Setup Exports
        new actions.SetupEnterpriseExports.RemoveReportfromEnterpriseSetupExports().run("Section":/Login/.toString(),"Instance":/1/.toString(),"Report Name Starts with":/Developers Community_Login_History/.toString(),"Action":/Delete Report/.toString())
        //Set Community Setup Exports for Login History tab
        new actions.SetupCommunityExports.SetCommunitySetupExportsforLoginHistorytab().run("Report Options":/Login History/.toString(),"Format":/xlsx/.toString(),"Include user profile data":true)
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Login/.toString(),"Report Name Starts with":/Developers Community_Login_History/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Developers Community_Login_History*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["End User","bi.enduser1@brightidea.com"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Login/.toString(),"Report Name Starts with":/Developers Community_Login_History/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Developers Community_Login_History*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["End User","BI","User","QA","Innovation","United States"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Login/.toString(),"Report Name Starts with":/Developers Community_Login_History/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Developers Community_Login_History*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["System Admin","bi.adminuser1@brightidea.com"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
        //Remove Report from Enterprise and Community Setup Exports
        new actions.SetupEnterpriseExports.RemoveReportfromEnterpriseSetupExports().run("Section":/Login/.toString(),"Instance":/1/.toString(),"Report Name Starts with":/Developers Community_Login_History/.toString(),"Action":/Delete Report/.toString())
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