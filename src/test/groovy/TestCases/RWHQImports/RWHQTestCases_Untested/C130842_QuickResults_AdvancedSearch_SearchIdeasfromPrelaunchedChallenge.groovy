import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C130842 - Quick Results, Advanced Search - Search Ideas from Prelaunched Challenge
class C130842_QuickResults_AdvancedSearch_SearchIdeasfromPrelaunchedChallenge
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
        //Delete this when Scheduler feature is enabled for everyone
        Action66ec7933e12425a91ee5d983([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString(),"Highlights":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site Global Navigation Page
        new actions.SetupSite.SetEnterpriseSetupSiteGlobalNavigationPage().run("Global Navigation Search":/Show Personalized Quick Results with Search/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Solve Webstorm
        new actions.WebstormCreation.CreateSolveWebstorm().run("App Name":/Solve/.toString(),"Sponsor Name":/Sri/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Solve App12/.toString(),"Challenge Brief":/desc/.toString(),"Action on General Information Tab":/Continue/.toString(),"Choose Design Template":/Use Default Design/.toString(),"Action on Design Tab":/Continue/.toString(),"General Access":/End User 2/.toString(),"General Access Add or Remove":/Add/.toString(),"Early Access":/End User/.toString(),"Early Access Add or Remove":/Add/.toString(),"Pipeline Administrators":/Pipeline Admin/.toString(),"Administrators Add or Remove":/Add/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action on Participants Tab":/Continue/.toString(),"Action on Site Schedule Tab":/Continue/.toString(),"Action on Communications Tab":/Continue/.toString(),"Single Scale Field":/Rate Potential Solutions/.toString(),"Single Scale Field Assignee":/Evaluator/.toString(),"Single Scale Assignee Add or Remove":/Add/.toString(),"Scorecard Field":/Evaluate Potential Solutions/.toString(),"Scorecard Field Assignee":/Pipeline Sponsor/.toString(),"Scorecard Field Assignee Add or Remove":/Add/.toString(),"Action on Process Tab":/Continue/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Solve App12/.toString(),"Area to Navigate to":/Pipeline Setup/.toString())
        //Set Roles in Pipeline Setup Page
        new actions.PipelineSetup.SetRolesinPipelineSetupPage().run("Navigate to Tab":true,"Analysts":/analyst/.toString(),"Analysts Add or Remove":/Add/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Solve App12/.toString(),"Area to Navigate to":/Setup/.toString())
        //Return Date in Requested Format
        variables."startDate" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/14/.toString(),"Format":/MM\/dd\/yyyy/.toString())
        //Return Date in Requested Format
        variables."startDateInNewFormat" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/14/.toString(),"Format":/MMM d/.toString())
        //Return Todays or Other Date in the Requested Format
        variables."todaysDate" = new actions.Utils.ReturnTodaysDateintheRequestedFormat().run("Format":/MM\/dd\/yyyy/.toString())
        //Return Todays or Other Date in the Requested Format
        variables."todaysDateInNewFormat" = new actions.Utils.ReturnTodaysDateintheRequestedFormat().run("Format":/MMM d/.toString())
        //Return Date in Requested Format
        variables."endDate" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/28/.toString(),"Format":/MM\/dd\/yyyy/.toString())
        //Return Date in Requested Format
        variables."endDateInNewFormat" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/28/.toString(),"Format":/MMM d/.toString())
        //Return Current Time
        variables."currentTime" = new actions.Utils.ReturnCurrentTime().run("Format":/h:mm aa/.toString())
        //Return Current Time
        variables."ttcurrentTime" = new actions.Utils.ReturnCurrentTime().run("Format":/hh aa/.toString())
        //Verify Scheduler in Setup (V2 & V3)
        new actions.SetupScheduler.SetupSchedulerV2.VerifySchedulerinSetup().run("Status":/Pre-Launch/.toString(),"Prelaunch End Date":/${variables."startDate"}/.toString(),"Prelaunch Tooltip":/Start: Jan 1, 12 AMEnd: ${variables."startDateInNewFormat"}, 08 AM/.toString(),"Navigate":true)
        //Set Schedule in Site Setup (V2 & V3)
        new actions.SetupScheduler.SetupSchedulerV2.SetScheduleinSiteSetup().run("Resource":/Submission/.toString(),"Click from":/Grid Cell/.toString())
        //Set Date and Time in Scheduler in Site Setup (V2 & V3)
        new actions.SetupScheduler.SetupSchedulerV2.SetDateandTimeinSchedulerinSiteSetup().run("Start Date":/${variables."todaysDate"}/.toString(),"Start Date Time":/${variables."currentTime"}/.toString(),"End Date":/${variables."endDate"}/.toString(),"End Date Time":/8:00 AM/.toString(),"Action":/Save Schedule/.toString())
        //Set Scheduler Top Bar Buttons
        new actions.SetupScheduler.SetupSchedulerV2.SetSchedulerTopBarButtons().run("View":/Next/.toString())
        //Set Scheduler Top Bar Buttons
        new actions.SetupScheduler.SetupSchedulerV2.SetSchedulerTopBarButtons().run("View":/Next/.toString())
        //Verify Scheduler in Setup (V2 & V3)
        new actions.SetupScheduler.SetupSchedulerV2.VerifySchedulerinSetup().run("Status":/Pre-Launch/.toString(),"Submission Start and End Date":/${variables."todaysDate"} - ${variables."endDate"}/.toString(),"Submission Start and End Date Tooltip":/Start: ${variables."todaysDateInNewFormat"}, ${variables."ttcurrentTime"}End: ${variables."endDateInNewFormat"}, 08 AM/.toString(),"Navigate":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Solve App12/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Solve App Post Idea
        new actions.PostIdea.SetSolveAppPostIdea().run("Title":/Solve App Idea1/.toString(),"Description":/desc/.toString(),"Please describe how this solution addresses the problem.":/desc/.toString(),"Action":/Submit Idea/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Quick or Advance Search in Global Nav
        new actions.Search.QuickOrAdvanceSearchInGlobalNav().run("Tab (optional)":/Quick Results/.toString())
        //Verify Quick or Advanced Search Result
        new actions.Search.VerifyQuickOrAdvancedSearchResult().run("Tab":/Quick Results/.toString(),"Name of the searched item":/Solve App12/.toString(),"Placement Number (for Quick Results)":/1/.toString(),"Type":/Activity/.toString(),"Number of Matches":/1/.toString())
        //Verify Quick or Advanced Search Result
        new actions.Search.VerifyQuickOrAdvancedSearchResult().run("Tab":/Quick Results/.toString(),"Name of the searched item":/Solve App Idea1/.toString(),"Placement Number (for Quick Results)":/2/.toString(),"Type":/Idea/.toString(),"Number of Matches":/1/.toString())
        //Quick or Advance Search in Global Nav
        new actions.Search.QuickOrAdvanceSearchInGlobalNav().run("Tab (optional)":/Advanced Search/.toString(),"Search Input":/Solve App Idea1/.toString())
        //Verify Quick or Advanced Search Result
        new actions.Search.VerifyQuickOrAdvancedSearchResult().run("Tab":/Advanced Search/.toString(),"Name of the searched item":/Solve App Idea1/.toString(),"Type":/Submissions/.toString(),"Number of Matches":/1/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/pipelineadmin@test.com/.toString(),"Password":/brightidea1/.toString())
        //Quick or Advance Search in Global Nav
        new actions.Search.QuickOrAdvanceSearchInGlobalNav().run("Tab (optional)":/Advanced Search/.toString(),"Search Input":/Solve App Idea1/.toString())
        //Verify Quick or Advanced Search Result
        new actions.Search.VerifyQuickOrAdvancedSearchResult().run("Tab":/Advanced Search/.toString(),"Name of the searched item":/Solve App Idea1/.toString(),"Type":/Submissions/.toString(),"Number of Matches":/1/.toString(),"Click on result":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Quick or Advance Search in Global Nav
        new actions.Search.QuickOrAdvanceSearchInGlobalNav().run("Tab (optional)":/Quick Results/.toString())
        //Verify Quick or Advanced Search Result
        new actions.Search.VerifyQuickOrAdvancedSearchResult().run("Tab":/Quick Results/.toString(),"Name of the searched item":/Solve App Idea1/.toString(),"Placement Number (for Quick Results)":/1/.toString(),"Type":/Idea/.toString(),"Number of Matches":/1/.toString())
        //Verify Quick or Advanced Search Result
        new actions.Search.VerifyQuickOrAdvancedSearchResult().run("Tab":/Quick Results/.toString(),"Name of the searched item":/Solve App12/.toString(),"Number of Matches":/0/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/moderator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Quick or Advance Search in Global Nav
        new actions.Search.QuickOrAdvanceSearchInGlobalNav().run("Tab (optional)":/Advanced Search/.toString(),"Search Input":/Solve App Idea1/.toString())
        //Verify Quick or Advanced Search Result
        new actions.Search.VerifyQuickOrAdvancedSearchResult().run("Tab":/Advanced Search/.toString(),"Name of the searched item":/Solve App Idea1/.toString(),"Type":/Submissions/.toString(),"Number of Matches":/1/.toString(),"Click on result":true)
        //Quick or Advance Search in Global Nav
        new actions.Search.QuickOrAdvanceSearchInGlobalNav().run("Tab (optional)":/Quick Results/.toString())
        //Verify Quick or Advanced Search Result
        new actions.Search.VerifyQuickOrAdvancedSearchResult().run("Tab":/Quick Results/.toString(),"Name of the searched item":/Solve App Idea1/.toString(),"Placement Number (for Quick Results)":/1/.toString(),"Type":/Idea/.toString(),"Number of Matches":/1/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Quick or Advance Search in Global Nav
        new actions.Search.QuickOrAdvanceSearchInGlobalNav().run("Tab (optional)":/Advanced Search/.toString(),"Search Input":/Solve App Idea1/.toString())
        //Verify Quick or Advanced Search Result
        new actions.Search.VerifyQuickOrAdvancedSearchResult().run("Tab":/Advanced Search/.toString(),"Name of the searched item":/Solve App Idea1/.toString(),"Type":/Submissions/.toString(),"Number of Matches":/1/.toString(),"Click on result":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Quick or Advance Search in Global Nav
        new actions.Search.QuickOrAdvanceSearchInGlobalNav().run("Tab (optional)":/Quick Results/.toString())
        //Verify Quick or Advanced Search Result
        new actions.Search.VerifyQuickOrAdvancedSearchResult().run("Tab":/Quick Results/.toString(),"Name of the searched item":/Solve App Idea1/.toString(),"Placement Number (for Quick Results)":/1/.toString(),"Type":/Idea/.toString(),"Number of Matches":/1/.toString(),"Click on result":true)
        //Verify Idea in View Idea page
        new actions.ViewIdea.VerifyIdeainViewIdeapage().run("Idea Name":/Solve App Idea1/.toString(),"Linked Submissions":[])
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/analyst@test.com/.toString(),"Password":/brightidea1/.toString())
        //Quick or Advance Search in Global Nav
        new actions.Search.QuickOrAdvanceSearchInGlobalNav().run("Tab (optional)":/Advanced Search/.toString(),"Search Input":/Solve App Idea1/.toString())
        //Verify Quick or Advanced Search Result
        new actions.Search.VerifyQuickOrAdvancedSearchResult().run("Tab":/Advanced Search/.toString(),"Name of the searched item":/Solve App Idea1/.toString(),"Type":/Submissions/.toString(),"Number of Matches":/1/.toString(),"Click on result":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Quick or Advance Search in Global Nav
        new actions.Search.QuickOrAdvanceSearchInGlobalNav().run("Tab (optional)":/Quick Results/.toString())
        //Verify Quick or Advanced Search Result
        new actions.Search.VerifyQuickOrAdvancedSearchResult().run("Tab":/Quick Results/.toString(),"Name of the searched item":/Solve App Idea1/.toString(),"Placement Number (for Quick Results)":/1/.toString(),"Type":/Idea/.toString(),"Number of Matches":/1/.toString(),"Click on result":true)
        //Verify Idea in View Idea page
        new actions.ViewIdea.VerifyIdeainViewIdeapage().run("Idea Name":/Solve App Idea1/.toString(),"Linked Submissions":[])
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser2@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Quick or Advance Search in Global Nav
        new actions.Search.QuickOrAdvanceSearchInGlobalNav().run("Tab (optional)":/Advanced Search/.toString(),"Search Input":/Solve App Idea1/.toString())
        try{
            //Verify Quick or Advanced Search Result
            new actions.Search.VerifyQuickOrAdvancedSearchResult().run("Tab":/Advanced Search/.toString(),"No Search Results":true,"Name of the searched item":/Solve App Idea1/.toString())
        }
       catch(all){}catch(Error err){}
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