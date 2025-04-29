package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C117571 - Search my ideas - Clear Ideas
class C117571_Searchmyideas_ClearIdeas
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
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString(),"My Ideas":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Capture My Idea
        new actions.Enterprise.UserHomepage.CaptureMyIdea().run("Capture My Idea from":/Global Nav/.toString(),"Description":/Brightidea must be next big thing/.toString(),"Action":/Save/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Capture My Idea
        new actions.Enterprise.UserHomepage.CaptureMyIdea().run("Capture My Idea from":/Global Nav/.toString(),"Description":/This is a brightidea spark. Testing it for Search purpose/.toString(),"Action":/Save/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Capture My Idea
        new actions.Enterprise.UserHomepage.CaptureMyIdea().run("Capture My Idea from":/Global Nav/.toString(),"Description":/Our current RD roadmap does not include investments in carbon nano tube technologies. With advancements in technology, significant cost savings and technological improvements to our workstations could be acheived. Now is the time to diversify our RD portfolio and increase investments in carbon nano technology/.toString(),"Action":/Save/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Search My Idea
        new actions.Enterprise.UserHomepage.SearchMyIdea().run("Search Field":/brightidea/.toString())
        //Verify Idea in My Ideas List
        new actions.Enterprise.UserHomepage.VerifyIdeainMyIdeasList().run("Thumbnail":/Default/.toString(),"Title":/Brightidea must be next big thing/.toString(),"Row Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in My Ideas List
        new actions.Enterprise.UserHomepage.VerifyIdeainMyIdeasList().run("Thumbnail":/Default/.toString(),"Title":/This is a brightidea spark. Testing it for Search purpose/.toString(),"Row Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in My Ideas List
        new actions.Enterprise.UserHomepage.VerifyIdeainMyIdeasList().run("Thumbnail":/Default/.toString(),"Title":/Our current RD roadmap does not include investments in carbon nano tube technologies. With advanceme/.toString(),"Number of Matches":/0/.toString())
        //Search My Idea
        new actions.Enterprise.UserHomepage.SearchMyIdea().run("Clear Field":true)
        //Verify Idea in My Ideas List
        new actions.Enterprise.UserHomepage.VerifyIdeainMyIdeasList().run("Thumbnail":/Default/.toString(),"Title":/Brightidea must be next big thing/.toString(),"Row Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in My Ideas List
        new actions.Enterprise.UserHomepage.VerifyIdeainMyIdeasList().run("Thumbnail":/Default/.toString(),"Title":/This is a brightidea spark. Testing it for Search purpose/.toString(),"Row Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in My Ideas List
        new actions.Enterprise.UserHomepage.VerifyIdeainMyIdeasList().run("Thumbnail":/Default/.toString(),"Title":/Our current RD roadmap does not include investments in carbon nano tube technologies. With advanceme/.toString(),"Row Number":/1/.toString(),"Number of Matches":/1/.toString())
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