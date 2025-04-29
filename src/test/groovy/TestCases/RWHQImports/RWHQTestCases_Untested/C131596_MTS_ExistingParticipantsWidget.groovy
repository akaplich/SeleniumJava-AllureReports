package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C131596 - MTS > Existing Participants Widget
class C131596_MTS_ExistingParticipantsWidget
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
        //Open Browser
        new actions.selenium.Browser().run("URL":/https:\/\/anna81.brightideatest.com\//.toString(),"Browser Type":/Chrome/.toString())
        try{
            //Login
            new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        }
       catch(all){}catch(Error err){}
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/https:\/\/anna81.brightideatest.com\/mts\/auto1/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Verify Visual Participant Widget on Homepage
        new actions.Webstorm.VerifyVisualParticipantWidgetonHomepage().run("Topic Views":/2/.toString(),"Submitted Solutions":/4/.toString(),"Users":/System Admin,End User,End User 2,analyst,NonBI System Admin/.toString(),"Users engaged with the challenge":/System Admin,End User,End User 2,analyst,1 more,2 more,NonBI System Admin/.toString())
    }
    @AfterMethod
    public void afterState(){
        //Close All Browsers
        new actions.selenium.CloseBrowser().run([:])
    }
}