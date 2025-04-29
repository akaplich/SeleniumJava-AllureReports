package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C63146 - Enterprise Campaign List Widget Wide
class C63146_EnterpriseCampaignListWidgetWide
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
        //Set Widget Controller
        new actions.Widgets.SetWidgetController().run("Widget Edit Mode":/Enable/.toString(),"Add Widget from Selection":/Enterprise Campaign List Widget Wide/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Verify and Access Enterprise Campaign List 
        new actions.Widgets.VerifyandAccessEnterpriseCampaignList().run("Widget":/Campaign List Wide/.toString(),"Campaign name":/Solve App/.toString(),"Campaign Description":/Solve App Desc/.toString(),"Idea Count":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify and Access Enterprise Campaign List 
        new actions.Widgets.VerifyandAccessEnterpriseCampaignList().run("Widget":/Campaign List Wide/.toString(),"Campaign name":/Evaluators app/.toString(),"Campaign Description":/Evaluators app desc/.toString(),"Idea Count":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify and Access Enterprise Campaign List 
        new actions.Widgets.VerifyandAccessEnterpriseCampaignList().run("Widget":/Campaign List Wide/.toString(),"Campaign name":/Custom App/.toString(),"Campaign Description":/Custom App Desc/.toString(),"Idea Count":/3/.toString(),"Number of Matches":/1/.toString(),"Access Campaign":true)
        //Verify Initiative Home
        new actions.Webstorm.VerifyWebstormHome().run("Webstorm Title":/Custom App/.toString(),"Webstorm Description":/Custom App Desc/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Verify and Access Enterprise Campaign List 
        new actions.Widgets.VerifyandAccessEnterpriseCampaignList().run("Widget":/Campaign List Wide/.toString(),"Campaign name":/Custom App/.toString(),"Access View/Post":/View/.toString())
        //Verify Initiative Home
        new actions.Webstorm.VerifyWebstormHome().run("Webstorm Title":/Custom App/.toString(),"Webstorm Description":/Custom App Desc/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Verify and Access Enterprise Campaign List 
        new actions.Widgets.VerifyandAccessEnterpriseCampaignList().run("Widget":/Campaign List Wide/.toString(),"Campaign name":/Custom App/.toString(),"Access View/Post":/Posts/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Category":/New Product/.toString(),"Title":/New Title1/.toString(),"Description":/desc/.toString(),"Required Short Question":/short/.toString(),"Action":/Submit Idea/.toString())
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