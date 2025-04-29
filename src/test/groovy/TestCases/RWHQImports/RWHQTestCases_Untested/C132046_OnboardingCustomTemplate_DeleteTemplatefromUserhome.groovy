import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C132046 - Onboarding Custom Template - Delete Template from Userhome
class C132046_OnboardingCustomTemplate_DeleteTemplatefromUserhome
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
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Project Room - Create Project Room
        new actions.ProjectRoom.ProjectRoomCreateProjectRoom().run([:])
        //Set and Verify Project Room Title
        new actions.ProjectRoom.SetProjectRoomTitle().run("Title":/Testing project room/.toString(),"Action":/Submit/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Apply Filter on Apps Pillar 2.0
        new actions.AppsPillar.ApplyFilterAppsPillar20().run("Filter Option":/Programs/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Hackathon/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Hack/.toString(),"Description":/Hack Event description/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Disable Scheduler
        new actions.SetupScheduler.SetDisableScheduler().run("Status":/Active/.toString(),"Enable Submission":true,"Action":/Disable Schedule/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Wait for Page to Load":true,"Title":/Idea1/.toString(),"Description":/desc/.toString(),"Category":/Theme 1/.toString(),"Action":/Submit Idea/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Idea1/.toString())
        //Set Add Another Project Room in View Idea 3
        new actions.ViewIdea30.SetAddAnotherProjectRoominViewIdea3().run([:])
        //Send to Project Room
        new actions.PipelineStepsView.SendToProjectRoom().run("From the Actions Menu":false,"Existing or New":/Existing Project Room/.toString(),"Title":/Testing project room/.toString(),"Action":/Submit/.toString(),"Wait":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Pipeline Setup/.toString())
        //Set Project Room Templates for Stage Gate or Onboarding
        new actions.PipelineSetup.SetProjectRoomTemplates().run("Tab":/Participant Template/.toString(),"Template Name":/Testing project room/.toString(),"Action":/Select Project Room/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Home/.toString())
        //Set Registration or Get Started For Hackathon Onboarding
        new actions.WebstormHomepage.HackathonOnboarding.SetRegistrationorGetStartedForHackathonOnboarding().run("Area Accessing The Menu From":/Homepage Header/.toString(),"Onboarding Menu Option":/Get Started/.toString())
        //Set Flow B and C on Hackathon Onboarding
        new actions.WebstormHomepage.HackathonOnboarding.SetFlowBandCforHackathonOnboarding().run("Flow Option Title":/I have a team, but we are not sure what to work on./.toString(),"Name your team Screen Action":/Next/.toString(),"Choose a team image Action":/Next/.toString(),"Find Teammates":/Moderator/.toString(),"Teammates Add or Remove":/Add/.toString(),"Build your winning team Screen Action":/Next/.toString(),"Wait for loading to disappear":true)
        //Verify and Set Your Project Room is Ready Modal
        new actions.WebstormHomepage.HackathonOnboarding.VerifyandSetYourProjectRoomisReadyModal().run("Verify the Text":/TRUE/.toString(),"Action on the Modal":/Let's Go!/.toString())
        //Verify Folder Or Room Page In Project Room in Root Folder
        new actions.ProjectRoom.VerifyFolderOrRoomPageInProjectRoom().run("Placement Number of Child Page or Folder":/1/.toString(),"Child Page or Folder":/Tasks/.toString(),"Room Icon":/✅/.toString(),"Number of Matches":/1/.toString())
        //Verify Folder Or Room Page In Project Room in Root Folder
        new actions.ProjectRoom.VerifyFolderOrRoomPageInProjectRoom().run("Placement Number of Child Page or Folder":/2/.toString(),"Child Page or Folder":/Idea1/.toString(),"Room Icon":/💡/.toString(),"Number of Matches":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Verify and Access Project Room Card in Userhome
        new actions.ProjectRoom.VerifyProjectRoomCard().run("Title":/Hackathon Project Room/.toString(),"Updated By":/System Admin/.toString(),"Member count":/2/.toString(),"Total Objects":/2/.toString(),"Total Tasks":/0/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify and Access Project Room Card in Userhome
        new actions.ProjectRoom.VerifyProjectRoomCard().run("Title":/Testing project room/.toString(),"Updated By":/System Admin/.toString(),"Member count":/1/.toString(),"Total Objects":/2/.toString(),"Total Tasks":/0/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Set Action Menu on Project Room Card
        new actions.ProjectRoom.SetActionMenuonProjectRoomCard().run("Project Room Title":/Testing project room/.toString(),"Option":/Delete.../.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Are you sure you want to delete this Project Room, which is being used as template in a Hackathon? If deleted, your users will receive the default template./.toString(),"Should Exist":true)
        //Set Action Menu on Project Room Card
        new actions.ProjectRoom.SetActionMenuonProjectRoomCard().run("Delete Action":/Delete/.toString())
        //Verify and Access Project Room Card in Userhome
        new actions.ProjectRoom.VerifyProjectRoomCard().run("Title":/Testing project room/.toString(),"Updated By":/System Admin/.toString(),"Member count":/1/.toString(),"Total Objects":/2/.toString(),"Number of Matches":/0/.toString())
        //Verify and Access Project Room Card in Userhome
        new actions.ProjectRoom.VerifyProjectRoomCard().run("Title":/Hackathon Project Room/.toString(),"Updated By":/System Admin/.toString(),"Member count":/2/.toString(),"Total Objects":/2/.toString(),"Total Tasks":/0/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString(),"Access Project Room":true)
        //Verify Folder Or Room Page In Project Room in Root Folder
        new actions.ProjectRoom.VerifyFolderOrRoomPageInProjectRoom().run("Placement Number of Child Page or Folder":/1/.toString(),"Child Page or Folder":/Tasks/.toString(),"Room Icon":/✅/.toString(),"Number of Matches":/1/.toString())
        //Verify Folder Or Room Page In Project Room in Root Folder
        new actions.ProjectRoom.VerifyFolderOrRoomPageInProjectRoom().run("Placement Number of Child Page or Folder":/2/.toString(),"Child Page or Folder":/Idea1/.toString(),"Room Icon":/💡/.toString(),"Number of Matches":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Home/.toString())
        //Set Registration or Get Started For Hackathon Onboarding
        new actions.WebstormHomepage.HackathonOnboarding.SetRegistrationorGetStartedForHackathonOnboarding().run("Area Accessing The Menu From":/Homepage Header/.toString(),"Onboarding Menu Option":/Get Started/.toString())
        //Set Flow B and C on Hackathon Onboarding
        new actions.WebstormHomepage.HackathonOnboarding.SetFlowBandCforHackathonOnboarding().run("Flow Option Title":/I have a team, but we are not sure what to work on./.toString(),"Team Name":/Testing/.toString(),"Name your team Screen Action":/Next/.toString(),"Choose a team image Action":/Next/.toString(),"Find Teammates":/Moderator/.toString(),"Teammates Add or Remove":/Add/.toString(),"Build your winning team Screen Action":/Next/.toString(),"Wait for loading to disappear":true)
        //Verify and Set Your Project Room is Ready Modal
        new actions.WebstormHomepage.HackathonOnboarding.VerifyandSetYourProjectRoomisReadyModal().run("Verify the Text":/TRUE/.toString(),"Action on the Modal":/Let's Go!/.toString())
        //Verify Folder Or Room Page In Project Room in Root Folder
        new actions.ProjectRoom.VerifyFolderOrRoomPageInProjectRoom().run("Placement Number of Child Page or Folder":/4/.toString(),"Child Page or Folder":/Team To Dos/.toString(),"Room Icon":/✅/.toString(),"Number of Matches":/1/.toString())
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Room Item":/Team To Dos/.toString(),"Room Page Row Number":/4/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/Find and build team/.toString(),"Assignee":/Select Assignee.../.toString(),"Status":/Select Status.../.toString(),"Due Date":/Select Date.../.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/Problem definition/.toString(),"Assignee":/Select Assignee.../.toString(),"Status":/Select Status.../.toString(),"Due Date":/Select Date.../.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/Build prototype/.toString(),"Assignee":/Select Assignee.../.toString(),"Status":/Select Status.../.toString(),"Due Date":/Select Date.../.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/Prepare final submission/.toString(),"Assignee":/Select Assignee.../.toString(),"Status":/Select Status.../.toString(),"Due Date":/Select Date.../.toString(),"Placement Number":/4/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/Work through final presentation/.toString(),"Assignee":/Select Assignee.../.toString(),"Status":/Select Status.../.toString(),"Due Date":/Select Date.../.toString(),"Placement Number":/5/.toString(),"Number of Matches":/1/.toString())
        //Verify Folder Or Room Page In Project Room in Root Folder
        new actions.ProjectRoom.VerifyFolderOrRoomPageInProjectRoom().run("Placement Number of Child Page or Folder":/5/.toString(),"Child Page or Folder":/Business Impact/.toString(),"Room Icon":/💰/.toString(),"Number of Matches":/1/.toString())
        //Verify Folder Or Room Page In Project Room in Root Folder
        new actions.ProjectRoom.VerifyFolderOrRoomPageInProjectRoom().run("Placement Number of Parent Page or Folder":/3/.toString(),"Placement Number of Child Page or Folder":/1/.toString(),"Parent Folder Name":/Project Development/.toString(),"Child Page or Folder":/Brainstorm Concepts/.toString(),"Room Icon":/Whiteboard/.toString(),"Number of Matches":/1/.toString())
        //Verify Folder Or Room Page In Project Room in Root Folder
        new actions.ProjectRoom.VerifyFolderOrRoomPageInProjectRoom().run("Placement Number of Parent Page or Folder":/3/.toString(),"Placement Number of Child Page or Folder":/2/.toString(),"Parent Folder Name":/Project Development/.toString(),"Child Page or Folder":/Empathy Mapping Exercise/.toString(),"Room Icon":/Whiteboard/.toString(),"Number of Matches":/1/.toString())
        //Verify Folder Or Room Page In Project Room in Root Folder
        new actions.ProjectRoom.VerifyFolderOrRoomPageInProjectRoom().run("Placement Number of Parent Page or Folder":/3/.toString(),"Placement Number of Child Page or Folder":/3/.toString(),"Parent Folder Name":/Project Development/.toString(),"Child Page or Folder":/Business Model Canvas/.toString(),"Room Icon":/Whiteboard/.toString(),"Number of Matches":/1/.toString())
        //Verify Folder Or Room Page In Project Room in Root Folder
        new actions.ProjectRoom.VerifyFolderOrRoomPageInProjectRoom().run("Placement Number of Parent Page or Folder":/3/.toString(),"Placement Number of Child Page or Folder":/4/.toString(),"Parent Folder Name":/Project Development/.toString(),"Child Page or Folder":/Strategic Memo/.toString(),"Room Icon":/Memo/.toString(),"Memo Type for Room Icon":/BI/.toString(),"Number of Matches":/1/.toString())
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Room Item":/Business Model Canvas/.toString())
        //Verify Smart Matrix & Other Elements Exists On Whiteboard
        new actions.Whiteboards.VerifySmartMatrixExists().run("Element (skip if verifying text)":/Sticky Note/.toString(),"Should Exist":true)
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Room Item":/Strategic Memo/.toString())
        //Collab Editor - Verify Text
        new actions.Memo.CollabEditorVerifyText().run("Expected Text":/Executive Summary or Quick Take/.toString(),"Align":/left/.toString(),"Text Font":/Lato/.toString(),"Font Size":/16/.toString(),"Font Color":/rgb(237,125,49)/.toString(),"Should Text Exist":true)
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