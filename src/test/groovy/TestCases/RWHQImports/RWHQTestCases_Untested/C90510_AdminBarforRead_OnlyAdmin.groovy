package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C90510 - Admin Bar for Read-Only Admin
class C90510_AdminBarforRead_OnlyAdmin
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
        Action58123c20fa4ee77809f468f6("Username Email":/analyst@test.com/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Site/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Custom App Desc/.toString(),"Should Exist":true)
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Site Setup/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Site Setup: Custom App/.toString(),"Should Exist":true)
        try{
            //Set Webstorm Setup Ideas for Ideas tab
            new actions.SetupIdeas.SetWebstormSetupIdeasforIdeastab().run([:])
        }
       catch(all){}catch(Error err){}
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Idea Image/.toString(),"Should Exist":false)
        try{
            //Set Webstorm Setup Site Info Page
            new actions.SetupSite.SetWebstormSetupSiteInfoPage().run([:])
        }
       catch(all){}catch(Error err){}
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/General Settings/.toString(),"Should Exist":false)
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/*[@class='desktop-nav-core-items']\/\/a[text()='Home']/.toString())
        try{
            //Navigate Webstorm via Admin Dropdown Only
            new actions.general.NavigateWebstormviaAdminBarOnly().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Communications/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Custom App Desc/.toString(),"Should Exist":true)
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/*[@class='desktop-nav-core-items']\/\/a[text()='Home']/.toString())
        try{
            //Navigate Webstorm via Admin Dropdown Only
            new actions.general.NavigateWebstormviaAdminBarOnly().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Knowledge Base/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Custom App Desc/.toString(),"Should Exist":true)
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/*[@class='desktop-nav-core-items']\/\/a[text()='Home']/.toString())
        try{
            //Navigate Webstorm via Admin Dropdown Only
            new actions.general.NavigateWebstormviaAdminBarOnly().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Setup/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Custom App Desc/.toString(),"Should Exist":true)
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/*[@class='desktop-nav-core-items']\/\/a[text()='Home']/.toString())
        try{
            //Navigate Webstorm via Admin Dropdown Only
            new actions.general.NavigateWebstormviaAdminBarOnly().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/List/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Idea in Pipeline List page
        new actions.PipelineList.VerifyIdeainPipelineListpage().run("Title":/test idea1/.toString(),"Number of Matches":/1/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Steps/.toString())
        //Verify Idea in Pipeline Steps page
        new actions.PipelineStepsView.VerifyIdeainPipelineStepsViewpage().run("Idea Name":/test idea2/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Dashboard/.toString())
        //Verify Current Ideas Per Step on Overall tab in Pipeline Dashboard
        new actions.PipelineDashBoard.VerifyCurrentIdeasPerSteponOveralltabinPipelineDashboard().run("Step":/Review/.toString(),"Number of Ideas":/3/.toString())
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