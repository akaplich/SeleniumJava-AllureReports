import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132311 - Scheduler V2 - Active Initiative V1 to  V2 Submissions Active, Commenting and Voting Closed
class C132311_SchedulerV2_ActiveInitiativeV1toV2SubmissionsActive_CommentingandVotingClosed
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
        //Set to Scheduler V1
        Action67e1e1cc1dc7aa140e19a818([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Apply Filter on Apps Pillar 2.0
        new actions.AppsPillar.ApplyFilterAppsPillar20().run("Filter Option":/Labs/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Apply/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Apply/.toString(),"Description":/Apply Desc/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Action on General Information Tab":/Continue/.toString())
        //Return Todays or Other Date in the Requested Format
        variables."todaysDate" = new actions.Utils.ReturnTodaysDateintheRequestedFormat().run("Format":/MM\/dd\/yyyy/.toString())
        //Return Date in Requested Format
        variables."endDate" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/21/.toString(),"Format":/MM\/dd\/yyyy/.toString())
        //Return Current Time
        variables."currentTime" = new actions.Utils.ReturnCurrentTime().run("Format":/h:mm aa/.toString())
        //Create Solve Webstorm
        new actions.WebstormCreation.CreateSolveWebstorm().run("Action on Design Tab":/<Empty>/.toString(),"Launch Date":/${variables."todaysDate"}/.toString(),"Launch Time":/${variables."currentTime"}/.toString(),"End Date":/${variables."endDate"}/.toString(),"End Time":/8:00 AM/.toString(),"Action on Site Schedule Tab":/Continue/.toString(),"Action":/Create/.toString())
        //Delete this when Scheduler feature is enabled for everyone
        Action66ec7933e12425a91ee5d983([:])
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Apply/.toString(),"Area to Navigate to":/Setup/.toString())
        //Return Todays or Other Date in the Requested Format
        variables."todaysDateInNewFormat" = new actions.Utils.ReturnTodaysDateintheRequestedFormat().run("Format":/MMM d/.toString())
        //Return Date in Requested Format
        variables."endDateInNewFormat" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/21/.toString(),"Format":/MMM d/.toString())
        //Return Current Time
        variables."ttcurrentTime" = new actions.Utils.ReturnCurrentTime().run("Format":/hh aa/.toString())
        //Verify Scheduler in Setup (V2 & V3)
        new actions.SetupScheduler.SetupSchedulerV2.VerifySchedulerinSetup().run("Status":/Active/.toString(),"Prelaunch Tooltip":/Start: Jan 1, 12 AMEnd: ${variables."todaysDateInNewFormat"}, 8 AM/.toString(),"Active Start and End Date":/${variables."todaysDate"} - ${variables."endDate"}/.toString(),"Initiative Active Tooltip":/Start: ${variables."todaysDateInNewFormat"}, ${variables."ttcurrentTime"}End: ${variables."endDateInNewFormat"}, 08 AM/.toString(),"Submission Start and End Date":/${variables."todaysDate"} - ${variables."endDate"}/.toString(),"Submission Start and End Date Tooltip":/Start: ${variables."todaysDateInNewFormat"}, ${variables."ttcurrentTime"}End: ${variables."endDateInNewFormat"}, 08 AM/.toString(),"Voting Start and End Date":/ ${variables."todaysDate"} - ${variables."endDate"}/.toString(),"Voting Start and End Date Tooltip":/Start: ${variables."todaysDateInNewFormat"}, ${variables."ttcurrentTime"}End: ${variables."endDateInNewFormat"}, 08 AM/.toString(),"Commenting Start and End Date":/${variables."todaysDate"} - ${variables."endDate"}/.toString(),"Commenting Start and End Date Tooltip":/Start: ${variables."todaysDateInNewFormat"}, ${variables."ttcurrentTime"}End: ${variables."endDateInNewFormat"}, 08 AM/.toString(),"Navigate":true)
        //Return Date in Requested Format
        variables."closedstartDate" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/-6/.toString(),"Format":/MM\/dd\/yyyy/.toString(),"Previous Month Date":true)
        //Return Date in Requested Format
        variables."closedendDate" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/-4/.toString(),"Format":/MM\/dd\/yyyy/.toString(),"Previous Month Date":true)
        //Return Date in Requested Format
        variables."closedstartDateInNewFormat" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/-6/.toString(),"Format":/MMM d/.toString(),"Previous Month Date":true)
        //Return Date in Requested Format
        variables."closedendDateInNewFormat" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/-4/.toString(),"Format":/MMM d/.toString(),"Previous Month Date":true)
        //Set Schedule in Site Setup (V2 & V3)
        new actions.SetupScheduler.SetupSchedulerV2.SetScheduleinSiteSetup().run("Resource":/Voting/.toString(),"Click from":/Grid Cell/.toString())
        //Set Date and Time in Scheduler in Site Setup (V2 & V3)
        new actions.SetupScheduler.SetupSchedulerV2.SetDateandTimeinSchedulerinSiteSetup().run("Start Date":/${variables."closedstartDate"}/.toString(),"Start Date Time":/8:00 AM/.toString(),"End Date":/${variables."closedendDate"}/.toString(),"End Date Time":/11:00 AM/.toString(),"Action":/Save Schedule/.toString())
        //Set Schedule in Site Setup (V2 & V3)
        new actions.SetupScheduler.SetupSchedulerV2.SetScheduleinSiteSetup().run("Resource":/Commenting/.toString(),"Click from":/Grid Cell/.toString())
        //Set Date and Time in Scheduler in Site Setup (V2 & V3)
        new actions.SetupScheduler.SetupSchedulerV2.SetDateandTimeinSchedulerinSiteSetup().run("Start Date":/${variables."closedstartDate"}/.toString(),"Start Date Time":/8:00 AM/.toString(),"End Date":/${variables."closedendDate"}/.toString(),"End Date Time":/11:00 AM/.toString(),"Action":/Save Schedule/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Set Scheduler Top Bar Buttons
        new actions.SetupScheduler.SetupSchedulerV2.SetSchedulerTopBarButtons().run("View":/Month/.toString())
        //Set Scheduler Top Bar Buttons
        new actions.SetupScheduler.SetupSchedulerV2.SetSchedulerTopBarButtons().run("View":/Previous/.toString())
        //Verify Scheduler in Setup (V2 & V3)
        new actions.SetupScheduler.SetupSchedulerV2.VerifySchedulerinSetup().run("Status":/Active/.toString(),"Voting Start and End Date":/ ${variables."closedstartDate"} - ${variables."closedendDate"}/.toString(),"Voting Start and End Date Tooltip":/Start: ${variables."closedstartDateInNewFormat"}, 08 AMEnd: ${variables."closedendDateInNewFormat"}, 11 AM/.toString(),"Commenting Start and End Date":/${variables."closedstartDate"} - ${variables."closedendDate"}/.toString(),"Commenting Start and End Date Tooltip":/Start: ${variables."closedstartDateInNewFormat"}, 08 AMEnd: ${variables."closedendDateInNewFormat"}, 11 AM/.toString(),"Navigate":false)
        //Set Scheduler Top Bar Buttons
        new actions.SetupScheduler.SetupSchedulerV2.SetSchedulerTopBarButtons().run("View":/Next/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/30/.toString())
        //Verify Scheduler in Setup (V2 & V3)
        new actions.SetupScheduler.SetupSchedulerV2.VerifySchedulerinSetup().run("Status":/Active/.toString(),"Active Start and End Date":/${variables."todaysDate"} - ${variables."endDate"}/.toString(),"Initiative Active Tooltip":/Start: ${variables."todaysDateInNewFormat"}, ${variables."ttcurrentTime"}End: ${variables."endDateInNewFormat"}, 08 AM/.toString(),"Submission Start and End Date":/${variables."todaysDate"} - ${variables."endDate"}/.toString(),"Submission Start and End Date Tooltip":/Start: ${variables."todaysDateInNewFormat"}, ${variables."ttcurrentTime"}End: ${variables."endDateInNewFormat"}, 08 AM/.toString(),"Navigate":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Apply/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Apply App Post Idea
        new actions.PostIdea.SetApplyAppPostIdea().run("Title":/Idea One/.toString(),"Description":/Idea One Desc/.toString(),"Category":/New Service/.toString(),"Action":/Submit Idea/.toString())
        //Verify Voting/Comments/Favorites Icon on Idea Card in Idea Boards 30
        new actions.IdeaBoard.VerifyVotingCommentsIconIdeaCardIdeaBoards30().run("Simple Voting":false,"Comments":false)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Apply/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Apply App Post Idea
        new actions.PostIdea.SetApplyAppPostIdea().run("Title":/End User Idea/.toString(),"Description":/End User IdeaDesc/.toString(),"Category":/New Process/.toString(),"Action":/Submit Idea/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/End User Idea/.toString())
        //Verify Voting UI on Idea Card and View Idea
        new actions.IdeaBoard.VerifyVotingUIonIdeaCard().run("Idea Name":/End User Idea/.toString(),"Voting UI View":/Displayed/.toString(),"Number of Matches":/0/.toString())
        //Verify Comment On Off in View Idea
        new actions.ViewIdeaComment.VerifyCommentOnOffinViewIdea().run("Should Comment Field Exist":false,"Number of Matches":/1/.toString())
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
    //Set to Scheduler V1
    public static def Action67e1e1cc1dc7aa140e19a818(def params){
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for BIOnly Beta tab
        new actions.SetupBI.SetEnterpriseSetupforBIOnlyBetatab().run("Site Scheduler v2":false,"Sync Phase and Scheduler Content (v2 and v3)":false)

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