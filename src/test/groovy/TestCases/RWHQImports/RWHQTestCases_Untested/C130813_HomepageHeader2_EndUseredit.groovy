package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C130813 - Homepage Header 2 - End User edit
class C130813_HomepageHeader2_EndUseredit
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
        //Select Product in Apps Pillar Page
        new actions.AppsPillar.SelectProductinAppsPillarPage().run("Product":/Build/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Custom App/.toString(),"Description":/testing for fun/.toString(),"Action":/Create/.toString())
        //Verify Initiative Home
        new actions.Webstorm.VerifyWebstormHome().run("Initiative Title":/Custom App/.toString(),"Initiative Description":/testing for fun/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Site General Settings Page
        new actions.SetupSite.SetWebstormSetupSiteGeneralSettingsPage().run("Welcome Header":/Welcome Header 2.0/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Home/.toString())
        try{
            //Set Edit Mode Homepage Header 2.0
            new actions.WebstormHomepage.SetEditHomepageHeader2().run([:])
        }
       catch(all){}catch(Error err){}
        try{
            //Set Homepage Header
            new actions.WebstormHomepage.SetHomepageHeaderMenu().run("Title":/This is to testing edited Custom App/.toString(),"Description":/Your description should explain the purpose of this Initiative edited version/.toString(),"Click on Edit Dropdown":true,"Submit":false,"Browse":false,"Action":/Cancel/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Homepage Header 2
        new actions.WebstormHomepage.VerifyHomepageHeader2().run("Title":/Custom App/.toString(),"Description":/Your description should explain the purpose of this Initiative and the types of submissions/.toString(),"Preset Image":/\/CORE\/IMAGES\/apps_v3\/custom_header.jpeg/.toString(),"Color of Submit Button":/rgb(149, 165, 166)/.toString(),"Submit Displayed":true,"Browse Displayed":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/CustomApp?editMode=header/.toString())
        try{
            //Set Homepage Header
            new actions.WebstormHomepage.SetHomepageHeaderMenu().run("Title":/This is to testing edited Custom App/.toString(),"Description":/Your description should explain the purpose of this Initiative edited version/.toString(),"Click on Edit Dropdown":true,"Submit":false,"Browse":false,"Action":/Cancel/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Homepage Header 2
        new actions.WebstormHomepage.VerifyHomepageHeader2().run("Title":/Custom App/.toString(),"Description":/Your description should explain the purpose of this Initiative and the types of submissions/.toString(),"Preset Image":/\/CORE\/IMAGES\/apps_v3\/custom_header.jpeg/.toString(),"Color of Submit Button":/rgb(149, 165, 166)/.toString(),"Submit Displayed":true,"Browse Displayed":true)
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