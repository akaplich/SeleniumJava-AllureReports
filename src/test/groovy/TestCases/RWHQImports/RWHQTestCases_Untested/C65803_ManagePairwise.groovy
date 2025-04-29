package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C65803 - Manage Pairwise
class C65803_ManagePairwise
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
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Pairwise Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigurePairwiseinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Pairwise/.toString(),"Evaluators":/System Admin/.toString(),"Evaluators Add or Remove":/Add/.toString(),"Action":/Update/.toString())
        //Configure Pairwise Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigurePairwiseinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Pairwise/.toString(),"Evaluators":/End User/.toString(),"Evaluators Add or Remove":/Add/.toString(),"Action":/Update/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Quick Add Idea for Pairwise1/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Quick Add Idea for Pairwise2/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Quick Add Idea for Pairwise1/.toString(),"Step Name idea belongs to":/Review/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Pairwise/.toString(),"Action":/Change Step/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Quick Add Idea for Pairwise2/.toString(),"Step Name idea belongs to":/Review/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Pairwise/.toString(),"Action":/Change Step/.toString())
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/Pairwise/.toString())
        //Set Pairwise for Idea in Action Items page
        new actions.ActionItems.SetPairwiseforIdeainActionItemspage().run("Select Idea Name or Neither":/Quick Add Idea for Pairwise1/.toString(),"Action":/Complete/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Verify Action Items in Progress in Manage Step Page
        new actions.PipelineManageSteps.VerifyActionItemsinProgressinManageStep().run("Step Name to Manage (optional)":/Pairwise/.toString(),"Count to verify":/1\/2/.toString(),"Evaluator":/System Admin/.toString(),"Number of Matches":/1/.toString())
        //Verify Action Items in Progress in Manage Step Page
        new actions.PipelineManageSteps.VerifyActionItemsinProgressinManageStep().run("Count to verify":/1\/2/.toString(),"Evaluator":/End User/.toString(),"Number of Matches":/1/.toString())
        //Verify Currently in Step table for Manage Stack Rank and Pairwise
        new actions.PipelineManageSteps.VerifyCurrentlyinSteptableforManageStackRankandPairwise().run("Title":/Quick Add Idea for Pairwise1/.toString(),"Overall Rank":/1/.toString(),"Individual Evaluator Rating":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Currently in Step table for Manage Stack Rank and Pairwise
        new actions.PipelineManageSteps.VerifyCurrentlyinSteptableforManageStackRankandPairwise().run("Title":/Quick Add Idea for Pairwise2/.toString(),"Overall Rank":/2/.toString(),"Individual Evaluator Rating":/2/.toString(),"Number of Matches":/1/.toString())
        //Advance Idea to Next Step in Manage Step page
        new actions.PipelineManageSteps.AdvanceIdeatoNextStepinManageStep().run("Idea Name":/Quick Add Idea for Pairwise1/.toString(),"Action":/Advance Ideas/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Verify Step History for Manage Step
        new actions.PipelineManageSteps.VerifyStepHistoryinManageStep().run("Step Name (optional)":/Pairwise/.toString(),"Row Number":/1/.toString(),"Idea Name":/Quick Add Idea for Pairwise1/.toString(),"Number of Matches":/1/.toString())
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