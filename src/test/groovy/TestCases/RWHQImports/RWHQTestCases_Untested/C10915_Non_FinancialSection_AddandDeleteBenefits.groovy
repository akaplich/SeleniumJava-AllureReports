import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C10915 - Non-Financial Section - Add and Delete Benefits
class C10915_Non_FinancialSection_AddandDeleteBenefits
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
        //Set Non Financial Benefit in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetNonFinancialBenefitinBusinessImpacttab().run("Add or Edit":/Add/.toString(),"Benefit Title":/Product Launch/.toString(),"Benefit Type":/Brand Awareness/.toString(),"Description":/A Product Launch is a marketing strategy consisting of a carefully planned and scheduled sequence of events with the goal to make a big happening out of the release and, of course, make as much sales as possible in a short time span. To achieve this the launch is scheduled to a specific date and time./.toString(),"Row Number":/1/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Action":/Save Version/.toString())
        //Verify Non Financial Benefits in Business Impact tab for View Idea page
        new actions.ViewIdea.BusinessImpact.VerifyNonFinancialBenefitsinBusinessImpacttabforViewIdeapage().run("Benefit Title":/Product Launch/.toString(),"Benefit Type":/Brand Awareness/.toString(),"Description":/A Product Launch is a marketing strategy consisting of a carefully planned and scheduled sequence of events with the goal to make a big happening out of the release and, of course, make as much sales as possible in a short time span. To achieve this the launch is scheduled to a specific date and time./.toString(),"Row Number":/1/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Add or Update":/Update/.toString())
        //Set Non Financial Benefit in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetNonFinancialBenefitinBusinessImpacttab().run("Add or Edit":/Add/.toString(),"Benefit Title":/Support America’s national parks/.toString(),"Benefit Type":/Social\/Environmental Impact/.toString(),"Description":/Our goal is to leave the world better than we found it, so this August we’re making it easier for anyone to help preserve the beauty of our natural, cultural and historical treasures./.toString(),"Row Number":/2/.toString())
        //Delete Financial or Non Financial Benefit and Cost in Business Impact tab
        new actions.ViewIdea.BusinessImpact.DeleteFinancialorNonFinancialBenefitandCostinBusinessImpacttab().run("Type":/Nonfinancial Benefit/.toString(),"Title":/Product Launch/.toString(),"Row Number":/1/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Action":/Save Version/.toString())
        //Verify Non Financial Benefits in Business Impact tab for View Idea page
        new actions.ViewIdea.BusinessImpact.VerifyNonFinancialBenefitsinBusinessImpacttabforViewIdeapage().run("Benefit Title":/Support America’s national parks/.toString(),"Benefit Type":/Social\/Environmental Impact/.toString(),"Description":/Our goal is to leave the world better than we found it, so this August we’re making it easier for anyone to help preserve the beauty of our natural, cultural and historical treasures./.toString(),"Row Number":/1/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Product Launch/.toString(),"Should Exist":false)
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