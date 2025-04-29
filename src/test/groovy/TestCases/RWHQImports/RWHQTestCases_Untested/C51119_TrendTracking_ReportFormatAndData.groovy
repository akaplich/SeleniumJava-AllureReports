package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C51119 - Trend Tracking - Report Format & Data
class C51119_TrendTracking_ReportFormatAndData
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
        //Disable Apps V3
        Action67d84bbf3e876c6a0e91b2a2([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Trend Track App/.toString(),"Description":/Desc/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Trend Track App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/60/.toString())
        //Set Webstorm Setup Exports for Trend Tracking Tab
        new actions.SetupExports.SetWebstormSetupExportsforTrendTrackingTab().run("Report Options":/Trend Tracking/.toString(),"Format":/xlsx/.toString(),"Period Type":/Months/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Trend Tracking/.toString(),"Report Name Starts with":/WebStorm_stats/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/WebStorm_stats-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Total Ideas","0"],"Number of Matches":/1/.toString(),"Total Number of Rows":/45/.toString())
        //Remove Report from Setup Exports
        new actions.SetupExports.RemoveReportfromSetupExports().run("Section":/Trend Tracking/.toString(),"Report Name Starts with":/WebStorm_stats/.toString(),"Instance":/1/.toString(),"Action":/Delete Report/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Trend Track App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/idea1/.toString(),"Description":/desc/.toString(),"Category":/New Product/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Trend Track App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Exports for Trend Tracking Tab
        new actions.SetupExports.SetWebstormSetupExportsforTrendTrackingTab().run("Report Options":/Trend Tracking/.toString(),"Format":/xlsx/.toString(),"Period Type":/Months/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Trend Tracking/.toString(),"Report Name Starts with":/WebStorm_stats/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/WebStorm_stats-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Total Ideas","1"],"Number of Matches":/1/.toString(),"Total Number of Rows":/45/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Trend Tracking/.toString(),"Report Name Starts with":/WebStorm_stats/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/WebStorm_stats-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["New Product","1"],"Number of Matches":/2/.toString(),"Total Number of Rows":/45/.toString())
        //Remove Report from Setup Exports
        new actions.SetupExports.RemoveReportfromSetupExports().run("Section":/Trend Tracking/.toString(),"Report Name Starts with":/WebStorm_stats/.toString(),"Instance":/1/.toString(),"Action":/Delete Report/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Trend Track App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/idea1/.toString())
        //Set new Voting in View Idea Page
        new actions.ViewIdea.SetnewVotinginViewIdeaPage().run("Promote or Demote":/Demote/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Trend Track App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Exports for Trend Tracking Tab
        new actions.SetupExports.SetWebstormSetupExportsforTrendTrackingTab().run("Report Options":/Trend Tracking/.toString(),"Format":/xlsx/.toString(),"Period Type":/Months/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Trend Tracking/.toString(),"Report Name Starts with":/WebStorm_stats/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/WebStorm_stats-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Total Votes","2"],"Number of Matches":/1/.toString(),"Total Number of Rows":/45/.toString())
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
    //Disable Apps V3
    public static def Action67d84bbf3e876c6a0e91b2a2(def params){
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for BIOnly Beta tab
        new actions.SetupBI.SetEnterpriseSetupforBIOnlyBetatab().run("Activate Apps V3":false,"Apps v3 Pre-launch Enhancements":false)

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