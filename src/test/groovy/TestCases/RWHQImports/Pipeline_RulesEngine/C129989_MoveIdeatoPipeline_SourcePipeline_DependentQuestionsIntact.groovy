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
import org.junit.jupiter.api.Disabled

//C129989 - Move Idea to Pipeline - Source Pipeline - Dependent Questions Intact
class C129989_MoveIdeatoPipeline_SourcePipeline_DependentQuestionsIntact extends TestBase {
    private static def variables = [:]
    private static final Logger logger = LoggerFactory.getLogger(C129989_MoveIdeatoPipeline_SourcePipeline_DependentQuestionsIntact.class);

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
    //Disabling this for now as we need to figure out how to get attachment file for the test case to use later
    @Disabled
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
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Test App Source/.toString(),"Description":/desc/.toString(),"Action":/Create/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Parent1/.toString(),"Additional Question Type":/Multiple Choice/.toString(),"Additional Question Answers":/Answer 1,Answer 2,Answer 3,Parent1-1,Parent1-2,Parent1-3/.toString(),"Additional Question Answers Actions":/Remove,Remove,Remove,Add,Add,Add/.toString(),"Save Form":true)
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Parent1/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Required":true,"Save Form":true)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Child1/.toString(),"Additional Question Type":/Dropdown/.toString(),"Additional Question Answers":/Answer 1,Answer 2,Answer 3,Child1-1,Child1-2,Child1-3/.toString(),"Additional Question Answers Actions":/Remove,Remove,Remove,Add,Add,Add/.toString(),"Save Form":true)
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Child1/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Set Dependent Answer":true,"Set Dependent Answer Dropdown":/Parent1-3/.toString(),"Required":true,"Save Form":true)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Child2/.toString(),"Additional Question Type":/Long Answer/.toString())
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Child2/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Set Dependent Answer":true,"Set Dependent Answer Dropdown":/Child1-3/.toString(),"Save Form":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Test App Source/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Idea Title Question - Title":/Title/.toString(),"Idea Title Question - Value":/test idea1/.toString(),"Description Question - Title":/Description/.toString(),"Description Question - Value":/description1/.toString(),"Idea Attachment Question - Title":/Attachment/.toString(),"Idea Attachment Question - Value":/Image3.jpg/.toString(),"Idea Attachment Add or Remove":/Add/.toString(),"Tags Question - Title":/Tags/.toString(),"Tags Question - Value":/tag1/.toString(),"Tag Add or Remove":/Add/.toString(),"Category Question - Title":/Category/.toString(),"Category Question - Value":/New Product/.toString(),"Multiple Choice - Title":/Parent1/.toString(),"Multiple Choice - Value":/Parent1-3/.toString(),"Dropdown Question - Title":/Child1/.toString(),"Dropdown Question - Value":/Child1-3/.toString(),"Long Answer - Title":/Child2/.toString(),"Long Answer - Value":/test me/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Test App Source/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Idea Title Question - Title":/Title/.toString(),"Idea Title Question - Value":/test idea2/.toString(),"Description Question - Title":/Description/.toString(),"Description Question - Value":/description2/.toString(),"Idea Attachment Question - Title":/Attachment/.toString(),"Idea Attachment Question - Value":/Image3.jpg/.toString(),"Idea Attachment Add or Remove":/Add/.toString(),"Tags Question - Title":/Tags/.toString(),"Tags Question - Value":/tag2/.toString(),"Tag Add or Remove":/Add/.toString(),"Category Question - Title":/Category/.toString(),"Category Question - Value":/New Product/.toString(),"Multiple Choice - Title":/Parent1/.toString(),"Multiple Choice - Value":/Parent1-3/.toString(),"Dropdown Question - Title":/Child1/.toString(),"Dropdown Question - Value":/Child1-3/.toString(),"Long Answer - Title":/Child2/.toString(),"Long Answer - Value":/test me/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Test App Source/.toString(),"Area to Navigate to":/Rules/.toString())
        //Access Add/Create Rule popup
        new actions.Rules.SetAddCreateRule().run([:])
        //Set Rule Event that triggers this rule
        new actions.Rules.SetNewRuleEventthattriggersthisrule().run("Event":/Idea Status Changed/.toString())
        //Set Rule Perform the Following Actions
        new actions.Rules.SetNewRulePerformtheFollowingActions().run("Row Number to be Added, Delete or Modify existing":/1/.toString(),"Add, Delete or Modify":/Add/.toString(),"Perform Following Action":/Move Idea to Pipeline/.toString(),"Configure Action (Move or Copy to Pipeline Only)":true)
        //Configure Rule Action Move Idea to Pipeline
        new actions.Rules.ConfigureNewRuleActionMoveIdeatoPipeline().run("Move To Pipeline":/Custom App/.toString(),"Category":/Operations/.toString(),"Status":/Submitted/.toString(),"Action":/Save/.toString())
        //Set Rule window
        new actions.Rules.SetNewRulewindow().run("Rule Name":/Rule Copy 1/.toString(),"Action":/Create/.toString())
        //Select Rule in Rules Engine table
        new actions.Rules.SelectRuleinRulesEnginepage().run("Rule Name":/Rule Copy 1/.toString())
        //Change Rule Status
        Action594d63e45cb815bc19ca15e6("Change Status":/Active/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Test App Source/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea1/.toString())
        //Change Idea Status in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStatusinPipelineStepspage().run("Status":/In Progress/.toString(),"Action":/Change Status/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Test App Source/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("Idea Name":/test idea2/.toString(),"Status":/Submitted/.toString(),"Username":/System Admin/.toString(),"Description":/description2/.toString(),"Number of Matches":/1/.toString(),"Placement Number":/1/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea2/.toString())
        //Verify View Idea Description Tab Field Multi Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldMultiValue().run("Field Name":/Parent1/.toString(),"Field Value":/Parent1-3/.toString())
        //Verify View Idea Description Tab Field Multi Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldMultiValue().run("Field Name":/Child1/.toString(),"Field Value":/Child1-3/.toString())
        //Verify View Idea Description Tab Field Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldValue().run("Field Name":/Child2/.toString(),"Field Value":/test me/.toString())
        //Set View Idea Description Tab Radiobutton
        new actions.ViewIdeaFields.SetViewIdeaDescriptionTabRadiobutton().run("Field Name":/Parent1/.toString(),"Field Value":/Parent1-2/.toString(),"Action":/Save/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Child/.toString(),"Should Exist":false)
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