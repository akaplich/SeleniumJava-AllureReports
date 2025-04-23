package TestCases.RWHQImports.SmokeTests

import BaseClasses.TestBase
import actions.API.Utils.CopyAffiliate
import actions.API.Utils.DeleteAffiliate
import actions.AppsPillar.SelectProductinAppsPillarPage
import actions.Utils.SettoLabEnvironment
import actions.Webstorm.VerifyWebstormHome
import actions.WebstormCreation.CreateAppWebstorm
import actions.general.Login
import actions.general.Navigate
import actions.selenium.Browser
import actions.selenium.CloseWindow
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C79 - Pipeline Creation - Create Discuss App
class TC_C79_PipelineCreation_CreateDiscussApp extends TestBase {
    private static def variables = [:]

    @BeforeAll
    public static void beforeState(){
        variables."URL" = /https:\/\/test.brightideatest.com/
        variables."Browser" = /Chrome/
        variables."TestRail_RunName" = null
        variables."TestRail_ExecutionName" = null
        variables."CodeEnvironment" = /Default/
        variables."Database" = null
        variables."Licensing Model" = /Standard Licensing Model/
        variables."Unlimited Brightidea Administrator License Type" = /1/
        variables."Brightidea Administrator License Type Purchased Count" = null
        variables."Unlimited Idea Box Manager License Type" = null
        variables."Idea Box Manager License Type Purchased Count" = null
    }

    @Test
    @Tag("Smoke")
    public void testcase(){
        //Basestate
        Action58123c20fa4ee77809f468f6(variables)
        //Navigate
        new Navigate().run("Area to Navigate to":/Apps/.toString())
        //Select Product in Apps Pillar Page
        new SelectProductinAppsPillarPage().run("Product":/Programs/.toString())
        //Create App Webstorm
        new CreateAppWebstorm().run("App Name":/Discuss/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Discuss forum title/.toString(),"Description":/Discuss forum description/.toString(),"Action":/Create/.toString())
        //Verify Initiative Home
        new VerifyWebstormHome().run("Initiative Title":/Discuss forum title/.toString(),"Initiative Description":/Submit a note and engage in a discussion about this key theme with your peers. Be sure to subscribe to this forum so you can stay up to date./.toString())
    }
    //Basestate
    public static def Action58123c20fa4ee77809f468f6(def params){
        //Create Affiliate based on Master Affiliate
        variables."affiliateURL" = new CopyAffiliate().run(params)
        //Open Browser
        new Browser().run("Run Browser in Incognito":/${params."Run Browser in Incognito"}/.toString(),"URL":/${variables."affiliateURL"}/.toString(),"Browser Type":/${variables."Browser"}/.toString())
        //Login
        new Login().run("Email":/${params."Username Email"}/.toString(),"Password":/brightidea1/.toString())
        //Set to Lab Environment
        new SettoLabEnvironment().run("Email":/${params."Username Email"}/.toString())

    }
    //Afterstate
    public static def Action581259c8fa4ee77809f46905(def params){
        captureScreenshot("TC_C79_PipelineCreation_CreateDiscussApp")
        try{
            //Close Current Window
            new CloseWindow().run([:])
        }
        catch(all){}catch(Error err){}
        //Delete Affiliate
        new DeleteAffiliate().run([:])

    }
    @AfterEach
    public void afterState(){
        //Afterstate
        Action581259c8fa4ee77809f46905([:])
    }
}