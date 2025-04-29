import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132144 - Group Creation - Sorting and Searching with 20+ groups
class C132144_GroupCreation_SortingandSearchingwith20_groups
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
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Navigate to Groups Tab":false,"Create Edit or Delete":/Create/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("Group Name":/test1/.toString(),"User":/Pipeline Admin/.toString(),"Add or Remove":/Add/.toString(),"Action":/Create Group/.toString())
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Navigate to Groups Tab":false,"Create Edit or Delete":/Create/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("Group Name":/1234/.toString(),"User":/Pipeline Admin/.toString(),"Add or Remove":/Add/.toString(),"Action":/Create Group/.toString())
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Navigate to Groups Tab":false,"Create Edit or Delete":/Create/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("Group Name":/Atesting/.toString(),"User":/Pipeline Admin/.toString(),"Add or Remove":/Add/.toString(),"Action":/Create Group/.toString())
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Navigate to Groups Tab":false,"Create Edit or Delete":/Create/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("Group Name":/aTESTING1/.toString(),"User":/Pipeline Admin/.toString(),"Add or Remove":/Add/.toString(),"Action":/Create Group/.toString())
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Navigate to Groups Tab":false,"Create Edit or Delete":/Create/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("Group Name":/test2/.toString(),"User":/Pipeline Admin/.toString(),"Add or Remove":/Add/.toString(),"Action":/Create Group/.toString())
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Navigate to Groups Tab":false,"Create Edit or Delete":/Create/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("Group Name":/test/.toString(),"User":/Pipeline Admin/.toString(),"Add or Remove":/Add/.toString(),"Action":/Create Group/.toString())
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Navigate to Groups Tab":false,"Create Edit or Delete":/Create/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("Group Name":/btesting/.toString(),"User":/Pipeline Admin,End User/.toString(),"Add or Remove":/Add,Add/.toString(),"Action":/Create Group/.toString())
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Navigate to Groups Tab":false,"Create Edit or Delete":/Create/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("Group Name":/$ZTECT/.toString(),"User":/Pipeline Admin,End User/.toString(),"Add or Remove":/Add,Add/.toString(),"Action":/Create Group/.toString())
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Navigate to Groups Tab":false,"Create Edit or Delete":/Create/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("Group Name":/@TESTING/.toString(),"User":/Pipeline Admin,End User/.toString(),"Add or Remove":/Add,Add/.toString(),"Action":/Create Group/.toString())
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Navigate to Groups Tab":false,"Create Edit or Delete":/Create/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("Group Name":/test3/.toString(),"User":/Pipeline Admin,End User/.toString(),"Add or Remove":/Add,Add/.toString(),"Action":/Create Group/.toString())
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Navigate to Groups Tab":false,"Create Edit or Delete":/Create/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("Group Name":/test4/.toString(),"User":/Pipeline Admin,End User/.toString(),"Add or Remove":/Add,Add/.toString(),"Action":/Create Group/.toString())
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Navigate to Groups Tab":false,"Create Edit or Delete":/Create/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("Group Name":/_test123/.toString(),"User":/Pipeline Admin,End User/.toString(),"Add or Remove":/Add,Add/.toString(),"Action":/Create Group/.toString())
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Navigate to Groups Tab":false,"Create Edit or Delete":/Create/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("Group Name":/c_test_143/.toString(),"User":/Pipeline Admin,End User/.toString(),"Add or Remove":/Add,Add/.toString(),"Action":/Create Group/.toString())
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Navigate to Groups Tab":false,"Create Edit or Delete":/Create/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("Group Name":/test5/.toString(),"User":/Pipeline Admin,End User/.toString(),"Add or Remove":/Add,Add/.toString(),"Action":/Create Group/.toString())
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Navigate to Groups Tab":false,"Create Edit or Delete":/Create/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("Group Name":/test6/.toString(),"User":/Pipeline Admin,End User/.toString(),"Add or Remove":/Add,Add/.toString(),"Action":/Create Group/.toString())
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Navigate to Groups Tab":false,"Create Edit or Delete":/Create/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("Group Name":/test7/.toString(),"User":/Pipeline Admin,End User/.toString(),"Add or Remove":/Add,Add/.toString(),"Action":/Create Group/.toString())
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Navigate to Groups Tab":false,"Create Edit or Delete":/Create/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("Group Name":/test8/.toString(),"User":/Pipeline Admin,End User/.toString(),"Add or Remove":/Add,Add/.toString(),"Action":/Create Group/.toString())
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Navigate to Groups Tab":false,"Create Edit or Delete":/Create/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("Group Name":/test9/.toString(),"User":/Pipeline Admin,End User/.toString(),"Add or Remove":/Add,Add/.toString(),"Action":/Create Group/.toString())
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Navigate to Groups Tab":false,"Create Edit or Delete":/Create/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("Group Name":/test10/.toString(),"User":/Pipeline Admin,End User/.toString(),"Add or Remove":/Add,Add/.toString(),"Action":/Create Group/.toString())
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Navigate to Groups Tab":false,"Create Edit or Delete":/Create/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("Group Name":/test11/.toString(),"User":/Pipeline Admin,End User/.toString(),"Add or Remove":/Add,Add/.toString(),"Action":/Create Group/.toString())
        //Verify Groups in the List
        new actions.SetupUsers.VerifyGroupsintheList().run("Navigate to Groups Tab":false,"Group Name":/$ZTECT/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Groups in the List
        new actions.SetupUsers.VerifyGroupsintheList().run("Navigate to Groups Tab":false,"Group Name":/1234/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Groups in the List
        new actions.SetupUsers.VerifyGroupsintheList().run("Navigate to Groups Tab":false,"Group Name":/@TESTING/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Groups in the List
        new actions.SetupUsers.VerifyGroupsintheList().run("Navigate to Groups Tab":false,"Group Name":/Atesting/.toString(),"Placement Number":/5/.toString(),"Number of Matches":/1/.toString())
        //Verify Groups in the List
        new actions.SetupUsers.VerifyGroupsintheList().run("Navigate to Groups Tab":false,"Group Name":/aTESTING1/.toString(),"Placement Number":/6/.toString(),"Number of Matches":/1/.toString())
        //Verify Groups in the List
        new actions.SetupUsers.VerifyGroupsintheList().run("Navigate to Groups Tab":false,"Group Name":/btesting/.toString(),"Placement Number":/7/.toString(),"Number of Matches":/1/.toString())
        //Verify Groups in the List
        new actions.SetupUsers.VerifyGroupsintheList().run("Navigate to Groups Tab":false,"Group Name":/c_test_143/.toString(),"Placement Number":/8/.toString(),"Number of Matches":/1/.toString())
        //Verify Groups in the List
        new actions.SetupUsers.VerifyGroupsintheList().run("Navigate to Groups Tab":false,"Group Name":/New Group/.toString(),"Placement Number":/9/.toString(),"Number of Matches":/1/.toString())
        //Verify Groups in the List
        new actions.SetupUsers.VerifyGroupsintheList().run("Navigate to Groups Tab":false,"Group Name":/Stop the Spill [Training Challenge]/.toString(),"Placement Number":/10/.toString(),"Number of Matches":/1/.toString())
        //Verify Groups in the List
        new actions.SetupUsers.VerifyGroupsintheList().run("Navigate to Groups Tab":false,"Group Name":/test/.toString(),"Placement Number":/11/.toString(),"Number of Matches":/1/.toString())
        //Verify Groups in the List
        new actions.SetupUsers.VerifyGroupsintheList().run("Navigate to Groups Tab":false,"Group Name":/test1/.toString(),"Placement Number":/12/.toString(),"Number of Matches":/1/.toString())
        //Verify Groups in the List
        new actions.SetupUsers.VerifyGroupsintheList().run("Navigate to Groups Tab":false,"Group Name":/test10/.toString(),"Placement Number":/13/.toString(),"Number of Matches":/1/.toString())
        //Verify Groups in the List
        new actions.SetupUsers.VerifyGroupsintheList().run("Navigate to Groups Tab":false,"Group Name":/test11/.toString(),"Placement Number":/14/.toString(),"Number of Matches":/1/.toString())
        //Verify Groups in the List
        new actions.SetupUsers.VerifyGroupsintheList().run("Navigate to Groups Tab":false,"Group Name":/test2/.toString(),"Placement Number":/15/.toString(),"Number of Matches":/1/.toString())
        //Verify Groups in the List
        new actions.SetupUsers.VerifyGroupsintheList().run("Navigate to Groups Tab":false,"Group Name":/test3/.toString(),"Placement Number":/16/.toString(),"Number of Matches":/1/.toString())
        //Verify Groups in the List
        new actions.SetupUsers.VerifyGroupsintheList().run("Navigate to Groups Tab":false,"Group Name":/test4/.toString(),"Placement Number":/17/.toString(),"Number of Matches":/1/.toString())
        //Verify Groups in the List
        new actions.SetupUsers.VerifyGroupsintheList().run("Navigate to Groups Tab":false,"Group Name":/test5/.toString(),"Placement Number":/18/.toString(),"Number of Matches":/1/.toString())
        //Verify Groups in the List
        new actions.SetupUsers.VerifyGroupsintheList().run("Navigate to Groups Tab":false,"Group Name":/test6/.toString(),"Placement Number":/19/.toString(),"Number of Matches":/1/.toString())
        //Verify Groups in the List
        new actions.SetupUsers.VerifyGroupsintheList().run("Navigate to Groups Tab":false,"Group Name":/test7/.toString(),"Placement Number":/20/.toString(),"Number of Matches":/1/.toString())
        //Verify Groups in the List
        new actions.SetupUsers.VerifyGroupsintheList().run("Navigate to Groups Tab":false,"Group Name":/test8/.toString(),"Placement Number":/21/.toString(),"Number of Matches":/1/.toString())
        //Verify Groups in the List
        new actions.SetupUsers.VerifyGroupsintheList().run("Navigate to Groups Tab":false,"Group Name":/test9/.toString(),"Placement Number":/22/.toString(),"Number of Matches":/1/.toString())
        //Verify Groups in the List
        new actions.SetupUsers.VerifyGroupsintheList().run("Navigate to Groups Tab":false,"Group Name":/ZTesting Group1/.toString(),"Placement Number":/23/.toString(),"Number of Matches":/1/.toString())
        //Verify Groups in the List
        new actions.SetupUsers.VerifyGroupsintheList().run("Navigate to Groups Tab":false,"Group Name":/_test123/.toString(),"Placement Number":/4/.toString(),"Number of Matches":/1/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Verify Groups in the List
        new actions.SetupUsers.VerifyGroupsintheList().run("Navigate to Groups Tab":true,"Group Name":/$ZTECT/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Set Search in Group List
        new actions.SetupUsers.SetSearchinGroupList().run("Group Name":/ZTesting GROUP/.toString())
        //Verify Groups in the List
        new actions.SetupUsers.VerifyGroupsintheList().run("Navigate to Groups Tab":false,"Group Name":/ZTesting Group1/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Groups in the List
        new actions.SetupUsers.VerifyGroupsintheList().run("Group Name":/New Group/.toString(),"Number of Matches":/0/.toString())
        //Set Search in Group List
        new actions.SetupUsers.SetSearchinGroupList().run("Clear Search":true)
        //Verify Groups in the List
        new actions.SetupUsers.VerifyGroupsintheList().run("Group Name":/New Group/.toString(),"Placement Number":/8/.toString(),"Number of Matches":/1/.toString())
        //Verify Groups in the List
        new actions.SetupUsers.VerifyGroupsintheList().run("Navigate to Groups Tab":false,"Group Name":/ZTesting Group1/.toString(),"Placement Number":/22/.toString(),"Number of Matches":/1/.toString())
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