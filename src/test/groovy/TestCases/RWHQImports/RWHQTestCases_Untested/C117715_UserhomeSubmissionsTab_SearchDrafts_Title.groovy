import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C117715 - Userhome Submissions Tab - Search Drafts - Title
class C117715_UserhomeSubmissionsTab_SearchDrafts_Title
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
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString(),"Activities":true,"Submissions":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/Custom App test idea draft/.toString(),"Description":/Description of Idea for Custom App/.toString(),"Category":/New Product/.toString(),"Required Short Question":/required short answer/.toString(),"Action":/Save Draft/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/Diwali festival of lights/.toString(),"Description":/Diwali festival of lights is the biggest celebration/.toString(),"Category":/New Product/.toString(),"Required Short Question":/required short answer/.toString(),"Action":/Save Draft/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Submissions/.toString())
        //Filter or Sort Submissions in User Homepage
        new actions.Enterprise.UserHomepage.FilterorSortSubmissionsinUserHomepage().run("Filter by":/Drafts/.toString())
        //Search Submissions in User Homepage
        new actions.Enterprise.UserHomepage.SearchSubmissionsinUserHomepage().run("Search Text":/dra/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Verify and Access Submission in User Homepage
        new actions.Enterprise.UserHomepage.VerifySubmissioninUserHomepage().run("Total Number of Submissions":/1/.toString(),"Submission Name":/Custom App test idea draft/.toString(),"Description":/Description of Idea for Custom App/.toString(),"Status":/Draft/.toString(),"Initiative Name":/Custom App/.toString(),"Number of Matches":/1/.toString())
        //Search Submissions in User Homepage
        new actions.Enterprise.UserHomepage.SearchSubmissionsinUserHomepage().run("Clear Search":true)
        //Search Submissions in User Homepage
        new actions.Enterprise.UserHomepage.SearchSubmissionsinUserHomepage().run("Search Text":/DRAFT/.toString())
        //Verify and Access Submission in User Homepage
        new actions.Enterprise.UserHomepage.VerifySubmissioninUserHomepage().run("Total Number of Submissions":/1/.toString(),"Submission Name":/Custom App test idea draft/.toString(),"Description":/Description of Idea for Custom App/.toString(),"Status":/Draft/.toString(),"Initiative Name":/Custom App/.toString(),"Number of Matches":/1/.toString())
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