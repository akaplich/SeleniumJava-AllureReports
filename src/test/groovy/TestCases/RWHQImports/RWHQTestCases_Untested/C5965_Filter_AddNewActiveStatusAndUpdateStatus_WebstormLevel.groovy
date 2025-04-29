package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C5965 - Filter - Add New Active Status & Update Status - Webstorm Level
class C5965_Filter_AddNewActiveStatusAndUpdateStatus_WebstormLevel
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
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Solve App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Status for Ideas Tab
        new actions.SetupIdeas.SetWebstormSetupStatusesIdeasTab().run("Status Name to Modify or Add":/Add/.toString(),"Status Name":/status-test-active/.toString(),"Description":/status-test-active/.toString(),"System Status":/Active/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Solve App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Filter in Pipeline StepsView
        new actions.PipelineStepsView.FilterPipelineStepsView().run("Open Filter Options":true,"Active/Inactive Status":/Active/.toString(),"Status Option":/status-test-active/.toString(),"Reset Filters":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Solve App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Status for Ideas Tab
        new actions.SetupIdeas.SetWebstormSetupStatusesIdeasTab().run("Status Name to Modify or Add":/status-test-active/.toString(),"Status Name":/status-test-update/.toString(),"Description":/status-test-update/.toString(),"System Status":/Stopped/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Solve App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Filter in Pipeline StepsView
        new actions.PipelineStepsView.FilterPipelineStepsView().run("Open Filter Options":true,"Active/Inactive Status":/Inactive/.toString(),"Status Option":/status-test-update/.toString(),"Reset Filters":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Solve App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Remove Webstorm Setup Statuses for Ideas Tab
        new actions.SetupIdeas.SetWebstormSetupStatusesforIdeasTab().run("Status to Remove":/status-test-update/.toString(),"Action":/Delete Status/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Solve App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Filter in Pipeline StepsView
        new actions.PipelineStepsView.FilterPipelineStepsView().run("Open Filter Options":true)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/status-test-update/.toString(),"Should Exist":false)
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