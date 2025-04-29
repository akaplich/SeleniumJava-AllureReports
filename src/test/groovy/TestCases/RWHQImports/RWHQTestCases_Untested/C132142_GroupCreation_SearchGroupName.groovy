package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C132142 - Group Creation - Search Group Name
class C132142_GroupCreation_SearchGroupName
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
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Navigate to Groups Tab":true,"Create Edit or Delete":/Create/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("Group Name":/ZTesting Group1/.toString(),"User":/Pipeline Admin,Moderator,analyst/.toString(),"Add or Remove":/Add,Add,Add/.toString(),"Action":/Create Group/.toString())
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Create Edit or Delete":/Create/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("Group Name":/A_TESTING_GROUP1/.toString(),"User":/Pipeline Admin,Moderator,analyst/.toString(),"Add or Remove":/Add,Add,Add/.toString(),"Action":/Create Group/.toString())
        //Set Search in Group List
        new actions.SetupUsers.SetSearchinGroupList().run("Group Name":/ZTesting Group1/.toString())
        //Verify Groups in the List
        new actions.SetupUsers.VerifyGroupsintheList().run("Navigate to Groups Tab":false,"Group Name":/ZTesting Group1/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Groups in the List
        new actions.SetupUsers.VerifyGroupsintheList().run("Navigate to Groups Tab":false,"Group Name":/A_TESTING_GROUP1/.toString(),"Number of Matches":/0/.toString())
        //Verify Groups in the List
        new actions.SetupUsers.VerifyGroupsintheList().run("Navigate to Groups Tab":false,"Group Name":/Stop the Spill [Training Challenge]/.toString(),"Number of Matches":/0/.toString())
        //Verify Groups in the List
        new actions.SetupUsers.VerifyGroupsintheList().run("Navigate to Groups Tab":false,"Group Name":/New Group/.toString(),"Number of Matches":/0/.toString())
        //Set Search in Group List
        new actions.SetupUsers.SetSearchinGroupList().run("Group Name":/A_TESTING_GROUP1/.toString())
        //Verify Groups in the List
        new actions.SetupUsers.VerifyGroupsintheList().run("Navigate to Groups Tab":false,"Group Name":/ZTesting Group1/.toString(),"Number of Matches":/0/.toString())
        //Verify Groups in the List
        new actions.SetupUsers.VerifyGroupsintheList().run("Navigate to Groups Tab":false,"Group Name":/A_TESTING_GROUP1/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Groups in the List
        new actions.SetupUsers.VerifyGroupsintheList().run("Navigate to Groups Tab":false,"Group Name":/Stop the Spill [Training Challenge]/.toString(),"Number of Matches":/0/.toString())
        //Verify Groups in the List
        new actions.SetupUsers.VerifyGroupsintheList().run("Navigate to Groups Tab":false,"Group Name":/New Group/.toString(),"Number of Matches":/0/.toString())
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