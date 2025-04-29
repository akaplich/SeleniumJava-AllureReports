import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C130532 - Security Questions - Request Invite - Required Fields
class C130532_SecurityQuestions_RequestInvite_RequiredFields
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
        //Set Enterprise Setup for BIOnly Beta tab
        new actions.SetupBI.SetEnterpriseSetupforBIOnlyBetatab().run(" Enable Security Questions":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site Registration Page
        new actions.SetupSite.SetEnterpriseSetupSiteRegistrationPage().run("Disable Self-Registration":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/*[@id="request-invite-link"]/.toString(),"ID Type":/XPath/.toString())
        //Set Text to Element
        new actions.selenium.SetText().run("ID":/\/\/input[@id='email']/.toString(),"Text":/brightC130532_1@mailinator.com/.toString())
        //Set Text to Element
        new actions.selenium.SetText().run("ID":/\/\/input[@id='first_name']/.toString(),"Text":/Anna/.toString())
        //Set Text to Element
        new actions.selenium.SetText().run("ID":/\/\/input[@id='last_name']/.toString(),"Text":/Kaplich/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/*[@id="register-button"]/.toString(),"ID Type":/XPath/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/3/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/*[@id="login-link"]/.toString(),"ID Type":/XPath/.toString())
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Add User in People page
        new actions.People.AddUserinPeoplepage().run("Email Address":/brightC130532_1@mailinator.com/.toString(),"First Name":/Anna/.toString(),"Last Name":/Kaplich/.toString(),"Action":/Add User/.toString())
        //Get Registration Link from Email
        variables."link" = new actions.Mailinator.GetRegistrationLinkfromEmail().run("Email Address":/brightC130532_1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        //Complete User Registration
        new actions.general.CompleteUserRegistration().run("Password":/brightidea1/.toString(),"Confirm Password":/brightidea1/.toString(),"Screen Name":/Screen Name/.toString())
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/INPUT[@id='security_question_answer']\/..\/..\/..\/*[contains(@class,'has-error')]/.toString(),"Should Element Exist":true,"Number of Matches":/1/.toString())
        //Complete User Registration
        new actions.general.CompleteUserRegistration().run("Password":/brightidea1/.toString(),"Confirm Password":/brightidea1/.toString(),"First Name":/Testing/.toString(),"Last Name":/One/.toString(),"Screen Name":/Screen Name/.toString(),"Security Question":/What is your mother's maiden name?/.toString(),"Answer":/Anna/.toString())
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