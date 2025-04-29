import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132194 - Group Assignment - Scorecard Individual Assignment
class C132194_GroupAssignment_ScorecardIndividualAssignment
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
        new actions.SetupUsers.SetGroupinSetup().run("Group Name":/test group1/.toString(),"User":/Pipeline Admin,Moderator,analyst/.toString(),"Add or Remove":/Add,Add,Add/.toString(),"Action":/Create Group/.toString())
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Navigate to Groups Tab":false,"Create Edit or Delete":/Create/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("Group Name":/test group2/.toString(),"User":/Pipeline Admin,Evaluator/.toString(),"Add or Remove":/Add,Add/.toString(),"Action":/Create Group/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Scorecard Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureScorecardStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Scorecarding/.toString(),"Individual Assignment User":/test group1 (3  members),test group2 (2  members)/.toString(),"Individual Assignment User Add or Remove":/Add,Add/.toString(),"Evaluators Count":/56/.toString())
        //Configure Scorecard Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureScorecardStepinNewModalinPipelineStepspage().run("Action":/Update/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/scorecard idea1/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/scorecard idea1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Scorecarding/.toString(),"Action":/Change Step/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/pipelineadmin@test.com/.toString(),"Password":/brightidea1/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/scorecard idea1/.toString())
        //Set General Evaluation Scorecard for Idea in Action Items page
        new actions.ActionItems.SetGeneralEvaluationScorecardforIdeainActionItemspage().run("What is the strategic impact":/High/.toString(),"What is the likely timeframe to implement":/1-3 months/.toString(),"What is the estimated level of enterprise":/High/.toString(),"What resource level would need to be dedicated":/less than 1/.toString(),"What is the revenue potential of the idea":/Less than $1M/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/analyst@test.com/.toString(),"Password":/brightidea1/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/scorecard idea1/.toString())
        //Set General Evaluation Scorecard for Idea in Action Items page
        new actions.ActionItems.SetGeneralEvaluationScorecardforIdeainActionItemspage().run("What is the strategic impact":/Med/.toString(),"What is the likely timeframe to implement":/1-3 months/.toString(),"What is the estimated level of enterprise":/High/.toString(),"What resource level would need to be dedicated":/4-6/.toString(),"What is the revenue potential of the idea":/Greater than $5M/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Verify Action Items in Progress in Manage Step Page
        new actions.PipelineManageSteps.VerifyActionItemsinProgressinManageStep().run("Step Name to Manage (optional)":/Scorecarding/.toString(),"Count to verify":/2\/4/.toString(),"Row Number":/1/.toString(),"Evaluator":/analyst/.toString(),"Evaluator in group":true,"Number of assigned items":/1/.toString(),"Number of remaining items":/0/.toString(),"Percent Complete Bar - Completed":/100%/.toString(),"Number of Matches":/1/.toString())
        //Verify Action Items in Progress in Manage Step Page
        new actions.PipelineManageSteps.VerifyActionItemsinProgressinManageStep().run("Row Number":/2/.toString(),"Evaluator":/Evaluator/.toString(),"Evaluator in group":true,"Number of assigned items":/1/.toString(),"Number of remaining items":/1/.toString(),"Percent Complete Bar - Completed":/0%/.toString(),"Number of Matches":/1/.toString())
        //Verify Action Items in Progress in Manage Step Page
        new actions.PipelineManageSteps.VerifyActionItemsinProgressinManageStep().run("Row Number":/3/.toString(),"Evaluator":/Moderator/.toString(),"Evaluator in group":true,"Number of assigned items":/1/.toString(),"Number of remaining items":/1/.toString(),"Percent Complete Bar - Completed":/0%/.toString(),"Number of Matches":/1/.toString())
        //Verify Action Items in Progress in Manage Step Page
        new actions.PipelineManageSteps.VerifyActionItemsinProgressinManageStep().run("Row Number":/4/.toString(),"Evaluator":/Pipeline Admin/.toString(),"Evaluator in group":true,"Number of assigned items":/1/.toString(),"Number of remaining items":/0/.toString(),"Percent Complete Bar - Completed":/100%/.toString(),"Number of Matches":/1/.toString())
        //Verify Currently in Step Table for Manage Scorecard
        new actions.PipelineManageSteps.VerifyCurrentlyinStepTableforManageScorecard().run("Idea Name":/scorecard idea1/.toString(),"Overall Score":/71.74/.toString(),"Percentile":/0/.toString(),"Variance":/4.71/.toString(),"Comment Count":/0/.toString(),"Vote Score":/1/.toString(),"Views":/0/.toString(),"Evaluators":/Evaluator,Moderator,Pipeline Admin,analyst/.toString(),"Individual Evaluator Score":/?,?,69.57,73.91/.toString(),"Number of Matches":/1/.toString())
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