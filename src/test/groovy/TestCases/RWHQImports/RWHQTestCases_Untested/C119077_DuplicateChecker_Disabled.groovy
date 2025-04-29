package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C119077 - Duplicate Checker - Disabled
class C119077_DuplicateChecker_Disabled
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
        //Add Community
        new actions.SetupEnterpriseCommunities.AddCommunity().run("Community Name":/Newly Added Community/.toString(),"Action":/Create/.toString())
        //Select Community
        new actions.SetupEnterpriseCommunities.SelectCommunity().run("Community Name":/Newly Added Community/.toString())
        //Update Community
        new actions.SetupEnterpriseCommunities.UpdateCommunity().run("Apps":/Custom App,Solve App/.toString(),"Checkbox Check":/TRUE,TRUE/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Ideas tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforIdeastab().run("Idea Duplicate Checker":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/test idea/.toString())
        //Verify and Access Similar Ideas using Duplicate Checker in Post Idea
        new actions.PostIdea.VerifyandAccessSimilarIdeasusingDuplicateCheckerinPostIdea().run("Title":/test idea1/.toString(),"Description":/test idea1 desc/.toString(),"Image":true,"Number of Matches":/0/.toString())
        //Verify and Access Similar Ideas using Duplicate Checker in Post Idea
        new actions.PostIdea.VerifyandAccessSimilarIdeasusingDuplicateCheckerinPostIdea().run("Title":/test idea2/.toString(),"Description":/test idea2 desc/.toString(),"Image":false,"Number of Matches":/0/.toString())
        //Verify and Access Similar Ideas using Duplicate Checker in Post Idea
        new actions.PostIdea.VerifyandAccessSimilarIdeasusingDuplicateCheckerinPostIdea().run("Title":/solve test idea1/.toString(),"Number of Matches":/0/.toString())
        //Verify and Access Similar Ideas using Duplicate Checker in Post Idea
        new actions.PostIdea.VerifyandAccessSimilarIdeasusingDuplicateCheckerinPostIdea().run("Title":/solve test idea2/.toString(),"Number of Matches":/0/.toString())
        //Verify and Access Similar Ideas using Duplicate Checker in Post Idea
        new actions.PostIdea.VerifyandAccessSimilarIdeasusingDuplicateCheckerinPostIdea().run("Title":/quick add1/.toString(),"Number of Matches":/0/.toString())
        //Verify and Access Similar Ideas using Duplicate Checker in Post Idea
        new actions.PostIdea.VerifyandAccessSimilarIdeasusingDuplicateCheckerinPostIdea().run("Title":/eval idea 1/.toString(),"Number of Matches":/0/.toString())
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