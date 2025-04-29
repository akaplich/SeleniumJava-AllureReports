package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132411 - Action Item Completed for 2 steps
class C132411_ActionItemCompletedfor2steps
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
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Single Scale Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureSingleScaleStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Single Scale/.toString(),"Assignment Method":/Individual Assignment/.toString(),"Individual Assignment User":/Evaluator/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Action":/Update/.toString())
        //Configure Scorecard Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureScorecardStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Scorecarding/.toString(),"Assignment Method":/Individual Assignment/.toString(),"Individual Assignment User":/System Admin/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Action":/Update/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Rules/.toString())
        //Access Add/Create Rule popup
        new actions.Rules.SetAddCreateRule().run([:])
        //Set Rule Event that triggers this rule
        new actions.Rules.SetNewRuleEventthattriggersthisrule().run("Event":/Action Item Completed/.toString())
        //Set Rule Meet the Following Conditions
        new actions.Rules.SetNewRuleMeettheFollowingConditions().run("Row Number to be Added, Delete or Modify existing":/1/.toString(),"Add, Delete or Modify":/Add/.toString(),"Condition":/Step/.toString(),"Operator value":/Is/.toString(),"Condition value":/Single Scale/.toString())
        //Set Rule Perform the Following Actions
        new actions.Rules.SetNewRulePerformtheFollowingActions().run("Row Number to be Added, Delete or Modify existing":/1/.toString(),"Add, Delete or Modify":/Add/.toString(),"Perform Following Action":/Change Step/.toString(),"Action Value":/Scorecarding/.toString())
        //Set Rule window
        new actions.Rules.SetNewRulewindow().run("Rule Name":/Rule1/.toString(),"Action":/Create/.toString())
        //Select Rule in Rules Engine table
        new actions.Rules.SelectRuleinRulesEnginepage().run("Rule Name":/Rule1/.toString())
        //Change Rule Status
        Action594d63e45cb815bc19ca15e6("Change Status":/Active/.toString())
        //Access Add/Create Rule popup
        new actions.Rules.SetAddCreateRule().run([:])
        //Set Rule Event that triggers this rule
        new actions.Rules.SetNewRuleEventthattriggersthisrule().run("Event":/Action Item Completed/.toString())
        //Set Rule Meet the Following Conditions
        new actions.Rules.SetNewRuleMeettheFollowingConditions().run("Row Number to be Added, Delete or Modify existing":/1/.toString(),"Add, Delete or Modify":/Add/.toString(),"Condition":/Step/.toString(),"Operator value":/Is/.toString(),"Condition value":/Scorecarding/.toString())
        //Set Rule Meet the Following Conditions
        new actions.Rules.SetNewRuleMeettheFollowingConditions().run("Row Number to be Added, Delete or Modify existing":/2/.toString(),"Add, Delete or Modify":/Add/.toString(),"Condition":/Category/.toString(),"Operator value":/Is/.toString(),"Condition value":/Operations/.toString())
        //Set Rule Perform the Following Actions
        new actions.Rules.SetNewRulePerformtheFollowingActions().run("Row Number to be Added, Delete or Modify existing":/1/.toString(),"Add, Delete or Modify":/Add/.toString(),"Perform Following Action":/Change Step/.toString(),"Action Value":/Stack Rank/.toString())
        //Set Rule window
        new actions.Rules.SetNewRulewindow().run("Rule Name":/Rule2/.toString(),"Action":/Create/.toString())
        //Select Rule in Rules Engine table
        new actions.Rules.SelectRuleinRulesEnginepage().run("Rule Name":/Rule2/.toString())
        //Change Rule Status
        Action594d63e45cb815bc19ca15e6("Change Status":/Active/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/RULE IDEA1/.toString(),"Click on Show more":true,"Category":/New Product/.toString(),"Action":/Submit/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/RULE IDEA2/.toString(),"Click on Show more":true,"Category":/Operations/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/RULE IDEA1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Single Scale/.toString(),"Action":/Change Step/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/RULE IDEA2/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Single Scale/.toString(),"Action":/Change Step/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/RULE IDEA1/.toString())
        //Set Single Scale for Idea in Action Items page
        new actions.ActionItems.SetSingleScaleforIdeainActionItemspage().run("What is your initial impression of this idea":/7/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/RULE IDEA2/.toString())
        //Set Single Scale for Idea in Action Items page
        new actions.ActionItems.SetSingleScaleforIdeainActionItemspage().run("What is your initial impression of this idea":/2/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Verify Idea in Pipeline Steps page
        new actions.PipelineStepsView.VerifyIdeainPipelineStepsViewpage().run("Idea Name":/RULE IDEA1/.toString(),"Step Name idea belongs to":/Scorecarding/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Pipeline Steps page
        new actions.PipelineStepsView.VerifyIdeainPipelineStepsViewpage().run("Idea Name":/RULE IDEA2/.toString(),"Step Name idea belongs to":/Scorecarding/.toString(),"Number of Matches":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Rules/.toString())
        //Return Todays or Other Date in the Requested Format
        variables."today" = new actions.Utils.ReturnTodaysDateintheRequestedFormat().run("Format":/MM\/dd\/yyyy/.toString())
        //Verify Rule in Rules Engine table
        new actions.Rules.VerifyRuleinRulesEnginetable().run("Rule Name":/Rule1/.toString(),"Event":/Action Item Completed/.toString(),"Last Run":/${variables."today"}/.toString(),"Status":/Active/.toString(),"Description":/Step Is Single Scale; Change Step to Scorecarding/.toString(),"Number of Matches":/1/.toString())
        //Verify Rule in Rules Engine table
        new actions.Rules.VerifyRuleinRulesEnginetable().run("Rule Name":/Rule2/.toString(),"Event":/Action Item Completed/.toString(),"Last Run":/Never/.toString(),"Status":/Active/.toString(),"Description":/Step Is Scorecarding and Category Is Operations; Change Step to Stack Rank/.toString(),"Number of Matches":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/RULE IDEA1/.toString())
        //Set General Evaluation Scorecard for Idea in Action Items page
        new actions.ActionItems.SetGeneralEvaluationScorecardforIdeainActionItemspage().run("What is the strategic impact":/High/.toString(),"What is the likely timeframe to implement":/1-3 months/.toString(),"What is the estimated level of enterprise":/High/.toString(),"What resource level would need to be dedicated":/less than 1/.toString(),"What is the revenue potential of the idea":/Less than $1M/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/RULE IDEA2/.toString())
        //Set General Evaluation Scorecard for Idea in Action Items page
        new actions.ActionItems.SetGeneralEvaluationScorecardforIdeainActionItemspage().run("What is the strategic impact":/High/.toString(),"What is the likely timeframe to implement":/1-3 months/.toString(),"What is the estimated level of enterprise":/High/.toString(),"What resource level would need to be dedicated":/More than 6/.toString(),"What is the revenue potential of the idea":/Less than $1M/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Verify Idea in Pipeline Steps page
        new actions.PipelineStepsView.VerifyIdeainPipelineStepsViewpage().run("Idea Name":/RULE IDEA1/.toString(),"Step Name idea belongs to":/Scorecarding/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Pipeline Steps page
        new actions.PipelineStepsView.VerifyIdeainPipelineStepsViewpage().run("Idea Name":/RULE IDEA2/.toString(),"Step Name idea belongs to":/Stack Rank/.toString(),"Number of Matches":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Rules/.toString())
        //Verify Rule in Rules Engine table
        new actions.Rules.VerifyRuleinRulesEnginetable().run("Rule Name":/Rule1/.toString(),"Event":/Action Item Completed/.toString(),"Last Run":/${variables."today"}/.toString(),"Status":/Active/.toString(),"Description":/Step Is Single Scale; Change Step to Scorecarding/.toString(),"Number of Matches":/1/.toString())
        //Verify Rule in Rules Engine table
        new actions.Rules.VerifyRuleinRulesEnginetable().run("Rule Name":/Rule2/.toString(),"Event":/Action Item Completed/.toString(),"Last Run":/${variables."today"}/.toString(),"Status":/Active/.toString(),"Description":/Step Is Scorecarding and Category Is Operations; Change Step to Stack Rank/.toString(),"Number of Matches":/1/.toString())
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
    //Change Rule Status
    public static def Action594d63e45cb815bc19ca15e6(def params){
        //Set Action Dropdown for Rules
        new actions.Rules.SetActionDropdownforRules().run("Action Menu Option":/Change Status/.toString(),"Change Status":/${params."Change Status"}/.toString())

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