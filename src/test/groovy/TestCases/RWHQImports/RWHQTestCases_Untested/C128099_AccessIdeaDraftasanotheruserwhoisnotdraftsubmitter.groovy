import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C128099 - Access Idea Draft as another user who is not draft submitter
class C128099_AccessIdeaDraftasanotheruserwhoisnotdraftsubmitter
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
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/My Draft/.toString(),"Description":/My Draft Description/.toString(),"Category":/Operations/.toString(),"Required Short Question":/Required Short/.toString(),"Action":/Save Draft/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString(),"Highlights":true,"Submissions":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Submissions/.toString())
        //Filter or Sort Submissions in User Homepage
        new actions.Enterprise.UserHomepage.FilterorSortSubmissionsinUserHomepage().run("Filter by":/Drafts/.toString())
        //Verify and Access Submission in User Homepage
        new actions.Enterprise.UserHomepage.VerifySubmissioninUserHomepage().run("Submission Name":/My Draft/.toString(),"Access Submission":true,"Number of Matches":/1/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/1/.toString())
        //Verify & Return Current URL Value
        variables."URL" = new actions.selenium.VerifyURL().run([:])
        //Log Out
        new actions.general.LogOut().run([:])
        //Close All Browsers
        new actions.selenium.CloseBrowser().run([:])
        //Open Browser
        new actions.selenium.Browser().run("URL":/${variables."affiliateURL"}/.toString(),"Browser Type":/Chrome/.toString())
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."URL"}/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Drafts may only be viewed by the submitter/.toString(),"Should Exist":true)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/My Draft/.toString(),"Should Exist":false)
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Action":/Submit Idea/.toString())
        //Verify Error Field in Post Idea page
        new actions.PostIdea.VerifyErrorFieldinPostIdeapage().run("Field Name":/Title/.toString(),"Should Error Exist":true)
        //Verify Error Field in Post Idea page
        new actions.PostIdea.VerifyErrorFieldinPostIdeapage().run("Field Name":/Description/.toString(),"Should Error Exist":true)
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