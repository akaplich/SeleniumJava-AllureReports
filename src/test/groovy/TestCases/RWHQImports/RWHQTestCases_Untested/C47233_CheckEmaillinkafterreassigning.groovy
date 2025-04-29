package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C47233 - Check Email link after reassigning
class C47233_CheckEmaillinkafterreassigning
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
        //Create Mailinator User
        new actions.Mailinator.CreateMailinatorUser().run("Email":/actionitemuser3_5/.toString(),"Finally Login as What User":/bi.adminuser1@brightidea.com/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Scorecard Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureScorecardStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Scorecarding/.toString(),"Individual Assignment User":/Autofirst Autolast/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Action":/Update/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/scorecard idea1/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/scorecard idea1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Scorecarding/.toString(),"Action":/Change Step/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Get Link from Action Item Email
        variables."link" = new actions.Mailinator.GetLinkfromActionItemEmail().run("Email Address":/actionitemuser3_5@mailinator.com/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        try{
            //Login
            new actions.general.Login().run("Email":/actionitemuser3_5@mailinator.com/.toString(),"Password":/brightidea1/.toString())
        }
       catch(all){}catch(Error err){}
        //Set General Evaluation Scorecard for Idea in Action Items page
        new actions.ActionItems.SetGeneralEvaluationScorecardforIdeainActionItemspage().run("What is the strategic impact":/High/.toString(),"What is the likely timeframe to implement":/1-3 months/.toString(),"What is the estimated level of enterprise":/Low/.toString(),"What resource level would need to be dedicated":/less than 1/.toString(),"What is the revenue potential of the idea":/$1M to $5M/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Create Mailinator User
        new actions.Mailinator.CreateMailinatorUser().run("Email":/actionitemuser2_6/.toString(),"Finally Login as What User":/bi.adminuser1@brightidea.com/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Scorecard Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureScorecardStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Scorecarding/.toString(),"Individual Assignment User":/Autofirst Autolast,actionitemuser2_6@mailinator.com/.toString(),"Individual Assignment User Add or Remove":/Remove,Add/.toString(),"Action":/Update/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        try{
            //Login
            new actions.general.Login().run("Email":/actionitemuser3_5@mailinator.com/.toString(),"Password":/brightidea1/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Completed table for Action Items page
        new actions.ActionItems.VerifyCompletedtableforActionItemspage().run("Verify in Which List (optional)":/My Action Items/.toString(),"Title":/scorecard idea1/.toString(),"Number of Matches":/1/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Get Link from Action Item Email
        variables."link" = new actions.Mailinator.GetLinkfromActionItemEmail().run("Email Address":/actionitemuser2_6@mailinator.com/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        try{
            //Login
            new actions.general.Login().run("Email":/actionitemuser2_6@mailinator.com/.toString(),"Password":/brightidea1/.toString())
        }
       catch(all){}catch(Error err){}
        //Set General Evaluation Scorecard for Idea in Action Items page
        new actions.ActionItems.SetGeneralEvaluationScorecardforIdeainActionItemspage().run("What is the strategic impact":/Med/.toString(),"What is the likely timeframe to implement":/3-6 months/.toString(),"What is the estimated level of enterprise":/Low/.toString(),"What resource level would need to be dedicated":/less than 1/.toString(),"What is the revenue potential of the idea":/$1M to $5M/.toString())
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