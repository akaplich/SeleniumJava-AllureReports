import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132585 - Scheduler V3> Hackathon with Early registration phase On and Off
class C132585_SchedulerV3_HackathonwithEarlyregistrationphaseOnandOff
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
        //Delete this when Hackathon Break apart Join Widget from Onboarding is enabled for all
        Action6709bb6e9f50443e08b2b7ad([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Apply Filter on Apps Pillar 2.0
        new actions.AppsPillar.ApplyFilterAppsPillar20().run("Filter Option":/Programs/.toString())
        //Return Todays or Other Date in the Requested Format
        variables."today" = new actions.Utils.ReturnTodaysDateintheRequestedFormat().run("Format":/MM\/dd\/yyyy/.toString())
        //Return Current Time
        variables."now" = new actions.Utils.ReturnCurrentTime().run("Format":/h:mm a/.toString())
        //Add Subtract From Date
        variables."start" = new actions.Utils.AddSubstractFromDate().run("Date":/today/.toString(),"Add or Subtract":/Add/.toString(),"Number":/2/.toString(),"Units":/Days/.toString())
        //Add Subtract From Date
        variables."end" = new actions.Utils.AddSubstractFromDate().run("Date":/today/.toString(),"Add or Subtract":/Add/.toString(),"Number":/1/.toString(),"Units":/Years/.toString())
        //Create Pipeline with Scheduler V3
        new actions.WebstormCreation.CreatePipelineWithSchedulerV3().run("App Name (optional)":/Hackathon/.toString(),"Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Title":/Hack/.toString(),"Description":/Hack Event description/.toString(),"Action on Topic Page":/Continue/.toString(),"Action on Design Page":/Continue/.toString(),"Early Access":/End User/.toString(),"Early Access Add or Remove":/Add/.toString(),"General Access":/ALL,End User 2/.toString(),"General Access Add or Remove":/Remove,Add/.toString(),"Administrator Field Title":/Pipeline Administrators/.toString(),"Administrator Field Value":/Pipeline Admin/.toString(),"Administrator Field Value Add or Remove":/Add/.toString(),"Moderator Field Title":/Pipeline Moderator/.toString(),"Moderator Field Value":/Moderator/.toString(),"Moderator Field Value Add or Remove":/Add/.toString(),"Action on Participants Page":/Continue/.toString(),"Phase 1 Title":/Plan & Setup/.toString(),"Phase 1 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."today"}, ${variables."now"}/.toString(),"Phase 2 Title":/Incubate/.toString(),"Phase 2 (Start Date, Start Time, End Date, End Time)":/${variables."start"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 3 Title":/Build\/Hack/.toString(),"Phase 3 (Start Date, Start Time, End Date, End Time)":/${variables."start"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 4 Title":/Presentation & Judging/.toString(),"Phase 4 (Start Date, Start Time, End Date, End Time)":/${variables."start"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 5 Title":/Recognize/.toString(),"Phase 5 (Start Date, Start Time, End Date, End Time)":/${variables."start"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 6 Title":/Close Out & Review /.toString(),"Phase 6 (Start Date, Start Time, End Date, End Time)":/${variables."start"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Action on Site Schedule Page":/Create/.toString())
        //Verify Homepage Header 2
        new actions.WebstormHomepage.VerifyHomepageHeader2().run("Title":/Hack/.toString(),"Description":/Submit a project and form a team to rapidly prototype in 24 hours. Top projects will have an opportunity to receive further development./.toString(),"Submit Displayed":false,"Registration":false,"Get Started":false)
        //Set Widget Controller
        new actions.Widgets.SetWidgetController().run("Widget Edit Mode":/Enable/.toString(),"Add Widget from Selection":/Join Event/.toString())
        //Verify Join Event Button
        new actions.WebstormHomepage.HackathonOnboarding.VerifyJoinEventButton().run("Button Text":/Early Registration/.toString(),"Button Displayed":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Schedule in Site Setup (V2 & V3)
        new actions.SetupScheduler.SetupSchedulerV2.SetScheduleinSiteSetup().run("Navigate to Tab":true,"Resource":/Early Registration/.toString(),"Click from":/Grid Cell/.toString())
        //Set Date and Time in Scheduler in Site Setup (V2 & V3)
        new actions.SetupScheduler.SetupSchedulerV2.SetDateandTimeinSchedulerinSiteSetup().run("Start Date":/${variables."today"}/.toString(),"Action":/Save Schedule/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Home/.toString())
        //Verify Homepage Header 2
        new actions.WebstormHomepage.VerifyHomepageHeader2().run("Title":/Hack/.toString(),"Description":/Submit a project and form a team to rapidly prototype in 24 hours. Top projects will have an opportunity to receive further development./.toString(),"Submit Displayed":false,"Registration":false,"Get Started":false)
        //Set Registration or Get Started For Hackathon Onboarding
        new actions.WebstormHomepage.HackathonOnboarding.SetRegistrationorGetStartedForHackathonOnboarding().run("Area Accessing The Menu From":/Widget/.toString(),"Onboarding Menu Option":/Early Registration/.toString())
        //Verify Toast Message for Linking and Unlinking Pipeline
        new actions.Whiteboards.VerifyToastMessageforLinkingandUnlinkingPipeline().run("Message":/Registration successful!/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Schedule in Site Setup (V2 & V3)
        new actions.SetupScheduler.SetupSchedulerV2.SetScheduleinSiteSetup().run("Navigate to Tab":true,"Resource":/Early Registration/.toString(),"Click from":/Grid Cell/.toString())
        //Add Subtract From Date
        variables."newEndDate" = new actions.Utils.AddSubstractFromDate().run("Date":/today/.toString(),"Add or Subtract":/Subtract/.toString(),"Number":/1/.toString(),"Units":/Days/.toString())
        //Add Subtract From Date
        variables."newStartDate" = new actions.Utils.AddSubstractFromDate().run("Date":/today/.toString(),"Add or Subtract":/Subtract/.toString(),"Number":/2/.toString(),"Units":/Days/.toString())
        //Set Date and Time in Scheduler in Site Setup (V2 & V3)
        new actions.SetupScheduler.SetupSchedulerV2.SetDateandTimeinSchedulerinSiteSetup().run("Start Date":/${variables."newStartDate"}/.toString(),"End Date":/${variables."newEndDate"}/.toString(),"Action":/Save Schedule/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Home/.toString())
        //Verify Homepage Header 2
        new actions.WebstormHomepage.VerifyHomepageHeader2().run("Title":/Hack/.toString(),"Description":/Submit a project and form a team to rapidly prototype in 24 hours. Top projects will have an opportunity to receive further development./.toString(),"Submit Displayed":false,"Registration":false,"Get Started":false)
        //Verify Join Event Button
        new actions.WebstormHomepage.HackathonOnboarding.VerifyJoinEventButton().run("Button Text":/Early Registration/.toString(),"Button Displayed":false)
        //Verify Join Event Button
        new actions.WebstormHomepage.HackathonOnboarding.VerifyJoinEventButton().run("Button Text":/Update or Leave Event/.toString(),"Button Displayed":false)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/pipelineadmin@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Home/.toString())
        //Verify Join Event Button
        new actions.WebstormHomepage.HackathonOnboarding.VerifyJoinEventButton().run("Button Text":/Early Registration/.toString(),"Button Displayed":false)
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
    //Delete this when Hackathon Break apart Join Widget from Onboarding is enabled for all
    public static def Action6709bb6e9f50443e08b2b7ad(def params){
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for BIOnly Beta tab
        new actions.SetupBI.SetEnterpriseSetupforBIOnlyBetatab().run("Hackathon Break apart Join Widget from Onboarding":true)

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