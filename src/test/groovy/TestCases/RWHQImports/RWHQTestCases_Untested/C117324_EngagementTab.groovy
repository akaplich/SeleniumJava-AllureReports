package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C117324 - Engagement Tab
class C117324_EngagementTab
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
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Dashboard/.toString())
        //Navigate To Pipeline DashBoard Tab
        new actions.PipelineDashBoard.NavigateToPipelineDashBoardTab().run("Tab":/Engagement/.toString())
        //Verify the Engagement Over Time Metric in Engagement tab in Pipeline Dashboard
        new actions.PipelineDashBoard.VerifytheEngagementOverTimeMetricinEngagementtabinPipelineDashboard().run("Metric Label":/Current Permitted Users/.toString(),"Value":/12/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify the Engagement Over Time Metric in Engagement tab in Pipeline Dashboard
        new actions.PipelineDashBoard.VerifytheEngagementOverTimeMetricinEngagementtabinPipelineDashboard().run("Metric Label":/Unique Visitors/.toString(),"Value":/0/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify the Engagement Over Time Metric in Engagement tab in Pipeline Dashboard
        new actions.PipelineDashBoard.VerifytheEngagementOverTimeMetricinEngagementtabinPipelineDashboard().run("Metric Label":/Unique Participants/.toString(),"Value":/0/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
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