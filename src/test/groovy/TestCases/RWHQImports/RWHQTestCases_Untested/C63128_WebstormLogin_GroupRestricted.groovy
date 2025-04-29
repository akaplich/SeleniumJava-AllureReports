package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C63128 - Webstorm Login - Group Restricted
class C63128_WebstormLogin_GroupRestricted
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
        //Manage Webstorms from Enterprise Setup page
        new actions.SetupEnterpriseWebStorms.ManageWebstormsfromEnterpriseSetuppage().run("Webstorms":/Custom App/.toString(),"Group":/ALL/.toString(),"Add or Remove Group":/Remove/.toString())
        //Manage Webstorms from Enterprise Setup page
        new actions.SetupEnterpriseWebStorms.ManageWebstormsfromEnterpriseSetuppage().run("Webstorms":/Custom App/.toString(),"Group":/Moderator Group/.toString(),"Search or All":/Search/.toString(),"Add or Remove Group":/Add/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/CustomApp/.toString())
        //Login
        new actions.general.Login().run("Webstorm Login":true,"Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/You are not permitted to view this Campaign./.toString(),"Should Exist":true)
        //Login
        new actions.general.Login().run("Webstorm Login":true,"Email":/moderator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Verify Initiative Home
        new actions.Webstorm.VerifyWebstormHome().run("Webstorm Title":/Custom App/.toString())
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