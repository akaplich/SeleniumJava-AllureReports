import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C130812 - Homepage Header 2 - Save on clicking outside the homepage header
class C130812_HomepageHeader2_Saveonclickingoutsidethehomepageheader
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
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Home/.toString())
        //Verify Homepage Header 2
        new actions.WebstormHomepage.VerifyHomepageHeader2().run("Title":/Custom App/.toString(),"Description":/Your description should explain the purpose of this Initiative and the types of submissions/.toString(),"Preset Image":/\/CORE\/IMAGES\/apps_v3\/custom_header.jpeg/.toString(),"Color of Submit Button":/rgb(149, 165, 166)/.toString(),"Submit Displayed":true,"Browse Displayed":true)
        //Set Edit Mode Homepage Header 2.0
        new actions.WebstormHomepage.SetEditHomepageHeader2().run([:])
        //Set Color of Submit button on Homepage Header2.0
        new actions.WebstormHomepage.SetColorofSubmitbuttononHomepageHeader2().run("Color":/#A89C2D/.toString())
        //Set Change Background or Other Modal Tab
        new actions.WebstormHomepage.SetChangeBackgroundmodal().run("Tab":/Presets/.toString())
        //Set Preset or Unsplash Background Image in the Header
        new actions.WebstormHomepage.SetPresetBackgroundImageintheHeader().run("Preset Image Name":/timebox/.toString(),"Action":/Add Image/.toString())
        //Set Homepage Header
        new actions.WebstormHomepage.SetHomepageHeaderMenu().run("Title":/This is to testing edited Custom App/.toString(),"Description":/Your description should explain the purpose of this Initiative edited version/.toString(),"Click on Edit Dropdown":true,"Browse":false)
        try{
            //Set Widget Controller
            new actions.Widgets.SetWidgetController().run([:])
        }
       catch(all){}catch(Error err){}
        //Verify Homepage Header 2
        new actions.WebstormHomepage.VerifyHomepageHeader2().run("Title":/This is to testing edited Custom App/.toString(),"Description":/Your description should explain the purpose of this Initiative edited version/.toString(),"Preset Image":/\/CORE\/IMAGES\/apps_v3\/timeboxed_builder_header.png/.toString(),"Color of Submit Button":/rgb(168, 156, 45)/.toString(),"Submit Displayed":true,"Browse Displayed":false)
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