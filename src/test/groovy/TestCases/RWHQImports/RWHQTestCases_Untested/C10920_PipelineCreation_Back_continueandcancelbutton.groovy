import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C10920 - Pipeline Creation - Back,continue and cancel button
class C10920_PipelineCreation_Back_continueandcancelbutton
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
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Home/.toString())
        //Set Widget Controller
        new actions.Widgets.SetWidgetController().run("Widget Edit Mode":/Enable/.toString(),"Add Widget from Selection":/Mini Idea List/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Suggest/.toString(),"Sponsor Name":/End User/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Suggest Process Title/.toString(),"Description":/Suggest Process description/.toString(),"Choose Design Template":/Copy from an Existing Initiative/.toString(),"Copy from Existing Initiative Name":/Custom App/.toString(),"General Access":/ALL,Sri/.toString(),"General Access Add or Remove":/Remove,Add/.toString(),"Pipeline Administrators":/Pipeline Admin/.toString(),"Administrators Add or Remove":/Add/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Back/.toString(),"Action on General Information Tab":/Continue/.toString(),"Action on Design Tab":/Continue/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Suggest/.toString(),"Action on General Information Tab":/<EMPTY>/.toString(),"Action on Design Tab":/Back/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Suggest/.toString(),"Sponsor Name":/End User,End User 2/.toString(),"Sponsor Add or Remove":/Remove,Add/.toString(),"General Access":/Community Admin/.toString(),"General Access Add or Remove":/Add/.toString(),"Pipeline Administrators":/Evaluator/.toString(),"Administrators Add or Remove":/Add/.toString(),"Moderators":/Chris Williams/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString(),"Action on General Information Tab":/Continue/.toString(),"Action on Design Tab":/Continue/.toString())
        //Verify Widget Exists
        new actions.Widgets.VerifyWidgetExists().run("Widget Name":/Mini Idea List/.toString(),"Number of Matches":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Suggest Process Title/.toString(),"Area to Navigate to":/Pipeline Setup/.toString())
        //Set Participants in Pipeline Setup Page
        new actions.PipelineSetup.SetParticipantsinPipelineSetupPage().run("General Access":/Sri,Community Admin/.toString(),"General Access Add or Remove":/Remove,Remove/.toString())
        //Set Roles in Pipeline Setup Page
        new actions.PipelineSetup.SetRolesinPipelineSetupPage().run("Navigate to Tab":true,"Sponsor Name":/End User 2/.toString(),"Sponsor Add or Remove":/Remove/.toString(),"Administrators":/Pipeline Admin,System Admin,Evaluator/.toString(),"Administrators Add or Remove":/Remove,Remove,Remove/.toString(),"Moderators":/Moderator,Chris Williams/.toString(),"Moderators Add or Remove":/Remove,Remove/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        try{
            //Create App Webstorm
            new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Suggest/.toString(),"Sponsor Name":/Sri/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Suggest Process Title2/.toString(),"Description":/Desc/.toString(),"Action":/Cancel/.toString(),"Action on General Information Tab":/Continue/.toString(),"Action on Design Tab":/Continue/.toString())
        }
       catch(all){}catch(Error err){}
        //Close Current Window
        new actions.selenium.CloseWindow().run([:])
        //Open Browser
        new actions.selenium.Browser().run("Run Browser in Incognito":/TRUE/.toString(),"URL":/${variables."affiliateURL"}/.toString(),"Browser Type":/${variables."Browser"}/.toString())
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        try{
            //Navigate WebStorm or MTS
            new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Suggest Process Title2/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Quick Add an Idea in Pipeline Steps page
            new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Idea Test1/.toString(),"Action":/Submit/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Idea in Pipeline Steps page
        new actions.PipelineStepsView.VerifyIdeainPipelineStepsViewpage().run("Idea Name":/Idea Test1/.toString(),"Number of Matches":/0/.toString())
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