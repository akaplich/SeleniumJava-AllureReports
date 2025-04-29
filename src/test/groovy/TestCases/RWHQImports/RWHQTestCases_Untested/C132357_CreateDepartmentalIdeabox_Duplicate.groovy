package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132357 - Create Departmental Ideabox - Duplicate
class C132357_CreateDepartmentalIdeabox_Duplicate
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Unlimited Idea Box Manager License Type":/1/.toString())
        //Delete this when Rules Engine Updated UI is enabled for everyone
        Action66ee0346e12425a91eeb06ab([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup BIOnly for Apps Pillar 2.0
        new actions.SetupBI.SetEnterpriseSetupBIOnlyforAppsPillar20().run("Apps":["departmental_idea_box"],"Availability":/true/.toString(),"Action":/Save/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Departmental Ideabox/.toString(),"Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Departmental Source Ideabox/.toString(),"Description":/desc/.toString(),"SubPipeline Name":/subpipeline1,subpipeline2,subpipeline3/.toString(),"SubPipeline Field Name":/Name of Quick Win Pipeline,Name of Backlog Pipeline,Name of Strategic Pipeline/.toString(),"Action on Multi Pipeline Configuration":/Continue/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Select Product in Apps Pillar Page
        new actions.AppsPillar.SelectProductinAppsPillarPage().run("Product":/Build/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/subpipeline4/.toString(),"Description":/Custom Initiative description/.toString(),"Submission Name":/Submission/.toString(),"Submission Plural Name":/Submissions/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/subpipeline4/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Site Setup for BI Beta tab
        new actions.SetupBI.SetSiteSetupforBIBetatab().run("This pipeline is an Idea Box Sub-pipeline":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Select Product in Apps Pillar Page
        new actions.AppsPillar.SelectProductinAppsPillarPage().run("Product":/Build/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/subpipeline5/.toString(),"Description":/Custom Initiative description/.toString(),"Submission Name":/Submission/.toString(),"Submission Plural Name":/Submissions/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/subpipeline5/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Site Setup for BI Beta tab
        new actions.SetupBI.SetSiteSetupforBIBetatab().run("This pipeline is an Idea Box Sub-pipeline":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Select Community
        new actions.SetupEnterpriseCommunities.SelectCommunity().run("Community Name":/Departmental Source Ideabox/.toString())
        //Update Community
        new actions.SetupEnterpriseCommunities.UpdateCommunity().run("Apps":/subpipeline4,subpipeline5/.toString(),"Checkbox Check":/TRUE,TRUE/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/subpipeline1/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Design Tab in Site Setup
        new actions.SetupSite.SetDesignTabinSiteSetup().run("Custom CSS":/.customfooter::after {   font-weight: bold;   color: navy;   content: ": CSS-Content"; }/.toString(),"User Homepage Footer HTML":/<p class="customfooter"><b>------------------------------------------------------------------Bold Text<\/b><\/p>/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/subpipeline5/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Enterprise Setup Site Navigation Page
        new actions.SetupSite.SetEnterpriseSetupSiteNavigationPage().run("Add Edit or Delete Navigation Item":/Add/.toString(),"Title":/Blog/.toString(),"Link":/Blog/.toString(),"Permission":/ALL/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/subpipeline2/.toString(),"Area to Navigate to":/Rules/.toString())
        //Access Add/Create Rule popup
        new actions.Rules.SetAddCreateRule().run([:])
        //Set Rule Event that triggers this rule
        new actions.Rules.SetNewRuleEventthattriggersthisrule().run("Event":/Added to Step/.toString(),"Event Value":/Initial Screen/.toString())
        //Set Rule Perform the Following Actions
        new actions.Rules.SetNewRulePerformtheFollowingActions().run("Row Number to be Added, Delete or Modify existing":/1/.toString(),"Add, Delete or Modify":/Add/.toString(),"Perform Following Action":/Change Step/.toString(),"Action Value":/Scorecard/.toString())
        //Set Rule window
        new actions.Rules.SetNewRulewindow().run("Rule Name":/Added to Step Rule/.toString(),"Action":/Create/.toString())
        //Select Rule in Rules Engine table
        new actions.Rules.SelectRuleinRulesEnginepage().run("Rule Name":/Added to Step Rule/.toString())
        //Change Rule Status
        Action594d63e45cb815bc19ca15e6("Change Status":/Active/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/subpipeline3/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Create Step in Pipeline Steps page
        new actions.PipelineStepsView.CreateStepinPipelineStepspage().run("Step Name":/New Step/.toString(),"Select Tool Type":/Single Scale/.toString(),"Select Stage":/Stage 0: Discovery/.toString(),"Action":/Create/.toString())
        //Configure Single Scale Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureSingleScaleStepinNewModalinPipelineStepspage().run("Individual Assignment User":/End User/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Action":/Activate/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/subpipeline4/.toString(),"Area to Navigate to":/Home/.toString())
        //Set Edit Mode Homepage Header 2.0
        new actions.WebstormHomepage.SetEditHomepageHeader2().run([:])
        //Set Change Background or Other Modal Tab
        new actions.WebstormHomepage.SetChangeBackgroundmodal().run([:])
        //Set Preset or Unsplash Background Image in the Header
        new actions.WebstormHomepage.SetPresetBackgroundImageintheHeader().run("Preset Image Name":/timebox/.toString(),"Action":/Add Image/.toString())
        //Set Homepage Header
        new actions.WebstormHomepage.SetHomepageHeaderMenu().run("Action":/Save/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Duplicate Webstorm
        new actions.WebstormCreation.CreateDuplicateWebstorm().run("Pipeline To Duplicate":/Departmental Source Ideabox/.toString(),"Name":/Duplicate/.toString(),"Description":/desc/.toString(),"SubPipeline Name":/dupsub1,dupsub2,dupsub3,dupsub4,dupsub5/.toString(),"SubPipeline Field Name":/New name for subpipeline1,New name for subpipeline2,New name for subpipeline3,New name for subpipeline4,New name for subpipeline5/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Action":/Duplicate/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/15/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Duplicate/.toString(),"Area to Navigate to":/Home/.toString())
        //Set Navigation Options in Dynamic Nav Bar
        new actions.WebstormHomepage.SetNavigationOptionsinDynamicNavBar().run("Nav Parent Title":/dupsub1/.toString())
        //Verify Stage in Pipeline Steps View
        new actions.PipelineStepsView.VerifyStageInPipelineStepsView().run("Stage Name":/Selection/.toString(),"Background Color in RGB":/rgb(235, 222, 240)/.toString(),"Should Exist":true,"Position":/3/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/dupsub1/.toString(),"Area to Navigate to":/Home/.toString())
        //Verify Element Exists
        new actions.general.VerifyElement().run("ID":/\/\/table[@id="custom_footer"]\/\/p[contains(.,"Bold Text")]/.toString(),"Number of Matches":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Duplicate/.toString(),"Area to Navigate to":/Home/.toString())
        //Set Navigation Options in Dynamic Nav Bar
        new actions.WebstormHomepage.SetNavigationOptionsinDynamicNavBar().run("Nav Parent Title":/dupsub2/.toString())
        //Verify Stage in Pipeline Steps View
        new actions.PipelineStepsView.VerifyStageInPipelineStepsView().run("Stage Name":/Backlog Organization/.toString(),"Background Color in RGB":/rgb(235, 222, 240)/.toString(),"Should Exist":true,"Position":/3/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/dupsub2/.toString(),"Area to Navigate to":/Rules/.toString())
        //Verify Rule in Rules Engine table
        new actions.Rules.VerifyRuleinRulesEnginetable().run("Rule Name":/Added to Step Rule/.toString(),"Event":/Added to Step Initial Screen/.toString(),"Number of Matches":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Duplicate/.toString(),"Area to Navigate to":/Home/.toString())
        //Set Navigation Options in Dynamic Nav Bar
        new actions.WebstormHomepage.SetNavigationOptionsinDynamicNavBar().run("Nav Parent Title":/dupsub3/.toString())
        //Verify Stage in Pipeline Steps View
        new actions.PipelineStepsView.VerifyStageInPipelineStepsView().run("Stage Name":/Stage 2: Build Business Case/.toString(),"Background Color in RGB":/rgb(214, 234, 248)/.toString(),"Should Exist":true,"Position":/3/.toString())
        //Configure Single Scale Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureSingleScaleStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/New Step/.toString(),"Individual Assignment User":/End User,Evaluator/.toString(),"Individual Assignment User Add or Remove":/Remove,Add/.toString(),"Action":/Update/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Duplicate/.toString(),"Area to Navigate to":/Home/.toString())
        //Set Navigation Options in Dynamic Nav Bar
        new actions.WebstormHomepage.SetNavigationOptionsinDynamicNavBar().run("Nav Parent Title":/dupsub4/.toString())
        //Verify Stage in Pipeline Steps View
        new actions.PipelineStepsView.VerifyStageInPipelineStepsView().run("Stage Name":/Selection/.toString(),"Background Color in RGB":/rgb(240, 240, 240)/.toString(),"Should Exist":true,"Position":/3/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/dupsub4/.toString(),"Area to Navigate to":/Home/.toString())
        //Verify Homepage Header 2
        new actions.WebstormHomepage.VerifyHomepageHeader2().run("Title":/dupsub4/.toString(),"Preset Image":/\/CORE\/IMAGES\/apps_v3\/timeboxed_builder_header.png/.toString(),"Submit Displayed":true,"Browse Displayed":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Duplicate/.toString(),"Area to Navigate to":/Home/.toString())
        //Set Navigation Options in Dynamic Nav Bar
        new actions.WebstormHomepage.SetNavigationOptionsinDynamicNavBar().run("Nav Parent Title":/dupsub5/.toString())
        //Verify Stage in Pipeline Steps View
        new actions.PipelineStepsView.VerifyStageInPipelineStepsView().run("Stage Name":/Selection/.toString(),"Background Color in RGB":/rgb(240, 240, 240)/.toString(),"Should Exist":true,"Position":/3/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/dupsub5/.toString(),"Area to Navigate to":/Home/.toString())
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