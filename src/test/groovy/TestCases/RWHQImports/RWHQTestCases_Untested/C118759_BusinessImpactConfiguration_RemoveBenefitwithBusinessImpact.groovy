import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C118759 - Business Impact Configuration - Remove Benefit with Business Impact
class C118759_BusinessImpactConfiguration_RemoveBenefitwithBusinessImpact
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
        //Set Configure Business Impact Fields
        new actions.SetupIdeas.SetConfigureBusinessImpactFields().run("Action":/Add/.toString(),"Type":/non-financial-benefits/.toString(),"Benefit Title":/Money Awareness/.toString())
        //Set Configure Business Impact Fields
        new actions.SetupIdeas.SetConfigureBusinessImpactFields().run("Action":/Add/.toString(),"Type":/financial-benefits/.toString(),"Benefit Title":/Profit or Loss/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Add or Update":/Add/.toString(),"Access Business Impact From":/View Idea/.toString())
        //Set Date Version and Notes for Financial Summary in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetDateandNotesforFinancialSummaryinBusinessImpacttab().run("Date":/03\/18\/2019/.toString())
        //Set Benefits in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetBenefitsinBusinessImpacttab().run("Add or Edit Benefits":/Add,Add,Add,Add/.toString(),"Year":/2019,2020,2019,2020/.toString(),"Current Year":/2019/.toString(),"Benefit Type":/Profit or Loss,Profit or Loss,Cost Savings,Cost Savings/.toString(),"Projected Benefit":/99980,12345,9890,9087/.toString(),"Actual Benefit":/98760,54321,9809,9856/.toString(),"Row Number of the Benefit":/1,1,2,2/.toString())
        //Set Non Financial Benefit in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetNonFinancialBenefitinBusinessImpacttab().run("Add or Edit":/Add/.toString(),"Benefit Title":/Money/.toString(),"Benefit Type":/Money Awareness/.toString(),"Description":/MA Description/.toString(),"Row Number":/1/.toString())
        //Set Non Financial Benefit in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetNonFinancialBenefitinBusinessImpacttab().run("Add or Edit":/Add/.toString(),"Benefit Title":/New Data/.toString(),"Benefit Type":/Money Awareness/.toString(),"Description":/Money Awareness/.toString(),"Row Number":/2/.toString())
        //Set Non Financial Benefit in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetNonFinancialBenefitinBusinessImpacttab().run("Add or Edit":/Add/.toString(),"Benefit Title":/BrandA/.toString(),"Benefit Type":/Brand Awareness/.toString(),"Description":/Brand Awareness Desc/.toString(),"Row Number":/3/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Action":/Save Version/.toString())
        //Verify Non Financial Benefits in Business Impact tab for View Idea page
        new actions.ViewIdea.BusinessImpact.VerifyNonFinancialBenefitsinBusinessImpacttabforViewIdeapage().run("Benefit Title":/BrandA/.toString(),"Benefit Type":/Brand Awareness/.toString(),"Description":/Brand Awareness Desc/.toString(),"Row Number":/3/.toString())
        //Verify Non Financial Benefits in Business Impact tab for View Idea page
        new actions.ViewIdea.BusinessImpact.VerifyNonFinancialBenefitsinBusinessImpacttabforViewIdeapage().run("Benefit Title":/Money/.toString(),"Benefit Type":/Money Awareness/.toString(),"Description":/MA Description/.toString(),"Row Number":/1/.toString())
        //Verify Non Financial Benefits in Business Impact tab for View Idea page
        new actions.ViewIdea.BusinessImpact.VerifyNonFinancialBenefitsinBusinessImpacttabforViewIdeapage().run("Benefit Title":/New Data/.toString(),"Benefit Type":/Money Awareness/.toString(),"Description":/Money Awareness/.toString(),"Row Number":/2/.toString())
        //Verify Projected and Actual Benefits in Business Impact tab for View Idea page
        new actions.ViewIdea.BusinessImpact.VerifyProjectedandActualBenefitsinBusinessImpacttabforViewIdeapage().run("Year":/2019;2020/.toString(),"Current Year":/2019/.toString(),"Benefit Type":/Profit or Loss;Profit or Loss;Cost Savings;Cost Savings/.toString(),"Row Number of the Benefit":/1;1;2;2/.toString(),"Projected Benefit":/99,980;12,345;9,890;9,087/.toString(),"Actual Benefit":/98,760;54,321;9,809;9,856/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Configure Business Impact Fields
        new actions.SetupIdeas.SetConfigureBusinessImpactFields().run("Action":/Delete/.toString(),"Type":/financial-benefits/.toString(),"Benefit Title":/Profit or Loss/.toString(),"Delete Action":/Remove Benefit/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Configure Business Impact Fields
        new actions.SetupIdeas.SetConfigureBusinessImpactFields().run("Action":/Delete/.toString(),"Type":/non-financial-benefits/.toString(),"Benefit Title":/Money Awareness/.toString(),"Delete Action":/Remove Benefit/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Access Business Impact From":/View Idea/.toString())
        //Verify Projected and Actual Benefits in Business Impact tab for View Idea page
        new actions.ViewIdea.BusinessImpact.VerifyProjectedandActualBenefitsinBusinessImpacttabforViewIdeapage().run("Year":/2019;2020/.toString(),"Current Year":/2019/.toString(),"Benefit Type":/Cost Savings;Cost Savings/.toString(),"Row Number of the Benefit":/2;2/.toString(),"Projected Benefit":/9,890;9,087/.toString(),"Actual Benefit":/9,809;9,856/.toString())
        //Verify Non Financial Benefits in Business Impact tab for View Idea page
        new actions.ViewIdea.BusinessImpact.VerifyNonFinancialBenefitsinBusinessImpacttabforViewIdeapage().run("Benefit Title":/BrandA/.toString(),"Benefit Type":/Brand Awareness/.toString(),"Description":/Brand Awareness Desc/.toString(),"Row Number":/1/.toString(),"Expand the Result":true)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Profit or Loss/.toString(),"Should Exist":false)
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