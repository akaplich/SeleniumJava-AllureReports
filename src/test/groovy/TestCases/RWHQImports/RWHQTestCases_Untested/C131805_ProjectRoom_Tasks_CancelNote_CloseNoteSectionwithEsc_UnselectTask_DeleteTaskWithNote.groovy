import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131805 - Project Room > Tasks - Cancel Note, Close Note Section with Esc, Unselect Task, Delete Task With Note
class C131805_ProjectRoom_Tasks_CancelNote_CloseNoteSectionwithEsc_UnselectTask_DeleteTaskWithNote
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
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString())
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
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/task1/.toString(),"Row Number":/1/.toString(),"Assignee":/Pipeline Admin/.toString(),"Status":/In Progress/.toString(),"Due Date":/11-24-2023/.toString(),"Mark Complete":true)
        //Project Room - Set Task Note Section
        new actions.ProjectRoom.ProjectRoomSetTaskNoteSection().run("Task":/task1/.toString(),"Open":true,"What link text should say? (optional)":/Add Note.../.toString())
        //Project Room - Add Task Note
        new actions.ProjectRoom.ProjectRoomAddTaskNote().run("Note":/system admin note/.toString(),"Action":/Post Note/.toString())
        //Project Room - Add Task Note
        new actions.ProjectRoom.ProjectRoomAddTaskNote().run("Note":/should not show/.toString(),"Action":/Cancel/.toString())
        //Compare Images
        new actions.selenium.CompareImages().run("Element ID (optional)":/\/\/*[@class='f-note-container']/.toString(),"Expected Image File":/C131805_1_expected.png/.toString(),"Actual Image Name":/C131805_1_actual.png/.toString(),"Temporary Pause Verification; Email Screenshot to":"")
        //Project Room - Add Task Note
        new actions.ProjectRoom.ProjectRoomAddTaskNote().run("Note":/still show after close/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/1/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Escape/.toString())
        //Project Room - Set Task Note Section
        new actions.ProjectRoom.ProjectRoomSetTaskNoteSection().run("Task":/task1/.toString(),"Open":true,"What link text should say? (optional)":/1/.toString())
        //Compare Images
        new actions.selenium.CompareImages().run("Element ID (optional)":/\/\/*[@class='f-note-container']/.toString(),"Expected Image File":/C131805_3_expected.png/.toString(),"Actual Image Name":/C131805_2_actual.png/.toString(),"Temporary Pause Verification; Email Screenshot to":"")
        try{
            //Project Room - Add Task Note
            new actions.ProjectRoom.ProjectRoomAddTaskNote().run("Action":/Post Note/.toString())
        }
       catch(all){}catch(Error err){}
        //Project Room - Verify Task Note
        new actions.ProjectRoom.ProjectRoomVerifyTaskNote().run("Note":/still show after close/.toString(),"Author":/System Admin/.toString(),"Number of Matches":/0/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Escape/.toString())
        //Project Room - Set Task Note Section
        new actions.ProjectRoom.ProjectRoomSetTaskNoteSection().run("Task":/task1/.toString(),"Open":true,"What link text should say? (optional)":/1/.toString())
        //Project Room - Set Task Note Section
        new actions.ProjectRoom.ProjectRoomSetTaskNoteSection().run("Close":true)
        //Select All or Multiple Tasks in Project Room
        new actions.ProjectRoom.SelectAllorMultipleTasksinProjectRoom().run("Tasks to Select":/task1/.toString(),"Select the Checbox":/TRUE/.toString())
        //Set Actions Dropdown in Tasks Tab in Project Room
        new actions.ProjectRoom.SetActionsDropdowninTasksTab().run("Action Option":/Delete.../.toString(),"Delete Action":/Delete/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/task1/.toString(),"Assignee":"","Number of Matches":/0/.toString())
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
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C131805_1_actual.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C131805_2_actual.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/difference.png/.toString())
        }
       catch(all){}catch(Error err){}
    }
}