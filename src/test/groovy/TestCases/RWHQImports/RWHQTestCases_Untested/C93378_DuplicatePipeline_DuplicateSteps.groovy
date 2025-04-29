package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C93378 - Duplicate Pipeline - Duplicate Steps
class C93378_DuplicatePipeline_DuplicateSteps
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
        new actions.SetupUsers.SetGroupinSetup().run("Group Name":/test group1/.toString(),"User":/Pipeline Admin,Moderator,analyst,Evaluator,Pipeline Sponsor/.toString(),"Add or Remove":/Add,Add,Add,Add,Add/.toString(),"Action":/Create Group/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Create Step in Pipeline Steps page
        new actions.PipelineStepsView.CreateStepinPipelineStepspage().run("Create Stage Stage Name":/New Stage1/.toString(),"Action":/Create/.toString())
        //Create Step in Pipeline Steps page
        new actions.PipelineStepsView.CreateStepinPipelineStepspage().run("Step Name":/Scorecard1/.toString(),"Select Tool Type":/Scorecard/.toString(),"Select Stage":/New Stage1/.toString(),"Action":/Create/.toString())
        //Configure Scorecard Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureScorecardStepinNewModalinPipelineStepspage().run("Individual Assignment User":/test group1 (5  members),End User/.toString(),"Individual Assignment User Add or Remove":/Add,Add/.toString(),"Action":/Activate/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Duplicate Webstorm
        new actions.WebstormCreation.CreateDuplicateWebstorm().run("Pipeline To Duplicate":/Custom App/.toString(),"Name":/Copy Custom App Pipeline/.toString(),"Description":/Desc/.toString(),"Action":/Duplicate/.toString(),"Should Admin Wait for Pipeline to be Created":true)
        //Verify Step in Pipeline Steps page
        new actions.PipelineStepsView.VerifyStepinPipelineStepspage().run("Step Name":/Review/.toString(),"Stage Name step belongs to":/Collection/.toString(),"Number of Ideas in a step":/0/.toString(),"Number of Matches":/1/.toString())
        //Verify Step in Pipeline Steps page
        new actions.PipelineStepsView.VerifyStepinPipelineStepspage().run("Step Name":/Single Scale/.toString(),"Stage Name step belongs to":/Evaluation/.toString(),"Number of Ideas in a step":/0/.toString(),"Number of Matches":/1/.toString())
        //Verify Step in Pipeline Steps page
        new actions.PipelineStepsView.VerifyStepinPipelineStepspage().run("Step Name":/Scorecarding/.toString(),"Stage Name step belongs to":/Evaluation/.toString(),"Number of Ideas in a step":/0/.toString(),"Number of Matches":/1/.toString())
        //Verify Step in Pipeline Steps page
        new actions.PipelineStepsView.VerifyStepinPipelineStepspage().run("Step Name":/Stack Rank/.toString(),"Stage Name step belongs to":/Selection/.toString(),"Number of Ideas in a step":/0/.toString(),"Number of Matches":/1/.toString())
        //Verify Step in Pipeline Steps page
        new actions.PipelineStepsView.VerifyStepinPipelineStepspage().run("Step Name":/Project Prep/.toString(),"Stage Name step belongs to":/Implementation/.toString(),"Number of Ideas in a step":/0/.toString(),"Number of Matches":/1/.toString())
        //Verify Step in Pipeline Steps page
        new actions.PipelineStepsView.VerifyStepinPipelineStepspage().run("Step Name":/Development/.toString(),"Stage Name step belongs to":/Implementation/.toString(),"Number of Ideas in a step":/0/.toString(),"Number of Matches":/1/.toString())
        //Verify Step in Pipeline Steps page
        new actions.PipelineStepsView.VerifyStepinPipelineStepspage().run("Step Name":/Pairwise/.toString(),"Stage Name step belongs to":/Completion/.toString(),"Number of Ideas in a step":/0/.toString(),"Number of Matches":/1/.toString())
        //Verify Step in Pipeline Steps page
        new actions.PipelineStepsView.VerifyStepinPipelineStepspage().run("Step Name":/Completed/.toString(),"Stage Name step belongs to":/Completion/.toString(),"Number of Ideas in a step":/0/.toString(),"Number of Matches":/1/.toString())
        //Verify Step in Pipeline Steps page
        new actions.PipelineStepsView.VerifyStepinPipelineStepspage().run("Step Name":/Judging/.toString(),"Stage Name step belongs to":/Completion/.toString(),"Number of Ideas in a step":/0/.toString(),"Number of Matches":/1/.toString())
        //Verify Step in Pipeline Steps page
        new actions.PipelineStepsView.VerifyStepinPipelineStepspage().run("Step Name":/Scorecard1/.toString(),"Stage Name step belongs to":/New Stage1/.toString(),"Number of Ideas in a step":/0/.toString(),"Step Status":/Configured/.toString(),"Number of Matches":/1/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/Idea1/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Idea1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Scorecard1/.toString(),"Action":/Change Step/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/View All/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Verify in Which List (optional)":/My Action Items/.toString(),"Title":/Idea1/.toString(),"Step":/Scorecard1/.toString(),"Type":/Scorecard/.toString(),"Number of Matches":/1/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/pipelinesponsor@mailinator.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/View All/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Verify in Which List (optional)":/My Action Items/.toString(),"Title":/Idea1/.toString(),"Step":/Scorecard1/.toString(),"Type":/Scorecard/.toString(),"Number of Matches":/1/.toString())
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