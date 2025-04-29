import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C132313 - Scheduler V2 - Pre-Launch Initiative V1 to V2 Active Commenting and Voting
class C132313_SchedulerV2_Pre_LaunchInitiativeV1toV2ActiveCommentingandVoting
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Unlimited Brightidea Administrator License Type":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Apply Filter on Apps Pillar 2.0
        new actions.AppsPillar.ApplyFilterAppsPillar20().run("Filter Option":/Programs/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Pitch/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Pitch/.toString(),"Description":/Pitch Desc/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Early Access":/ALL/.toString(),"Early Access Add or Remove":/Add/.toString(),"Action on General Information Tab":/Continue/.toString())
        //Return Todays or Other Date in the Requested Format
        variables."todaysDate" = new actions.Utils.ReturnTodaysDateintheRequestedFormat().run("Format":/MM\/dd\/yyyy/.toString())
        //Return Date in Requested Format
        variables."startDate" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/5/.toString(),"Format":/MM\/dd\/yyyy/.toString())
        //Return Date in Requested Format
        variables."endDate" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/30/.toString(),"Format":/MM\/dd\/yyyy/.toString())
        //Create Solve Webstorm
        new actions.WebstormCreation.CreateSolveWebstorm().run("Action on Design Tab":/<Empty>/.toString(),"Launch Date":/${variables."startDate"}/.toString(),"Launch Time":/12:00 AM/.toString(),"End Date":/${variables."endDate"}/.toString(),"End Time":/1:00 AM/.toString(),"Action":/Create/.toString())
        //Delete this when Scheduler feature is enabled for everyone
        Action66ec7933e12425a91ee5d983([:])
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pitch/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Voting tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforNewVotingtab().run("Demote Voting Checkbox":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pitch/.toString(),"Area to Navigate to":/Setup/.toString())
        //Return Todays or Other Date in the Requested Format
        variables."todaysDateInNewFormat" = new actions.Utils.ReturnTodaysDateintheRequestedFormat().run("Format":/MMM d/.toString())
        //Return Date in Requested Format
        variables."startDateInNewFormat" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/5/.toString(),"Format":/MMM d/.toString())
        //Return Date in Requested Format
        variables."endDateInNewFormat" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/30/.toString(),"Format":/MMM d/.toString())
        //Verify Scheduler in Setup (V2 & V3)
        new actions.SetupScheduler.SetupSchedulerV2.VerifySchedulerinSetup().run("Status":/Pre-Launch/.toString(),"Prelaunch End Date":/${variables."startDate"}/.toString(),"Prelaunch Tooltip":/Start: Jan 1, 12 AMEnd: ${variables."startDateInNewFormat"}, 12 AM/.toString(),"Navigate":true)
        //Set Scheduler Top Bar Buttons
        new actions.SetupScheduler.SetupSchedulerV2.SetSchedulerTopBarButtons().run("View":/Next/.toString())
        //Verify Scheduler in Setup (V2 & V3)
        new actions.SetupScheduler.SetupSchedulerV2.VerifySchedulerinSetup().run("Status":/Pre-Launch/.toString(),"Active Start and End Date":/${variables."startDate"} - ${variables."endDate"}/.toString(),"Initiative Active Tooltip":/Start: ${variables."startDateInNewFormat"}, 12 AMEnd: ${variables."endDateInNewFormat"}, 01 AM/.toString(),"Submission Start and End Date":/${variables."startDate"} - ${variables."endDate"}/.toString(),"Submission Start and End Date Tooltip":/Start: ${variables."startDateInNewFormat"}, 12 AMEnd: ${variables."endDateInNewFormat"}, 01 AM/.toString(),"Voting Start and End Date":/ ${variables."startDate"} - ${variables."endDate"}/.toString(),"Voting Start and End Date Tooltip":/Start: ${variables."startDateInNewFormat"}, 12 AMEnd: ${variables."endDateInNewFormat"}, 01 AM/.toString(),"Commenting Start and End Date":/${variables."startDate"} - ${variables."endDate"}/.toString(),"Commenting Start and End Date Tooltip":/Start: ${variables."startDateInNewFormat"}, 12 AMEnd: ${variables."endDateInNewFormat"}, 01 AM/.toString(),"Navigate":false)
        //Return Current Time
        variables."currentTime" = new actions.Utils.ReturnCurrentTime().run("Format":/h:mm aa/.toString())
        //Return Current Time
        variables."ttcurrentTime" = new actions.Utils.ReturnCurrentTime().run("Format":/hh aa/.toString())
        //Set Schedule in Site Setup (V2 & V3)
        new actions.SetupScheduler.SetupSchedulerV2.SetScheduleinSiteSetup().run("Resource":/Voting/.toString(),"Click from":/Grid Cell/.toString())
        //Set Date and Time in Scheduler in Site Setup (V2 & V3)
        new actions.SetupScheduler.SetupSchedulerV2.SetDateandTimeinSchedulerinSiteSetup().run("Start Date":/${variables."todaysDate"}/.toString(),"Start Date Time":/${variables."currentTime"}/.toString(),"End Date":/${variables."endDate"}/.toString(),"End Date Time":/1:00 AM/.toString(),"Action":/Save Schedule/.toString())
        //Set Schedule in Site Setup (V2 & V3)
        new actions.SetupScheduler.SetupSchedulerV2.SetScheduleinSiteSetup().run("Resource":/Commenting/.toString(),"Click from":/Grid Cell/.toString())
        //Set Date and Time in Scheduler in Site Setup (V2 & V3)
        new actions.SetupScheduler.SetupSchedulerV2.SetDateandTimeinSchedulerinSiteSetup().run("Start Date":/${variables."todaysDate"}/.toString(),"Start Date Time":/${variables."currentTime"}/.toString(),"End Date":/${variables."endDate"}/.toString(),"End Date Time":/1:00 AM/.toString(),"Action":/Save Schedule/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Set Scheduler Top Bar Buttons
        new actions.SetupScheduler.SetupSchedulerV2.SetSchedulerTopBarButtons().run("View":/Next/.toString())
        //Verify Scheduler in Setup (V2 & V3)
        new actions.SetupScheduler.SetupSchedulerV2.VerifySchedulerinSetup().run("Status":/Pre-Launch/.toString(),"Voting Start and End Date":/ ${variables."todaysDate"} - ${variables."endDate"}/.toString(),"Voting Start and End Date Tooltip":/Start: ${variables."todaysDateInNewFormat"}, ${variables."ttcurrentTime"}End: ${variables."endDateInNewFormat"}, 01 AM/.toString(),"Commenting Start and End Date":/${variables."todaysDate"} - ${variables."endDate"}/.toString(),"Commenting Start and End Date Tooltip":/Start: ${variables."todaysDateInNewFormat"}, ${variables."ttcurrentTime"}End: ${variables."endDateInNewFormat"}, 01 AM/.toString(),"Navigate":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pitch/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/Quick Add Idea One/.toString(),"Action":/Submit/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pitch/.toString(),"Area to Navigate to":/Home/.toString())
        //Verify Homepage Header 2
        new actions.WebstormHomepage.VerifyHomepageHeader2().run("Title":/Pitch/.toString(),"Description":/Top selected ideas will be developed into business plans and pitched to a panel of judges for a chance to receive funding./.toString(),"Submit Displayed":false,"Browse Displayed":false,"Registration":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pitch/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Quick Add Idea One/.toString())
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Access Idea":/Modal Header/.toString())
        try{
            //Set Voting on VI3
            new actions.ViewIdea30.SetVotingonViewIdea3().run("Promote or Demote":/Promote/.toString())
        }
       catch(all){}catch(Error err){}
        //Add Comment in View and NGA View Idea
        new actions.ViewIdeaComment.AddCommentinViewandNGAViewIdea().run("Comment":/end user comment/.toString(),"Post Comment":true)
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Parent Comment/.toString(),"Comment Type":/General/.toString(),"Parent Comment":/end user comment/.toString(),"User":/End User/.toString(),"Number of Matches":/1/.toString())
        //Verify Votes in View Idea 3
        new actions.ViewIdea30.VerifyVotesinViewIdea3().run("View Voters":true,"User":/System Admin/.toString(),"Number of Matches":/1/.toString())
        //Verify Votes in View Idea 3
        new actions.ViewIdea30.VerifyVotesinViewIdea3().run("User":/End User/.toString(),"Number of Matches":/1/.toString())
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