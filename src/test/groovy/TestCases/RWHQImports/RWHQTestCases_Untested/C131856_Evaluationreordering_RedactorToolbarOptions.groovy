import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C131856 - Evaluation reordering - Redactor Toolbar Options
class C131856_Evaluationreordering_RedactorToolbarOptions
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Unlimited Brightidea Administrator License Type":/1/.toString(),"Unlimited Idea Box Manager License Type":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Apply Filter on Apps Pillar 2.0
        new actions.AppsPillar.ApplyFilterAppsPillar20().run("Filter Option":/Programs/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Hackathon/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Hack/.toString(),"Description":/Hack Event description/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/Idea1/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/Idea2/.toString(),"Action":/Submit/.toString())
        //Create Step in Pipeline Steps page
        new actions.PipelineStepsView.CreateStepinPipelineStepspage().run("Step Name":/Judging/.toString(),"Select Tool Type":/Judging/.toString(),"Select Stage":/Hackathon/.toString(),"Action":/Create/.toString())
        //Configure Judging Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureJudgingStepinNewModalinPipelineStepspage().run("Judges":/Evaluator/.toString(),"Judges Add or Remove":/Add/.toString(),"Action":/Activate/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Idea1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Judging/.toString(),"Action":/Change Step/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Idea2/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Judging/.toString(),"Action":/Change Step/.toString())
        //Verify Currently in Step table for Manage Judging
        new actions.PipelineManageSteps.VerifyCurrentlyinSteptableforManageJudging().run("Step Name to Manage (optional)":/Judging/.toString(),"Idea Name":/Idea1/.toString(),"Number of Matches":/1/.toString())
        //Set Share Evaluation Reordering in Manage Step Page 
        new actions.PipelineManageSteps.SetConfigureLinkinManageStepPage().run("Share Options":/Email Evaluators.../.toString())
        //Set Email Evaluators
        new actions.PipelineManageSteps.SetEmailEvaluators().run("Select All":true)
        //Compare Images
        new actions.selenium.CompareImages().run("Element ID (optional)":/\/\/*[contains(@class,'fractal-widget-emailEvaluatorsModal ReactModalPortal')]\/\/*[contains(@class,'f-modal-body')]/.toString(),"Expected Image File":/C131856ExpectedResult4.png/.toString(),"Actual Image Name":/C131856ActualResult.png/.toString())
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
        //Delete File
        new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C131856ActualResult.png/.toString())
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/difference.png/.toString())
        }
       catch(all){}catch(Error err){}
        //Afterstate
        Action581259c8fa4ee77809f46905([:])
    }
}