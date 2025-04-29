import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C131796 - Project Room > Tasks - Add, Edit, Delete Note, Note Counter
class C131796_ProjectRoom_Tasks_Add_Edit_DeleteNote_NoteCounter
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
        new actions.ProjectRoom.ProjectRoomAddTaskNote().run("Note":/this is a note/.toString(),"Action":/Post Note/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/2/.toString())
        //Project Room - Add Task Note
        new actions.ProjectRoom.ProjectRoomAddTaskNote().run("Note":/this is another/.toString(),"Action":/Post Note/.toString())
        //Project Room - Verify Task Note
        new actions.ProjectRoom.ProjectRoomVerifyTaskNote().run("Note":/this is another/.toString(),"Author":/System Admin/.toString(),"Number of Matches":/1/.toString())
        //Project Room - Verify Task Note
        new actions.ProjectRoom.ProjectRoomVerifyTaskNote().run("Note":/this is a note/.toString(),"Author":/System Admin/.toString(),"Number of Matches":/1/.toString())
        //Project Room - Edit Task Note
        new actions.ProjectRoom.ProjectRoomEditTaskNote().run("Note":/this is another/.toString(),"Action":/Edit/.toString(),"New Note":/this is a new note/.toString(),"Action on Edit":/Save/.toString())
        //Project Room - Set Task Note Section
        new actions.ProjectRoom.ProjectRoomSetTaskNoteSection().run("Close":true)
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Project Room - Set Task Note Section
        new actions.ProjectRoom.ProjectRoomSetTaskNoteSection().run("Task":/task1/.toString(),"Open":true,"What link text should say? (optional)":/2/.toString())
        //Project Room - Verify Task Note
        new actions.ProjectRoom.ProjectRoomVerifyTaskNote().run("Note":/this is a new note/.toString(),"Author":/System Admin/.toString(),"Number of Matches":/1/.toString())
        //Project Room - Edit Task Note
        new actions.ProjectRoom.ProjectRoomEditTaskNote().run("Note":/this is a new note/.toString(),"Action":/Delete/.toString(),"Are you sure you want to delete the note?":/Delete/.toString())
        //Project Room - Set Task Note Section
        new actions.ProjectRoom.ProjectRoomSetTaskNoteSection().run("Close":true)
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Project Room - Set Task Note Section
        new actions.ProjectRoom.ProjectRoomSetTaskNoteSection().run("Task":/task1/.toString(),"Open":true,"What link text should say? (optional)":/1/.toString())
        //Project Room - Verify Task Note
        new actions.ProjectRoom.ProjectRoomVerifyTaskNote().run("Note":/this is a note/.toString(),"Author":/System Admin/.toString(),"Number of Matches":/1/.toString())
        //Project Room - Verify Task Note
        new actions.ProjectRoom.ProjectRoomVerifyTaskNote().run("Note":/this is a new note/.toString(),"Author":/System Admin/.toString(),"Number of Matches":/0/.toString())
        //Project Room - Edit Task Note
        new actions.ProjectRoom.ProjectRoomEditTaskNote().run("Note":/this is a note/.toString(),"Action":/Delete/.toString(),"Are you sure you want to delete the note?":/Delete/.toString())
        //Project Room - Set Task Note Section
        new actions.ProjectRoom.ProjectRoomSetTaskNoteSection().run("Close":true)
        //Project Room - Set Task Note Section
        new actions.ProjectRoom.ProjectRoomSetTaskNoteSection().run("Task":/task1/.toString(),"Open":true,"What link text should say? (optional)":/Add Note.../.toString())
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