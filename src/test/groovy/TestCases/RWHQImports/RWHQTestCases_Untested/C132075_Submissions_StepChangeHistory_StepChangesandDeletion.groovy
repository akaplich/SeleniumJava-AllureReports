import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132075 - Submissions - Step Change History - Step Changes and Deletion
class C132075_Submissions_StepChangeHistory_StepChangesandDeletion
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
        Action58123c20fa4ee77809f468f6("Username Email":/bi.adminuser1@brightidea.com/.toString(),"Licensing Model":/Standard Licensing Model/.toString(),"Unlimited Brightidea Administrator License Type":/1/.toString(),"Unlimited Idea Box Manager License Type":/1/.toString())
        //Delete this when Scheduler feature is enabled for everyone
        Action66ec7933e12425a91ee5d983([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for Beta tab
        new actions.SetupBeta.SetEnterpriseSetupforBetatab().run("History Tab on View Submission":true,"Extended Data for History Tab":true,"View Idea 3 in Action Items and Manage Pages":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Apply Filter on Apps Pillar 2.0
        new actions.AppsPillar.ApplyFilterAppsPillar20().run("Filter Option":/Programs/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Hackathon/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Hack/.toString(),"Description":/Hack Event description/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Action":/Create/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Disable Scheduler
        new actions.SetupScheduler.SetDisableScheduler().run("Status":/Active/.toString(),"Enable Submission":true,"Action":/Disable Schedule/.toString())
        //Set Webstorm Setup Ideas for Ideas tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforIdeastab().run("View Idea 3.0":true,"Business impact tab":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/test idea3/.toString(),"Description":/desc/.toString(),"Category":/Theme 1/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea3/.toString(),"Instance":/1/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Rate Submissions/.toString(),"Action":/Change Step/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea3/.toString(),"Instance":/1/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Hack on Projects/.toString(),"Action":/Change Step/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea3/.toString(),"Instance":/1/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Event Holding/.toString(),"Action":/Change Step/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea3/.toString(),"Instance":/1/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Hack on Projects/.toString(),"Action":/Change Step/.toString())
        //Set Duplicate Step in Pipeline Steps View
        new actions.PipelineStepsView.SetDuplicateStepinPipelineStepsView().run("Step to Edit":/Hack on Projects/.toString(),"Step Name":/Hack on Projects (copy)/.toString(),"Action":/Duplicate Step/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea3/.toString(),"Instance":/1/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Hack on Projects (copy)/.toString(),"Action":/Change Step/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea3/.toString(),"Instance":/1/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Hack on Projects/.toString(),"Action":/Change Step/.toString())
        //Delete Step in Pipeline Steps page
        new actions.PipelineStepsView.DeleteStepinPipelineStepspage().run("Step to Delete":/Hack on Projects (copy)/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Webstorm Setup Exports for Submissions tab
        new actions.SetupExports.SetWebstormSetupExportsforSubmissionstab().run("Report Options":/Submission Step Change History/.toString(),"Format":/csv/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Verify Generated Report in any Setup Exports
        new actions.SetupExports.VerifyGeneratedReportinSetupExports().run("Report Name Starts with":/Ideas_step_history/.toString(),"Number of Matches":/1/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Ideas_step_history/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Ideas_step_history*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Initiative","Code","Step","Date Entered Step","Date Left Step","Days in Step","Next Step","User Name","User Email","Member ID"],"Number of Matches":/1/.toString(),"Total Number of Rows":/8/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Ideas_step_history/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Ideas_step_history*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Hack","D111","test idea3","Initial Submission"],"Number of Matches":/1/.toString(),"Total Number of Rows":/8/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Ideas_step_history/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Ideas_step_history*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Hack","D111","test idea3","Rate Submissions"],"Number of Matches":/2/.toString(),"Total Number of Rows":/8/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Ideas_step_history/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Ideas_step_history*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Hack","D111","test idea3","Hack on Projects"],"Number of Matches":/6/.toString(),"Total Number of Rows":/8/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Ideas_step_history/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Ideas_step_history*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Hack","D111","test idea3","Hack on Projects (copy)"],"Number of Matches":/1/.toString(),"Total Number of Rows":/8/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Ideas_step_history/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Ideas_step_history*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Hack","D111","test idea3","Deleted Step"],"Number of Matches":/1/.toString(),"Total Number of Rows":/8/.toString())
        //Set Webstorm Setup Exports for Submissions tab
        new actions.SetupExports.SetWebstormSetupExportsforSubmissionstab().run("Report Options":/Submission Step Change History/.toString(),"Format":/xlsx/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/25/.toString())
        //Verify Generated Report in any Setup Exports
        new actions.SetupExports.VerifyGeneratedReportinSetupExports().run("Report Name Starts with":/Ideas_step_history/.toString(),"Number of Matches":/2/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Ideas/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Ideas_step_history*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Initiative","Code","Step","Date Entered Step","Date Left Step","Days in Step","Next Step","User Name","User Email","Member ID"],"Number of Matches":/1/.toString(),"Total Number of Rows":/8/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Ideas_step_history/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Ideas_step_history*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Hack","D111","test idea3","Initial Submission"],"Number of Matches":/1/.toString(),"Total Number of Rows":/8/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Ideas_step_history/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Ideas_step_history*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Hack","D111","test idea3","Rate Submissions"],"Number of Matches":/2/.toString(),"Total Number of Rows":/8/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Ideas_step_history/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Ideas_step_history*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Hack","D111","test idea3","Hack on Projects"],"Number of Matches":/6/.toString(),"Total Number of Rows":/8/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Ideas_step_history/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Ideas_step_history*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Hack","D111","test idea3","Hack on Projects (copy)"],"Number of Matches":/1/.toString(),"Total Number of Rows":/8/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Ideas_step_history/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Ideas_step_history*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Hack","D111","test idea3","Deleted Step"],"Number of Matches":/1/.toString(),"Total Number of Rows":/8/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea3/.toString())
        //Set Tab in View Idea 3
        new actions.ViewIdea30.SetTabinViewIdea3().run("Tab":/History/.toString())
        //Verify History Tab on View Idea
        new actions.ViewIdea.VerifyHistoryTabonViewIdea().run("Launch from View Idea 3":true,"Event Record to Verify":/Step changed from 'Hack on Projects (copy)' to 'Hack on Projects' by System Admin/.toString(),"Number of Matches":/1/.toString(),"Total Number of Records":/7/.toString())
        //Verify History Tab on View Idea
        new actions.ViewIdea.VerifyHistoryTabonViewIdea().run("Launch from View Idea 3":true,"Event Record to Verify":/Step changed from 'Hack on Projects' to 'Hack on Projects (copy)' by System Admin/.toString(),"Number of Matches":/1/.toString(),"Total Number of Records":/7/.toString())
        //Verify History Tab on View Idea
        new actions.ViewIdea.VerifyHistoryTabonViewIdea().run("Launch from View Idea 3":true,"Event Record to Verify":/Step changed from 'Event Holding' to 'Hack on Projects' by System Admin/.toString(),"Number of Matches":/1/.toString(),"Total Number of Records":/7/.toString())
        //Verify History Tab on View Idea
        new actions.ViewIdea.VerifyHistoryTabonViewIdea().run("Launch from View Idea 3":true,"Event Record to Verify":/Step changed from 'Hack on Projects' to 'Event Holding' by System Admin/.toString(),"Number of Matches":/1/.toString(),"Total Number of Records":/7/.toString())
        //Verify History Tab on View Idea
        new actions.ViewIdea.VerifyHistoryTabonViewIdea().run("Launch from View Idea 3":true,"Event Record to Verify":/Step changed from 'Rate Submissions' to 'Hack on Projects' by System Admin/.toString(),"Number of Matches":/1/.toString(),"Total Number of Records":/7/.toString())
        //Verify History Tab on View Idea
        new actions.ViewIdea.VerifyHistoryTabonViewIdea().run("Launch from View Idea 3":true,"Event Record to Verify":/Step changed from 'Initial Submission' to 'Rate Submissions' by System Admin/.toString(),"Number of Matches":/1/.toString(),"Total Number of Records":/7/.toString())
        //Verify History Tab on View Idea
        new actions.ViewIdea.VerifyHistoryTabonViewIdea().run("Launch from View Idea 3":true,"Event Record to Verify":/ Project submitted by System Admin/.toString(),"Number of Matches":/1/.toString(),"Total Number of Records":/7/.toString())
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
    //Delete this when Scheduler feature is enabled for everyone
    public static def Action66ec7933e12425a91ee5d983(def params){
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for BIOnly Beta tab
        new actions.SetupBI.SetEnterpriseSetupforBIOnlyBetatab().run("Scheduler updates":true,"Sync Phase and Scheduler Content":true)

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