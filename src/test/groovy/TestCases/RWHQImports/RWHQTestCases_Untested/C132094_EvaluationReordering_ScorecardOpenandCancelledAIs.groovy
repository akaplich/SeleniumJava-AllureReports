import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132094 - Evaluation Reordering - Scorecard Open and Cancelled AIs
class C132094_EvaluationReordering_ScorecardOpenandCancelledAIs
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
        //Set Enterprise Setup for BIOnly Beta tab
        new actions.SetupBI.SetEnterpriseSetupforBIOnlyBetatab().run("Action Item Manager Tour Removal":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/AIdea1/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/BIdea2/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/3Idea3/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/aIdea4/.toString(),"Action":/Submit/.toString())
        //Configure Scorecard Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureScorecardStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Scorecarding/.toString(),"Individual Assignment User":/End User/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Action":/Update/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/AIdea1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Scorecarding/.toString(),"Action":/Change Step/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/BIdea2/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Scorecarding/.toString(),"Action":/Change Step/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/3Idea3/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Scorecarding/.toString(),"Action":/Change Step/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/quick add1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Scorecarding/.toString(),"Action":/Change Step/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Scorecarding/.toString(),"Action":/Change Step/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea2/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Scorecarding/.toString(),"Action":/Change Step/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/aIdea4/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Scorecarding/.toString(),"Action":/Change Step/.toString())
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/View All/.toString())
        //Set Actions Dropdown in the Action Items Manager
        new actions.ActionItemsManager.SetActionsDropdownintheActionItemsManager().run("Select Ideas":/quick add1/.toString(),"Assignee":/End User/.toString(),"Check":/TRUE/.toString(),"Action":/Cancel/.toString(),"Sub Action":/Cancel Action Item/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Set Update Order from Pipeline Steps View
        new actions.PipelineStepsView.SetUpdateOrderfromPipelineStepsView().run("Step Name to Configure (optional)":/Scorecarding/.toString(),"Tool Type":/Scorecard/.toString())
        //Set Update ToolType Order Modal
        new actions.PipelineStepsView.SetUpdateToolTypeOrder().run("Set order by Dropdown":/Project Name A-Z/.toString())
        //Verify Evaluation Reordering in the Modal
        new actions.PipelineStepsView.VerifyEvaluationReorderingintheModal().run("Order":/7/.toString(),"Project Name":/test idea2/.toString(),"Idea Image":false,"Completed Evaluations":/0\/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Evaluation Reordering in the Modal
        new actions.PipelineStepsView.VerifyEvaluationReorderingintheModal().run("Order":/6/.toString(),"Project Name":/test idea1/.toString(),"Idea Image":true,"Completed Evaluations":/0\/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Evaluation Reordering in the Modal
        new actions.PipelineStepsView.VerifyEvaluationReorderingintheModal().run("Order":/5/.toString(),"Project Name":/quick add1/.toString(),"Idea Image":false,"Completed Evaluations":/0\/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Evaluation Reordering in the Modal
        new actions.PipelineStepsView.VerifyEvaluationReorderingintheModal().run("Order":/4/.toString(),"Project Name":/BIdea2/.toString(),"Idea Image":false,"Completed Evaluations":/0\/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Evaluation Reordering in the Modal
        new actions.PipelineStepsView.VerifyEvaluationReorderingintheModal().run("Order":/3/.toString(),"Project Name":/aIdea4/.toString(),"Idea Image":false,"Completed Evaluations":/0\/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Evaluation Reordering in the Modal
        new actions.PipelineStepsView.VerifyEvaluationReorderingintheModal().run("Order":/2/.toString(),"Project Name":/AIdea1/.toString(),"Idea Image":false,"Completed Evaluations":/0\/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Evaluation Reordering in the Modal
        new actions.PipelineStepsView.VerifyEvaluationReorderingintheModal().run("Order":/1/.toString(),"Project Name":/3Idea3/.toString(),"Idea Image":false,"Completed Evaluations":/0\/1/.toString(),"Number of Matches":/1/.toString())
        //Set Update ToolType Order Modal
        new actions.PipelineStepsView.SetUpdateToolTypeOrder().run("Action":/Save Changes/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString(),"Activities":true,"My Ideas":true,"Submissions":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Site Enterprise Tab
        new actions.SetupSite.SetWebstormSiteEnterpriseTab().run("Display link to Evaluation in User Home on Initiative card":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Activities/.toString())
        //Navigate From Activity Card
        new actions.Enterprise.UserHomepage.NavigateFromActivityCard().run("Activity Name":/Custom App/.toString(),"Navigate to":/Evaluation/.toString())
        //Verify New Evaluation Order
        new actions.ActionItems.VerifyNewEvaluationOrder().run("Title":/3Idea3/.toString(),"Row Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify New Evaluation Order
        new actions.ActionItems.VerifyNewEvaluationOrder().run("Title":/AIdea1/.toString(),"Row Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify New Evaluation Order
        new actions.ActionItems.VerifyNewEvaluationOrder().run("Title":/aIdea4/.toString(),"Row Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify New Evaluation Order
        new actions.ActionItems.VerifyNewEvaluationOrder().run("Title":/BIdea2/.toString(),"Row Number":/4/.toString(),"Number of Matches":/1/.toString())
        //Verify New Evaluation Order
        new actions.ActionItems.VerifyNewEvaluationOrder().run("Title":/test idea1/.toString(),"Row Number":/5/.toString(),"Number of Matches":/1/.toString())
        //Verify New Evaluation Order
        new actions.ActionItems.VerifyNewEvaluationOrder().run("Title":/test idea2/.toString(),"Row Number":/6/.toString(),"Number of Matches":/1/.toString())
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