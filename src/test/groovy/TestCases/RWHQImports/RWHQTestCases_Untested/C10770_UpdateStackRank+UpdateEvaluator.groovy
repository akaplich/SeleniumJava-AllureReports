package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C10770 - Update Stack Rank + Update Evaluator
class C10770_UpdateStackRank+UpdateEvaluator
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
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/stackrank idea1/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/stackrank idea1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Stack Rank/.toString(),"Action":/Change Step/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/stackrank idea2/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/stackrank idea2/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Stack Rank/.toString(),"Action":/Change Step/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/stackrank idea3/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/stackrank idea3/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Stack Rank/.toString(),"Action":/Change Step/.toString())
        //Configure Stack Rank Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureStackRankinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Stack Rank/.toString(),"Evaluators":/End User,Evaluator/.toString(),"Evaluators Add or Remove":/Add,Add/.toString(),"Action":/Update/.toString())
        //Configure Stack Rank Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureStackRankinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Stack Rank/.toString(),"Evaluators":/Evaluator/.toString(),"Evaluators Add or Remove":/Remove/.toString(),"Action":/Update/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Home/.toString())
        try{
            //Access Action Item in Actions Items Global Navigation
            new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/Stack Rank/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Initiative Home
        new actions.Webstorm.VerifyWebstormHome().run("Initiative Title":/Custom App/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/Stack Rank/.toString())
        //Set Stack Rank for Idea in Action Items page
        new actions.ActionItems.SetStackRankforIdeainActionItemspage().run("Idea":/stackrank idea2/.toString(),"New Order":/1/.toString())
        //Set Stack Rank for Idea in Action Items page
        new actions.ActionItems.SetStackRankforIdeainActionItemspage().run("Idea":/stackrank idea3/.toString(),"New Order":/2/.toString(),"Action":/Complete/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Action Items/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/Stack Rank/.toString(),"Number of Matches":/0/.toString())
        //Verify Completed table for Action Items page
        new actions.ActionItems.VerifyCompletedtableforActionItemspage().run("Completed Tab Value":/1/.toString(),"Title":/Stack Rank/.toString(),"Number of Matches":/1/.toString())
        //Access Action Item in My Action Items/Action Items Manager table
        new actions.ActionItems.AccessActionIteminMyActionItemsActionItemsManagertable().run("Access in Which List":/My Action Items/.toString(),"Title":/Stack Rank/.toString())
        //Verify Stack Rank for Idea in Action Items Page
        new actions.ActionItems.VerifyStackRankforIdeainActionItemsPage().run("Idea":/stackrank idea2/.toString(),"Rank":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Stack Rank for Idea in Action Items Page
        new actions.ActionItems.VerifyStackRankforIdeainActionItemsPage().run("Idea":/stackrank idea3/.toString(),"Rank":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Stack Rank for Idea in Action Items Page
        new actions.ActionItems.VerifyStackRankforIdeainActionItemsPage().run("Idea":/stackrank idea1/.toString(),"Rank":/3/.toString(),"Number of Matches":/1/.toString())
        //Set Stack Rank for Idea in Action Items page
        new actions.ActionItems.SetStackRankforIdeainActionItemspage().run("Idea":/stackrank idea1/.toString(),"New Order":/1/.toString(),"Action":/Update/.toString())
        //Verify Stack Rank for Idea in Action Items Page
        new actions.ActionItems.VerifyStackRankforIdeainActionItemsPage().run("Idea":/stackrank idea1/.toString(),"Rank":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Stack Rank for Idea in Action Items Page
        new actions.ActionItems.VerifyStackRankforIdeainActionItemsPage().run("Idea":/stackrank idea2/.toString(),"Rank":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Stack Rank for Idea in Action Items Page
        new actions.ActionItems.VerifyStackRankforIdeainActionItemsPage().run("Idea":/stackrank idea3/.toString(),"Rank":/3/.toString(),"Number of Matches":/1/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Access Pipeline Manage Steps for a Step
        new actions.PipelineStepsView.AccessPipelineManageStepsforaStep().run("Step Name":/Stack Rank/.toString())
        //Verify Currently in Step table for Manage Stack Rank and Pairwise
        new actions.PipelineManageSteps.VerifyCurrentlyinSteptableforManageStackRankandPairwise().run("Title":/stackrank idea1/.toString(),"Individual Evaluator Rating":/1/.toString(),"Number of Matches":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Access Pipeline Manage Steps for a Step
        new actions.PipelineStepsView.AccessPipelineManageStepsforaStep().run("Step Name":/Stack Rank/.toString())
        //Verify Currently in Step table for Manage Stack Rank and Pairwise
        new actions.PipelineManageSteps.VerifyCurrentlyinSteptableforManageStackRankandPairwise().run("Title":/stackrank idea2/.toString(),"Individual Evaluator Rating":/2/.toString(),"Number of Matches":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Access Pipeline Manage Steps for a Step
        new actions.PipelineStepsView.AccessPipelineManageStepsforaStep().run("Step Name":/Stack Rank/.toString())
        //Verify Currently in Step table for Manage Stack Rank and Pairwise
        new actions.PipelineManageSteps.VerifyCurrentlyinSteptableforManageStackRankandPairwise().run("Title":/stackrank idea3/.toString(),"Individual Evaluator Rating":/3/.toString(),"Number of Matches":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Access Pipeline Manage Steps for a Step
        new actions.PipelineStepsView.AccessPipelineManageStepsforaStep().run("Step Name":/Stack Rank/.toString())
        //Verify Currently in Step table for Manage Stack Rank and Pairwise
        new actions.PipelineManageSteps.VerifyCurrentlyinSteptableforManageStackRankandPairwise().run("Title":/stackrank idea1/.toString(),"Individual Evaluator Rating":/1/.toString(),"Number of Matches":/1/.toString())
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