import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C132548 - Scheduler V1 - Close Initiative and Check Homepage
class C132548_SchedulerV1_CloseInitiativeandCheckHomepage
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
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Apply Filter on Apps Pillar 2.0
        new actions.AppsPillar.ApplyFilterAppsPillar20().run("Filter Option":/Programs/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Slash/.toString(),"Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Slash/.toString(),"Description":/Slash Desc/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Early Access":/ALL/.toString(),"Early Access Add or Remove":/Add/.toString())
        //Return Date in Requested Format
        variables."startDate" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/14/.toString(),"Format":/MM\/dd\/yyyy/.toString())
        //Return Date in Requested Format
        variables."startDate_SchedVerify" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/14/.toString(),"Format":/MMM d/.toString())
        //Return Date in Requested Format
        variables."endDate" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/45/.toString(),"Format":/MM\/dd\/yyyy/.toString())
        //Create Solve Webstorm
        new actions.WebstormCreation.CreateSolveWebstorm().run("Action on Design Tab":/<Empty>/.toString(),"Launch Date":/${variables."startDate"}/.toString(),"Launch Time":/2:00 AM/.toString(),"End Date":/${variables."endDate"}/.toString(),"End Time":/1:00 AM/.toString(),"Action on Site Schedule Tab":/Continue/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Slash/.toString(),"Area to Navigate to":/Setup/.toString())
        //Return Date in Requested Format
        variables."startDateInNewFormat" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/14/.toString(),"Format":/MMM d/.toString())
        //Return Date in Requested Format
        variables."endDateInNewFormat" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/45/.toString(),"Format":/MMM d/.toString())
        //Verify Scheduler V1 in Setup
        new actions.SetupScheduler.VerifySetupSchedulerV1().run("Status":/Pre-Launch/.toString(),"Pre-Launch End Date":/Ends ${variables."startDateInNewFormat"}/.toString(),"Pre-Launch Tooltip Start":/Start: Jan 1, 12 AM/.toString(),"Pre-Launch Tooltip End":/End: ${variables."startDateInNewFormat"}, 02 AM/.toString())
        //Return Date in Requested Format
        variables."closedstartDate" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/-7/.toString(),"Format":/MM\/dd\/yyyy/.toString())
        //Return Date in Requested Format
        variables."closedendDate" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/-1/.toString(),"Format":/MM\/dd\/yyyy/.toString())
        //Return Date in Requested Format
        variables."closedstartDateInNewFormat" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/-7/.toString(),"Format":/MMM d/.toString())
        //Return Date in Requested Format
        variables."closedendDateInNewFormat" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/-1/.toString(),"Format":/MMM d/.toString())
        //Set Schedule in Site Setup V1
        new actions.SetupScheduler.SetupSchedulerV1.SetScheduleinSiteSetupV1().run("Resource":/Initiative/.toString(),"Click from":/Grid Cell/.toString())
        //Set Date and Time in Scheduler in Site Setup V1
        new actions.SetupScheduler.SetupSchedulerV1.SetDateandTimeinSchedulerinSiteSetupV1().run("Start Date":/${variables."closedstartDate"}/.toString(),"Start Date Time":/12:00 PM/.toString(),"End Date":/${variables."closedendDate"}/.toString(),"End Date Time":/1:00 PM/.toString(),"Action":/Save Schedule/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Verify Scheduler V1 in Setup
        new actions.SetupScheduler.VerifySetupSchedulerV1().run("Navigate to the Tab":false,"Status":/Closed/.toString(),"Initiative Active Tooltip Start":/ Start: ${variables."closedstartDateInNewFormat"}, 12 PM/.toString(),"Initiative Active Tooltip End":/End: ${variables."closedendDateInNewFormat"}, 01 PM/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Slash/.toString(),"Area to Navigate to":/Home/.toString())
        //Verify Homepage Header 2
        new actions.WebstormHomepage.VerifyHomepageHeader2().run("Title":/Slash/.toString(),"Description":/Help us identify ways to cut non-essential expenses quickly and intelligently./.toString(),"Submit Displayed":false,"Browse Displayed":true,"Registration":false)
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