import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C131178 - Community Dashboard - Business Impact Dashboard - Financial Summary by Initiative
class C131178_CommunityDashboard_BusinessImpactDashboard_FinancialSummarybyInitiative
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Brightidea Administrator License Type Purchased Count":/5/.toString(),"Idea Box Manager License Type Purchased Count":/3/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Select Product in Apps Pillar Page
        new actions.AppsPillar.SelectProductinAppsPillarPage().run("Product":/Build/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Evaluators app/.toString(),"Description":/Custom Initiative description/.toString(),"Submission Name":/Submission/.toString(),"Submission Plural Name":/Submissions/.toString(),"Action":/Create/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Instance Ideabox/.toString(),"Sponsor Name":/Sri/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Test Ideabox/.toString(),"Description":/this is idea box app Test App/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Idea Box Managers":/Community Admin/.toString(),"Idea Box Managers Add or Remove":/Add/.toString(),"Admin Field Name":/Pipeline Managers/.toString(),"Pipeline Administrators":/Pipeline Admin/.toString(),"Administrators Add or Remove":/Add/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString(),"Action on General Information Tab":/Continue/.toString(),"Action on Design Tab":/Continue/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Select Product in Apps Pillar Page
        new actions.AppsPillar.SelectProductinAppsPillarPage().run("Product":/Build/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Custom Subpipeline/.toString(),"Description":/Custom Initiative description/.toString(),"Submission Name":/Submission/.toString(),"Submission Plural Name":/Submissions/.toString(),"Action":/Create/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom Subpipeline/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Site Setup for BI Beta tab
        new actions.SetupBI.SetSiteSetupforBIBetatab().run("This pipeline is an Idea Box Sub-pipeline":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Select Community
        new actions.SetupEnterpriseCommunities.SelectCommunity().run("Community Name":/Test Ideabox/.toString())
        //Update Community
        new actions.SetupEnterpriseCommunities.UpdateCommunity().run("Apps":/Custom Subpipeline/.toString(),"Checkbox Check":/TRUE/.toString())
        //Go to Community
        new actions.SetupEnterpriseCommunities.GotoCommunity().run("Community Name to go to":/Test Ideabox/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Copy Current URL
        variables."link" = new actions.selenium.CopyCurrentURL().run([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Add Community
        new actions.SetupEnterpriseCommunities.AddCommunity().run("Community Name":/Test1 Community/.toString(),"Action":/Create/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Select Community
        new actions.SetupEnterpriseCommunities.SelectCommunity().run("Community Name":/Test1 Community/.toString())
        //Update Community
        new actions.SetupEnterpriseCommunities.UpdateCommunity().run("Apps":/Evaluators app/.toString(),"Checkbox Check":/TRUE/.toString())
        //Go to Community
        new actions.SetupEnterpriseCommunities.GotoCommunity().run("Community Name to go to":/Test1 Community/.toString())
        //Navigate Community
        new actions.SetupEnterpriseCommunities.NavigateCommunity().run("Community Page":/Setup/.toString())
        try{
            //Set Community Admin in Community Setup
            new actions.SetupUsers.SetCommunityAdmininCommunitySetup().run("Field Name":/Community Administrators/.toString(),"Community Admin or Idea Box Manager":/Community Admin/.toString(),"Add or Remove":/Add/.toString())
        }
       catch(all){}catch(Error err){}
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/*[@id='f-modal-submit']/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/*[@id='f-save-roles']/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Test Ideabox/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Ideas tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforIdeastab().run("Business impact tab":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Test Ideabox/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/box idea1/.toString(),"Description":/desc/.toString(),"Category":/Process Improvement/.toString(),"Action":/Submit Idea/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/box idea1/.toString())
        //Set Tab in View Idea 3
        new actions.ViewIdea30.SetTabinViewIdea3().run("Tab":/Business Impact/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Add or Update":/Add/.toString())
        //Set Date Version and Notes for Financial Summary in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetDateandNotesforFinancialSummaryinBusinessImpacttab().run("Date":/06\/01\/2021/.toString())
        //Set Benefits in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetBenefitsinBusinessImpacttab().run("Add or Edit Benefits":/Add,Add,Add,Add/.toString(),"Year":/2021,2022,2021,2022/.toString(),"Current Year":/2021/.toString(),"Benefit Type":/Cost Savings,Cost Savings,Revenue,Revenue/.toString(),"Projected Benefit":/5000,15000,1000,2000/.toString(),"Actual Benefit":/4000,14000,3000,1000/.toString(),"Row Number of the Benefit":/1,1,2,2/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Action":/Save Version/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom Subpipeline/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/sub idea1/.toString(),"Description":/desc/.toString(),"Category":/New Product/.toString(),"Action":/Submit Idea/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/sub idea1/.toString())
        //Set Tab in View Idea 3
        new actions.ViewIdea30.SetTabinViewIdea3().run("Tab":/Business Impact/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Add or Update":/Add/.toString())
        //Set Date Version and Notes for Financial Summary in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetDateandNotesforFinancialSummaryinBusinessImpacttab().run("Date":/06\/01\/2021/.toString())
        //Set Benefits in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetBenefitsinBusinessImpacttab().run("Add or Edit Benefits":/Add,Add,Add,Add/.toString(),"Year":/2021,2022,2021,2022/.toString(),"Current Year":/2021/.toString(),"Benefit Type":/Cost Savings,Cost Savings,Revenue,Revenue/.toString(),"Projected Benefit":/2000,10000,2000,10000/.toString(),"Actual Benefit":/4000,14000,3000,1000/.toString(),"Row Number of the Benefit":/1,1,2,2/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Action":/Save Version/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Evaluators app/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/eval test idea1/.toString(),"Description":/desc/.toString(),"Category":/Operations/.toString(),"Action":/Submit Idea/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/eval test idea1/.toString())
        //Set Tab in View Idea 3
        new actions.ViewIdea30.SetTabinViewIdea3().run("Tab":/Business Impact/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Add or Update":/Add/.toString())
        //Set Date Version and Notes for Financial Summary in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetDateandNotesforFinancialSummaryinBusinessImpacttab().run("Date":/06\/01\/2021/.toString())
        //Set Benefits in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetBenefitsinBusinessImpacttab().run("Add or Edit Benefits":/Add,Add,Add,Add/.toString(),"Year":/2021,2022,2021,2022/.toString(),"Current Year":/2021/.toString(),"Benefit Type":/Cost Savings,Cost Savings,Revenue,Revenue/.toString(),"Projected Benefit":/200,1000,200,1000/.toString(),"Actual Benefit":/400,1400,300,100/.toString(),"Row Number of the Benefit":/1,1,2,2/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Action":/Save Version/.toString())
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Close Idea Modal":true)
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
        //Wait
        new actions.general.Wait().run("Seconds":/3/.toString())
        //Verify Initiative in the Initiative Table on Enterprise Business Impact tab
        new actions.NGAAnalyticsDashboard.VerifyInitiativeintheInitiativeTableonEnterpriseBusinessImpacttab().run("Initiative":/Test Ideabox/.toString(),"Status":/Active/.toString(),"Submissions with Impact":/1/.toString(),"Total Projected Benefits":/$23,000/.toString(),"Total Actual Benefits":/$22,000/.toString(),"Total Target Benefits":/$0/.toString(),"Total Projected Costs":/$0/.toString(),"Total Actual Costs":/$0/.toString(),"Row Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Initiative in the Initiative Table on Enterprise Business Impact tab
        new actions.NGAAnalyticsDashboard.VerifyInitiativeintheInitiativeTableonEnterpriseBusinessImpacttab().run("Initiative":/Custom Subpipeline/.toString(),"Status":/Active/.toString(),"Submissions with Impact":/1/.toString(),"Total Projected Benefits":/$24,000/.toString(),"Total Actual Benefits":/$22,000/.toString(),"Total Target Benefits":/$0/.toString(),"Total Projected Costs":/$0/.toString(),"Total Actual Costs":/$0/.toString(),"Row Number":/1/.toString(),"Number of Matches":/1/.toString())
        try{
            //Verify Initiative in the Initiative Table on Enterprise Business Impact tab
            new actions.NGAAnalyticsDashboard.VerifyInitiativeintheInitiativeTableonEnterpriseBusinessImpacttab().run("Initiative":/Evaluators app/.toString(),"App Type":/Custom/.toString(),"Status":/Active/.toString(),"Submissions with Impact":/1/.toString(),"Total Projected Benefits":/$2,400/.toString(),"Total Actual Benefits":/$2,200/.toString(),"Total Target Benefits":/$0/.toString(),"Total Projected Costs":/$0/.toString(),"Total Actual Costs":/$0/.toString(),"Number of Matches":/0/.toString())
        }
       catch(all){}catch(Error err){}
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Navigate to Community in Community Dashboard
        new actions.NGAAnalyticsDashboard.NavigateCommunityCommunityDashboard().run("Select Community":/Test1 Community/.toString())
        try{
            //Verify Initiative in the Initiative Table on Enterprise Business Impact tab
            new actions.NGAAnalyticsDashboard.VerifyInitiativeintheInitiativeTableonEnterpriseBusinessImpacttab().run("Initiative":/Evaluators app/.toString(),"App Type":/Custom/.toString(),"Status":/Active/.toString(),"Submissions with Impact":/1/.toString(),"Total Projected Benefits":/$2,400/.toString(),"Total Actual Benefits":/$2,200/.toString(),"Total Target Benefits":/$0/.toString(),"Total Projected Costs":/$0/.toString(),"Total Actual Costs":/$0/.toString(),"Number of Matches":/1/.toString())
        }
       catch(all){}catch(Error err){}
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