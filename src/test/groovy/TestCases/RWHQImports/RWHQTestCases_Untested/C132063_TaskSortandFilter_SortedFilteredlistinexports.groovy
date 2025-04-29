import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C132063 - Task Sort and Filter - Sorted Filtered list in exports
class C132063_TaskSortandFilter_SortedFilteredlistinexports
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
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/task1/.toString(),"Row Number":/1/.toString(),"Assignee":/Pipeline Admin/.toString(),"Status":/In Progress/.toString(),"Due Date":/11-24-2023/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/task2/.toString(),"Row Number":/2/.toString(),"Assignee":/Pipeline Admin/.toString(),"Status":/In Progress/.toString(),"Due Date":/11-24-2023/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/task3/.toString(),"Row Number":/3/.toString(),"Assignee":/System Admin/.toString(),"Status":/In Progress/.toString(),"Due Date":/11-24-2023/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/task4/.toString(),"Row Number":/4/.toString(),"Assignee":/System Admin/.toString(),"Status":/Paused/.toString(),"Due Date":/11-24-2023/.toString())
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
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/task19/.toString(),"Row Number":/19/.toString(),"Assignee":/End User/.toString(),"Due Date":/11-24-2023/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/task20/.toString(),"Row Number":/20/.toString(),"Assignee":/Pipeline Admin/.toString(),"Due Date":/11-24-2023/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/task21/.toString(),"Row Number":/21/.toString(),"Assignee":/System Admin/.toString(),"Status":/Not Started/.toString(),"Due Date":/11-24-2023/.toString())
        //Set Filter for Project Room Tasks
        new actions.ProjectRoom.SetFilterforProjectRoomTasks().run("Invoke Filter":true,"Assignee":["Pipeline Admin","System Admin"],"Status":[],"Due Date":["Past Due"],"Click on Close Button":true)
        //Set Project Room Tasks Sort
        new actions.ProjectRoom.SetProjectRoomTasksSort().run("Column To Sort":/Tasks/.toString())
        //Set Project Room Tasks Sort
        new actions.ProjectRoom.SetProjectRoomTasksSort().run("Column To Sort":/Tasks/.toString())
        //Verify Sort ToolTip on Tasks in Project Room
        new actions.ProjectRoom.VerifySortToolTiponTasksinProjectRoom().run("Column To Hover":/Tasks/.toString(),"ToolTip":/Sorted: Z-A/.toString())
        //Set Exports In Tasks Tab in Project Room
        new actions.ProjectRoom.SetExportsInTasksTabinProjectRoom().run([:])
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Testing_project_room_export_tasks*.xls/.toString(),"File Location":/Downloads/.toString(),"Should file exist":true,"Row Values":["tasks","assignee","status","due_date","notes"],"Number of Matches":/1/.toString(),"Total Number of Rows":/21/.toString())
        //Set Exports In Tasks Tab in Project Room
        new actions.ProjectRoom.SetExportsInTasksTabinProjectRoom().run([:])
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Testing_project_room_export_tasks*.xls/.toString(),"File Location":/Downloads/.toString(),"Should file exist":true,"Row Values":["task8","System Admin","2023-11-24"],"Number of Matches":/1/.toString(),"Total Number of Rows":/21/.toString())
        //Set Exports In Tasks Tab in Project Room
        new actions.ProjectRoom.SetExportsInTasksTabinProjectRoom().run([:])
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Testing_project_room_export_tasks*.xls/.toString(),"File Location":/Downloads/.toString(),"Should file exist":true,"Row Values":["task2","Pipeline Admin","In progress","2023-11-24"],"Number of Matches":/1/.toString(),"Total Number of Rows":/21/.toString())
        //Set Exports In Tasks Tab in Project Room
        new actions.ProjectRoom.SetExportsInTasksTabinProjectRoom().run([:])
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Testing_project_room_export_tasks*.xls/.toString(),"File Location":/Downloads/.toString(),"Should file exist":true,"Row Values":["task19","End User"],"Number of Matches":/0/.toString())
        //Verify Filter Count in Project Room Tasks Page
        new actions.ProjectRoom.VerifyFilterCountinProjectRoomTasksPage().run("Message":/Showing 20 of 21 tasks/.toString(),"Message Displayed":true,"Clear Filter":true)
        //Set Filter for Project Room Tasks
        new actions.ProjectRoom.SetFilterforProjectRoomTasks().run("Invoke Filter":true,"Assignee":["End User"],"Status":["Paused"],"Due Date":[],"Click on Close Button":true)
        //Set Exports In Tasks Tab in Project Room
        new actions.ProjectRoom.SetExportsInTasksTabinProjectRoom().run([:])
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Testing_project_room_export_tasks*.xls/.toString(),"File Location":/Downloads/.toString(),"Should file exist":true,"Row Values":["tasks","assignee","status","due_date","notes"],"Number of Matches":/1/.toString(),"Total Number of Rows":/2/.toString())
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