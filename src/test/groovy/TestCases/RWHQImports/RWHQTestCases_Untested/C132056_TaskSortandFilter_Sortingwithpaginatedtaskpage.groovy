import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C132056 - Task Sort and Filter - Sorting with paginated task page
class C132056_TaskSortandFilter_Sortingwithpaginatedtaskpage
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
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/task1/.toString(),"Row Number":/1/.toString(),"Assignee":/Pipeline Admin/.toString(),"Status":/Paused/.toString(),"Due Date":/11-24-2023/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/task2/.toString(),"Row Number":/2/.toString(),"Assignee":/Pipeline Admin/.toString(),"Status":/Complete/.toString(),"Due Date":/11-24-2023/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/task3/.toString(),"Row Number":/3/.toString(),"Assignee":/System Admin/.toString(),"Status":/In Progress/.toString(),"Due Date":/11-24-2023/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/task4/.toString(),"Row Number":/4/.toString(),"Assignee":/System Admin/.toString(),"Status":/Not Started/.toString(),"Due Date":/11-24-2023/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/task5/.toString(),"Row Number":/5/.toString(),"Assignee":/System Admin/.toString(),"Due Date":/11-24-2023/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/task6/.toString(),"Row Number":/6/.toString(),"Assignee":/System Admin/.toString(),"Due Date":/11-24-2023/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/task7/.toString(),"Row Number":/7/.toString(),"Assignee":/System Admin/.toString(),"Due Date":/11-24-2023/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/task8/.toString(),"Row Number":/8/.toString(),"Assignee":/System Admin/.toString(),"Due Date":/11-24-2023/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/task9/.toString(),"Row Number":/9/.toString(),"Assignee":/System Admin/.toString(),"Due Date":/11-24-2023/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/task10/.toString(),"Row Number":/10/.toString(),"Assignee":/System Admin/.toString(),"Due Date":/11-24-2023/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/task11/.toString(),"Row Number":/11/.toString(),"Assignee":/System Admin/.toString(),"Due Date":/11-24-2023/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/task12/.toString(),"Row Number":/12/.toString(),"Assignee":/System Admin/.toString(),"Due Date":/11-24-2023/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/task13/.toString(),"Row Number":/13/.toString(),"Assignee":/System Admin/.toString(),"Due Date":/11-24-2023/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/task14/.toString(),"Row Number":/14/.toString(),"Assignee":/System Admin/.toString(),"Due Date":/11-24-2023/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/task15/.toString(),"Row Number":/15/.toString(),"Assignee":/System Admin/.toString(),"Due Date":/11-24-2023/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/task16/.toString(),"Row Number":/16/.toString(),"Assignee":/System Admin/.toString(),"Due Date":/11-24-2023/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/task17/.toString(),"Row Number":/17/.toString(),"Assignee":/System Admin/.toString(),"Due Date":/11-24-2023/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/task18/.toString(),"Row Number":/18/.toString(),"Assignee":/System Admin/.toString(),"Due Date":/11-24-2023/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/task19/.toString(),"Row Number":/19/.toString(),"Assignee":/System Admin/.toString(),"Due Date":/11-24-2023/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/task20/.toString(),"Row Number":/20/.toString(),"Assignee":/System Admin/.toString(),"Due Date":/11-24-2023/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/atask21/.toString(),"Row Number":/21/.toString(),"Assignee":/End User/.toString(),"Status":/Blocked/.toString(),"Due Date":/11-24-2023/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Set Project Room Tasks Sort
        new actions.ProjectRoom.SetProjectRoomTasksSort().run("Column To Sort":/Tasks/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/atask21/.toString(),"Assignee":/End User/.toString(),"Status":/Blocked/.toString(),"Due Date":/11\/24\/2023/.toString(),"Notes Count":/Add Note.../.toString(),"Marked Completed":false,"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/task1/.toString(),"Assignee":/Pipeline Admin/.toString(),"Status":/Paused/.toString(),"Due Date":/11\/24\/2023/.toString(),"Notes Count":/Add Note.../.toString(),"Marked Completed":false,"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/task10/.toString(),"Assignee":/System Admin/.toString(),"Status":/Select Status.../.toString(),"Due Date":/11\/24\/2023/.toString(),"Notes Count":/Add Note.../.toString(),"Marked Completed":false,"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/task11/.toString(),"Assignee":/System Admin/.toString(),"Status":/Select Status.../.toString(),"Due Date":/11\/24\/2023/.toString(),"Notes Count":/Add Note.../.toString(),"Marked Completed":false,"Placement Number":/4/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/task12/.toString(),"Assignee":/System Admin/.toString(),"Status":/Select Status.../.toString(),"Due Date":/11\/24\/2023/.toString(),"Notes Count":/Add Note.../.toString(),"Marked Completed":false,"Placement Number":/5/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/task13/.toString(),"Assignee":/System Admin/.toString(),"Status":/Select Status.../.toString(),"Due Date":/11\/24\/2023/.toString(),"Notes Count":/Add Note.../.toString(),"Marked Completed":false,"Placement Number":/6/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/task14/.toString(),"Assignee":/System Admin/.toString(),"Status":/Select Status.../.toString(),"Due Date":/11\/24\/2023/.toString(),"Notes Count":/Add Note.../.toString(),"Marked Completed":false,"Placement Number":/7/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/task15/.toString(),"Assignee":/System Admin/.toString(),"Status":/Select Status.../.toString(),"Due Date":/11\/24\/2023/.toString(),"Notes Count":/Add Note.../.toString(),"Marked Completed":false,"Placement Number":/8/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/task16/.toString(),"Assignee":/System Admin/.toString(),"Status":/Select Status.../.toString(),"Due Date":/11\/24\/2023/.toString(),"Notes Count":/Add Note.../.toString(),"Marked Completed":false,"Placement Number":/9/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/task17/.toString(),"Assignee":/System Admin/.toString(),"Status":/Select Status.../.toString(),"Due Date":/11\/24\/2023/.toString(),"Notes Count":/Add Note.../.toString(),"Marked Completed":false,"Placement Number":/10/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/task18/.toString(),"Assignee":/System Admin/.toString(),"Status":/Select Status.../.toString(),"Due Date":/11\/24\/2023/.toString(),"Notes Count":/Add Note.../.toString(),"Marked Completed":false,"Placement Number":/11/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/task19/.toString(),"Assignee":/System Admin/.toString(),"Status":/Select Status.../.toString(),"Due Date":/11\/24\/2023/.toString(),"Notes Count":/Add Note.../.toString(),"Marked Completed":false,"Placement Number":/12/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/task2/.toString(),"Assignee":/Pipeline Admin/.toString(),"Status":/Complete/.toString(),"Due Date":/11\/24\/2023/.toString(),"Notes Count":/Add Note.../.toString(),"Marked Completed":true,"Placement Number":/13/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/task20/.toString(),"Assignee":/System Admin/.toString(),"Status":/Select Status.../.toString(),"Due Date":/11\/24\/2023/.toString(),"Notes Count":/Add Note.../.toString(),"Marked Completed":false,"Placement Number":/14/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/task3/.toString(),"Assignee":/System Admin/.toString(),"Status":/In Progress/.toString(),"Due Date":/11\/24\/2023/.toString(),"Notes Count":/Add Note.../.toString(),"Marked Completed":false,"Placement Number":/15/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/task4/.toString(),"Assignee":/System Admin/.toString(),"Status":/Not Started/.toString(),"Due Date":/11\/24\/2023/.toString(),"Notes Count":/Add Note.../.toString(),"Marked Completed":false,"Placement Number":/16/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/task5/.toString(),"Assignee":/System Admin/.toString(),"Status":/Select Status.../.toString(),"Due Date":/11\/24\/2023/.toString(),"Notes Count":/Add Note.../.toString(),"Marked Completed":false,"Placement Number":/17/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/task6/.toString(),"Assignee":/System Admin/.toString(),"Status":/Select Status.../.toString(),"Due Date":/11\/24\/2023/.toString(),"Notes Count":/Add Note.../.toString(),"Marked Completed":false,"Placement Number":/18/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/task7/.toString(),"Assignee":/System Admin/.toString(),"Status":/Select Status.../.toString(),"Due Date":/11\/24\/2023/.toString(),"Notes Count":/Add Note.../.toString(),"Marked Completed":false,"Placement Number":/19/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/task8/.toString(),"Assignee":/System Admin/.toString(),"Status":/Select Status.../.toString(),"Due Date":/11\/24\/2023/.toString(),"Notes Count":/Add Note.../.toString(),"Marked Completed":false,"Placement Number":/20/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/task9/.toString(),"Assignee":/System Admin/.toString(),"Status":/Select Status.../.toString(),"Due Date":/11\/24\/2023/.toString(),"Notes Count":/Add Note.../.toString(),"Marked Completed":false,"Number of Matches":/0/.toString())
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