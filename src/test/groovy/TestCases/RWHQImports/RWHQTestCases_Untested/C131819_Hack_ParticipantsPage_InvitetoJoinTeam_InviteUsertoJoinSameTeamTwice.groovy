import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131819 - Hack > Participants Page - Invite to Join Team - Invite User to Join Same Team Twice
class C131819_Hack_ParticipantsPage_InvitetoJoinTeam_InviteUsertoJoinSameTeamTwice
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
        //Return Todays or Other Date in the Requested Format
        variables."today" = new actions.Utils.ReturnTodaysDateintheRequestedFormat().run("Format":/MM\/dd\/yyyy/.toString())
        //Add Subtract From Date
        variables."start" = new actions.Utils.AddSubstractFromDate().run("Date":/today/.toString(),"Add or Subtract":/Add/.toString(),"Number":/2/.toString(),"Units":/Days/.toString())
        //Return Current Time
        variables."now" = new actions.Utils.ReturnCurrentTime().run("Format":/h:mm a/.toString())
        //Add Subtract From Date
        variables."end" = new actions.Utils.AddSubstractFromDate().run("Date":/today/.toString(),"Add or Subtract":/Add/.toString(),"Number":/1/.toString(),"Units":/Years/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Apply Filter on Apps Pillar 2.0
        new actions.AppsPillar.ApplyFilterAppsPillar20().run("Filter Option":/Programs/.toString())
        //Create Pipeline with Scheduler V3
        new actions.WebstormCreation.CreatePipelineWithSchedulerV3().run("App Name (optional)":/Hackathon/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Title":/Hack/.toString(),"Description":/Hack Event description/.toString(),"Action on Topic Page":/Continue/.toString(),"Action on Design Page":/Continue/.toString(),"Early Access":/ALL/.toString(),"Early Access Add or Remove":/Add/.toString(),"Moderator Field Title":/Pipeline Moderator/.toString(),"Moderator Field Value":/Moderator/.toString(),"Moderator Field Value Add or Remove":/Add/.toString(),"Action on Participants Page":/Continue/.toString(),"Phase 1 Title":/Plan & Setup/.toString(),"Phase 1 (Start Date, Start Time, End Date, End Time)":/${variables."start"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 2 Title":/Incubate/.toString(),"Phase 2 (Start Date, Start Time, End Date, End Time)":/${variables."start"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 3 Title":/Build\/Hack/.toString(),"Phase 3 (Start Date, Start Time, End Date, End Time)":/${variables."start"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 4 Title":/Presentation & Judging/.toString(),"Phase 4 (Start Date, Start Time, End Date, End Time)":/${variables."start"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 5 Title":/Recognize/.toString(),"Phase 5 (Start Date, Start Time, End Date, End Time)":/${variables."start"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 6 Title":/Close Out & Review /.toString(),"Phase 6 (Start Date, Start Time, End Date, End Time)":/${variables."start"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Action on Site Schedule Page":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Schedule in Site Setup (V2 & V3)
        new actions.SetupScheduler.SetupSchedulerV2.SetScheduleinSiteSetup().run("Navigate to Tab":true,"Resource":/Early Registration/.toString(),"Click from":/Grid Cell/.toString())
        //Set Date and Time in Scheduler in Site Setup (V2 & V3)
        new actions.SetupScheduler.SetupSchedulerV2.SetDateandTimeinSchedulerinSiteSetup().run("Start Date":/${variables."today"}/.toString(),"Action":/Save Schedule/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/analyst@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Participants Page/.toString())
        //Set Registration or Get Started For Hackathon Onboarding
        new actions.WebstormHomepage.HackathonOnboarding.SetRegistrationorGetStartedForHackathonOnboarding().run("Area Accessing The Menu From":/Participants Page/.toString(),"Onboarding Menu Option":/Early Registration/.toString())
        //Set Join/Leave Event Modal - Hack App
        new actions.WebstormHomepage.SetJoinEventHackApp().run("Expertise":/QA,Automation/.toString(),"Add or Remove Expertise":/Add,Add/.toString(),"I am available to join teams":true,"Action on Register and add expertise Screen":/Confirm/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Disable Scheduler
        new actions.SetupScheduler.SetDisableScheduler().run("Status":/Active/.toString(),"Enable Submission":true,"Action":/Disable Schedule/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/team submission with end user/.toString(),"Submitter":/Team/.toString(),"Submitter Team User":/End User/.toString(),"Submitter Team User Add or Remove":/Add/.toString(),"Description":/test/.toString(),"Category":/Theme 1/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Participants Page/.toString())
        //Participants Page - Set Participant Card
        new actions.WebstormHomepage.HackSetParticipantsCardonParticipantsPage().run("Username":/analyst/.toString(),"Actions":/Invite user to team.../.toString())
        //Verify Text in Element
        new actions.selenium.VerifyText().run("ID":/\/\/DIV[@class='f-participant-invite-user-modal-body']\/SPAN/.toString(),"Text":/analyst will receive an email, inviting them to join your selected project. The invited user will then login, review the project and can choose to apply to the team./.toString())
        //Set Invite User to Team Modal on Participants Page
        new actions.Webstorm.SetInviteUserToTeamModalOnParticipantsPage().run("Action":/Submit/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/analyst@test.com/.toString(),"Password":/brightidea1/.toString())
        //Verify Notifications
        new actions.Notifications.VerifyNotifications().run("Notification message":/System Admin has invited you to join their team, team submission with end user/.toString(),"Number of Matches":/1/.toString())
        //Access Notification from Global Navigation
        new actions.Notifications.AccessNotificationfromGlobalNavigation().run("Notification Message":/System Admin has invited you to join their team, team submission with end user/.toString())
        //Verify Idea on View Idea 30
        new actions.ViewIdea30.VerifyIdeaonViewIdea3().run("Template":/Medium Header/.toString(),"Idea Name":/team submission with end user/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Participants Page/.toString())
        //Participants Page - Set Participant Card
        new actions.WebstormHomepage.HackSetParticipantsCardonParticipantsPage().run("Username":/analyst/.toString(),"Actions":/Invite user to team.../.toString())
        //Verify Text in Element
        new actions.selenium.VerifyText().run("ID":/\/\/DIV[@class='f-participant-invite-user-modal-body']\/SPAN/.toString(),"Text":/analyst will receive an email, inviting them to join your selected project. The invited user will then login, review the project and can choose to apply to the team./.toString())
        //Set Invite User to Team Modal on Participants Page
        new actions.Webstorm.SetInviteUserToTeamModalOnParticipantsPage().run("Action":/Submit/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/analyst@test.com/.toString(),"Password":/brightidea1/.toString())
        //Verify Notifications
        new actions.Notifications.VerifyNotifications().run("Notification message":/System Admin has invited you to join their team, team submission with end user/.toString(),"Notification Read Status":/Read/.toString(),"Number of Matches":/1/.toString())
        //Verify Notifications
        new actions.Notifications.VerifyNotifications().run("Notification message":/End User has invited you to join their team, team submission with end user/.toString(),"Notification Read Status":/Unread/.toString(),"Number of Matches":/1/.toString())
        //Access Notification from Global Navigation
        new actions.Notifications.AccessNotificationfromGlobalNavigation().run("Notification Message":/End User has invited you to join their team, team submission with end user/.toString())
        //Verify Idea on View Idea 30
        new actions.ViewIdea30.VerifyIdeaonViewIdea3().run("Template":/Medium Header/.toString(),"Idea Name":/team submission with end user/.toString())
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