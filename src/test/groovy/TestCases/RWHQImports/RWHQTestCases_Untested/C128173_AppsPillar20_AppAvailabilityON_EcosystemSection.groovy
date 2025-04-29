import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C128173 - Apps Pillar 2.0 - App Availability ON - Ecosystem Section
class C128173_AppsPillar20_AppAvailabilityON_EcosystemSection
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
        //Set Enterprise Setup BIOnly for Apps Pillar 2.0
        new actions.SetupBI.SetEnterpriseSetupBIOnlyforAppsPillar20().run("Apps":["accelerate","venture"],"Availability":/false,false/.toString(),"Action":/Save/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Select Product in Apps Pillar Page
        new actions.AppsPillar.SelectProductinAppsPillarPage().run("Product":/Ecosystem/.toString())
        //Verify App Link on Apps Pillar 2.0
        new actions.AppsPillar.VerifyAppLinkAppsPillar20().run("App Name":/Accelerate/.toString(),"Placement Number":/1/.toString())
        //Verify App Link on Apps Pillar 2.0
        new actions.AppsPillar.VerifyAppLinkAppsPillar20().run("App Name":/Venture/.toString(),"Placement Number":/3/.toString())
        //Set Click On App Tile In Apps Pillar Page
        new actions.WebstormCreation.SetClickOnAppTileInAppsPillarPage().run("App Name":/Venture/.toString(),"Click on Setup button":false)
        //Set and Verify Schedule a Demo
        new actions.WebstormCreation.SetandVerifyScheduleaDemo().run("Action":/Schedule a Demo!/.toString(),"Verify the Modal Displayed":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup BIOnly for Apps Pillar 2.0
        new actions.SetupBI.SetEnterpriseSetupBIOnlyforAppsPillar20().run("Apps":["accelerate","venture"],"Availability":/true,true/.toString(),"Action":/Save/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Select Product in Apps Pillar Page
        new actions.AppsPillar.SelectProductinAppsPillarPage().run("Product":/Ecosystem/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Accelerate/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Accelerate title/.toString(),"Description":/Accelerate description/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Verify Initiative Home
        new actions.Webstorm.VerifyWebstormHome().run("Initiative Title":/Accelerate title/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Select Product in Apps Pillar Page
        new actions.AppsPillar.SelectProductinAppsPillarPage().run("Product":/Ecosystem/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Scout/.toString(),"Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Scout Process Test/.toString(),"Description":/Description/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Admin Field Name":/Pipeline Administrators/.toString(),"Pipeline Administrators":/Pipeline Admin/.toString(),"Administrators Add or Remove":/Add/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Verify Initiative Home
        new actions.Webstorm.VerifyWebstormHome().run("Initiative Title":/Scout Process Test/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Select Product in Apps Pillar Page
        new actions.AppsPillar.SelectProductinAppsPillarPage().run("Product":/Ecosystem/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Venture/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Venture title/.toString(),"Description":/Venture description/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Verify Initiative Home
        new actions.Webstorm.VerifyWebstormHome().run("Initiative Title":/Venture title/.toString())
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