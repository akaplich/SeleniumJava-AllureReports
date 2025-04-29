package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C4330 - Add and Remove new users through Setup Wizard
class C4330_AddandRemovenewusersthroughSetupWizard
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
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Discuss/.toString(),"Sponsor Name":/sponsor1@brightidea.com/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/DiscussApp1/.toString(),"Description":/Desc/.toString(),"General Access":/participant1@brightidea.com,participant2@brightidea.com,participant3@brightidea.com,participant2@brightidea.com/.toString(),"General Access Add or Remove":/Add,Add,Add,Remove/.toString(),"Pipeline Administrators":/admin1@brightidea.com,admin2@brightidea.com,admin3@brightidea.com,admin2@brightidea.com/.toString(),"Administrators Add or Remove":/Add,Add,Add,Remove/.toString(),"Moderators":/moderator1@brightidea.com,moderator2@brightidea.com,moderator2@brightidea.com/.toString(),"Moderators Add or Remove":/Add,Add,Remove/.toString(),"Action":/Create/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Verify User in Users tab for People page
        new actions.People.VerifyUserinUserstabforPeoplepage().run("Email Address":/sponsor1@brightidea.com/.toString(),"Screen Name":/sponsor1@brightidea.com/.toString(),"Status":/Active/.toString(),"Administrative Roles":/Pipeline Sponsor/.toString(),"Number of Matches":/1/.toString())
        //Verify User in Users tab for People page
        new actions.People.VerifyUserinUserstabforPeoplepage().run("Email Address":/participant1@brightidea.com/.toString(),"Screen Name":/participant1@brightidea.com/.toString(),"Status":/Active/.toString(),"Group":/DiscussApp1/.toString(),"Number of Matches":/1/.toString())
        //Verify User in Users tab for People page
        new actions.People.VerifyUserinUserstabforPeoplepage().run("Email Address":/participant3@brightidea.com/.toString(),"Screen Name":/participant3@brightidea.com/.toString(),"Group":/DiscussApp1/.toString(),"Number of Matches":/1/.toString())
        //Verify User in Users tab for People page
        new actions.People.VerifyUserinUserstabforPeoplepage().run("Email Address":/admin1@brightidea.com/.toString(),"Screen Name":/admin1@brightidea.com/.toString(),"Status":/Active/.toString(),"Administrative Roles":/Pipeline Administrator/.toString(),"Number of Matches":/1/.toString())
        //Verify User in Users tab for People page
        new actions.People.VerifyUserinUserstabforPeoplepage().run("Email Address":/admin3@brightidea.com/.toString(),"Screen Name":/admin3@brightidea.com/.toString(),"Status":/Active/.toString(),"Administrative Roles":/Pipeline Administrator/.toString(),"Number of Matches":/1/.toString())
        //Verify User in Users tab for People page
        new actions.People.VerifyUserinUserstabforPeoplepage().run("Email Address":/moderator1@brightidea.com/.toString(),"Screen Name":/moderator1@brightidea.com/.toString(),"Status":/Active/.toString(),"Administrative Roles":/Pipeline Moderator/.toString(),"Number of Matches":/1/.toString())
        //Verify User in Users tab for People page
        new actions.People.VerifyUserinUserstabforPeoplepage().run("Email Address":/participant2@brightidea.com/.toString(),"Screen Name":/participant2@brightidea.com/.toString(),"Status":/Active/.toString(),"Group":/DiscussApp1/.toString(),"Number of Matches":/0/.toString())
        //Verify User in Users tab for People page
        new actions.People.VerifyUserinUserstabforPeoplepage().run("Email Address":/admin2@brightidea.com/.toString(),"Screen Name":/admin2@brightidea.com/.toString(),"Status":/Active/.toString(),"Administrative Roles":/Pipeline Administrator/.toString(),"Number of Matches":/0/.toString())
        //Verify User in Users tab for People page
        new actions.People.VerifyUserinUserstabforPeoplepage().run("Email Address":/moderator2@brightidea.com/.toString(),"Screen Name":/moderator2@brightidea.com/.toString(),"Status":/Active/.toString(),"Administrative Roles":/Moderator/.toString(),"Number of Matches":/0/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/DiscussApp1/.toString(),"Area to Navigate to":/Pipeline Setup/.toString())
        //Set Participants in Pipeline Setup Page
        new actions.PipelineSetup.SetParticipantsinPipelineSetupPage().run("General Access":/participant1@brightidea.com,participant3@brightidea.com/.toString(),"General Access Add or Remove":/Remove,Remove/.toString())
        //Set Roles in Pipeline Setup Page
        new actions.PipelineSetup.SetRolesinPipelineSetupPage().run("Navigate to Tab":true,"Sponsor Name":/sponsor1@brightidea.com/.toString(),"Sponsor Add or Remove":/Remove/.toString(),"Administrators":/admin1@brightidea.com,admin3@brightidea.com/.toString(),"Administrators Add or Remove":/Remove,Remove/.toString(),"Moderators":/moderator1@brightidea.com/.toString(),"Moderators Add or Remove":/Remove/.toString())
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