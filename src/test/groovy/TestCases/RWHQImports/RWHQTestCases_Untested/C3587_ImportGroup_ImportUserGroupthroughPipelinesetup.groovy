import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C3587 - Import Group - Import User Group through Pipeline setup
class C3587_ImportGroup_ImportUserGroupthroughPipelinesetup
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
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Suggest/.toString(),"Sponsor Name":/System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/SuggestApp1/.toString(),"Description":/Desc/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/SuggestApp1/.toString(),"Area to Navigate to":/Pipeline Setup/.toString())
        //Set Participants in Pipeline Setup Page
        new actions.PipelineSetup.SetParticipantsinPipelineSetupPage().run("Import Group as":/General Access/.toString(),"Import File":/Invalid_Valid_Existing_Import.xls/.toString(),"Add or Remove Group":/Add/.toString(),"Import Group Action":/Import/.toString(),"Check Modal Action":/Finish Import/.toString(),"Group Name":/ImportUserGroup1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Manage Webstorms from Enterprise Setup page
        new actions.SetupEnterpriseWebStorms.ManageWebstormsfromEnterpriseSetuppage().run("Webstorms":/SuggestApp1/.toString(),"Group":/ImportUserGroup1/.toString(),"Add or Remove Group":/Remove/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Enterprise or Site":/Enterprise/.toString(),"Navigate to Groups Tab":true,"Create Edit or Delete":/Edit/.toString(),"Group Name to Edit or Delete":/ImportUserGroup1/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("User":/New User/.toString(),"Add or Remove":/Remove/.toString(),"Action":/Update/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Verify User in Users tab for People page
        new actions.People.VerifyUserinUserstabforPeoplepage().run("Email Address":/plainaddress/.toString(),"Screen Name":/Invalid Email/.toString(),"Number of Matches":/0/.toString())
        //Verify User in Users tab for People page
        new actions.People.VerifyUserinUserstabforPeoplepage().run("Email Address":/$@!$@$$.com/.toString(),"Screen Name":/Invalid Email1/.toString(),"Number of Matches":/0/.toString())
        //Verify User in Users tab for People page
        new actions.People.VerifyUserinUserstabforPeoplepage().run("Email Address":/email..email@brightidea.com/.toString(),"Screen Name":/Invalid Email2/.toString(),"Number of Matches":/0/.toString())
        //Verify User in Users tab for People page
        new actions.People.VerifyUserinUserstabforPeoplepage().run("Email Address":/John Snow <abc@brightidea.com>/.toString(),"Screen Name":/Invalid Email3/.toString(),"Number of Matches":/0/.toString())
        //Verify User in Users tab for People page
        new actions.People.VerifyUserinUserstabforPeoplepage().run("Email Address":/email@domain/.toString(),"Number of Matches":/0/.toString())
        //Verify User in Users tab for People page
        new actions.People.VerifyUserinUserstabforPeoplepage().run("Email Address":/example@email.com/.toString(),"Screen Name":/New User/.toString(),"Number of Matches":/1/.toString())
        //Verify User in Users tab for People page
        new actions.People.VerifyUserinUserstabforPeoplepage().run("Email Address":/email@domain..com/.toString(),"Number of Matches":/0/.toString())
        //Verify User in Users tab for People page
        new actions.People.VerifyUserinUserstabforPeoplepage().run("Email Address":/あいうえお@brightidea.com/.toString(),"Number of Matches":/0/.toString())
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