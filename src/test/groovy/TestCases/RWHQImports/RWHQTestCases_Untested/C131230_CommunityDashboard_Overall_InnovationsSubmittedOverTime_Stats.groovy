import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C131230 - Community Dashboard - Overall - Innovations Submitted Over Time - Stats
class C131230_CommunityDashboard_Overall_InnovationsSubmittedOverTime_Stats
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
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Test App/.toString(),"Description":/desc/.toString(),"Action":/Create/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Go to Community
        new actions.SetupEnterpriseCommunities.GotoCommunity().run("Community Name to go to":/Developers Community/.toString())
        //Navigate Community
        new actions.SetupEnterpriseCommunities.NavigateCommunity().run("Community Page":/Setup/.toString())
        //Add/Remove Community Administrator
        new actions.SetupEnterpriseCommunities.AddRemoveCommunityAdministrator().run("User":/Community Admin/.toString(),"Add or Remove":/Add/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Select Community
        new actions.SetupEnterpriseCommunities.SelectCommunity().run("Community Name":/End User Community/.toString())
        //Update Community
        new actions.SetupEnterpriseCommunities.UpdateCommunity().run("Apps":/Test App/.toString(),"Checkbox Check":/TRUE/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Go to Community
        new actions.SetupEnterpriseCommunities.GotoCommunity().run("Community Name to go to":/End User Community/.toString())
        //Navigate Community
        new actions.SetupEnterpriseCommunities.NavigateCommunity().run("Community Page":/Setup/.toString())
        //Add/Remove Community Administrator
        new actions.SetupEnterpriseCommunities.AddRemoveCommunityAdministrator().run("User":/Community Admin/.toString(),"Add or Remove":/Add/.toString())
        //Copy Current URL
        variables."link" = new actions.selenium.CopyCurrentURL().run([:])
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/test idea3/.toString(),"Description":/desc/.toString(),"Category":/New Product/.toString(),"Required Short Question":/short/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/test idea31/.toString(),"Description":/desc/.toString(),"Category":/New Product/.toString(),"Required Short Question":/short/.toString(),"Action":/Submit Idea/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser2@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Test App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/test idea4/.toString(),"Description":/desc/.toString(),"Category":/New Product/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Test App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/test idea4/.toString(),"Description":/desc/.toString(),"Category":/New Product/.toString(),"Action":/Submit Idea/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/communityadmin@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea31/.toString())
        //Change Idea Status in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStatusinPipelineStepspage().run("Status":/Completed/.toString(),"Action":/Change Status/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea3/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Add or Update":/Add/.toString(),"Access Business Impact From":/View Idea/.toString())
        //Set Date Version and Notes for Financial Summary in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetDateandNotesforFinancialSummaryinBusinessImpacttab().run("Date":/06\/01\/2021/.toString())
        //Set Benefits in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetBenefitsinBusinessImpacttab().run("Add or Edit Benefits":/Add,Add,Add,Add/.toString(),"Year":/2021,2022,2021,2022/.toString(),"Current Year":/2021/.toString(),"Benefit Type":/Cost Savings,Cost Savings,Revenue,Revenue/.toString(),"Projected Benefit":/5000,15000,1000,2000/.toString(),"Actual Benefit":/4000,14000,3000,1000/.toString(),"Row Number of the Benefit":/1,1,2,2/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Action":/Save Version/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        //Navigate Community Admin Bar Dropdown
        new actions.general.NavigateCommunityAdminBar().run("Area to Navigate to":/Dashboard/.toString())
        //Navigate To Analytics Dashboard and Tab
        new actions.NGAAnalyticsDashboard.NavigateToAnalyticsDashboardandTab().run("Dashboard":/Innovations Dashboard/.toString(),"Tab":/Overall/.toString())
        //View Metrics in Location Dashboard and Challenge Tabs
        new actions.NGAAnalyticsDashboard.ViewMetricsinLocationDashboardandChallengeTabs().run("Metric Label":/Total Innovations Created/.toString(),"Value":/2/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //View Metrics in the Overall Tab
        new actions.NGAAnalyticsDashboard.ViewMetricsonEngagementDashboardinOverallTab().run("Metric Label":/Avg. Innovations Created per Day/.toString(),"Count":/1/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //View Metrics in the Overall Tab
        new actions.NGAAnalyticsDashboard.ViewMetricsonEngagementDashboardinOverallTab().run("Metric Label":/Avg. Innovations Created per Month/.toString(),"Count":/2/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //View Metrics in the Overall Tab
        new actions.NGAAnalyticsDashboard.ViewMetricsonEngagementDashboardinOverallTab().run("Metric Label":/Innovations Marked Complete/.toString(),"Count":/0/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //View Metrics in the Overall Tab
        new actions.NGAAnalyticsDashboard.ViewMetricsonEngagementDashboardinOverallTab().run("Metric Label":/Total Projected Net Benefit/.toString(),"Count":/None Recorded/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //View Metrics in the Overall Tab
        new actions.NGAAnalyticsDashboard.ViewMetricsonEngagementDashboardinOverallTab().run("Metric Label":/Total Actual Benefits/.toString(),"Count":/None Recorded/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Navigate to Community in Community Dashboard
        new actions.NGAAnalyticsDashboard.NavigateCommunityCommunityDashboard().run("Select Community":/Developers Community/.toString())
        //View Metrics in Location Dashboard and Challenge Tabs
        new actions.NGAAnalyticsDashboard.ViewMetricsinLocationDashboardandChallengeTabs().run("Metric Label":/Total Innovations Created/.toString(),"Value":/2/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //View Metrics in the Overall Tab
        new actions.NGAAnalyticsDashboard.ViewMetricsonEngagementDashboardinOverallTab().run("Metric Label":/Avg. Innovations Created per Day/.toString(),"Count":/1/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //View Metrics in the Overall Tab
        new actions.NGAAnalyticsDashboard.ViewMetricsonEngagementDashboardinOverallTab().run("Metric Label":/Avg. Innovations Created per Month/.toString(),"Count":/2/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //View Metrics in the Overall Tab
        new actions.NGAAnalyticsDashboard.ViewMetricsonEngagementDashboardinOverallTab().run("Metric Label":/Innovations Marked Complete/.toString(),"Count":/1/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //View Metrics in the Overall Tab
        new actions.NGAAnalyticsDashboard.ViewMetricsonEngagementDashboardinOverallTab().run("Metric Label":/Total Projected Net Benefit/.toString(),"Count":/$23,000/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //View Metrics in the Overall Tab
        new actions.NGAAnalyticsDashboard.ViewMetricsonEngagementDashboardinOverallTab().run("Metric Label":/Total Actual Benefits/.toString(),"Count":/$22,000/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
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