import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132547 - Scheduler V1 - Active to Closed and Verify Dates
class C132547_SchedulerV1_ActivetoClosedandVerifyDates
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
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Explore/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Explore/.toString(),"Description":/Explore description/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Early Access":/ALL/.toString(),"Early Access Add or Remove":/Add/.toString())
        //Return Current Time
        variables."currentTime" = new actions.Utils.ReturnCurrentTime().run("Format":/h:mm aa/.toString())
        //Return Todays or Other Date in the Requested Format
        variables."todaysDate" = new actions.Utils.ReturnTodaysDateintheRequestedFormat().run("Format":/MM\/dd\/yyyy/.toString())
        //Return Date in Requested Format
        variables."endDate" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/7/.toString(),"Format":/MM\/dd\/yyyy/.toString())
        //Create Solve Webstorm
        new actions.WebstormCreation.CreateSolveWebstorm().run("Action on Design Tab":/<Empty>/.toString(),"Launch Date":/${variables."todaysDate"}/.toString(),"Launch Time":/${variables."currentTime"}/.toString(),"End Date":/${variables."endDate"}/.toString(),"End Time":/6:00 PM/.toString(),"Action on Site Schedule Tab":/Continue/.toString(),"Action on Process Tab":/Continue/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Explore/.toString(),"Area to Navigate to":/Setup/.toString())
        //Return Todays or Other Date in the Requested Format
        variables."todaysDateInNewFormat" = new actions.Utils.ReturnTodaysDateintheRequestedFormat().run("Format":/MMM d/.toString())
        //Return Date in Requested Format
        variables."endDateInNewFormat" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/7/.toString(),"Format":/MMM d/.toString())
        //Return Current Time
        variables."ttcurrentTime" = new actions.Utils.ReturnCurrentTime().run("Format":/hh aa/.toString())
        //Verify Scheduler V1 in Setup
        new actions.SetupScheduler.VerifySetupSchedulerV1().run("Navigate to the Tab":true,"Status":/Active/.toString(),"Initiative Active Tooltip Start":/Start: ${variables."todaysDateInNewFormat"}, ${variables."ttcurrentTime"}/.toString(),"Initiative Active Tooltip End":/End: ${variables."endDateInNewFormat"}, 06 PM/.toString(),"Voting Tooltip Start":/Start: ${variables."todaysDateInNewFormat"}, ${variables."ttcurrentTime"}/.toString(),"Voting Tooltip End":/End: ${variables."endDateInNewFormat"}, 06 PM/.toString(),"Commenting Tooltip Start":/Start: ${variables."todaysDateInNewFormat"}, ${variables."ttcurrentTime"}/.toString(),"Commenting Tooltip End":/End: ${variables."endDateInNewFormat"}, 06 PM/.toString())
        //Return Date in Requested Format
        variables."closedstartDate" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/-10/.toString(),"Format":/MM\/dd\/yyyy/.toString())
        //Return Date in Requested Format
        variables."closedendDate" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/-2/.toString(),"Format":/MM\/dd\/yyyy/.toString())
        //Return Date in Requested Format
        variables."closedstartDateInNewFormat" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/-10/.toString(),"Format":/MMM d/.toString())
        //Return Date in Requested Format
        variables."closedendDateInNewFormat" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/-2/.toString(),"Format":/MMM d/.toString())
        //Set Schedule in Site Setup V1
        new actions.SetupScheduler.SetupSchedulerV1.SetScheduleinSiteSetupV1().run("Resource":/Initiative/.toString(),"Click from":/Grid Cell/.toString())
        //Set Date and Time in Scheduler in Site Setup V1
        new actions.SetupScheduler.SetupSchedulerV1.SetDateandTimeinSchedulerinSiteSetupV1().run("Start Date":/${variables."closedstartDate"}/.toString(),"Start Date Time":/6:00 PM/.toString(),"End Date":/${variables."closedendDate"}/.toString(),"End Date Time":/6:00 PM/.toString(),"Action":/Save Schedule/.toString())
        //Set Schedule in Site Setup V1
        new actions.SetupScheduler.SetupSchedulerV1.SetScheduleinSiteSetupV1().run("Resource":/Submission/.toString(),"Click from":/Grid Cell/.toString())
        //Set Date and Time in Scheduler in Site Setup V1
        new actions.SetupScheduler.SetupSchedulerV1.SetDateandTimeinSchedulerinSiteSetupV1().run("Start Date":/${variables."closedstartDate"}/.toString(),"Start Date Time":/6:00 PM/.toString(),"End Date":/${variables."closedendDate"}/.toString(),"End Date Time":/6:00 PM/.toString(),"Action":/Save Schedule/.toString())
        //Set Schedule in Site Setup V1
        new actions.SetupScheduler.SetupSchedulerV1.SetScheduleinSiteSetupV1().run("Resource":/Voting/.toString(),"Click from":/Grid Cell/.toString())
        //Set Date and Time in Scheduler in Site Setup V1
        new actions.SetupScheduler.SetupSchedulerV1.SetDateandTimeinSchedulerinSiteSetupV1().run("Start Date":/${variables."closedstartDate"}/.toString(),"Start Date Time":/6:00 PM/.toString(),"End Date":/${variables."closedendDate"}/.toString(),"End Date Time":/6:00 PM/.toString(),"Action":/Save Schedule/.toString())
        //Set Schedule in Site Setup V1
        new actions.SetupScheduler.SetupSchedulerV1.SetScheduleinSiteSetupV1().run("Resource":/Commenting/.toString(),"Click from":/Grid Cell/.toString())
        //Set Date and Time in Scheduler in Site Setup V1
        new actions.SetupScheduler.SetupSchedulerV1.SetDateandTimeinSchedulerinSiteSetupV1().run("Start Date":/${variables."closedstartDate"}/.toString(),"Start Date Time":/6:00 PM/.toString(),"End Date":/${variables."closedendDate"}/.toString(),"End Date Time":/6:00 PM/.toString(),"Action":/Save Schedule/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Verify Scheduler V1 in Setup
        new actions.SetupScheduler.VerifySetupSchedulerV1().run("Navigate to the Tab":false,"Status":/Closed/.toString(),"Initiative Active Tooltip Start":/Start: ${variables."closedstartDateInNewFormat"}, 06PM /.toString(),"Initiative Active Tooltip End":/End: ${variables."closedendDateInNewFormat"}, 06PM/.toString(),"Submission Tooltip Start":/Start: ${variables."closedstartDateInNewFormat"}, 06PM /.toString(),"Submission Tooltip End":/End: ${variables."closedendDateInNewFormat"}, 06PM/.toString(),"Voting Tooltip Start":/Start: ${variables."closedstartDateInNewFormat"}, 06PM /.toString(),"Voting Tooltip End":/End: ${variables."closedendDateInNewFormat"}, 06PM/.toString(),"Commenting Tooltip Start":/Start: ${variables."closedstartDateInNewFormat"}, 06PM /.toString(),"Commenting Tooltip End":/End: ${variables."closedendDateInNewFormat"}, 06PM/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Explore/.toString(),"Area to Navigate to":/Home/.toString())
        //Verify Homepage Header 2
        new actions.WebstormHomepage.VerifyHomepageHeader2().run("Title":/Explore/.toString(),"Description":/Submit your ideas for products, services, and experiences that address this market opportunity. Top ideas will be adopted and implemented!/.toString(),"Submit Displayed":false,"Browse Displayed":true,"Registration":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Explore/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/Quick Add Idea One/.toString(),"Action":/Submit/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Explore/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Verify Voting UI on Idea Card and View Idea
        new actions.IdeaBoard.VerifyVotingUIonIdeaCard().run("Idea Name":/Quick Add Idea One/.toString(),"Voting UI View":/Displayed/.toString(),"Number of Matches":/0/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Explore/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Verify Voting UI on Idea Card and View Idea
        new actions.IdeaBoard.VerifyVotingUIonIdeaCard().run("Idea Name":/Quick Add Idea One/.toString(),"Voting UI View":/Displayed/.toString(),"Number of Matches":/0/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Quick Add Idea One/.toString())
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