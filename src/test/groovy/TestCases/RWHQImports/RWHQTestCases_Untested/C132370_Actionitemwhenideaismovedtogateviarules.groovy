import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C132370 - Action item when idea is moved to gate via rules
class C132370_Actionitemwhenideaismovedtogateviarules
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Unlimited Brightidea Administrator License Type":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString(),"My Ideas":true,"User Metrics My Ideas":true,"User Metrics Submissions":true,"User Metrics Activities":true,"User Metrics Submission Views":true,"User Metrics Collaborators":true,"User Metrics Projects":true,"User Metrics Business Impact":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Select Product in Apps Pillar Page
        new actions.AppsPillar.SelectProductinAppsPillarPage().run("Product":/Ecosystem/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Venture/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Venture title/.toString(),"Description":/Venture description/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Venture title/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Edit Step in Pipeline Steps page
        new actions.PipelineStepsView.EditStepinPipelineStepspage().run("Step to Edit":/Due Diligence/.toString(),"Step Name":/STAGE STEP/.toString(),"Tool Type":/Stage/.toString())
        //Configure Stage Process Step in Pipeline Steps Page
        new actions.PipelineStepsConfigure.ConfigureStageProcessStepinPipelineStepsPage().run("Assignment Method":/Individual Assignment/.toString(),"Stage Lead":/Idea Submitter/.toString(),"Stage Team":/End User,Moderator/.toString(),"Stage Team Add or Remove":/Add,Add/.toString(),"Project Room Template":/General, Stage Gate Process (system default)/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/1/.toString())
        //Set Project Room Templates for Stage Gate or Onboarding
        new actions.PipelineSetup.SetProjectRoomTemplates().run("Tab":/Stage Gate/.toString(),"Template Name":/General, Stage Gate Process (system default)/.toString(),"Action":/Select Project Room/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/0/.toString())
        //Configure Stage Process Step in Pipeline Steps Page
        new actions.PipelineStepsConfigure.ConfigureStageProcessStepinPipelineStepsPage().run("Click on Refresh":true,"Folder mapping":/Stage 0: Discovery/.toString(),"Folder Mapping Placement Number":/1/.toString(),"Action":/Activate/.toString())
        //Configure Gate Approval Step in Pipeline Steps Page
        new actions.PipelineStepsConfigure.ConfigureGateApprovalStepinPipelineStepsPage().run("Step Name to Configure (optional)":/🔷 Sourcing Gate/.toString(),"Assignment Method":/Individual Assignment/.toString(),"Gate Lead":/Select a user/.toString(),"Gate Team":/System Admin/.toString(),"Gate Team Add or Remove":/Add/.toString(),"Selected user":/End User/.toString(),"Selected Users Add or Remove":/Add/.toString(),"Gate Mapping":/Gate 0/.toString(),"Gate Mapping Placement Number":/1/.toString(),"Action":/Activate/.toString())
        //Delete this when Rules Engine Updated UI is enabled for everyone
        Action66ee0346e12425a91eeb06ab([:])
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Venture title/.toString(),"Area to Navigate to":/Rules/.toString())
        //Access Add/Create Rule popup
        new actions.Rules.SetAddCreateRule().run([:])
        //Set Rule Event that triggers this rule
        new actions.Rules.SetNewRuleEventthattriggersthisrule().run("Event":/Action Item Completed/.toString())
        //Set Rule Perform the Following Actions
        new actions.Rules.SetNewRulePerformtheFollowingActions().run("Row Number to be Added, Delete or Modify existing":/1/.toString(),"Add, Delete or Modify":/Add/.toString(),"Perform Following Action":/Change Step/.toString(),"Action Value":/🔷 Sourcing Gate/.toString())
        //Set Rule window
        new actions.Rules.SetNewRulewindow().run("Rule Name":/Move Idea Forward/.toString(),"Action":/Create/.toString())
        //Select Rule in Rules Engine table
        new actions.Rules.SelectRuleinRulesEnginepage().run("Rule Name":/Move Idea Forward/.toString())
        //Change Rule Status
        Action594d63e45cb815bc19ca15e6("Change Status":/Active/.toString())
        //Verify Rule in Rules Engine table
        new actions.Rules.VerifyRuleinRulesEnginetable().run("Order":/0/.toString(),"Rule Name":/Move Idea Forward/.toString(),"Event":/Action Item Completed/.toString(),"Last Run":/Never/.toString(),"Status":/Active/.toString(),"Description":/Change Step to 🔷 Sourcing Gate/.toString(),"Number of Matches":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Venture title/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/idea1/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/idea1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/STAGE STEP/.toString(),"Action":/Change Step/.toString())
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/idea1/.toString(),"Message":/You have been assigned a Stage action item for/.toString(),"Pipeline Name":/Venture title/.toString(),"Number of Matches":/1/.toString(),"Click on Action Item":true)
        //Set Stage Process Action Item
        new actions.ProjectRoom.SetStageProcessActionItem().run("Action on Submit stage action item":/Submit Stage/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Venture title/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Verify Idea in Pipeline Steps page
        new actions.PipelineStepsView.VerifyIdeainPipelineStepsViewpage().run("Idea Name":/idea1/.toString(),"Step Name idea belongs to":/🔷 Sourcing Gate/.toString(),"Number of Matches":/1/.toString(),"Placement Number":/1/.toString())
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/idea1/.toString(),"Message":/You have been assigned a Gate action item for/.toString(),"Pipeline Name":/Venture title/.toString(),"Number of Matches":/1/.toString(),"Click on Action Item":true)
        //Set Default Gate Approval Action Item
        new actions.ProjectRoom.SetGateApprovalActionItem().run("How aligned is this to our core mission and strategy?":/Not at all aligned/.toString(),"Do the project benefits outweigh the cost and risks introduced?":/Yes/.toString(),"How complete is the project investigation at this point?":/Somewhat complete/.toString(),"Overall, should this project be considered for the next planning session?":/No/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Scorecard succesfully submitted/.toString(),"Should Exist":true)
        //Return Todays or Other Date in the Requested Format
        variables."date" = new actions.Utils.ReturnTodaysDateintheRequestedFormat().run("Format":/MM\/dd\/YYYY/.toString())
        //Verify Stage Process or Gate Approval Action Item
        new actions.ProjectRoom.VerifyStageProcessActionItem().run("Stage or Gate Name":/Gate 0/.toString(),"Stage Heading":/Gate review has been completed by System Admin on ${variables."date"}./.toString(),"Stage or Gate Review Assigned To":/System Admin,End User/.toString(),"Scorecard":/Completed!/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Venture title/.toString(),"Area to Navigate to":/Rules/.toString())
        //Verify Rule in Rules Engine table
        new actions.Rules.VerifyRuleinRulesEnginetable().run("Order":/0/.toString(),"Rule Name":/Move Idea Forward/.toString(),"Event":/Action Item Completed/.toString(),"Last Run":/${variables."date"}/.toString(),"Status":/Active/.toString(),"Description":/Change Step to 🔷 Sourcing Gate/.toString(),"Number of Matches":/1/.toString())
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