import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C51123 - NGA View Idea Financial and NonFinancial Data in Business Impact tab on Refresh
class C51123_NGAViewIdeaFinancialandNonFinancialDatainBusinessImpacttabonRefresh
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
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Access Pipeline Manage Steps for a Step
        new actions.PipelineStepsView.AccessPipelineManageStepsforaStep().run("Step Name":/Review/.toString())
        //Access Idea in Pipeline Manage Currently in Step Page
        new actions.PipelineManageSteps.AccessIdeainPipelineManageCurrentlyinStepPage().run("Idea name":/test idea1/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Add or Update":/Add/.toString(),"Access Business Impact From":/NGA View Idea/.toString())
        //Set Date Version and Notes for Financial Summary in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetDateandNotesforFinancialSummaryinBusinessImpacttab().run("Date":/05\/09\/2018/.toString())
        //Set Benefits in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetBenefitsinBusinessImpacttab().run("Add or Edit Benefits":/Add,Add/.toString(),"Year":/2018,2019/.toString(),"Current Year":/2018/.toString(),"Benefit Type":/Revenue,Revenue/.toString(),"Projected Benefit":/5000,15000/.toString(),"Actual Benefit":/4000,14000/.toString(),"Row Number of the Benefit":/1,1/.toString())
        //Set Costs in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetCostsinBusinessImpacttab().run("Add or Edit Costs":/Add,Add/.toString(),"Year":/2018,2019/.toString(),"Current Year":/2018/.toString(),"Cost Title":/Current Assets,Current Assets/.toString(),"Projected Cost":/300,23890/.toString(),"Actual Cost":/10000,789/.toString(),"Row Number":/1,1/.toString())
        //Set Non Financial Benefit in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetNonFinancialBenefitinBusinessImpacttab().run("Add or Edit":/Add/.toString(),"Benefit Title":/Product Launch/.toString(),"Benefit Type":/Brand Awareness/.toString(),"Description":/A Product Launch is a marketing strategy consisting of a carefully planned and scheduled sequence of events./.toString(),"Row Number":/1/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Action":/Save Version/.toString())
        try{
            //Verify Votes tab in NGA View Idea page
            new actions.NGAViewIdea.VerifyVotestabinNGAViewIdeapage().run("User":/Sri/.toString(),"Number of Matches":/1/.toString())
        }
       catch(all){}catch(Error err){}
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Access Business Impact From":/NGA View Idea/.toString())
        //Verify Non Financial Benefits in Business Impact tab for View Idea page
        new actions.ViewIdea.BusinessImpact.VerifyNonFinancialBenefitsinBusinessImpacttabforViewIdeapage().run("Benefit Title":/Product Launch/.toString(),"Benefit Type":/Brand Awareness/.toString(),"Description":/A Product Launch is a marketing strategy consisting of a carefully planned and scheduled sequence of events./.toString(),"Row Number":/1/.toString())
        //Verify Projected and Actual Costs in Business Impact tab for View Idea page
        new actions.ViewIdea.BusinessImpact.VerifyProjectedandActualCostsinBusinessImpacttabforViewIdeapage().run("Year":/2018;2019/.toString(),"Current Year":/2018/.toString(),"Costs Title":/Current Assets;Current Assets/.toString(),"Row Number":/1;1/.toString(),"Projected Cost":/300;23,890/.toString(),"Actual Cost":/10,000;789/.toString())
        //Verify Projected and Actual Benefits in Business Impact tab for View Idea page
        new actions.ViewIdea.BusinessImpact.VerifyProjectedandActualBenefitsinBusinessImpacttabforViewIdeapage().run("Year":/2018;2019/.toString(),"Current Year":/2018/.toString(),"Benefit Type":/Revenue;Revenue/.toString(),"Row Number of the Benefit":/1;1/.toString(),"Projected Benefit":/5,000;15,000/.toString(),"Actual Benefit":/4,000;14,000/.toString())
        //Verify Total Cost and Benefits in Business Impact tab
        new actions.ViewIdea.BusinessImpact.VerifyTotalCostandBenefitsinBusinessImpacttab().run("Year":/2018;2019/.toString(),"Current Year":/2018/.toString(),"Total Projected Benefit":/5,000;15,000/.toString(),"Total Actual Benefit":/4,000;14,000/.toString(),"Total Projected Cost":/300;23,890/.toString(),"Total Actual Cost":/10,000;789/.toString(),"Projected Net Benefit":/4,700;-8,890/.toString(),"Actual Net Benefit":/-6,000;13,211/.toString())
        //Verify Total Cost and Benefits in Business Impact tab
        new actions.ViewIdea.BusinessImpact.VerifyTotalCostandBenefitsinBusinessImpacttab().run("Year":/2018;2019/.toString(),"Current Year":/2018/.toString(),"Total Projected Benefit":/5,000;15,000/.toString(),"Total Actual Benefit":/4,000;14,000/.toString(),"Total Projected Cost":/300;23,890/.toString(),"Total Actual Cost":/10,000;789/.toString(),"Projected Net Benefit":/4,700;-8,890/.toString(),"Actual Net Benefit":/-6,000;13,211/.toString())
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