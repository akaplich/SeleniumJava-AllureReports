import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C111062 - Business Impact tab - Versioning dropdown, current version, previous versions
class C111062_BusinessImpacttab_Versioningdropdown_currentversion_previousversions
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
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Add or Update":/Add/.toString(),"Access Business Impact From":/View Idea/.toString())
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
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/pipelineadmin@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Add or Update":/Update/.toString(),"Access Business Impact From":/View Idea/.toString())
        //Set Costs in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetCostsinBusinessImpacttab().run("Add or Edit Costs":/Add,Add/.toString(),"Year":/2018,2019/.toString(),"Current Year":/2018/.toString(),"Cost Title":/Future Assets,Future Assets/.toString(),"Projected Cost":/6300,14000/.toString(),"Actual Cost":/1000,7800/.toString(),"Row Number":/2,2/.toString())
        //Set Benefits in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetBenefitsinBusinessImpacttab().run("Add or Edit Benefits":/Add,Add,Edit,Edit/.toString(),"Year":/2018,2019,2018,2019/.toString(),"Current Year":/2018/.toString(),"Benefit Type":/Other,Other,Revenue,Revenue/.toString(),"Projected Benefit":/85000,14000,9000,189/.toString(),"Actual Benefit":/74000,14000,14000,4000/.toString(),"Row Number of the Benefit":/2,2,1,1/.toString())
        //Set Non Financial Benefit in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetNonFinancialBenefitinBusinessImpacttab().run("Add or Edit":/Edit/.toString(),"Benefit Title":/Product Launch Canceled/.toString(),"Benefit Type":/Customer Satisfaction/.toString(),"Description":/Changed Description/.toString(),"Row Number":/1/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Action":/Save Version/.toString())
        //Verify Projected and Actual Costs in Business Impact tab for View Idea page
        new actions.ViewIdea.BusinessImpact.VerifyProjectedandActualCostsinBusinessImpacttabforViewIdeapage().run("Year":/2018;2019;2018;2019/.toString(),"Current Year":/2018/.toString(),"Costs Title":/Current Assets;Current Assets;Future Assets;Future Assets/.toString(),"Row Number":/1;1;2;2/.toString(),"Projected Cost":/300;23,890;6,300;14,000/.toString(),"Actual Cost":/10,000;789;1,000;7,800/.toString())
        //Verify Projected and Actual Benefits in Business Impact tab for View Idea page
        new actions.ViewIdea.BusinessImpact.VerifyProjectedandActualBenefitsinBusinessImpacttabforViewIdeapage().run("Year":/2018;2019;2018;2019/.toString(),"Current Year":/2018/.toString(),"Benefit Type":/Revenue;Revenue;Other;Other/.toString(),"Row Number of the Benefit":/1;1;2;2/.toString(),"Projected Benefit":/9,000;189;85,000;14,000/.toString(),"Actual Benefit":/14,000;4,000;74,000;14,000/.toString())
        //Verify Total Cost and Benefits in Business Impact tab
        new actions.ViewIdea.BusinessImpact.VerifyTotalCostandBenefitsinBusinessImpacttab().run("Year":/2018;2019/.toString(),"Current Year":/2018/.toString(),"Total Projected Benefit":/94,000;14,189/.toString(),"Total Actual Benefit":/88,000;18,000/.toString(),"Total Projected Cost":/6,600;37,890/.toString(),"Total Actual Cost":/11,000;8,589/.toString(),"Projected Net Benefit":/87,400;-23,701/.toString(),"Actual Net Benefit":/77,000;9,411/.toString())
        //Verify Non Financial Benefits in Business Impact tab for View Idea page
        new actions.ViewIdea.BusinessImpact.VerifyNonFinancialBenefitsinBusinessImpacttabforViewIdeapage().run("Benefit Title":/Product Launch Canceled/.toString(),"Benefit Type":/Customer Satisfaction/.toString(),"Description":/Changed Description/.toString(),"Row Number":/1/.toString())
        //Set Date Version and Notes for Financial Summary in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetDateandNotesforFinancialSummaryinBusinessImpacttab().run("Revision History":/System Admin/.toString())
        //Verify Non Financial Benefits in Business Impact tab for View Idea page
        new actions.ViewIdea.BusinessImpact.VerifyNonFinancialBenefitsinBusinessImpacttabforViewIdeapage().run("Benefit Title":/Product Launch/.toString(),"Benefit Type":/Brand Awareness/.toString(),"Description":/A Product Launch is a marketing strategy consisting of a carefully planned and scheduled sequence of events./.toString(),"Row Number":/1/.toString())
        //Verify Projected and Actual Costs in Business Impact tab for View Idea page
        new actions.ViewIdea.BusinessImpact.VerifyProjectedandActualCostsinBusinessImpacttabforViewIdeapage().run("Year":/2018;2019/.toString(),"Current Year":/2018/.toString(),"Costs Title":/Current Assets;Current Assets/.toString(),"Row Number":/1;1/.toString(),"Projected Cost":/300;23,890/.toString(),"Actual Cost":/10,000;789/.toString())
        //Verify Projected and Actual Benefits in Business Impact tab for View Idea page
        new actions.ViewIdea.BusinessImpact.VerifyProjectedandActualBenefitsinBusinessImpacttabforViewIdeapage().run("Year":/2018;2019/.toString(),"Current Year":/2018/.toString(),"Benefit Type":/Revenue;Revenue/.toString(),"Row Number of the Benefit":/1;1/.toString(),"Projected Benefit":/5,000;15,000/.toString(),"Actual Benefit":/4,000;14,000/.toString())
        //Verify Total Cost and Benefits in Business Impact tab
        new actions.ViewIdea.BusinessImpact.VerifyTotalCostandBenefitsinBusinessImpacttab().run("Year":/2018;2019/.toString(),"Current Year":/2018/.toString(),"Total Projected Benefit":/5,000;15,000/.toString(),"Total Actual Benefit":/4,000;14,000/.toString(),"Total Projected Cost":/300;23,890/.toString(),"Total Actual Cost":/10,000;789/.toString(),"Projected Net Benefit":/4,700;-8,890/.toString(),"Actual Net Benefit":/-6,000;13,211/.toString())
        //Set Date Version and Notes for Financial Summary in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetDateandNotesforFinancialSummaryinBusinessImpacttab().run("Revision History":/Current Version/.toString())
        //Verify Projected and Actual Costs in Business Impact tab for View Idea page
        new actions.ViewIdea.BusinessImpact.VerifyProjectedandActualCostsinBusinessImpacttabforViewIdeapage().run("Year":/2018;2019/.toString(),"Current Year":/2018/.toString(),"Costs Title":/Current Assets;Current Assets;Future Assets;Future Assets/.toString(),"Row Number":/1;1;2;2/.toString(),"Projected Cost":/300;23,890;6,300;14,000/.toString(),"Actual Cost":/10,000;789;1,000;7,800/.toString())
        //Verify Projected and Actual Benefits in Business Impact tab for View Idea page
        new actions.ViewIdea.BusinessImpact.VerifyProjectedandActualBenefitsinBusinessImpacttabforViewIdeapage().run("Year":/2018;2019/.toString(),"Current Year":/2018/.toString(),"Benefit Type":/Revenue;Revenue;Other;Other/.toString(),"Row Number of the Benefit":/1;1;2;2/.toString(),"Projected Benefit":/9,000;189;85,000;14,000/.toString(),"Actual Benefit":/14,000;4,000;74,000;14,000/.toString())
        //Verify Total Cost and Benefits in Business Impact tab
        new actions.ViewIdea.BusinessImpact.VerifyTotalCostandBenefitsinBusinessImpacttab().run("Year":/2018;2019/.toString(),"Current Year":/2018/.toString(),"Total Projected Benefit":/94,000;14,189/.toString(),"Total Actual Benefit":/88,000;18,000/.toString(),"Total Projected Cost":/6,600;37,890/.toString(),"Total Actual Cost":/11,000;8,589/.toString(),"Projected Net Benefit":/87,400;-23,701/.toString(),"Actual Net Benefit":/77,000;9,411/.toString())
        //Verify Non Financial Benefits in Business Impact tab for View Idea page
        new actions.ViewIdea.BusinessImpact.VerifyNonFinancialBenefitsinBusinessImpacttabforViewIdeapage().run("Benefit Title":/Product Launch Canceled/.toString(),"Benefit Type":/Customer Satisfaction/.toString(),"Description":/Changed Description/.toString(),"Row Number":/1/.toString())
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