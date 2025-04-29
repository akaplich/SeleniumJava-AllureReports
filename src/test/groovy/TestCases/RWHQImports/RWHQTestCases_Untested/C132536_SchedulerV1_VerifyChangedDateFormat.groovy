package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C132536 - Scheduler V1 - Verify Changed Date Format 
class C132536_SchedulerV1_VerifyChangedDateFormat
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
        new actions.SetupSite.SetEnterpriseSetupSiteComponentsPage().run("Enable Date Formatting":true,"Date Format":/mm-dd-yyyy/.toString(),"Time Zone":/(UTC-06:00) Central Time (US and Canada)/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Apply Filter on Apps Pillar 2.0
        new actions.AppsPillar.ApplyFilterAppsPillar20().run("Filter Option":/Programs/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Pitch/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Pitch/.toString(),"Description":/Pitch description/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Early Access":/ALL/.toString(),"Early Access Add or Remove":/Add/.toString())
        //Return Date in Requested Format
        variables."startDate" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/4/.toString(),"Format":/MM-dd-yyyy/.toString())
        //Return Date in Requested Format
        variables."endDate" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/21/.toString(),"Format":/MM-dd-yyyy/.toString())
        //Create Solve Webstorm
        new actions.WebstormCreation.CreateSolveWebstorm().run("Action on Design Tab":/<Empty>/.toString(),"Launch Date":/${variables."startDate"}/.toString(),"Launch Time":/8:00 AM/.toString(),"End Date":/${variables."endDate"}/.toString(),"End Time":/8:00 AM/.toString(),"Action on Site Schedule Tab":/Continue/.toString())
        //Return Date in Requested Format
        variables."startDateInNewFormat" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/4/.toString(),"Format":/MMM d/.toString())
        //Return Date in Requested Format
        variables."endDateInNewFormat" = new actions.Utils.ReturnDateinRequestedFormat().run("Days":/21/.toString(),"Format":/MMM d/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Verify Scheduler V1 in Setup
        new actions.SetupScheduler.VerifySetupSchedulerV1().run("Status":/Pre-Launch/.toString(),"Pre-Launch Tooltip Start":/Start: Jan 1, 12 AM/.toString(),"Pre-Launch Tooltip End":/End: ${variables."startDateInNewFormat"}, 08 AM/.toString(),"Active Start End Dates":/Active ${variables."startDateInNewFormat"} - ${variables."endDateInNewFormat"}/.toString(),"Initiative Active Tooltip Start":/Start: ${variables."startDateInNewFormat"}, 08 AM/.toString(),"Initiative Active Tooltip End":/End: ${variables."endDateInNewFormat"}, 08 AM/.toString(),"Submission Start End Dates":/Submission ${variables."startDateInNewFormat"} - ${variables."endDateInNewFormat"}/.toString(),"Submission Tooltip Start":/Start: ${variables."startDateInNewFormat"}, 08 AM/.toString(),"Submission Tooltip End":/End: ${variables."endDateInNewFormat"}, 08 AM/.toString(),"Voting Start End Dates":/Voting ${variables."startDateInNewFormat"} - ${variables."endDateInNewFormat"}/.toString(),"Voting Tooltip Start":/End: ${variables."endDateInNewFormat"}, 08 AM/.toString(),"Voting Tooltip End":/End: ${variables."endDateInNewFormat"}, 08 AM/.toString(),"Commenting Start End Dates":/Commenting ${variables."startDateInNewFormat"} - ${variables."endDateInNewFormat"}/.toString(),"Commenting Tooltip Start":/End: ${variables."endDateInNewFormat"}, 08 AM/.toString(),"Commenting Tooltip End":/End: ${variables."endDateInNewFormat"}, 08 AM/.toString())
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