import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C129016 - Submission Days in Status - Campaigns Specific Statuses
class C129016_SubmissionDaysinStatus_CampaignsSpecificStatuses
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
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Ideas tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforIdeastab().run("Campaign Specific Statuses":true,"Campiagn Statues Continue or Cancel":/Continue/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea2/.toString())
        //Change Idea Status in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStatusinPipelineStepspage().run("Status":/On Hold/.toString(),"Action":/Change Status/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Webstorm Setup Status for Ideas Tab
        new actions.SetupIdeas.SetWebstormSetupStatusesIdeasTab().run("Status Name to Modify or Add":/Submitted/.toString(),"Status Name":/Customsubmitted/.toString())
        //Remove Webstorm Setup Statuses for Ideas Tab
        new actions.SetupIdeas.SetWebstormSetupStatusesforIdeasTab().run("Status to Remove":/On Hold/.toString(),"Status to switch ideas to":/Pending/.toString(),"Action":/Delete Status/.toString())
        //Set Webstorm Setup Status for Ideas Tab
        new actions.SetupIdeas.SetWebstormSetupStatusesIdeasTab().run("Status Name to Modify or Add":/Add/.toString(),"Status Name":/NewStatus/.toString(),"Description":/Active/.toString(),"System Status":/Active/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/test idea3/.toString(),"Description":/desc/.toString(),"Category":/Operations/.toString(),"Required Short Question":/short/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea3/.toString())
        //Change Idea Status in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStatusinPipelineStepspage().run("Status":/NewStatus/.toString(),"Action":/Change Status/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Go to Community
        new actions.SetupEnterpriseCommunities.GotoCommunity().run("Community Name to go to":/Developers Community/.toString())
        //Navigate Community
        new actions.SetupEnterpriseCommunities.NavigateCommunity().run("Community Page":/Setup/.toString())
        //Set Community Setup Exports for Submissions Tab
        new actions.SetupCommunityExports.SetCommunitySetupExportsforSubmissionsTab().run("Report Options":/Submission Days in Status/.toString(),"Format":/csv/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Submissions/.toString(),"Report Name Starts with":/Developers Community-Submission/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Developers Community-Submission_Days_in_Status-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Custom App","test idea2","Pending"],"Number of Matches":/1/.toString(),"Total Number of Rows":/5/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Submissions/.toString(),"Report Name Starts with":/Developers Community-Submission/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Developers Community-Submission_Days_in_Status-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Custom App","quick add1","Customsubmitted"],"Number of Matches":/1/.toString(),"Total Number of Rows":/5/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Submissions/.toString(),"Report Name Starts with":/Developers Community-Submission/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Developers Community-Submission_Days_in_Status-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Custom App","quick add1","Customsubmitted"],"Number of Matches":/1/.toString(),"Total Number of Rows":/5/.toString())
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