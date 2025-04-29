package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C128179 - Apps Pillar 2.0 - App Category Filters
class C128179_AppsPillar20_AppCategoryFilters
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
        //Set Enterprise Setup BIOnly for Apps Pillar 2.0
        new actions.SetupBI.SetEnterpriseSetupBIOnlyforAppsPillar20().run("Apps":["discuss"],"Availability":/false/.toString(),"Action":/Save/.toString())
        //Set Enterprise Setup BIOnly for Apps Pillar 2.0
        new actions.SetupBI.SetEnterpriseSetupBIOnlyforAppsPillar20().run("Apps":["solve"],"Visibility":/false/.toString(),"Action":/Save/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Apply Filter on Apps Pillar 2.0
        new actions.AppsPillar.ApplyFilterAppsPillar20().run("Filter Option":/New Products/.toString())
        //Verify App Link on Apps Pillar 2.0
        new actions.AppsPillar.VerifyAppLinkAppsPillar20().run("App Name":/Apply/.toString())
        //Verify App Link on Apps Pillar 2.0
        new actions.AppsPillar.VerifyAppLinkAppsPillar20().run("App Name":/Accelerate/.toString())
        //Verify App Link on Apps Pillar 2.0
        new actions.AppsPillar.VerifyAppLinkAppsPillar20().run("App Name":/Consult/.toString())
        //Verify App Link on Apps Pillar 2.0
        new actions.AppsPillar.VerifyAppLinkAppsPillar20().run("App Name":/Explore/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Solve a Problem/.toString(),"Should Exist":false)
        //Apply Filter on Apps Pillar 2.0
        new actions.AppsPillar.ApplyFilterAppsPillar20().run("Filter Option":/All Products/.toString())
        //Verify App Link on Apps Pillar 2.0
        new actions.AppsPillar.VerifyAppLinkAppsPillar20().run("App Name":/Discuss/.toString())
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