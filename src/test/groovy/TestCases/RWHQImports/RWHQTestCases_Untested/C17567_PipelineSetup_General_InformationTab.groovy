package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C17567 - Pipeline Setup - General, Information Tab
class C17567_PipelineSetup_General_InformationTab
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
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Custom Initiative for Pipeline Setup Title/.toString(),"Description":/Custom Initiative for Pipeline Setup Description/.toString(),"Submission Name":/Submission/.toString(),"Submission Plural Name":/Submissions/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom Initiative for Pipeline Setup Title/.toString(),"Area to Navigate to":/Pipeline Setup/.toString())
        //Set Information in Pipeline Setup Page
        new actions.PipelineSetup.SetInformationinPipelineSetupPage().run("Name":/Custom Initiative for Pipeline Setup Title Edited/.toString(),"Description":/Custom Initiative for Pipeline Setup Description Edited/.toString(),"This is a Research Pipeline":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Verify Webstorms in Large Visual Webstorm List
        new actions.Widgets.VerifyWebstormsinLargeVisualWebstormList().run("Webstorm Title":/Custom Initiative for Pipeline Setup Title Edited/.toString(),"Webstorm Description":/Custom Initiative for Pipeline Setup Description Edited/.toString(),"Number of Matches":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Analytics/.toString())
        //Navigate To Analytics Dashboard and Tab
        new actions.NGAAnalyticsDashboard.NavigateToAnalyticsDashboardandTab().run("Dashboard":/Innovations Dashboard/.toString(),"Tab":/By Initiative/.toString())
        //View Metrics in Location Dashboard and Challenge Tabs
        new actions.NGAAnalyticsDashboard.ViewMetricsinLocationDashboardandChallengeTabs().run("Metric Label":/Initiatives/.toString(),"Value":/4/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Set Exclude Research Pipelines
        new actions.NGAAnalyticsDashboard.SetExcludeResearchPipelines().run("Exclude Research Pipelines":true)
        //View Metrics in Location Dashboard and Challenge Tabs
        new actions.NGAAnalyticsDashboard.ViewMetricsinLocationDashboardandChallengeTabs().run("Metric Label":/Initiatives/.toString(),"Value":/3/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom Initiative for Pipeline Setup Title Edited/.toString(),"Area to Navigate to":/Pipeline Setup/.toString())
        //Compare Images
        new actions.selenium.CompareImages().run("Element ID (optional)":/\/\/*[contains(@class,'information-field')][3]/.toString(),"Expected Image File":/C17567_expected.png/.toString(),"Actual Image Name":/C17567_actual.png/.toString(),"Do Not Scroll":true)
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
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C17567_actual.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/difference.png/.toString())
        }
       catch(all){}catch(Error err){}
        //Afterstate
        Action581259c8fa4ee77809f46905([:])
    }
}