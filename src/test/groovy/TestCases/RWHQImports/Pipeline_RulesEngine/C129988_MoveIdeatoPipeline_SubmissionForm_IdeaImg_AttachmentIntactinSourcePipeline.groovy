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

//C129988 - Move Idea to Pipeline  - Submission Form, Idea Img, Attachment Intact in Source Pipeline
class C129988_MoveIdeatoPipeline_SubmissionForm_IdeaImg_AttachmentIntactinSourcePipeline extends TestBase {
    private static def variables = [:]
    private static final Logger logger = LoggerFactory.getLogger(C129988_MoveIdeatoPipeline_SubmissionForm_IdeaImg_AttachmentIntactinSourcePipeline.class);
    
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
    @Test @Tag("OldRulesModalRegression")
    //Disabling this for now as we need to figure out where to store the attchment file used in the test case
    @Disabled
    public void testcase(){     
        logger.debug("TestCase");
        //Basestate
        Action58123c20fa4ee77809f468f6(variables)
        //Delete this when Rules Engine Updated UI is enabled for everyone
        Action66ee0346e12425a91eeb06ab([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Destination/.toString(),"Description":/desc/.toString(),"Action":/Create/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/test idea3/.toString(),"Image File":/Image3.jpg/.toString(),"Image Crop or Cancel":/Crop/.toString(),"Description":/description3/.toString(),"Expertise":/expertise3/.toString(),"Expertise Add or Remove":/Add/.toString(),"Attachments File":/SampleDoc.docx/.toString(),"Attachment Add or Remove":/Add/.toString(),"Tag Name":/tag3/.toString(),"Tag Add or Remove":/Add/.toString(),"Category":/Operations/.toString(),"Multiple Choice Question":/Answer 1/.toString(),"Checkbox Question Name":/Answer 2/.toString(),"Checkbox Check":/TRUE/.toString(),"Short Answer Question":/short test/.toString(),"Long Answer Question":/long test/.toString(),"Dropdown Question":/Answer 3/.toString(),"Date Question":/01\/01\/2022/.toString(),"Number Question":/12345/.toString(),"User Selection Question Name":/End User 2/.toString(),"User Selection Question Add or Remove":/Add/.toString(),"Required Short Question":/required short/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/test idea4/.toString(),"Image File":/Image5.jpg/.toString(),"Image Crop or Cancel":/Crop/.toString(),"Description":/description4/.toString(),"Expertise":/expertise4/.toString(),"Expertise Add or Remove":/Add/.toString(),"Attachments File":/SampleExcel.xlsx/.toString(),"Attachment Add or Remove":/Add/.toString(),"Tag Name":/tag4/.toString(),"Tag Add or Remove":/Add/.toString(),"Category":/Operations/.toString(),"Multiple Choice Question":/Answer 3/.toString(),"Checkbox Question Name":/Answer 3/.toString(),"Checkbox Check":/TRUE/.toString(),"Short Answer Question":/short test4/.toString(),"Long Answer Question":/long test4/.toString(),"Dropdown Question":/Answer 1/.toString(),"Date Question":/04\/04\/2022/.toString(),"Number Question":/12/.toString(),"User Selection Question Name":/End User/.toString(),"User Selection Question Add or Remove":/Add/.toString(),"Required Short Question":/required short4/.toString(),"Action":/Submit Idea/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Rules/.toString())
        //Access Add/Create Rule popup
        new actions.Rules.SetAddCreateRule().run([:])
        //Set Rule Event that triggers this rule
        new actions.Rules.SetNewRuleEventthattriggersthisrule().run("Event":/Idea Status Changed/.toString())
        //Set Rule Perform the Following Actions
        new actions.Rules.SetNewRulePerformtheFollowingActions().run("Row Number to be Added, Delete or Modify existing":/1/.toString(),"Add, Delete or Modify":/Add/.toString(),"Perform Following Action":/Move Idea to Pipeline/.toString(),"Configure Action (Move or Copy to Pipeline Only)":true)
        //Configure Rule Action Move Idea to Pipeline
        new actions.Rules.ConfigureNewRuleActionMoveIdeatoPipeline().run("Move To Pipeline":/Destination/.toString(),"Category":/Strategy/.toString(),"Status":/Submitted/.toString(),"Action":/Save/.toString())
        //Set Rule window
        new actions.Rules.SetNewRulewindow().run("Rule Name":/Rule Copy 1/.toString(),"Action":/Create/.toString())
        //Select Rule in Rules Engine table
        new actions.Rules.SelectRuleinRulesEnginepage().run("Rule Name":/Rule Copy 1/.toString())
        //Change Rule Status
        Action594d63e45cb815bc19ca15e6("Change Status":/Active/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea3/.toString())
        //Change Idea Status in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStatusinPipelineStepspage().run("Status":/In Progress/.toString(),"Action":/Change Status/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Verify Idea in Idea Board page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage30().run("Idea Name":/test idea4/.toString(),"Image":true,"Status":/Submitted/.toString(),"Username":/End User/.toString(),"Description":/description4/.toString(),"Number of Matches":/1/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea4/.toString())
        //Verify Idea in View Idea page
        new actions.ViewIdea.VerifyIdeainViewIdeapage().run("Idea Name":/test idea4/.toString(),"Idea Image":true,"Creator username":/End User/.toString(),"Category":/Operations/.toString(),"Status":/Submitted/.toString(),"Tag":/tag4/.toString(),"Tag Should Exist":/TRUE/.toString(),"Description":/description4/.toString(),"Linked Submissions":[])
        //Verify Custom App Description tab fields in View Idea page
        Action5812921cfa4ee77809f46b4f("Expertise Required":/expertise4/.toString(),"Multiple Choice Question":/Answer 3/.toString(),"Checkbox Question":/Answer 3/.toString(),"Short Answer Question":/short test4/.toString(),"Long AnswerQuestion":/long test4/.toString(),"Dropdown Question":/Answer 1/.toString(),"Date Question":/04\/04\/2022/.toString(),"Number Question":/12/.toString(),"User Selection Question":/End User/.toString(),"Required Short Question":/required short4/.toString())
        //Verify Attachment in Attachments tab for View Idea page
        new actions.ViewIdea.VerifyAttachmentinAttachmentstabforViewIdeapage().run("Attachment File":/SampleExcel.xlsx/.toString(),"Number of Matches":/1/.toString())
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
    //Verify Custom App Description tab fields in View Idea page
    public static def Action5812921cfa4ee77809f46b4f(def params){
        //Verify View Idea Description Tab Field Multi Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldMultiValue().run("Field Name":/Expertise Required/.toString(),"Field Value":/${params."Expertise Required"}/.toString())
        //Verify View Idea Description Tab Field Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldValue().run("Field Name":/Multiple Choice Question/.toString(),"Field Value":/${params."Multiple Choice Question"}/.toString())
        //Verify View Idea Description Tab Field Multi Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldMultiValue().run("Field Name":/Checkbox Question/.toString(),"Field Value":/${params."Checkbox Question"}/.toString())
        //Verify View Idea Description Tab Field Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldValue().run("Field Name":/Short Answer Question/.toString(),"Field Value":/${params."Short Answer Question"}/.toString())
        //Verify View Idea Description Tab Field Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldValue().run("Field Name":/Long Answer Question/.toString(),"Field Value":/${params."Long AnswerQuestion"}/.toString())
        //Verify View Idea Description Tab Field Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldValue().run("Field Name":/Dropdown Question/.toString(),"Field Value":/${params."Dropdown Question"}/.toString())
        //Verify View Idea Description Tab Field Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldValue().run("Field Name":/Date Question/.toString(),"Field Value":/${params."Date Question"}/.toString())
        //Verify View Idea Description Tab Field Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldValue().run("Field Name":/Number Question/.toString(),"Field Value":/${params."Number Question"}/.toString())
        //Verify View Idea Description Tab Field Multi Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldMultiValue().run("Field Name":/User Selection Question/.toString(),"Field Value":/${params."User Selection Question"}/.toString())
        //Verify View Idea Description Tab Field Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldValue().run("Field Name":/Admin Only Dropdown Question/.toString(),"Field Value":/${params."Admin Only Dropdown Question"}/.toString())
        //Verify View Idea Description Tab Field Value
        new actions.ViewIdeaFields.VerifyViewIdeaDescriptionTabFieldValue().run("Field Name":/Required Short Question/.toString(),"Field Value":/${params."Required Short Question"}/.toString())
    }
}