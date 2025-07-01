package TestCases.RWHQImports.OldRuleModal

import BaseClasses.TestBase
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class C129852_OLDRULEMODAL_MoveIdeaRuleSetup_PipelineDeleted extends TestBase {
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
    @Test @Tag("OldRulesModalRegression")
    public void testcase(){
        //Basestate
        Action58123c20fa4ee77809f468f6([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Products/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Pipeline A/.toString(),"Description":/desc/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Rules/.toString())
        //OLD RULE Access Add/Create Rule popup
        new actions.Rules.AccessAddCreateRulepopup().run([:])
        //OLD RULE Set Rule Event that triggers this rule
        new actions.Rules.SetRuleEventthattriggersthisrule().run("Event":/Idea Submitted/.toString())
        //OLD RULE Set Rule Perform the Following Actions
        new actions.Rules.SetRulePerformtheFollowingActions().run("Row Number to be Added, Delete or Modify existing":/1/.toString(),"Add, Delete or Modify":/Modify/.toString(),"Perform Following Action":/Move Idea to Pipeline/.toString(),"Configure Action (Move or Copy to Pipeline Only)":true)
        //OLD RULE Configure Rule Action Move Idea to Pipeline
        new actions.Rules.ConfigureRuleActionMoveIdeatoPipeline().run("Move To Pipeline":/Pipeline A/.toString(),"Category":/New Product/.toString(),"Status":/Submitted/.toString(),"Action":/Save/.toString())
        //OLD RULE Set Rule window
        new actions.Rules.SetRulewindow().run("Rule Name":/Rule Copy 1/.toString(),"Action":/Create/.toString())
        //Select Rule in Rules Engine table
        new actions.Rules.SelectRuleinRulesEnginepage().run("Rule Name":/Rule Copy 1/.toString())
        //OLD RULE Change Rule Status
        new actions.Rules.ChangeRuleStatus().run("Change Status":/Active/.toString())
        //Access Existing Rule
        new actions.Rules.AccessExistingRule().run("Rule Name":/Rule Copy 1/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Ideas will be moved to/.toString(),"Should Exist":true)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Pipeline A/.toString(),"Should Exist":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Command Center/.toString())
        //Delete Pipeline or Folder in Pipeline Sidebar
        new actions.PipelineSidebar.DeletePipelineorFolderinPipelineSidebar().run("Pipeline or Folder Name":/Pipeline A/.toString())
        //Set Delete Idea or Pipeline in all places
        new actions.PipelineStepsView.SetDeleteIdea().run("I understand":true,"Action":/Delete Pipeline/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Rules/.toString())
        //Access Existing Rule
        new actions.Rules.AccessExistingRule().run("Rule Name":/Rule Copy 1/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/An invalid configuration is preventing this action from performing/.toString(),"Should Exist":true)
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
