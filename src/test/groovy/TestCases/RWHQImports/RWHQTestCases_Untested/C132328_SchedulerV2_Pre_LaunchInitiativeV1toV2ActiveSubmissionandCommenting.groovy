import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132328 - Scheduler V2 - Pre-Launch Initiative V1 to V2 Active Submission and Commenting
class C132328_SchedulerV2_Pre_LaunchInitiativeV1toV2ActiveSubmissionandCommenting
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
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Pitch/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Pitch/.toString(),"Description":/Pitch description/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Early Access":/ALL/.toString(),"Early Access Add or Remove":/Add/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString())
        //Return Todays or Other Date in the Requested Format
        variables."todaysDate" = new actions.Utils.ReturnTodaysDateintheRequestedFormat().run("Format":/MM\/dd\/yyyy/.toString())
        //Return Date in Requested Format
        variables."startDate" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/3/.toString(),"Format":/MM\/dd\/yyyy/.toString())
        //Return Date in Requested Format
        variables."endDate" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/15/.toString(),"Format":/MM\/dd\/yyyy/.toString())
        //Create Solve Webstorm
        new actions.WebstormCreation.CreateSolveWebstorm().run("Action on Design Tab":/<Empty>/.toString(),"Launch Date":/${variables."startDate"}/.toString(),"Launch Time":/10:00 AM/.toString(),"End Date":/${variables."endDate"}/.toString(),"End Time":/3:00 PM/.toString(),"Action on Site Schedule Tab":/Continue/.toString())
        //Delete this when Scheduler feature is enabled for everyone
        Action66ec7933e12425a91ee5d983([:])
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pitch/.toString(),"Area to Navigate to":/Setup/.toString())
        //Return Date in Requested Format
        variables."startDateInNewFormat" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/3/.toString(),"Format":/MMM d/.toString())
        //Return Date in Requested Format
        variables."endDateInNewFormat" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/15/.toString(),"Format":/MMM d/.toString())
        //Verify Scheduler in Setup (V2 & V3)
        new actions.SetupScheduler.SetupSchedulerV2.VerifySchedulerinSetup().run("Status":/Pre-Launch/.toString(),"Prelaunch End Date":/${variables."startDate"}/.toString(),"Prelaunch Tooltip":/Start: Jan 1, 12 AMEnd: ${variables."startDateInNewFormat"}, 10 AM/.toString(),"Navigate":true)
        //Set Scheduler Top Bar Buttons
        new actions.SetupScheduler.SetupSchedulerV2.SetSchedulerTopBarButtons().run("View":/Next/.toString())
        //Verify Scheduler in Setup (V2 & V3)
        new actions.SetupScheduler.SetupSchedulerV2.VerifySchedulerinSetup().run("Status":/Pre-Launch/.toString(),"Active Start and End Date":/${variables."startDate"} - ${variables."endDate"}/.toString(),"Initiative Active Tooltip":/Start: ${variables."startDateInNewFormat"}, 10 AMEnd: ${variables."endDateInNewFormat"}, 03 PM/.toString(),"Submission Start and End Date":/${variables."startDate"} - ${variables."endDate"}/.toString(),"Submission Start and End Date Tooltip":/Start: ${variables."startDateInNewFormat"}, 10 AMEnd: ${variables."endDateInNewFormat"}, 03 PM/.toString(),"Voting Start and End Date":/ ${variables."startDate"} - ${variables."endDate"}/.toString(),"Voting Start and End Date Tooltip":/Start: ${variables."startDateInNewFormat"}, 10 AMEnd: ${variables."endDateInNewFormat"}, 03 PM/.toString(),"Commenting Start and End Date":/${variables."startDate"} - ${variables."endDate"}/.toString(),"Commenting Start and End Date Tooltip":/Start: ${variables."startDateInNewFormat"}, 10 AMEnd: ${variables."endDateInNewFormat"}, 03 PM/.toString(),"Navigate":true)
        //Return Todays or Other Date in the Requested Format
        variables."todaysDateInNewFormat" = new actions.Utils.ReturnTodaysDateintheRequestedFormat().run("Format":/MMM d/.toString())
        //Return Current Time
        variables."currentTime" = new actions.Utils.ReturnCurrentTime().run("Format":/h:mm aa/.toString())
        //Return Current Time
        variables."ttcurrentTime" = new actions.Utils.ReturnCurrentTime().run("Format":/hh aa/.toString())
        //Set Schedule in Site Setup (V2 & V3)
        new actions.SetupScheduler.SetupSchedulerV2.SetScheduleinSiteSetup().run("Resource":/Submission/.toString(),"Click from":/Grid Cell/.toString())
        //Set Date and Time in Scheduler in Site Setup (V2 & V3)
        new actions.SetupScheduler.SetupSchedulerV2.SetDateandTimeinSchedulerinSiteSetup().run("Start Date":/${variables."todaysDate"}/.toString(),"Start Date Time":/${variables."currentTime"}/.toString(),"End Date":/${variables."endDate"}/.toString(),"End Date Time":/3:00 PM/.toString(),"Action":/Save Schedule/.toString())
        //Set Schedule in Site Setup (V2 & V3)
        new actions.SetupScheduler.SetupSchedulerV2.SetScheduleinSiteSetup().run("Resource":/Commenting/.toString(),"Click from":/Grid Cell/.toString())
        //Set Date and Time in Scheduler in Site Setup (V2 & V3)
        new actions.SetupScheduler.SetupSchedulerV2.SetDateandTimeinSchedulerinSiteSetup().run("Start Date":/${variables."todaysDate"}/.toString(),"Start Date Time":/${variables."currentTime"}/.toString(),"End Date":/${variables."endDate"}/.toString(),"End Date Time":/6:00 PM/.toString(),"Action":/Save Schedule/.toString())
        //Verify Scheduler in Setup (V2 & V3)
        new actions.SetupScheduler.SetupSchedulerV2.VerifySchedulerinSetup().run("Status":/Pre-Launch/.toString(),"Submission Start and End Date":/${variables."todaysDate"} - ${variables."endDate"}/.toString(),"Submission Start and End Date Tooltip":/Start: ${variables."todaysDateInNewFormat"}, ${variables."ttcurrentTime"}End: ${variables."endDateInNewFormat"}, 03 PM/.toString(),"Commenting Start and End Date":/${variables."todaysDate"} - ${variables."endDate"}/.toString(),"Commenting Start and End Date Tooltip":/Start: ${variables."todaysDateInNewFormat"}, ${variables."ttcurrentTime"}End: ${variables."endDateInNewFormat"}, 06 PM/.toString(),"Navigate":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pitch/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Pitch App Post Idea
        new actions.PostIdea.SetPitchAppPostIdea().run("Title":/end user idea1/.toString(),"Description":/desc/.toString(),"What is the value proposition?":/required/.toString(),"What problem are you solving?":/required/.toString(),"What key resources does your proposal require?":/required/.toString(),"Who are the key stakeholders in executing your proposal?":/required/.toString(),"What are the key risks of executing your proposal?":/required/.toString(),"Please describe your (team's) background and experience":/required/.toString(),"Action":/Submit Idea/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser2@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pitch/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/end user idea1/.toString())
        //Add Comment in View and NGA View Idea
        new actions.ViewIdeaComment.AddCommentinViewandNGAViewIdea().run("Comment":/test general comment/.toString(),"Post Comment":true)
        //Verify Comment in View and NGA View Idea
        new actions.ViewIdeaComment.VerifyCommentinViewandNGAViewIdea().run("Comment section":/Parent Comment/.toString(),"Comment Type":/General/.toString(),"Parent Comment":/test general comment/.toString(),"User":/End User 2/.toString(),"Number of Matches":/1/.toString())
        try{
            //Set Voting on VI3
            new actions.ViewIdea30.SetVotingonViewIdea3().run("Promote or Demote":/Promote/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Votes in View Idea 3
        new actions.ViewIdea30.VerifyVotesinViewIdea3().run("View Voters":true,"User":/End User 2/.toString(),"Number of Matches":/0/.toString())
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