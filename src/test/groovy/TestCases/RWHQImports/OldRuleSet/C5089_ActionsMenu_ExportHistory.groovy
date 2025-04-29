package TestCases.RWHQImports.OldRuleSet

import BaseClasses.TestBase
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C5089 - Actions Menu - Export History
class C5089_ActionsMenu_ExportHistory extends TestBase {
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
        //Delete this when Rules Engine Updated UI is enabled for everyone
        Action66ee0346e12425a91eeb06ab([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Create Mailinator User
        new actions.Mailinator.CreateMailinatorUser().run("Email":/brightC5089_1/.toString(),"Enterprise System Administrator":true,"Finally Login as What User":/brightC5089_1@mailinator.com/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Rules/.toString())
        //Access Add/Create Rule popup
        new actions.Rules.SetAddCreateRule().run([:])
        //Set Rule Event that triggers this rule
        new actions.Rules.SetNewRuleEventthattriggersthisrule().run("Event":/Added to Step/.toString(),"Event Value":/Single Scale/.toString())
        //Set Rule Perform the Following Actions
        new actions.Rules.SetNewRulePerformtheFollowingActions().run("Row Number to be Added, Delete or Modify existing":/1/.toString(),"Add, Delete or Modify":/Add/.toString(),"Perform Following Action":/Change Status/.toString(),"Action Value":/In Progress/.toString())
        //Set Rule window
        new actions.Rules.SetNewRulewindow().run("Rule Name":/rule1/.toString(),"Action":/Create/.toString())
        //Select Rule in Rules Engine table
        new actions.Rules.SelectRuleinRulesEnginepage().run("Rule Name":/rule1/.toString())
        //Change Rule Status
        Action594d63e45cb815bc19ca15e6("Change Status":/Active/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Steps/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Single Scale/.toString(),"Action":/Change Step/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea2/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Single Scale/.toString(),"Action":/Change Step/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Rules/.toString())
        //Select Export History on Rules Page
        Action5cbe4e182487f89017f7a05c([:])
        //Get Download Link from Email
        variables."link" = new actions.Mailinator.GetDownloadLinkfromEmail().run("Email Address":/brightC5089_1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Rules-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Rule Name","Date","Idea Code","Idea Title","Triggering Event","Action"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Rules-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["rule1","D107","test idea2","Added to Step","Status changed to In Progress"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Rules-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["rule1","D102","test idea1","Added to Step","Status changed to In Progress"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
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
    //Select Export History on Rules Page
    public static def Action5cbe4e182487f89017f7a05c(def params){
        //Set Action Dropdown for Rules
        new actions.Rules.SetActionDropdownforRules().run("Action Menu Option":/Export Execution History/.toString())

    }

}