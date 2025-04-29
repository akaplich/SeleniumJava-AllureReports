import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132299 - Duplicate Initiative - Copy Homepage Header and Campaign Image
class C132299_DuplicateInitiative_CopyHomepageHeaderandCampaignImage
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
        new actions.AppsPillar.SelectProductinAppsPillarPage().run("Product":/Transformation/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Suggest/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Suggest process title/.toString(),"Description":/Suggest process description/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Set Edit Mode Homepage Header 2.0
        new actions.WebstormHomepage.SetEditHomepageHeader2().run([:])
        //Set Change Background or Other Modal Tab
        new actions.WebstormHomepage.SetChangeBackgroundmodal().run([:])
        //Set Preset or Unsplash Background Image in the Header
        new actions.WebstormHomepage.SetPresetBackgroundImageintheHeader().run("Preset Image Name":/timebox/.toString(),"Action":/Add Image/.toString())
        //Set Homepage Header
        new actions.WebstormHomepage.SetHomepageHeaderMenu().run("Action":/Save/.toString())
        //Set Edit Mode Homepage Header 2.0
        new actions.WebstormHomepage.SetEditHomepageHeader2().run([:])
        //Set Color of Submit button on Homepage Header2.0
        new actions.WebstormHomepage.SetColorofSubmitbuttononHomepageHeader2().run("Color":/#A89C2D/.toString())
        //Set Homepage Header
        new actions.WebstormHomepage.SetHomepageHeaderMenu().run("Action":/Save/.toString())
        //Verify Homepage Header 2
        new actions.WebstormHomepage.VerifyHomepageHeader2().run("Title":/Suggest process title/.toString(),"Preset Image":/\/CORE\/IMAGES\/apps_v3\/timeboxed_builder_header.png/.toString(),"Color of Submit Button":/background: rgb(168, 156, 45)/.toString(),"Submit Displayed":true,"Browse Displayed":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Duplicate Webstorm
        new actions.WebstormCreation.CreateDuplicateWebstorm().run("Name":/Duplicate of Suggest process title/.toString(),"Description":/Desc/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Action":/Duplicate/.toString(),"Should Admin Wait for Pipeline to be Created":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Duplicate of Suggest process title/.toString(),"Area to Navigate to":/Home/.toString())
        //Verify Homepage Header 2
        new actions.WebstormHomepage.VerifyHomepageHeader2().run("Title":/Duplicate of Suggest process title/.toString(),"Preset Image":/\/CORE\/IMAGES\/apps_v3\/timeboxed_builder_header.png/.toString(),"Color of Submit Button":/background: rgb(168, 156, 45)/.toString(),"Submit Displayed":true,"Browse Displayed":true)
        //Compare Images
        new actions.selenium.CompareImages().run("Element ID (optional)":/\/\/*[contains(@class,'nav-desktop')]/.toString(),"Expected Image File":/C132299ExpectedImage.png/.toString(),"Actual Image Name":/C132299ActualImage.png/.toString())
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
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Name":/C132299ActualImage.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Name":/difference.png/.toString())
        }
       catch(all){}catch(Error err){}
        //Afterstate
        Action581259c8fa4ee77809f46905([:])
    }
}