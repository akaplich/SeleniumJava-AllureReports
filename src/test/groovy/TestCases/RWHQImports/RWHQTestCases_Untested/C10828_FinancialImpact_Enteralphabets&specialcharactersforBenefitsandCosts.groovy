import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C10828 - Financial Impact - Enter alphabets & special characters for Benefits and Costs
class C10828_FinancialImpact_EnteralphabetsRedwoodHQTestCasespecialcharactersforBenefitsandCosts
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
        new actions.ViewIdea.BusinessImpact.SetDateandNotesforFinancialSummaryinBusinessImpacttab().run("Date":/05\/07\/2016/.toString())
        try{
            //Set Benefits in Business Impact tab
            new actions.ViewIdea.BusinessImpact.SetBenefitsinBusinessImpacttab().run("Add or Edit Benefits":/Add,Add/.toString(),"Year":/2016,2017/.toString(),"Current Year":/2016/.toString(),"Benefit Type":/Cost Avoidance,Cost Savings/.toString(),"Projected Benefit":/$,xyz/.toString(),"Actual Benefit":/#,a/.toString(),"Row Number of the Benefit":/1,2/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Set Costs in Business Impact tab
            new actions.ViewIdea.BusinessImpact.SetCostsinBusinessImpacttab().run("Add or Edit Costs":/Add/.toString(),"Year":/2017/.toString(),"Current Year":/2016/.toString(),"Cost Title":/Current Assets/.toString(),"Projected Cost":/%/.toString(),"Actual Cost":/a/.toString(),"Row Number":/1/.toString())
        }
       catch(all){}catch(Error err){}
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Action":/Save Version/.toString())
        //Verify Total Cost and Benefits in Business Impact tab
        new actions.ViewIdea.BusinessImpact.VerifyTotalCostandBenefitsinBusinessImpacttab().run("Year":/2016/.toString(),"Current Year":/2016/.toString(),"Total Projected Benefit":/<EMPTY>/.toString(),"Total Actual Benefit":/<EMPTY>/.toString(),"Total Projected Cost":/<EMPTY>/.toString(),"Total Actual Cost":/<EMPTY>/.toString(),"Projected Net Benefit":/<EMPTY>/.toString(),"Actual Net Benefit":/<EMPTY>/.toString())
        //Verify Projected and Actual Benefits in Business Impact tab for View Idea page
        new actions.ViewIdea.BusinessImpact.VerifyProjectedandActualBenefitsinBusinessImpacttabforViewIdeapage().run("Year":/2016;2017/.toString(),"Current Year":/2016/.toString(),"Benefit Type":/Cost Avoidance;Cost Savings/.toString(),"Row Number of the Benefit":/1;2/.toString(),"Projected Benefit":/<EMPTY>;<EMPTY>/.toString(),"Actual Benefit":/<EMPTY>;<EMPTY>/.toString())
        //Verify Projected and Actual Costs in Business Impact tab for View Idea page
        new actions.ViewIdea.BusinessImpact.VerifyProjectedandActualCostsinBusinessImpacttabforViewIdeapage().run("Year":/2016/.toString(),"Current Year":/2016/.toString(),"Costs Title":/Current Assets/.toString(),"Row Number":/1/.toString(),"Projected Cost":/<EMPTY>/.toString(),"Actual Cost":/<EMPTY>/.toString())
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