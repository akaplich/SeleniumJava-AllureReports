import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132258 - V2 - Phase widget enable scheduler to control phase widget
class C132258_V2_Phasewidgetenableschedulertocontrolphasewidget
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
        //Delete this when Scheduler feature is enabled for everyone
        Action66ec7933e12425a91ee5d983([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Apply Filter on Apps Pillar 2.0
        new actions.AppsPillar.ApplyFilterAppsPillar20().run("Filter Option":/Programs/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Pitch/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Pitch/.toString(),"Description":/Pitch description/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Early Access":/ALL/.toString(),"Early Access Add or Remove":/Add/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString())
        //Return Todays or Other Date in the Requested Format
        variables."todaysDate" = new actions.Utils.ReturnTodaysDateintheRequestedFormat().run("Format":/MM\/dd\/yyyy/.toString())
        //Return Date in Requested Format
        variables."startDate" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/10/.toString(),"Format":/MM\/dd\/yyyy/.toString())
        //Return Date in Requested Format
        variables."endDate" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/30/.toString(),"Format":/MM\/dd\/yyyy/.toString())
        //Create Solve Webstorm
        new actions.WebstormCreation.CreateSolveWebstorm().run("Action on Design Tab":/<Empty>/.toString(),"Launch Date":/${variables."startDate"}/.toString(),"Launch Time":/10:00 AM/.toString(),"End Date":/${variables."endDate"}/.toString(),"End Time":/3:00 PM/.toString(),"Action on Site Schedule Tab":/Continue/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pitch/.toString(),"Area to Navigate to":/Setup/.toString())
        //Verify Scheduler in Setup (V2 & V3)
        new actions.SetupScheduler.SetupSchedulerV2.VerifySchedulerinSetup().run("Status":/Pre-Launch/.toString(),"Navigate":true)
        //Return Date in Requested Format
        variables."commentingDate" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/25/.toString(),"Format":/MM\/dd\/yyyy/.toString())
        //Set Schedule in Site Setup (V2 & V3)
        new actions.SetupScheduler.SetupSchedulerV2.SetScheduleinSiteSetup().run("Resource":/Commenting/.toString(),"Click from":/Grid Cell/.toString())
        //Set Date and Time in Scheduler in Site Setup (V2 & V3)
        new actions.SetupScheduler.SetupSchedulerV2.SetDateandTimeinSchedulerinSiteSetup().run("Start Date":/${variables."commentingDate"}/.toString(),"Start Date Time":/2:00 PM/.toString(),"End Date":/${variables."endDate"}/.toString(),"End Date Time":/6:00 PM/.toString(),"Action":/Save Schedule/.toString())
        //Set Phase Widget in Scheduler
        new actions.SetupScheduler.SetupSchedulerV2.SetPhaseWidgetinScheduler().run("Enable scheduler to control phase widget":true,"Disabling Scheduler + Phase Widget Action":/Confirm Enablement/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pitch/.toString(),"Area to Navigate to":/Home/.toString())
        //Verify Phases in the Phase Widget
        new actions.Widgets.VerifyPhasesinthePhaseWidget().run("Phase":/Event start/.toString(),"Phase Start Date":/${variables."startDate"}/.toString(),"Phase Position":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Phases in the Phase Widget
        new actions.Widgets.VerifyPhasesinthePhaseWidget().run("Phase":/Submission/.toString(),"Phase Start Date":/${variables."startDate"}/.toString(),"Phase Position":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Phases in the Phase Widget
        new actions.Widgets.VerifyPhasesinthePhaseWidget().run("Phase":/Voting/.toString(),"Phase Start Date":/${variables."startDate"}/.toString(),"Phase Position":/3/.toString(),"Number of Matches":/1/.toString())
        //Return Date in Requested Format
        variables."commentingDateNewFormat" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/25/.toString(),"Format":/MM\/d\/yyyy/.toString())
        //Verify Phases in the Phase Widget
        new actions.Widgets.VerifyPhasesinthePhaseWidget().run("Phase":/Commenting/.toString(),"Phase Start Date":/${variables."commentingDate"}/.toString(),"Phase Position":/4/.toString(),"Number of Matches":/1/.toString())
        //Set Widget Controller
        new actions.Widgets.SetWidgetController().run("Widget Edit Mode":/Enable/.toString())
        try{
            //Set Phase Widget
            new actions.Widgets.SetPhaseWidget().run("Phase":/Submission/.toString(),"Action on Phase":/Edit/.toString(),"New Edited Phase Name":/First Phase/.toString(),"Action on Adding or Editing Phase":/Save Phase/.toString())
        }
       catch(all){}catch(Error err){}
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pitch/.toString(),"Area to Navigate to":/Home/.toString())
        //Verify Phases in the Phase Widget
        new actions.Widgets.VerifyPhasesinthePhaseWidget().run("Phase":/Submission/.toString(),"Phase Start Date":/${variables."startDate"}/.toString(),"Phase Position":/2/.toString(),"Number of Matches":/1/.toString())
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