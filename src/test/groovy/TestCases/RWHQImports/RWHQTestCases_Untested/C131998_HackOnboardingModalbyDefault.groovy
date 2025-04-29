package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131998 - Hack Onboarding Modal by Default
class C131998_HackOnboardingModalbyDefault
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
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Optimize/.toString(),"Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Optimize/.toString(),"Description":/Optimize Desc/.toString(),"Early Access":/ALL/.toString(),"Early Access Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Disable Scheduler
        new actions.SetupScheduler.SetDisableScheduler().run("Status":/Active/.toString(),"Enable Submission":true,"Enable Voting":true,"Enable Commenting":true,"Action":/Disable Schedule/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Webstorm Setup Site General Settings Page
        new actions.SetupSite.SetWebstormSetupSiteGeneralSettingsPage().run([:])
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Onboarding for Hackathon/.toString(),"Should Exist":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Optimize/.toString(),"Area to Navigate to":/Home/.toString())
        //Verify Homepage Header 2
        new actions.WebstormHomepage.VerifyHomepageHeader2().run("Title":/Optimize/.toString(),"Description":/Submit an improvement and help us optimize this area of the business. Top improvements will be adopted and implemented!/.toString(),"Submit Displayed":true,"Browse Displayed":true,"Registration":false)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Apply Filter on Apps Pillar 2.0
        new actions.AppsPillar.ApplyFilterAppsPillar20().run("Filter Option":/Programs/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Pitch/.toString(),"Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Pitch/.toString(),"Description":/Pitch Desc/.toString(),"Early Access":/ALL/.toString(),"Early Access Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Disable Scheduler
        new actions.SetupScheduler.SetDisableScheduler().run("Status":/Active/.toString(),"Enable Submission":true,"Enable Voting":true,"Enable Commenting":true,"Action":/Disable Schedule/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Webstorm Setup Site General Settings Page
        new actions.SetupSite.SetWebstormSetupSiteGeneralSettingsPage().run([:])
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Onboarding for Hackathon/.toString(),"Should Exist":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pitch/.toString(),"Area to Navigate to":/Home/.toString())
        //Verify Homepage Header 2
        new actions.WebstormHomepage.VerifyHomepageHeader2().run("Title":/Pitch/.toString(),"Description":/Top selected ideas will be developed into business plans and pitched to a panel of judges for a chance to receive funding./.toString(),"Submit Displayed":true,"Browse Displayed":false,"Registration":false)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Apply Filter on Apps Pillar 2.0
        new actions.AppsPillar.ApplyFilterAppsPillar20().run("Filter Option":/Ecosystem/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Accelerate/.toString(),"Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Accelerate/.toString(),"Description":/Accelerate Desc/.toString(),"Action":/Create/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Webstorm Setup Site General Settings Page
        new actions.SetupSite.SetWebstormSetupSiteGeneralSettingsPage().run([:])
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Onboarding for Hackathon/.toString(),"Should Exist":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Accelerate/.toString(),"Area to Navigate to":/Home/.toString())
        //Verify Homepage Header 2
        new actions.WebstormHomepage.VerifyHomepageHeader2().run("Title":/Accelerate/.toString(),"Description":/Building the future of finance together./.toString(),"Submit Displayed":true,"Browse Displayed":true,"Registration":false)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Apply Filter on Apps Pillar 2.0
        new actions.AppsPillar.ApplyFilterAppsPillar20().run("Filter Option":/Ecosystem/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Scout/.toString(),"Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Scout/.toString(),"Description":/Scout Desc/.toString(),"Action":/Create/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Webstorm Setup Site General Settings Page
        new actions.SetupSite.SetWebstormSetupSiteGeneralSettingsPage().run([:])
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Onboarding for Hackathon/.toString(),"Should Exist":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Scout/.toString(),"Area to Navigate to":/Home/.toString())
        //Verify Homepage Header 2
        new actions.WebstormHomepage.VerifyHomepageHeader2().run("Title":/Scout/.toString(),"Submit Displayed":true,"Browse Displayed":true,"Registration":false)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Apply Filter on Apps Pillar 2.0
        new actions.AppsPillar.ApplyFilterAppsPillar20().run("Filter Option":/Labs/.toString())
        //Create Solve Webstorm
        new actions.WebstormCreation.CreateSolveWebstorm().run("App Name":/Apply/.toString(),"Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Apply/.toString(),"Challenge Brief":/Apply Desc/.toString(),"Action on General Information Tab":/Continue/.toString(),"Choose Design Template":/Use Default Design/.toString(),"Action on Design Tab":/Continue/.toString(),"Action on Participants Tab":/Continue/.toString(),"Action on Site Schedule Tab":/Continue/.toString(),"Action":/Create/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Disable Scheduler
        new actions.SetupScheduler.SetDisableScheduler().run("Status":/Active/.toString(),"Enable Submission":true,"Enable Voting":true,"Enable Commenting":true,"Action":/Disable Schedule/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Webstorm Setup Site General Settings Page
        new actions.SetupSite.SetWebstormSetupSiteGeneralSettingsPage().run([:])
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Onboarding for Hackathon/.toString(),"Should Exist":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Apply/.toString(),"Area to Navigate to":/Home/.toString())
        //Verify Homepage Header 2
        new actions.WebstormHomepage.VerifyHomepageHeader2().run("Title":/Apply/.toString(),"Submit Displayed":true,"Browse Displayed":true,"Registration":false)
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