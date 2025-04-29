import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C119491 - Business Impact Configuration - Add Max Financial Benefit Title
class C119491_BusinessImpactConfiguration_AddMaxFinancialBenefitTitle
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
        new actions.SetupIdeas.SetConfigureBusinessImpactFields().run("Action":/Add/.toString(),"Type":/financial-benefits/.toString(),"Benefit Title":/Far far away behind the word mountains far from the countries Vokalia and Consonantia there live the blind texts. Separated they live in Bookmarksgrove right at the coast of the Semantics a large language ocean. A small river named Duden flows by their place and supplies it with the necessary regelialia. It is a paradisematic country in which roasted parts of sentences fly into your mouth. Even the all-powerful Pointing has no control about the blind texts it is an almost unorthographic life and/.toString())
        //Set Configure Business Impact Fields
        new actions.SetupIdeas.SetConfigureBusinessImpactFields().run("Action":/Add/.toString(),"Type":/financial-benefits/.toString(),"Benefit Title":/Far far away behind the word mountains far from the countries Vokalia and Consonantia there live the blind texts. Separated they live in Bookmarksgrove right at the coast of the Semantics a large language ocean. A small river named Duden flows by their place and supplies it with the necessary regelialia. It is a paradisematic country in which roasted parts of sentences fly into your mouth. Even the all-powerful Pointing has no control about the blind texts it is an almost unorthographic life and that exceeds 500 characters/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Handle Alert
        new actions.selenium.HandleAlert().run("Accept":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Add or Update":/Add/.toString(),"Access Business Impact From":/View Idea/.toString())
        //Set Date Version and Notes for Financial Summary in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetDateandNotesforFinancialSummaryinBusinessImpacttab().run("Date":/05\/09\/2019/.toString())
        try{
            //Set Benefits in Business Impact tab
            new actions.ViewIdea.BusinessImpact.SetBenefitsinBusinessImpacttab().run("Add or Edit Benefits":/Add,Add/.toString(),"Year":/2019/.toString(),"Current Year":/2019/.toString(),"Benefit Type":/Far far away behind the word mountains far from the countries Vokalia and Consonantia there live the blind texts. Separated they live in Bookmarksgrove right at the coast of the Semantics a large language ocean. A small river named Duden flows by their place and supplies it with the necessary regelialia. It is a paradisematic country in which roasted parts of sentences fly into your mouth. Even the all-powerful Pointing has no control about the blind texts it is an almost unorthographic life and that exceeds 500 characters/.toString(),"Projected Benefit":/1000/.toString(),"Actual Benefit":/2000/.toString(),"Row Number of the Benefit":/1/.toString())
        }
       catch(all){}catch(Error err){}
        //Set Benefits in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetBenefitsinBusinessImpacttab().run("Add or Edit Benefits":/Add/.toString(),"Year":/2020/.toString(),"Current Year":/2019/.toString(),"Benefit Type":/Far far away behind the word mountains far from the countries Vokalia and Consonantia there live the blind texts. Separated they live in Bookmarksgrove right at the coast of the Semantics a large language ocean. A small river named Duden flows by their place and supplies it with the necessary regelialia. It is a paradisematic country in which roasted parts of sentences fly into your mouth. Even the all-powerful Pointing has no control about the blind texts it is an almost unorthographic life and/.toString(),"Projected Benefit":/1500/.toString(),"Actual Benefit":/3000/.toString(),"Row Number of the Benefit":/1/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Action":/Save Version/.toString())
        //Verify Projected and Actual Benefits in Business Impact tab for View Idea page
        new actions.ViewIdea.BusinessImpact.VerifyProjectedandActualBenefitsinBusinessImpacttabforViewIdeapage().run("Year":/2019;2020/.toString(),"Current Year":/2019/.toString(),"Benefit Type":/Far far away behind the word mountains far from the countries Vokalia and Consonantia there live the blind texts. Separated they live in Bookmarksgrove right at the coast of the Semantics a large language ocean. A small river named Duden flows by their place and supplies it with the necessary regelialia. It is a paradisematic country in which roasted parts of sentences fly into your mouth. Even the all-powerful Pointing has no control about the blind texts it is an almost unorthographic life and;Far far away behind the word mountains far from the countries Vokalia and Consonantia there live the blind texts. Separated they live in Bookmarksgrove right at the coast of the Semantics a large language ocean. A small river named Duden flows by their place and supplies it with the necessary regelialia. It is a paradisematic country in which roasted parts of sentences fly into your mouth. Even the all-powerful Pointing has no control about the blind texts it is an almost unorthographic life and/.toString(),"Row Number of the Benefit":/1;1/.toString(),"Projected Benefit":/<EMPTY>;1,500/.toString(),"Actual Benefit":/<EMPTY>;3,000/.toString())
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