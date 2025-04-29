import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C131180 - Community Dashboard - Community Dropdown, Right Side Pipelines Hidden
class C131180_CommunityDashboard_CommunityDropdown_RightSidePipelinesHidden
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
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Add Community
        new actions.SetupEnterpriseCommunities.AddCommunity().run("Community Name":/Test1 Community/.toString(),"Action":/Create/.toString())
        //Select Community
        new actions.SetupEnterpriseCommunities.SelectCommunity().run("Community Name":/Test1 Community/.toString())
        //Update Community
        new actions.SetupEnterpriseCommunities.UpdateCommunity().run("Apps":/Custom App/.toString(),"Checkbox Check":/TRUE/.toString())
        //Update Community
        new actions.SetupEnterpriseCommunities.UpdateCommunity().run("Apps":/Solve App/.toString(),"Checkbox Check":/TRUE/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Go to Community
        new actions.SetupEnterpriseCommunities.GotoCommunity().run("Community Name to go to":/Test1 Community/.toString())
        //Navigate Community
        new actions.SetupEnterpriseCommunities.NavigateCommunity().run("Community Page":/Setup/.toString())
        //Add/Remove Community Administrator
        new actions.SetupEnterpriseCommunities.AddRemoveCommunityAdministrator().run("User":/Evaluator/.toString(),"Add or Remove":/Add/.toString())
        //Add/Remove Community Administrator
        new actions.SetupEnterpriseCommunities.AddRemoveCommunityAdministrator().run("User":/Community Admin/.toString(),"Add or Remove":/Add/.toString())
        //Copy Current URL
        variables."link" = new actions.selenium.CopyCurrentURL().run([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Add Community
        new actions.SetupEnterpriseCommunities.AddCommunity().run("Community Name":/Test2 Community/.toString(),"Action":/Create/.toString())
        //Select Community
        new actions.SetupEnterpriseCommunities.SelectCommunity().run("Community Name":/Test2 Community/.toString())
        //Update Community
        new actions.SetupEnterpriseCommunities.UpdateCommunity().run("Apps":/Evaluators app/.toString(),"Checkbox Check":/TRUE/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Go to Community
        new actions.SetupEnterpriseCommunities.GotoCommunity().run("Community Name to go to":/Test2 Community/.toString())
        //Navigate Community
        new actions.SetupEnterpriseCommunities.NavigateCommunity().run("Community Page":/Setup/.toString())
        //Add/Remove Community Administrator
        new actions.SetupEnterpriseCommunities.AddRemoveCommunityAdministrator().run("User":/bi.enduser2@brightidea.com/.toString(),"Add or Remove":/Add/.toString())
        //Add/Remove Community Administrator
        new actions.SetupEnterpriseCommunities.AddRemoveCommunityAdministrator().run("User":/Community Admin/.toString(),"Add or Remove":/Add/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Add or Update":/Add/.toString(),"Access Business Impact From":/View Idea/.toString())
        //Set Date Version and Notes for Financial Summary in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetDateandNotesforFinancialSummaryinBusinessImpacttab().run("Date":/06\/01\/2021/.toString())
        //Set Benefits in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetBenefitsinBusinessImpacttab().run("Add or Edit Benefits":/Add,Add,Add,Add/.toString(),"Year":/2021,2022,2021,2022/.toString(),"Current Year":/2021/.toString(),"Benefit Type":/Cost Savings,Cost Savings,Revenue,Revenue/.toString(),"Projected Benefit":/5000,15000,1000,2000/.toString(),"Actual Benefit":/4000,14000,3000,1000/.toString(),"Row Number of the Benefit":/1,1,2,2/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Action":/Save Version/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Solve App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/solve test idea1/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Add or Update":/Add/.toString(),"Access Business Impact From":/View Idea/.toString())
        //Set Date Version and Notes for Financial Summary in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetDateandNotesforFinancialSummaryinBusinessImpacttab().run("Date":/06\/01\/2021/.toString())
        //Set Benefits in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetBenefitsinBusinessImpacttab().run("Add or Edit Benefits":/Add,Add,Add,Add/.toString(),"Year":/2021,2022,2021,2022/.toString(),"Current Year":/2021/.toString(),"Benefit Type":/Cost Savings,Cost Savings,Revenue,Revenue/.toString(),"Projected Benefit":/2000,10000,2000,10000/.toString(),"Actual Benefit":/4000,14000,3000,1000/.toString(),"Row Number of the Benefit":/1,1,2,2/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Action":/Save Version/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Evaluators app/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/eval idea 1/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Add or Update":/Add/.toString(),"Access Business Impact From":/View Idea/.toString())
        //Set Date Version and Notes for Financial Summary in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetDateandNotesforFinancialSummaryinBusinessImpacttab().run("Date":/06\/01\/2021/.toString())
        //Set Benefits in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetBenefitsinBusinessImpacttab().run("Add or Edit Benefits":/Add,Add,Add,Add/.toString(),"Year":/2021,2022,2021,2022/.toString(),"Current Year":/2021/.toString(),"Benefit Type":/Cost Savings,Cost Savings,Revenue,Revenue/.toString(),"Projected Benefit":/200,1000,200,1000/.toString(),"Actual Benefit":/400,1400,300,100/.toString(),"Row Number of the Benefit":/1,1,2,2/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Action":/Save Version/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        //Navigate Community Admin Bar Dropdown
        new actions.general.NavigateCommunityAdminBar().run("Area to Navigate to":/Dashboard/.toString())
        //Navigate To Analytics Dashboard and Tab
        new actions.NGAAnalyticsDashboard.NavigateToAnalyticsDashboardandTab().run("Dashboard":/Business Impact Dashboard/.toString())
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/*[@id='sidebar-content']/.toString(),"Should Element Exist":false)
        //Verify Initiative in the Initiative Table on Enterprise Business Impact tab
        new actions.NGAAnalyticsDashboard.VerifyInitiativeintheInitiativeTableonEnterpriseBusinessImpacttab().run("Initiative":/Custom App/.toString(),"Initiative Image":/Default Image/.toString(),"App Type":/Custom/.toString(),"Status":/Active/.toString(),"Submissions with Impact":/1/.toString(),"Total Projected Benefits":/$23,000/.toString(),"Total Actual Benefits":/$22,000/.toString(),"Total Target Benefits":/$0/.toString(),"Total Projected Costs":/$0/.toString(),"Total Actual Costs":/$0/.toString(),"Number of Matches":/1/.toString())
        //Verify Initiative in the Initiative Table on Enterprise Business Impact tab
        new actions.NGAAnalyticsDashboard.VerifyInitiativeintheInitiativeTableonEnterpriseBusinessImpacttab().run("Initiative":/Solve App/.toString(),"Initiative Image":/Default Image/.toString(),"App Type":/Solve/.toString(),"Status":/Closed/.toString(),"Submissions with Impact":/1/.toString(),"Total Projected Benefits":/$24,000/.toString(),"Total Actual Benefits":/$22,000/.toString(),"Total Target Benefits":/$0/.toString(),"Total Projected Costs":/$0/.toString(),"Total Actual Costs":/$0/.toString(),"Number of Matches":/1/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        try{
            //Navigate to Community in Community Dashboard
            new actions.NGAAnalyticsDashboard.NavigateCommunityCommunityDashboard().run("Select Community":/Test2 Community/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/DIV[@class='f-community-admin-nav-community-dropdown']\/\/DIV[contains(@class, 'fractal-dropdown')]\/DIV[contains(@class,'f-dropdown-btn')]\/..\/UL[@class='f-dropdown-options']\/LI\/SPAN[contains(.,'Test2 Community')]/.toString(),"Should Element Exist":false)
        //Verify Initiative in the Initiative Table on Enterprise Business Impact tab
        new actions.NGAAnalyticsDashboard.VerifyInitiativeintheInitiativeTableonEnterpriseBusinessImpacttab().run("Initiative":/Evaluators app/.toString(),"Initiative Image":/Default Image/.toString(),"App Type":/Solve/.toString(),"Status":/Closed/.toString(),"Submissions with Impact":/1/.toString(),"Total Projected Benefits":/$2,400/.toString(),"Total Actual Benefits":/$2,200/.toString(),"Total Target Benefits":/$0/.toString(),"Total Projected Costs":/$0/.toString(),"Total Actual Costs":/$0/.toString(),"Number of Matches":/0/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/communityadmin@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        //Navigate Community Admin Bar Dropdown
        new actions.general.NavigateCommunityAdminBar().run("Area to Navigate to":/Dashboard/.toString())
        //Navigate To Analytics Dashboard and Tab
        new actions.NGAAnalyticsDashboard.NavigateToAnalyticsDashboardandTab().run("Dashboard":/Business Impact Dashboard/.toString())
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/*[@id='sidebar-content']/.toString(),"Should Element Exist":false)
        //Verify Initiative in the Initiative Table on Enterprise Business Impact tab
        new actions.NGAAnalyticsDashboard.VerifyInitiativeintheInitiativeTableonEnterpriseBusinessImpacttab().run("Initiative":/Custom App/.toString(),"Initiative Image":/Default Image/.toString(),"App Type":/Custom/.toString(),"Status":/Active/.toString(),"Submissions with Impact":/1/.toString(),"Total Projected Benefits":/$23,000/.toString(),"Total Actual Benefits":/$22,000/.toString(),"Total Target Benefits":/$0/.toString(),"Total Projected Costs":/$0/.toString(),"Total Actual Costs":/$0/.toString(),"Number of Matches":/1/.toString())
        //Verify Initiative in the Initiative Table on Enterprise Business Impact tab
        new actions.NGAAnalyticsDashboard.VerifyInitiativeintheInitiativeTableonEnterpriseBusinessImpacttab().run("Initiative":/Solve App/.toString(),"Initiative Image":/Default Image/.toString(),"App Type":/Solve/.toString(),"Status":/Closed/.toString(),"Submissions with Impact":/1/.toString(),"Total Projected Benefits":/$24,000/.toString(),"Total Actual Benefits":/$22,000/.toString(),"Total Target Benefits":/$0/.toString(),"Total Projected Costs":/$0/.toString(),"Total Actual Costs":/$0/.toString(),"Number of Matches":/1/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Navigate to Community in Community Dashboard
        new actions.NGAAnalyticsDashboard.NavigateCommunityCommunityDashboard().run("Select Community":/Test2 Community/.toString())
        //Verify Initiative in the Initiative Table on Enterprise Business Impact tab
        new actions.NGAAnalyticsDashboard.VerifyInitiativeintheInitiativeTableonEnterpriseBusinessImpacttab().run("Initiative":/Evaluators app/.toString(),"Initiative Image":/Default Image/.toString(),"App Type":/Solve/.toString(),"Status":/Closed/.toString(),"Submissions with Impact":/1/.toString(),"Total Projected Benefits":/$2,400/.toString(),"Total Actual Benefits":/$2,200/.toString(),"Total Target Benefits":/$0/.toString(),"Total Projected Costs":/$0/.toString(),"Total Actual Costs":/$0/.toString(),"Number of Matches":/1/.toString())
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