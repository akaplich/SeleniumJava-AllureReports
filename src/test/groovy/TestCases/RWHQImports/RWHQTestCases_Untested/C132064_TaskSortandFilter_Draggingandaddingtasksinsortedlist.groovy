import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132064 - Task Sort and Filter - Dragging and adding tasks in sorted list
class C132064_TaskSortandFilter_Draggingandaddingtasksinsortedlist
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Brightidea Administrator License Type Purchased Count":/1/.toString())
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
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/ZTask/.toString(),"Row Number":/1/.toString(),"Assignee":/System Admin/.toString(),"Status":/In Progress/.toString(),"Due Date":/11-24-2024/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/1task/.toString(),"Row Number":/2/.toString(),"Assignee":/Pipeline Admin/.toString(),"Status":/Blocked/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/1TASK/.toString(),"Row Number":/3/.toString(),"Assignee":/End User/.toString(),"Status":/Paused/.toString(),"Due Date":/06-07-2024/.toString())
        //Set Project Room Tasks Sort
        new actions.ProjectRoom.SetProjectRoomTasksSort().run("Column To Sort":/Tasks/.toString())
        try{
            //Drag and Drop Tasks in Project Room
            new actions.ProjectRoom.DragandDropTasksinProjectRoom().run("Task":/ZTask/.toString(),"New Row Number":/1/.toString(),"Last Row":false)
        }
       catch(all){}catch(Error err){}
        //Set Drop and Drag Limitation Modal
        new actions.ProjectRoom.SetDropandDragLimitationModal().run("Action":/Cancel/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/1TASK/.toString(),"Assignee":/End User/.toString(),"Status":/Paused/.toString(),"Due Date":/06\/07\/2024/.toString(),"Marked Completed":false,"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/1task/.toString(),"Assignee":/Pipeline Admin/.toString(),"Status":/Blocked/.toString(),"Due Date":/Select Date.../.toString(),"Marked Completed":false,"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/ZTask/.toString(),"Assignee":/System Admin/.toString(),"Status":/In Progress/.toString(),"Due Date":/11\/24\/2024/.toString(),"Marked Completed":false,"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Drag and Drop Tasks in Project Room
        new actions.ProjectRoom.DragandDropTasksinProjectRoom().run("Task":/1TASK/.toString(),"New Row Number":/2/.toString(),"Last Row":false)
        //Set Drop and Drag Limitation Modal
        new actions.ProjectRoom.SetDropandDragLimitationModal().run("Action":/Remove Sorting/.toString())
        //Verify Sort ToolTip on Tasks in Project Room
        new actions.ProjectRoom.VerifySortToolTiponTasksinProjectRoom().run("Column To Hover":/Tasks/.toString(),"ToolTip":/Sort/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/1TASK/.toString(),"Assignee":/End User/.toString(),"Status":/Paused/.toString(),"Due Date":/06\/07\/2024/.toString(),"Marked Completed":false,"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/1task/.toString(),"Assignee":/Pipeline Admin/.toString(),"Status":/Blocked/.toString(),"Due Date":/Select Date.../.toString(),"Marked Completed":false,"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/ZTask/.toString(),"Assignee":/System Admin/.toString(),"Status":/In Progress/.toString(),"Due Date":/11\/24\/2024/.toString(),"Marked Completed":false,"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Drag and Drop Tasks in Project Room
        new actions.ProjectRoom.DragandDropTasksinProjectRoom().run("Task":/1task/.toString(),"New Row Number":/1/.toString(),"Last Row":false)
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/1TASK/.toString(),"Assignee":/End User/.toString(),"Status":/Paused/.toString(),"Due Date":/06\/07\/2024/.toString(),"Marked Completed":false,"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/1task/.toString(),"Assignee":/Pipeline Admin/.toString(),"Status":/Blocked/.toString(),"Due Date":/Select Date.../.toString(),"Marked Completed":false,"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/ZTask/.toString(),"Assignee":/System Admin/.toString(),"Status":/In Progress/.toString(),"Due Date":/11\/24\/2024/.toString(),"Marked Completed":false,"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Set Project Room Tasks Sort
        new actions.ProjectRoom.SetProjectRoomTasksSort().run("Column To Sort":/Assignee/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/lasttask/.toString(),"Row Number":/4/.toString(),"Assignee":/End User/.toString(),"Status":/Paused/.toString(),"Due Date":/06-07-2024/.toString())
        //Set Project Room Tasks Sort
        new actions.ProjectRoom.SetProjectRoomTasksSort().run("Column To Sort":/Assignee/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/lasttask/.toString(),"Assignee":/End User/.toString(),"Status":/Paused/.toString(),"Due Date":/06\/07\/2024/.toString(),"Marked Completed":false,"Placement Number":/4/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/1TASK/.toString(),"Assignee":/End User/.toString(),"Status":/Paused/.toString(),"Due Date":/06\/07\/2024/.toString(),"Marked Completed":false,"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/1task/.toString(),"Assignee":/Pipeline Admin/.toString(),"Status":/Blocked/.toString(),"Due Date":/Select Date.../.toString(),"Marked Completed":false,"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/ZTask/.toString(),"Assignee":/System Admin/.toString(),"Status":/In Progress/.toString(),"Due Date":/11\/24\/2024/.toString(),"Marked Completed":false,"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
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