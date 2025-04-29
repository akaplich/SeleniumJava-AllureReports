import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C131886 - Participants Export - Posting Project and Project Room from Onboarding Modal
class C131886_ParticipantsExport_PostingProjectandProjectRoomfromOnboardingModal
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
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString(),"Activities":true,"My Ideas":true,"Submissions":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Apply Filter on Apps Pillar 2.0
        new actions.AppsPillar.ApplyFilterAppsPillar20().run("Filter Option":/Ecosystem/.toString())
        //Return Todays or Other Date in the Requested Format
        variables."today" = new actions.Utils.ReturnTodaysDateintheRequestedFormat().run("Format":/MM\/dd\/yyyy/.toString())
        //Return Current Time
        variables."now" = new actions.Utils.ReturnCurrentTime().run("Format":/h:mm a/.toString())
        //Add Subtract From Date
        variables."end" = new actions.Utils.AddSubstractFromDate().run("Date":/today/.toString(),"Add or Subtract":/Add/.toString(),"Number":/1/.toString(),"Units":/Years/.toString())
        //Create Pipeline with Scheduler V3
        new actions.WebstormCreation.CreatePipelineWithSchedulerV3().run("App Name (optional)":/External Hack/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Title":/Hack/.toString(),"Description":/Hack Event description/.toString(),"Action on Design Page":/Continue/.toString(),"Administrator Field Title":/Pipeline Administrator/.toString(),"Administrator Field Value":/Pipeline Admin/.toString(),"Administrator Field Value Add or Remove":/Add/.toString(),"Moderator Field Title":/Pipeline Moderator/.toString(),"Moderator Field Value":/Moderator/.toString(),"Moderator Field Value Add or Remove":/Add/.toString(),"Action on Participants Page":/Continue/.toString(),"Phase 1 Title":/Plan & Setup/.toString(),"Phase 1 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 2 Title":/Incubate/.toString(),"Phase 2 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 3 Title":/Build\/Hack/.toString(),"Phase 3 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 4 Title":/Presentation & Judging/.toString(),"Phase 4 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 5 Title":/Recognize/.toString(),"Phase 5 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 6 Title":/Close Out & Review /.toString(),"Phase 6 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Action on Site Schedule Page":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Home/.toString())
        //Set Registration or Get Started For Hackathon Onboarding
        new actions.WebstormHomepage.HackathonOnboarding.SetRegistrationorGetStartedForHackathonOnboarding().run("Area Accessing The Menu From":/Homepage Header/.toString(),"Onboarding Menu Option":/Registration/.toString())
        //Set Flow B and C on Hackathon Onboarding
        new actions.WebstormHomepage.HackathonOnboarding.SetFlowBandCforHackathonOnboarding().run("Flow Option Title":/I have a team and a project, just need to get started./.toString(),"Expertise":/myexpertise1/.toString(),"Add or Remove Expertise":/Add/.toString(),"I am available to join teams":true,"Register and add expertise Action":/Next/.toString(),"Project Name":/HELLO/.toString(),"Name your team Screen Action":/Next/.toString(),"Choose a team image Action":/Next/.toString(),"Find Teammates":/End User,Moderator/.toString(),"Teammates Add or Remove":/Add,Add/.toString(),"Build your winning team Screen Action":/Next/.toString(),"Get Started Screen Menu":/Want to work through your project before submission?/.toString(),"Wait for loading to disappear":true)
        //Verify and Set Your Project Room is Ready Modal
        new actions.WebstormHomepage.HackathonOnboarding.VerifyandSetYourProjectRoomisReadyModal().run("Verify the Text":/Use this space to collaborate with your team on your Hackathon idea(s).Use our Whiteboard tool to brainstorm, and iteratively work through concepts.Track upcoming to-dos and action items with our Tasks functionality.Organize everything in one place, pulling in additional files, organize into folders, etc.When your team is ready, click submit to automatically pull in the team members and submit your project./.toString(),"Action on the Modal":/Let's Go!/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser2@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Profile/.toString())
        //Edit Your Profile
        new actions.UserProfile.EditYourProfile().run("Display Picture":/Image5.jpg/.toString(),"Display Picture Change or Remove":/Change/.toString(),"First Name":/John/.toString(),"Last Name":/Doe/.toString(),"Job Title":/QA/.toString(),"Department":/Innovation/.toString(),"Location":/United States/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Home/.toString())
        //Set Registration or Get Started For Hackathon Onboarding
        new actions.WebstormHomepage.HackathonOnboarding.SetRegistrationorGetStartedForHackathonOnboarding().run("Area Accessing The Menu From":/Homepage Header/.toString(),"Onboarding Menu Option":/Registration/.toString())
        //Set Flow B and C on Hackathon Onboarding
        new actions.WebstormHomepage.HackathonOnboarding.SetFlowBandCforHackathonOnboarding().run("Flow Option Title":/I have a team and a project, just need to get started./.toString(),"I am available to join teams":true,"Register and add expertise Action":/Next/.toString(),"Project Name":/bestteamever/.toString(),"Name your team Screen Action":/Next/.toString(),"Choose a team image Action":/Next/.toString(),"Find Teammates":/analyst/.toString(),"Teammates Add or Remove":/Add/.toString(),"Build your winning team Screen Action":/Next/.toString(),"Get Started Screen Menu":/Ready to share your teams idea?/.toString(),"Wait for loading to disappear":true)
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/Check this idea/.toString(),"Description":/desc/.toString(),"Category":/Hackathon Category A/.toString(),"Action":/Submit Idea/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/pipelineadmin@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Exports for Users Tab
        new actions.SetupExports.SetWebstormSetupExportsforUsersTab().run("Report Options":/Participants List/.toString(),"Include User Profile Data":true,"Format":/csv/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Users/.toString(),"Report Name Starts with":/Participants-/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Participants-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["First Name","Last Name","Screen Name","Job Title","Department","Location","Email","Webstorm Name","Webstorm ID","Photo","Admin Status (Y/N)","Evaluator Status (Y/N)","Expertise","Submission","Submission Team Name","Submission Team","Registered","Joined Event","Join Date","Join Method","Certifications"],"Number of Matches":/1/.toString(),"Total Number of Rows":/6/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Users/.toString(),"Report Name Starts with":/Participants-/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Participants-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["analyst","analyst@test.com","D113","bestteamever","End User 2,analyst","Added to submission team"],"Number of Matches":/1/.toString(),"Total Number of Rows":/6/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Users/.toString(),"Report Name Starts with":/Participants-/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Participants-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["System Admin","bi.adminuser1@brightidea.com","myexpertise1","Manual Opt in"],"Number of Matches":/1/.toString(),"Total Number of Rows":/6/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Users/.toString(),"Report Name Starts with":/Participants-/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Participants-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["John","Doe","End User 2","QA","Innovation","United States","bi.enduser2@brightidea.com","Hack","D113","bestteamever","End User 2,analyst","Manual Opt in"],"Number of Matches":/1/.toString(),"Total Number of Rows":/6/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Users/.toString(),"Report Name Starts with":/Participants-/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Participants-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["bi.enduser1@brightidea.com","Hack Onboarding"],"Number of Matches":/1/.toString(),"Total Number of Rows":/6/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Users/.toString(),"Report Name Starts with":/Participants-/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Participants-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Moderator","Hack Onboarding"],"Number of Matches":/1/.toString(),"Total Number of Rows":/6/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Users/.toString(),"Report Name Starts with":/Participants-/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Participants-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Avaiable to join projects"],"Number of Matches":/0/.toString())
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