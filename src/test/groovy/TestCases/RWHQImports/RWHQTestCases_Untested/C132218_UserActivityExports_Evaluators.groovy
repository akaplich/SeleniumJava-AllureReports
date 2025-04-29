package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132218 - User Activity Exports - Evaluators
class C132218_UserActivityExports_Evaluators
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
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Single Scale Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureSingleScaleStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Single Scale/.toString(),"Assignment Method":/Individual Assignment/.toString(),"Individual Assignment User":/Evaluator/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Action":/Update/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/Idea for Single Scale/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Idea for Single Scale/.toString(),"Step Name idea belongs to":/Review/.toString())
        //Drag and Drop Ideas in Pipeline Steps
        new actions.PipelineStepsView.DragandDropIdeasinPipelineSteps().run("Idea Title":/Idea for Single Scale/.toString(),"Step":/Single Scale/.toString())
        //Configure Review Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureReviewStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Review/.toString(),"Individual Assignment User":/System Admin,End User/.toString(),"Individual Assignment User Add or Remove":/Add,Add/.toString(),"Action":/Update/.toString())
        //Verify Action Items in Progress in Manage Step Page
        new actions.PipelineManageSteps.VerifyActionItemsinProgressinManageStep().run("Step Name to Manage (optional)":/Review/.toString(),"Count to verify":/0\/6/.toString(),"Evaluator":/System Admin/.toString(),"Number of assigned items":/3/.toString(),"Number of remaining items":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Action Items in Progress in Manage Step Page
        new actions.PipelineManageSteps.VerifyActionItemsinProgressinManageStep().run("Count to verify":/0\/6/.toString(),"Evaluator":/End User/.toString(),"Number of assigned items":/3/.toString(),"Number of remaining items":/3/.toString(),"Number of Matches":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Review Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureReviewStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Review/.toString(),"Individual Assignment User":/End User,Moderator/.toString(),"Individual Assignment User Add or Remove":/Remove,Add/.toString(),"Action":/Update/.toString())
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/View All/.toString())
        //Set Actions Dropdown in the Action Items Manager
        new actions.ActionItemsManager.SetActionsDropdownintheActionItemsManager().run("Select Ideas":/test idea1/.toString(),"Assignee":/Moderator/.toString(),"Check":/TRUE/.toString(),"Action":/Cancel/.toString(),"Sub Action":/Cancel Action Item/.toString())
        //Set Actions Dropdown in the Action Items Manager
        new actions.ActionItemsManager.SetActionsDropdownintheActionItemsManager().run("Select Ideas":/test idea2/.toString(),"Assignee":/Moderator/.toString(),"Check":/TRUE/.toString(),"Action":/Cancel/.toString(),"Sub Action":/Cancel Action Item/.toString())
        //Set Actions Dropdown in the Action Items Manager
        new actions.ActionItemsManager.SetActionsDropdownintheActionItemsManager().run("Select Ideas":/quick add1/.toString(),"Assignee":/Moderator/.toString(),"Check":/TRUE/.toString(),"Action":/Cancel/.toString(),"Sub Action":/Cancel Action Item/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Home/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/Idea for Single Scale/.toString())
        //Set Single Scale for Idea in Action Items page
        new actions.ActionItems.SetSingleScaleforIdeainActionItemspage().run("What is your initial impression of this idea":/4/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/pipelineadmin@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Home/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/moderator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Home/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Home/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser2@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Home/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Exports for Users Tab
        new actions.SetupExports.SetWebstormSetupExportsforUsersTab().run("Report Options":/User Activity/.toString(),"Format":/csv/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Users/.toString(),"Report Name Starts with":/User_activity/.toString(),"Instance":/1/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/30/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/User_activity-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Screen Name","Email Address","User_create_month_year","Admin Status (Y/N)","Evaluator Status (Y/N)"],"Number of Matches":/1/.toString(),"Total Number of Rows":/8/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Users/.toString(),"Report Name Starts with":/User_activity/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/User_activity-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Pipeline Admin","pipelineadmin@test.com","October 2016","Y","N"],"Number of Matches":/1/.toString(),"Total Number of Rows":/8/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Users/.toString(),"Report Name Starts with":/User_activity/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/User_activity-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["End User 2","bi.enduser2@brightidea.com","October 2016","N","N"],"Number of Matches":/1/.toString(),"Total Number of Rows":/8/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Users/.toString(),"Report Name Starts with":/User_activity/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/User_activity-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Evaluator","evaluator@test.com","June 2017","N","Y"],"Number of Matches":/1/.toString(),"Total Number of Rows":/8/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Users/.toString(),"Report Name Starts with":/User_activity/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/User_activity-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Moderator","moderator@test.com","October 2016","Y","Y"],"Number of Matches":/1/.toString(),"Total Number of Rows":/8/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Users/.toString(),"Report Name Starts with":/User_activity/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/User_activity-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["End User","bi.enduser1@brightidea.com","October 2016","N","Y"],"Number of Matches":/1/.toString(),"Total Number of Rows":/8/.toString())
        //Remove Report from Setup Exports
        new actions.SetupExports.RemoveReportfromSetupExports().run("Section":/Users/.toString(),"Report Name Starts with":/User_activity/.toString(),"Instance":/1/.toString(),"Action":/Delete Report/.toString())
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