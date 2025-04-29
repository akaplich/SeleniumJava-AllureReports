import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C11000 - Solve Pipeline - Import group and add a new user as Early access participants
class C11000_SolvePipeline_ImportgroupandaddanewuserasEarlyaccessparticipants
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
        new actions.WebstormCreation.CreateSolveWebstorm().run("App Name":/Solve/.toString(),"Sponsor Name":/Sri/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Solve App12/.toString(),"Challenge Brief":/Desc/.toString(),"Action on General Information Tab":/Continue/.toString(),"Choose Design Template":/Use Default Design/.toString(),"Action on Design Tab":/Continue/.toString(),"General Access":/End User 2/.toString(),"General Access Add or Remove":/Add/.toString(),"Early Access":/early_access@test.com/.toString(),"Early Access Add or Remove":/Add/.toString(),"Import Group as":/Early Access/.toString(),"Import File":/user-import-template1.xls/.toString(),"Add or Remove Group":/Add/.toString(),"Import Group Action":/Import/.toString(),"Group Name":/ImportUserGroup1/.toString(),"Action on Participants Tab":/Continue/.toString(),"Action on Site Schedule Tab":/Continue/.toString(),"Action on Communications Tab":/Continue/.toString(),"Action on Process Tab":/Continue/.toString())
        //Verify Review Tab for Solve Webstorm
        new actions.WebstormCreation.VerifyReviewTabforSolveWebstorm().run("Name":/Solve App12/.toString(),"Early Access":/ImportUserGroup1,early_access@test.com/.toString(),"Should Early Access Exist":/TRUE,TRUE/.toString())
        //Create Solve Webstorm
        new actions.WebstormCreation.CreateSolveWebstorm().run("App Name":/Solve/.toString(),"Action on Design Tab":/<EMPTY>/.toString(),"Action":/Create/.toString())
        //Verify Solve Challenge Home
        new actions.Webstorm.VerifySolveChallengeHome().run("Headline":/SolveApp12/.toString(),"Should Homepage Exist":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/moderator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Solve App12/.toString(),"Area to Navigate to":/Home/.toString())
        //Verify Solve Challenge Home
        new actions.Webstorm.VerifySolveChallengeHome().run("Headline":/Solve App12/.toString(),"Should Homepage Exist":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Enterprise or Site":/Enterprise/.toString(),"Navigate to Groups Tab":true,"Create Edit or Delete":/Edit/.toString(),"Group Name to Edit or Delete":/ImportUserGroup1/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("User":/Moderator,End User,New User3/.toString(),"Add or Remove":/Remove,Remove,Remove/.toString(),"Action":/Update/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Solve App12/.toString(),"Area to Navigate to":/Pipeline Setup/.toString())
        //Set Participants in Pipeline Setup Page
        new actions.PipelineSetup.SetParticipantsinPipelineSetupPage().run("Early Access":/ImportUserGroup1,early_access@test.com/.toString(),"Early Access Add or Remove":/Remove,Remove/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Verify User in Users tab for People page
        new actions.People.VerifyUserinUserstabforPeoplepage().run("Email Address":/bi.enduser1@brightidea.com/.toString(),"Screen Name":/End User/.toString(),"Number of Matches":/1/.toString())
        //Verify User in Users tab for People page
        new actions.People.VerifyUserinUserstabforPeoplepage().run("Email Address":/firstname_lastname@sub.do.com/.toString(),"Screen Name":/New User3/.toString(),"Number of Matches":/1/.toString())
        //Verify User in Users tab for People page
        new actions.People.VerifyUserinUserstabforPeoplepage().run("Email Address":/moderator@test.com/.toString(),"Screen Name":/ModeratorUpdated/.toString(),"Number of Matches":/0/.toString())
        //Verify User in Users tab for People page
        new actions.People.VerifyUserinUserstabforPeoplepage().run("Email Address":/moderator@test.com/.toString(),"Screen Name":/Moderator/.toString(),"Number of Matches":/1/.toString())
        //Verify User in Users tab for People page
        new actions.People.VerifyUserinUserstabforPeoplepage().run("Email Address":/early_access@test.com/.toString(),"Number of Matches":/1/.toString())
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