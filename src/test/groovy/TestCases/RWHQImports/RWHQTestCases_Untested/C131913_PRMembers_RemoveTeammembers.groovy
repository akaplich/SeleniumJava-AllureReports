package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131913 - PR Members > Remove Team members
class C131913_PRMembers_RemoveTeammembers
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
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser2@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Profile/.toString())
        //Edit Your Profile
        new actions.UserProfile.EditYourProfile().run("Display Picture":/Image5.jpg/.toString(),"Display Picture Change or Remove":/Change/.toString(),"Screen Name":/End User 2/.toString(),"First Name":/John/.toString(),"Last Name":/Doe/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
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
        new actions.ProjectRoom.SetMembersinProjectRoom().run("Member":/analyst,System Admin,Pipeline Admin,John Doe,Moderator,analyst/.toString(),"Member Add or Remove":/Add,Add,Add,Add,Add,Remove/.toString())
        //Edit or Remove Team Member in Project Room
        new actions.ProjectRoom.EditorRemoveTeamMemberinProjectRoom().run("Member(s)":/System Admin/.toString(),"Option(s)":/remove/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Once removed from the project room, the user will no longer have access to the space, unless re-invited. Are you sure you would like to remove the user?/.toString(),"Should Exist":true)
        //Edit or Remove Team Member in Project Room
        new actions.ProjectRoom.EditorRemoveTeamMemberinProjectRoom().run("Remove Action":/Remove user/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Room members updated successfully./.toString(),"Should Exist":true)
        //Verify Project Room Member in Members Tab
        new actions.ProjectRoom.VerifyProjectRoomMemberinMembersTab().run("Member Name":/System Admin/.toString(),"Member Display Picture":false,"Type of Member":/team member/.toString(),"Number of Matches":/0/.toString())
        //Verify Project Room Member in Members Tab
        new actions.ProjectRoom.VerifyProjectRoomMemberinMembersTab().run("Member Name":/End User/.toString(),"Member Display Picture":false,"Type of Member":/owner/.toString(),"Number of Matches":/1/.toString())
        //Verify Project Room Member in Members Tab
        new actions.ProjectRoom.VerifyProjectRoomMemberinMembersTab().run("Member Name":/Pipeline Admin/.toString(),"Member Display Picture":false,"Type of Member":/team member/.toString(),"Number of Matches":/1/.toString())
        //Verify Project Room Member in Members Tab
        new actions.ProjectRoom.VerifyProjectRoomMemberinMembersTab().run("Member Name":/John Doe/.toString(),"Member Display Picture":true,"Type of Member":/team member/.toString(),"Number of Matches":/1/.toString())
        //Verify Project Room Member in Members Tab
        new actions.ProjectRoom.VerifyProjectRoomMemberinMembersTab().run("Member Name":/Moderator/.toString(),"Member Display Picture":false,"Type of Member":/team member/.toString(),"Number of Matches":/1/.toString())
        //Verify Project Room Member in Members Tab
        new actions.ProjectRoom.VerifyProjectRoomMemberinMembersTab().run("Member Name":/analyst/.toString(),"Member Display Picture":false,"Type of Member":/team member/.toString(),"Number of Matches":/0/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/pipelineadmin@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Verify and Access Project Room Card in Userhome
        new actions.ProjectRoom.VerifyProjectRoomCard().run("Title":/Testing project room/.toString(),"Member count":/4/.toString(),"Access Project Room":true)
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Top Link":/Project Room Settings/.toString())
        //Set Tab in Room Settings in Project Room
        new actions.ProjectRoom.SetTabinRoomSettingsinProjectRoom().run("Tab":/Members/.toString())
        //Edit or Remove Team Member in Project Room
        new actions.ProjectRoom.EditorRemoveTeamMemberinProjectRoom().run("Member(s)":/Pipeline Admin/.toString(),"Option(s)":/leave/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Once removed from the project room, you will no longer have access to the space, unless re-invited by another user. Are you sure you would like to remove yourself?/.toString(),"Should Exist":true)
        //Edit or Remove Team Member in Project Room
        new actions.ProjectRoom.EditorRemoveTeamMemberinProjectRoom().run("Remove Action":/Cancel/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Room members updated successfully./.toString(),"Should Exist":false)
        //Verify Project Room Member in Members Tab
        new actions.ProjectRoom.VerifyProjectRoomMemberinMembersTab().run("Member Name":/End User/.toString(),"Member Display Picture":false,"Type of Member":/owner/.toString(),"Number of Matches":/1/.toString())
        //Verify Project Room Member in Members Tab
        new actions.ProjectRoom.VerifyProjectRoomMemberinMembersTab().run("Member Name":/Pipeline Admin/.toString(),"Member Display Picture":false,"Type of Member":/team member/.toString(),"Number of Matches":/1/.toString())
        //Verify Project Room Member in Members Tab
        new actions.ProjectRoom.VerifyProjectRoomMemberinMembersTab().run("Member Name":/John Doe/.toString(),"Member Display Picture":true,"Type of Member":/team member/.toString(),"Number of Matches":/1/.toString())
        //Verify Project Room Member in Members Tab
        new actions.ProjectRoom.VerifyProjectRoomMemberinMembersTab().run("Member Name":/Moderator/.toString(),"Member Display Picture":false,"Type of Member":/team member/.toString(),"Number of Matches":/1/.toString())
        //Edit or Remove Team Member in Project Room
        new actions.ProjectRoom.EditorRemoveTeamMemberinProjectRoom().run("Member(s)":/Pipeline Admin/.toString(),"Option(s)":/leave/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Once removed from the project room, you will no longer have access to the space, unless re-invited by another user. Are you sure you would like to remove yourself?/.toString(),"Should Exist":true)
        //Edit or Remove Team Member in Project Room
        new actions.ProjectRoom.EditorRemoveTeamMemberinProjectRoom().run("Remove Action":/Remove user/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/You have no available Project Rooms/.toString(),"Should Exist":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser2@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Verify and Access Project Room Card in Userhome
        new actions.ProjectRoom.VerifyProjectRoomCard().run("Title":/Testing project room/.toString(),"Member count":/3/.toString(),"Access Project Room":true)
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Top Link":/Project Room Settings/.toString())
        //Set Tab in Room Settings in Project Room
        new actions.ProjectRoom.SetTabinRoomSettingsinProjectRoom().run("Tab":/Members/.toString())
        //Edit or Remove Team Member in Project Room
        new actions.ProjectRoom.EditorRemoveTeamMemberinProjectRoom().run("Member(s)":/Moderator/.toString(),"Option(s)":/remove/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Once removed from the project room, the user will no longer have access to the space, unless re-invited. Are you sure you would like to remove the user?/.toString(),"Should Exist":true)
        //Edit or Remove Team Member in Project Room
        new actions.ProjectRoom.EditorRemoveTeamMemberinProjectRoom().run("Remove Action":/Remove user/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Room members updated successfully./.toString(),"Should Exist":true)
        //Verify Project Room Member in Members Tab
        new actions.ProjectRoom.VerifyProjectRoomMemberinMembersTab().run("Member Name":/End User/.toString(),"Member Display Picture":false,"Type of Member":/owner/.toString(),"Number of Matches":/1/.toString())
        //Verify Project Room Member in Members Tab
        new actions.ProjectRoom.VerifyProjectRoomMemberinMembersTab().run("Member Name":/John Doe/.toString(),"Member Display Picture":true,"Type of Member":/team member/.toString(),"Number of Matches":/1/.toString())
        //Verify Project Room Member in Members Tab
        new actions.ProjectRoom.VerifyProjectRoomMemberinMembersTab().run("Member Name":/Moderator/.toString(),"Member Display Picture":false,"Type of Member":/team member/.toString(),"Number of Matches":/0/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Verify and Access Project Room Card in Userhome
        new actions.ProjectRoom.VerifyProjectRoomCard().run("Title":/Testing project room/.toString(),"Member count":/2/.toString())
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