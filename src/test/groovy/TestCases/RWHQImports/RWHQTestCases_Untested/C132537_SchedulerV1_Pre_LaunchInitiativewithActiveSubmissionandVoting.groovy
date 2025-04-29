import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132537 - Scheduler V1 - Pre-Launch Initiative with Active Submission and Voting
class C132537_SchedulerV1_Pre_LaunchInitiativewithActiveSubmissionandVoting
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
        variables."startDate" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/14/.toString(),"Format":/MM\/dd\/yyyy/.toString())
        //Return Date in Requested Format
        variables."endDate" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/45/.toString(),"Format":/MM\/dd\/yyyy/.toString())
        //Create Solve Webstorm
        new actions.WebstormCreation.CreateSolveWebstorm().run("Action on Design Tab":/<Empty>/.toString(),"Launch Date":/${variables."startDate"}/.toString(),"Launch Time":/10:00 AM/.toString(),"End Date":/${variables."endDate"}/.toString(),"End Time":/3:00 PM/.toString(),"Action on Site Schedule Tab":/Continue/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pitch/.toString(),"Area to Navigate to":/Setup/.toString())
        //Return Todays or Other Date in the Requested Format
        variables."todaysDateInNewFormat" = new actions.Utils.ReturnTodaysDateintheRequestedFormat().run("Format":/MMM d/.toString())
        //Return Date in Requested Format
        variables."startDateInNewFormat" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/14/.toString(),"Format":/MMM d/.toString())
        //Return Date in Requested Format
        variables."endDateInNewFormat" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/45/.toString(),"Format":/MMM d/.toString())
        //Verify Scheduler V1 in Setup
        new actions.SetupScheduler.VerifySetupSchedulerV1().run("Status":/Pre-Launch/.toString(),"Pre-Launch End Date":/Ends ${variables."startDateInNewFormat"}/.toString(),"Active Start End Dates":/Active ${variables."startDateInNewFormat"} - ${variables."endDateInNewFormat"}/.toString(),"Initiative Active Tooltip Start":/ Start: ${variables."startDateInNewFormat"}, 10 AM/.toString(),"Initiative Active Tooltip End":/ End: ${variables."endDateInNewFormat"}, 03 PM/.toString(),"Submission Start End Dates":/Submission ${variables."startDateInNewFormat"} - ${variables."endDateInNewFormat"}/.toString(),"Submission Tooltip Start":/ Start: ${variables."startDateInNewFormat"}, 10 AM/.toString(),"Submission Tooltip End":/ End: ${variables."endDateInNewFormat"}, 03 PM/.toString(),"Voting Start End Dates":/Voting ${variables."startDateInNewFormat"} - ${variables."endDateInNewFormat"}/.toString(),"Voting Tooltip Start":/ Start: ${variables."startDateInNewFormat"}, 10 AM/.toString(),"Voting Tooltip End":/ End: ${variables."endDateInNewFormat"}, 03 PM/.toString(),"Commenting Start End Dates":/Commenting ${variables."startDateInNewFormat"} - ${variables."endDateInNewFormat"}/.toString(),"Commenting Tooltip Start":/ Start: ${variables."startDateInNewFormat"}, 10 AM/.toString(),"Commenting Tooltip End":/ End: ${variables."endDateInNewFormat"}, 03 PM/.toString())
        //Return Current Time
        variables."currentTime" = new actions.Utils.ReturnCurrentTime().run("Format":/h:mm aa/.toString())
        //Return Current Time
        variables."ttcurrentTime" = new actions.Utils.ReturnCurrentTime().run("Format":/hh aa/.toString())
        //Set Schedule in Site Setup V1
        new actions.SetupScheduler.SetupSchedulerV1.SetScheduleinSiteSetupV1().run("Resource":/Submission/.toString(),"Click from":/Grid Cell/.toString())
        //Set Date and Time in Scheduler in Site Setup V1
        new actions.SetupScheduler.SetupSchedulerV1.SetDateandTimeinSchedulerinSiteSetupV1().run("Start Date":/${variables."todaysDate"}/.toString(),"Start Date Time":/${variables."currentTime"}/.toString(),"End Date":/${variables."endDate"}/.toString(),"End Date Time":/1:00 AM/.toString(),"Action":/Save Schedule/.toString())
        //Set Schedule in Site Setup V1
        new actions.SetupScheduler.SetupSchedulerV1.SetScheduleinSiteSetupV1().run("Resource":/Voting/.toString(),"Click from":/Grid Cell/.toString())
        //Set Date and Time in Scheduler in Site Setup V1
        new actions.SetupScheduler.SetupSchedulerV1.SetDateandTimeinSchedulerinSiteSetupV1().run("Start Date":/${variables."todaysDate"}/.toString(),"Start Date Time":/${variables."currentTime"}/.toString(),"End Date":/${variables."endDate"}/.toString(),"End Date Time":/3:00 AM/.toString(),"Action":/Save Schedule/.toString())
        //Set Scheduler Top Bar Buttons V1
        new actions.SetupScheduler.SetupSchedulerV1.SetSchedulerTopBarButtonsV1().run("View":/Next/.toString())
        //Verify Scheduler V1 in Setup
        new actions.SetupScheduler.VerifySetupSchedulerV1().run("Navigate to the Tab":false,"Status":/Pre-Launch/.toString(),"Submission Start End Dates":/Submission ${variables."todaysDateInNewFormat"} - ${variables."endDateInNewFormat"}/.toString(),"Submission Tooltip Start":/Start: ${variables."todaysDateInNewFormat"}, ${variables."ttcurrentTime"}/.toString(),"Submission Tooltip End":/End: ${variables."endDateInNewFormat"}, 01 AM/.toString(),"Voting Start End Dates":/Voting ${variables."todaysDateInNewFormat"} - ${variables."endDateInNewFormat"}/.toString(),"Voting Tooltip Start":/Start: ${variables."todaysDateInNewFormat"}, ${variables."ttcurrentTime"}/.toString(),"Voting Tooltip End":/End: ${variables."endDateInNewFormat"}, 03 AM/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pitch/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Voting tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforNewVotingtab().run("Demote Voting Checkbox":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pitch/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Pitch App Post Idea
        new actions.PostIdea.SetPitchAppPostIdea().run("Title":/Idea Title/.toString(),"Image File":/Image5.jpg/.toString(),"Image Crop or Cancel":/Crop/.toString(),"Submitter":/Yourself/.toString(),"Description":/Idea Description/.toString(),"Attachments File":/SampleDoc.docx/.toString(),"Attachment Add or Remove":/Add/.toString(),"Tags":/testtag1/.toString(),"Tags Add or Remove":/Add/.toString(),"What is the value proposition?":/this is for testing purpose/.toString(),"What problem are you solving?":/this is for testing purpose2/.toString(),"What key resources does your proposal require?":/this is for testing purpose3/.toString(),"Who are the key stakeholders in executing your proposal?":/this is for testing purpose4/.toString(),"What are the key risks of executing your proposal?":/this is for testing purpose5/.toString(),"Please describe your (team's) background and experience":/this is for testing purpose6/.toString(),"Action":/Submit Idea/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser2@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pitch/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Idea Title/.toString())
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Access Idea":/Modal Header/.toString())
        //Verify Comment On Off in View Idea
        new actions.ViewIdeaComment.VerifyCommentOnOffinViewIdea().run("Should Comment Field Exist":false,"Number of Matches":/1/.toString())
        //Set Voting on VI3
        new actions.ViewIdea30.SetVotingonViewIdea3().run("Promote or Demote":/Promote/.toString())
        //Verify Votes in View Idea 3
        new actions.ViewIdea30.VerifyVotesinViewIdea3().run("View Voters":true,"User":/End User 2/.toString(),"Number of Matches":/1/.toString())
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