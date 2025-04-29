import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C117200 - Explore Pipeline - Evaluators for Single Scale and Scorecard
class C117200_ExplorePipeline_EvaluatorsforSingleScaleandScorecard
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
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Solve Webstorm
        new actions.WebstormCreation.CreateSolveWebstorm().run("App Name":/Explore/.toString(),"Sponsor Name":/Sri/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Explore Challenge Title/.toString(),"Challenge Brief":/Explore Challenge Description/.toString(),"Action on General Information Tab":/Continue/.toString(),"Action on Design Tab":/Continue/.toString(),"General Access":/Moderator/.toString(),"General Access Add or Remove":/Add/.toString(),"Action on Participants Tab":/Continue/.toString(),"Action on Site Schedule Tab":/Continue/.toString(),"Single Scale Field":/Rate Ideas/.toString(),"Single Scale Field Assignee":/End User,End User 2,Evaluator,End User 2/.toString(),"Single Scale Assignee Add or Remove":/Add,Add,Add,Remove/.toString(),"Scorecard Field":/Evaluate Ideas/.toString(),"Scorecard Field Assignee":/End User 2,Community Admin,Chris Williams,Community Admin/.toString(),"Scorecard Field Assignee Add or Remove":/Add,Add,Add,Remove/.toString(),"Action on Process Tab":/Continue/.toString())
        //Verify Review Tab for Solve Webstorm
        new actions.WebstormCreation.VerifyReviewTabforSolveWebstorm().run("Name":/Explore Challenge Title/.toString(),"Initial Screen (Single Scale) Assignee":/End User,Evaluator,End User 2/.toString(),"Should Initial Screen (Single Scale) Assignee Exist":/TRUE,TRUE,FALSE/.toString(),"Scorecard":/End User 2,Chris Williams,Community Admin/.toString(),"Should Scorecard Assignee Exist":/TRUE,TRUE,FALSE/.toString(),"Template":/Explore - Idea Evaluation/.toString())
        //Create Solve Webstorm
        new actions.WebstormCreation.CreateSolveWebstorm().run("Action on Design Tab":/<Empty>/.toString(),"Action":/Create/.toString())
        //Verify Initiative Home
        new actions.Webstorm.VerifyWebstormHome().run("Webstorm Title":/Explore Challenge Title/.toString(),"Webstorm Description":/Explore Challenge Description/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Explore Challenge Title/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Single Scale Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureSingleScaleStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Rate Ideas/.toString(),"Individual Assignment User":/End User,Evaluator,End User 2/.toString(),"Individual Assignment User Add or Remove":/Remove,Remove,Add/.toString(),"Action":/Update/.toString())
        //Configure Scorecard Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureScorecardStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Evaluate Ideas/.toString(),"Individual Assignment User":/End User 2,Chris Williams,Community Admin/.toString(),"Individual Assignment User Add or Remove":/Remove,Remove,Add/.toString(),"Action":/Update/.toString())
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