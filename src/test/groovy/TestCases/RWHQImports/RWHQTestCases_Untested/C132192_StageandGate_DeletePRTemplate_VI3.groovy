package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C132192 - Stage and Gate > Delete PR Template >VI3
class C132192_StageandGate_DeletePRTemplate_VI3
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
        //Set Enterprise Setup Site General Settings Page
        new actions.SetupSite.SetEnterpriseSetupSiteComponentsPage().run("Enable Date Formatting":true,"Date Format":/mm-dd-yy/.toString())
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
        new actions.ProjectRoom.SetProjectRoomTitle().run("Title":/project room template to be deleted/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Stage/.toString())
        //Set Stage or Gate Name in Project Room
        new actions.ProjectRoom.SetStageorGateNameinProjectRoom().run("Stage or Gate Name":/stage1/.toString(),"Action":/Add Stage/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Gate/.toString())
        //Set Stage or Gate Name in Project Room
        new actions.ProjectRoom.SetStageorGateNameinProjectRoom().run("Stage or Gate Name":/gate1/.toString(),"Action":/Add Gate/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Innovation Process/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Incubate title/.toString(),"Description":/Incubate description/.toString(),"Project Room":/project room template to be deleted/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"General Access":/ALL/.toString(),"General Access Add or Remove":/Add/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Incubate title/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Create Step in Pipeline Steps page
        new actions.PipelineStepsView.CreateStepinPipelineStepspage().run("Step Name":/Stage step1/.toString(),"Select Tool Type":/Stage/.toString(),"Select Stage":/Stage 1: Scope/.toString(),"Action":/Create/.toString())
        //Configure Stage Process Step in Pipeline Steps Page
        new actions.PipelineStepsConfigure.ConfigureStageProcessStepinPipelineStepsPage().run("Assignment Method":/Individual Assignment/.toString(),"Stage Lead":/Select a user/.toString(),"Selected user":/Evaluator/.toString(),"Selected Users Add or Remove":/Add/.toString(),"Folder mapping":/stage1/.toString(),"Folder Mapping Placement Number":/1/.toString(),"Action":/Activate/.toString())
        //Create Step in Pipeline Steps page
        new actions.PipelineStepsView.CreateStepinPipelineStepspage().run("Step Name":/Gate Step1/.toString(),"Select Tool Type":/Gate Approval/.toString(),"Select Stage":/Stage 1: Scope/.toString(),"Action":/Create/.toString())
        //Configure Gate Approval Step in Pipeline Steps Page
        new actions.PipelineStepsConfigure.ConfigureGateApprovalStepinPipelineStepsPage().run("Assignment Method":/Individual Assignment/.toString(),"Gate Lead":/Select a user/.toString(),"Selected user":/Evaluator/.toString(),"Selected Users Add or Remove":/Add/.toString(),"Gate Mapping":/gate1/.toString(),"Gate Mapping Placement Number":/1/.toString(),"Scorecard Template":/Gate - Default Scorecard/.toString(),"Action":/Activate/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/open action item idea1/.toString(),"Action":/Submit/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/completed action item idea1/.toString(),"Action":/Submit/.toString())
        //Select Multiple Ideas in Pipeline Steps
        new actions.PipelineStepsView.SelectMultipleIdeasinPipelineSteps().run("Idea Names":["open action item idea1","completed action item idea1"])
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Stage step1/.toString(),"Action":/Change Step/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/180/.toString())
        //Select Multiple Ideas in Pipeline Steps
        new actions.PipelineStepsView.SelectMultipleIdeasinPipelineSteps().run("Idea Names":["open action item idea1","completed action item idea1"])
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Gate Step1/.toString(),"Action":/Change Step/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Verify and Access Project Room Card in Userhome
        new actions.ProjectRoom.VerifyProjectRoomCard().run("Title":/completed action item idea1/.toString(),"Number of Matches":/1/.toString(),"Access Project Room":true)
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Room Item":/stage1/.toString())
        //Set Stage Process Action Item
        new actions.ProjectRoom.SetStageProcessActionItem().run("Action on Submit stage action item":/Submit Stage/.toString())
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/completed action item idea1/.toString(),"Message":/You have been assigned a Gate action item for/.toString(),"Pipeline Name":/Incubate title/.toString(),"Number of Matches":/1/.toString(),"Click on Action Item":true)
        //Set Default Gate Approval Action Item
        new actions.ProjectRoom.SetGateApprovalActionItem().run("How aligned is this to our core mission and strategy?":/Not at all aligned/.toString(),"Do the project benefits outweigh the cost and risks introduced?":/Yes/.toString(),"How complete is the project investigation at this point?":/Somewhat complete/.toString(),"Overall, should this project be considered for the next planning session?":/No/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Set Action Menu on Project Room Card
        new actions.ProjectRoom.SetActionMenuonProjectRoomCard().run("Project Room Title":/project room template to be deleted/.toString(),"Option":/Delete.../.toString())
        //Set Action Menu on Project Room Card
        new actions.ProjectRoom.SetActionMenuonProjectRoomCard().run("Delete Action":/Delete/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Incubate title/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/completed action item idea1/.toString())
        //Return Todays or Other Date in the Requested Format
        variables."date" = new actions.Utils.ReturnTodaysDateintheRequestedFormat().run("Format":/MM-dd-yy/.toString())
        //Set Action Item Tab in View Idea 3
        new actions.ViewIdea30.SetActionItemTabinViewIdea3().run("Tab":/Completed/.toString())
        //Set and Verify Stage and Gate Action Item in View Idea 3
        new actions.ViewIdea30.SetandVerifyStageandGateActionIteminViewIdea3().run("Stage or Gate action item":/Stage/.toString(),"Completed Message":/Completed on ${variables."date"}/.toString(),"Click on link on Completed Tab":true)
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/1/.toString())
        //Verify Stage Process or Gate Approval Action Item
        new actions.ProjectRoom.VerifyStageProcessActionItem().run("Stage or Gate Name":/stage1/.toString(),"Stage Heading":/Stage action item has been completed by Evaluator on ${variables."date"}./.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Incubate title/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/completed action item idea1/.toString())
        //Set Action Item Tab in View Idea 3
        new actions.ViewIdea30.SetActionItemTabinViewIdea3().run("Tab":/Completed/.toString())
        //Set and Verify Stage and Gate Action Item in View Idea 3
        new actions.ViewIdea30.SetandVerifyStageandGateActionIteminViewIdea3().run("Stage or Gate action item":/Gate Approval/.toString(),"Completed Message":/Completed on ${variables."date"}/.toString(),"Click on link on Completed Tab":true)
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/2/.toString())
        //Verify Stage Process or Gate Approval Action Item
        new actions.ProjectRoom.VerifyStageProcessActionItem().run("Stage or Gate Name":/gate1/.toString(),"Stage Heading":/Gate review has been completed by Evaluator on ${variables."date"}./.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Incubate title/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/open action item idea1/.toString())
        //Set and Verify Stage and Gate Action Item in View Idea 3
        new actions.ViewIdea30.SetandVerifyStageandGateActionIteminViewIdea3().run("Stage or Gate action item":/Stage/.toString(),"Click on button":true)
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/3/.toString())
        //Verify Stage Process or Gate Approval Action Item
        new actions.ProjectRoom.VerifyStageProcessActionItem().run("Stage or Gate Name":/stage1/.toString(),"Stage Heading":/Stage is due in/.toString(),"Stage or Gate Review Assigned To":/Evaluator/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Incubate title/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/open action item idea1/.toString())
        //Set and Verify Stage and Gate Action Item in View Idea 3
        new actions.ViewIdea30.SetandVerifyStageandGateActionIteminViewIdea3().run("Stage or Gate action item":/Gate Approval/.toString(),"Click on button":true)
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/4/.toString())
        //Set Default Gate Approval Action Item
        new actions.ProjectRoom.SetGateApprovalActionItem().run("How aligned is this to our core mission and strategy?":/Not at all aligned/.toString(),"Do the project benefits outweigh the cost and risks introduced?":/Yes/.toString(),"How complete is the project investigation at this point?":/Somewhat complete/.toString(),"Overall, should this project be considered for the next planning session?":/No/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Scorecard succesfully submitted/.toString(),"Should Exist":true)
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