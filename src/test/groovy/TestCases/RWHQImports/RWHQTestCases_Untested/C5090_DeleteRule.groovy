package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C5090 - Delete Rule
class C5090_DeleteRule
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
        //Delete this when Rules Engine Updated UI is enabled for everyone
        Action66ee0346e12425a91eeb06ab([:])
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Rules/.toString())
        //Access Add/Create Rule popup
        new actions.Rules.SetAddCreateRule().run([:])
        //Set Rule Event that triggers this rule
        new actions.Rules.SetNewRuleEventthattriggersthisrule().run("Event":/Added to Step/.toString(),"Event Value":/Review/.toString())
        //Set Rule Meet the Following Conditions
        new actions.Rules.SetNewRuleMeettheFollowingConditions().run("Row Number to be Added, Delete or Modify existing":/1/.toString(),"Add, Delete or Modify":/Add/.toString(),"Condition":/Category/.toString(),"Operator value":/Is/.toString(),"Condition value":/New Product/.toString())
        //Set Rule Perform the Following Actions
        new actions.Rules.SetNewRulePerformtheFollowingActions().run("Row Number to be Added, Delete or Modify existing":/1/.toString(),"Add, Delete or Modify":/Add/.toString(),"Perform Following Action":/Change Step/.toString(),"Action Value":/Single Scale/.toString())
        //Set Rule window
        new actions.Rules.SetNewRulewindow().run("Rule Name":/New Idea added to step/.toString(),"Action":/Create/.toString())
        //Select Rule in Rules Engine table
        new actions.Rules.SelectRuleinRulesEnginepage().run("Rule Name":/New Idea added to step/.toString())
        //Delete Rule
        Action59518d0537f5aeb0023220b7([:])
        //Verify Rule in Rules Engine table
        new actions.Rules.VerifyRuleinRulesEnginetable().run("Rule Name":/New Idea added to step/.toString(),"Number of Matches":/0/.toString())
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
    //Delete this when Rules Engine Updated UI is enabled for everyone
    public static def Action66ee0346e12425a91eeb06ab(def params){
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for Beta tab
        new actions.SetupBeta.SetEnterpriseSetupforBetatab().run("Rules Engine Updated UI":true)

    }
    //Delete Rule
    public static def Action59518d0537f5aeb0023220b7(def params){
        //Set Action Dropdown for Rules
        new actions.Rules.SetActionDropdownforRules().run("Action Menu Option":/Delete Rule/.toString())

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