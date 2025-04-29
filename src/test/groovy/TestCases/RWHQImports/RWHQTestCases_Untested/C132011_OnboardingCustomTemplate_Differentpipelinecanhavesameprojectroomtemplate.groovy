import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132011 - Onboarding Custom Template - Different pipeline can have same project room template
class C132011_OnboardingCustomTemplate_Differentpipelinecanhavesameprojectroomtemplate
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
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Whiteboards/.toString())
        //Create Whiteboard or Edit Template
        new actions.Whiteboards.CreateWhiteboardFromUserhome().run("Create New or Choose Template":/New Blank Whiteboard/.toString())
        //Set Whiteboard Title
        new actions.Whiteboards.EditTitleOfWhiteboard().run("Title":/WB1/.toString(),"Action":/Submit/.toString())
        //Click on Whiteboard Tool
        new actions.Whiteboards.ClickOnWhiteboardTool().run("Tool Type":/Templates/.toString())
        //Set Add Template on Whiteboard Page
        new actions.Whiteboards.SetAddTemplateWhiteboardPage().run("Template Title":/5 Whys/.toString(),"Action":/Add Template/.toString())
        //Go Back From Whiteboard
        new actions.Whiteboards.GoBackFromWhiteboard().run([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Project Room - Create Project Room
        new actions.ProjectRoom.ProjectRoomCreateProjectRoom().run([:])
        //Set and Verify Project Room Title
        new actions.ProjectRoom.SetProjectRoomTitle().run("Title":/Testing project room/.toString(),"Action":/Submit/.toString())
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Top Link":/Project Room Settings/.toString())
        //Set Tab in Room Settings in Project Room
        new actions.ProjectRoom.SetTabinRoomSettingsinProjectRoom().run("Tab":/Members/.toString())
        //Set Members in Project Room
        new actions.ProjectRoom.SetMembersinProjectRoom().run("Member":/End User,Pipeline Admin/.toString(),"Member Add or Remove":/Add,Add/.toString())
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Room Item":/Tasks/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/task1/.toString(),"Row Number":/1/.toString(),"Assignee":/Pipeline Admin/.toString(),"Status":/In Progress/.toString(),"Due Date":/11-24-2023/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Whiteboard/.toString())
        //Set Add Whiteboard Modal
        new actions.ProjectRoom.SetAddWhiteboardModal().run("Existing or New":/Existing/.toString(),"Title":/WB1/.toString(),"Action":/Submit/.toString())
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
        new actions.WebstormCreation.CreatePipelineWithSchedulerV3().run("App Name (optional)":/Hackathon/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Title":/Hack/.toString(),"Description":/Hack Event description/.toString(),"Moderator Field Title":/Pipeline Moderator/.toString(),"Moderator Field Value":/Moderator/.toString(),"Moderator Field Value Add or Remove":/Add/.toString(),"Phase 1 Title":/Plan & Setup/.toString(),"Phase 1 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 2 Title":/Incubate/.toString(),"Phase 2 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 3 Title":/Build\/Hack/.toString(),"Phase 3 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 4 Title":/Presentation & Judging/.toString(),"Phase 4 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 5 Title":/Recognize/.toString(),"Phase 5 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 6 Title":/Close Out & Review /.toString(),"Phase 6 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Action on Site Schedule Page":/Create/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Apply Filter on Apps Pillar 2.0
        new actions.AppsPillar.ApplyFilterAppsPillar20().run("Filter Option":/Ecosystem/.toString())
        //Create Pipeline with Scheduler V3
        new actions.WebstormCreation.CreatePipelineWithSchedulerV3().run("App Name (optional)":/External Hack/.toString(),"Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Title":/External Hack/.toString(),"Description":/Hack Event description/.toString(),"Early Access":/ALL/.toString(),"Early Access Add or Remove":/Add/.toString(),"Administrator Field Title":/Pipeline Administrators/.toString(),"Administrator Field Value":/Pipeline Admin/.toString(),"Administrator Field Value Add or Remove":/Add/.toString(),"Moderator Field Title":/Pipeline Moderator/.toString(),"Moderator Field Value":/Moderator/.toString(),"Moderator Field Value Add or Remove":/Add/.toString(),"Phase 1 Title":/Plan & Setup/.toString(),"Phase 1 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 2 Title":/Incubate/.toString(),"Phase 2 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 3 Title":/Build\/Hack/.toString(),"Phase 3 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 4 Title":/Presentation & Judging/.toString(),"Phase 4 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 5 Title":/Recognize/.toString(),"Phase 5 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 6 Title":/Close Out & Review /.toString(),"Phase 6 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Action on Site Schedule Page":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Pipeline Setup/.toString())
        //Set Project Room Templates for Stage Gate or Onboarding
        new actions.PipelineSetup.SetProjectRoomTemplates().run("Tab":/Participant Template/.toString(),"Template Name":/Testing project room/.toString(),"Action":/Select Project Room/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/pipelineadmin@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Home/.toString())
        //Set Registration or Get Started For Hackathon Onboarding
        new actions.WebstormHomepage.HackathonOnboarding.SetRegistrationorGetStartedForHackathonOnboarding().run("Area Accessing The Menu From":/Homepage Header/.toString(),"Onboarding Menu Option":/Registration/.toString())
        //Set Flow B and C on Hackathon Onboarding
        new actions.WebstormHomepage.HackathonOnboarding.SetFlowBandCforHackathonOnboarding().run("Flow Option Title":/I have a team, but we are not sure what to work on./.toString(),"Register and add expertise Action":/Next/.toString(),"Name your team Screen Action":/Next/.toString(),"Choose a team image Action":/Next/.toString(),"Find Teammates":/Moderator/.toString(),"Teammates Add or Remove":/Add/.toString(),"Build your winning team Screen Action":/Next/.toString(),"Wait for loading to disappear":true)
        //Verify and Set Your Project Room is Ready Modal
        new actions.WebstormHomepage.HackathonOnboarding.VerifyandSetYourProjectRoomisReadyModal().run("Verify the Text":/TRUE/.toString(),"Action on the Modal":/Let's Go!/.toString())
        //Verify Folder Or Room Page In Project Room in Root Folder
        new actions.ProjectRoom.VerifyFolderOrRoomPageInProjectRoom().run("Placement Number of Child Page or Folder":/1/.toString(),"Child Page or Folder":/Tasks/.toString(),"Room Icon":/✅/.toString(),"Number of Matches":/1/.toString())
        //Verify Folder Or Room Page In Project Room in Root Folder
        new actions.ProjectRoom.VerifyFolderOrRoomPageInProjectRoom().run("Placement Number of Child Page or Folder":/2/.toString(),"Child Page or Folder":/WB1/.toString(),"Room Icon":/Whiteboard/.toString(),"Number of Matches":/1/.toString())
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Room Item":/WB1/.toString())
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/UL[@class='f-canvas-element-list']\/LI\/DIV\/SPAN[starts-with(text(),'4. Why?')]\/..\/..\/..\/..\/..\/../.toString(),"Should Element Exist":true,"Number of Matches":/1/.toString())
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Room Item":/Tasks/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/task1/.toString(),"Assignee":/Select Assignee.../.toString(),"Status":/Select Status.../.toString(),"Due Date":/Select Date.../.toString(),"Marked Completed":false,"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Top Link":/Project Room Settings/.toString())
        //Set Tab in Room Settings in Project Room
        new actions.ProjectRoom.SetTabinRoomSettingsinProjectRoom().run("Tab":/Members/.toString())
        //Verify Project Room Member in Members Tab
        new actions.ProjectRoom.VerifyProjectRoomMemberinMembersTab().run("Member Name":/Pipeline Admin/.toString(),"Member Display Picture":false,"Type of Member":/owner/.toString(),"Number of Matches":/1/.toString())
        //Verify Project Room Member in Members Tab
        new actions.ProjectRoom.VerifyProjectRoomMemberinMembersTab().run("Member Name":/Moderator/.toString(),"Type of Member":/team member/.toString(),"Number of Matches":/1/.toString())
        //Verify Project Room Member in Members Tab
        new actions.ProjectRoom.VerifyProjectRoomMemberinMembersTab().run("Member Name":/System Admin/.toString(),"Type of Member":/team member/.toString(),"Number of Matches":/0/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/External Hack/.toString(),"Area to Navigate to":/Pipeline Setup/.toString())
        //Set Project Room Templates for Stage Gate or Onboarding
        new actions.PipelineSetup.SetProjectRoomTemplates().run("Tab":/Participant Template/.toString(),"Template Name":/Testing project room/.toString(),"Action":/Select Project Room/.toString())
        //Verify Project Room Templates in Pipeline Setup
        new actions.PipelineSetup.VerifyProjectRoomTemplatesinPipelineSetup().run("Template Title":/Testing project room/.toString(),"Created By":/System Admin/.toString(),"Challenges":/Hack, External Hack/.toString(),"Row Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser2@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/External Hack/.toString(),"Area to Navigate to":/Home/.toString())
        //Set Registration or Get Started For Hackathon Onboarding
        new actions.WebstormHomepage.HackathonOnboarding.SetRegistrationorGetStartedForHackathonOnboarding().run("Area Accessing The Menu From":/Homepage Header/.toString(),"Onboarding Menu Option":/Registration/.toString())
        //Set Flow B and C on Hackathon Onboarding
        new actions.WebstormHomepage.HackathonOnboarding.SetFlowBandCforHackathonOnboarding().run("Flow Option Title":/I have a team, but we are not sure what to work on./.toString(),"Register and add expertise Action":/Next/.toString(),"Team Name":/hellooooo/.toString(),"Name your team Screen Action":/Next/.toString(),"Choose a team image Action":/Next/.toString(),"Build your winning team Screen Action":/Next/.toString(),"Wait for loading to disappear":true)
        //Verify and Set Your Project Room is Ready Modal
        new actions.WebstormHomepage.HackathonOnboarding.VerifyandSetYourProjectRoomisReadyModal().run("Verify the Text":/TRUE/.toString(),"Action on the Modal":/Let's Go!/.toString())
        //Verify Folder Or Room Page In Project Room in Root Folder
        new actions.ProjectRoom.VerifyFolderOrRoomPageInProjectRoom().run("Placement Number of Child Page or Folder":/1/.toString(),"Child Page or Folder":/Tasks/.toString(),"Room Icon":/✅/.toString(),"Number of Matches":/1/.toString())
        //Verify Folder Or Room Page In Project Room in Root Folder
        new actions.ProjectRoom.VerifyFolderOrRoomPageInProjectRoom().run("Placement Number of Child Page or Folder":/2/.toString(),"Child Page or Folder":/WB1/.toString(),"Room Icon":/Whiteboard/.toString(),"Number of Matches":/1/.toString())
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Room Item":/WB1/.toString())
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/UL[@class='f-canvas-element-list']\/LI\/DIV\/SPAN[starts-with(text(),'4. Why?')]\/..\/..\/..\/..\/..\/../.toString(),"Should Element Exist":true,"Number of Matches":/1/.toString())
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Room Item":/Tasks/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/task1/.toString(),"Assignee":/Select Assignee.../.toString(),"Status":/Select Status.../.toString(),"Due Date":/Select Date.../.toString(),"Marked Completed":false,"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Top Link":/Project Room Settings/.toString())
        //Set Tab in Room Settings in Project Room
        new actions.ProjectRoom.SetTabinRoomSettingsinProjectRoom().run("Tab":/Members/.toString())
        //Verify Project Room Member in Members Tab
        new actions.ProjectRoom.VerifyProjectRoomMemberinMembersTab().run("Member Name":/End User 2/.toString(),"Member Display Picture":false,"Type of Member":/owner/.toString(),"Number of Matches":/1/.toString())
        //Verify Project Room Member in Members Tab
        new actions.ProjectRoom.VerifyProjectRoomMemberinMembersTab().run("Member Name":/Moderator/.toString(),"Type of Member":/team member/.toString(),"Number of Matches":/0/.toString())
        //Verify Project Room Member in Members Tab
        new actions.ProjectRoom.VerifyProjectRoomMemberinMembersTab().run("Member Name":/System Admin/.toString(),"Type of Member":/team member/.toString(),"Number of Matches":/0/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Verify and Access Project Room Card in Userhome
        new actions.ProjectRoom.VerifyProjectRoomCard().run("Title":/hellooooo - Project Room/.toString(),"Updated By":/End User 2/.toString(),"Member count":/1/.toString(),"Total Objects":/2/.toString(),"Total Tasks":/1/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
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