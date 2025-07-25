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

//C129846 - Added to Step - Move Idea - Notify Submitter(s)
class C129846_AddedtoStep_MoveIdea_NotifySubmitter extends TestBase {
    private static def variables = [:]
    private static final Logger logger = LoggerFactory.getLogger(C129846_AddedtoStep_MoveIdea_NotifySubmitter.class);

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
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Pipeline A/.toString(),"Description":/desc/.toString(),"Action":/Create/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Webstorm Setup Ideas for Ideas tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforIdeastab().run([:])
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Rules/.toString())
        //Access Add/Create Rule popup
        new actions.Rules.SetAddCreateRule().run([:])
        //Set Rule Event that triggers this rule
        new actions.Rules.SetNewRuleEventthattriggersthisrule().run("Event":/Added to Step/.toString(),"Event Value":/Review/.toString())
        //Set Rule Perform the Following Actions
        new actions.Rules.SetNewRulePerformtheFollowingActions().run("Row Number to be Added, Delete or Modify existing":/1/.toString(),"Add, Delete or Modify":/Add/.toString(),"Perform Following Action":/Move Idea to Pipeline/.toString(),"Configure Action (Move or Copy to Pipeline Only)":true)
        //Configure Rule Action Move Idea to Pipeline
        new actions.Rules.ConfigureNewRuleActionMoveIdeatoPipeline().run("Move To Pipeline":/Pipeline A/.toString(),"Category":/Marketing & Branding/.toString(),"Status":/In Progress/.toString(),"Notify submitter(s)":true,"Action":/Save/.toString())
        //Set Rule window
        new actions.Rules.SetNewRulewindow().run("Rule Name":/Rule Move 1/.toString(),"Action":/Create/.toString())
        //Select Rule in Rules Engine table
        new actions.Rules.SelectRuleinRulesEnginepage().run("Rule Name":/Rule Move 1/.toString())
        //Change Rule Status
        Action594d63e45cb815bc19ca15e6("Change Status":/Active/.toString())
        //Create Mailinator User
        new actions.Mailinator.CreateMailinatorUser().run("Email":/brightC129846teamtest1017/.toString(),"Finally Login as What User":/bi.adminuser1@brightidea.com/.toString())
        //Create Mailinator User
        new actions.Mailinator.CreateMailinatorUser().run("Email":/brightC129846test1017/.toString(),"Finally Login as What User":/brightC129846test1017@mailinator.com/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Profile/.toString())
        //Edit Your Profile
        new actions.UserProfile.EditYourProfile().run("First Name":/First/.toString(),"Last Name":/Last/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/test idea3/.toString(),"Submitter":/Team/.toString(),"Submitter Team User":/Autofirst/.toString(),"Submitter Team User Add or Remove":/Add/.toString(),"Description":/desc/.toString(),"Category":/New Product/.toString(),"Required Short Question":/short/.toString(),"Action":/Submit Idea/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pipeline A/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Verify Idea in Pipeline Steps page
        new actions.PipelineStepsView.VerifyIdeainPipelineStepsViewpage().run("Idea Name":/test idea3/.toString(),"Step Name idea belongs to":/Submitted/.toString(),"Number of Matches":/1/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/45/.toString())
        //Verify Email
        new actions.Email.VerifyEmailbyIteratingthroughInboxMailinator().run("Email Address":/brightC129846teamtest1017/.toString(),"Subject":/Custom App: Idea Submission Confirmation/.toString(),"From":/noreply@brightidea.com/.toString(),"Full From":/noreply@brightidea.com <noreply@brightidea.com>/.toString(),"Email Should Be Received":true)
        new actions.Email.VerifyEmailbyIteratingthroughInboxMailinator().run("Email Address":/brightC129846test1017/.toString(),"Subject":/Custom App: Idea Submission Confirmation/.toString(),"From":/noreply@brightidea.com/.toString(),"Full From":/noreply@brightidea.com <noreply@brightidea.com>/.toString(),"Email Should Be Received":true)
        new actions.Email.VerifyEmailbyIteratingthroughInboxMailinator().run("Email Address":/brightC129846test1017/.toString(),"Subject":/Custom App: Idea was moved/.toString(),"From":/Brightidea/.toString(),"Full From":/Brightidea <noreply@brightidea.com>/.toString(),"Email Should Be Received":true)
        new actions.Email.VerifyEmailbyIteratingthroughInboxMailinator().run("Email Address":/brightC129846teamtest1017/.toString(),"Subject":/Custom App: Idea was moved/.toString(),"From":/Brightidea/.toString(),"Full From":/Brightidea <noreply@brightidea.com>/.toString(),"Email Should Be Received":true)
        //new actions.Mailinator.VerifyEmail().run("Email Address":/brightC129846test1016/.toString(),"Subject":/Custom App: Idea was moved/.toString(),"From":/Brightidea/.toString(),"Full From":/Brightidea <noreply@brightidea.com>/.toString())
        //Verify Email
        //new actions.Mailinator.VerifyEmail().run("Email Address":/brightC129846teamtest1016/.toString(),"Subject":/Custom App: Idea was moved/.toString(),"From":/Brightidea/.toString(),"Full From":/Brightidea <noreply@brightidea.com>/.toString())
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