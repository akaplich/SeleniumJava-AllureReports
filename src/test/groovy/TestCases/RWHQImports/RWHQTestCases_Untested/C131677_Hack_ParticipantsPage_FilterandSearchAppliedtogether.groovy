import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C131677 - Hack > Participants Page - Filter and Search Applied together
class C131677_Hack_ParticipantsPage_FilterandSearchAppliedtogether
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Unlimited Brightidea Administrator License Type":/1/.toString(),"Unlimited Idea Box Manager License Type":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Apply Filter on Apps Pillar 2.0
        new actions.AppsPillar.ApplyFilterAppsPillar20().run("Filter Option":/Programs/.toString())
        //Return Todays or Other Date in the Requested Format
        variables."today" = new actions.Utils.ReturnTodaysDateintheRequestedFormat().run("Format":/MM\/dd\/yyyy/.toString())
        //Add Subtract From Date
        variables."start" = new actions.Utils.AddSubstractFromDate().run("Date":/today/.toString(),"Add or Subtract":/Add/.toString(),"Number":/2/.toString(),"Units":/Days/.toString())
        //Return Current Time
        variables."now" = new actions.Utils.ReturnCurrentTime().run("Format":/h:mm a/.toString())
        //Add Subtract From Date
        variables."end" = new actions.Utils.AddSubstractFromDate().run("Date":/today/.toString(),"Add or Subtract":/Add/.toString(),"Number":/1/.toString(),"Units":/Years/.toString())
        //Create Pipeline with Scheduler V3
        new actions.WebstormCreation.CreatePipelineWithSchedulerV3().run("App Name (optional)":/Hackathon/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Title":/Hack/.toString(),"Description":/Hack Event description/.toString(),"Early Access":/ALL/.toString(),"Early Access Add or Remove":/Add/.toString(),"Moderator Field Title":/Pipeline Moderator/.toString(),"Moderator Field Value":/Moderator/.toString(),"Moderator Field Value Add or Remove":/Add/.toString(),"Phase 1 Title":/Plan & Setup/.toString(),"Phase 1 (Start Date, Start Time, End Date, End Time)":/${variables."start"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 2 Title":/Incubate/.toString(),"Phase 2 (Start Date, Start Time, End Date, End Time)":/${variables."start"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 3 Title":/Build\/Hack/.toString(),"Phase 3 (Start Date, Start Time, End Date, End Time)":/${variables."start"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 4 Title":/Presentation & Judging/.toString(),"Phase 4 (Start Date, Start Time, End Date, End Time)":/${variables."start"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 5 Title":/Recognize/.toString(),"Phase 5 (Start Date, Start Time, End Date, End Time)":/${variables."start"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 6 Title":/Close Out & Review /.toString(),"Phase 6 (Start Date, Start Time, End Date, End Time)":/${variables."start"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Action on Site Schedule Page":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Schedule in Site Setup (V2 & V3)
        new actions.SetupScheduler.SetupSchedulerV2.SetScheduleinSiteSetup().run("Navigate to Tab":true,"Resource":/Early Registration/.toString(),"Click from":/Grid Cell/.toString())
        //Set Date and Time in Scheduler in Site Setup (V2 & V3)
        new actions.SetupScheduler.SetupSchedulerV2.SetDateandTimeinSchedulerinSiteSetup().run("Start Date":/${variables."today"}/.toString(),"Action":/Save Schedule/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/moderator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Profile/.toString())
        //Edit Your Profile
        new actions.UserProfile.EditYourProfile().run("Expertise":/MySQL,Database,JavaScript/.toString(),"Add or Remove Expertise":/Add,Add,Add/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/analyst@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Profile/.toString())
        //Edit Your Profile
        new actions.UserProfile.EditYourProfile().run("Expertise":/MySQL/.toString(),"Add or Remove Expertise":/Add/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Participants Page/.toString())
        //Set Registration or Get Started For Hackathon Onboarding
        new actions.WebstormHomepage.HackathonOnboarding.SetRegistrationorGetStartedForHackathonOnboarding().run("Area Accessing The Menu From":/Participants Page/.toString(),"Onboarding Menu Option":/Early Registration/.toString())
        //Set Join/Leave Event Modal - Hack App
        new actions.WebstormHomepage.SetJoinEventHackApp().run("Expertise":/MySQL,Database/.toString(),"Add or Remove Expertise":/Add,Add/.toString(),"I am available to join teams":true,"Action on Register and add expertise Screen":/Confirm/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Schedule in Site Setup (V2 & V3)
        new actions.SetupScheduler.SetupSchedulerV2.SetScheduleinSiteSetup().run("Navigate to Tab":true,"Resource":/Registration/.toString(),"Click from":/Grid Cell/.toString())
        //Set Date and Time in Scheduler in Site Setup (V2 & V3)
        new actions.SetupScheduler.SetupSchedulerV2.SetDateandTimeinSchedulerinSiteSetup().run("Start Date":/${variables."today"}/.toString(),"Action":/Save Schedule/.toString())
        //Set Schedule in Site Setup (V2 & V3)
        new actions.SetupScheduler.SetupSchedulerV2.SetScheduleinSiteSetup().run("Navigate to Tab":true,"Resource":/Submission/.toString(),"Click from":/Grid Cell/.toString())
        //Set Date and Time in Scheduler in Site Setup (V2 & V3)
        new actions.SetupScheduler.SetupSchedulerV2.SetDateandTimeinSchedulerinSiteSetup().run("Start Date":/${variables."today"}/.toString(),"Action":/Save Schedule/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/team submission with analyst moderator/.toString(),"Submitter":/Team/.toString(),"Submitter Team User":/analyst,Moderator/.toString(),"Submitter Team User Add or Remove":/Add,Add/.toString(),"Description":/test/.toString(),"Category":/Theme 1/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/end user submission/.toString(),"Description":/test/.toString(),"Category":/Theme 2/.toString(),"Action":/Submit Idea/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser2@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Home/.toString())
        //Set Registration or Get Started For Hackathon Onboarding
        new actions.WebstormHomepage.HackathonOnboarding.SetRegistrationorGetStartedForHackathonOnboarding().run("Area Accessing The Menu From":/Homepage Header/.toString(),"Onboarding Menu Option":/Registration/.toString())
        //Set Flow A for Hackathon Onboarding
        new actions.WebstormHomepage.HackathonOnboarding.SetFlowAforHackathonOnboarding().run("Action on Get Started Screen":/Next/.toString(),"Expertise":/JavaScript/.toString(),"Add or Remove Expertise":/Add/.toString(),"I am available to join teams":true,"Register and add expertise Action":/Continue to submission/.toString(),"Wait for Post Idea Page to Load":true)
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/end user 2 solo submission/.toString(),"Description":/test/.toString(),"Category":/Theme 1/.toString(),"Action":/Submit Idea/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/moderator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/moderator submission/.toString(),"Description":/desc/.toString(),"Category":/Theme 2/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/team submission with analyst/.toString(),"Submitter":/Team/.toString(),"Submitter Team User":/analyst/.toString(),"Submitter Team User Add or Remove":/Add/.toString(),"Description":/test/.toString(),"Category":/Theme 3/.toString(),"Action":/Submit Idea/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/analyst@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/analyst submission/.toString(),"Description":/test/.toString(),"Category":/Theme 3/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/team submission with end user/.toString(),"Submitter":/Team/.toString(),"Submitter Team User":/End User/.toString(),"Submitter Team User Add or Remove":/Add/.toString(),"Description":/test/.toString(),"Category":/Theme 1/.toString(),"Action":/Submit Idea/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Participants Page/.toString())
        //Participants Page - Verify Participant
        new actions.WebstormHomepage.HackVerifyPariticipant().run("Username":/End User/.toString(),"Available to join teams":/Available to join teams/.toString(),"Expertise":/Database,MySQL/.toString(),"Projects":/end user submission,team submission with analyst moderator,team submission with end user/.toString(),"Placement Number":/5/.toString(),"Number of Matches":/1/.toString())
        //Participants Page - Verify Participant
        new actions.WebstormHomepage.HackVerifyPariticipant().run("Username":/Moderator/.toString(),"Available to join teams":/Not Available to join teams/.toString(),"Expertise":/Database,JavaScript,MySQL/.toString(),"Projects":/moderator submission,team submission with analyst,team submission with analyst moderator/.toString(),"Placement Number":/4/.toString(),"Number of Matches":/1/.toString())
        //Participants Page - Verify Participant
        new actions.WebstormHomepage.HackVerifyPariticipant().run("Username":/analyst/.toString(),"Available to join teams":/Not Available to join teams/.toString(),"Expertise":/MySQL/.toString(),"Projects":/analyst submission,team submission with end user,team submission with analyst,team submission with analyst moderator/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Participants Page - Verify Participant
        new actions.WebstormHomepage.HackVerifyPariticipant().run("Username":/End User 2/.toString(),"Available to join teams":/Available to join teams/.toString(),"Expertise":/JavaScript/.toString(),"Projects":/end user 2 solo submission/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Participants Page - Set Filter or Search
        new actions.Webstorm.ParticipantsPageSetFilterSearch().run("Search by name":/end user/.toString(),"Certifications":[])
        //Participants Page - Verify Participant
        new actions.WebstormHomepage.HackVerifyPariticipant().run("Username":/End User 2/.toString(),"Available to join teams":/Available to join teams/.toString(),"Expertise":/JavaScript/.toString(),"Projects":/end user 2 solo submission/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Participants Page - Verify Participant
        new actions.WebstormHomepage.HackVerifyPariticipant().run("Username":/End User/.toString(),"Available to join teams":/Available to join teams/.toString(),"Expertise":/Database,MySQL/.toString(),"Projects":/end user submission,team submission with analyst moderator,team submission with end user/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Participants Page - Set Filter or Search
        new actions.Webstorm.ParticipantsPageSetFilterSearch().run("Search Expertise":"","Tick Expertise":/Database/.toString(),"Certifications":[])
        //Participants Page - Verify Participant
        new actions.WebstormHomepage.HackVerifyPariticipant().run("Username":/End User/.toString(),"Available to join teams":/Available to join teams/.toString(),"Expertise":/Database,MySQL/.toString(),"Projects":/end user submission,team submission with analyst moderator,team submission with end user/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Participants Page - Set Filter or Search
        new actions.Webstorm.ParticipantsPageSetFilterSearch().run("Clear All Filters":true,"Search Expertise":"","Certifications":[])
        //Participants Page - Verify Participant
        new actions.WebstormHomepage.HackVerifyPariticipant().run("Username":/End User 2/.toString(),"Available to join teams":/Available to join teams/.toString(),"Expertise":/JavaScript/.toString(),"Projects":/end user 2 solo submission/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Participants Page - Verify Participant
        new actions.WebstormHomepage.HackVerifyPariticipant().run("Username":/analyst/.toString(),"Available to join teams":/Not Available to join teams/.toString(),"Expertise":/MySQL/.toString(),"Projects":/analyst submission,team submission with end user,team submission with analyst,team submission with analyst moderator/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Participants Page - Verify Participant
        new actions.WebstormHomepage.HackVerifyPariticipant().run("Username":/Moderator/.toString(),"Available to join teams":/Not Available to join teams/.toString(),"Expertise":/Database,JavaScript,MySQL/.toString(),"Projects":/moderator submission,team submission with analyst,team submission with analyst moderator/.toString(),"Placement Number":/4/.toString(),"Number of Matches":/1/.toString())
        //Participants Page - Verify Participant
        new actions.WebstormHomepage.HackVerifyPariticipant().run("Username":/End User/.toString(),"Available to join teams":/Available to join teams/.toString(),"Expertise":/Database,MySQL/.toString(),"Projects":/end user submission,team submission with analyst moderator,team submission with end user/.toString(),"Placement Number":/5/.toString(),"Number of Matches":/1/.toString())
        //Participants Page - Set Filter or Search
        new actions.Webstorm.ParticipantsPageSetFilterSearch().run("Search Expertise":"","Tick Expertise":/Database,JavaScript/.toString(),"Available to Join Teams":/Not Available/.toString(),"Certifications":[])
        //Participants Page - Verify Participant
        new actions.WebstormHomepage.HackVerifyPariticipant().run("Username":/End User 2/.toString(),"Available to join teams":/Available to join teams/.toString(),"Expertise":/JavaScript/.toString(),"Projects":/end user 2 solo submission/.toString(),"Number of Matches":/0/.toString())
        //Participants Page - Verify Participant
        new actions.WebstormHomepage.HackVerifyPariticipant().run("Username":/Moderator/.toString(),"Available to join teams":/Not Available to join teams/.toString(),"Expertise":/Database,JavaScript,MySQL/.toString(),"Projects":/moderator submission,team submission with analyst,team submission with analyst moderator/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Participants Page - Verify Participant
        new actions.WebstormHomepage.HackVerifyPariticipant().run("Username":/End User/.toString(),"Available to join teams":/Available to join teams/.toString(),"Expertise":/Database,MySQL/.toString(),"Projects":/end user submission,team submission with analyst moderator,team submission with end user/.toString(),"Number of Matches":/0/.toString())
        //Participants Page - Set Filter or Search
        new actions.Webstorm.ParticipantsPageSetFilterSearch().run("Clear All Filters":true,"Search Expertise":"","Tick Expertise":/Database,JavaScript,MySQL/.toString(),"Projects Count":/3/.toString(),"Certifications":[])
        //Participants Page - Verify Participant
        new actions.WebstormHomepage.HackVerifyPariticipant().run("Username":/End User 2/.toString(),"Available to join teams":/Available to join teams/.toString(),"Expertise":/JavaScript/.toString(),"Projects":/end user 2 solo submission/.toString(),"Number of Matches":/0/.toString())
        //Participants Page - Verify Participant
        new actions.WebstormHomepage.HackVerifyPariticipant().run("Username":/analyst/.toString(),"Available to join teams":/Not Available to join teams/.toString(),"Expertise":/MySQL/.toString(),"Projects":/analyst submission,team submission with end user,team submission with analyst,team submission with analyst moderator/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Participants Page - Verify Participant
        new actions.WebstormHomepage.HackVerifyPariticipant().run("Username":/Moderator/.toString(),"Available to join teams":/Not Available to join teams/.toString(),"Expertise":/Database,JavaScript,MySQL/.toString(),"Projects":/moderator submission,team submission with analyst,team submission with analyst moderator/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Participants Page - Verify Participant
        new actions.WebstormHomepage.HackVerifyPariticipant().run("Username":/End User/.toString(),"Available to join teams":/Available to join teams/.toString(),"Expertise":/Database,MySQL/.toString(),"Projects":/end user submission,team submission with analyst moderator,team submission with end user/.toString(),"Placement Number":/4/.toString(),"Number of Matches":/1/.toString())
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