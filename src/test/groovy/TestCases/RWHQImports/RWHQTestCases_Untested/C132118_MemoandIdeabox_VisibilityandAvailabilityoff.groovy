import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C132118 - Memo and Idea box - Visibility and Availability off
class C132118_MemoandIdeabox_VisibilityandAvailabilityoff
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
        new actions.SetupBI.SetEnterpriseSetupBIOnlyforAppsPillar20().run("Apps":["idea_box_instance"],"Availability":/false/.toString(),"Action":/Save/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Set Click On App Tile In Apps Pillar Page
        new actions.WebstormCreation.SetClickOnAppTileInAppsPillarPage().run("App Name":/Instance Ideabox/.toString(),"Click on Setup button":false)
        //Set and Verify Schedule a Demo
        new actions.WebstormCreation.SetandVerifyScheduleaDemo().run("Action":/Try for free/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/1/.toString())
        //Verify & Return Current URL Value
        new actions.selenium.VerifyURL().run("Value":/https:\/\/www.brightidea.com\/start-ideabox-trial\/?in-product-expansion/.toString())
        //Close All Browsers
        new actions.selenium.CloseBrowser().run([:])
        //Open Browser
        new actions.selenium.Browser().run("URL":/${variables."affiliateURL"}/.toString(),"Browser Type":/Chrome/.toString())
        try{
            //Login
            new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        }
       catch(all){}catch(Error err){}
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup BIOnly for Apps Pillar 2.0
        new actions.SetupBI.SetEnterpriseSetupBIOnlyforAppsPillar20().run("Apps":["idea_box_instance","memo"],"Availability":/true,false/.toString(),"Action":/Save/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Set Click On App Tile In Apps Pillar Page
        new actions.WebstormCreation.SetClickOnAppTileInAppsPillarPage().run("App Name":/Memo/.toString(),"Click on Setup button":false)
        //Set and Verify Schedule a Demo
        new actions.WebstormCreation.SetandVerifyScheduleaDemo().run("Action":/Try for free/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/1/.toString())
        //Verify & Return Current URL Value
        new actions.selenium.VerifyURL().run("Value":/https:\/\/www.brightidea.com\/memo\/start-memo-trial\/?in-product-expansion/.toString())
        //Close All Browsers
        new actions.selenium.CloseBrowser().run([:])
        //Open Browser
        new actions.selenium.Browser().run("URL":/${variables."affiliateURL"}/.toString(),"Browser Type":/Chrome/.toString())
        try{
            //Login
            new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        }
       catch(all){}catch(Error err){}
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup BIOnly for Apps Pillar 2.0
        new actions.SetupBI.SetEnterpriseSetupBIOnlyforAppsPillar20().run("Apps":["idea_box_instance"],"Visibility":/false/.toString(),"Action":/Save/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Verify Element Exists
        new actions.general.VerifyElement().run("ID":/\/\/*[@id='app-card-idea_box_instance']/.toString(),"ID Type":/XPath/.toString(),"Number of Matches":/0/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup BIOnly for Apps Pillar 2.0
        new actions.SetupBI.SetEnterpriseSetupBIOnlyforAppsPillar20().run("Apps":["idea_box_instance","memo"],"Visibility":/true,false/.toString(),"Action":/Save/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Memo/.toString(),"Should Exist":false)
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