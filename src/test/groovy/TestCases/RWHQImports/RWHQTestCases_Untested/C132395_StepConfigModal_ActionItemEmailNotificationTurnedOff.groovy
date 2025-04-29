import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132395 - Step Config Modal - Action Item Email Notification Turned Off
class C132395_StepConfigModal_ActionItemEmailNotificationTurnedOff
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
        //Create Mailinator User
        new actions.Mailinator.CreateMailinatorUser().run("Email":/brightC132395_1/.toString(),"Finally Login as What User":/bi.adminuser1@brightidea.com/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Single Scale Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureSingleScaleStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Single Scale/.toString(),"Individual Assignment User":/Autofirst Autolast/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Email Alert":false,"Action":/Update/.toString())
        //Create Step in Pipeline Steps page
        new actions.PipelineStepsView.CreateStepinPipelineStepspage().run("Step Name":/Single Scale Email Off/.toString(),"Select Tool Type":/Single Scale/.toString(),"Select Stage":/Collection/.toString(),"Action":/Create/.toString())
        //Configure Single Scale Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureSingleScaleStepinNewModalinPipelineStepspage().run("Individual Assignment User":/Autofirst Autolast/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Email Alert":true,"Action":/Activate/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/Quick add for single scale email on/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Quick add for single scale email on/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Single Scale/.toString(),"Action":/Change Step/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/Quick add for single scale email off/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Quick add for single scale email off/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Single Scale Email Off/.toString(),"Action":/Change Step/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Action Items Manager/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Title":/Quick add for single scale email on/.toString(),"Assignee":/Auto/.toString(),"Status":/Open/.toString(),"Step":/Single Scale/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Title":/Quick add for single scale email off/.toString(),"Assignee":/Auto/.toString(),"Status":/Open/.toString(),"Step":/Single Scale Email Off/.toString(),"Number of Matches":/1/.toString())
        //Verify Email
        new actions.Mailinator.VerifyEmail().run("Email Address":/brightC132395_1/.toString(),"Subject":/Single Scale: You have 1 new Action Items/.toString(),"Email Should Be Received":true)
        //Verify Email
        new actions.Mailinator.VerifyEmail().run("Email Address":/brightC132395_1/.toString(),"Subject":/Single Scale Email Off: You have 1 new Action Items/.toString(),"Email Should Be Received":false)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Action Items Manager/.toString())
        //Set Actions Dropdown in the Action Items Manager
        new actions.ActionItemsManager.SetActionsDropdownintheActionItemsManager().run("Select Ideas":/Quick add for single scale email on/.toString(),"Tool Type":/Single Scale/.toString(),"Assignee":/Auto/.toString(),"Check":/TRUE/.toString(),"Action":/Cancel/.toString(),"Sub Action":/Cancel Action Item/.toString())
        //Set Actions Dropdown in the Action Items Manager
        new actions.ActionItemsManager.SetActionsDropdownintheActionItemsManager().run("Select Ideas":/Quick add for single scale email off/.toString(),"Tool Type":/Single Scale/.toString(),"Assignee":/Auto/.toString(),"Check":/TRUE/.toString(),"Action":/Cancel/.toString(),"Sub Action":/Cancel Action Item/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Action Items Manager/.toString())
        //Verify Canceled table for Action Items Manager
        new actions.ActionItemsManager.VerifyCanceledtableforActionItemsManager().run("Canceled Tab Value":/2/.toString(),"Title":/Quick add for single scale email on/.toString(),"Category":/Quick Add/.toString(),"Assignee":/Auto/.toString(),"Step":/Single Scale/.toString(),"Tool Type":/Single Scale/.toString(),"Number of Matches":/1/.toString(),"Verify in Which List (optional)":/Action Items Manager/.toString())
        //Verify Canceled table for Action Items Manager
        new actions.ActionItemsManager.VerifyCanceledtableforActionItemsManager().run("Canceled Tab Value":/2/.toString(),"Title":/Quick add for single scale email off/.toString(),"Category":/Quick Add/.toString(),"Assignee":/Auto/.toString(),"Step":/Single Scale Email Off/.toString(),"Tool Type":/Single Scale/.toString(),"Number of Matches":/1/.toString(),"Verify in Which List (optional)":/Action Items Manager/.toString())
        //Set Actions Dropdown in the Action Items Manager
        new actions.ActionItemsManager.SetActionsDropdownintheActionItemsManager().run("Select Ideas":/Quick add for single scale email on/.toString(),"Tool Type":/Single Scale/.toString(),"Assignee":/Auto/.toString(),"Check":/TRUE/.toString(),"Action":/Reopen/.toString(),"Sub Action":/Reopen Action Item/.toString())
        //Set Actions Dropdown in the Action Items Manager
        new actions.ActionItemsManager.SetActionsDropdownintheActionItemsManager().run("Select Ideas":/Quick add for single scale email off/.toString(),"Tool Type":/Single Scale/.toString(),"Assignee":/Auto/.toString(),"Check":/TRUE/.toString(),"Action":/Reopen/.toString(),"Sub Action":/Reopen Action Item/.toString())
        //Verify Email
        new actions.Mailinator.VerifyEmail().run("Email Address":/brightC132395_1/.toString(),"Subject":/Single Scale: 1 of your action item(s) have been reopened./.toString(),"Email Should Be Received":true)
        //Verify Email
        new actions.Mailinator.VerifyEmail().run("Email Address":/brightC132395_1/.toString(),"Subject":/Single Scale Email Off: 1 of your action item(s) have been reopened./.toString(),"Email Should Be Received":false)
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