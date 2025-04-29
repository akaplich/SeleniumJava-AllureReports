import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C132052 - Project Room > Tasks - Add and Edit with Special Characters
class C132052_ProjectRoom_Tasks_AddandEditwithSpecialCharacters
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
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/Who's finishing the coding/.toString(),"Row Number":/1/.toString(),"Status":/In Progress/.toString(),"Due Date":"")
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Edit/.toString(),"New Task Name":/Who's finishing the regression testing/.toString(),"Original Task Name":/Who's finishing the coding/.toString(),"Row Number":/1/.toString(),"Status":/In Progress/.toString(),"Due Date":"")
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/Who's finishing the regression testing/.toString(),"Status":/In Progress/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/Remove special characters ~`!@#$%^&*()_+-={}[]:;?,.\/ from my report/.toString(),"Row Number":/2/.toString(),"Status":/In Progress/.toString(),"Due Date":"")
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Edit/.toString(),"New Task Name":/Remove special characters ~`!@#$%^&*()_+-={}[]:;?,.\/ from my letter/.toString(),"Original Task Name":/Remove special characters ~`!@#$%^&*()_+-={}[]:;?,.\/ from my report/.toString(),"Row Number":/2/.toString(),"Status":/In Progress/.toString(),"Due Date":"")
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/Remove special characters ~`!@#$%^&*()_+-={}[]:;?,.\/ from my letter/.toString(),"Status":/In Progress/.toString(),"Placement Number":"","Number of Matches":/1/.toString())
        //Verify Task in Project Room Shows Tooltip On Mouseover
        new actions.ProjectRoom.VerifyTaskinProjectRoomShowsTooltipOnMouseover().run("Task":/Who's finishing the regression testing/.toString())
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Add/.toString(),"New Task Name":/javascript:alert('Executed!');/.toString(),"Row Number":/3/.toString(),"Status":/In Progress/.toString(),"Due Date":"")
        //Set Add or Edit Tasks In Project Room
        new actions.ProjectRoom.SetTasksInProjectRoom().run("Add or Edit":/Edit/.toString(),"New Task Name":/javascript:alert('Executed!!!!!');/.toString(),"Original Task Name":/javascript:alert('Executed!');/.toString(),"Row Number":/3/.toString(),"Status":/In Progress/.toString(),"Due Date":"")
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/javascript:alert('Executed!!!!!');/.toString(),"Status":/In Progress/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/2/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/Who's finishing the regression testing/.toString(),"Status":/In Progress/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/Remove special characters ~`!@#$%^&*()_+-={}[]:;?,.\/ from my letter/.toString(),"Status":/In Progress/.toString(),"Placement Number":"","Number of Matches":/1/.toString())
        //Verify Tasks in Project Room
        new actions.ProjectRoom.VerifyTasksinProjectRoom().run("Task":/javascript:alert('Executed!!!!!');/.toString(),"Status":/In Progress/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Task in Project Room Shows Tooltip On Mouseover
        new actions.ProjectRoom.VerifyTaskinProjectRoomShowsTooltipOnMouseover().run("Task":/Remove special characters ~`!@#$%^&*()_+-={}[]:;?,.\/ from my letter/.toString())
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