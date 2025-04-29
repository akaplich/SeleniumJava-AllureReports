package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131354 - MTS homepage > Dashboard Tab as Admin
class C131354_MTShomepage_DashboardTabasAdmin
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
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/app\/apps/.toString())
        //Create Memo Webstorm
        new actions.WebstormCreation.CreateMemoWebstorm().run("Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Memo Program testing/.toString(),"Description":/desc/.toString(),"Vanity URL":/teamsite1/.toString(),"General Access":/ALL/.toString(),"General Access Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Verify Page Title
        new actions.selenium.VerifyPageTitle().run("Title":/Memo Program testing: Team Site/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Memo Program testing/.toString(),"Area to Navigate to":/Pipeline Setup/.toString())
        //Set Roles in Pipeline Setup Page
        new actions.PipelineSetup.SetRolesinPipelineSetupPage().run("Type of Licensing Model":/Standard Licensing Model/.toString(),"Navigate to Tab":true,"Admin Field Name":/Pipeline Administrators/.toString(),"Administrators":/Pipeline Admin,System Admin/.toString(),"Administrators Add or Remove":/Add,Remove/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Analysts":/analyst/.toString(),"Analysts Add or Remove":/Add/.toString(),"Click Save":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Memo Program testing/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Memo or Idea":/Memo/.toString(),"Title":/Memo1/.toString(),"Category":/Process Improvement/.toString(),"Status":/Green Light ✅/.toString(),"Action":/Submit/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("Area to Navigate to":/Memo Team Site/.toString(),"Memo Team Site Link":/teamsite1/.toString())
        //Verify and Set MTS tab on homepage
        new actions.MTS.SetMTStabonhomepage().run("Should Tab Exist":true,"Heading":/EXPLORE/.toString(),"Tabs":/Dashboard/.toString(),"Placement Number of Tab":/4/.toString(),"Should User Click on Tab":true)
        //Navigate To Analytics Dashboard and Tab
        new actions.NGAAnalyticsDashboard.NavigateToAnalyticsDashboardandTab().run("Dashboard":/Engagement Dashboard/.toString())
        //Verify the Engagement Over Time Metric in Engagement tab in Pipeline Dashboard
        new actions.PipelineDashBoard.VerifytheEngagementOverTimeMetricinEngagementtabinPipelineDashboard().run("Metric Label":/Avg. Visitors Per Week/.toString(),"Value":/1/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify and Set MTS tab on homepage
        new actions.MTS.SetMTStabonhomepage().run("Should Tab Exist":true,"Heading":/SETTINGS/.toString(),"Tabs":/Settings/.toString(),"Placement Number of Tab":/1/.toString(),"Should User Click on Tab":true)
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/1/.toString())
        //Set Community Admin in Community Setup
        new actions.SetupUsers.SetCommunityAdmininCommunitySetup().run("Field Name":/Team Site Administrators/.toString(),"Community Admin or Idea Box Manager":/Community Admin/.toString(),"Add or Remove":/Add/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Close All Browsers
        new actions.selenium.CloseBrowser().run([:])
        //Open Browser
        new actions.selenium.Browser().run("URL":/${variables."affiliateURL"}/.toString(),"Browser Type":/Chrome/.toString())
        //Login
        new actions.general.Login().run("Email":/communityadmin@test.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("Area to Navigate to":/Memo Team Site/.toString(),"Memo Team Site Link":/teamsite1/.toString())
        //Verify and Set MTS tab on homepage
        new actions.MTS.SetMTStabonhomepage().run("Should Tab Exist":true,"Heading":/EXPLORE/.toString(),"Tabs":/Dashboard/.toString(),"Placement Number of Tab":/4/.toString(),"Should User Click on Tab":true)
        //Navigate To Analytics Dashboard and Tab
        new actions.NGAAnalyticsDashboard.NavigateToAnalyticsDashboardandTab().run("Dashboard":/Business Impact Dashboard/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/No financial benefits have been recorded./.toString(),"Should Exist":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Close All Browsers
        new actions.selenium.CloseBrowser().run([:])
        //Open Browser
        new actions.selenium.Browser().run("URL":/${variables."affiliateURL"}/.toString(),"Browser Type":/Chrome/.toString())
        //Login
        new actions.general.Login().run("Email":/moderator@test.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("Area to Navigate to":/Memo Team Site/.toString(),"Memo Team Site Link":/teamsite1/.toString())
        //Verify and Set MTS tab on homepage
        new actions.MTS.SetMTStabonhomepage().run("Should Tab Exist":true,"Heading":/EXPLORE/.toString(),"Tabs":/Dashboard/.toString(),"Placement Number of Tab":/4/.toString(),"Should User Click on Tab":true)
        //Navigate To Analytics Dashboard and Tab
        new actions.NGAAnalyticsDashboard.NavigateToAnalyticsDashboardandTab().run("Dashboard":/Innovations Dashboard/.toString(),"Tab":/By Initiative/.toString())
        //View Metrics in Location Dashboard and Challenge Tabs
        new actions.NGAAnalyticsDashboard.ViewMetricsinLocationDashboardandChallengeTabs().run("Metric Label":/Active Initiatives/.toString(),"Value":/1/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Close All Browsers
        new actions.selenium.CloseBrowser().run([:])
        //Open Browser
        new actions.selenium.Browser().run("URL":/${variables."affiliateURL"}/.toString(),"Browser Type":/Chrome/.toString())
        //Login
        new actions.general.Login().run("Email":/pipelineadmin@test.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("Area to Navigate to":/Memo Team Site/.toString(),"Memo Team Site Link":/teamsite1/.toString())
        //Verify and Set MTS tab on homepage
        new actions.MTS.SetMTStabonhomepage().run("Should Tab Exist":true,"Heading":/EXPLORE/.toString(),"Tabs":/Dashboard/.toString(),"Placement Number of Tab":/4/.toString(),"Should User Click on Tab":true)
        //Navigate To Analytics Dashboard and Tab
        new actions.NGAAnalyticsDashboard.NavigateToAnalyticsDashboardandTab().run("Dashboard":/Innovations Dashboard/.toString(),"Tab":/By Initiative/.toString())
        //View Metrics in Location Dashboard and Challenge Tabs
        new actions.NGAAnalyticsDashboard.ViewMetricsinLocationDashboardandChallengeTabs().run("Metric Label":/Active Initiatives/.toString(),"Value":/1/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Close All Browsers
        new actions.selenium.CloseBrowser().run([:])
        //Open Browser
        new actions.selenium.Browser().run("URL":/${variables."affiliateURL"}/.toString(),"Browser Type":/Chrome/.toString())
        //Login
        new actions.general.Login().run("Email":/analyst@test.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("Area to Navigate to":/Memo Team Site/.toString(),"Memo Team Site Link":/teamsite1/.toString())
        //Verify and Set MTS tab on homepage
        new actions.MTS.SetMTStabonhomepage().run("Should Tab Exist":true,"Heading":/EXPLORE/.toString(),"Tabs":/Dashboard/.toString(),"Placement Number of Tab":/4/.toString(),"Should User Click on Tab":true)
        //Navigate To Analytics Dashboard and Tab
        new actions.NGAAnalyticsDashboard.NavigateToAnalyticsDashboardandTab().run("Dashboard":/Innovations Dashboard/.toString(),"Tab":/By Initiative/.toString())
        //View Metrics in Location Dashboard and Challenge Tabs
        new actions.NGAAnalyticsDashboard.ViewMetricsinLocationDashboardandChallengeTabs().run("Metric Label":/Active Initiatives/.toString(),"Value":/1/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
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