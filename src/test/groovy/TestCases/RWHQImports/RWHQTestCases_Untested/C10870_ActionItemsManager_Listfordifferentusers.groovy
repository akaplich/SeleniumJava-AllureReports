import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C10870 - Action Items Manager - List for different users
class C10870_ActionItemsManager_Listfordifferentusers
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
        Action58123c20fa4ee77809f468f6("Username Email":/moderator@test.com/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/View All/.toString())
        //Verify All table for Action Items page
        new actions.ActionItems.VerifyAlltableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Title":/test idea1/.toString(),"Number of Matches":/1/.toString())
        //Verify All table for Action Items page
        new actions.ActionItems.VerifyAlltableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Title":/quick add1/.toString(),"Number of Matches":/1/.toString())
        //Verify All table for Action Items page
        new actions.ActionItems.VerifyAlltableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Title":/test idea2/.toString(),"Number of Matches":/1/.toString())
        //Verify All table for Action Items page
        new actions.ActionItems.VerifyAlltableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Title":/eval idea 1/.toString(),"Number of Matches":/1/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/pipelineadmin@test.com/.toString(),"Password":/brightidea1/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/View All/.toString())
        //Verify All table for Action Items page
        new actions.ActionItems.VerifyAlltableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Title":/test idea1/.toString(),"Number of Matches":/1/.toString())
        //Verify All table for Action Items page
        new actions.ActionItems.VerifyAlltableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Title":/test idea2/.toString(),"Number of Matches":/1/.toString())
        //Verify All table for Action Items page
        new actions.ActionItems.VerifyAlltableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Title":/quick add1/.toString(),"Number of Matches":/1/.toString())
        //Verify All table for Action Items page
        new actions.ActionItems.VerifyAlltableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Title":/eval idea 1/.toString(),"Number of Matches":/1/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/View All/.toString())
        //Verify All table for Action Items page
        new actions.ActionItems.VerifyAlltableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Title":/test idea1/.toString(),"Number of Matches":/1/.toString())
        //Verify All table for Action Items page
        new actions.ActionItems.VerifyAlltableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Title":/test idea2/.toString(),"Number of Matches":/1/.toString())
        //Verify All table for Action Items page
        new actions.ActionItems.VerifyAlltableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Title":/quick add1/.toString(),"Number of Matches":/1/.toString())
        //Verify All table for Action Items page
        new actions.ActionItems.VerifyAlltableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Title":/eval idea 1/.toString(),"Number of Matches":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Setup/.toString())
        //Set Roles in Pipeline Setup Page
        new actions.PipelineSetup.SetRolesinPipelineSetupPage().run("Navigate to Tab":true,"Administrators":/Pipeline Admin/.toString(),"Administrators Add or Remove":/Remove/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Remove/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/moderator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/View All/.toString())
        //Verify All table for Action Items page
        new actions.ActionItems.VerifyAlltableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Title":/test idea1/.toString(),"Number of Matches":/0/.toString())
        //Verify All table for Action Items page
        new actions.ActionItems.VerifyAlltableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Title":/test idea2/.toString(),"Number of Matches":/0/.toString())
        //Verify All table for Action Items page
        new actions.ActionItems.VerifyAlltableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Title":/quick add1/.toString(),"Number of Matches":/0/.toString())
        //Verify All table for Action Items page
        new actions.ActionItems.VerifyAlltableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Title":/eval idea 1/.toString(),"Number of Matches":/1/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/pipelineadmin@test.com/.toString(),"Password":/brightidea1/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/View All/.toString())
        //Verify All table for Action Items page
        new actions.ActionItems.VerifyAlltableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Title":/test idea1/.toString(),"Number of Matches":/0/.toString())
        //Verify All table for Action Items page
        new actions.ActionItems.VerifyAlltableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Title":/test idea2/.toString(),"Number of Matches":/0/.toString())
        //Verify All table for Action Items page
        new actions.ActionItems.VerifyAlltableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Title":/quick add1/.toString(),"Number of Matches":/0/.toString())
        //Verify All table for Action Items page
        new actions.ActionItems.VerifyAlltableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Title":/eval idea 1/.toString(),"Number of Matches":/1/.toString())
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