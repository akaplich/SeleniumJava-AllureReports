package TestCases.RWHQImports.OldRuleModal

import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import BaseClasses.TestBase

//C130574 - OLD RULE MODAL Idea Submitted - Copy Idea & Do Not Link Ideas
class C130574_OLDRULEMODALIdeaSubmitted_CopyIdeaRedwoodHQTestCaseDoNotLinkIdeas
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
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for Beta tab
        new actions.SetupBeta.SetEnterpriseSetupforBetatab().run("History Tab on View Submission":true,"Extended Data for History Tab":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Pipeline A/.toString(),"Description":/desc/.toString(),"Pipeline Administrators":/Pipeline Admin/.toString(),"Administrators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/pipelineadmin@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Rules/.toString())
        //OLD RULE Access Add/Create Rule popup
        new actions.Rules.AccessAddCreateRulepopup().run([:])
        //OLD RULE Set Rule Event that triggers this rule
        new actions.Rules.SetRuleEventthattriggersthisrule().run("Event":/Idea Status Changed/.toString())
        //OLD RULE Set Rule Perform the Following Actions
        new actions.Rules.SetRulePerformtheFollowingActions().run("Row Number to be Added, Delete or Modify existing":/1/.toString(),"Add, Delete or Modify":/Modify/.toString(),"Perform Following Action":/Copy Idea to Pipeline/.toString(),"Configure Action (Move or Copy to Pipeline Only)":true)
        //OLD RULE Configure Rule Action Copy Idea to Pipeline
        new actions.Rules.ConfigureRuleActionCopyIdeatoPipeline().run("Pipeline":/Pipeline A/.toString(),"Link Ideas":/false/.toString(),"Action":/Save/.toString())
        //OLD RULE Set Rule window
        new actions.Rules.SetRulewindow().run("Rule Name":/Rule Copy 1/.toString(),"Action":/Create/.toString())
        //Select Rule in Rules Engine table
        new actions.Rules.SelectRuleinRulesEnginepage().run("Rule Name":/Rule Copy 1/.toString())
        //OLD RULE Change Rule Status
        new actions.Rules.ChangeRuleStatus().run("Change Status":/Active/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Steps/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/test idea1 - copy/.toString(),"Action":/Submit/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea1 - copy/.toString())
        //Change Idea Status in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStatusinPipelineStepspage().run("Status":/In Progress/.toString(),"Action":/Change Status/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pipeline A/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("Idea Name":/test idea1 - copy/.toString(),"Number of Matches":/1/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1 - copy/.toString())
        //Set Tab in View Idea 3
        new actions.ViewIdea30.SetTabinViewIdea3().run("Tab":/History/.toString())
        //Verify History Tab on View Idea
        new actions.ViewIdea.VerifyHistoryTabonViewIdea().run("Launch from View Idea 3":true,"Event Record to Verify":/Idea linked to test idea1 - copy by Rules Engine/.toString(),"Number of Matches":/0/.toString(),"Total Number of Records":/1/.toString())
        //Verify History Tab on View Idea
        new actions.ViewIdea.VerifyHistoryTabonViewIdea().run("Launch from View Idea 3":true,"Event Record to Verify":/Idea copied from test idea1 - copy by Rules Engine/.toString(),"Number of Matches":/1/.toString(),"Placement Number":/1/.toString(),"Total Number of Records":/1/.toString())
        //Verify Linked Submission on View Idea
        new actions.ViewIdea.VerifyLinkedSubmissiononViewIdea().run("Linked Submissions":/test idea1 - copy/.toString(),"Should Exist":/FALSE/.toString())
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