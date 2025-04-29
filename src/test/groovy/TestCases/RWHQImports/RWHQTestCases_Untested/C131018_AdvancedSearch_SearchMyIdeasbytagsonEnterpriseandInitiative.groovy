import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131018 - Advanced Search - Search My Ideas by tags on Enterprise and Initiative
class C131018_AdvancedSearch_SearchMyIdeasbytagsonEnterpriseandInitiative
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
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString(),"Highlights":true,"My Ideas":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site Global Navigation Page
        new actions.SetupSite.SetEnterpriseSetupSiteGlobalNavigationPage().run("Global Navigation Search":/Show Personalized Quick Results with Search/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Capture My Idea
        new actions.Enterprise.UserHomepage.CaptureMyIdea().run("Capture My Idea from":/Global Nav/.toString(),"Description":/Bitlock: The worlds first keyless bike lock to enable low cost peer-to-peer bike sharing among individuals and communities.  Lock and unlock your bike seamlessly without even having to reach your pocket! Simply walk up to your bike and press the button on BitLock to lock\/unlock. Bitlock senses your proximity and identifies you as you come within 3 feet of your bike (as long as BitLock application is running in the background on your phone). No more lost keys or endless searches to find #myidea them./.toString(),"Action":/Save/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Quick or Advance Search in Global Nav
        new actions.Search.QuickOrAdvanceSearchInGlobalNav().run("Tab (optional)":/Advanced Search/.toString(),"Search Input":/myidea/.toString())
        //Verify Quick or Advanced Search Result
        new actions.Search.VerifyQuickOrAdvancedSearchResult().run("Tab":/Advanced Search/.toString(),"Name of the searched item":/Bitlock: The worlds first keyless bike lock to enable low cost peer-to.../.toString(),"Type":/My Ideas/.toString(),"Number of Total (for Advanced Search)":/1 of 1/.toString(),"Description (for Advanced Search)":/Bitlock: The worlds first keyless bike lock to enable low cost peer-to-pe.../.toString(),"Number of Matches":/1/.toString(),"Click on result":true)
        //Verify View My Idea in User Homepage
        new actions.Enterprise.UserHomepage.VerifyViewMyIdeainUserHomepage().run("Idea Title":/Bitlock: The worlds first keyless bike lock to enable low cost peer-to-peer bike sharing among indiv/.toString())
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