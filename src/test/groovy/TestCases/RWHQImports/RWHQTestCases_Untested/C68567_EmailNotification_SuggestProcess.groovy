package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C68567 - Email Notification - Suggest Process
class C68567_EmailNotification_SuggestProcess
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
        //Create Mailinator User
        new actions.Mailinator.CreateMailinatorUser().run("Email":/brightC68567_7/.toString(),"Enterprise System Administrator":true,"Finally Login as What User":/brightC68567_7@mailinator.com/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Suggest/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Suggest Process title/.toString(),"Description":/Suggest Process description/.toString(),"Action":/Create/.toString())
        //Verify Initiative Home
        new actions.Webstorm.VerifyWebstormHome().run("Initiative Title":/Suggest Process title/.toString())
        //Get the Link from Pipeline Creation Email
        variables."link" = new actions.Mailinator.GettheLinkfromPipelineCreationEmail().run("Email Address":/brightC68567_7@mailinator.com/.toString(),"Links":/ Pipeline Steps View/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        //Verify Step in Pipeline Steps page
        new actions.PipelineStepsView.VerifyStepinPipelineStepspage().run("Step Name":/Find Owner/.toString(),"Stage Name step belongs to":/Idea Submission/.toString(),"Number of Ideas in a step":/0/.toString(),"Number of Matches":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Suggest/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Suggest Process title1/.toString(),"Description":/Suggest Process description1/.toString(),"Action":/Create/.toString())
        //Verify Initiative Home
        new actions.Webstorm.VerifyWebstormHome().run("Initiative Title":/Suggest Process title1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Get the Link from Pipeline Creation Email
        variables."link" = new actions.Mailinator.GettheLinkfromPipelineCreationEmail().run("Email Address":/brightC68567_7@mailinator.com/.toString(),"Links":/Site Home Page/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        //Verify Initiative Home
        new actions.Webstorm.VerifyWebstormHome().run("Initiative Title":/Suggest Process title1/.toString())
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