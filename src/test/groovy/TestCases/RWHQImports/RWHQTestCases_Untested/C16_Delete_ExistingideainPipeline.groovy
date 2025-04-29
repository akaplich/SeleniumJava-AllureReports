package TestCases.RWHQImports.RWHQTestCases_Untested

import BaseClasses.TestBase
import actions.API.Utils.CopyAffiliate
import actions.PipelineStepsView.DeleteIdeasinPipelineStepsViewpage
import actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage
import actions.PipelineStepsView.SetDeleteIdea
import actions.PipelineStepsView.VerifyIdeainPipelineStepsViewpage
import actions.Utils.SettoLabEnvironment
import actions.general.Login
import actions.general.NavigateWebStormAdminBar
import actions.general.Wait
import actions.selenium.Browser
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C16 - Delete - Existing idea in Pipeline
class C16_Delete_ExistingideainPipeline extends TestBase {

    private static def variables = [:]

    @BeforeAll
    public static void beforeState(){
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
        new NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Select Idea in Pipeline Steps page
        new SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea1/.toString())
        //Delete Ideas in Pipeline Steps page
        new DeleteIdeasinPipelineStepsViewpage().run("Action":/Delete/.toString())
        //Set Delete Idea or Pipeline in all places
        new SetDeleteIdea().run("I understand":true,"Action":/Delete Ideas/.toString())
        //Wait
        new Wait().run("Seconds":/20/.toString())
        //Verify Idea in Pipeline Steps page
        new VerifyIdeainPipelineStepsViewpage().run("Idea Name":/test idea1/.toString(),"Number of Matches":/0/.toString())
    }
    //Basestate
    public static def Action58123c20fa4ee77809f468f6(def params){
        //Create Affiliate based on Master Affiliate
        variables."affiliateURL" = new CopyAffiliate().run("Licensing Model":/${params."Licensing Model"}/.toString(),"Unlimited Brightidea Administrator License Type":/${params."Unlimited Brightidea Administrator License Type"}/.toString(),"Brightidea Administrator License Type Purchased Count":/${params."Brightidea Administrator License Type Purchased Count"}/.toString(),"Unlimited Idea Box Manager License Type":/${params."Unlimited Idea Box Manager License Type"}/.toString(),"Idea Box Manager License Type Purchased Count":/${params."Idea Box Manager License Type Purchased Count"}/.toString())
        //Open Browser
        new Browser().run("Run Browser in Incognito":/${params."Run Browser in Incognito"}/.toString(),"URL":/${variables."affiliateURL"}/.toString(),"Browser Type":/${variables."Browser"}/.toString())
        //Login
        new Login().run("Email":/${params."Username Email"}/.toString(),"Password":/brightidea1/.toString())
        //Set to Lab Environment
        new SettoLabEnvironment().run("Email":/${params."Username Email"}/.toString())

    }
}