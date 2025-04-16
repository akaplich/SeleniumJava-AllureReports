package TestCases

import BaseClasses.TestBase
import actions.general.Login
import actions.general.Wait
import actions.selenium.Browser
import actions.selenium.NavigateToURL
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.testng.annotations.Test

class TC_CSample_Groovy_TestCase extends TestBase {
    private static final Logger logger = LoggerFactory.getLogger(TC_CSample_Groovy_TestCase.class);
    private static Browser browser = Browser.getInstance()

    @Test
    public void testcase(){
        logger.info("This is an info message");
        logger.debug("This is a debug message");
        logger.error("This is an error message");

        //Open Browser
        //*new actions.selenium.Browser().run("Run Browser in Incognito":/FALSE/.toString(),"URL":/https:\/\/ademcooper.brightideatest.com\//.toString(),"Browser Type":/Chrome/.toString())
        //new Browser().run("URL":/https:\/\/ademcooper.brightideatest.com\//.toString())
        browser.run("https://ademcooper.brightideatest.com")

        //Login
        //new Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        new Login().run("bi.adminuser1@brightidea.com", "brightidea1")

        //Navigate to URL
        //new NavigateToURL().run("URL":/https:\/\/ademcooper.brightideatest.com\/IDEA362/.toString())
        new NavigateToURL().run("https://ademcooper.brightideatest.com/IDEA362")

        //Wait
        //new Wait().run("Seconds":/5/.toString())
        new Wait().run("5")
        //Set Emoji Dialog
        //new actions.general.SetEmojiDialog().run("Comment":/TestComment/.toString(),"Emoji Name":/thumbs up/.toString())
    }

}
