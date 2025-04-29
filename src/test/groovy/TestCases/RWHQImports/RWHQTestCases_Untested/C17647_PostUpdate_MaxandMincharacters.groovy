package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C17647 - Post Update - Max and Min characters
class C17647_PostUpdate_MaxandMincharacters
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
        //Set Widget Controller
        new actions.Widgets.SetWidgetController().run("Widget Edit Mode":/Enable/.toString(),"Add Widget from Selection":/Post Update 2.0/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Set Widget Controller
        new actions.Widgets.SetWidgetController().run("Add Widget from Selection":/Enterprise Updates/.toString())
        //Verify Widget Exists
        new actions.Widgets.VerifyWidgetExists().run("Widget Name":/Post Update/.toString(),"Number of Matches":/1/.toString())
        //Verify Widget Exists
        new actions.Widgets.VerifyWidgetExists().run("Widget Name":/Enterprise Updates/.toString(),"Number of Matches":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Set Widget Post Update
        new actions.Widgets.SetWidgetPostUpdate().run("What are you working on":/<EMPTY>/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Please enter a message/.toString(),"Should Exist":true)
        try{
            //Set Widget Post Update
            new actions.Widgets.SetWidgetPostUpdate().run("What are you working on":/We all recognize that inspiration can strike at anytime. Thankfully, you don't need to be in front of your desktop computer to participate in/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Widget Updates
        new actions.Widgets.VerifyWidgetUpdates().run("Update Text Contains":/We all recognize that inspiration can strike at anytime. Thankfully, you don't need to be in front of your desktop computer to participate in/.toString(),"Number of Matches":/0/.toString())
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