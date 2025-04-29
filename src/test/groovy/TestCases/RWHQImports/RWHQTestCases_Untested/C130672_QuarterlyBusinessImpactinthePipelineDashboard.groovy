import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C130672 - Quarterly Business Impact in the Pipeline Dashboard
class C130672_QuarterlyBusinessImpactinthePipelineDashboard
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
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom Initiative title/.toString(),"Area to Navigate to":/Pipeline Dashboard/.toString())
        //Navigate To Pipeline DashBoard Tab
        new actions.PipelineDashBoard.NavigateToPipelineDashBoardTab().run("Tab":/Business Impact Tab/.toString())
        //Verify Benefits Over Time Stats
        new actions.PipelineDashBoard.VerifyBenefitsOverTimeStats().run("Total Projected Benefits":/$49,000/.toString(),"Total Actual Benefits":/$48,000/.toString(),"Total Target Benefits":/<EMPTY>/.toString())
        //Set Financial Targets in the Business Impact tab
        new actions.PipelineDashBoard.SetfinancialtargetsintheBusinessImpacttab().run("Year":/Q2-2021/.toString(),"Targets":/1000/.toString())
        //Set Financial Targets in the Business Impact tab
        new actions.PipelineDashBoard.SetfinancialtargetsintheBusinessImpacttab().run("Year":/Q3-2021/.toString(),"Targets":/500/.toString())
        //Set Financial Targets in the Business Impact tab
        new actions.PipelineDashBoard.SetfinancialtargetsintheBusinessImpacttab().run("Year":/Q1-2023/.toString(),"Targets":/1500/.toString(),"Action":/Save Targets/.toString())
        //Verify Benefits Over Time Stats
        new actions.PipelineDashBoard.VerifyBenefitsOverTimeStats().run("Total Projected Benefits":/$49,000/.toString(),"Total Actual Benefits":/$48,000/.toString(),"Total Target Benefits":/$3,000/.toString())
        //Verify the MouseHover on Chart View in Business Impact Tab
        new actions.PipelineDashBoard.VerifyMouseHoveronBusinessImpactTabinPipelineDashBoard().run("Year":/Q1 2021,Q2 2021,Q3 2021,Q4 2021,Q1 2022,Q2 2022,Q3 2022,Q4 2022,Q1 2023/.toString(),"Projected":/$0;$0;$15,000;$9,000;$25,000;$0;$0;$0;<EMPTY>/.toString(),"Actual":/$0;$0;$14,000;$10,000;$24,000;$0;$0;$0;<EMPTY>/.toString(),"Target":/<EMPTY>;$1,000;$500;<EMPTY>;<EMPTY>;<EMPTY>;<EMPTY>;<EMPTY>;$1,500/.toString())
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