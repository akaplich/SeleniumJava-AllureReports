package TestCases.RWHQImports.OldRuleModal

import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import BaseClasses.TestBase

//C130696 - OLD RULE MODAL Move Ideas via Rules with Dev Fields
class C130696_OLDRULEMODALMoveIdeasviaRuleswithDevFields
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
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Source Pipeline/.toString(),"Description":/desc/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Destination Pipeline/.toString(),"Description":/desc/.toString(),"Pipeline Administrators":/Moderator/.toString(),"Administrators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Source Pipeline/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Same Development Question/.toString(),"Additional Question Type":/Short Answer/.toString(),"Development Field":true,"Save Form":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Source Pipeline/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Different Development Question/.toString(),"Additional Question Type":/Multiple Choice/.toString(),"Development Field":true,"Save Form":true)
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Steps/.toString())
        //Edit Step in Pipeline Steps page
        new actions.PipelineStepsView.EditStepinPipelineStepspage().run("Step to Edit":/Submitted/.toString(),"Step Name":/Development/.toString(),"Tool Type":/Development/.toString(),"Action":/Save/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Configure Development Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureDevelopmentinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Development/.toString(),"Assignment Method":/Individual Assignment/.toString(),"Development Lead":/Idea Submitter/.toString(),"Development Field":/Same Development Question,Different Development Question/.toString(),"Development Field Included or Required":/Included,Included/.toString(),"Action":/Activate/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Destination Pipeline/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Same Development Question/.toString(),"Additional Question Type":/Short Answer/.toString(),"Development Field":true,"Save Form":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Source Pipeline/.toString(),"Area to Navigate to":/Rules/.toString())
        //OLD RULE Access Add/Create Rule popup
        new actions.Rules.AccessAddCreateRulepopup().run([:])
        //OLD RULE Set Rule Event that triggers this rule
        new actions.Rules.SetRuleEventthattriggersthisrule().run("Event":/Action Item Completed/.toString())
        //OLD RULE Set Rule Perform the Following Actions
        new actions.Rules.SetRulePerformtheFollowingActions().run("Row Number to be Added, Delete or Modify existing":/1/.toString(),"Add, Delete or Modify":/Modify/.toString(),"Perform Following Action":/Move Idea to Pipeline/.toString(),"Configure Action (Move or Copy to Pipeline Only)":true)
        //OLD RULE Configure Rule Action Move Idea to Pipeline
        new actions.Rules.ConfigureRuleActionMoveIdeatoPipeline().run("Move To Pipeline":/Destination Pipeline/.toString(),"Category":/Marketing & Branding/.toString(),"Status":/Submitted/.toString(),"Action":/Save/.toString())
        //OLD RULE Set Rule window
        new actions.Rules.SetRulewindow().run("Rule Name":/Rule Move 1/.toString(),"Action":/Create/.toString())
        //Select Rule in Rules Engine table
        new actions.Rules.SelectRuleinRulesEnginepage().run("Rule Name":/Rule Move 1/.toString())
        //OLD RULE Change Rule Status
        new actions.Rules.ChangeRuleStatus().run("Change Status":/Active/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Source Pipeline/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/Move this idea1/.toString(),"Action":/Submit/.toString())
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/Move this idea1/.toString())
        //Set Development Action Item Page Fields
        new actions.ActionItems.SetDevelopmentActionItemPageFields().run("Multiple Choice - Title":/Different Development Question/.toString(),"Multiple Choice - Answer":/Answer 1/.toString(),"Short Answer - Title":/Same Development Question/.toString(),"Short Answer - Answer":/This is for testing short ans/.toString(),"Action":/Mark Complete/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Destination Pipeline/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Move this idea1/.toString())
        //Set Tab in View Idea 3
        new actions.ViewIdea30.SetTabinViewIdea3().run("Tab":/Development/.toString())
        //Verify Description Tab Text Field on View Idea 30
        new actions.ViewIdea3Fields.VerifyViewIdea3DescriptionTabFieldValue().run("Field Name":/Same Development Question/.toString(),"Field Value":/This is for testing short ans/.toString(),"Should Exist":/TRUE/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Different Development Question/.toString(),"Should Exist":false)
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