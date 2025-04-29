import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132421 - Scheduler V1 - Communications Modal - Time Dropdown Saves Correct Time
class C132421_SchedulerV1_CommunicationsModal_TimeDropdownSavesCorrectTime
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
        //Set Enterprise Setup Site General Settings Page
        new actions.SetupSite.SetEnterpriseSetupSiteComponentsPage().run("Time Zone":/(UTC-06:00) Central Time (US and Canada)/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Apply Filter on Apps Pillar 2.0
        new actions.AppsPillar.ApplyFilterAppsPillar20().run("Filter Option":/Programs/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Explore/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Explore/.toString(),"Description":/Explore description/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Early Access":/ALL/.toString(),"Early Access Add or Remove":/Add/.toString())
        //Add Subtract From Date
        variables."startDate" = new actions.Utils.AddSubstractFromDate().run("Date":/today/.toString(),"Add or Subtract":/Add/.toString(),"Number":/5/.toString(),"Units":/Days/.toString())
        //Add Subtract From Date
        variables."endDate" = new actions.Utils.AddSubstractFromDate().run("Date":/today/.toString(),"Add or Subtract":/Add/.toString(),"Number":/1/.toString(),"Units":/Months/.toString())
        //Create Solve Webstorm
        new actions.WebstormCreation.CreateSolveWebstorm().run("Action on Design Tab":/<Empty>/.toString(),"Launch Date":/${variables."startDate"}/.toString(),"Launch Time":/9:00 AM/.toString(),"End Date":/${variables."endDate"}/.toString(),"End Time":/9:00 AM/.toString(),"Action on Site Schedule Tab":/Continue/.toString(),"Action on Process Tab":/Continue/.toString(),"Action":/Create/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Site Setup Newsletter
        new actions.SetupSite.SetSiteSetupNewsletter().run([:])
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/*[@id='newsletter-moved']\/\/A/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/1/.toString())
        //Create Email Alert in Pipeline Setup
        new actions.PipelineSetup.CreateNewsletterinPipelineSetup().run("Create Email Alert":true,"Enter Subject":/Newsletter Test/.toString(),"Email Body":/test body for newsletter /.toString(),"Action":/Save/.toString())
        //Return Todays or Other Date in the Requested Format
        variables."activeStart" = new actions.Utils.ReturnTodaysDateintheRequestedFormat().run("Date":/${variables."startDate"}/.toString(),"Format":/MMM d/.toString())
        //Return Todays or Other Date in the Requested Format
        variables."activeEnd" = new actions.Utils.ReturnTodaysDateintheRequestedFormat().run("Date":/${variables."endDate"}/.toString(),"Format":/MMM d/.toString())
        //Return Todays or Other Date in the Requested Format
        variables."activeEnd" = new actions.Utils.ReturnTodaysDateintheRequestedFormat().run("Date":/${variables."endDate"}/.toString(),"Format":/MMM d/.toString())
        //Add Subtract From Date
        variables."newsletterStart1" = new actions.Utils.AddSubstractFromDate().run("Date":/today/.toString(),"Add or Subtract":/Subtract/.toString(),"Number":/1/.toString(),"Units":/Days/.toString())
        //Return Todays or Other Date in the Requested Format
        variables."newsletterStart" = new actions.Utils.ReturnTodaysDateintheRequestedFormat().run("Date":/${variables."newsletterStart1"}/.toString(),"Format":/MMM d/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Verify Scheduler V1 in Setup
        new actions.SetupScheduler.VerifySetupSchedulerV1().run("Status":/Pre-Launch/.toString(),"Pre-Launch End Date":/Ends ${variables."activeStart"}/.toString(),"Active Start End Dates":/Active ${variables."activeStart"} - ${variables."activeEnd"}/.toString(),"Initiative Active Tooltip Start":/ Start: ${variables."activeStart"}, 09 AM/.toString(),"Initiative Active Tooltip End":/ End: ${variables."activeEnd"}, 09 AM/.toString(),"Submission Start End Dates":/Submission ${variables."activeStart"} - ${variables."activeEnd"}/.toString(),"Submission Tooltip Start":/ Start: ${variables."activeStart"}, 09 AM/.toString(),"Submission Tooltip End":/ End: ${variables."activeEnd"}, 09 AM/.toString(),"Voting Start End Dates":/Voting ${variables."activeStart"} - ${variables."activeEnd"}/.toString(),"Voting Tooltip Start":/ Start: ${variables."activeStart"}, 09 AM/.toString(),"Voting Tooltip End":/ End: ${variables."activeEnd"}, 09 AM/.toString(),"Commenting Start End Dates":/Commenting ${variables."activeStart"} - ${variables."activeEnd"}/.toString(),"Commenting Tooltip Start":/ Start: ${variables."activeStart"}, 09 AM/.toString(),"Commenting Tooltip End":/ End: ${variables."activeEnd"}, 09 AM/.toString())
        //Set Communication Scheduler V1
        new actions.SetupScheduler.SetCommunicationSchedulerV1().run("Communication Type":/Send Email Alert/.toString(),"Newsletter Template":/Newsletter Test/.toString(),"Send Date":/${variables."newsletterStart"}/.toString(),"Send Time":/10:00 AM/.toString(),"Action":/Save Schedule/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Verify Scheduler V1 in Setup
        new actions.SetupScheduler.VerifySetupSchedulerV1().run("Status":/Pre-Launch/.toString(),"Pre-Launch End Date":/Ends ${variables."activeStart"}/.toString(),"Active Start End Dates":/Active ${variables."activeStart"} - ${variables."activeEnd"}/.toString(),"Initiative Active Tooltip Start":/ Start: ${variables."activeStart"}, 09 AM/.toString(),"Initiative Active Tooltip End":/ End: ${variables."activeEnd"}, 09 AM/.toString(),"Submission Start End Dates":/Submission ${variables."activeStart"} - ${variables."activeEnd"}/.toString(),"Submission Tooltip Start":/ Start: ${variables."activeStart"}, 09 AM/.toString(),"Submission Tooltip End":/ End: ${variables."activeEnd"}, 09 AM/.toString(),"Voting Start End Dates":/Voting ${variables."activeStart"} - ${variables."activeEnd"}/.toString(),"Voting Tooltip Start":/ Start: ${variables."activeStart"}, 09 AM/.toString(),"Voting Tooltip End":/ End: ${variables."activeEnd"}, 09 AM/.toString(),"Commenting Start End Dates":/Commenting ${variables."activeStart"} - ${variables."activeEnd"}/.toString(),"Commenting Tooltip Start":/ Start: ${variables."activeStart"}, 09 AM/.toString(),"Commenting Tooltip End":/ End: ${variables."activeEnd"}, 09 AM/.toString(),"Communication Type":/Newsletter Test/.toString(),"Communication Tooltip":/Send: ${variables."activeStart"}, 10 AM/.toString())
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