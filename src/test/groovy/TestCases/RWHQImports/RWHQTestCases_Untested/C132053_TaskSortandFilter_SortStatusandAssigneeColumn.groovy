import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C132053 - Task Sort and Filter - Sort Status and Assignee Column
class C132053_TaskSortandFilter_SortStatusandAssigneeColumn
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
        Action58123c20fa4ee77809f468f6("Username Email":/bi.enduser1@brightidea.com/.toString(),"Licensing Model":/Standard Licensing Model/.toString(),"Brightidea Administrator License Type Purchased Count":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Profile/.toString())
        //Edit Your Profile
        new actions.UserProfile.EditYourProfile().run("First Name":/Ron/.toString(),"Last Name":/Joe/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
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
        new actions.ProjectRoom.SetMembersinProjectRoom().run("Member":/Ron Joe,Pipeline Admin/.toString(),"Member Add or Remove":/Add,Add/.toString())
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Room Item":/Tasks/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/ZTask/.toString(),"Row Number":/1/.toString(),"Assignee":/Pipeline Admin/.toString(),"Status":/In Progress/.toString(),"Due Date":/11-24-2024/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/1task/.toString(),"Row Number":/2/.toString(),"Assignee":/Pipeline Admin/.toString(),"Status":/Blocked/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/1TASK/.toString(),"Row Number":/3/.toString(),"Assignee":/Ron Joe/.toString(),"Status":/Paused/.toString(),"Due Date":/06-07-2024/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/abctask/.toString(),"Row Number":/4/.toString(),"Assignee":/System Admin/.toString(),"Status":/Not Started/.toString(),"Due Date":/06-07-2024/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/$task/.toString(),"Row Number":/5/.toString(),"Status":/Complete/.toString(),"Due Date":/06-07-2026/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/ATask/.toString(),"Row Number":/6/.toString(),"Assignee":/System Admin/.toString(),"Due Date":/08-12-2027/.toString())
        //Set Project Room Tasks Sort
        new actions.ProjectRoom.SetProjectRoomTasksSort().run("Column To Sort":/Assignee/.toString())
        //Verify Sort ToolTip on Tasks in Project Room
        new actions.ProjectRoom.VerifySortToolTiponTasksinProjectRoom().run("Column To Hover":/Assignee/.toString(),"ToolTip":/Sorted: A-Z/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/$task/.toString(),"Assignee":/Select Assignee.../.toString(),"Status":/Complete/.toString(),"Due Date":/06\/07\/2026/.toString(),"Marked Completed":true,"Placement Number":/6/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/1TASK/.toString(),"Assignee":/Ron Joe/.toString(),"Status":/Paused/.toString(),"Due Date":/06\/07\/2024/.toString(),"Marked Completed":false,"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/1task/.toString(),"Assignee":/Pipeline Admin/.toString(),"Status":/Blocked/.toString(),"Due Date":/Select Date.../.toString(),"Marked Completed":false,"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/abctask/.toString(),"Assignee":/System Admin/.toString(),"Status":/Not Started/.toString(),"Due Date":/06\/07\/2024/.toString(),"Marked Completed":false,"Placement Number":/4/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/ATask/.toString(),"Assignee":/System Admin/.toString(),"Status":/Select Status.../.toString(),"Due Date":/08\/12\/2027/.toString(),"Marked Completed":false,"Placement Number":/5/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/ZTask/.toString(),"Assignee":/Pipeline Admin/.toString(),"Status":/In Progress/.toString(),"Due Date":/11\/24\/2024/.toString(),"Marked Completed":false,"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Set Project Room Tasks Sort
        new actions.ProjectRoom.SetProjectRoomTasksSort().run("Column To Sort":/Assignee/.toString())
        //Verify Sort ToolTip on Tasks in Project Room
        new actions.ProjectRoom.VerifySortToolTiponTasksinProjectRoom().run("Column To Hover":/Assignee/.toString(),"ToolTip":/Sorted: Z-A/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/$task/.toString(),"Assignee":/Select Assignee.../.toString(),"Status":/Complete/.toString(),"Due Date":/06\/07\/2026/.toString(),"Marked Completed":true,"Placement Number":/6/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/1TASK/.toString(),"Assignee":/Ron Joe/.toString(),"Status":/Paused/.toString(),"Due Date":/06\/07\/2024/.toString(),"Marked Completed":false,"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/1task/.toString(),"Assignee":/Pipeline Admin/.toString(),"Status":/Blocked/.toString(),"Due Date":/Select Date.../.toString(),"Marked Completed":false,"Placement Number":/5/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/abctask/.toString(),"Assignee":/System Admin/.toString(),"Status":/Not Started/.toString(),"Due Date":/06\/07\/2024/.toString(),"Marked Completed":false,"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/ATask/.toString(),"Assignee":/System Admin/.toString(),"Status":/Select Status.../.toString(),"Due Date":/08\/12\/2027/.toString(),"Marked Completed":false,"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/ZTask/.toString(),"Assignee":/Pipeline Admin/.toString(),"Status":/In Progress/.toString(),"Due Date":/11\/24\/2024/.toString(),"Marked Completed":false,"Placement Number":/4/.toString(),"Number of Matches":/1/.toString())
        //Set Project Room Tasks Sort
        new actions.ProjectRoom.SetProjectRoomTasksSort().run("Column To Sort":/Assignee/.toString())
        //Verify Sort ToolTip on Tasks in Project Room
        new actions.ProjectRoom.VerifySortToolTiponTasksinProjectRoom().run("Column To Hover":/Assignee/.toString(),"ToolTip":/Sort/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/$task/.toString(),"Assignee":/Select Assignee.../.toString(),"Status":/Complete/.toString(),"Due Date":/06\/07\/2026/.toString(),"Marked Completed":true,"Placement Number":/5/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/1TASK/.toString(),"Assignee":/Ron Joe/.toString(),"Status":/Paused/.toString(),"Due Date":/06\/07\/2024/.toString(),"Marked Completed":false,"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/1task/.toString(),"Assignee":/Pipeline Admin/.toString(),"Status":/Blocked/.toString(),"Due Date":/Select Date.../.toString(),"Marked Completed":false,"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/abctask/.toString(),"Assignee":/System Admin/.toString(),"Status":/Not Started/.toString(),"Due Date":/06\/07\/2024/.toString(),"Marked Completed":false,"Placement Number":/4/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/ATask/.toString(),"Assignee":/System Admin/.toString(),"Status":/Select Status.../.toString(),"Due Date":/08\/12\/2027/.toString(),"Marked Completed":false,"Placement Number":/6/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/ZTask/.toString(),"Assignee":/Pipeline Admin/.toString(),"Status":/In Progress/.toString(),"Due Date":/11\/24\/2024/.toString(),"Marked Completed":false,"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/abctask/.toString(),"Assignee":/System Admin/.toString(),"Status":/Not Started/.toString(),"Due Date":/06\/07\/2024/.toString(),"Marked Completed":false,"Placement Number":/4/.toString(),"Number of Matches":/1/.toString())
        //Set Project Room Tasks Sort
        new actions.ProjectRoom.SetProjectRoomTasksSort().run("Column To Sort":/Status/.toString())
        //Verify Sort ToolTip on Tasks in Project Room
        new actions.ProjectRoom.VerifySortToolTiponTasksinProjectRoom().run("Column To Hover":/Status/.toString(),"ToolTip":/Sorted: A-Z/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/1TASK/.toString(),"Assignee":/Ron Joe/.toString(),"Status":/Paused/.toString(),"Due Date":/06\/07\/2024/.toString(),"Marked Completed":false,"Placement Number":/5/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/abctask/.toString(),"Assignee":/System Admin/.toString(),"Status":/Not Started/.toString(),"Due Date":/06\/07\/2024/.toString(),"Marked Completed":false,"Placement Number":/4/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/ZTask/.toString(),"Assignee":/Pipeline Admin/.toString(),"Status":/In Progress/.toString(),"Due Date":/11\/24\/2024/.toString(),"Marked Completed":false,"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/$task/.toString(),"Assignee":/Select Assignee.../.toString(),"Status":/Complete/.toString(),"Due Date":/06\/07\/2026/.toString(),"Marked Completed":true,"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/ATask/.toString(),"Assignee":/System Admin/.toString(),"Status":/Select Status.../.toString(),"Due Date":/08\/12\/2027/.toString(),"Marked Completed":false,"Placement Number":/6/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/1task/.toString(),"Assignee":/Pipeline Admin/.toString(),"Status":/Blocked/.toString(),"Due Date":/Select Date.../.toString(),"Marked Completed":false,"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Set Project Room Tasks Sort
        new actions.ProjectRoom.SetProjectRoomTasksSort().run("Column To Sort":/Status/.toString())
        //Verify Sort ToolTip on Tasks in Project Room
        new actions.ProjectRoom.VerifySortToolTiponTasksinProjectRoom().run("Column To Hover":/Status/.toString(),"ToolTip":/Sorted: Z-A/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/1TASK/.toString(),"Assignee":/Ron Joe/.toString(),"Status":/Paused/.toString(),"Due Date":/06\/07\/2024/.toString(),"Marked Completed":false,"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/abctask/.toString(),"Assignee":/System Admin/.toString(),"Status":/Not Started/.toString(),"Due Date":/06\/07\/2024/.toString(),"Marked Completed":false,"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/ZTask/.toString(),"Assignee":/Pipeline Admin/.toString(),"Status":/In Progress/.toString(),"Due Date":/11\/24\/2024/.toString(),"Marked Completed":false,"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/$task/.toString(),"Assignee":/Select Assignee.../.toString(),"Status":/Complete/.toString(),"Due Date":/06\/07\/2026/.toString(),"Marked Completed":true,"Placement Number":/4/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/ATask/.toString(),"Assignee":/System Admin/.toString(),"Status":/Select Status.../.toString(),"Due Date":/08\/12\/2027/.toString(),"Marked Completed":false,"Placement Number":/6/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/1task/.toString(),"Assignee":/Pipeline Admin/.toString(),"Status":/Blocked/.toString(),"Due Date":/Select Date.../.toString(),"Marked Completed":false,"Placement Number":/5/.toString(),"Number of Matches":/1/.toString())
        //Set Project Room Tasks Sort
        new actions.ProjectRoom.SetProjectRoomTasksSort().run("Column To Sort":/Status/.toString())
        //Verify Sort ToolTip on Tasks in Project Room
        new actions.ProjectRoom.VerifySortToolTiponTasksinProjectRoom().run("Column To Hover":/Status/.toString(),"ToolTip":/Sort/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/$task/.toString(),"Assignee":/Select Assignee.../.toString(),"Status":/Complete/.toString(),"Due Date":/06\/07\/2026/.toString(),"Marked Completed":true,"Placement Number":/5/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/1TASK/.toString(),"Assignee":/Ron Joe/.toString(),"Status":/Paused/.toString(),"Due Date":/06\/07\/2024/.toString(),"Marked Completed":false,"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/1task/.toString(),"Assignee":/Pipeline Admin/.toString(),"Status":/Blocked/.toString(),"Due Date":/Select Date.../.toString(),"Marked Completed":false,"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/abctask/.toString(),"Assignee":/System Admin/.toString(),"Status":/Not Started/.toString(),"Due Date":/06\/07\/2024/.toString(),"Marked Completed":false,"Placement Number":/4/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/ATask/.toString(),"Assignee":/System Admin/.toString(),"Status":/Select Status.../.toString(),"Due Date":/08\/12\/2027/.toString(),"Marked Completed":false,"Placement Number":/6/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/ZTask/.toString(),"Assignee":/Pipeline Admin/.toString(),"Status":/In Progress/.toString(),"Due Date":/11\/24\/2024/.toString(),"Marked Completed":false,"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
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