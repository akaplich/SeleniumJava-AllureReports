package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131723 - Project Room Userhome > Sorting
class C131723_ProjectRoomUserhome_Sorting
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
        Action58123c20fa4ee77809f468f6([:])
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
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Project Room - Create Project Room
        new actions.ProjectRoom.ProjectRoomCreateProjectRoom().run([:])
        //Set and Verify Project Room Title
        new actions.ProjectRoom.SetProjectRoomTitle().run("Title":/Testing project room3/.toString(),"Action":/Submit/.toString())
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Top Link":/Project Room Settings/.toString())
        //Set Tab in Room Settings in Project Room
        new actions.ProjectRoom.SetTabinRoomSettingsinProjectRoom().run("Tab":/Members/.toString())
        //Set Members in Project Room
        new actions.ProjectRoom.SetMembersinProjectRoom().run("Member":/End User,Pipeline Admin/.toString(),"Member Add or Remove":/Add,Add/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Verify and Access Project Room Card in Userhome
        new actions.ProjectRoom.VerifyProjectRoomCard().run("Title":/Testing project room/.toString(),"Color of the Project Room Icon":/rgb(52, 152, 219)/.toString(),"Updated":/A member was added/.toString(),"Updated By":/System Admin/.toString(),"Member count":/3/.toString(),"Total Objects":/1/.toString(),"Total Tasks":/0/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString(),"Access Project Room":true)
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Top Link":/Project Room Settings/.toString())
        //Set Tab in Room Settings in Project Room
        new actions.ProjectRoom.SetTabinRoomSettingsinProjectRoom().run("Tab":/Members/.toString())
        //Edit or Remove Team Member in Project Room
        new actions.ProjectRoom.EditorRemoveTeamMemberinProjectRoom().run("Member(s)":/Pipeline Admin/.toString(),"Option(s)":/remove/.toString(),"Remove Action":/Remove user/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Verify and Access Project Room Card in Userhome
        new actions.ProjectRoom.VerifyProjectRoomCard().run("Title":/Testing project room/.toString(),"Color of the Project Room Icon":/rgb(52, 152, 219)/.toString(),"Updated":/A member was removed/.toString(),"Updated By":/System Admin/.toString(),"Member count":/2/.toString(),"Total Objects":/1/.toString(),"Total Tasks":/0/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify and Access Project Room Card in Userhome
        new actions.ProjectRoom.VerifyProjectRoomCard().run("Title":/Testing project room2/.toString(),"Color of the Project Room Icon":/rgb(52, 152, 219)/.toString(),"Updated":/A member was added/.toString(),"Updated By":/System Admin/.toString(),"Member count":/3/.toString(),"Total Objects":/1/.toString(),"Total Tasks":/0/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify and Access Project Room Card in Userhome
        new actions.ProjectRoom.VerifyProjectRoomCard().run("Title":/Testing project room3/.toString(),"Color of the Project Room Icon":/rgb(52, 152, 219)/.toString(),"Updated":/A member was added/.toString(),"Updated By":/System Admin/.toString(),"Member count":/3/.toString(),"Total Objects":/1/.toString(),"Total Tasks":/0/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Set Filter in Project Room Tab in Userhome
        new actions.ProjectRoom.SetSortinProjectRoomTabinUserhome().run("Tab":/My Rooms/.toString())
        //Verify and Access Project Room Card in Userhome
        new actions.ProjectRoom.VerifyProjectRoomCard().run("Title":/Testing project room/.toString(),"Color of the Project Room Icon":/rgb(52, 152, 219)/.toString(),"Updated":/A member was removed/.toString(),"Updated By":/System Admin/.toString(),"Member count":/2/.toString(),"Total Objects":/1/.toString(),"Total Tasks":/0/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify and Access Project Room Card in Userhome
        new actions.ProjectRoom.VerifyProjectRoomCard().run("Title":/Testing project room2/.toString(),"Color of the Project Room Icon":/rgb(52, 152, 219)/.toString(),"Updated":/A member was added/.toString(),"Updated By":/System Admin/.toString(),"Member count":/3/.toString(),"Total Objects":/1/.toString(),"Total Tasks":/0/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify and Access Project Room Card in Userhome
        new actions.ProjectRoom.VerifyProjectRoomCard().run("Title":/Testing project room3/.toString(),"Color of the Project Room Icon":/rgb(52, 152, 219)/.toString(),"Updated":/A member was added/.toString(),"Updated By":/System Admin/.toString(),"Member count":/3/.toString(),"Total Objects":/1/.toString(),"Total Tasks":/0/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Verify and Access Project Room Card in Userhome
        new actions.ProjectRoom.VerifyProjectRoomCard().run("Title":/Testing project room/.toString(),"Color of the Project Room Icon":/rgb(52, 152, 219)/.toString(),"Updated":/A member was removed/.toString(),"Updated By":/System Admin/.toString(),"Member count":/2/.toString(),"Total Objects":/1/.toString(),"Total Tasks":/0/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify and Access Project Room Card in Userhome
        new actions.ProjectRoom.VerifyProjectRoomCard().run("Title":/Testing project room2/.toString(),"Color of the Project Room Icon":/rgb(52, 152, 219)/.toString(),"Updated":/A member was added/.toString(),"Updated By":/System Admin/.toString(),"Member count":/3/.toString(),"Total Objects":/1/.toString(),"Total Tasks":/0/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify and Access Project Room Card in Userhome
        new actions.ProjectRoom.VerifyProjectRoomCard().run("Title":/Testing project room3/.toString(),"Color of the Project Room Icon":/rgb(52, 152, 219)/.toString(),"Updated":/A member was added/.toString(),"Updated By":/System Admin/.toString(),"Member count":/3/.toString(),"Total Objects":/1/.toString(),"Total Tasks":/0/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Set Filter in Project Room Tab in Userhome
        new actions.ProjectRoom.SetSortinProjectRoomTabinUserhome().run("Tab":/Shared with Me/.toString())
        //Verify and Access Project Room Card in Userhome
        new actions.ProjectRoom.VerifyProjectRoomCard().run("Title":/Testing project room/.toString(),"Color of the Project Room Icon":/rgb(52, 152, 219)/.toString(),"Updated":/A member was removed/.toString(),"Updated By":/System Admin/.toString(),"Member count":/2/.toString(),"Total Objects":/1/.toString(),"Total Tasks":/0/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify and Access Project Room Card in Userhome
        new actions.ProjectRoom.VerifyProjectRoomCard().run("Title":/Testing project room2/.toString(),"Color of the Project Room Icon":/rgb(52, 152, 219)/.toString(),"Updated":/A member was added/.toString(),"Updated By":/System Admin/.toString(),"Member count":/3/.toString(),"Total Objects":/1/.toString(),"Total Tasks":/0/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify and Access Project Room Card in Userhome
        new actions.ProjectRoom.VerifyProjectRoomCard().run("Title":/Testing project room3/.toString(),"Color of the Project Room Icon":/rgb(52, 152, 219)/.toString(),"Updated":/A member was added/.toString(),"Updated By":/System Admin/.toString(),"Member count":/3/.toString(),"Total Objects":/1/.toString(),"Total Tasks":/0/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
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