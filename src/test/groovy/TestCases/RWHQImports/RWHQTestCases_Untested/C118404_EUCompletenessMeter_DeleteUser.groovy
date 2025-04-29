package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C118404 - EU Completeness Meter - Delete User
class C118404_EUCompletenessMeter_DeleteUser
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
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString(),"Highlights":true,"Onboarding Panel":true,"Activities":true,"My Ideas":true,"Submissions":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Home/.toString())
        //Subscribe to Challenge
        new actions.Webstorm.SubscribetoChallenge().run("Subscribe or Unsubscribe":/Subscribe/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/test idea3/.toString(),"Description":/desc/.toString(),"Category":/New Product/.toString(),"Required Short Question":/short/.toString(),"Action":/Submit Idea/.toString())
        //Capture My Idea
        new actions.Enterprise.UserHomepage.CaptureMyIdea().run("Capture My Idea from":/Global Nav/.toString(),"Description":/desc/.toString(),"Action":/Save/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Verify Onboarding Panel Meter Item
        new actions.Enterprise.UserHomepage.VerifyOnboardingPanelMeterItem().run("Completed Total":/5 of 6 completed/.toString(),"Item Name":/Upload a profile photo/.toString(),"Completed":false)
        //Verify Onboarding Panel Meter Item
        new actions.Enterprise.UserHomepage.VerifyOnboardingPanelMeterItem().run("Completed Total":/5 of 6 completed/.toString(),"Item Name":/Capture an idea/.toString(),"Completed":true)
        //Verify Onboarding Panel Meter Item
        new actions.Enterprise.UserHomepage.VerifyOnboardingPanelMeterItem().run("Completed Total":/5 of 6 completed/.toString(),"Item Name":/Visit an activity/.toString(),"Completed":true)
        //Verify Onboarding Panel Meter Item
        new actions.Enterprise.UserHomepage.VerifyOnboardingPanelMeterItem().run("Completed Total":/5 of 6 completed/.toString(),"Item Name":/Subscribe to an activity/.toString(),"Completed":true)
        //Verify Onboarding Panel Meter Item
        new actions.Enterprise.UserHomepage.VerifyOnboardingPanelMeterItem().run("Completed Total":/5 of 6 completed/.toString(),"Item Name":/Create a submission/.toString(),"Completed":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Users Manage page
        new actions.SetupUsers.SetEnterpriseSetupUsersManagepage().run("Existing User's Email or New":/bi.enduser1@brightidea.com/.toString(),"Action":/Delete User/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Users Manage page
        new actions.SetupUsers.SetEnterpriseSetupUsersManagepage().run("Existing User's Email or New":/New/.toString(),"New User's Email":/bi.enduser1@brightidea.com/.toString(),"New User's Screenname":/End User/.toString(),"Action":/Create/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Verify Onboarding Panel Meter Item
        new actions.Enterprise.UserHomepage.VerifyOnboardingPanelMeterItem().run("Completed Total":/1 of 6 completed/.toString(),"Item Name":/Upload a profile photo/.toString(),"Completed":false)
        //Verify Onboarding Panel Meter Item
        new actions.Enterprise.UserHomepage.VerifyOnboardingPanelMeterItem().run("Completed Total":/1 of 6 completed/.toString(),"Item Name":/Capture an idea/.toString(),"Completed":false)
        //Verify Onboarding Panel Meter Item
        new actions.Enterprise.UserHomepage.VerifyOnboardingPanelMeterItem().run("Completed Total":/1 of 6 completed/.toString(),"Item Name":/Visit an activity/.toString(),"Completed":false)
        //Verify Onboarding Panel Meter Item
        new actions.Enterprise.UserHomepage.VerifyOnboardingPanelMeterItem().run("Completed Total":/1 of 6 completed/.toString(),"Item Name":/Subscribe to an activity/.toString(),"Completed":false)
        //Verify Onboarding Panel Meter Item
        new actions.Enterprise.UserHomepage.VerifyOnboardingPanelMeterItem().run("Completed Total":/1 of 6 completed/.toString(),"Item Name":/Create a submission/.toString(),"Completed":false)
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