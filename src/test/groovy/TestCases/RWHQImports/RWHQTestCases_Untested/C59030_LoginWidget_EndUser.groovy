package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C59030 - Login Widget - End User
class C59030_LoginWidget_EndUser
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
        Action58123c20fa4ee77809f468f6("Username Email":/bi.enduser1@brightidea.com/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Profile/.toString())
        //Edit Your Profile
        new actions.UserProfile.EditYourProfile().run("Screen Name":/Participant User1/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Site Components Page
        new actions.SetupSite.SetWebstormSetupSiteComponentsPage().run("Enable Global Navigation on this Initiative":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Home/.toString())
        //Verify and Access Enterprise Login Widget
        new actions.Widgets.VerifyandAccessEnterpriseLoginWidget().run("Logout or Setup":/Logout/.toString(),"Screen Name":/System Admin/.toString())
        //Login
        new actions.general.Login().run("Webstorm Login":true,"Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        try{
            //Verify and Access Enterprise Login Widget
            new actions.Widgets.VerifyandAccessEnterpriseLoginWidget().run("Logout or Setup":/Setup/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Set Webstorm Setup Site Info Page
            new actions.SetupSite.SetWebstormSetupSiteInfoPage().run("Webstorm Description":/New Description/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Initiative Home
        new actions.Webstorm.VerifyWebstormHome().run("Webstorm Title":/Custom App/.toString(),"Webstorm Description":/Custom App Desc/.toString())
        //Verify and Access Enterprise Login Widget
        new actions.Widgets.VerifyandAccessEnterpriseLoginWidget().run("Logout or Setup":/Logout/.toString(),"Screen Name":/Participant User1/.toString())
        //Login
        new actions.general.Login().run("Webstorm Login":true,"Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
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