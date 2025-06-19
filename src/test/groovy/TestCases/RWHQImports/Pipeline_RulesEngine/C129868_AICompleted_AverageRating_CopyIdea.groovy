package TestCases.RWHQImports.Pipeline_RulesEngine

import BaseClasses.TestBase
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import actions.API.Utils.CopyAffiliate
import actions.general.Login
import actions.general.Wait
import actions.Utils.SettoLabEnvironment
import actions.selenium.Browser
//C129868 - AI Completed - Average Rating - Copy Idea
class C129868_AICompleted_AverageRating_CopyIdea extends TestBase {
    private static def variables = [:]
    private static final Logger logger = LoggerFactory.getLogger(C129868_AICompleted_AverageRating_CopyIdea.class);

    @BeforeAll
    public static void beforeState(){
        logger.debug("Before State");
        variables."Browser" = /Chrome/
        variables."TestRail_RunName" = null
        variables."TestRail_ExecutionName" = null
        variables."CodeEnvironment" = /Default/
        variables."Database" = null
        variables."Licensing Model" = null
        variables."Unlimited Brightidea Administrator License Type" = null
        variables."Brightidea Administrator License Type Purchased Count" = null
        variables."Unlimited Idea Box Manager License Type" = null
        variables."Idea Box Manager License Type Purchased Count" = null
    }
    @Test @Tag("NewRulesModalRegression")
    public void testcase(){     
        logger.debug("TestCase");
        //Basestate
        Action58123c20fa4ee77809f468f6(variables)
        //Delete this when Rules Engine Updated UI is enabled for everyone
        Action66ee0346e12425a91eeb06ab([:])
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Scorecard Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureScorecardStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Scorecarding/.toString(),"Individual Assignment User":/Evaluator,Pipeline Admin/.toString(),"Individual Assignment User Add or Remove":/Add,Add/.toString(),"Action":/Update/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Products/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Pipeline A/.toString(),"Description":/desc/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Rules/.toString())
        //Access Add/Create Rule popup
        new actions.Rules.SetAddCreateRule().run([:])
        //Set Rule Event that triggers this rule
        new actions.Rules.SetNewRuleEventthattriggersthisrule().run("Event":/Action Item Completed/.toString())
        //Set Rule Meet the Following Conditions
        new actions.Rules.SetNewRuleMeettheFollowingConditions().run("Row Number to be Added, Delete or Modify existing":/1/.toString(),"Add, Delete or Modify":/Add/.toString(),"Condition":/Step/.toString(),"Operator value":/Is/.toString(),"Condition value":/Scorecarding/.toString())
        //Set Rule Meet the Following Conditions
        new actions.Rules.SetNewRuleMeettheFollowingConditions().run("Row Number to be Added, Delete or Modify existing":/2/.toString(),"Add, Delete or Modify":/Add/.toString(),"Condition":/Scorecarding Average Score/.toString(),"Operator value":/Is Greater Than/.toString(),"Condition value":/75/.toString())
        //Set Rule Perform the Following Actions
        new actions.Rules.SetNewRulePerformtheFollowingActions().run("Row Number to be Added, Delete or Modify existing":/1/.toString(),"Add, Delete or Modify":/Add/.toString(),"Perform Following Action":/Copy Idea to Pipeline/.toString(),"Configure Action (Move or Copy to Pipeline Only)":true)
        //Configure Rule Action Copy Idea to Pipeline
        new actions.Rules.ConfigureNewRuleActionCopyIdeatoPipeline().run("Pipeline":/Pipeline A/.toString(),"Action":/Save/.toString())
        //Set Rule window
        new actions.Rules.SetNewRulewindow().run("Rule Name":/Rule Copy 1/.toString(),"Action":/Create/.toString())
        //Select Rule in Rules Engine table
        new actions.Rules.SelectRuleinRulesEnginepage().run("Rule Name":/Rule Copy 1/.toString())
        //Change Rule Status
        Action594d63e45cb815bc19ca15e6("Change Status":/Active/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Select Multiple Ideas in Pipeline Steps
        new actions.PipelineStepsView.SelectMultipleIdeasinPipelineSteps().run("Idea Names":["test idea1","test idea2"])
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Scorecarding/.toString(),"Action":/Change Step/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/test idea1/.toString())
        //Set General Evaluation Scorecard for Idea in Action Items page
        new actions.ActionItems.SetGeneralEvaluationScorecardforIdeainActionItemspage().run("What is the strategic impact":/High/.toString(),"What is the likely timeframe to implement":/1-3 months/.toString(),"What is the estimated level of enterprise":/High/.toString(),"What resource level would need to be dedicated":/1-3/.toString(),"What is the revenue potential of the idea":/Greater than $5M/.toString())
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/test idea2/.toString())
        //Set General Evaluation Scorecard for Idea in Action Items page
        new actions.ActionItems.SetGeneralEvaluationScorecardforIdeainActionItemspage().run("What is the strategic impact":/Low/.toString(),"What is the likely timeframe to implement":/More than 12 months/.toString(),"What is the estimated level of enterprise":/Low/.toString(),"What resource level would need to be dedicated":/More than 6/.toString(),"What is the revenue potential of the idea":/Less than $1M/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/pipelineadmin@test.com/.toString(),"Password":/brightidea1/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/test idea1/.toString())
        //Set General Evaluation Scorecard for Idea in Action Items page
        new actions.ActionItems.SetGeneralEvaluationScorecardforIdeainActionItemspage().run("What is the strategic impact":/High/.toString(),"What is the likely timeframe to implement":/1-3 months/.toString(),"What is the estimated level of enterprise":/High/.toString(),"What resource level would need to be dedicated":/1-3/.toString(),"What is the revenue potential of the idea":/Greater than $5M/.toString())
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/test idea2/.toString())
        //Set General Evaluation Scorecard for Idea in Action Items page
        new actions.ActionItems.SetGeneralEvaluationScorecardforIdeainActionItemspage().run("What is the strategic impact":/Low/.toString(),"What is the likely timeframe to implement":/More than 12 months/.toString(),"What is the estimated level of enterprise":/Low/.toString(),"What resource level would need to be dedicated":/More than 6/.toString(),"What is the revenue potential of the idea":/Less than $1M/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pipeline A/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString(),"Number of Matches":/2/.toString())
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("Idea Name":/test idea2/.toString(),"Number of Matches":/0/.toString())
    }
    //Basestate
    public static def Action58123c20fa4ee77809f468f6(def params){
        //Create Affiliate based on Master Affiliate
        logger.debug("CopyAffiliate");
        variables."affiliateURL" = new CopyAffiliate().run(params)
        logger.debug("Affiliate URL: ${variables."affiliateURL"}");
        //Open Browser
        logger.debug("Browser");
        new Browser().run("Run Browser in Incognito":/${params."Run Browser in Incognito"}/.toString(),"URL":/${variables."affiliateURL"}/.toString(),"Browser Type":/${variables."Browser"}/.toString())
        //Login
        new Login().run("Email":/${params."Username Email"}/.toString(),"Password":/brightidea1/.toString())
        //Set to Lab Environment
        logger.debug("SettoLabEnvironment");
        new SettoLabEnvironment().run("Email":/${params."Username Email"}/.toString())
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
}