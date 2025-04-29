import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131164 - Registration Invite from Site Setup - Send Registration Invite - Free Trial Idea Box
class C131164_RegistrationInvitefromSiteSetup_SendRegistrationInvite_FreeTrialIdeaBox
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
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Set Scrolling on Page to Top or Bottom
        new actions.Utils.ScrollPagetoToporBottom().run("Top or Bottom":/Bottom/.toString())
        //Set Scrolling on Page to Top or Bottom
        new actions.Utils.ScrollPagetoToporBottom().run("Top or Bottom":/Top/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/*[@id='fractal-adminNav-selected-text']/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/*[@class='nav-item-label' and contains(.,'Setup')]/.toString())
        //Set Webstorm Setup Users Registration Invites
        new actions.SetupUsers.SetWebstormSetupUsersRegistrationInvites().run("Create New Registration Email":true,"Subject":/Test/.toString(),"Send To":/brightC131164@mailinator.com/.toString(),"Send Invites":true)
        //Get Registration Link from Email
        variables."link" = new actions.Mailinator.GetRegistrationLinkfromEmail().run("Email Address":/brightC131164/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        //Complete User Registration From Initiative Login Page
        new actions.general.CompleteUserRegistrationFromInitiativeLoginPage().run("Screen Name":/ScreenName/.toString(),"Choose Password":/brightidea1/.toString(),"Confirm Password":/brightidea1/.toString())
        //Verify Homepage Header 2
        new actions.WebstormHomepage.VerifyHomepageHeader2().run("Title":/Welcome to our Idea Box/.toString(),"Description":/This is the place for your ideas. You can submit an idea, collaborate with others, get status ﻿updates and see what projects have already been completed. /.toString(),"Idea Box Trial Image":true,"Color of Submit Button":/rgb(81, 45, 168)/.toString())
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