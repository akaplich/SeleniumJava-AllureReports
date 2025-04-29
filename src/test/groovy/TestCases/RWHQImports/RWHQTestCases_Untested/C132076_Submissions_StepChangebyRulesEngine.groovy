package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132076 - Submissions - Step Change by Rules Engine
class C132076_Submissions_StepChangebyRulesEngine
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
        Action58123c20fa4ee77809f468f6([:])
        //Delete this when Rules Engine Updated UI is enabled for everyone
        Action66ee0346e12425a91eeb06ab([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for Beta tab
        new actions.SetupBeta.SetEnterpriseSetupforBetatab().run("History Tab on View Submission":true,"Extended Data for History Tab":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/History Tab/.toString(),"Description":/desc/.toString(),"Action":/Create/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Steps/.toString())
        //Edit Step in Pipeline Steps page
        new actions.PipelineStepsView.EditStepinPipelineStepspage().run("Step to Edit":/Submitted/.toString(),"Step Name":/Submitted/.toString(),"Tool Type":/Single Scale/.toString(),"Action":/Save/.toString())
        //Configure Single Scale Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureSingleScaleStepinNewModalinPipelineStepspage().run("Individual Assignment User":/Evaluator/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Action":/Activate/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/History Tab/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Ideas tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforIdeastab().run("View Idea 3.0":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/History Tab/.toString(),"Area to Navigate to":/Rules/.toString())
        //Access Add/Create Rule popup
        new actions.Rules.SetAddCreateRule().run([:])
        //Set Rule Event that triggers this rule
        new actions.Rules.SetNewRuleEventthattriggersthisrule().run("Event":/Action Item Completed/.toString())
        //Set Rule Meet the Following Conditions
        new actions.Rules.SetNewRuleMeettheFollowingConditions().run("Row Number to be Added, Delete or Modify existing":/1/.toString(),"Add, Delete or Modify":/Add/.toString(),"Condition":/Category/.toString(),"Operator value":/Is/.toString(),"Condition value":/New Product/.toString())
        //Set Rule Perform the Following Actions
        new actions.Rules.SetNewRulePerformtheFollowingActions().run("Row Number to be Added, Delete or Modify existing":/1/.toString(),"Add, Delete or Modify":/Add/.toString(),"Perform Following Action":/Change Step/.toString(),"Action Value":/Initial Screen/.toString())
        //Set Rule window
        new actions.Rules.SetNewRulewindow().run("Rule Name":/New Rule/.toString(),"Action":/Create/.toString())
        //Select Rule in Rules Engine table
        new actions.Rules.SelectRuleinRulesEnginepage().run("Rule Name":/New Rule/.toString())
        //Change Rule Status
        Action594d63e45cb815bc19ca15e6("Change Status":/Active/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/History Tab/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/test idea3/.toString(),"Description":/desc for test idea3/.toString(),"Category":/New Product/.toString(),"Action":/Submit Idea/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/test idea3/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/2/.toString())
        //Set Single Scale for Idea in Action Items page
        new actions.ActionItems.SetSingleScaleforIdeainActionItemspage().run("What is your initial impression of this idea":/3/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/History Tab/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Exports for Submissions tab
        new actions.SetupExports.SetWebstormSetupExportsforSubmissionstab().run("Report Options":/Submission Step Change History/.toString(),"Format":/csv/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Verify Generated Report in any Setup Exports
        new actions.SetupExports.VerifyGeneratedReportinSetupExports().run("Report Name Starts with":/Ideas_step_history/.toString(),"Number of Matches":/1/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Ideas_step_history/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Ideas_step_history*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Initiative","Code","Step","Date Entered Step","Date Left Step","Days in Step","Next Step","User Name","User Email","Member ID"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Ideas_step_history/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Ideas_step_history*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["History Tab","D113","test idea3","Initial Screen","Evaluator","evaluator@test.com"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Ideas_step_history/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Ideas_step_history*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["History Tab","D113","Initial Screen","CURRENT"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
        //Set Webstorm Setup Exports for Submissions tab
        new actions.SetupExports.SetWebstormSetupExportsforSubmissionstab().run("Report Options":/Submission Step Change History/.toString(),"Format":/xlsx/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/25/.toString())
        //Verify Generated Report in any Setup Exports
        new actions.SetupExports.VerifyGeneratedReportinSetupExports().run("Report Name Starts with":/Ideas_step_history/.toString(),"Number of Matches":/2/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Ideas_step_history/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Ideas_step_history*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Initiative","Code","Step","Date Entered Step","Date Left Step","Days in Step","Next Step","User Name","User Email","Member ID"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Ideas_step_history/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Ideas_step_history*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["History Tab","D113","test idea3","Initial Screen","Evaluator","evaluator@test.com"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Ideas_step_history/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Ideas_step_history*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["History Tab","D113","Initial Screen","CURRENT"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/History Tab/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea3/.toString())
        //Set Tab in View Idea 3
        new actions.ViewIdea30.SetTabinViewIdea3().run("Tab":/History/.toString())
        //Verify History Tab on View Idea
        new actions.ViewIdea.VerifyHistoryTabonViewIdea().run("Launch from View Idea 3":true,"Event Record to Verify":/Step changed from 'Submitted' to 'Initial Screen' by Rules Engine/.toString(),"Number of Matches":/1/.toString(),"Total Number of Records":/3/.toString())
        //Verify History Tab on View Idea
        new actions.ViewIdea.VerifyHistoryTabonViewIdea().run("Launch from View Idea 3":true,"Event Record to Verify":/Single Scale action item completed by Evaluator/.toString(),"Number of Matches":/1/.toString(),"Total Number of Records":/3/.toString())
        //Verify History Tab on View Idea
        new actions.ViewIdea.VerifyHistoryTabonViewIdea().run("Launch from View Idea 3":true,"Event Record to Verify":/ Idea submitted by End User/.toString(),"Number of Matches":/1/.toString(),"Total Number of Records":/3/.toString())
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