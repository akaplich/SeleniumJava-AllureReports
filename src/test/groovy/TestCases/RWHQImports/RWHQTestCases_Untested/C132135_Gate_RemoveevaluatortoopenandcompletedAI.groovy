import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132135 - Gate > Remove evaluator to open and completed AI
class C132135_Gate_RemoveevaluatortoopenandcompletedAI
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
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString(),"My Ideas":true,"User Metrics My Ideas":true,"User Metrics Submissions":true,"User Metrics Activities":true,"User Metrics Submission Views":true,"User Metrics Collaborators":true,"User Metrics Projects":true,"User Metrics Business Impact":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Select Product in Apps Pillar Page
        new actions.AppsPillar.SelectProductinAppsPillarPage().run("Product":/Labs/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Incubate/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Incubate title/.toString(),"Description":/Incubate description/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Delete this when stage and gate and custom template feature is enabled for everyone
        Action65cff68cd202e7e940131a38("Initiative":/Incubate title/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Incubate title/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Edit Step in Pipeline Steps page
        new actions.PipelineStepsView.EditStepinPipelineStepspage().run("Step to Edit":/Research Development/.toString(),"Step Name":/Research Gate/.toString(),"Tool Type":/Gate Approval/.toString(),"Action":/Save/.toString())
        //Configure Gate Approval Step in Pipeline Steps Page
        new actions.PipelineStepsConfigure.ConfigureGateApprovalStepinPipelineStepsPage().run("Assignment Method":/Individual Assignment/.toString(),"Gate Lead":/Me/.toString(),"Gate Team":/Pipeline Admin,Evaluator/.toString(),"Gate Team Add or Remove":/Add,Add/.toString(),"Project Room Template":/General, Stage Gate Process (system default)/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/1/.toString())
        //Set Project Room Templates for Stage Gate or Onboarding
        new actions.PipelineSetup.SetProjectRoomTemplates().run("Tab":/Stage Gate/.toString(),"Template Name":/General, Stage Gate Process (system default)/.toString(),"Action":/Select Project Room/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/0/.toString())
        //Configure Gate Approval Step in Pipeline Steps Page
        new actions.PipelineStepsConfigure.ConfigureGateApprovalStepinPipelineStepsPage().run("Click on Refresh":true,"Gate Mapping":/Gate 0/.toString(),"Action":/Activate/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/idea1 open/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/idea1 open/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Research Gate/.toString(),"Action":/Change Step/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/idea1 completed/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/idea1 completed/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Research Gate/.toString(),"Action":/Change Step/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/120/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/pipelineadmin@test.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/idea1 completed/.toString(),"Message":/You have been assigned a Gate action item for/.toString(),"Click on Action Item":true)
        //Set Default Gate Approval Action Item
        new actions.ProjectRoom.SetGateApprovalActionItem().run("How aligned is this to our core mission and strategy?":/Not at all aligned/.toString(),"Do the project benefits outweigh the cost and risks introduced?":/No/.toString(),"How complete is the project investigation at this point?":/Somewhat complete/.toString(),"Overall, should this project be considered for the next planning session?":/Yes/.toString(),"Do you have any additional notes for the team?":/helloooo/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Incubate title/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Gate Approval Step in Pipeline Steps Page
        new actions.PipelineStepsConfigure.ConfigureGateApprovalStepinPipelineStepsPage().run("Step Name to Configure (optional)":/Research Gate/.toString(),"Assignment Method":/Individual Assignment/.toString(),"Gate Team":/Pipeline Admin/.toString(),"Gate Team Add or Remove":/Remove/.toString(),"Action":/Update/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/idea1 completed/.toString(),"Message":/You have been assigned a Gate action item for/.toString(),"Pipeline Name":/Incubate title/.toString(),"Number of Matches":/1/.toString(),"Click on Action Item":true)
        //Return Todays or Other Date in the Requested Format
        variables."date" = new actions.Utils.ReturnTodaysDateintheRequestedFormat().run("Format":/MM\/dd\/yyyy/.toString())
        //Verify Stage Process or Gate Approval Action Item
        new actions.ProjectRoom.VerifyStageProcessActionItem().run("Stage or Gate Name":/Gate 0/.toString(),"Stage Heading":/Gate is due in,Gate review has been completed by Pipeline Admin on ${variables."date"}./.toString(),"Stage or Gate Review Assigned To":/Evaluator,Pipeline Admin/.toString(),"Items Within Stage":/idea1 completed/.toString())
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Top Link":/Project Room Settings/.toString())
        //Set Tab in Room Settings in Project Room
        new actions.ProjectRoom.SetTabinRoomSettingsinProjectRoom().run("Tab":/Members/.toString())
        //Verify Project Room Member in Members Tab
        new actions.ProjectRoom.VerifyProjectRoomMemberinMembersTab().run("Member Name":/Evaluator/.toString(),"Type of Member":/team member/.toString(),"Number of Matches":/1/.toString())
        //Verify Project Room Member in Members Tab
        new actions.ProjectRoom.VerifyProjectRoomMemberinMembersTab().run("Member Name":/Pipeline Admin/.toString(),"Type of Member":/owner/.toString(),"Number of Matches":/1/.toString())
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/idea1 open/.toString(),"Message":/You have been assigned a Gate action item for/.toString(),"Pipeline Name":/Incubate title/.toString(),"Number of Matches":/1/.toString(),"Click on Action Item":true)
        //Verify Stage Process or Gate Approval Action Item
        new actions.ProjectRoom.VerifyStageProcessActionItem().run("Stage or Gate Name":/Gate 0/.toString(),"Stage Heading":/Gate is due in,/.toString(),"Stage or Gate Review Assigned To":/Evaluator,Pipeline Admin/.toString(),"Items Within Stage":/idea1 open/.toString())
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Top Link":/Project Room Settings/.toString())
        //Set Tab in Room Settings in Project Room
        new actions.ProjectRoom.SetTabinRoomSettingsinProjectRoom().run("Tab":/Members/.toString())
        //Verify Project Room Member in Members Tab
        new actions.ProjectRoom.VerifyProjectRoomMemberinMembersTab().run("Member Name":/Evaluator/.toString(),"Type of Member":/team member/.toString(),"Number of Matches":/1/.toString())
        //Verify Project Room Member in Members Tab
        new actions.ProjectRoom.VerifyProjectRoomMemberinMembersTab().run("Member Name":/Pipeline Admin/.toString(),"Type of Member":/owner/.toString(),"Number of Matches":/1/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/pipelineadmin@test.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/idea1 open/.toString(),"Message":/You have been assigned a Gate action item for/.toString(),"Pipeline Name":/Incubate title/.toString(),"Number of Matches":/1/.toString(),"Click on Action Item":true)
        //Verify Stage Process or Gate Approval Action Item
        new actions.ProjectRoom.VerifyStageProcessActionItem().run("Stage or Gate Name":/Gate 0/.toString(),"Stage Heading":/Gate is due in,/.toString(),"Stage or Gate Review Assigned To":/Evaluator,Pipeline Admin/.toString(),"Items Within Stage":/idea1 open/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Verify and Access Project Room Card in Userhome
        new actions.ProjectRoom.VerifyProjectRoomCard().run("Title":/idea1 completed/.toString(),"Member count":/3/.toString(),"Placement Number":/1/.toString(),"Access Project Room":true)
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Room Item":/Gate 0/.toString())
        //Verify Stage Process or Gate Approval Action Item
        new actions.ProjectRoom.VerifyStageProcessActionItem().run("Stage or Gate Name":/Gate 0/.toString(),"Stage Heading":/Gate review has been completed by Pipeline Admin on ${variables."date"}./.toString(),"Stage or Gate Review Assigned To":/Evaluator,Pipeline Admin/.toString(),"Items Within Stage":/idea1 completed/.toString())
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
    //Delete this when stage and gate and custom template feature is enabled for everyone
    public static def Action65cff68cd202e7e940131a38(def params){
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for Beta tab
        new actions.SetupBeta.SetEnterpriseSetupforBetatab().run("Stage Gate Action Item":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for BIOnly Beta tab
        new actions.SetupBI.SetEnterpriseSetupforBIOnlyBetatab().run("Fall Stage Gate Updates":true,"Advanced Quick Add":true)
        try{
            //Navigate WebStorm or MTS
            new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/${params."Initiative"}/.toString(),"Area to Navigate to":/Setup/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Set Site Setup for BI Beta tab
            new actions.SetupBI.SetSiteSetupforBIBetatab().run("Stage Gate Workflow":true)
        }
       catch(all){}catch(Error err){}

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