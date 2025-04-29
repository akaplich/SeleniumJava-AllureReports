package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131530 - WB - Retain Last Viewport - Old WB
class C131530_WB_RetainLastViewport_OldWB
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
        new actions.selenium.Browser().run("URL":/https:\/\/anna81.brightideatest.com/.toString(),"Browser Type":/Chrome/.toString())
        try{
            //Login
            new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        }
       catch(all){}catch(Error err){}
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Whiteboards/.toString())
        //Select Existing Whiteboard from Userhome Whiteboards
        new actions.Whiteboards.OpenExistingWhiteboardOnWhiteboardsPage().run("Name of Whiteboard":/C131530 - do not open/.toString())
        //Compare Images
        new actions.selenium.CompareImages().run("Expected Image File":/C131530_expected.png/.toString(),"Actual Image Name":/C131530_actual.png/.toString(),"Allowed Number of Different Pixels":/500/.toString())
    }
    @AfterMethod
    public void afterState(){
        //Close All Browsers
        new actions.selenium.CloseBrowser().run([:])
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C131530_actual.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/difference.png/.toString())
        }
       catch(all){}catch(Error err){}
    }
}