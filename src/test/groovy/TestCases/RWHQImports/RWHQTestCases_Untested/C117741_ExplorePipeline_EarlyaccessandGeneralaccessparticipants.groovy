import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C117741 - Explore Pipeline - Early access and General access participants
class C117741_ExplorePipeline_EarlyaccessandGeneralaccessparticipants
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
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Navigate to Groups Tab":true,"Create Edit or Delete":/Create/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("Group Name":/New Group/.toString(),"User":/Evaluator,Community Admin/.toString(),"Add or Remove":/Add,Add/.toString(),"Action":/Create Group/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Solve Webstorm
        new actions.WebstormCreation.CreateSolveWebstorm().run("App Name":/Explore/.toString(),"Sponsor Name":/Sri/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Explore Challenge Title/.toString(),"Challenge Brief":/desc/.toString(),"Action on General Information Tab":/Continue/.toString(),"Choose Design Template":/Use Default Design/.toString(),"Action on Design Tab":/Continue/.toString(),"General Access":/End User 2,ALL/.toString(),"General Access Add or Remove":/Add,Remove/.toString(),"Early Access":/End User,End User 2,New Group,End User 2/.toString(),"Early Access Add or Remove":/Add,Add,Add,Remove/.toString(),"Action on Participants Tab":/Continue/.toString(),"Action on Site Schedule Tab":/Continue/.toString(),"Action on Process Tab":/Continue/.toString())
        //Verify Review Tab for Solve Webstorm
        new actions.WebstormCreation.VerifyReviewTabforSolveWebstorm().run("Name":/Explore Challenge Title/.toString(),"Early Access":/End User,End User 2,New Group/.toString(),"Should Early Access Exist":/TRUE,FALSE,TRUE/.toString(),"General Access":/End User 2,ALL/.toString(),"Should General Access Exist":/TRUE,FALSE/.toString(),"Administrators":/System Admin/.toString(),"Should Administrators Exist":/TRUE/.toString())
        //Create Solve Webstorm
        new actions.WebstormCreation.CreateSolveWebstorm().run("Action on Design Tab":/<EMPTY>/.toString(),"Action":/Create/.toString())
        //Verify Initiative Home
        new actions.Webstorm.VerifyWebstormHome().run("Initiative Title":/Explore Challenge Title/.toString(),"Initiative Description":/desc/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Explore Challenge Title/.toString(),"Area to Navigate to":/Home/.toString())
        //Verify Initiative Home
        new actions.Webstorm.VerifyWebstormHome().run("Initiative Title":/Explore Challenge Title/.toString(),"Initiative Description":/desc/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser2@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Explore Challenge Title/.toString(),"Area to Navigate to":/Home/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/DAYS TO LAUNCH/.toString(),"Should Exist":true)
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