package TestCases.RWHQImports.OldRuleModal

import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import BaseClasses.TestBase

//C119475 - OLD RULE MODAL Idea Submitted - Send Email
class C119475_OLDRULEMODALIdeaSubmitted_SendEmail
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
        //Create Mailinator User
        new actions.Mailinator.CreateMailinatorUser().run("Email":/oldbrightC119475_1/.toString(),"Enterprise System Administrator":true,"Finally Login as What User":/bi.adminuser1@brightidea.com/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Enterprise or Site":/Enterprise/.toString(),"Navigate to Groups Tab":true,"Create Edit or Delete":/Edit/.toString(),"Group Name to Edit or Delete":/System Admin Group/.toString())
        try{
            //Set Group in Setup
            new actions.SetupUsers.SetGroupinSetup().run("Search User":/Auto/.toString(),"User":/Auto/.toString(),"Add or Remove":/Add/.toString(),"Action":/Update/.toString())
        }
       catch(all){}catch(Error err){}
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Rules/.toString())
        //OLD RULE Access Add/Create Rule popup
        new actions.Rules.AccessAddCreateRulepopup().run([:])
        //OLD RULE Set Rule Event that triggers this rule
        new actions.Rules.SetRuleEventthattriggersthisrule().run("Event":/Idea Submitted/.toString())
        //OLD RULE Set Rule Perform the Following Actions
        new actions.Rules.SetRulePerformtheFollowingActions().run("Row Number to be Added, Delete or Modify existing":/1/.toString(),"Add, Delete or Modify":/Modify/.toString(),"Perform Following Action":/Send Email/.toString(),"Send Email Enter Subject":/Test Email/.toString(),"Send Email Text":/Email sent for Idea Submitted/.toString(),"Select Recipient":/System Admin Group/.toString())
        //OLD RULE Set Rule window
        new actions.Rules.SetRulewindow().run("Rule Name":/Idea Submitted - Send Email/.toString(),"Action":/Create/.toString())
        //Select Rule in Rules Engine table
        new actions.Rules.SelectRuleinRulesEnginepage().run("Rule Name":/Idea Submitted - Send Email/.toString())
        //OLD RULE Change Rule Status
        new actions.Rules.ChangeRuleStatus().run("Change Status":/Active/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/Idea for Rules Engine/.toString(),"Action":/Submit/.toString())
        //Verify Email
        new actions.Mailinator.VerifyEmail().run("Email Address":/oldbrightC119475_1@mailinator.com/.toString(),"Subject":/Test Email/.toString())
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