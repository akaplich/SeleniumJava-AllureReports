import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C130726 - Export Quarterly Business Impact Data from Site Setup
class C130726_ExportQuarterlyBusinessImpactDatafromSiteSetup
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
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom Initiative title/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Exports for Submissions tab
        new actions.SetupExports.SetWebstormSetupExportsforSubmissionstab().run("Report Options":/Submissions with Outcomes Details/.toString(),"Format":/xlsx/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Report Name Starts with":/Outcomes Details/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Outcomes Details-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["2021 Q3 Projected Benefit ($)","2021 Q3 Projected Cost ($)","2021 Q3 Actual Benefit ($)","2021 Q3 Actual Cost ($)","2021 Q4 Projected Benefit ($)","2021 Q4 Projected Cost ($)","2021 Q4 Actual Benefit ($)","2021 Q4 Actual Cost ($)","2022 Q1 Projected Benefit ($)","2022 Q1 Projected Cost ($)","2022 Q1 Actual Benefit ($)","2022 Q1 Actual Cost ($)"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Report Name Starts with":/Outcomes Details/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Outcomes Details-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Benefit","Cost Savings","15000","0","14000"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Report Name Starts with":/Outcomes Details/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Outcomes Details-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Cost","New Cost","0","-30000"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Report Name Starts with":/Outcomes Details/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Outcomes Details-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["-4000","0","-25644"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
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