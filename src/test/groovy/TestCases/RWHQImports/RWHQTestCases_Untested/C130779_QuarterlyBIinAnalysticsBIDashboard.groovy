package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C130779 - Quarterly BI in Analystics BI Dashboard
class C130779_QuarterlyBIinAnalysticsBIDashboard
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
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Custom Initiative title/.toString(),"Description":/Custom Initiative description/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom Initiative title/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/quarterly idea1/.toString(),"Action":/Submit/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom Initiative title/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/quarterly idea1/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Add or Update":/Add/.toString(),"Access Business Impact From":/View Idea 3/.toString())
        //Set Date Version and Notes for Financial Summary in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetDateandNotesforFinancialSummaryinBusinessImpacttab().run("Date":/08\/18\/2021/.toString())
        //Set Benefits in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetBenefitsinBusinessImpacttab().run("Add or Edit Benefits":/Add,Add/.toString(),"Year":/Q3 2021,Q4 2021/.toString(),"Current Year":/Q3 2021/.toString(),"Benefit Type":/Cost Savings,Cost Savings/.toString(),"Projected Benefit":/15000,9000/.toString(),"Actual Benefit":/14000,10000/.toString(),"Row Number of the Benefit":/1,1/.toString())
        //Set Costs in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetCostsinBusinessImpacttab().run("Add or Edit Costs":/Add,Add/.toString(),"Year":/Q3 2021,Q4 2021/.toString(),"Current Year":/Q3 2021/.toString(),"Cost Title":/New Cost,New Cost/.toString(),"Projected Cost":/30000,5000/.toString(),"Actual Cost":/10000,6000/.toString(),"Row Number":/1,1/.toString())
        //Add or Delete Year in Business Impact Tab
        new actions.ViewIdea.BusinessImpact.AddorDeleteYearinBusinessImpactTab().run("Add or Delete":/Add/.toString())
        //Set Benefits in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetBenefitsinBusinessImpacttab().run("Add or Edit Benefits":/Add/.toString(),"Year":/Q1 2022/.toString(),"Current Year":/Q3 2021/.toString(),"Benefit Type":/Cost Savings/.toString(),"Projected Benefit":/25000/.toString(),"Actual Benefit":/24000/.toString(),"Row Number of the Benefit":/1/.toString())
        //Set Costs in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetCostsinBusinessImpacttab().run("Add or Edit Costs":/Add/.toString(),"Year":/Q1 2022/.toString(),"Current Year":/Q3 2021/.toString(),"Cost Title":/New Cost/.toString(),"Projected Cost":/4000/.toString(),"Actual Cost":/25644/.toString(),"Row Number":/1,1/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Action":/Save Version/.toString())
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Close Idea Modal":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Add or Update":/Add/.toString(),"Access Business Impact From":/View Idea/.toString())
        //Set Date Version and Notes for Financial Summary in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetDateandNotesforFinancialSummaryinBusinessImpacttab().run("Date":/06\/20\/2021/.toString())
        //Set Benefits in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetBenefitsinBusinessImpacttab().run("Add or Edit Benefits":/Add,Add/.toString(),"Year":/2021,2021/.toString(),"Current Year":/2021/.toString(),"Benefit Type":/Revenue,Cost Savings/.toString(),"Projected Benefit":/5000,1000/.toString(),"Actual Benefit":/4000,3000/.toString(),"Row Number of the Benefit":/1,2/.toString())
        //Set Costs in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetCostsinBusinessImpacttab().run("Add or Edit Costs":/Add/.toString(),"Year":/2021/.toString(),"Current Year":/2021/.toString(),"Cost Title":/New Cost/.toString(),"Projected Cost":/100/.toString(),"Actual Cost":/14000/.toString(),"Row Number":/1/.toString())
        //Add or Delete Year in Business Impact Tab
        new actions.ViewIdea.BusinessImpact.AddorDeleteYearinBusinessImpactTab().run("Add or Delete":/Delete/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Action":/Save Version/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Analytics/.toString())
        //Navigate To Analytics Dashboard and Tab
        new actions.NGAAnalyticsDashboard.NavigateToAnalyticsDashboardandTab().run("Dashboard":/Business Impact Dashboard/.toString())
        //Set Financial Targets in the Business Impact tab
        new actions.PipelineDashBoard.SetfinancialtargetsintheBusinessImpacttab().run("Year":/2021/.toString(),"Targets":/100/.toString(),"Action":/Save Targets/.toString())
        //Verify Benefits Over Time Stats
        new actions.PipelineDashBoard.VerifyBenefitsOverTimeStats().run("Total Projected Benefits":/$55,000/.toString(),"Total Actual Benefits":/$55,000/.toString(),"Total Target Benefits":/$100/.toString())
        //Verify the MouseHover on Chart View in Business Impact Tab
        new actions.PipelineDashBoard.VerifyMouseHoveronBusinessImpactTabinPipelineDashBoard().run("Year":/2021,2022/.toString(),"Projected":/$30,000;$55,000/.toString(),"Actual":/$31,000;$55,000/.toString(),"Target":/$100;$100/.toString())
        //Verify the MouseHover on Chart View in Business Impact Tab
        new actions.PipelineDashBoard.VerifyMouseHoveronBusinessImpactTabinPipelineDashBoard().run("Chart View":/Quarterly/.toString(),"Year":/Q1 2021,Q2 2021,Q3 2021,Q4 2021,Q1 2022,Q2 2022,Q3 2022,Q4 2022/.toString(),"Projected":/$0;$2,000;$17,000;$11,000;$25,000;$0;$0;$0/.toString(),"Actual":/$0;$2,333;$16,333;$12,334;$24,000;$0;$0;$0/.toString(),"Target":/$25;$25;$25;$25;<EMPTY>;<EMPTY>;<EMPTY>;<EMPTY>/.toString())
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