import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C132077 - Submissions - Step Changes from Copying an Idea
class C132077_Submissions_StepChangesfromCopyinganIdea
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
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for Beta tab
        new actions.SetupBeta.SetEnterpriseSetupforBetatab().run("History Tab on View Submission":true,"Extended Data for History Tab":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/History App/.toString(),"Description":/desc/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/History App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Ideas tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforIdeastab().run("View Idea 3.0":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Ideas tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforIdeastab().run("View Idea 3.0":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/History App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/test idea to be copied/.toString(),"Description":/desc for 'test idea to be copied'/.toString(),"Category":/New Product/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/History App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Steps/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea to be copied/.toString(),"Instance":/1/.toString())
        //Set New Copy Ideas in Pipeline Steps page
        new actions.PipelineStepsView.NewCopyIdeasinPipelineStepspage().run("Pipeline":/Custom App/.toString(),"Action":/Copy Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/History App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Exports for Submissions tab
        new actions.SetupExports.SetWebstormSetupExportsforSubmissionstab().run("Report Options":/Submission Step Change History/.toString(),"Format":/csv/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Verify Generated Report in any Setup Exports
        new actions.SetupExports.VerifyGeneratedReportinSetupExports().run("Report Name Starts with":/Ideas_step_history/.toString(),"Number of Matches":/1/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Ideas_step_history/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Ideas_step_history*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Initiative","Code","Step","Date Entered Step","Date Left Step","Days in Step","Next Step","User Name","User Email","Member ID"],"Number of Matches":/1/.toString(),"Total Number of Rows":/2/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Ideas_step_history/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Ideas_step_history*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["History App","D113","test idea to be copied","Submitted"],"Number of Matches":/1/.toString(),"Total Number of Rows":/2/.toString())
        //Set Webstorm Setup Exports for Submissions tab
        new actions.SetupExports.SetWebstormSetupExportsforSubmissionstab().run("Report Options":/Submission Step Change History/.toString(),"Format":/xlsx/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/25/.toString())
        //Verify Generated Report in any Setup Exports
        new actions.SetupExports.VerifyGeneratedReportinSetupExports().run("Report Name Starts with":/Ideas_step_history/.toString(),"Number of Matches":/2/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Ideas_step_history/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Ideas_step_history*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Initiative","Code","Step","Date Entered Step","Date Left Step","Days in Step","Next Step","User Name","User Email","Member ID"],"Number of Matches":/1/.toString(),"Total Number of Rows":/2/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Ideas_step_history/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Ideas_step_history*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["History App","D113","test idea to be copied","Submitted"],"Number of Matches":/1/.toString(),"Total Number of Rows":/2/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/History App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea to be copied/.toString())
        //Set Tab in View Idea 3
        new actions.ViewIdea30.SetTabinViewIdea3().run("Tab":/History/.toString())
        //Verify History Tab on View Idea
        new actions.ViewIdea.VerifyHistoryTabonViewIdea().run("Launch from View Idea 3":true,"Event Record to Verify":/ Idea linked to test idea to be copied by System Admin/.toString(),"Number of Matches":/1/.toString(),"Total Number of Records":/2/.toString())
        //Verify History Tab on View Idea
        new actions.ViewIdea.VerifyHistoryTabonViewIdea().run("Launch from View Idea 3":true,"Event Record to Verify":/Idea submitted by System Admin/.toString(),"Number of Matches":/1/.toString(),"Total Number of Records":/2/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Exports for Submissions tab
        new actions.SetupExports.SetWebstormSetupExportsforSubmissionstab().run("Report Options":/Submission Step Change History/.toString(),"Format":/csv/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Verify Generated Report in any Setup Exports
        new actions.SetupExports.VerifyGeneratedReportinSetupExports().run("Report Name Starts with":/Ideas_step_history/.toString(),"Number of Matches":/1/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Ideas_step_history/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Ideas_step_history*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Initiative","Code","Step","Date Entered Step","Date Left Step","Days in Step","Next Step","User Name","User Email","Member ID"],"Number of Matches":/1/.toString(),"Total Number of Rows":/2/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Ideas_step_history/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Ideas_step_history*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Custom App","D114","test idea to be copied","Review"],"Number of Matches":/1/.toString(),"Total Number of Rows":/2/.toString())
        //Set Webstorm Setup Exports for Submissions tab
        new actions.SetupExports.SetWebstormSetupExportsforSubmissionstab().run("Report Options":/Submission Step Change History/.toString(),"Format":/xlsx/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/25/.toString())
        //Verify Generated Report in any Setup Exports
        new actions.SetupExports.VerifyGeneratedReportinSetupExports().run("Report Name Starts with":/Ideas_step_history/.toString(),"Number of Matches":/2/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Ideas_step_history/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Ideas_step_history*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Initiative","Code","Step","Date Entered Step","Date Left Step","Days in Step","Next Step","User Name","User Email","Member ID"],"Number of Matches":/1/.toString(),"Total Number of Rows":/2/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Submissions/.toString(),"Report Name Starts with":/Ideas_step_history/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Ideas_step_history*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Custom App","D114","test idea to be copied","Review"],"Number of Matches":/1/.toString(),"Total Number of Rows":/2/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea to be copied/.toString())
        //Set Tab in View Idea 3
        new actions.ViewIdea30.SetTabinViewIdea3().run("Tab":/History/.toString())
        //Verify History Tab on View Idea
        new actions.ViewIdea.VerifyHistoryTabonViewIdea().run("Launch from View Idea 3":true,"Event Record to Verify":/ Idea linked to test idea to be copied by System Admin/.toString(),"Number of Matches":/1/.toString(),"Total Number of Records":/2/.toString())
        //Verify History Tab on View Idea
        new actions.ViewIdea.VerifyHistoryTabonViewIdea().run("Launch from View Idea 3":true,"Event Record to Verify":/ Idea copied from test idea to be copied by System Admin/.toString(),"Number of Matches":/1/.toString(),"Total Number of Records":/2/.toString())
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