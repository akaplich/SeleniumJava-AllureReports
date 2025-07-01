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

//C130697 - Copy Ideas via Rules with Dev Fields
class C130697_CopyIdeasviaRuleswithDevFields extends TestBase {
    private static def variables = [:]
    private static final Logger logger = LoggerFactory.getLogger(C130697_CopyIdeasviaRuleswithDevFields.class);

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
        //Disable Apps V3
        Action67d84bbf3e876c6a0e91b2a2([:])
        //Delete this when Rules Engine Updated UI is enabled for everyone
        Action66ee0346e12425a91eeb06ab([:])
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
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Same Development Question/.toString(),"Additional Question Type":/Long Answer/.toString(),"Development Field":true,"Save Form":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Source Pipeline/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Different Development Question/.toString(),"Additional Question Type":/Multiple Choice/.toString(),"Development Field":true,"Save Form":true)
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Steps/.toString())
        //Edit Step in Pipeline Steps page
        new actions.PipelineStepsView.EditStepinPipelineStepspage().run("Step to Edit":/Submitted/.toString(),"Step Name":/Development/.toString(),"Tool Type":/Development/.toString(),"Action":/Save/.toString())
        //Configure Development Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureDevelopmentinNewModalinPipelineStepspage().run("Assignment Method":/Individual Assignment/.toString(),"Development Lead":/Idea Submitter/.toString(),"Development Field":/Same Development Question,Different Development Question/.toString(),"Development Field Included or Required":/Included,Included/.toString(),"Action":/Activate/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Destination Pipeline/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Same Development Question/.toString(),"Additional Question Type":/Long Answer/.toString(),"Development Field":true,"Save Form":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Source Pipeline/.toString(),"Area to Navigate to":/Rules/.toString())
        //Access Add/Create Rule popup
        new actions.Rules.SetAddCreateRule().run([:])
        //Set Rule Event that triggers this rule
        new actions.Rules.SetNewRuleEventthattriggersthisrule().run("Event":/Action Item Completed/.toString())
        //Set Rule Meet the Following Conditions
        new actions.Rules.SetNewRuleMeettheFollowingConditions().run("Row Number to be Added, Delete or Modify existing":/1/.toString(),"Add, Delete or Modify":/Add/.toString(),"Condition":/Step/.toString(),"Operator value":/Is/.toString(),"Condition value":/Development/.toString())
        //Set Rule Perform the Following Actions
        new actions.Rules.SetNewRulePerformtheFollowingActions().run("Row Number to be Added, Delete or Modify existing":/1/.toString(),"Add, Delete or Modify":/Add/.toString(),"Perform Following Action":/Copy Idea to Pipeline/.toString(),"Configure Action (Move or Copy to Pipeline Only)":true)
        //Configure Rule Action Copy Idea to Pipeline
        new actions.Rules.ConfigureNewRuleActionCopyIdeatoPipeline().run("Pipeline":/Destination Pipeline/.toString(),"Append extra submission questions to description":true,"Append Additional Info to description":true,"Action":/Save/.toString())
        //Set Rule window
        new actions.Rules.SetNewRulewindow().run("Rule Name":/Rule Copy1/.toString(),"Action":/Create/.toString())
        //Select Rule in Rules Engine table
        new actions.Rules.SelectRuleinRulesEnginepage().run("Rule Name":/Rule Copy1/.toString())
        //Change Rule Status
        Action594d63e45cb815bc19ca15e6("Change Status":/Active/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Source Pipeline/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/Copy this idea1/.toString(),"Action":/Submit/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/Copy this idea1/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Set Development Action Item Page Fields
        new actions.ActionItems.SetDevelopmentActionItemPageFields().run("Multiple Choice - Title":/Different Development Question/.toString(),"Multiple Choice - Answer":/Answer 3/.toString(),"Long Answer - Title":/Same Development Question/.toString(),"Long Answer - Answer":/This is for testing long ans/.toString(),"Action":/Mark Complete/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Destination Pipeline/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Copy this idea1/.toString())
        //Verify View Idea Description Tab Field Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldValue().run("Field Name":/Same Development Question/.toString(),"Field Value":/This is for testing long ans/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Different Development Question/.toString(),"Should Exist":false)
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
    //Disable Apps V3
    public static def Action67d84bbf3e876c6a0e91b2a2(def params){
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for BIOnly Beta tab
        new actions.SetupBI.SetEnterpriseSetupforBIOnlyBetatab().run("Activate Apps V3":false,"Apps v3 Pre-launch Enhancements":false)
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