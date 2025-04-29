import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C131985 - Send to PR from VI3 - Opening Private and Shared PR
class C131985_SendtoPRfromVI3_OpeningPrivateandSharedPR
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
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Project Room - Create Project Room
        new actions.ProjectRoom.ProjectRoomCreateProjectRoom().run([:])
        //Set and Verify Project Room Title
        new actions.ProjectRoom.SetProjectRoomTitle().run("Title":/Testing project room2/.toString(),"Action":/Submit/.toString())
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Top Link":/Project Room Settings/.toString())
        //Set Tab in Room Settings in Project Room
        new actions.ProjectRoom.SetTabinRoomSettingsinProjectRoom().run("Tab":/Members/.toString())
        //Set Members in Project Room
        new actions.ProjectRoom.SetMembersinProjectRoom().run("Member":/End User,Pipeline Admin/.toString(),"Member Add or Remove":/Add,Add/.toString())
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
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Wait for Page to Load":true,"Title":/Idea1/.toString(),"Description":/desc/.toString(),"Category":/Theme 1/.toString(),"Action":/Submit Idea/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Idea1/.toString())
        //Set Add Another Project Room in View Idea 3
        new actions.ViewIdea30.SetAddAnotherProjectRoominViewIdea3().run([:])
        //Send to Project Room
        new actions.PipelineStepsView.SendToProjectRoom().run("From the Actions Menu":false,"Existing or New":/Existing Project Room/.toString(),"Title":/Testing project room/.toString(),"Action":/Submit/.toString(),"Wait":false)
        //Verify Toast Message in Tasks In Project Room
        new actions.ProjectRoom.VerifyToastMessageinTasksInProjectRoom().run("Message":/Your Project has been added to your project room. Testing project room/.toString(),"Click on the link":false)
        //Set and Verify Project Room In View Idea 3
        new actions.ViewIdea30.SetandVerifyProjectRoomInViewIdea3().run("Project Room Title":/Testing project room/.toString(),"Project Room Icon Color":/rgb(52, 152, 219)/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Set Add Another Project Room in View Idea 3
        new actions.ViewIdea30.SetAddAnotherProjectRoominViewIdea3().run([:])
        //Send to Project Room
        new actions.PipelineStepsView.SendToProjectRoom().run("From the Actions Menu":false,"Existing or New":/Existing Project Room/.toString(),"Title":/Testing project room2/.toString(),"Action":/Submit/.toString(),"Wait":false)
        //Verify Toast Message in Tasks In Project Room
        new actions.ProjectRoom.VerifyToastMessageinTasksInProjectRoom().run("Message":/Your Project has been added to your project room. Testing project room2/.toString(),"Click on the link":false)
        //Set and Verify Project Room In View Idea 3
        new actions.ViewIdea30.SetandVerifyProjectRoomInViewIdea3().run("Project Room Title":/Testing project room2/.toString(),"Project Room Icon Color":/rgb(52, 152, 219)/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Close Idea Modal":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Idea1/.toString())
        //Set and Verify Project Room In View Idea 3
        new actions.ViewIdea30.SetandVerifyProjectRoomInViewIdea3().run("Project Room Title":/Testing project room/.toString(),"Project Room Icon Color":/rgb(52, 152, 219)/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Set and Verify Project Room In View Idea 3
        new actions.ViewIdea30.SetandVerifyProjectRoomInViewIdea3().run("Project Room Title":/Testing project room2/.toString(),"Project Room Icon Color":/rgb(52, 152, 219)/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString(),"Access the Project Room":true)
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/1/.toString())
        //Verify and Set Project Room Updates
        new actions.ProjectRoom.VerifyandSetProjectRoomUpdates().run("All Project Room Members":/System Admin,End User,Pipeline Admin/.toString(),"Should Project Room Member be Displayed":/True,True,True/.toString(),"Project Room Owner Name":/System Admin/.toString())
        //Verify Folder Or Room Page In Project Room in Root Folder
        new actions.ProjectRoom.VerifyFolderOrRoomPageInProjectRoom().run("Placement Number of Child Page or Folder":/2/.toString(),"Child Page or Folder":/Idea1/.toString(),"Memo Type for Room Icon":/💡/.toString(),"Number of Matches":/1/.toString())
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Room Item":/Idea1/.toString())
        //Verify Idea on View Idea 30
        new actions.ViewIdea30.VerifyIdeaonViewIdea3().run("Template":/Medium Header/.toString(),"View As":/End User/.toString(),"Idea Name":/Idea1/.toString())
        //Set and Verify Project Room In View Idea 3
        new actions.ViewIdea30.SetandVerifyProjectRoomInViewIdea3().run("Project Room Title":/Testing project room2/.toString(),"Project Room Icon Color":/rgb(52, 152, 219)/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Set and Verify Project Room In View Idea 3
        new actions.ViewIdea30.SetandVerifyProjectRoomInViewIdea3().run("Project Room Title":/Testing project room/.toString(),"Project Room Icon Color":/rgb(52, 152, 219)/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString(),"Access the Project Room":true)
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/2/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Either this Project Room no longer exists or you don't have permission to view it. Ask the owner to verify the link and update the permissions./.toString(),"Should Exist":true)
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