package TestCases.RWHQImports.OldRuleModal

import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import BaseClasses.TestBase

//C118211 - OLD RULE MODAL Idea Edited - Days Since Last Vote Condition - Change Status
class C118211_OLDRULEMODALIdeaEdited_DaysSinceLastVoteCondition_ChangeStatus
extends TestBase {
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
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Rules/.toString())
        //OLD RULE Access Add/Create Rule popup
        new actions.Rules.AccessAddCreateRulepopup().run([:])
        //OLD RULE Set Rule Event that triggers this rule
        new actions.Rules.SetRuleEventthattriggersthisrule().run("Event":/Idea Edited/.toString())
        try{
            //OLD RULE Set Rule Meet the Following Conditions
            new actions.Rules.SetRuleMeettheFollowingConditions().run("Row Number to be Added, Delete or Modify existing":/1/.toString(),"Add, Delete or Modify":/Modify/.toString(),"Condition":/Days Since Last Vote/.toString(),"Operator value":/Is/.toString(),"Condition value":/0/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //OLD RULE Set Rule Perform the Following Actions
            new actions.Rules.SetRulePerformtheFollowingActions().run("Row Number to be Added, Delete or Modify existing":/1/.toString(),"Add, Delete or Modify":/Modify/.toString(),"Perform Following Action":/Change Status/.toString(),"Action Value":/Completed/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //OLD RULE Set Rule window
            new actions.Rules.SetRulewindow().run("Rule Name":/Days since Last Vote/.toString(),"Action":/Create/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Select Rule in Rules Engine table
            new actions.Rules.SelectRuleinRulesEnginepage().run("Rule Name":/Days since Last Vote/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //OLD RULE Change Rule Status
            new actions.Rules.ChangeRuleStatus().run("Change Status":/Active/.toString())
        }
       catch(all){}catch(Error err){}
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Set Vote in View Idea page
        new actions.ViewIdea.SetVoteinViewIdeapage().run("Vote":/Up/.toString())
        //Set View Idea Description Tab Text Field
        new actions.ViewIdeaFields.SetViewIdeaDescriptionTabTextField().run("Field Name":/Description/.toString(),"Field Value":/test idea1 desc edited/.toString(),"Action":/Save/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Verify Idea in View Idea page
        new actions.ViewIdea.VerifyIdeainViewIdeapage().run("Idea Name":/test idea1/.toString(),"Status":/Under Review/.toString(),"Linked Submissions":[])
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