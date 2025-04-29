package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C625 - Invalid email address validation
class C625_Invalidemailaddressvalidation
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
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        try{
            //Create App Webstorm
            new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Discuss/.toString(),"Sponsor Name":/plainaddress/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/DiscussApp1/.toString(),"Description":/Desc/.toString(),"Action":/Create/.toString())
        }
       catch(all){}catch(Error err){}
        //Close Current Window
        new actions.selenium.CloseWindow().run([:])
        //Open Browser
        new actions.selenium.Browser().run("Run Browser in Incognito":/TRUE/.toString(),"URL":/${variables."affiliateURL"}/.toString(),"Browser Type":/${variables."Browser"}/.toString())
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        try{
            //Create App Webstorm
            new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Discuss/.toString(),"Sponsor Name":/End User/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/DiscussApp2/.toString(),"Description":/Desc/.toString(),"Pipeline Administrators":/email@brightidea@brightidea.com/.toString(),"Administrators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        }
       catch(all){}catch(Error err){}
        //Close Current Window
        new actions.selenium.CloseWindow().run([:])
        //Open Browser
        new actions.selenium.Browser().run("Run Browser in Incognito":/TRUE/.toString(),"URL":/${variables."affiliateURL"}/.toString(),"Browser Type":/${variables."Browser"}/.toString())
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        try{
            //Create App Webstorm
            new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Discuss/.toString(),"Sponsor Name":/End User/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/DiscussApp3/.toString(),"Description":/Desc/.toString(),"General Access":/email@damfsf.com../.toString(),"General Access Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        }
       catch(all){}catch(Error err){}
        //Close Current Window
        new actions.selenium.CloseWindow().run([:])
        //Open Browser
        new actions.selenium.Browser().run("Run Browser in Incognito":/TRUE/.toString(),"URL":/${variables."affiliateURL"}/.toString(),"Browser Type":/${variables."Browser"}/.toString())
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        try{
            //Create App Webstorm
            new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Discuss/.toString(),"Sponsor Name":/End User/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/DiscussApp4/.toString(),"Description":/Desc/.toString(),"Moderators":/email@domain/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        }
       catch(all){}catch(Error err){}
        //Close Current Window
        new actions.selenium.CloseWindow().run([:])
        //Open Browser
        new actions.selenium.Browser().run("Run Browser in Incognito":/TRUE/.toString(),"URL":/${variables."affiliateURL"}/.toString(),"Browser Type":/${variables."Browser"}/.toString())
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Verify User in Users tab for People page
        new actions.People.VerifyUserinUserstabforPeoplepage().run("Email Address":/plainaddress/.toString(),"Screen Name":/plainaddress/.toString(),"Status":/Active/.toString(),"Number of Matches":/0/.toString())
        //Verify User in Users tab for People page
        new actions.People.VerifyUserinUserstabforPeoplepage().run("Email Address":/email@brightidea@brightidea.com/.toString(),"Screen Name":/email@brightidea@brightidea.com/.toString(),"Status":/Active/.toString(),"Number of Matches":/0/.toString())
        //Verify User in Users tab for People page
        new actions.People.VerifyUserinUserstabforPeoplepage().run("Email Address":/email@damfsf.com../.toString(),"Screen Name":/email@damfsf.com../.toString(),"Status":/Active/.toString(),"Number of Matches":/0/.toString())
        //Verify User in Users tab for People page
        new actions.People.VerifyUserinUserstabforPeoplepage().run("Email Address":/email@domain/.toString(),"Screen Name":/email@domain/.toString(),"Status":/Active/.toString(),"Number of Matches":/0/.toString())
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