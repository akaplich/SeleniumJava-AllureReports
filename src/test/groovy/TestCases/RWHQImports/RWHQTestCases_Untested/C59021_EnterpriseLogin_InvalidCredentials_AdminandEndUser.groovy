import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C59021 - Enterprise Login - Invalid Credentials - Admin and End User
class C59021_EnterpriseLogin_InvalidCredentials_AdminandEndUser
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
        //Log Out
        new actions.general.LogOut().run([:])
        //Set Text to Element
        new actions.selenium.SetText().run("ID":/\/\/*[@id="emailAddress"]/.toString(),"ID Type":/XPath/.toString(),"Text":/bi.adminuser@brightidea.com/.toString())
        //Set Text to Element
        new actions.selenium.SetText().run("ID":/\/\/*[@id="password"]/.toString(),"ID Type":/XPath/.toString(),"Text":/brightidea/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/*[@id="login-button"]/.toString(),"ID Type":/XPath/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/We didn't recognize that email and password combination. Please enter your login credentials again./.toString(),"Should Exist":true)
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Set Text to Element
        new actions.selenium.SetText().run("ID":/\/\/*[@id="emailAddress"]/.toString(),"ID Type":/XPath/.toString(),"Text":/bi.adminuser@brightidea.com/.toString())
        //Set Text to Element
        new actions.selenium.SetText().run("ID":/\/\/*[@id="password"]/.toString(),"ID Type":/XPath/.toString(),"Text":/brightidea1/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/*[@id="login-button"]/.toString(),"ID Type":/XPath/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/We didn't recognize that email and password combination. Please enter your login credentials again./.toString(),"Should Exist":true)
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Set Text to Element
        new actions.selenium.SetText().run("ID":/\/\/*[@id="emailAddress"]/.toString(),"ID Type":/XPath/.toString(),"Text":/bi.adminuser1@brightidea.com/.toString())
        //Set Text to Element
        new actions.selenium.SetText().run("ID":/\/\/*[@id="password"]/.toString(),"ID Type":/XPath/.toString(),"Text":/brightidea/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/*[@id="login-button"]/.toString(),"ID Type":/XPath/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/We didn't recognize that email and password combination. Please enter your login credentials again./.toString(),"Should Exist":true)
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Set Text to Element
        new actions.selenium.SetText().run("ID":/\/\/*[@id="emailAddress"]/.toString(),"ID Type":/XPath/.toString(),"Text":/bi.enduser1@brightidea.com/.toString())
        //Set Text to Element
        new actions.selenium.SetText().run("ID":/\/\/*[@id="password"]/.toString(),"ID Type":/XPath/.toString(),"Text":/brightidea/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/*[@id="login-button"]/.toString(),"ID Type":/XPath/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/We didn't recognize that email and password combination. Please enter your login credentials again./.toString(),"Should Exist":true)
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