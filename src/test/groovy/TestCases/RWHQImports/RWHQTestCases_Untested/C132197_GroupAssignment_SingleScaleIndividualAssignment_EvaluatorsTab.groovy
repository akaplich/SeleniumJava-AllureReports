import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C132197 - Group Assignment - Single Scale Individual Assignment - Evaluators Tab
class C132197_GroupAssignment_SingleScaleIndividualAssignment_EvaluatorsTab
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
        //Delete this Action when View Idea 30 is Enabled
        Action6018a1600aed291c14413fd2([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Navigate to Groups Tab":true,"Create Edit or Delete":/Create/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("Group Name":/test group1/.toString(),"User":/Pipeline Admin,Moderator,analyst,End User,End User 2/.toString(),"Add or Remove":/Add,Add,Add,Add,Add/.toString(),"Action":/Create Group/.toString())
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Navigate to Groups Tab":false,"Create Edit or Delete":/Create/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("Group Name":/test group2/.toString(),"User":/Evaluator,End User 2/.toString(),"Add or Remove":/Add,Add/.toString(),"Action":/Create Group/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Single Scale Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureSingleScaleStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Single Scale/.toString(),"Assignment Method":/Individual Assignment/.toString(),"Individual Assignment User":/test group1 (5  members),test group2 (2  members)/.toString(),"Individual Assignment User Add or Remove":/Add,Add/.toString(),"Evaluators Count":/54/.toString(),"Evaluation Results":true,"Display on Submissions Evaluation tab when:":/First Action Item for the Submission is complete/.toString(),"Action":/Update/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/single scale idea/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/single scale idea/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Single Scale/.toString(),"Action":/Change Step/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/pipelineadmin@test.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/single scale idea/.toString())
        //Set Single Scale for Idea in Action Items page
        new actions.ActionItems.SetSingleScaleforIdeainActionItemspage().run("What is your initial impression of this idea":/6/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/single scale idea/.toString())
        //Set Single Scale for Idea in Action Items page
        new actions.ActionItems.SetSingleScaleforIdeainActionItemspage().run("What is your initial impression of this idea":/3/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Navigate to Groups Tab":true,"Create Edit or Delete":/Edit/.toString(),"Group Name to Edit or Delete":/test group1/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("User":/Community Admin/.toString(),"Add or Remove":/Add/.toString(),"Action":/Update/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Access Idea in Pipeline Steps View
        new actions.PipelineStepsView.AccessIdeainPipelineStepsView().run("Idea Name":/single scale idea/.toString())
        //Set Tab in View Idea 3
        new actions.ViewIdea30.SetTabinViewIdea3().run("Tab":/Evaluations/.toString())
        try{
            //Verify Evaluations Tab Ribbon in Vew Idea page
            new actions.ViewIdea.VerifyEvaluationstabRibboninVewIdeapage().run("Overall Score":/4.5 Overall Score/.toString(),"Total Evaluation":/50 Percentile of 1 Submission/.toString(),"Completed Evaluation":/2 \/ 7 Evaluations Completed/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Evaluations Tab Chart on View Idea
        new actions.ViewIdea.VerifyEvaluationsTabChartonViewIdea().run("Should Chart Exist":true,"Number of Matches":/1/.toString())
        //Set Scrolling on Page to Top or Bottom
        new actions.Utils.ScrollPagetoToporBottom().run("Top or Bottom":/Bottom/.toString())
        //Verify Evaluators List With Score on Evaluation Tab
        new actions.ViewIdea.VerifyEvaluatorsListWithScoreonEvaluationTab().run("Placement Number of Evaluator":/1/.toString(),"Evaluator Name":/Pipeline Admin/.toString(),"Score":/6/.toString())
        //Verify Evaluators List With Score on Evaluation Tab
        new actions.ViewIdea.VerifyEvaluatorsListWithScoreonEvaluationTab().run("Placement Number of Evaluator":/2/.toString(),"Evaluator Name":/Evaluator/.toString(),"Score":/3/.toString())
        //Verify Evaluators List With Score on Evaluation Tab
        new actions.ViewIdea.VerifyEvaluatorsListWithScoreonEvaluationTab().run("Evaluator Name":/analyst/.toString(),"Score":/-/.toString(),"Member Initial":/A/.toString())
        //Verify Evaluators List With Score on Evaluation Tab
        new actions.ViewIdea.VerifyEvaluatorsListWithScoreonEvaluationTab().run("Evaluator Name":/Moderator/.toString(),"Score":/-/.toString(),"Member Initial":/M/.toString())
        //Verify Evaluators List With Score on Evaluation Tab
        new actions.ViewIdea.VerifyEvaluatorsListWithScoreonEvaluationTab().run("Evaluator Name":/Community Admin/.toString(),"Score":/-/.toString(),"Member Initial":/C/.toString())
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
    //Delete this Action when View Idea 30 is Enabled
    public static def Action6018a1600aed291c14413fd2(def params){
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Ideas tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforIdeastab().run("View Idea 3.0":true,"Business impact tab":true)

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