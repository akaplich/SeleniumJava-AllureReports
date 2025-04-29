import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C131915 - MTS > Participant Widget - User Avatar Outline
class C131915_MTS_ParticipantWidget_UserAvatarOutline
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
        //Mouse Over Element Using Action
        new actions.selenium.SetFocus().run("ID":/\/\/*[@class='visual-photo-wrapper']\/DIV[1]/.toString(),"ID Type":/XPath/.toString())
        //Compare Images
        new actions.selenium.CompareImages().run("Element ID (optional)":/\/\/*[contains(@data-tooltip-id,'user-flyover')]\/*[contains(@class,'react-tooltip') and contains(@id,'user-flyover')]/.toString(),"Expected Image File":/C131915_expected-new.png/.toString(),"Actual Image Name":/C131915_actual.png/.toString())
    }
    @AfterMethod
    public void afterState(){
        //Close All Browsers
        new actions.selenium.CloseBrowser().run([:])
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/difference.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C131915_actual.png/.toString())
        }
       catch(all){}catch(Error err){}
    }
}