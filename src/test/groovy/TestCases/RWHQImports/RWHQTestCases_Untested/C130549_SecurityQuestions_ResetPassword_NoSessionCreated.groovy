import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C130549 - Security Questions - Reset Password - No Session Created
class C130549_SecurityQuestions_ResetPassword_NoSessionCreated
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
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Add User in People page
        new actions.People.AddUserinPeoplepage().run("Email Address":/brightC130549@mailinator.com/.toString(),"First Name":/FN/.toString(),"Last Name":/LN/.toString(),"Screen Name":/SN/.toString(),"Administrator":true,"Action":/Add User/.toString())
        //Get Registration Link from Email
        variables."link" = new actions.Mailinator.GetRegistrationLinkfromEmail().run("Email Address":/brightc130549/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        //Complete User Registration
        new actions.general.CompleteUserRegistration().run("Password":/brightidea1/.toString(),"Confirm Password":/brightidea1/.toString(),"Screen Name":/Screen Name/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for BIOnly Beta tab
        new actions.SetupBI.SetEnterpriseSetupforBIOnlyBetatab().run(" Enable Security Questions":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/A[text()='Forgot password?']/.toString(),"ID Type":/XPath/.toString())
        //Set Text to Element
        new actions.selenium.SetText().run("ID":/\/\/*[@id="emailAddress"]/.toString(),"ID Type":/XPath/.toString(),"Text":/brightc130549@mailinator.com/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/*[@id="send-button"]/.toString(),"ID Type":/XPath/.toString())
        //Get Reset Password Link from Email
        variables."link" = new actions.Mailinator.GetResetPasswordLinkfromEmail().run("Email Address":/brightc130549@mailinator.com/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        //Set Enterprise Password Change
        new actions.Enterprise.SetEnterprisePasswordChange().run("New Password":/brightidea2/.toString(),"Confirm Password":/brightidea2/.toString())
        //Login
        new actions.general.Login().run("Webstorm Login":false,"Email":/brightc130549@mailinator.com/.toString(),"Password":/brightidea2/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Home/.toString())
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