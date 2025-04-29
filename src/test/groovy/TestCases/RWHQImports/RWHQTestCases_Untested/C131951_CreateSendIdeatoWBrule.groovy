package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131951 - Create Send Idea to WB rule
class C131951_CreateSendIdeatoWBrule
{
    private static def variables = [:]

    @BeforeSuite
    public void beforeState(){
        variables."URL" = /https:\/\/test.brightideatest.com/
        variables."Browser" = /Chrome/
        variables."TestRail_RunName" = null
        variables."TestRail_ExecutionName" = null
        variables."CodeEnvironment" = /Default/
        variables."Database" = null
    }
    @Test
    public void testcase(){
        //Basestate
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Unlimited Brightidea Administrator License Type":/1/.toString(),"Unlimited Idea Box Manager License Type":/1/.toString())
        //Delete this when Rules Engine Updated UI is enabled for everyone
        Action66ee0346e12425a91eeb06ab([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for BIOnly Beta tab
        new actions.SetupBI.SetEnterpriseSetupforBIOnlyBetatab().run("Rules engine: Project Room Creation":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Whiteboards/.toString())
        //Create Whiteboard or Edit Template
        new actions.Whiteboards.CreateWhiteboardFromUserhome().run("Create New or Choose Template":/New Blank Whiteboard/.toString())
        //Set Whiteboard Title
        new actions.Whiteboards.EditTitleOfWhiteboard().run("Title":/whiteboard1/.toString(),"Action":/Submit/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/app\/apps/.toString())
        //Create Memo Webstorm
        new actions.WebstormCreation.CreateMemoWebstorm().run("Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Memo Program testing/.toString(),"Description":/desc/.toString(),"Vanity URL":/teamsite1/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"General Access":/ALL/.toString(),"General Access Add or Remove":/Add/.toString(),"Admin Field Name":/Pipeline Administrators/.toString(),"Pipeline Administrators":/Pipeline Admin/.toString(),"Administrators Add or Remove":/Add/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Memo Program testing/.toString(),"Area to Navigate to":/Rules/.toString())
        //Access Add/Create Rule popup
        new actions.Rules.SetAddCreateRule().run([:])
        //Set Rule Event that triggers this rule
        new actions.Rules.SetNewRuleEventthattriggersthisrule().run("Event":/Added to Step/.toString(),"Event Value":/Collaboration/.toString())
        //Set Rule Perform the Following Actions
        new actions.Rules.SetNewRulePerformtheFollowingActions().run("Row Number to be Added, Delete or Modify existing":/1/.toString(),"Add, Delete or Modify":/Add/.toString(),"Perform Following Action":/Send Idea to Whiteboard/.toString(),"Action Value":/whiteboard1/.toString())
        //Set Rule window
        new actions.Rules.SetNewRulewindow().run("Rule Name":/send to wb rule1/.toString(),"Action":/Create/.toString())
        //Select Rule in Rules Engine table
        new actions.Rules.SelectRuleinRulesEnginepage().run("Rule Name":/send to wb rule1/.toString())
        //Change Rule Status
        Action594d63e45cb815bc19ca15e6("Change Status":/Active/.toString())
        //Verify Rule in Rules Engine table
        new actions.Rules.VerifyRuleinRulesEnginetable().run("Rule Name":/send to wb rule1/.toString(),"Event":/Added to Step Collaboration/.toString(),"Last Run":/Never/.toString(),"Status":/Active/.toString(),"Description":/Send Idea to Whiteboard/.toString(),"Number of Matches":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Memo Program testing/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Memo or Idea":/Idea/.toString(),"Title":/Memo Record1/.toString(),"Category":/Process Improvement/.toString(),"Status":/Active Development 📄/.toString(),"Action":/Submit/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Memo or Idea":/Idea/.toString(),"Title":/Memo Record2/.toString(),"Category":/Process Improvement/.toString(),"Status":/Active Development 📄/.toString(),"Action":/Submit/.toString())
        //Select Multiple Ideas in Pipeline Steps
        new actions.PipelineStepsView.SelectMultipleIdeasinPipelineSteps().run("Idea Names":["Memo Record1","Memo Record2"])
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Collaboration/.toString(),"Action":/Change Step/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Whiteboards/.toString())
        //Select Existing Whiteboard from Userhome Whiteboards
        new actions.Whiteboards.OpenExistingWhiteboardOnWhiteboardsPage().run("Name of Whiteboard":/whiteboard1/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/10/.toString())
        //Verify Smart Matrix & Other Elements Exists On Whiteboard
        new actions.Whiteboards.VerifySmartMatrixExists().run("Contains Text":/Added from "Memo Program testing" by System Admin/.toString(),"Should Exist":true)
        //Verify Smart Matrix & Other Elements Exists On Whiteboard
        new actions.Whiteboards.VerifySmartMatrixExists().run("Verify This Actual Text":/Memo Record1/.toString(),"Should Exist":true)
        //Verify Smart Matrix & Other Elements Exists On Whiteboard
        new actions.Whiteboards.VerifySmartMatrixExists().run("Verify This Actual Text":/Memo Record2/.toString(),"Should Exist":true)
        //Verify Smart Matrix & Other Elements Exists On Whiteboard
        new actions.Whiteboards.VerifySmartMatrixExists().run("Element (skip if verifying text)":/Sticky Note/.toString(),"Should Exist":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Memo Program testing/.toString(),"Area to Navigate to":/Rules/.toString())
        //Return Todays or Other Date in the Requested Format
        variables."today" = new actions.Utils.ReturnTodaysDateintheRequestedFormat().run("Format":/MM\/dd\/yyyy/.toString())
        //Verify Rule in Rules Engine table
        new actions.Rules.VerifyRuleinRulesEnginetable().run("Rule Name":/send to wb rule1/.toString(),"Event":/Added to Step Collaboration/.toString(),"Last Run":/${variables."today"}/.toString(),"Status":/Active/.toString(),"Description":/Send Idea to Whiteboard/.toString(),"Number of Matches":/1/.toString())
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
    @AfterMethod
    public void afterState(){
        //Afterstate
        Action581259c8fa4ee77809f46905([:])
    }
}