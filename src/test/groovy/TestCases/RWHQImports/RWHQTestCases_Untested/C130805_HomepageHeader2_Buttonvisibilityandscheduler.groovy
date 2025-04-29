import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C130805 - Homepage Header 2 - Button visibility and scheduler
class C130805_HomepageHeader2_Buttonvisibilityandscheduler
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
        //Select Product in Apps Pillar Page
        new actions.AppsPillar.SelectProductinAppsPillarPage().run("Product":/Programs/.toString())
        //Create Solve Webstorm
        new actions.WebstormCreation.CreateSolveWebstorm().run("App Name":/Explore/.toString(),"Sponsor Name":/Sri/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Explore challenge title/.toString(),"Challenge Brief":/Explore challenge description/.toString(),"Action on General Information Tab":/Continue/.toString(),"Choose Design Template":/Use Default Design/.toString(),"Action on Design Tab":/Continue/.toString(),"Early Access":/ALL/.toString(),"Early Access Add or Remove":/Add/.toString(),"Action on Participants Tab":/Continue/.toString(),"Launch Time":/10:00 AM/.toString(),"End Time":/9:00 PM/.toString(),"Action on Site Schedule Tab":/Continue/.toString(),"Single Scale Field":/Rate Ideas/.toString(),"Single Scale Field Assignee":/System Admin/.toString(),"Single Scale Assignee Add or Remove":/Add/.toString(),"Action on Process Tab":/Continue/.toString(),"Action":/Create/.toString())
        //Verify Homepage Header 2
        new actions.WebstormHomepage.VerifyHomepageHeader2().run("Title":/Explore challenge title/.toString(),"Description":/Submit your ideas for products, services, and experiences that address this market opportunity. Top ideas will be adopted and implemented!/.toString(),"Preset Image":/\/CORE\/IMAGES\/apps_v3\/explore_header.png/.toString(),"Submit Displayed":false,"Browse Displayed":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Explore challenge title/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Disable Scheduler
        new actions.SetupScheduler.SetDisableScheduler().run("Status":/Active/.toString(),"Enable Submission":true,"Action":/Disable Schedule/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Explore challenge title/.toString(),"Area to Navigate to":/Home/.toString())
        //Verify Homepage Header 2
        new actions.WebstormHomepage.VerifyHomepageHeader2().run("Title":/Explore challenge title/.toString(),"Description":/Submit your ideas for products, services, and experiences that address this market opportunity. Top ideas will be adopted and implemented!/.toString(),"Preset Image":/\/CORE\/IMAGES\/apps_v3\/explore_header.png/.toString(),"Color of Submit Button":/rgb(236, 64, 122)/.toString(),"Submit Displayed":true,"Browse Displayed":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Explore challenge title/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Disable Scheduler
        new actions.SetupScheduler.SetDisableScheduler().run("Status":/Closed/.toString(),"Action":/Disable Schedule/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Explore challenge title/.toString(),"Area to Navigate to":/Home/.toString())
        //Verify Homepage Header 2
        new actions.WebstormHomepage.VerifyHomepageHeader2().run("Title":/Explore challenge title/.toString(),"Description":/Submit your ideas for products, services, and experiences that address this market opportunity. Top ideas will be adopted and implemented!/.toString(),"Preset Image":/\/CORE\/IMAGES\/apps_v3\/explore_header.png/.toString(),"Submit Displayed":false,"Browse Displayed":true)
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