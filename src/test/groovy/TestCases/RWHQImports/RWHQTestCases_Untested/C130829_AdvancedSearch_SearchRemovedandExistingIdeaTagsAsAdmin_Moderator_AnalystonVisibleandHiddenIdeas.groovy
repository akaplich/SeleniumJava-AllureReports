import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C130829 - Advanced Search - Search Removed and Existing Idea Tags As Admin, Moderator, Analyst on Visible and Hidden Ideas
class C130829_AdvancedSearch_SearchRemovedandExistingIdeaTagsAsAdmin_Moderator_AnalystonVisibleandHiddenIdeas
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
        //Set Enterprise Setup Site Global Navigation Page
        new actions.SetupSite.SetEnterpriseSetupSiteGlobalNavigationPage().run("Global Navigation Search":/Show Personalized Quick Results with Search/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Quick or Advance Search in Global Nav
        new actions.Search.QuickOrAdvanceSearchInGlobalNav().run("Tab (optional)":/Advanced Search/.toString(),"Search Input":/tag1/.toString())
        //Verify Quick or Advanced Search Result
        new actions.Search.VerifyQuickOrAdvancedSearchResult().run("Tab":/Advanced Search/.toString(),"Name of the searched item":/test idea1/.toString(),"Type":/Submissions/.toString(),"Number of Total (for Advanced Search)":/1 of 1/.toString(),"Number of Matches":/1/.toString(),"Click on result":true)
        //Set Tag for View Idea page
        new actions.ViewIdea.SetTagforViewIdeapage().run("Tag Name":/tag1/.toString(),"Add or Remove":/Remove/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea2/.toString())
        //Set Tag for View Idea page
        new actions.ViewIdea.SetTagforViewIdeapage().run("Tag Name":/обычная/.toString(),"Add or Remove":/Add/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/quick add1/.toString())
        //Set Tag for View Idea page
        new actions.ViewIdea.SetTagforViewIdeapage().run("Tag Name":/automation/.toString(),"Add or Remove":/Add/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/${variables."TCData.user"}/.toString(),"Password":/brightidea1/.toString())
        //Quick or Advance Search in Global Nav
        new actions.Search.QuickOrAdvanceSearchInGlobalNav().run("Tab (optional)":/Advanced Search/.toString(),"Search Input":/обычная/.toString())
        //Verify Quick or Advanced Search Result
        new actions.Search.VerifyQuickOrAdvancedSearchResult().run("Tab":/Advanced Search/.toString(),"Name of the searched item":/test idea2/.toString(),"Type":/Submissions/.toString(),"Number of Total (for Advanced Search)":/1 of 1/.toString(),"Number of Matches":/1/.toString())
        //Quick or Advance Search in Global Nav
        new actions.Search.QuickOrAdvanceSearchInGlobalNav().run("Tab (optional)":/Advanced Search/.toString(),"Search Input":/tag1/.toString())
        //Verify Quick or Advanced Search Result
        new actions.Search.VerifyQuickOrAdvancedSearchResult().run("Tab":/Advanced Search/.toString(),"No Search Results":true,"Name of the searched item":/tag1/.toString())
        //Quick or Advance Search in Global Nav
        new actions.Search.QuickOrAdvanceSearchInGlobalNav().run("Tab (optional)":/Advanced Search/.toString(),"Search Input":/automation/.toString())
        //Verify Quick or Advanced Search Result
        new actions.Search.VerifyQuickOrAdvancedSearchResult().run("Tab":/Advanced Search/.toString(),"Name of the searched item":/quick add1/.toString(),"Type":/Submissions/.toString(),"Number of Total (for Advanced Search)":/1 of 1/.toString(),"Click on result":true)
        //Verify Idea in View Idea page
        new actions.ViewIdea.VerifyIdeainViewIdeapage().run("Idea Name":/quick add1/.toString(),"Tag":/automation/.toString(),"Tag Should Exist":/TRUE/.toString(),"Linked Submissions":[])
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