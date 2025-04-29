import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132408 - Search Ideas by Category on Global Navigation and Initiative Search
class C132408_SearchIdeasbyCategoryonGlobalNavigationandInitiativeSearch
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
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Select Product in Apps Pillar Page
        new actions.AppsPillar.SelectProductinAppsPillarPage().run("Product":/Build/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Custom 2/.toString(),"Description":/Desc Custom 2/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom 2/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/IdeaWithStratCategory2/.toString(),"Description":/Desc for IdeaWithStratCategory2/.toString(),"Category":/Strategy/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/IdeaWithStratCategory/.toString(),"Description":/Desc for IdeaWithStratCategory/.toString(),"Category":/Strategy/.toString(),"Required Short Question":/Short Answer/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/HiddenIdeaWithStratCategory/.toString(),"Description":/Desc for HiddenIdeaWithStratCategory/.toString(),"Category":/Strategy/.toString(),"Required Short Question":/Short Answer/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/HiddenIdeaWithStratCategory/.toString())
        //Set Toggle Visibility in View Idea page
        new actions.ViewIdea.SetToggleVisibilityinViewIdeapage().run("Change Visibility":/Hidden/.toString(),"Action":/Change Visibility/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Search Global Enterprise/Webstorm/Community
        new actions.Search.SearchEnterpriseWebstorm().run("Search Value":/Strategy/.toString())
        //Verify On Global Search Result
        new actions.Search.VerifyOnGlobalSearchResult().run("Title":/IdeaWithStratCategory2/.toString(),"Description":/Desc for IdeaWithStratCategory2/.toString(),"Number of Matches":/1/.toString(),"Click on the result":false)
        //Verify On Global Search Result
        new actions.Search.VerifyOnGlobalSearchResult().run("Title":/HiddenIdeaWithStratCategory/.toString(),"Description":/Desc for HiddenIdeaWithStratCategory/.toString(),"Number of Matches":/1/.toString(),"Click on the result":false)
        //Verify On Global Search Result
        new actions.Search.VerifyOnGlobalSearchResult().run("Title":/IdeaWithStratCategory/.toString(),"Description":/Desc for IdeaWithStratCategory/.toString(),"Number of Matches":/1/.toString(),"Click on the result":true)
        //Verify Idea in View Idea page
        new actions.ViewIdea.VerifyIdeainViewIdeapage().run("Idea Name":/IdeaWithStratCategory/.toString(),"Category":/Strategy/.toString(),"Description":/Desc for IdeaWithStratCategory/.toString(),"Linked Submissions":[])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Search Global Enterprise/Webstorm/Community
        new actions.Search.SearchEnterpriseWebstorm().run("Search Value":/Strategy/.toString())
        //Verify On Global Search Result
        new actions.Search.VerifyOnGlobalSearchResult().run("Title":/IdeaWithStratCategory2/.toString(),"Description":/Desc for IdeaWithStratCategory2/.toString(),"Number of Matches":/0/.toString(),"Click on the result":false)
        //Verify On Global Search Result
        new actions.Search.VerifyOnGlobalSearchResult().run("Title":/HiddenIdeaWithStratCategory/.toString(),"Description":/Desc for HiddenIdeaWithStratCategory/.toString(),"Number of Matches":/1/.toString(),"Click on the result":false)
        //Verify On Global Search Result
        new actions.Search.VerifyOnGlobalSearchResult().run("Title":/IdeaWithStratCategory/.toString(),"Number of Matches":/1/.toString(),"Click on the result":true)
        //Verify Idea in View Idea page
        new actions.ViewIdea.VerifyIdeainViewIdeapage().run("Idea Name":/IdeaWithStratCategory/.toString(),"Category":/Strategy/.toString(),"Linked Submissions":[])
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Search Global Enterprise/Webstorm/Community
        new actions.Search.SearchEnterpriseWebstorm().run("Search Value":/Strategy/.toString())
        //Verify On Global Search Result
        new actions.Search.VerifyOnGlobalSearchResult().run("Title":/IdeaWithStratCategory2/.toString(),"Description":/Desc for IdeaWithStratCategory2/.toString(),"Number of Matches":/1/.toString(),"Click on the result":false)
        //Verify On Global Search Result
        new actions.Search.VerifyOnGlobalSearchResult().run("Title":/HiddenIdeaWithStratCategory/.toString(),"Description":/Desc for HiddenIdeaWithStratCategory/.toString(),"Number of Matches":/0/.toString(),"Click on the result":false)
        //Verify On Global Search Result
        new actions.Search.VerifyOnGlobalSearchResult().run("Title":/IdeaWithStratCategory/.toString(),"Description":/Desc for IdeaWithStratCategory/.toString(),"Number of Matches":/1/.toString(),"Click on the result":true)
        //Verify Idea in View Idea page
        new actions.ViewIdea.VerifyIdeainViewIdeapage().run("Idea Name":/IdeaWithStratCategory/.toString(),"Category":/Strategy/.toString(),"Description":/Desc for IdeaWithStratCategory/.toString(),"Linked Submissions":[])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Search Global Enterprise/Webstorm/Community
        new actions.Search.SearchEnterpriseWebstorm().run("Search Value":/Strategy/.toString())
        //Verify On Global Search Result
        new actions.Search.VerifyOnGlobalSearchResult().run("Title":/IdeaWithStratCategory2/.toString(),"Description":/Desc for IdeaWithStratCategory2/.toString(),"Number of Matches":/0/.toString(),"Click on the result":false)
        //Verify On Global Search Result
        new actions.Search.VerifyOnGlobalSearchResult().run("Title":/HiddenIdeaWithStratCategory/.toString(),"Description":/Desc for HiddenIdeaWithStratCategory/.toString(),"Number of Matches":/0/.toString(),"Click on the result":false)
        //Verify On Global Search Result
        new actions.Search.VerifyOnGlobalSearchResult().run("Title":/IdeaWithStratCategory/.toString(),"Number of Matches":/1/.toString(),"Click on the result":true)
        //Verify Idea in View Idea page
        new actions.ViewIdea.VerifyIdeainViewIdeapage().run("Idea Name":/IdeaWithStratCategory/.toString(),"Category":/Strategy/.toString(),"Linked Submissions":[])
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