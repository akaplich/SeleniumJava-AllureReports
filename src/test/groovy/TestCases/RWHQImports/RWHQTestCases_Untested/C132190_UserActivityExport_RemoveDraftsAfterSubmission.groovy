import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132190 - User Activity Export - Remove Drafts After Submission
class C132190_UserActivityExport_RemoveDraftsAfterSubmission
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
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString(),"Activities":true,"Submissions":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Home/.toString())
        //Set Widget Controller
        new actions.Widgets.SetWidgetController().run("Widget Edit Mode":/Enable/.toString(),"Add Widget from Selection":/My Idea Drafts/.toString())
        //Set Widget Controller
        new actions.Widgets.SetWidgetController().run("Widget Edit Mode":/Disable/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/test idea3 for draft/.toString(),"Description":/desc for draft/.toString(),"Category":/New Product/.toString(),"Required Short Question":/rsq2/.toString(),"Action":/Save Draft/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/test idea4/.toString(),"Description":/desc/.toString(),"Category":/Operations/.toString(),"Required Short Question":/rsq1/.toString(),"Action":/Save Draft/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/test idea5/.toString(),"Description":/desc/.toString(),"Category":/Strategy/.toString(),"Required Short Question":/rsq/.toString(),"Action":/Submit Idea/.toString())
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("Idea Name":/test idea5/.toString(),"Description":/desc/.toString(),"Number of Matches":/1/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Exports for Users Tab
        new actions.SetupExports.SetWebstormSetupExportsforUsersTab().run("Report Options":/User Activity/.toString(),"Format":/csv/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Users/.toString(),"Report Name Starts with":/User_activity/.toString(),"Instance":/1/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/30/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/User_activity-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Screen Name","Ideas","Drafts"],"Number of Matches":/1/.toString(),"Total Number of Rows":/4/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Users/.toString(),"Report Name Starts with":/User_activity/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/User_activity-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["End User","1","2"],"Number of Matches":/1/.toString(),"Total Number of Rows":/4/.toString())
        //Remove Report from Setup Exports
        new actions.SetupExports.RemoveReportfromSetupExports().run("Section":/Users/.toString(),"Report Name Starts with":/User_activity/.toString(),"Instance":/1/.toString(),"Action":/Delete Report/.toString())
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
        new actions.general.VerifyFileData().run("File Name":/*_User_Activity-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Screen Name","Email Address","Submissions","Drafts"],"Number of Matches":/1/.toString(),"Total Number of Rows":/4/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Users/.toString(),"Report Name Starts with":/Developers Community_User_Activity/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/*_User_Activity-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["End User","bi.enduser1@brightidea.com","1","2"],"Number of Matches":/1/.toString(),"Total Number of Rows":/4/.toString())
        //Remove Report from Enterprise and Community Setup Exports
        new actions.SetupEnterpriseExports.RemoveReportfromEnterpriseSetupExports().run("Section":/Users/.toString(),"Instance":/1/.toString(),"Report Name Starts with":/Developers Community_User_Activity/.toString(),"Action":/Delete Report/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Exports for Users tab
        new actions.SetupEnterpriseExports.SetEnterpriseExportsforUsersTab().run("Report Options":/User Activity/.toString(),"Format":/xlsx/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Users/.toString(),"Report Name Starts with":/User_activity/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/User_activity-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Screen Name","Email Address","Submissions","Drafts"],"Number of Matches":/1/.toString(),"Total Number of Rows":/14/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Users/.toString(),"Report Name Starts with":/User_activity/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/User_activity-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["End User","bi.enduser1@brightidea.com","1","2"],"Number of Matches":/1/.toString(),"Total Number of Rows":/14/.toString())
        //Remove Report from Enterprise and Community Setup Exports
        new actions.SetupEnterpriseExports.RemoveReportfromEnterpriseSetupExports().run("Section":/Users/.toString(),"Instance":/1/.toString(),"Report Name Starts with":/User_activity/.toString(),"Action":/Delete Report/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Submissions/.toString())
        //Filter or Sort Submissions in User Homepage
        new actions.Enterprise.UserHomepage.FilterorSortSubmissionsinUserHomepage().run("Filter by":/Drafts/.toString())
        //Verify and Access Submission in User Homepage
        new actions.Enterprise.UserHomepage.VerifySubmissioninUserHomepage().run("Total Number of Submissions":/2/.toString(),"Submission Name":/test idea3 for draft/.toString(),"Description":/desc for draft/.toString(),"Status":/Draft/.toString(),"Initiative Name":/Custom App/.toString(),"Number of Matches":/1/.toString())
        //Verify and Access Submission in User Homepage
        new actions.Enterprise.UserHomepage.VerifySubmissioninUserHomepage().run("Total Number of Submissions":/2/.toString(),"Submission Name":/test idea4/.toString(),"Description":/desc/.toString(),"Status":/Draft/.toString(),"Initiative Name":/Custom App/.toString(),"Number of Matches":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Home/.toString())
        //Access Idea Draft from My Idea Draft Widget
        new actions.Widgets.AccessIdeaDraftfromMyIdeaDraftWidget().run("Idea Draft":/test idea4/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Action":/Submit Idea/.toString())
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("Idea Name":/test idea4/.toString(),"Description":/desc/.toString(),"Number of Matches":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Submissions/.toString())
        //Filter or Sort Submissions in User Homepage
        new actions.Enterprise.UserHomepage.FilterorSortSubmissionsinUserHomepage().run("Filter by":/Drafts/.toString())
        //Verify and Access Submission in User Homepage
        new actions.Enterprise.UserHomepage.VerifySubmissioninUserHomepage().run("Total Number of Submissions":/1/.toString(),"Submission Name":/test idea3 for draft/.toString(),"Description":/desc for draft/.toString(),"Status":/Draft/.toString(),"Initiative Name":/Custom App/.toString(),"Number of Matches":/1/.toString())
        //Verify and Access Submission in User Homepage
        new actions.Enterprise.UserHomepage.VerifySubmissioninUserHomepage().run("Total Number of Submissions":/1/.toString(),"Submission Name":/test idea4/.toString(),"Description":/desc/.toString(),"Status":/Draft/.toString(),"Initiative Name":/Custom App/.toString(),"Number of Matches":/0/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Exports for Users Tab
        new actions.SetupExports.SetWebstormSetupExportsforUsersTab().run("Report Options":/User Activity/.toString(),"Format":/csv/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Users/.toString(),"Report Name Starts with":/User_activity/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/User_activity-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["End User","2","1"],"Number of Matches":/1/.toString(),"Total Number of Rows":/4/.toString())
        //Remove Report from Setup Exports
        new actions.SetupExports.RemoveReportfromSetupExports().run("Section":/Users/.toString(),"Report Name Starts with":/User_activity/.toString(),"Instance":/1/.toString(),"Action":/Delete Report/.toString())
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
        new actions.general.VerifyFileData().run("File Name":/*_User_Activity-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["End User","bi.enduser1@brightidea.com","2","1"],"Number of Matches":/1/.toString(),"Total Number of Rows":/4/.toString())
        //Remove Report from Enterprise and Community Setup Exports
        new actions.SetupEnterpriseExports.RemoveReportfromEnterpriseSetupExports().run("Section":/Users/.toString(),"Instance":/1/.toString(),"Report Name Starts with":/Developers Community_User_Activity/.toString(),"Action":/Delete Report/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Exports for Users tab
        new actions.SetupEnterpriseExports.SetEnterpriseExportsforUsersTab().run("Report Options":/User Activity/.toString(),"Format":/xlsx/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Users/.toString(),"Report Name Starts with":/User_activity/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/User_activity-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["End User","bi.enduser1@brightidea.com","2","1"],"Number of Matches":/1/.toString(),"Total Number of Rows":/14/.toString())
        //Remove Report from Enterprise and Community Setup Exports
        new actions.SetupEnterpriseExports.RemoveReportfromEnterpriseSetupExports().run("Section":/Users/.toString(),"Instance":/1/.toString(),"Report Name Starts with":/User_activity/.toString(),"Action":/Delete Report/.toString())
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