package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132143 - Group Creation - Edit Group Members
class C132143_GroupCreation_EditGroupMembers
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
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/moderator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Profile/.toString())
        //Edit Your Profile
        new actions.UserProfile.EditYourProfile().run("Display Picture":/Image5.jpg/.toString(),"Display Picture Change or Remove":/Change/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Navigate to Groups Tab":true,"Create Edit or Delete":/Create/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("Group Name":/ZTesting Group1/.toString(),"User":/Pipeline Admin,Moderator,analyst/.toString(),"Add or Remove":/Add,Add,Add/.toString(),"Action":/Create Group/.toString())
        //Verify Groups in the List
        new actions.SetupUsers.VerifyGroupsintheList().run("Navigate to Groups Tab":false,"Group Name":/ZTesting Group1/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Navigate to Groups Tab":false,"Create Edit or Delete":/Edit/.toString(),"Group Name to Edit or Delete":/ZTesting Group1/.toString())
        //Verify User in Group Modal
        new actions.SetupUsers.VerifyUserinGroupModal().run("User in Left or Right Rail":/Right/.toString(),"User":/Pipeline Admin/.toString(),"Image":false,"Number of Matches":/1/.toString())
        //Verify User in Group Modal
        new actions.SetupUsers.VerifyUserinGroupModal().run("User in Left or Right Rail":/Right/.toString(),"User":/Moderator/.toString(),"Image":true,"Number of Matches":/1/.toString())
        //Verify User in Group Modal
        new actions.SetupUsers.VerifyUserinGroupModal().run("User in Left or Right Rail":/Right/.toString(),"User":/analyst/.toString(),"Image":false,"Number of Matches":/1/.toString())
        //Verify User in Group Modal
        new actions.SetupUsers.VerifyUserinGroupModal().run("User in Left or Right Rail":/Left/.toString(),"User":/analyst/.toString(),"Image":false,"Number of Matches":/0/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("Search User":/Evaluator/.toString(),"User":/Evaluator/.toString(),"Add or Remove":/Add/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("User":/analyst/.toString(),"Add or Remove":/Remove/.toString())
        //Verify User in Group Modal
        new actions.SetupUsers.VerifyUserinGroupModal().run("User in Left or Right Rail":/Right/.toString(),"User":/Evaluator/.toString(),"Image":false,"Number of Matches":/1/.toString())
        //Verify User in Group Modal
        new actions.SetupUsers.VerifyUserinGroupModal().run("User in Left or Right Rail":/Right/.toString(),"User":/Pipeline Admin/.toString(),"Image":false,"Number of Matches":/1/.toString())
        //Verify User in Group Modal
        new actions.SetupUsers.VerifyUserinGroupModal().run("User in Left or Right Rail":/Right/.toString(),"User":/Moderator/.toString(),"Image":true,"Number of Matches":/1/.toString())
        //Verify User in Group Modal
        new actions.SetupUsers.VerifyUserinGroupModal().run("User in Left or Right Rail":/Right/.toString(),"User":/analyst/.toString(),"Image":false,"Number of Matches":/0/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("Action":/Update/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Navigate to Groups Tab":true,"Create Edit or Delete":/Edit/.toString(),"Group Name to Edit or Delete":/ZTesting Group1/.toString())
        //Verify User in Group Modal
        new actions.SetupUsers.VerifyUserinGroupModal().run("User in Left or Right Rail":/Right/.toString(),"User":/Evaluator/.toString(),"Image":false,"Number of Matches":/1/.toString())
        //Verify User in Group Modal
        new actions.SetupUsers.VerifyUserinGroupModal().run("User in Left or Right Rail":/Right/.toString(),"User":/Pipeline Admin/.toString(),"Image":false,"Number of Matches":/1/.toString())
        //Verify User in Group Modal
        new actions.SetupUsers.VerifyUserinGroupModal().run("User in Left or Right Rail":/Right/.toString(),"User":/Moderator/.toString(),"Image":true,"Number of Matches":/1/.toString())
        //Verify User in Group Modal
        new actions.SetupUsers.VerifyUserinGroupModal().run("User in Left or Right Rail":/Right/.toString(),"User":/analyst/.toString(),"Image":false,"Number of Matches":/0/.toString())
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