import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131336 - Quick & Advanced Search - Links to Results Page - Enterprise & MTS
class C131336_QuickAndAdvancedSearch_LinkstoResultsPage_EnterpriseAndMTS
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
        //Set Enterprise Setup for BIOnly Beta tab
        new actions.SetupBI.SetEnterpriseSetupforBIOnlyBetatab().run("Enable New Enterprise Search Page":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site Global Navigation Page
        new actions.SetupSite.SetEnterpriseSetupSiteGlobalNavigationPage().run("Global Navigation Search":/Show Personalized Quick Results with Search/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString())
        //Use this action to enable Memo Updates in System Manager Affiliates
        Action6388ddf31dac76f4246846d6([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Memo Webstorm
        new actions.WebstormCreation.CreateMemoWebstorm().run("Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Monday Memo/.toString(),"Description":/Test Description/.toString(),"Vanity URL":/mondaymemo/.toString(),"Action on Design Tab":/Continue/.toString(),"General Access":/ALL/.toString(),"General Access Add or Remove":/Add/.toString(),"Pipeline Administrators":/Pipeline Admin,System Admin/.toString(),"Administrators Add or Remove":/Add,Remove/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Memo Webstorm
        new actions.WebstormCreation.CreateMemoWebstorm().run("Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Tuesday Memo/.toString(),"Description":/Test Description/.toString(),"Vanity URL":/tuesdaymemo/.toString(),"Action on Design Tab":/Continue/.toString(),"General Access":/ALL/.toString(),"General Access Add or Remove":/Add/.toString(),"Pipeline Administrators":/Pipeline Admin,System Admin/.toString(),"Administrators Add or Remove":/Add,Remove/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/mondaymemo\/submit/.toString())
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Idea Title Question - Title":/Title/.toString(),"Idea Title Question - Value":/January submission Monday/.toString(),"Description Question - Title":/Description/.toString(),"Description Question - Value":/holiday/.toString(),"Category Question - Title":/Category/.toString(),"Category Question - Value":/Strategic Initiative/.toString(),"Action":/Submit Idea/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/tuesdaymemo\/submit/.toString())
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Idea Title Question - Title":/Title/.toString(),"Idea Title Question - Value":/January submission Tuesday/.toString(),"Description Question - Title":/Description/.toString(),"Description Question - Value":/holiday/.toString(),"Category Question - Title":/Category/.toString(),"Category Question - Value":/Strategic Initiative/.toString(),"Action":/Submit Idea/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Reindex Affiliate Data
        new actions.SetupBI.ReindexAffiliateData().run([:])
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("Area to Navigate to":/Memo Team Site/.toString(),"Memo Team Site Link":/mondaymemo/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Quick or Advance Search in Global Nav
        new actions.Search.QuickOrAdvanceSearchInGlobalNav().run("Search Input":/January/.toString())
        //Verify Quick or Advanced Search Result
        new actions.Search.VerifyQuickOrAdvancedSearchResult().run("Tab":/Quick Results/.toString(),"Name of the searched item":/January submission Monday/.toString(),"Type":/Idea/.toString(),"Number of Matches":/1/.toString(),"Number of Total (for View All Results)":/1/.toString())
        //Verify Quick or Advanced Search Result
        new actions.Search.VerifyQuickOrAdvancedSearchResult().run("Tab":/Quick Results/.toString(),"Name of the searched item":/January submission Tuesday/.toString(),"Type":/Idea/.toString(),"Number of Matches":/1/.toString(),"Number of Total (for View All Results)":/1/.toString(),"Click on View All Results":true)
        //Verify On Search Results Page
        new actions.Search.VerifyOnSearchResultsPage().run("Item Title":/January submission Monday/.toString(),"Item Type Title":/Memo/.toString(),"Type Icon":/lightbulb/.toString(),"Number of Matches":/1/.toString())
        //Verify On Search Results Page
        new actions.Search.VerifyOnSearchResultsPage().run("Item Title":/January submission Tuesday/.toString(),"Item Type Title":/Memo/.toString(),"Type Icon":/lightbulb/.toString(),"Number of Matches":/0/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("Area to Navigate to":/Memo Team Site/.toString(),"Memo Team Site Link":/mondaymemo/.toString())
        //Quick or Advance Search in Global Nav
        new actions.Search.QuickOrAdvanceSearchInGlobalNav().run("Tab (optional)":/Advanced Search/.toString(),"Search Input":/January/.toString())
        //Verify Quick or Advanced Search Result
        new actions.Search.VerifyQuickOrAdvancedSearchResult().run("Tab":/Advanced Search/.toString(),"Name of the searched item":/January submission Tuesday/.toString(),"Type":/Submissions/.toString(),"Number of Total (for Advanced Search)":/1/.toString(),"Number of Matches":/0/.toString(),"Number of Total (for View All Results)":/1/.toString())
        //Verify Quick or Advanced Search Result
        new actions.Search.VerifyQuickOrAdvancedSearchResult().run("Tab":/Advanced Search/.toString(),"Name of the searched item":/January submission Monday/.toString(),"Type":/Submissions/.toString(),"Number of Total (for Advanced Search)":/1/.toString(),"Number of Matches":/1/.toString(),"Number of Total (for View All Results)":/1/.toString(),"Click on View All Results":true)
        //Verify On Search Results Page
        new actions.Search.VerifyOnSearchResultsPage().run("Item Title":/January submission Monday/.toString(),"Item Type Title":/Memo/.toString(),"Type Icon":/lightbulb/.toString(),"Number of Matches":/1/.toString())
        //Verify On Search Results Page
        new actions.Search.VerifyOnSearchResultsPage().run("Item Title":/January submission Tuesday/.toString(),"Item Type Title":/Memo/.toString(),"Type Icon":/lightbulb/.toString(),"Number of Matches":/0/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Quick or Advance Search in Global Nav
        new actions.Search.QuickOrAdvanceSearchInGlobalNav().run("Tab (optional)":/Advanced Search/.toString(),"Search Input":/January/.toString())
        //Verify Quick or Advanced Search Result
        new actions.Search.VerifyQuickOrAdvancedSearchResult().run("Tab":/Advanced Search/.toString(),"Name of the searched item":/January submission Tuesday/.toString(),"Type":/Submissions/.toString(),"Number of Total (for Advanced Search)":/2 of 2/.toString(),"Number of Matches":/1/.toString(),"Number of Total (for View All Results)":/2/.toString())
        //Verify Quick or Advanced Search Result
        new actions.Search.VerifyQuickOrAdvancedSearchResult().run("Tab":/Advanced Search/.toString(),"Name of the searched item":/January submission Monday/.toString(),"Type":/Submissions/.toString(),"Number of Total (for Advanced Search)":/2 of 2/.toString(),"Number of Matches":/1/.toString(),"Click on View All Results":true)
        //Verify On Search Results Page
        new actions.Search.VerifyOnSearchResultsPage().run("Item Title":/January submission Monday/.toString(),"Item Type Title":/Memo/.toString(),"Type Icon":/lightbulb/.toString(),"Number of Matches":/1/.toString())
        //Verify On Search Results Page
        new actions.Search.VerifyOnSearchResultsPage().run("Item Title":/January submission Tuesday/.toString(),"Item Type Title":/Memo/.toString(),"Type Icon":/lightbulb/.toString(),"Number of Matches":/1/.toString())
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
    //Use this action to enable Memo Updates in System Manager Affiliates
    public static def Action6388ddf31dac76f4246846d6(def params){
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for BIOnly Beta tab
        new actions.SetupBI.SetEnterpriseSetupforBIOnlyBetatab().run("Enable memos on Userhome":true,"Create Memo Wizard":true,"Memo BI Templates":true,"Show Memo tab in system setup":true,"Memo AI, Content Updates":true)
        //Wait
        new actions.general.Wait().run("Seconds":/15/.toString())

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