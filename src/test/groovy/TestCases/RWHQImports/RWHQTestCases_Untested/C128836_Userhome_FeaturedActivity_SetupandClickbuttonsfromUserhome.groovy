import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C128836 - Userhome - Featured Activity - Setup and Click buttons from Userhome
class C128836_Userhome_FeaturedActivity_SetupandClickbuttonsfromUserhome
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
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString(),"Highlights":true,"Featured Activity":true,"Featured Activity Title(s)":/Custom App,Evaluators app,Solve App/.toString(),"Featured Activity Title(s) Add or Remove":/Add,Add,Add/.toString(),"Activities":true,"My Ideas":true,"Submissions":true,"Projects":true,"Helpful Links":true,"User Metrics My Ideas":true,"User Metrics Submissions":true,"User Metrics Activities":true,"User Metrics Submission Views":true,"User Metrics Collaborators":true,"User Metrics Projects":true,"User Metrics Business Impact":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Verify Featured Activity in User Homepage
        new actions.Enterprise.UserHomepage.VerifyFeaturedActivityinUserHomepage().run("Total Number of Activities on the page":/3/.toString(),"Activity Name":/Custom App/.toString(),"Description":/Custom App Desc/.toString(),"Comments":/1/.toString(),"Submissions":/3/.toString(),"Users":/0/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Featured Activity in User Homepage
        new actions.Enterprise.UserHomepage.VerifyFeaturedActivityinUserHomepage().run("Activity Name":/Evaluators app/.toString(),"Description":/Evaluators app desc/.toString(),"Submissions":/1/.toString(),"Users":/0/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Featured Activity in User Homepage
        new actions.Enterprise.UserHomepage.VerifyFeaturedActivityinUserHomepage().run("Activity Name":/Solve App/.toString(),"Description":/Solve App Desc/.toString(),"Submissions":/2/.toString(),"Users":/0/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Navigate From Activity Card
        new actions.Enterprise.UserHomepage.NavigateFromActivityCard().run("Activity Name":/Custom App/.toString(),"Navigate to":/Submit/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/test idea3/.toString(),"Description":/desc/.toString(),"Category":/Operations/.toString(),"Required Short Question":/short/.toString(),"Action":/Submit Idea/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate From Activity Card
        new actions.Enterprise.UserHomepage.NavigateFromActivityCard().run("Activity Name":/Evaluators app/.toString(),"Navigate to":/Topic/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Submit a solution and help us/.toString(),"Should Exist":true)
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