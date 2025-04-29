package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132161 Gate > Floating Modal
class C132161Gate_FloatingModal
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
        //Set Enterprise Setup Site General Settings Page
        new actions.SetupSite.SetEnterpriseSetupSiteComponentsPage().run("Enable Date Formatting":true,"Date Format":/mm-dd-yy/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString(),"My Ideas":true,"User Metrics My Ideas":true,"User Metrics Submissions":true,"User Metrics Activities":true,"User Metrics Submission Views":true,"User Metrics Collaborators":true,"User Metrics Projects":true,"User Metrics Business Impact":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Innovation Process/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Innovation Process/.toString(),"Description":/Innovation Process/.toString(),"Project Room":/General, Stage Gate Process (system default)/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"General Access":/ALL/.toString(),"General Access Add or Remove":/Add/.toString(),"Admin Field Name":/Pipeline Administrators/.toString(),"Pipeline Administrators":/Pipeline Admin/.toString(),"Administrators Add or Remove":/Add/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Innovation Process/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Gate Approval Step in Pipeline Steps Page
        new actions.PipelineStepsConfigure.ConfigureGateApprovalStepinPipelineStepsPage().run("Step Name to Configure (optional)":/🔷 Gate 1/.toString(),"Assignment Method":/Category Assignment/.toString(),"Gate Lead Category":/New Product,Process Improvement,Marketing & Branding,Strategy,Quick Add\/New Categories/.toString(),"Gate Lead":/Select a user,Select a user,Select a user,Select a user,Select a user/.toString(),"Gate Team Category":/New Product,Process Improvement,Marketing & Branding,Strategy,Quick Add\/New Categories,Quick Add\/New Categories/.toString(),"Gate Team":/End User,Evaluator,End User,Evaluator,End User,Moderator/.toString(),"Gate Team Add or Remove":/Add,Add,Add,Add,Add,Add/.toString(),"Selected user":/End User 2,End User 2,End User 2,End User 2,Pipeline Admin/.toString(),"Selected Users Add or Remove":/Add,Add,Add,Add,Add/.toString(),"Gate Mapping":/Gate 2/.toString(),"Due Date":/15/.toString(),"Action":/Activate/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/idea with floating modal gate/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/idea with floating modal gate/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/🔷 Gate 1/.toString(),"Action":/Change Step/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/pipelineadmin@test.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Verify and Access Project Room Card in Userhome
        new actions.ProjectRoom.VerifyProjectRoomCard().run("Title":/idea with floating modal gate/.toString(),"Color of the Project Room Icon":/rgb(231, 76, 60)/.toString(),"Updated By":/Pipeline Admin/.toString(),"Member count":/3/.toString(),"Total Objects":/26/.toString(),"Total Tasks":/8/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString(),"Access Project Room":true)
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Room Item":/Gate 2/.toString())
        //Set Floating Modal For Default Template in Project Room
        new actions.ProjectRoom.SetFloatingModalForDefaultTemplateinProjectRoom().run("Click on Floating Button":true)
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Room Item":/Gate 0/.toString())
        //Return Date in Requested Format
        variables."date" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/15/.toString(),"Format":/MM-dd-yy/.toString())
        //Verify Floating Modal in Gate Action Item
        new actions.ProjectRoom.VerifyFloatingModalinGateActionItem().run("Due Date":/${variables."date"}/.toString(),"Collapse or Expand":/Expand/.toString())
        //Set Floating Modal For Default Template in Project Room
        new actions.ProjectRoom.SetFloatingModalForDefaultTemplateinProjectRoom().run("Expand or Collapse":/Collapse/.toString())
        //Verify Floating Modal in Gate Action Item
        new actions.ProjectRoom.VerifyFloatingModalinGateActionItem().run("Collapse or Expand":/Collapse/.toString())
        //Set Floating Modal For Default Template in Project Room
        new actions.ProjectRoom.SetFloatingModalForDefaultTemplateinProjectRoom().run("Expand or Collapse":/Expand/.toString(),"How aligned is this to our core mission and strategy?":/Not at all aligned/.toString(),"Do the project benefits outweigh the cost and risks introduced?":/No/.toString(),"How complete is the project investigation at this point?":/Very complete/.toString(),"Overall, should this project be considered for the next planning session?":/No/.toString(),"Do you have any additional notes for the team?":/testing/.toString(),"Action":/Complete Gate/.toString())
        //Verify Floating Modal in Gate Action Item
        new actions.ProjectRoom.VerifyFloatingModalinGateActionItem().run("Message":/Completed!/.toString())
        //Set Floating Modal For Default Template in Project Room
        new actions.ProjectRoom.SetFloatingModalForDefaultTemplateinProjectRoom().run("Action":/Close/.toString())
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Room Item":/Gate 2/.toString())
        //Return Todays or Other Date in the Requested Format
        variables."todaysDate" = new actions.Utils.ReturnTodaysDateintheRequestedFormat().run("Format":/MM-dd-yy/.toString())
        //Verify Stage Process or Gate Approval Action Item
        new actions.ProjectRoom.VerifyStageProcessActionItem().run("Stage or Gate Name":/Gate 2/.toString(),"Stage Heading":/Gate review has been completed by Pipeline Admin on ${variables."todaysDate"}./.toString(),"Stage or Gate Review Assigned To":/Pipeline Admin,End User,Moderator/.toString(),"Scorecard":/Completed!/.toString())
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