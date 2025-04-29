import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132260 - Group Assignment - Add Members by User Import
class C132260_GroupAssignment_AddMembersbyUserImport
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
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Navigate to Groups Tab":true,"Create Edit or Delete":/Create/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("Group Name":/Import Group/.toString(),"User":/Pipeline Admin,Moderator/.toString(),"Add or Remove":/Add,Add/.toString(),"Action":/Create Group/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Scorecard Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureScorecardStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Scorecarding/.toString(),"Assignment Method":/Individual Assignment/.toString(),"Individual Assignment User":/Import Group (2  members)/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Action":/Update/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/scorecard idea/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/scorecard idea/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Scorecarding/.toString(),"Action":/Change Step/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Import User in People page
        new actions.People.ImportUserinPeoplepage().run("Import File":/TestCaseC132260.xls/.toString(),"Action":/Import/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Enterprise or Site":/Enterprise/.toString(),"Navigate to Groups Tab":true,"Create Edit or Delete":/Edit/.toString(),"Group Name to Edit or Delete":/Import Group/.toString())
        //Verify User in Group Modal
        new actions.SetupUsers.VerifyUserinGroupModal().run("User in Left or Right Rail":/Right/.toString(),"User":/Pipeline Admin/.toString(),"Image":false,"Number of Matches":/1/.toString())
        //Verify User in Group Modal
        new actions.SetupUsers.VerifyUserinGroupModal().run("User in Left or Right Rail":/Right/.toString(),"User":/Moderator/.toString(),"Image":false,"Number of Matches":/1/.toString())
        //Verify User in Group Modal
        new actions.SetupUsers.VerifyUserinGroupModal().run("User in Left or Right Rail":/Right/.toString(),"User":/Example User 1/.toString(),"Image":false,"Number of Matches":/1/.toString())
        //Verify User in Group Modal
        new actions.SetupUsers.VerifyUserinGroupModal().run("User in Left or Right Rail":/Right/.toString(),"User":/Example User 2/.toString(),"Image":false,"Number of Matches":/1/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("Action":/Update/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/scorecard idea two/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/scorecard idea/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Scorecarding/.toString(),"Action":/Change Step/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Action Items Manager/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Open Tab Value":/9/.toString(),"Title":/test idea1/.toString(),"Category":/New Product/.toString(),"Assignee":/System Admin/.toString(),"Status":/Open/.toString(),"Step":/Review/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Open Tab Value":/9/.toString(),"Title":/test idea2/.toString(),"Category":/Operations/.toString(),"Assignee":/System Admin/.toString(),"Status":/Open/.toString(),"Step":/Review/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Open Tab Value":/9/.toString(),"Title":/quick add1/.toString(),"Category":/Quick Add/.toString(),"Assignee":/System Admin/.toString(),"Status":/Open/.toString(),"Step":/Review/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Open Tab Value":/9/.toString(),"Title":/scorecard idea/.toString(),"Category":/Quick Add/.toString(),"Assignee":/Pipeline Admin/.toString(),"Status":/Open/.toString(),"Step":/Scorecarding/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Open Tab Value":/9/.toString(),"Title":/scorecard idea/.toString(),"Category":/Quick Add/.toString(),"Assignee":/Moderator/.toString(),"Status":/Open/.toString(),"Step":/Scorecarding/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Open Tab Value":/9/.toString(),"Title":/scorecard idea two/.toString(),"Category":/Quick Add/.toString(),"Assignee":/Moderator/.toString(),"Status":/Open/.toString(),"Step":/Scorecarding/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Open Tab Value":/9/.toString(),"Title":/scorecard idea two/.toString(),"Category":/Quick Add/.toString(),"Assignee":/Pipeline Admin/.toString(),"Status":/Open/.toString(),"Step":/Scorecarding/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Open Tab Value":/9/.toString(),"Title":/scorecard idea two/.toString(),"Category":/Quick Add/.toString(),"Assignee":/Example User 1/.toString(),"Status":/Open/.toString(),"Step":/Scorecarding/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Open Tab Value":/9/.toString(),"Title":/scorecard idea two/.toString(),"Category":/Quick Add/.toString(),"Assignee":/Example User 2/.toString(),"Status":/Open/.toString(),"Step":/Scorecarding/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Open Tab Value":/9/.toString(),"Title":/scorecard idea/.toString(),"Category":/Quick Add/.toString(),"Assignee":/Example User 1/.toString(),"Status":/Open/.toString(),"Step":/Scorecarding/.toString(),"Number of Matches":/0/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Open Tab Value":/9/.toString(),"Title":/scorecard idea/.toString(),"Category":/Quick Add/.toString(),"Assignee":/Example User 2/.toString(),"Status":/Open/.toString(),"Step":/Scorecarding/.toString(),"Number of Matches":/0/.toString())
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