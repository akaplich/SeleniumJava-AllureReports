package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131480 - Duplicate Step
class C131480_DuplicateStep
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
        Action58123c20fa4ee77809f468f6("Run Browser in Incognito":/TRUE/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Single Scale Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureSingleScaleStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Single Scale/.toString(),"Individual Assignment User":/Evaluator/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Idea Editing":true,"Action":/Update/.toString())
        //Edit Step in Pipeline Steps page
        new actions.PipelineStepsView.EditStepinPipelineStepspage().run("Step to Edit":/Single Scale/.toString(),"Step Description":/testing copying this description/.toString(),"Action":/Save/.toString())
        try{
            //Set Duplicate Step in Pipeline Steps View
            new actions.PipelineStepsView.SetDuplicateStepinPipelineStepsView().run("Step to Edit":/Single Scale/.toString(),"Step Name":/new step SS/.toString(),"Select Stage":/Selection/.toString(),"Action":/Duplicate Step/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Step duplicated successfully!/.toString(),"Should Exist":true)
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/new step SS/.toString(),"Action":/Change Step/.toString())
        //Verify Step in Pipeline Steps page
        new actions.PipelineStepsView.VerifyStepinPipelineStepspage().run("Step Name":/new step SS/.toString(),"Stage Name step belongs to":/Selection/.toString(),"Number of Ideas in a step":/1/.toString(),"Step Description":/testing copying this description/.toString(),"Number of Matches":/1/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/30/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/test idea1/.toString())
        try{
            //Set Single Scale for Idea in Action Items page
            new actions.ActionItems.SetSingleScaleforIdeainActionItemspage().run([:])
        }
       catch(all){}catch(Error err){}
        //Set NGA View Idea Description Tab Text Field
        new actions.NGAViewIdea.SetNGAViewIdeaDescriptionTabTextField().run("Field Name":/Description/.toString(),"Field Value":/test idea1 description is edited/.toString(),"Action":/Save/.toString())
        //Verify Idea in NGA View Idea page
        new actions.NGAViewIdea.VerifyIdeainNGAViewIdeapage().run("Idea Name":/test idea1/.toString(),"Description":/test idea1 description is edited/.toString())
        //Set Single Scale for Idea in Action Items page
        new actions.ActionItems.SetSingleScaleforIdeainActionItemspage().run("What is your initial impression of this idea":/6/.toString())
        //Verify Completed table for Action Items page
        new actions.ActionItems.VerifyCompletedtableforActionItemspage().run("Completed Tab Value":/1/.toString(),"Title":/test idea1/.toString(),"Rating":/6/.toString(),"Number of Matches":/1/.toString())
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