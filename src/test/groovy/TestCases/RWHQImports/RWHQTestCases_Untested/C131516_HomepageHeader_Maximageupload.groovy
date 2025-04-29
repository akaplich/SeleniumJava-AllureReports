package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131516 - Homepage Header - Max image upload
class C131516_HomepageHeader_Maximageupload
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
        new actions.AppsPillar.SelectProductinAppsPillarPage().run("Product":/Programs/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Discuss/.toString(),"Sponsor Name":/pipelinesponsor@mailinator.com/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Test App/.toString(),"Description":/desc/.toString(),"Action":/Create/.toString(),"Action on General Information Tab":/Continue/.toString(),"Action on Design Tab":/Continue/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Test App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Site Setup for BI Beta tab
        new actions.SetupBI.SetSiteSetupforBIBetatab().run("Attachment Max Upload Filesize":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Test App/.toString(),"Area to Navigate to":/Home/.toString())
        //Verify Homepage Header 2
        new actions.WebstormHomepage.VerifyHomepageHeader2().run("Title":/Test App/.toString(),"Description":/Submit a note and engage in a discussion about this key theme with your peers. Be sure to subscribe to this forum so you can stay up to date./.toString(),"Preset Image":/\/CORE\/IMAGES\/apps_v3\/discuss_header.png/.toString(),"Submit Displayed":false,"Browse Displayed":true)
        //Set Edit Mode Homepage Header 2.0
        new actions.WebstormHomepage.SetEditHomepageHeader2().run([:])
        //Set Change Background or Other Modal Tab
        new actions.WebstormHomepage.SetChangeBackgroundmodal().run("Tab":/Generate Image/.toString())
        //Set Generate AI Image
        new actions.WebstormHomepage.SetGenerateAIImage().run("Text to Search":/yosemite/.toString(),"Action to Generate Images":/Click on Enter Key/.toString(),"AI Image Number to Click":/2/.toString(),"Action":/Add Image/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/File is too large. Limit is 1MB./.toString(),"Should Exist":true)
        //Set Change Background or Other Modal Tab
        new actions.WebstormHomepage.SetChangeBackgroundmodal().run("Tab":/Upload/.toString())
        //Set Upload your Own Background
        new actions.WebstormHomepage.SetUploadyourOwnBackground().run("Choose File":/image8.jpg/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/File is too large. Limit is 1MB./.toString(),"Should Exist":true)
        //Set Upload your Own Background
        new actions.WebstormHomepage.SetUploadyourOwnBackground().run("Action":/Cancel/.toString())
        //Set Change Background or Other Modal Tab
        new actions.WebstormHomepage.SetChangeBackgroundmodal().run("Tab":/Search Photos/.toString())
        //Set Preset or Unsplash Background Image in the Header
        new actions.WebstormHomepage.SetPresetBackgroundImageintheHeader().run("Unsplash Image Text":/over 2MB image/.toString(),"Unpslash Image Number":/1/.toString(),"Action":/Add Image/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/File is too large. Limit is 1MB./.toString(),"Should Exist":true)
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