package TestCases.DemoTestSet

import BaseClasses.TestBase
import actions.general.Login
import actions.selenium.Browser
import actions.selenium.CloseWindow
import actions.selenium.NavigateToURL
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.junit.jupiter.api.Test

class C_Sample_Groovy_TestCase extends TestBase {
    private static final Logger logger = LoggerFactory.getLogger(C_Sample_Groovy_TestCase.class);
    private static def variables = [:]

    @BeforeAll
    public static void beforeState(){
        logger.debug("Before State");
        variables."URL" = "https://ademcooper.brightideatest.com"
        variables."Browser" = "Chrome"
        variables."TestRail_RunName" = null
        variables."TestRail_ExecutionName" = null
        variables."CodeEnvironment" = /Default/
        variables."Database" = null
        variables."Licensing Model" = null
        variables."Unlimited Brightidea Administrator License Type" = null
        variables."Brightidea Administrator License Type Purchased Count" = null
        variables."Unlimited Idea Box Manager License Type" = null
        variables."Idea Box Manager License Type Purchased Count" = null
    }

    @Test
    @Tag("Demo")
    public void testcase(){
        logger.info("This is an info message");
        logger.debug("This is a debug message");
        logger.error("This is an error message");

        //Open Browser
        //*new actions.selenium.Browser().run("Run Browser in Incognito":/FALSE/.toString(),"URL":/https:\/\/ademcooper.brightideatest.com\//.toString(),"Browser Type":/Chrome/.toString())
        new Browser().run("URL":/https:\/\/ademcooper.brightideatest.com\//.toString(),
                "Browser Type":"Chrome")

        //Login
        //new Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        new Login().run("bi.adminuser1@brightidea.com", "brightidea1")

        //Navigate to URL
        //new NavigateToURL().run("URL":/https:\/\/ademcooper.brightideatest.com\/IDEA362/.toString())
        new NavigateToURL().run("URL":"https://ademcooper.brightideatest.com/IDEA362")

        //Wait
        //new Wait().run("Seconds":/5/.toString())
        //new Wait().run("5")
        assert 2 + 2 == 4 : "Math error: 2 + 2 should equal 4"
        //Set Emoji Dialog
        //new actions.general.SetEmojiDialog().run("Comment":/TestComment/.toString(),"Emoji Name":/thumbs up/.toString())
    }

    @AfterEach
    public void afterState(){
        try{
            //Close Current Window
            new CloseWindow().run([:])
        }
        catch(all){}catch(Error err){}
        //Delete Affiliate - No Affiliate Created
        //new DeleteAffiliate().run([:])
    }

}
