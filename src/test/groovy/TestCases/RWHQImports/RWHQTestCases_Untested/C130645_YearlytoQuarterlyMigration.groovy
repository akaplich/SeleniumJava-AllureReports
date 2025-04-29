package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C130645 - Yearly to Quarterly Migration
class C130645_YearlytoQuarterlyMigration
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
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Team Workspace Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforTeamWorkspaceTab().run("Team Workspace":true,"Business Impact Tab":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Access Team Workspace
        new actions.ViewIdea.TeamWorkspace.AccessTeamWorkspace().run([:])
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Add or Update":/Add/.toString(),"Access Business Impact From":/Team Workspace/.toString())
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
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Ideas tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforIdeastab().run("Business impact timeframe":/Quarterly/.toString(),"Action for Business impact timeframe modal":/Continue/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Access Business Impact From":/View Idea/.toString())
        //Verify Projected and Actual Costs in Business Impact tab for View Idea page
        new actions.ViewIdea.BusinessImpact.VerifyProjectedandActualCostsinBusinessImpacttabforViewIdeapage().run("Year":/Q2 2021;Q3 2021;Q4 2021/.toString(),"Current Year":/Q2 2021/.toString(),"Costs Title":/New Cost;New Cost;New Cost/.toString(),"Row Number":/1;1;1/.toString(),"Projected Cost":/33;33;34/.toString(),"Actual Cost":/4,666;4,666;4,668/.toString())
        //Verify Projected and Actual Benefits in Business Impact tab for View Idea page
        new actions.ViewIdea.BusinessImpact.VerifyProjectedandActualBenefitsinBusinessImpacttabforViewIdeapage().run("Year":/Q2 2021;Q3 2021;Q2 2021;Q3 2021;Q4 2021;Q4 2021/.toString(),"Current Year":/Q2 2021/.toString(),"Benefit Type":/Revenue;Revenue;Cost Savings;Cost Savings;Revenue;Cost Savings/.toString(),"Row Number of the Benefit":/1;1;2;2;1;2/.toString(),"Projected Benefit":/1,666;1,666;333;333;1,668;334/.toString(),"Actual Benefit":/1,333;1,333;1,000;1,000;1,334;1,000/.toString())
        //Verify Total Cost and Benefits in Business Impact tab
        new actions.ViewIdea.BusinessImpact.VerifyTotalCostandBenefitsinBusinessImpacttab().run("Year":/Q2 2021;Q3 2021;Q4 2021/.toString(),"Current Year":/Q2 2021/.toString(),"Total Projected Benefit":/1,999;1,999;2,002/.toString(),"Total Actual Benefit":/2,333;2,333;2,334/.toString(),"Total Projected Cost":/33;33;34/.toString(),"Total Actual Cost":/4,666;4,666;4,668/.toString(),"Projected Net Benefit":/1,966;1,966;1,968/.toString(),"Actual Net Benefit":/-2,333;-2,333;-2,334/.toString())
        //Access Team Workspace
        new actions.ViewIdea.TeamWorkspace.AccessTeamWorkspace().run([:])
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Access Business Impact From":/Team Workspace/.toString())
        //Verify Projected and Actual Costs in Business Impact tab for View Idea page
        new actions.ViewIdea.BusinessImpact.VerifyProjectedandActualCostsinBusinessImpacttabforViewIdeapage().run("Year":/Q2 2021;Q3 2021;Q4 2021/.toString(),"Current Year":/Q2 2021/.toString(),"Costs Title":/New Cost;New Cost;New Cost/.toString(),"Row Number":/1;1;1/.toString(),"Projected Cost":/33;33;34/.toString(),"Actual Cost":/4,666;4,666;4,668/.toString())
        //Verify Projected and Actual Benefits in Business Impact tab for View Idea page
        new actions.ViewIdea.BusinessImpact.VerifyProjectedandActualBenefitsinBusinessImpacttabforViewIdeapage().run("Year":/Q2 2021;Q3 2021;Q2 2021;Q3 2021;Q4 2021;Q4 2021/.toString(),"Current Year":/Q2 2021/.toString(),"Benefit Type":/Revenue;Revenue;Cost Savings;Cost Savings;Revenue;Cost Savings/.toString(),"Row Number of the Benefit":/1;1;2;2;1;2/.toString(),"Projected Benefit":/1,666;1,666;333;333;1,668;334/.toString(),"Actual Benefit":/1,333;1,333;1,000;1,000;1,334;1,000/.toString())
        //Verify Total Cost and Benefits in Business Impact tab
        new actions.ViewIdea.BusinessImpact.VerifyTotalCostandBenefitsinBusinessImpacttab().run("Year":/Q2 2021;Q3 2021;Q4 2021/.toString(),"Current Year":/Q2 2021/.toString(),"Total Projected Benefit":/1,999;1,999;2,002/.toString(),"Total Actual Benefit":/2,333;2,333;2,334/.toString(),"Total Projected Cost":/33;33;34/.toString(),"Total Actual Cost":/4,666;4,666;4,668/.toString(),"Projected Net Benefit":/1,966;1,966;1,968/.toString(),"Actual Net Benefit":/-2,333;-2,333;-2,334/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Access Pipeline Manage Steps for a Step
        new actions.PipelineStepsView.AccessPipelineManageStepsforaStep().run("Step Name":/Review/.toString())
        //Access Idea in Pipeline Manage Currently in Step Page
        new actions.PipelineManageSteps.AccessIdeainPipelineManageCurrentlyinStepPage().run("Idea name":/test idea1/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Access Business Impact From":/NGA View Idea/.toString())
        //Verify Projected and Actual Costs in Business Impact tab for View Idea page
        new actions.ViewIdea.BusinessImpact.VerifyProjectedandActualCostsinBusinessImpacttabforViewIdeapage().run("Year":/Q2 2021;Q3 2021;Q4 2021/.toString(),"Current Year":/Q2 2021/.toString(),"Costs Title":/New Cost;New Cost;New Cost/.toString(),"Row Number":/1;1;1/.toString(),"Projected Cost":/33;33;34/.toString(),"Actual Cost":/4,666;4,666;4,668/.toString())
        //Verify Projected and Actual Benefits in Business Impact tab for View Idea page
        new actions.ViewIdea.BusinessImpact.VerifyProjectedandActualBenefitsinBusinessImpacttabforViewIdeapage().run("Year":/Q2 2021;Q3 2021;Q2 2021;Q3 2021;Q4 2021;Q4 2021/.toString(),"Current Year":/Q2 2021/.toString(),"Benefit Type":/Revenue;Revenue;Cost Savings;Cost Savings;Revenue;Cost Savings/.toString(),"Row Number of the Benefit":/1;1;2;2;1;2/.toString(),"Projected Benefit":/1,666;1,666;333;333;1,668;334/.toString(),"Actual Benefit":/1,333;1,333;1,000;1,000;1,334;1,000/.toString())
        //Verify Total Cost and Benefits in Business Impact tab
        new actions.ViewIdea.BusinessImpact.VerifyTotalCostandBenefitsinBusinessImpacttab().run("Year":/Q2 2021;Q3 2021;Q4 2021/.toString(),"Current Year":/Q2 2021/.toString(),"Total Projected Benefit":/1,999;1,999;2,002/.toString(),"Total Actual Benefit":/2,333;2,333;2,334/.toString(),"Total Projected Cost":/33;33;34/.toString(),"Total Actual Cost":/4,666;4,666;4,668/.toString(),"Projected Net Benefit":/1,966;1,966;1,968/.toString(),"Actual Net Benefit":/-2,333;-2,333;-2,334/.toString())
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