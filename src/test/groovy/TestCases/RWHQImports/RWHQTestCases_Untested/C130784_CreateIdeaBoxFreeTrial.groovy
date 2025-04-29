package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C130784 - Create Idea Box Free Trial
class C130784_CreateIdeaBoxFreeTrial
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
        //Create Free Trial
        variables."affiliateURL" = new actions.Utils.CreateMemoFreeTrial().run("Type of Free Trial":/Ideabox/.toString())
        //Open Browser
        new actions.selenium.Browser().run("URL":/${variables."affiliateURL"}/.toString(),"Browser Type":/${variables."Browser"}/.toString())
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Verify Homepage Header 2
        new actions.WebstormHomepage.VerifyHomepageHeader2().run("Title":/Welcome to our Idea Box/.toString(),"Description":/This is the place for your ideas. You can submit an idea, collaborate with others, get status ﻿updates and see what projects have already been completed. /.toString(),"Idea Box Trial Image":true,"Color of Submit Button":/rgb(81, 45, 168)/.toString(),"Submit Displayed":true,"Browse Displayed":true)
        //Wait
        new actions.general.Wait().run("Seconds":/30/.toString())
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