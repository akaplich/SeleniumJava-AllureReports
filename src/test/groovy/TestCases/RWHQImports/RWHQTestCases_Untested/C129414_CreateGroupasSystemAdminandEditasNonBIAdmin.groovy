import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C129414 - Create Group as System Admin and Edit as NonBI Admin
class C129414_CreateGroupasSystemAdminandEditasNonBIAdmin
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
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Enterprise or Site":/Site/.toString(),"Navigate to Groups Tab":true,"Create Edit or Delete":/Create/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("Group Name":/CustomApp/.toString(),"User":/End User,NonBI System Admin,Pipeline Sponsor/.toString(),"Add or Remove":/Add,Add,Add/.toString(),"Action":/Create Group/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/nonbisysadmin@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Enterprise or Site":/Site/.toString(),"Navigate to Groups Tab":true,"Create Edit or Delete":/Edit/.toString(),"Group Name to Edit or Delete":/CustomApp/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("User":/Evaluator,End User/.toString(),"Add or Remove":/Add,Remove/.toString())
        //Verify User in Group Modal
        new actions.SetupUsers.VerifyUserinGroupModal().run("User in Left or Right Rail":/Right/.toString(),"User":/NonBI System Admin/.toString(),"Number of Matches":/1/.toString())
        //Verify User in Group Modal
        new actions.SetupUsers.VerifyUserinGroupModal().run("User in Left or Right Rail":/Right/.toString(),"User":/Pipeline Sponsor/.toString(),"Number of Matches":/1/.toString())
        //Verify User in Group Modal
        new actions.SetupUsers.VerifyUserinGroupModal().run("User in Left or Right Rail":/Right/.toString(),"User":/Evaluator/.toString(),"Image":false,"Number of Matches":/1/.toString())
        //Verify User in Group Modal
        new actions.SetupUsers.VerifyUserinGroupModal().run("User in Left or Right Rail":/Right/.toString(),"User":/End User/.toString(),"Number of Matches":/0/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("Action":/Update/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Go to Community
        new actions.SetupEnterpriseCommunities.GotoCommunity().run("Community Name to go to":/Developers Community/.toString())
        //Navigate Community
        new actions.SetupEnterpriseCommunities.NavigateCommunity().run("Community Page":/Setup/.toString())
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Enterprise or Site":/Enterprise/.toString(),"Navigate to Groups Tab":true,"Create Edit or Delete":/Edit/.toString(),"Group Name to Edit or Delete":/CustomApp/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("User":/End User/.toString(),"Add or Remove":/Add/.toString())
        //Verify User in Group Modal
        new actions.SetupUsers.VerifyUserinGroupModal().run("User in Left or Right Rail":/Right/.toString(),"User":/NonBI System Admin/.toString(),"Number of Matches":/1/.toString())
        //Verify User in Group Modal
        new actions.SetupUsers.VerifyUserinGroupModal().run("User in Left or Right Rail":/Right/.toString(),"User":/Pipeline Sponsor/.toString(),"Number of Matches":/1/.toString())
        //Verify User in Group Modal
        new actions.SetupUsers.VerifyUserinGroupModal().run("User in Left or Right Rail":/Right/.toString(),"User":/Evaluator/.toString(),"Image":false,"Number of Matches":/1/.toString())
        //Verify User in Group Modal
        new actions.SetupUsers.VerifyUserinGroupModal().run("User in Left or Right Rail":/Right/.toString(),"User":/End User/.toString(),"Number of Matches":/1/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("Action":/Update/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Enterprise or Site":/Enterprise/.toString(),"Navigate to Groups Tab":true,"Create Edit or Delete":/Edit/.toString(),"Group Name to Edit or Delete":/CustomApp/.toString())
        //Verify User in Group Modal
        new actions.SetupUsers.VerifyUserinGroupModal().run("User in Left or Right Rail":/Right/.toString(),"User":/NonBI System Admin/.toString(),"Number of Matches":/1/.toString())
        //Verify User in Group Modal
        new actions.SetupUsers.VerifyUserinGroupModal().run("User in Left or Right Rail":/Right/.toString(),"User":/Pipeline Sponsor/.toString(),"Number of Matches":/1/.toString())
        //Verify User in Group Modal
        new actions.SetupUsers.VerifyUserinGroupModal().run("User in Left or Right Rail":/Right/.toString(),"User":/Evaluator/.toString(),"Image":false,"Number of Matches":/1/.toString())
        //Verify User in Group Modal
        new actions.SetupUsers.VerifyUserinGroupModal().run("User in Left or Right Rail":/Right/.toString(),"User":/End User/.toString(),"Number of Matches":/1/.toString())
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