package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132508 - Email Alerts - Quick List - Project Room
class C132508_EmailAlerts_QuickList_ProjectRoom
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
        //Create Mailinator User
        new actions.Mailinator.CreateMailinatorUser().run("Email":/brightC132508no_room_no_sub/.toString(),"First Name":/brightC132508/.toString(),"Last Name":/no_room_no_sub/.toString(),"Finally Login as What User":/bi.adminuser1@brightidea.com/.toString())
        //Create Mailinator User
        new actions.Mailinator.CreateMailinatorUser().run("Email":/brightC132508room_no_sub/.toString(),"First Name":/brightC132508/.toString(),"Last Name":/room_no_sub/.toString(),"Finally Login as What User":/bi.adminuser1@brightidea.com/.toString())
        //Create Mailinator User
        new actions.Mailinator.CreateMailinatorUser().run("Email":/brightC132508room_with_sub/.toString(),"First Name":/brightC132508/.toString(),"Last Name":/room_with_sub/.toString(),"Finally Login as What User":/bi.adminuser1@brightidea.com/.toString())
        //Create Mailinator User
        new actions.Mailinator.CreateMailinatorUser().run("Email":/brightC132508room_not_reg/.toString(),"First Name":/brightC132508/.toString(),"Last Name":/room_not_reg/.toString(),"Finally Login as What User":/bi.adminuser1@brightidea.com/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Apply Filter on Apps Pillar 2.0
        new actions.AppsPillar.ApplyFilterAppsPillar20().run("Filter Option":/Programs/.toString())
        //Return Todays or Other Date in the Requested Format
        variables."today" = new actions.Utils.ReturnTodaysDateintheRequestedFormat().run("Format":/MM\/dd\/yyyy/.toString())
        //Return Current Time
        variables."now" = new actions.Utils.ReturnCurrentTime().run("Format":/h:mm a/.toString())
        //Add Subtract From Date
        variables."end" = new actions.Utils.AddSubstractFromDate().run("Date":/today/.toString(),"Add or Subtract":/Add/.toString(),"Number":/1/.toString(),"Units":/Years/.toString())
        //Create Pipeline with Scheduler V3
        new actions.WebstormCreation.CreatePipelineWithSchedulerV3().run("App Name (optional)":/Hackathon/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Title":/Hack/.toString(),"Description":/Hack Event description/.toString(),"Action on Topic Page":/Continue/.toString(),"Action on Design Page":/Continue/.toString(),"General Access":/ALL,brightC132508no_room_no_sub@mailinator.com,brightC132508room_no_sub@mailinator.com,brightC132508room_with_sub@mailinator.com,brightC132508room_not_reg@mailinator.com/.toString(),"General Access Add or Remove":/Remove,Add,Add,Add,Add/.toString(),"Action on Participants Page":/Continue/.toString(),"Phase 1 Title":/Plan & Setup/.toString(),"Phase 1 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 2 Title":/Incubate/.toString(),"Phase 2 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 3 Title":/Build\/Hack/.toString(),"Phase 3 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 4 Title":/Presentation & Judging/.toString(),"Phase 4 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 5 Title":/Recognize/.toString(),"Phase 5 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 6 Title":/Close Out & Review /.toString(),"Phase 6 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Action on Site Schedule Page":/Create/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Webstorm Setup Site for Security Tab
        new actions.SetupSite.SetWebstormSetupSiteSecurity().run("Allow end-users to invite non-registered participants":true)
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Pipeline Setup/.toString())
        //Set Pipeline Setup Communications Tab
        new actions.PipelineCommunications.SetPipelineCommunicationsTab().run("Select Tab":/Emails/.toString(),"Email":/Joined Event/.toString(),"Email Recipient":/Event Participant/.toString(),"Enable this email alert":false,"Action":/Save/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Home/.toString())
        //Set Registration or Get Started For Hackathon Onboarding
        new actions.WebstormHomepage.HackathonOnboarding.SetRegistrationorGetStartedForHackathonOnboarding().run("Area Accessing The Menu From":/Homepage Header/.toString(),"Onboarding Menu Option":/Registration/.toString())
        //Set Flow B and C on Hackathon Onboarding
        new actions.WebstormHomepage.HackathonOnboarding.SetFlowBandCforHackathonOnboarding().run("Flow Option Title":/I have a team, but we are not sure what to work on./.toString(),"Expertise":/Expertise1,Expertise2/.toString(),"Add or Remove Expertise":/Add,Add/.toString(),"I am available to join teams":true,"Register and add expertise Action":/Next/.toString(),"Team Name":/New ProjectC132508/.toString(),"Name your team Screen Action":/Next/.toString(),"Choose a team image Action":/Next/.toString(),"Find Teammates":/brightC132508room_no_sub@mailinator.com,brightC132508room_with_sub@mailinator.com,brightC132508room_not_reg@mailinator.com/.toString(),"Teammates Add or Remove":/Add,Add,Add/.toString(),"Build your winning team Screen Action":/Next/.toString(),"Wait for loading to disappear":true)
        try{
            //Verify Email
            new actions.Mailinator.VerifyEmail().run("Email Address":/brightC132508room_no_sub/.toString(),"Subject":/You have been invited to collaborate on New ProjectC132508 - Project Room/.toString(),"Email Should Be Received":true)
        }
       catch(all){}catch(Error err){}
        try{
            //Verify Email
            new actions.Mailinator.VerifyEmail().run("Email Address":/brightC132508room_with_sub/.toString(),"Subject":/You have been invited to collaborate on New ProjectC132508 - Project Room/.toString(),"Email Should Be Received":true)
        }
       catch(all){}catch(Error err){}
        try{
            //Verify Email
            new actions.Mailinator.VerifyEmail().run("Email Address":/brightC132508room_not_reg/.toString(),"Subject":/You have been invited to collaborate on New ProjectC132508 - Project Room/.toString(),"Email Should Be Received":true)
        }
       catch(all){}catch(Error err){}
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Hack App Post Idea
        new actions.PostIdea.SetHackAppPostIdea().run("Title":/submission/.toString(),"Submitter":/Team/.toString(),"Submitter Team User":/brightC132508room_with_sub@mailinator.com/.toString(),"Submitter Team User Add or Remove":/Add/.toString(),"Description":/test description/.toString(),"Action":/Submit Idea/.toString(),"Category":/Theme 1/.toString())
        //Verify Email
        new actions.Mailinator.VerifyEmail().run("Email Address":/brightC132508room_with_sub/.toString(),"Subject":/Hack: Project Submission Confirmation/.toString(),"Email Should Be Received":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/brightC132508no_room_no_sub@mailinator.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Home/.toString())
        //Set Registration or Get Started For Hackathon Onboarding
        new actions.WebstormHomepage.HackathonOnboarding.SetRegistrationorGetStartedForHackathonOnboarding().run("Area Accessing The Menu From":/Homepage Header/.toString(),"Onboarding Menu Option":/Registration/.toString())
        //Set Flow D and E on Hackathon Onboarding
        new actions.WebstormHomepage.HackathonOnboarding.SetFlowDandEonHackathonOnboarding().run("Flow Option Title":/I need to find a team or project to work on./.toString(),"Action on Get Started Screen":/Next/.toString(),"Register and add expertise Action":/Next/.toString(),"Choose the best option for you":/I want to see who is participating/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/brightC132508room_not_reg@mailinator.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Participants Page/.toString())
        //Participants Page - Set Participant Card
        new actions.WebstormHomepage.HackSetParticipantsCardonParticipantsPage().run("Username":/brightC132508 room_not_reg/.toString(),"Leave Event":true)
        //Set Join/Leave Event Modal - Hack App
        new actions.WebstormHomepage.SetJoinEventHackApp().run("Action on Update or Leave Event":/Leave Event/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Command Center/.toString())
        //Set Right Click Menu on Pipeline in NGA
        new actions.PipelineSidebar.SetRightClickMenuonPipelineinNGA().run("Pipeline":/Hack/.toString(),"Option":/Setup/.toString(),"Setup Tab Option":/Email Alerts/.toString())
        //Create Email Alert in Pipeline Setup
        new actions.PipelineSetup.CreateNewsletterinPipelineSetup().run("Create Email Alert":true,"Enter Subject":/Project Room Members No Submissions/.toString(),"Add Quick List":/Project room members without submissions/.toString(),"Email Body":/Project Room Members No Submissions/.toString())
        //Create Email Alert in Pipeline Setup
        new actions.PipelineSetup.CreateNewsletterinPipelineSetup().run("Email Body":/Project Room Members No Submissions/.toString(),"Action":/Send Now/.toString())
        //Verify Email
        new actions.Mailinator.VerifyEmail().run("Email Address":/brightC132508no_room_no_sub/.toString(),"Subject":/Project Room Members No Submissions/.toString(),"Email Should Be Received":false)
        //Verify Email
        new actions.Mailinator.VerifyEmail().run("Email Address":/brightC132508room_no_sub/.toString(),"Subject":/Project Room Members No Submissions/.toString(),"Email Should Be Received":true)
        //Verify Email
        new actions.Mailinator.VerifyEmail().run("Email Address":/brightC132508room_with_sub/.toString(),"Subject":/Project Room Members No Submissions/.toString(),"Email Should Be Received":false)
        //Verify Email
        new actions.Mailinator.VerifyEmail().run("Email Address":/brightC132508room_not_reg/.toString(),"Subject":/Project Room Members No Submissions/.toString(),"Email Should Be Received":true)
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