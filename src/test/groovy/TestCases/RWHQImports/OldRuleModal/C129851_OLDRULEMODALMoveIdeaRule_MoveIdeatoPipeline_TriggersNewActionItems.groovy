package TestCases.RWHQImports.OldRuleModal

import BaseClasses.TestBase
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C129851 - OLD RULE MODAL Move Idea Rule - 'Move Idea to Pipeline' Triggers New Action Items
class C129851_OLDRULEMODALMoveIdeaRule_MoveIdeatoPipeline_TriggersNewActionItems extends TestBase
{
    private static def variables = [:]

    @BeforeAll
    public static void beforeState(){
        variables."URL" = /https:\/\/test.brightideatest.com/
        variables."Browser" = /Chrome/
        variables."TestRail_RunName" = null
        variables."TestRail_ExecutionName" = null
        variables."CodeEnvironment" = /Default/
        variables."Database" = null
    }
    @Test @Tag("OldRulesModalRegression")  public void testcase(){
        //Basestate
        Action58123c20fa4ee77809f468f6([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Products/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Pipeline A/.toString(),"Description":/desc/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pipeline A/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Edit Step in Pipeline Steps page
        new actions.PipelineStepsView.EditStepinPipelineStepspage().run("Step to Edit":/Submitted/.toString(),"Tool Type":/Scorecard/.toString(),"Action":/Save/.toString())
        //Configure Scorecard Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureScorecardStepinNewModalinPipelineStepspage().run("Individual Assignment User":/Evaluator/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Action":/Activate/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Rules/.toString())
        //OLD RULE Access Add/Create Rule popup
        new actions.Rules.AccessAddCreateRulepopup().run([:])
        //OLD RULE Set Rule Event that triggers this rule
        new actions.Rules.SetRuleEventthattriggersthisrule().run("Event":/Idea Status Changed/.toString())
        //OLD RULE Set Rule Meet the Following Conditions
        new actions.Rules.SetRuleMeettheFollowingConditions().run("Row Number to be Added, Delete or Modify existing":/1/.toString(),"Add, Delete or Modify":/Modify/.toString(),"Condition":/Status/.toString(),"Operator value":/Is/.toString(),"Condition value":/On Hold/.toString())
        //OLD RULE Set Rule Perform the Following Actions
        new actions.Rules.SetRulePerformtheFollowingActions().run("Row Number to be Added, Delete or Modify existing":/1/.toString(),"Add, Delete or Modify":/Modify/.toString(),"Perform Following Action":/Move Idea to Pipeline/.toString(),"Configure Action (Move or Copy to Pipeline Only)":true)
        //OLD RULE Configure Rule Action Move Idea to Pipeline
        new actions.Rules.ConfigureRuleActionMoveIdeatoPipeline().run("Move To Pipeline":/Pipeline A/.toString(),"Category":/Strategy/.toString(),"Status":/Completed/.toString(),"Action":/Save/.toString())
        //OLD RULE Set Rule window
        new actions.Rules.SetRulewindow().run("Rule Name":/Rule Move 1/.toString(),"Action":/Create/.toString())
        //Select Rule in Rules Engine table
        new actions.Rules.SelectRuleinRulesEnginepage().run("Rule Name":/Rule Move 1/.toString())
        //OLD RULE Change Rule Status
        new actions.Rules.ChangeRuleStatus().run("Change Status":/Active/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Select Multiple Ideas in Pipeline Steps
        new actions.PipelineStepsView.SelectMultipleIdeasinPipelineSteps().run("Idea Names":["test idea1","test idea2"])
        //Change Idea Status in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStatusinPipelineStepspage().run("Status":/On Hold/.toString(),"Action":/Change Status/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/test idea1/.toString())
        //Set General Evaluation Scorecard for Idea in Action Items page
        new actions.ActionItems.SetGeneralEvaluationScorecardforIdeainActionItemspage().run("What is the strategic impact":/High/.toString(),"What is the likely timeframe to implement":/1-3 months/.toString(),"What is the estimated level of enterprise":/High/.toString(),"What resource level would need to be dedicated":/1-3/.toString(),"What is the revenue potential of the idea":/Greater than $5M/.toString())
        //Set General Evaluation Scorecard for Idea in Action Items page
        new actions.ActionItems.SetGeneralEvaluationScorecardforIdeainActionItemspage().run("What is the strategic impact":/Low/.toString(),"What is the likely timeframe to implement":/More than 12 months/.toString(),"What is the estimated level of enterprise":/Low/.toString(),"What resource level would need to be dedicated":/More than 6/.toString(),"What is the revenue potential of the idea":/Less than $1M/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pipeline A/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("Idea Name":/test idea2/.toString(),"Number of Matches":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("Idea Name":/test idea2/.toString(),"Number of Matches":/0/.toString())
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

}