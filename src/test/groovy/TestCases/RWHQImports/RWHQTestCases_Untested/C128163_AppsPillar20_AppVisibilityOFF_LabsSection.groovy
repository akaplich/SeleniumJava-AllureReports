import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C128163 - Apps Pillar 2.0 - App Visibility OFF - Labs Section
class C128163_AppsPillar20_AppVisibilityOFF_LabsSection
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
        new actions.SetupBI.SetEnterpriseSetupBIOnlyforAppsPillar20().run("Apps":["apply","incubate","monitor","understand"],"Visibility":/false,false,false,false,false/.toString(),"Action":/Save/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Discuss/.toString(),"Should Exist":true)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Apply/.toString(),"Should Exist":false)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Incubate/.toString(),"Should Exist":false)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Monitor/.toString(),"Should Exist":false)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Understand/.toString(),"Should Exist":false)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Apply/.toString(),"Should Exist":false)
        try{
            //Create App Webstorm
            new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Monitor/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Monitor Forum title/.toString(),"Description":/Monitor Forum description/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Monitor Forum title/.toString(),"Should Exist":false)
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