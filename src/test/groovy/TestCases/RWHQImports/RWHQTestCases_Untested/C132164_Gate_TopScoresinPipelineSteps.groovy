package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132164 - Gate > Top Scores in Pipeline Steps
class C132164_Gate_TopScoresinPipelineSteps
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
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString(),"Activities":true,"My Ideas":true,"Submissions":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Project Room - Create Project Room
        new actions.ProjectRoom.ProjectRoomCreateProjectRoom().run([:])
        //Set and Verify Project Room Title
        new actions.ProjectRoom.SetProjectRoomTitle().run("Title":/Template PR/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Gate/.toString())
        //Set Stage or Gate Name in Project Room
        new actions.ProjectRoom.SetStageorGateNameinProjectRoom().run("Stage or Gate Name":/gate1/.toString(),"Action":/Add Gate/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Select Product in Apps Pillar Page
        new actions.AppsPillar.SelectProductinAppsPillarPage().run("Product":/Ecosystem/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Accelerate/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Accelerate title/.toString(),"Description":/Accelerate description/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Admin Field Name":/Pipeline Administrators/.toString(),"Pipeline Administrators":/Pipeline Admin/.toString(),"Administrators Add or Remove":/Add/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Accelerate title/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Create Step in Pipeline Steps page
        new actions.PipelineStepsView.CreateStepinPipelineStepspage().run("Step Name":/gate for testing/.toString(),"Select Tool Type":/Gate Approval/.toString(),"Action":/Create/.toString())
        //Configure Gate Approval Step in Pipeline Steps Page
        new actions.PipelineStepsConfigure.ConfigureGateApprovalStepinPipelineStepsPage().run("Assignment Method":/Individual Assignment/.toString(),"Gate Lead":/Select a user/.toString(),"Gate Team":/End User,Pipeline Admin/.toString(),"Gate Team Add or Remove":/Add,Add/.toString(),"Selected user":/Evaluator/.toString(),"Selected Users Add or Remove":/Add/.toString(),"Project Room Template":/Template PR/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/1/.toString())
        //Set Project Room Templates for Stage Gate or Onboarding
        new actions.PipelineSetup.SetProjectRoomTemplates().run("Tab":/Stage Gate/.toString(),"Template Name":/Template PR/.toString(),"Action":/Select Project Room/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/0/.toString())
        //Configure Gate Approval Step in Pipeline Steps Page
        new actions.PipelineStepsConfigure.ConfigureGateApprovalStepinPipelineStepsPage().run("Click on Refresh":true,"Gate Mapping":/gate1/.toString(),"Scorecard Template":/Pitch - Proposal Evaluation/.toString(),"Action":/Activate/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/idea1/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/idea1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/gate for testing/.toString(),"Action":/Change Step/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/idea2/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/idea2/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/gate for testing/.toString(),"Action":/Change Step/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Verify and Access Project Room Card in Userhome
        new actions.ProjectRoom.VerifyProjectRoomCard().run("Title":/idea2/.toString(),"Access Project Room":true)
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Room Item":/gate1/.toString())
        //Set Custom Gate Approval Action Item
        new actions.ProjectRoom.SetCustomGateApprovalActionItem().run("Dropdown - Question":/The proposal is aligned with our strategy and objectives./.toString(),"Dropdown - Answer(s)":/Agree/.toString())
        //Set Custom Gate Approval Action Item
        new actions.ProjectRoom.SetCustomGateApprovalActionItem().run("Dropdown - Question":/The market\/customer need is well-defined and significant./.toString(),"Dropdown - Answer(s)":/Agree/.toString())
        //Set Custom Gate Approval Action Item
        new actions.ProjectRoom.SetCustomGateApprovalActionItem().run("Dropdown - Question":/The market opportunity is compelling and warrants further investigation\/development of this proposal/.toString(),"Dropdown - Answer(s)":/Agree/.toString())
        //Set Custom Gate Approval Action Item
        new actions.ProjectRoom.SetCustomGateApprovalActionItem().run("Dropdown - Question":/The proposal is feasible\/viable and has a potential to scale as a business./.toString(),"Dropdown - Answer(s)":/Agree/.toString())
        //Set Custom Gate Approval Action Item
        new actions.ProjectRoom.SetCustomGateApprovalActionItem().run("Dropdown - Question":/Our company is well suited to develop and deliver the product or service/.toString(),"Dropdown - Answer(s)":/Agree/.toString())
        //Set Custom Gate Approval Action Item
        new actions.ProjectRoom.SetCustomGateApprovalActionItem().run("Dropdown - Question":/The product or service would be unique for our company/.toString(),"Dropdown - Answer(s)":/Agree/.toString())
        //Set Custom Gate Approval Action Item
        new actions.ProjectRoom.SetCustomGateApprovalActionItem().run("Dropdown - Question":/The product or service would be unique for the industry or market/.toString(),"Dropdown - Answer(s)":/Agree/.toString())
        //Set Custom Gate Approval Action Item
        new actions.ProjectRoom.SetCustomGateApprovalActionItem().run("Dropdown - Question":/The risks are well-defined and surmountable./.toString(),"Dropdown - Answer(s)":/Agree/.toString(),"Submit Action Item":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/pipelineadmin@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Verify and Access Project Room Card in Userhome
        new actions.ProjectRoom.VerifyProjectRoomCard().run("Title":/idea2/.toString(),"Access Project Room":true)
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Room Item":/gate1/.toString())
        //Set Custom Gate Approval Action Item
        new actions.ProjectRoom.SetCustomGateApprovalActionItem().run("Dropdown - Question":/The proposal is aligned with our strategy and objectives./.toString(),"Dropdown - Answer(s)":/Agree/.toString())
        //Set Custom Gate Approval Action Item
        new actions.ProjectRoom.SetCustomGateApprovalActionItem().run("Dropdown - Question":/The market\/customer need is well-defined and significant./.toString(),"Dropdown - Answer(s)":/Agree/.toString())
        //Set Custom Gate Approval Action Item
        new actions.ProjectRoom.SetCustomGateApprovalActionItem().run("Dropdown - Question":/The market opportunity is compelling and warrants further investigation\/development of this proposal/.toString(),"Dropdown - Answer(s)":/Agree/.toString())
        //Set Custom Gate Approval Action Item
        new actions.ProjectRoom.SetCustomGateApprovalActionItem().run("Dropdown - Question":/The proposal is feasible\/viable and has a potential to scale as a business./.toString(),"Dropdown - Answer(s)":/Agree/.toString())
        //Set Custom Gate Approval Action Item
        new actions.ProjectRoom.SetCustomGateApprovalActionItem().run("Dropdown - Question":/Our company is well suited to develop and deliver the product or service/.toString(),"Dropdown - Answer(s)":/Agree/.toString())
        //Set Custom Gate Approval Action Item
        new actions.ProjectRoom.SetCustomGateApprovalActionItem().run("Dropdown - Question":/The product or service would be unique for our company/.toString(),"Dropdown - Answer(s)":/Agree/.toString())
        //Set Custom Gate Approval Action Item
        new actions.ProjectRoom.SetCustomGateApprovalActionItem().run("Dropdown - Question":/The product or service would be unique for the industry or market/.toString(),"Dropdown - Answer(s)":/Agree/.toString())
        //Set Custom Gate Approval Action Item
        new actions.ProjectRoom.SetCustomGateApprovalActionItem().run("Dropdown - Question":/The risks are well-defined and surmountable./.toString(),"Dropdown - Answer(s)":/Agree/.toString(),"Submit Action Item":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Verify and Access Project Room Card in Userhome
        new actions.ProjectRoom.VerifyProjectRoomCard().run("Title":/idea1/.toString(),"Access Project Room":true)
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Room Item":/gate1/.toString())
        //Set Custom Gate Approval Action Item
        new actions.ProjectRoom.SetCustomGateApprovalActionItem().run("Dropdown - Question":/The proposal is aligned with our strategy and objectives./.toString(),"Dropdown - Answer(s)":/Disagree/.toString())
        //Set Custom Gate Approval Action Item
        new actions.ProjectRoom.SetCustomGateApprovalActionItem().run("Dropdown - Question":/The market\/customer need is well-defined and significant./.toString(),"Dropdown - Answer(s)":/Disagree/.toString())
        //Set Custom Gate Approval Action Item
        new actions.ProjectRoom.SetCustomGateApprovalActionItem().run("Dropdown - Question":/The market opportunity is compelling and warrants further investigation\/development of this proposal/.toString(),"Dropdown - Answer(s)":/Neutral/.toString())
        //Set Custom Gate Approval Action Item
        new actions.ProjectRoom.SetCustomGateApprovalActionItem().run("Dropdown - Question":/The proposal is feasible\/viable and has a potential to scale as a business./.toString(),"Dropdown - Answer(s)":/Agree/.toString())
        //Set Custom Gate Approval Action Item
        new actions.ProjectRoom.SetCustomGateApprovalActionItem().run("Dropdown - Question":/Our company is well suited to develop and deliver the product or service/.toString(),"Dropdown - Answer(s)":/Agree/.toString())
        //Set Custom Gate Approval Action Item
        new actions.ProjectRoom.SetCustomGateApprovalActionItem().run("Dropdown - Question":/The product or service would be unique for our company/.toString(),"Dropdown - Answer(s)":/Strongly agree/.toString())
        //Set Custom Gate Approval Action Item
        new actions.ProjectRoom.SetCustomGateApprovalActionItem().run("Dropdown - Question":/The product or service would be unique for the industry or market/.toString(),"Dropdown - Answer(s)":/Strongly agree/.toString())
        //Set Custom Gate Approval Action Item
        new actions.ProjectRoom.SetCustomGateApprovalActionItem().run("Dropdown - Question":/The risks are well-defined and surmountable./.toString(),"Dropdown - Answer(s)":/Strongly disagree/.toString(),"Submit Action Item":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Accelerate title/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Verify Step Results in Steps View page
        new actions.PipelineStepsView.VerifyStepResultsinStepsViewpage().run("Step Name":/gate for testing/.toString(),"Idea Name":/idea1/.toString(),"Score":/56.3/.toString(),"Number of Matches":/1/.toString())
        //Verify Step Results in Steps View page
        new actions.PipelineStepsView.VerifyStepResultsinStepsViewpage().run("Step Name":/gate for testing/.toString(),"Idea Name":/idea2/.toString(),"Score":/75.0/.toString(),"Number of Matches":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Accelerate title/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Site Setup Ideas for Top Ideas
        new actions.SetupIdeas.SetSiteSetupIdeasforTopIdeas().run("Top Ideas by Category":true)
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Accelerate title/.toString(),"Area to Navigate to":/Top Ideas/.toString())
        //Set Sort in Top Ideas
        new actions.PipelineTopIdeas.SetSortInTopIdeas().run("Sort By":/gate for testing (Gate Approval)/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/idea1/.toString(),"Stack Name Memo belongs to":/Quick Add/.toString(),"Score":/56.3/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/idea2/.toString(),"Stack Name Memo belongs to":/Quick Add/.toString(),"Score":/75.0/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
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