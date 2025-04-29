import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131838 - Evaluation Reordering - Review Open and Completed AIs
class C131838_EvaluationReordering_ReviewOpenandCompletedAIs
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
        new actions.Mailinator.CreateMailinatorUser().run("Email":/brightC131838User1test3/.toString(),"Finally Login as What User":/bi.adminuser1@brightidea.com/.toString())
        //Create Mailinator User
        new actions.Mailinator.CreateMailinatorUser().run("Email":/brightC131838User2test3/.toString(),"Finally Login as What User":/bi.adminuser1@brightidea.com/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/Review Idea1/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Review Idea1/.toString())
        //Change Idea Category in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaCategoryinPipelineStepspage().run("Category":/New Product/.toString(),"Action":/Change Category/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/Review Idea2/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Review Idea2/.toString())
        //Change Idea Category in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaCategoryinPipelineStepspage().run("Category":/Operations/.toString(),"Action":/Change Category/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/Review Idea3/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Review Idea3/.toString())
        //Change Idea Category in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaCategoryinPipelineStepspage().run("Category":/Strategy/.toString(),"Action":/Change Category/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/Review Idea4/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Review Idea4/.toString())
        //Change Idea Category in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaCategoryinPipelineStepspage().run("Category":/Marketing & Branding/.toString(),"Action":/Change Category/.toString())
        //Create Step in Pipeline Steps page
        new actions.PipelineStepsView.CreateStepinPipelineStepspage().run("Step Name":/Review New/.toString(),"Select Tool Type":/Review/.toString(),"Select Stage":/Evaluation/.toString(),"Action":/Create/.toString())
        //Configure Review Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureReviewStepinNewModalinPipelineStepspage().run("Assignment Method":/Category Assignment/.toString(),"Category":/New Product,Operations,Marketing & Branding,Strategy,Quick Add\/New Categories/.toString(),"Category Assignment User":/brightC131838User1test3@mailinator.com,brightC131838User1test3@mailinator.com,brightC131838User2test3@mailinator.com,brightC131838User2test3@mailinator.com,brightC131838User1test3@mailinator.com/.toString(),"Category Assignment User Add or Remove":/Add,Add,Add,Add,Add/.toString(),"Action":/Activate/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Review Idea1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Review New/.toString(),"Action":/Change Step/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Review Idea2/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Review New/.toString(),"Action":/Change Step/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Review Idea3/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Review New/.toString(),"Action":/Change Step/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/quick add1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Review New/.toString(),"Action":/Change Step/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Review New/.toString(),"Action":/Change Step/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea2/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Review New/.toString(),"Action":/Change Step/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Review Idea4/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Review New/.toString(),"Action":/Change Step/.toString())
        //Verify Email
        new actions.Mailinator.VerifyEmail().run("Email Address":/brightC131838User1test3/.toString(),"Subject":/Review New/.toString())
        //Verify Email
        new actions.Mailinator.VerifyEmail().run("Email Address":/brightC131838User1test3/.toString(),"Subject":/Review New/.toString())
        //Verify Email
        new actions.Mailinator.VerifyEmail().run("Email Address":/brightC131838User1test3/.toString(),"Subject":/Review New/.toString())
        //Verify Email
        new actions.Mailinator.VerifyEmail().run("Email Address":/brightC131838User1test3/.toString(),"Subject":/Review New/.toString())
        //Verify Email
        new actions.Mailinator.VerifyEmail().run("Email Address":/brightC131838User1test3/.toString(),"Subject":/Review New/.toString())
        //Verify Email
        new actions.Mailinator.VerifyEmail().run("Email Address":/brightC131838User2test3/.toString(),"Subject":/Review New/.toString())
        //Verify Email
        new actions.Mailinator.VerifyEmail().run("Email Address":/brightC131838User2test3/.toString(),"Subject":/Review New/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/brightC131838User2test3@mailinator.com/.toString(),"Password":/brightidea1/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/Review Idea3/.toString())
        //Set Review for Idea in Action Items page
        new actions.ActionItems.SetReviewforIdeainActionItemspage().run([:])
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/brightC131838User1test3@mailinator.com/.toString(),"Password":/brightidea1/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/quick add1/.toString())
        //Set Review for Idea in Action Items page
        new actions.ActionItems.SetReviewforIdeainActionItemspage().run([:])
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/Review Idea1/.toString())
        //Set Review for Idea in Action Items page
        new actions.ActionItems.SetReviewforIdeainActionItemspage().run([:])
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Set Update Order from Pipeline Steps View
        new actions.PipelineStepsView.SetUpdateOrderfromPipelineStepsView().run("Step Name to Configure (optional)":/Review New/.toString(),"Tool Type":/Review/.toString())
        //Set Update ToolType Order Modal
        new actions.PipelineStepsView.SetUpdateToolTypeOrder().run("Set order by Dropdown":/% Complete, Least-Most/.toString())
        //Verify Evaluation Reordering in the Modal
        new actions.PipelineStepsView.VerifyEvaluationReorderingintheModal().run("Order":/1/.toString(),"Project Name":/Review Idea2/.toString(),"Completed Evaluations":/0\/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Evaluation Reordering in the Modal
        new actions.PipelineStepsView.VerifyEvaluationReorderingintheModal().run("Order":/2/.toString(),"Project Name":/Review Idea4/.toString(),"Completed Evaluations":/0\/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Evaluation Reordering in the Modal
        new actions.PipelineStepsView.VerifyEvaluationReorderingintheModal().run("Order":/3/.toString(),"Project Name":/test idea1/.toString(),"Completed Evaluations":/0\/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Evaluation Reordering in the Modal
        new actions.PipelineStepsView.VerifyEvaluationReorderingintheModal().run("Order":/4/.toString(),"Project Name":/test idea2/.toString(),"Completed Evaluations":/0\/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Evaluation Reordering in the Modal
        new actions.PipelineStepsView.VerifyEvaluationReorderingintheModal().run("Order":/5/.toString(),"Project Name":/quick add1/.toString(),"Completed Evaluations":/1\/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Evaluation Reordering in the Modal
        new actions.PipelineStepsView.VerifyEvaluationReorderingintheModal().run("Order":/6/.toString(),"Project Name":/Review Idea1/.toString(),"Completed Evaluations":/1\/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Evaluation Reordering in the Modal
        new actions.PipelineStepsView.VerifyEvaluationReorderingintheModal().run("Order":/7/.toString(),"Project Name":/Review Idea3/.toString(),"Completed Evaluations":/1\/1/.toString(),"Number of Matches":/1/.toString())
        //Set Update ToolType Order Modal
        new actions.PipelineStepsView.SetUpdateToolTypeOrder().run("Action":/Save Changes/.toString())
        //Verify Action Items in Progress in Manage Step Page
        new actions.PipelineManageSteps.VerifyActionItemsinProgressinManageStep().run("Step Name to Manage (optional)":/Review New/.toString(),"Evaluator":/Autofirst Autolast/.toString())
        //Set Share Evaluation Reordering in Manage Step Page 
        new actions.PipelineManageSteps.SetConfigureLinkinManageStepPage().run("Share Options":/Email Evaluators.../.toString())
        //Set Email Evaluators
        new actions.PipelineManageSteps.SetEmailEvaluators().run("Select All":true,"Subject":/testing email evaluators email/.toString(),"Click on Description Field":true,"Description":/test/.toString(),"Dynamic Fields":/Step Evaluation Page/.toString(),"Action":/Send/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Get Evaluations Link in Email Evaluations
        variables."link" = new actions.Mailinator.GetEvaluationsLinkinEmailEvaluations().run("Email Address":/brightC131838User1test3/.toString())
        //Login
        new actions.general.Login().run("Email":/brightC131838User1test3@mailinator.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Verify New Evaluation Order
        new actions.ActionItems.VerifyNewEvaluationOrder().run("Title":/Review Idea2/.toString(),"Row Number":/1/.toString())
        //Verify New Evaluation Order
        new actions.ActionItems.VerifyNewEvaluationOrder().run("Title":/test idea1/.toString(),"Row Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify New Evaluation Order
        new actions.ActionItems.VerifyNewEvaluationOrder().run("Title":/test idea2/.toString(),"Row Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify New Evaluation Order
        new actions.ActionItems.VerifyNewEvaluationOrder().run("Title":/quick add1/.toString(),"Number of Matches":/0/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Get Evaluations Link in Email Evaluations
        variables."link1" = new actions.Mailinator.GetEvaluationsLinkinEmailEvaluations().run("Email Address":/brightC131838User2test3/.toString())
        //Login
        new actions.general.Login().run("Email":/brightC131838User2test3@mailinator.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link1"}/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Verify New Evaluation Order
        new actions.ActionItems.VerifyNewEvaluationOrder().run("Title":/Review Idea4/.toString(),"Number of Matches":/1/.toString())
        //Verify New Evaluation Order
        new actions.ActionItems.VerifyNewEvaluationOrder().run("Title":/Review Idea3/.toString(),"Number of Matches":/0/.toString())
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