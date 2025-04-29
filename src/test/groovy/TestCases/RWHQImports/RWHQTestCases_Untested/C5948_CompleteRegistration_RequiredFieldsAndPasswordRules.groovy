import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C5948 - Complete Registration - Required Fields & Password Rules
class C5948_CompleteRegistration_RequiredFieldsAndPasswordRules
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
        //Return Affiliate Name
        variables."affName" = new actions.general.ReturnAffiliateName().run("Affiliate URL":/${variables."affiliateURL"}/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Register user from Login page
        new actions.general.RegisteruserfromLoginpage().run("Email Address":/${variables."affName"}C5948@mailinator.com/.toString(),"First Name":/test/.toString(),"Last Name":/user/.toString())
        //Get Registration Link from Email
        variables."DownloadURLC5948" = new actions.Mailinator.GetRegistrationLinkfromEmail().run("Email Address":/${variables."affName"}C5948/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."DownloadURLC5948"}/.toString())
        //Complete User Registration
        new actions.general.CompleteUserRegistration().run([:])
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Please fill out your profile to complete registration/.toString(),"Should Exist":true)
        //Complete User Registration
        new actions.general.CompleteUserRegistration().run("Password":/abc/.toString(),"Confirm Password":/abc/.toString(),"First Name":/test/.toString(),"Last Name":/user/.toString(),"Screen Name":/test user/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Please fill out your profile to complete registration/.toString(),"Should Exist":true)
        //Complete User Registration
        new actions.general.CompleteUserRegistration().run("Password":/abcdef/.toString(),"Confirm Password":/abcdef/.toString(),"First Name":/test/.toString(),"Last Name":/user/.toString(),"Screen Name":/test user/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Please fill out your profile to complete registration/.toString(),"Should Exist":true)
        //Complete User Registration
        new actions.general.CompleteUserRegistration().run("Password":/abcdef1/.toString(),"Confirm Password":/abcdef1/.toString(),"First Name":/test/.toString(),"Last Name":/user/.toString(),"Screen Name":/test user/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/${variables."affName"}C5948@mailinator.com/.toString(),"Password":/abcdef1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
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