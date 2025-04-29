package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C10925 - Pipeline Creation - Solve App
class C10925_PipelineCreation_SolveApp
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
        //Create Solve Webstorm
        new actions.WebstormCreation.CreateSolveWebstorm().run("App Name":/Solve/.toString(),"Sponsor Name":/Sri/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Solve challenge title/.toString(),"Challenge Brief":/Solve challenge description/.toString(),"Action on General Information Tab":/Continue/.toString(),"Choose Design Template":/Use Default Design/.toString(),"Action on Design Tab":/Continue/.toString(),"General Access":/End User 2/.toString(),"General Access Add or Remove":/Add/.toString(),"Early Access":/End User/.toString(),"Early Access Add or Remove":/Add/.toString(),"Pipeline Administrators":/Pipeline Admin/.toString(),"Administrators Add or Remove":/Add/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action on Participants Tab":/Continue/.toString(),"Launch Date":/12\/12\/2018/.toString(),"Launch Time":/10:00 AM/.toString(),"End Date":/11\/09\/2019/.toString(),"End Time":/9:00 PM/.toString(),"Action on Site Schedule Tab":/Continue/.toString(),"Launch Message":/12\/12\/2018/.toString(),"Challenge Update":/05\/07\/2019/.toString(),"Challenge Last Day":/11\/08\/2019/.toString(),"Challenge End":/11\/09\/2019/.toString(),"Action on Communications Tab":/Continue/.toString(),"Single Scale Field":/Rate Potential Solutions/.toString(),"Single Scale Field Assignee":/Evaluator/.toString(),"Single Scale Assignee Add or Remove":/Add/.toString(),"Scorecard Field":/Evaluate Potential Solutions/.toString(),"Scorecard Field Assignee":/Pipeline Sponsor/.toString(),"Scorecard Field Assignee Add or Remove":/Add/.toString(),"Action on Process Tab":/Continue/.toString())
        //Verify Review Tab for Solve Webstorm
        new actions.WebstormCreation.VerifyReviewTabforSolveWebstorm().run("Name":/Solve challenge title/.toString(),"Description":/Solve challenge description/.toString(),"Sponsor":/Sri/.toString(),"Design Template":/Preconfigured homepage design/.toString(),"Early Access":/End User/.toString(),"Should Early Access Exist":/TRUE/.toString(),"General Access":/End User 2/.toString(),"Should General Access Exist":/TRUE/.toString(),"Administrators":/System Admin,Pipeline Admin/.toString(),"Should Administrators Exist":/TRUE,TRUE/.toString(),"Moderators":/Moderator/.toString(),"Should Moderators Exist":/TRUE/.toString(),"Launch Date":/12\/12\/2018 - 10:00 AM - (UTC) Coordinated Universal Time/.toString(),"End Date":/11\/09\/2019 - 9:00 PM - (UTC) Coordinated Universal Time/.toString(),"Launch Message":/12\/12\/2018/.toString(),"Challenge Update":/05\/07\/2019/.toString(),"Challenge Last Day":/11\/08\/2019/.toString(),"Challenge End":/11\/09\/2019/.toString(),"Initial Screen (Single Scale) Assignee":/Evaluator/.toString(),"Should Initial Screen (Single Scale) Assignee Exist":/TRUE/.toString(),"Scorecard":/Pipeline Sponsor/.toString(),"Should Scorecard Assignee Exist":/TRUE/.toString(),"Template":/Solve - Solution Evaluation/.toString())
        //Create Solve Webstorm
        new actions.WebstormCreation.CreateSolveWebstorm().run("Action on Design Tab":/<EMPTY>/.toString(),"Action":/Create/.toString())
        //Verify Solve Challenge Home
        new actions.Webstorm.VerifySolveChallengeHome().run("Headline":/Solve challenge title/.toString(),"Description":/Solve challenge description/.toString(),"Should Homepage Exist":true)
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