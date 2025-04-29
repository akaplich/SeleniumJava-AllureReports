package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C127989 - Idea Import With Closed Step
class C127989_IdeaImportWithClosedStep
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
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Custom Initiative for Idea Import Title/.toString(),"Description":/Custom Initiative for Idea Import Description/.toString(),"Submission Name":/Submission/.toString(),"Submission Plural Name":/Submissions/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom Initiative for Idea Import Title/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Close Step in Pipeline Steps page
        new actions.PipelineStepsView.CloseStepinPipelineStepspage().run("Step to Close":/Submitted/.toString(),"I Understand":true,"Action":/Close Step/.toString())
        //Set Quick Add Dropdown for Non Memo
        new actions.PipelineStepsView.SetQuickAddDropdownforNonMemo().run("Option":/Import Submissions/.toString())
        //Import Ideas in Pipeline Steps page
        new actions.PipelineStepsView.ImportIdeasinPipelineStepspage().run("Idea Import File":/Custom-idea-import-example.xls/.toString(),"Action":/Import Ideas/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/120/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom Initiative for Idea Import Title/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Verify Idea in Pipeline Steps page
        new actions.PipelineStepsView.VerifyIdeainPipelineStepsViewpage().run("Idea Name":/Emerging Market Development/.toString(),"Step Name idea belongs to":/Initial Screen/.toString())
        //Verify Idea in Pipeline Steps page
        new actions.PipelineStepsView.VerifyIdeainPipelineStepsViewpage().run("Idea Name":/Flexible OLED Displays/.toString(),"Step Name idea belongs to":/Initial Screen/.toString())
        //Verify Idea in Pipeline Steps page
        new actions.PipelineStepsView.VerifyIdeainPipelineStepsViewpage().run("Idea Name":/Improved tensile strength of carbon fibers/.toString(),"Step Name idea belongs to":/Initial Screen/.toString())
        //Verify Idea in Pipeline Steps page
        new actions.PipelineStepsView.VerifyIdeainPipelineStepsViewpage().run("Idea Name":/Automated Robotic Workstation Platform/.toString(),"Step Name idea belongs to":/Initial Screen/.toString())
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