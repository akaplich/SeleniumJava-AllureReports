import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131926 - Evaluation reordering Email Verification - Dynamic field for Action Items
class C131926_EvaluationreorderingEmailVerification_DynamicfieldforActionItems
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
        new actions.Mailinator.CreateMailinatorUser().run("Email":/brightC131926_User/.toString(),"Finally Login as What User":/bi.adminuser1@brightidea.com/.toString())
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
        new actions.PipelineStepsView.ChangeIdeaCategoryinPipelineStepspage().run("Category":/Strategy/.toString(),"Action":/Change Category/.toString())
        //Create Step in Pipeline Steps page
        new actions.PipelineStepsView.CreateStepinPipelineStepspage().run("Step Name":/Review New/.toString(),"Select Tool Type":/Review/.toString(),"Select Stage":/Evaluation/.toString(),"Action":/Create/.toString())
        //Configure Review Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureReviewStepinNewModalinPipelineStepspage().run("Assignment Method":/Individual Assignment/.toString(),"Individual Assignment User":/Autofirst Autolast/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Action":/Activate/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Review Idea1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Review New/.toString(),"Action":/Change Step/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Review Idea2/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Review New/.toString(),"Action":/Change Step/.toString())
        //Verify Action Items in Progress in Manage Step Page
        new actions.PipelineManageSteps.VerifyActionItemsinProgressinManageStep().run("Step Name to Manage (optional)":/Review New/.toString(),"Evaluator":/Autofirst Autolast/.toString())
        //Set Share Evaluation Reordering in Manage Step Page 
        new actions.PipelineManageSteps.SetConfigureLinkinManageStepPage().run("Share Options":/Email Evaluators.../.toString())
        //Set Email Evaluators
        new actions.PipelineManageSteps.SetEmailEvaluators().run("Select All":true,"Subject":/Test for evaluator email/.toString(),"Click on Description Field":true,"Description":/Testing with link/.toString())
        //Set Email Evaluators
        new actions.PipelineManageSteps.SetEmailEvaluators().run("Dynamic Fields":/Action Items/.toString(),"Action":/Send/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Get Evaluations Link in Email Evaluations
        variables."C131926EvalLink" = new actions.Mailinator.GetEvaluationsLinkinEmailEvaluations().run("Email Address":/brightC131926_User/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."C131926EvalLink"}/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/3/.toString())
        //Login
        new actions.general.Login().run("Email":/brightC131926_User@mailinator.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Verify New Evaluation Order
        new actions.ActionItems.VerifyNewEvaluationOrder().run("Title":/Review Idea1/.toString(),"Number of Matches":/1/.toString())
        //Verify New Evaluation Order
        new actions.ActionItems.VerifyNewEvaluationOrder().run("Title":/Review Idea2/.toString(),"Number of Matches":/1/.toString())
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