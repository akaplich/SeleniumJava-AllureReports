import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132136 - Stage and Gate > Idea moved to multiple folders
class C132136_StageandGate_Ideamovedtomultiplefolders
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Unlimited Brightidea Administrator License Type":/1/.toString(),"Unlimited Idea Box Manager License Type":/1/.toString(),"Run Browser in Incognito":/TRUE/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString(),"My Ideas":true,"User Metrics My Ideas":true,"User Metrics Submissions":true,"User Metrics Activities":true,"User Metrics Submission Views":true,"User Metrics Collaborators":true,"User Metrics Projects":true,"User Metrics Business Impact":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Project Room - Create Project Room
        new actions.ProjectRoom.ProjectRoomCreateProjectRoom().run([:])
        //Set and Verify Project Room Title
        new actions.ProjectRoom.SetProjectRoomTitle().run("Title":/Testing project room/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Stage/.toString())
        //Set Stage or Gate Name in Project Room
        new actions.ProjectRoom.SetStageorGateNameinProjectRoom().run("Stage or Gate Name":/stage1/.toString(),"Action":/Add Stage/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Gate/.toString())
        //Set Stage or Gate Name in Project Room
        new actions.ProjectRoom.SetStageorGateNameinProjectRoom().run("Stage or Gate Name":/gate1/.toString(),"Action":/Add Gate/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Gate/.toString())
        //Set Stage or Gate Name in Project Room
        new actions.ProjectRoom.SetStageorGateNameinProjectRoom().run("Stage or Gate Name":/gate2/.toString(),"Action":/Add Gate/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Select Product in Apps Pillar Page
        new actions.AppsPillar.SelectProductinAppsPillarPage().run("Product":/Labs/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Incubate/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Incubate title/.toString(),"Description":/Incubate description/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Incubate title/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Create Step in Pipeline Steps page
        new actions.PipelineStepsView.CreateStepinPipelineStepspage().run("Step Name":/Stage step1/.toString(),"Select Tool Type":/Stage/.toString(),"Select Stage":/Prototype/.toString(),"Action":/Create/.toString())
        //Configure Stage Process Step in Pipeline Steps Page
        new actions.PipelineStepsConfigure.ConfigureStageProcessStepinPipelineStepsPage().run("Stage Lead":/Idea Submitter/.toString(),"Stage Team Add or Remove":/Add/.toString(),"Project Room Template":/Testing project room/.toString(),"Action":/Activate/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/1/.toString())
        //Set Project Room Templates for Stage Gate or Onboarding
        new actions.PipelineSetup.SetProjectRoomTemplates().run("Tab":/Stage Gate/.toString(),"Template Name":/Testing project room/.toString(),"Action":/Select Project Room/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/0/.toString())
        //Configure Stage Process Step in Pipeline Steps Page
        new actions.PipelineStepsConfigure.ConfigureStageProcessStepinPipelineStepsPage().run("Click on Refresh":true,"Folder mapping":/stage1/.toString(),"Folder Mapping Placement Number":/1/.toString(),"Action":/Activate/.toString())
        //Create Step in Pipeline Steps page
        new actions.PipelineStepsView.CreateStepinPipelineStepspage().run("Step Name":/Gate Step1/.toString(),"Select Tool Type":/Gate Approval/.toString(),"Select Stage":/Prototype/.toString(),"Action":/Create/.toString())
        //Configure Gate Approval Step in Pipeline Steps Page
        new actions.PipelineStepsConfigure.ConfigureGateApprovalStepinPipelineStepsPage().run("Assignment Method":/Individual Assignment/.toString(),"Gate Lead":/Idea Submitter/.toString(),"Gate Mapping":/gate1/.toString(),"Gate Mapping Placement Number":/1/.toString(),"Scorecard Template":/Gate - Default Scorecard/.toString(),"Action":/Activate/.toString())
        //Create Step in Pipeline Steps page
        new actions.PipelineStepsView.CreateStepinPipelineStepspage().run("Step Name":/Gate Step2/.toString(),"Select Tool Type":/Gate Approval/.toString(),"Select Stage":/Prototype/.toString(),"Action":/Create/.toString())
        //Configure Gate Approval Step in Pipeline Steps Page
        new actions.PipelineStepsConfigure.ConfigureGateApprovalStepinPipelineStepsPage().run("Assignment Method":/Individual Assignment/.toString(),"Gate Lead":/Idea Submitter/.toString(),"Gate Mapping":/gate2/.toString(),"Scorecard Template":/Gate - Default Scorecard/.toString(),"Action":/Activate/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/stage gate idea1/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/stage gate idea1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Stage step1/.toString(),"Action":/Change Step/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/120/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Incubate title/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/stage gate idea1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Gate Step1/.toString(),"Action":/Change Step/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/stage gate idea1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Gate Step2/.toString(),"Action":/Change Step/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/120/.toString())
        //Access Idea in Pipeline Steps View
        new actions.PipelineStepsView.AccessIdeainPipelineStepsView().run("Idea Name":/stage gate idea1/.toString())
        //Set and Verify Project Room In View Idea 3
        new actions.ViewIdea30.SetandVerifyProjectRoomInViewIdea3().run("Project Room Title":/stage gate idea1/.toString(),"Number of Matches":/1/.toString())
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Close Idea Modal":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Verify and Access Project Room Card in Userhome
        new actions.ProjectRoom.VerifyProjectRoomCard().run("Title":/stage gate idea1/.toString(),"Member count":/1/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString(),"Access Project Room":true)
        //Verify Folder Or Room Page In Project Room in Root Folder
        new actions.ProjectRoom.VerifyFolderOrRoomPageInProjectRoom().run("Placement Number of Child Page or Folder":/2/.toString(),"Child Page or Folder":/stage1/.toString(),"Number of Matches":/1/.toString())
        //Verify Folder Or Room Page In Project Room in Root Folder
        new actions.ProjectRoom.VerifyFolderOrRoomPageInProjectRoom().run("Placement Number of Parent Page or Folder":/2/.toString(),"Placement Number of Child Page or Folder":/1/.toString(),"Parent Folder Name":/stage1/.toString(),"Child Page or Folder":/stage gate idea1/.toString(),"Number of Matches":/0/.toString())
        //Verify Folder Or Room Page In Project Room in Root Folder
        new actions.ProjectRoom.VerifyFolderOrRoomPageInProjectRoom().run("Placement Number of Parent Page or Folder":/3/.toString(),"Placement Number of Child Page or Folder":/1/.toString(),"Parent Folder Name":/gate1/.toString(),"Child Page or Folder":/stage gate idea1/.toString(),"Number of Matches":/0/.toString())
        //Verify Folder Or Room Page In Project Room in Root Folder
        new actions.ProjectRoom.VerifyFolderOrRoomPageInProjectRoom().run("Placement Number of Child Page or Folder":/3/.toString(),"Child Page or Folder":/gate1/.toString(),"Number of Matches":/1/.toString())
        //Verify Folder Or Room Page In Project Room in Root Folder
        new actions.ProjectRoom.VerifyFolderOrRoomPageInProjectRoom().run("Placement Number of Parent Page or Folder":/4/.toString(),"Placement Number of Child Page or Folder":/1/.toString(),"Parent Folder Name":/gate2/.toString(),"Child Page or Folder":/stage gate idea1/.toString(),"Number of Matches":/1/.toString())
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
    @AfterMethod
    public void afterState(){
        //Afterstate
        Action581259c8fa4ee77809f46905([:])
    }
}