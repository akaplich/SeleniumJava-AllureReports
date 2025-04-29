import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C131030 - Quick Results, Advanced Search - Search My Ideas by Title & Description
class C131030_QuickResults_AdvancedSearch_SearchMyIdeasbyTitleAndDescription
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
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString(),"My Ideas":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Capture My Idea
        new actions.Enterprise.UserHomepage.CaptureMyIdea().run("Capture My Idea from":/Global Nav/.toString(),"Description":/first my idea/.toString(),"Action":/Save/.toString())
        //Quick or Advance Search in Global Nav
        new actions.Search.QuickOrAdvanceSearchInGlobalNav().run("Tab (optional)":/Advanced Search/.toString(),"Search Input":/first my idea/.toString())
        //Verify Quick or Advanced Search Result
        new actions.Search.VerifyQuickOrAdvancedSearchResult().run("Tab":/Advanced Search/.toString(),"Name of the searched item":/first my idea/.toString(),"Type":/My Ideas/.toString(),"Number of Total (for Advanced Search)":/1 of 1/.toString(),"Description (for Advanced Search)":/first my idea/.toString(),"Number of Matches":/1/.toString(),"Click on result":true)
        //Verify View My Idea in User Homepage
        new actions.Enterprise.UserHomepage.VerifyViewMyIdeainUserHomepage().run("Idea Title":/first my idea/.toString(),"Idea Description":/first my idea/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Quick or Advance Search in Global Nav
        new actions.Search.QuickOrAdvanceSearchInGlobalNav().run("Search Input":/first my idea/.toString())
        //Verify Quick or Advanced Search Result
        new actions.Search.VerifyQuickOrAdvancedSearchResult().run("Tab":/Quick Results/.toString(),"Name of the searched item":/first my idea/.toString(),"Type":/My Idea/.toString(),"Number of Matches":/1/.toString(),"Click on result":true)
        //Verify View My Idea in User Homepage
        new actions.Enterprise.UserHomepage.VerifyViewMyIdeainUserHomepage().run("Idea Title":/first my idea/.toString(),"Idea Description":/first my idea/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Capture My Idea
        new actions.Enterprise.UserHomepage.CaptureMyIdea().run("Capture My Idea from":/Global Nav/.toString(),"Description":/Our current RD roadmap does not include investments in carbon nano tube technologies. With advancements in technology, significant cost savings and technological improvements to our workstations could be acheived. Now is the time to diversify our RD portfolio and increase investments in carbon nano technology/.toString(),"Action":/Save/.toString())
        //Quick or Advance Search in Global Nav
        new actions.Search.QuickOrAdvanceSearchInGlobalNav().run("Tab (optional)":/Advanced Search/.toString(),"Search Input":/carbon nano technology/.toString())
        //Verify Quick or Advanced Search Result
        new actions.Search.VerifyQuickOrAdvancedSearchResult().run("Tab":/Advanced Search/.toString(),"Name of the searched item":/Our current RD roadmap does not include investments in carbon nano tub.../.toString(),"Type":/My Ideas/.toString(),"Number of Total (for Advanced Search)":/1 of 1/.toString(),"Description (for Advanced Search)":/Our current RD roadmap does not include investments in carbon nano tube t.../.toString(),"Number of Matches":/1/.toString(),"Click on result":true)
        //Verify View My Idea in User Homepage
        new actions.Enterprise.UserHomepage.VerifyViewMyIdeainUserHomepage().run("Idea Title":/Our current RD roadmap does not include investments in carbon nano tube technologies. With advanceme/.toString(),"Idea Description":/Our current RD roadmap does not include investments in carbon nano tube technologies. With advancements in technology, significant cost savings and technological improvements to our workstations could be acheived. Now is the time to diversify our RD portfolio and increase investments in carbon nano technology/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Quick or Advance Search in Global Nav
        new actions.Search.QuickOrAdvanceSearchInGlobalNav().run("Tab (optional)":/Quick Results/.toString(),"Search Input":/carbon nano technology/.toString())
        //Verify Quick or Advanced Search Result
        new actions.Search.VerifyQuickOrAdvancedSearchResult().run("Tab":/Quick Results/.toString(),"Name of the searched item":/Our current RD roadmap does not include investments in carbon nano tube technologies. With advanceme/.toString(),"Type":/My Idea/.toString(),"Number of Matches":/1/.toString())
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