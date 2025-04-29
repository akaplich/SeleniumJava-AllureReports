package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C132183 - Evaluator Editing Tags on Hidden Idea
class C132183_EvaluatorEditingTagsonHiddenIdea
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
        //Configure Scorecard Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureScorecardStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Scorecarding/.toString(),"Individual Assignment User":/Evaluator/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Action":/Update/.toString())
        //Configure Single Scale Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureSingleScaleStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Single Scale/.toString(),"Individual Assignment User":/Evaluator/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Idea Editing":true,"Action":/Update/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/Quick Add Idea for Single Scale/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Quick Add Idea for Single Scale/.toString(),"Step Name idea belongs to":/Review/.toString())
        //Change Idea Visibility in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaVisibilityinPipelineStepspage().run("Visibility":/Hidden/.toString(),"Action":/Change Visibility/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Quick Add Idea for Single Scale/.toString(),"Step Name idea belongs to":/Review/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Single Scale/.toString(),"Action":/Change Step/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/Quick Add Idea for Scorecard/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Quick Add Idea for Scorecard/.toString(),"Step Name idea belongs to":/Review/.toString())
        //Change Idea Visibility in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaVisibilityinPipelineStepspage().run("Visibility":/Hidden/.toString(),"Action":/Change Visibility/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Quick Add Idea for Scorecard/.toString(),"Step Name idea belongs to":/Review/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Scorecarding/.toString(),"Action":/Change Step/.toString())
        //Configure Review Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureReviewStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Review/.toString(),"Individual Assignment User":/Evaluator/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Action":/Update/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/quick add1/.toString(),"Step Name idea belongs to":/Review/.toString())
        //Add Idea Tag in Pipeline Steps page
        new actions.PipelineStepsView.AddIdeaTaginPipelineStepspage().run("Tag Name":/tag1,tag2/.toString(),"Tag Add or Remove":/Add,Add/.toString(),"Action":/Add Tags/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Quick Add Idea for Single Scale/.toString(),"Step Name idea belongs to":/Single Scale/.toString())
        //Add Idea Tag in Pipeline Steps page
        new actions.PipelineStepsView.AddIdeaTaginPipelineStepspage().run("Tag Name":/tag11,tag22/.toString(),"Tag Add or Remove":/Add,Add/.toString(),"Action":/Add Tags/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Quick Add Idea for Scorecard/.toString(),"Step Name idea belongs to":/Scorecarding/.toString())
        //Add Idea Tag in Pipeline Steps page
        new actions.PipelineStepsView.AddIdeaTaginPipelineStepspage().run("Tag Name":/tag123/.toString(),"Tag Add or Remove":/Add/.toString(),"Action":/Add Tags/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/quick add1/.toString())
        //Set Tag for NGA View Idea
        new actions.NGAViewIdea.SetTagforNGAViewIdea().run("Tag Name":/tag1,tagreview/.toString(),"Add or Remove":/Remove,Add/.toString())
        //Verify Idea in NGA View Idea page
        new actions.NGAViewIdea.VerifyIdeainNGAViewIdeapage().run("Idea Name":/quick add1/.toString(),"Tag":/tag1/.toString(),"Tag Should Exist":/FALSE/.toString())
        //Verify Idea in NGA View Idea page
        new actions.NGAViewIdea.VerifyIdeainNGAViewIdeapage().run("Idea Name":/quick add1/.toString(),"Tag":/tag2/.toString(),"Tag Should Exist":/TRUE/.toString())
        //Verify Idea in NGA View Idea page
        new actions.NGAViewIdea.VerifyIdeainNGAViewIdeapage().run("Idea Name":/quick add1/.toString(),"Tag":/tagreview/.toString(),"Tag Should Exist":/TRUE/.toString())
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/Quick Add Idea for Single Scale/.toString(),"Number of Matches":/1/.toString(),"Click on Action Item":true)
        //Set Tag for NGA View Idea
        new actions.NGAViewIdea.SetTagforNGAViewIdea().run("Tag Name":/tag11,tagss/.toString(),"Add or Remove":/Remove,Add/.toString())
        //Verify Idea in NGA View Idea page
        new actions.NGAViewIdea.VerifyIdeainNGAViewIdeapage().run("Idea Name":/Quick Add Idea for Single Scale/.toString(),"Tag":/tag11/.toString(),"Tag Should Exist":/FALSE/.toString())
        //Verify Idea in NGA View Idea page
        new actions.NGAViewIdea.VerifyIdeainNGAViewIdeapage().run("Idea Name":/Quick Add Idea for Single Scale/.toString(),"Tag":/tag22/.toString(),"Tag Should Exist":/TRUE/.toString())
        //Verify Idea in NGA View Idea page
        new actions.NGAViewIdea.VerifyIdeainNGAViewIdeapage().run("Idea Name":/Quick Add Idea for Single Scale/.toString(),"Tag":/tagss/.toString(),"Tag Should Exist":/TRUE/.toString())
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/Quick Add Idea for Scorecard/.toString(),"Number of Matches":/1/.toString(),"Click on Action Item":true)
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/*[@id='add-tag-container']/.toString(),"Should Element Exist":false,"Number of Matches":/1/.toString())
        //Verify Idea in NGA View Idea page
        new actions.NGAViewIdea.VerifyIdeainNGAViewIdeapage().run("Idea Name":/Quick Add Idea for Scorecard/.toString(),"Tag":/tag123/.toString(),"Tag Should Exist":/TRUE/.toString())
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