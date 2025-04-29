package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C132488 - Community and Enterprise Ideaboards
class C132488_CommunityandEnterpriseIdeaboards
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
        //Set Enterprise Setup Site Navigation Page
        new actions.SetupSite.SetEnterpriseSetupSiteNavigationPage().run("Add Edit or Delete Navigation Item":/Add/.toString(),"Title":/Enterprise Ideaboards/.toString(),"Link":/View Ideas/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Set Navigation Option in Nav Bar
        new actions.Enterprise.SetNavigationOptioninNavBar().run("Nav Option":/Enterprise Ideaboards/.toString())
        //Verify Idea in Idea Board 20 page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage().run("Tab":/Recent/.toString(),"Idea Name":/test idea1/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Idea Board 20 page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage().run("Idea Name":/test idea2/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Idea Board 20 page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage().run("Idea Name":/quick add1/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Idea Board 20 page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage().run("Idea Name":/solve test idea1/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Idea Board 20 page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage().run("Idea Name":/solve test idea2/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Idea Board 20 page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage().run("Idea Name":/eval idea 1/.toString(),"Number of Matches":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Select Community
        new actions.SetupEnterpriseCommunities.SelectCommunity().run("Community Name":/QA Community/.toString())
        //Update Community
        new actions.SetupEnterpriseCommunities.UpdateCommunity().run("Apps":/Custom App,Evaluators app/.toString(),"Checkbox Check":/TRUE,TRUE/.toString())
        //Go to Community
        new actions.SetupEnterpriseCommunities.GotoCommunity().run("Community Name to go to":/QA Community/.toString())
        //Navigate Community
        new actions.SetupEnterpriseCommunities.NavigateCommunity().run("Community Page":/Setup/.toString())
        //Set Enterprise Setup Site Navigation Page
        new actions.SetupSite.SetEnterpriseSetupSiteNavigationPage().run("Add Edit or Delete Navigation Item":/Add/.toString(),"Title":/Community Ideaboards/.toString(),"Link":/View Ideas/.toString())
        //Navigate Community
        new actions.SetupEnterpriseCommunities.NavigateCommunity().run("Community Page":/Community Home/.toString())
        //Set Navigation Option in Nav Bar
        new actions.Enterprise.SetNavigationOptioninNavBar().run("Nav Option":/Community Ideaboards/.toString())
        //Verify Idea in Idea Board 20 page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage().run("Tab":/Recent/.toString(),"Idea Name":/test idea1/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Idea Board 20 page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage().run("Idea Name":/test idea2/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Idea Board 20 page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage().run("Idea Name":/quick add1/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Idea Board 20 page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage().run("Idea Name":/solve test idea1/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Idea Board 20 page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage().run("Idea Name":/solve test idea2/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Idea Board 20 page
        new actions.IdeaBoard.VerifyIdeainIdeaBoardpage().run("Idea Name":/eval idea 1/.toString(),"Number of Matches":/1/.toString())
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