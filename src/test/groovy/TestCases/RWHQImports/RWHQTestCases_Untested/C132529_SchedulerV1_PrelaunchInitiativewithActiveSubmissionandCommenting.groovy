import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132529 - Scheduler V1 - Prelaunch Initiative with Active Submission and Commenting
class C132529_SchedulerV1_PrelaunchInitiativewithActiveSubmissionandCommenting
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
        variables."startDate" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/10/.toString(),"Format":/MM\/dd\/yyyy/.toString())
        //Return Date in Requested Format
        variables."endDate" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/40/.toString(),"Format":/MM\/dd\/yyyy/.toString())
        //Create Solve Webstorm
        new actions.WebstormCreation.CreateSolveWebstorm().run("Action on Design Tab":/<Empty>/.toString(),"Launch Date":/${variables."startDate"}/.toString(),"Launch Time":/10:00 AM/.toString(),"End Date":/${variables."endDate"}/.toString(),"End Time":/3:00 PM/.toString(),"Action on Site Schedule Tab":/Continue/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pitch/.toString(),"Area to Navigate to":/Setup/.toString())
        //Return Date in Requested Format
        variables."startDateInNewFormat" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/10/.toString(),"Format":/MMM d/.toString())
        //Return Date in Requested Format
        variables."endDateInNewFormat" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/40/.toString(),"Format":/MMM d/.toString())
        //Verify Scheduler V1 in Setup
        new actions.SetupScheduler.VerifySetupSchedulerV1().run("Navigate to the Tab":true,"Status":/Pre-Launch/.toString(),"Pre-Launch End Date":/Ends ${variables."startDateInNewFormat"}/.toString(),"Active Start End Dates":/Active ${variables."startDateInNewFormat"} - ${variables."endDateInNewFormat"}/.toString(),"Initiative Active Tooltip Start":/ Start: ${variables."startDateInNewFormat"}, 10 AM/.toString(),"Initiative Active Tooltip End":/ End: ${variables."endDateInNewFormat"}, 03 PM/.toString(),"Submission Start End Dates":/Submission ${variables."startDateInNewFormat"} - ${variables."endDateInNewFormat"}/.toString(),"Submission Tooltip Start":/ Start: ${variables."startDateInNewFormat"}, 10 AM/.toString(),"Submission Tooltip End":/ End: ${variables."endDateInNewFormat"}, 03 PM/.toString(),"Voting Start End Dates":/Voting ${variables."startDateInNewFormat"} - ${variables."endDateInNewFormat"}/.toString(),"Voting Tooltip Start":/ Start: ${variables."startDateInNewFormat"}, 10 AM/.toString(),"Voting Tooltip End":/ End: ${variables."endDateInNewFormat"}, 03 PM/.toString(),"Commenting Start End Dates":/Commenting ${variables."startDateInNewFormat"} - ${variables."endDateInNewFormat"}/.toString(),"Commenting Tooltip Start":/ Start: ${variables."startDateInNewFormat"}, 10 AM/.toString(),"Commenting Tooltip End":/ End: ${variables."endDateInNewFormat"}, 03 PM/.toString())
        //Return Current Time
        variables."currentTime" = new actions.Utils.ReturnCurrentTime().run("Format":/h:mm aa/.toString())
        //Return Current Time
        variables."ttcurrentTime" = new actions.Utils.ReturnCurrentTime().run("Format":/hh aa/.toString())
        //Set Schedule in Site Setup V1
        new actions.SetupScheduler.SetupSchedulerV1.SetScheduleinSiteSetupV1().run("Resource":/Submission/.toString(),"Click from":/Grid Cell/.toString())
        //Set Date and Time in Scheduler in Site Setup V1
        new actions.SetupScheduler.SetupSchedulerV1.SetDateandTimeinSchedulerinSiteSetupV1().run("Start Date":/${variables."todaysDate"}/.toString(),"Start Date Time":/${variables."currentTime"}/.toString(),"End Date":/${variables."endDate"}/.toString(),"End Date Time":/3:00 PM/.toString(),"Action":/Save Schedule/.toString())
        //Return Todays or Other Date in the Requested Format
        variables."todaysDateInNewFormat" = new actions.Utils.ReturnTodaysDateintheRequestedFormat().run("Format":/MMM d/.toString())
        //Verify Scheduler V1 in Setup
        new actions.SetupScheduler.VerifySetupSchedulerV1().run("Navigate to the Tab":false,"Status":/Pre-Launch/.toString(),"Submission Start End Dates":/Submission ${variables."todaysDateInNewFormat"} - ${variables."endDateInNewFormat"}/.toString(),"Submission Tooltip Start":/Start: ${variables."todaysDateInNewFormat"}, ${variables."ttcurrentTime"}/.toString(),"Submission Tooltip End":/End: ${variables."endDateInNewFormat"}, 03 PM/.toString())
        //Set Schedule in Site Setup V1
        new actions.SetupScheduler.SetupSchedulerV1.SetScheduleinSiteSetupV1().run("Resource":/Commenting/.toString(),"Click from":/Grid Cell/.toString())
        //Set Date and Time in Scheduler in Site Setup V1
        new actions.SetupScheduler.SetupSchedulerV1.SetDateandTimeinSchedulerinSiteSetupV1().run("Start Date":/${variables."todaysDate"}/.toString(),"Start Date Time":/${variables."currentTime"}/.toString(),"End Date":/${variables."endDate"}/.toString(),"End Date Time":/6:00 PM/.toString(),"Action":/Save Schedule/.toString())
        //Verify Scheduler V1 in Setup
        new actions.SetupScheduler.VerifySetupSchedulerV1().run("Navigate to the Tab":false,"Status":/Pre-Launch/.toString(),"Submission Start End Dates":/Submission ${variables."todaysDateInNewFormat"} - ${variables."endDateInNewFormat"}/.toString(),"Submission Tooltip Start":/Start: ${variables."todaysDateInNewFormat"}, ${variables."ttcurrentTime"}/.toString(),"Submission Tooltip End":/End: ${variables."endDateInNewFormat"}, 03 PM/.toString(),"Commenting Start End Dates":/Commenting ${variables."todaysDateInNewFormat"} - ${variables."endDateInNewFormat"}/.toString(),"Commenting Tooltip Start":/Start: ${variables."todaysDateInNewFormat"}, ${variables."ttcurrentTime"}/.toString(),"Commenting Tooltip End":/End: ${variables."endDateInNewFormat"}, 06 PM/.toString())
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