import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C132059 Task Sort and Filter - Sort and Filter one task page
class C132059TaskSortandFilter_SortandFilteronetaskpage
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
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/ZTask/.toString(),"Row Number":/1/.toString(),"Assignee":/Pipeline Admin/.toString(),"Status":/In Progress/.toString(),"Due Date":/11-24-2024/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/1task/.toString(),"Row Number":/2/.toString(),"Assignee":/Pipeline Admin/.toString(),"Status":/Blocked/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/1TASK/.toString(),"Row Number":/3/.toString(),"Assignee":/End User/.toString(),"Status":/Paused/.toString(),"Due Date":/06-07-2024/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/abctask/.toString(),"Row Number":/4/.toString(),"Assignee":/System Admin/.toString(),"Status":/Not Started/.toString(),"Due Date":/06-07-2024/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/$task/.toString(),"Row Number":/5/.toString(),"Status":/Complete/.toString(),"Due Date":/06-07-2026/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/ATask/.toString(),"Row Number":/6/.toString(),"Assignee":/System Admin/.toString(),"Due Date":/08-12-2027/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Placement Number Of Folder Name":/2/.toString(),"Type of Room Page":/Tasks/.toString())
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Room Item":/Tasks/.toString(),"Room Page Row Number":/2/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/Task1/.toString(),"Row Number":/1/.toString(),"Assignee":/End User/.toString(),"Status":/In Progress/.toString(),"Due Date":/11-24-2023/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/Task2/.toString(),"Row Number":/2/.toString(),"Assignee":/System Admin/.toString(),"Status":/In Progress/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/Task3/.toString(),"Row Number":/3/.toString(),"Assignee":/System Admin/.toString(),"Status":/Paused/.toString(),"Due Date":/11-24-2023/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Verify and Access Project Room Card in Userhome
        new actions.ProjectRoom.VerifyProjectRoomCard().run("Title":/Testing project room/.toString(),"Number of Matches":/1/.toString(),"Access Project Room":true)
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Room Item":/Tasks/.toString(),"Room Page Row Number":/1/.toString())
        //Set Filter for Project Room Tasks
        new actions.ProjectRoom.SetFilterforProjectRoomTasks().run("Invoke Filter":true,"Assignee":["Pipeline Admin","End User"],"Status":["In Progress","Blocked","Paused"],"Due Date":[],"Click on Close Button":true)
        //Set Project Room Tasks Sort
        new actions.ProjectRoom.SetProjectRoomTasksSort().run("Column To Sort":/Status/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/$task/.toString(),"Assignee":/Select Assignee.../.toString(),"Status":/Complete/.toString(),"Due Date":/06\/07\/2026/.toString(),"Marked Completed":true,"Number of Matches":/0/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/1TASK/.toString(),"Assignee":/End User/.toString(),"Status":/Paused/.toString(),"Due Date":/06\/07\/2024/.toString(),"Marked Completed":false,"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/1task/.toString(),"Assignee":/Pipeline Admin/.toString(),"Status":/Blocked/.toString(),"Due Date":/Select Date.../.toString(),"Marked Completed":false,"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/abctask/.toString(),"Assignee":/System Admin/.toString(),"Status":/Not Started/.toString(),"Due Date":/06\/07\/2024/.toString(),"Marked Completed":false,"Number of Matches":/0/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/ATask/.toString(),"Assignee":/System Admin/.toString(),"Status":/Select Status.../.toString(),"Due Date":/08\/12\/2027/.toString(),"Marked Completed":false,"Number of Matches":/0/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/ZTask/.toString(),"Assignee":/Pipeline Admin/.toString(),"Status":/In Progress/.toString(),"Due Date":/11\/24\/2024/.toString(),"Marked Completed":false,"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Filter Count in Project Room Tasks Page
        new actions.ProjectRoom.VerifyFilterCountinProjectRoomTasksPage().run("Message":/Showing 3 of 6 tasks/.toString(),"Message Displayed":true)
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Room Item":/Tasks/.toString(),"Room Page Row Number":/2/.toString())
        //Verify Filter Count in Project Room Tasks Page
        new actions.ProjectRoom.VerifyFilterCountinProjectRoomTasksPage().run("Message":/Showing 3 of 6 tasks/.toString(),"Message Displayed":false)
        //Set Filter for Project Room Tasks
        new actions.ProjectRoom.SetFilterforProjectRoomTasks().run("Invoke Filter":true,"Assignee":[],"Status":[],"Due Date":["Past Due"],"Click on Close Button":true)
        //Verify Filter Count in Project Room Tasks Page
        new actions.ProjectRoom.VerifyFilterCountinProjectRoomTasksPage().run("Message":/Showing 2 of 3 tasks/.toString(),"Message Displayed":true)
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/Task1/.toString(),"Assignee":/End User/.toString(),"Status":/In Progress/.toString(),"Due Date":/11\/24\/2023/.toString(),"Marked Completed":false,"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/Task2/.toString(),"Assignee":/System Admin/.toString(),"Status":/In Progress/.toString(),"Due Date":/Select Date.../.toString(),"Marked Completed":false,"Number of Matches":/0/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/Task3/.toString(),"Assignee":/System Admin/.toString(),"Status":/Paused/.toString(),"Due Date":/11\/24\/2023/.toString(),"Marked Completed":false,"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Room Item":/Tasks/.toString(),"Room Page Row Number":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/$task/.toString(),"Assignee":/Select Assignee.../.toString(),"Status":/Complete/.toString(),"Due Date":/06\/07\/2026/.toString(),"Marked Completed":true,"Number of Matches":/0/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/1TASK/.toString(),"Assignee":/End User/.toString(),"Status":/Paused/.toString(),"Due Date":/06\/07\/2024/.toString(),"Marked Completed":false,"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/1task/.toString(),"Assignee":/Pipeline Admin/.toString(),"Status":/Blocked/.toString(),"Due Date":/Select Date.../.toString(),"Marked Completed":false,"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/abctask/.toString(),"Assignee":/System Admin/.toString(),"Status":/Not Started/.toString(),"Due Date":/06\/07\/2024/.toString(),"Marked Completed":false,"Number of Matches":/0/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/ATask/.toString(),"Assignee":/System Admin/.toString(),"Status":/Select Status.../.toString(),"Due Date":/08\/12\/2027/.toString(),"Marked Completed":false,"Number of Matches":/0/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/ZTask/.toString(),"Assignee":/Pipeline Admin/.toString(),"Status":/In Progress/.toString(),"Due Date":/11\/24\/2024/.toString(),"Marked Completed":false,"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Filter Count in Project Room Tasks Page
        new actions.ProjectRoom.VerifyFilterCountinProjectRoomTasksPage().run("Message":/Showing 3 of 6 tasks/.toString(),"Message Displayed":true)
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