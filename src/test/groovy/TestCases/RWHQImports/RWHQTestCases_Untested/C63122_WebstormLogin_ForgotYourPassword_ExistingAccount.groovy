import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C63122 - Webstorm Login - Forgot Your Password - Existing Account
class C63122_WebstormLogin_ForgotYourPassword_ExistingAccount
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
        //Create Mailinator User
        new actions.Mailinator.CreateMailinatorUser().run("Email":/brightC63122_1/.toString(),"Enterprise System Administrator":false)
        //Log Out
        new actions.general.LogOut().run([:])
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/CustomApp/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/A[text()='forgot your password?']/.toString(),"ID Type":/XPath/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/We will send a confirmation e-mail to the e-mail address you supply./.toString(),"Should Exist":true)
        //Set Text to Element
        new actions.selenium.SetText().run("ID":/\/\/*[@id='fp_email']/.toString(),"ID Type":/XPath/.toString(),"Text":/brightC63122_1@mailinator.com/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/*[@id='reset_pw_btn']/.toString(),"ID Type":/XPath/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/E-mail sent! Please check your e-mail./.toString(),"Should Exist":true)
        //Get Reset Password Link from Email
        variables."C63122PwLink" = new actions.Mailinator.GetResetPasswordLinkfromEmail().run("Email Address":/brightC63122_1@mailinator.com/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."C63122PwLink"}/.toString())
        //Set Webstorm Password Change
        new actions.Webstorm.SetPasswordChange().run("Choose Password":/innovate1/.toString(),"Confirm Password":/innovate1/.toString())
        //Verify Initiative Home
        new actions.Webstorm.VerifyWebstormHome().run("Initiative Title":/Custom App/.toString(),"Initiative Description":/Custom App Desc/.toString())
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