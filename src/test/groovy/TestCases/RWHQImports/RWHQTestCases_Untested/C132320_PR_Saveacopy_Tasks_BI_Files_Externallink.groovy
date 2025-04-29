import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C132320 - PR > Save a copy > Tasks,BI,Files,External link
class C132320_PR_Saveacopy_Tasks_BI_Files_Externallink
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
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Top Link":/Project Room Settings/.toString())
        //Set Tab in Room Settings in Project Room
        new actions.ProjectRoom.SetTabinRoomSettingsinProjectRoom().run("Tab":/Members/.toString())
        //Set Members in Project Room
        new actions.ProjectRoom.SetMembersinProjectRoom().run("Member":/End User,Pipeline Admin/.toString(),"Member Add or Remove":/Add,Add/.toString())
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Room Item":/Tasks/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/task1/.toString(),"Row Number":/1/.toString(),"Assignee":/Pipeline Admin/.toString(),"Status":/In Progress/.toString(),"Due Date":/11-24-2028/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/task2/.toString(),"Row Number":/2/.toString(),"Assignee":/End User/.toString(),"Status":/Complete/.toString(),"Due Date":/11-24-2028/.toString())
        //Project Room - Set Task Note Section
        new actions.ProjectRoom.ProjectRoomSetTaskNoteSection().run("Task":/task1/.toString(),"Open":true,"What link text should say? (optional)":/Add Note.../.toString())
        //Project Room - Add Task Note
        new actions.ProjectRoom.ProjectRoomAddTaskNote().run("Note":/system admin note/.toString(),"Action":/Post Note/.toString())
        //Project Room - Set Task Note Section
        new actions.ProjectRoom.ProjectRoomSetTaskNoteSection().run("Close":true)
        //Project Room - Set Task Note Section
        new actions.ProjectRoom.ProjectRoomSetTaskNoteSection().run("Task":/task1/.toString(),"What link text should say? (optional)":/1/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Files/.toString())
        //Set Edit Menu for Room Pages in Project Room
        new actions.ProjectRoom.SetEditMenuforRoomPagesinProjectRoom().run("Room Page":/Files/.toString(),"Menu Options":/Rename/.toString(),"Placement Number Of Folder or Page":/2/.toString())
        //Set Rename Page in Project Room
        new actions.ProjectRoom.SetRenamePageinProjectRoom().run("New Page Name":/Renamed Files/.toString(),"Action":/Rename Files/.toString())
        //Set Files in Team Workspace
        new actions.ViewIdea.TeamWorkspace.SetFilesinTeamWorkspace().run("Verify in Which Tab (optional)":/Renamed Files/.toString(),"Attachment File":/SamplePDF.pdf/.toString(),"Wait for attachment":true)
        //Verify Files in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyFilesinTeamWorkspace().run("Attachment Name":/SamplePDF.pdf/.toString(),"Attachment Icon":/pdf/.toString(),"Number of Matches":/1/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Business Impact/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Add or Update":/Add/.toString())
        //Set Date Version and Notes for Financial Summary in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetDateandNotesforFinancialSummaryinBusinessImpacttab().run("Date":/05\/09\/2024/.toString())
        //Set Benefits in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetBenefitsinBusinessImpacttab().run("Add or Edit Benefits":/Add,Add,Add,Add/.toString(),"Year":/2024,2025,2024,2025/.toString(),"Current Year":/2024/.toString(),"Benefit Type":/Cost Savings,Cost Savings,Revenue,Revenue/.toString(),"Projected Benefit":/5000,15000,1000,2000/.toString(),"Actual Benefit":/4000,14000,3000,1000/.toString(),"Row Number of the Benefit":/1,1,2,2/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Action":/Save Version/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Link/.toString())
        //Set Add External Link in Project Room
        new actions.ProjectRoom.SetAddExternalLinkinProjectRoom().run("Link Name":/PR link/.toString(),"Link URL":/https:\/\/masteraffiliate.brightideatest.com\/ct\/c_e_login.php?a=OD3334#login/.toString(),"Action":/Submit/.toString())
        //Set Folder or Room Page Icon
        new actions.ProjectRoom.SetFolderorRoomPageIcon().run("Folder or Room Name":/Business Impact/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/pipelineadmin@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Set Filter in Project Room Tab in Userhome
        new actions.ProjectRoom.SetSortinProjectRoomTabinUserhome().run("Tab":/Shared with Me/.toString())
        //Set Action Menu on Project Room Card
        new actions.ProjectRoom.SetActionMenuonProjectRoomCard().run("Project Room Title":/Testing project room/.toString(),"Option":/Save a Copy/.toString())
        //Verify and Access Project Room Card in Userhome
        new actions.ProjectRoom.VerifyProjectRoomCard().run("Title":/Copy of Testing project room/.toString(),"Member count":/1/.toString(),"Total Objects":/4/.toString(),"Total Tasks":/2/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString(),"Access Project Room":true)
        //Verify Page Title
        new actions.selenium.VerifyPageTitle().run("Title":/Copy of Testing project room - Project Room/.toString())
        //Verify Folder Or Room Page In Project Room in Root Folder
        new actions.ProjectRoom.VerifyFolderOrRoomPageInProjectRoom().run("Placement Number of Child Page or Folder":/1/.toString(),"Child Page or Folder":/Tasks/.toString(),"Room Icon":/✅/.toString(),"Number of Matches":/1/.toString())
        //Verify Folder Or Room Page In Project Room in Root Folder
        new actions.ProjectRoom.VerifyFolderOrRoomPageInProjectRoom().run("Placement Number of Child Page or Folder":/2/.toString(),"Child Page or Folder":/Renamed Files/.toString(),"Room Icon":/🗂️/.toString(),"Number of Matches":/1/.toString())
        //Verify Folder Or Room Page In Project Room in Root Folder
        new actions.ProjectRoom.VerifyFolderOrRoomPageInProjectRoom().run("Placement Number of Child Page or Folder":/3/.toString(),"Child Page or Folder":/Business Impact/.toString(),"Room Icon":/😍/.toString(),"Number of Matches":/1/.toString())
        //Verify Folder Or Room Page In Project Room in Root Folder
        new actions.ProjectRoom.VerifyFolderOrRoomPageInProjectRoom().run("Placement Number of Child Page or Folder":/4/.toString(),"Child Page or Folder":/PR link/.toString(),"Room Icon":/🔗/.toString(),"Number of Matches":/1/.toString())
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Room Item":/Renamed Files/.toString())
        //Verify Files in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyFilesinTeamWorkspace().run("Attachment Name":/SamplePDF.pdf/.toString(),"Attachment Icon":/pdf/.toString(),"Number of Matches":/0/.toString())
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Room Item":/Business Impact/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Add Impact/.toString(),"Should Exist":true)
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Room Item":/Tasks/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/task1/.toString(),"Assignee":/Select Assignee.../.toString(),"Status":/Select Status.../.toString(),"Due Date":/Select Date.../.toString(),"Notes Count":/Add Note.../.toString(),"Marked Completed":false,"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/task2/.toString(),"Assignee":/Select Assignee.../.toString(),"Status":/Select Status.../.toString(),"Due Date":/Select Date.../.toString(),"Notes Count":/Add Note.../.toString(),"Marked Completed":false,"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Room Item":/PR link/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/1/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/have an account?/.toString(),"Should Exist":true)
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