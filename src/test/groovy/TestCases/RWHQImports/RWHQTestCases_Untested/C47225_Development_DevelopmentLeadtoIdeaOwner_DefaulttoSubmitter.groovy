import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C47225 - Development - Development Lead to Idea Owner(Default to Submitter)
class C47225_Development_DevelopmentLeadtoIdeaOwner_DefaulttoSubmitter
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
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Suggest/.toString(),"Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Suggest Pipeline/.toString(),"Description":/Desc/.toString(),"Action":/Create/.toString(),"Action on General Information Tab":/Continue/.toString(),"Action on Design Tab":/Continue/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Suggest Pipeline/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Dev Field/.toString(),"Additional Question Type":/Short Answer/.toString(),"Development Field":true,"Save Form":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Suggest Pipeline/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Find Owner Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureFindOwnerinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Find Owner/.toString(),"Category":/Business Development,Engineering,Finance,HR,IT,Legal,Marketing,Operations,Product,R&D,Sales,Other,Quick Add\/New Categories/.toString(),"Owner":/System Admin,End User,System Admin,System Admin,System Admin,System Admin,System Admin,System Admin,System Admin,System Admin,System Admin,System Admin,End User/.toString(),"Owner Add or Remove":/Add,Add,Add,Add,Add,Add,Add,Add,Add,Add,Add,Add,Add/.toString(),"Action":/Activate/.toString())
        //Create Step in Pipeline Steps page
        new actions.PipelineStepsView.CreateStepinPipelineStepspage().run("Step Name":/New Step/.toString(),"Select Tool Type":/Development/.toString(),"Select Stage":/Project Implementation and Rollout/.toString(),"Action":/Create/.toString())
        //Configure Development Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureDevelopmentinNewModalinPipelineStepspage().run("Development Lead":/Idea Owner (Default to submitter if owner not found)/.toString(),"Development Field":/Dev Field/.toString(),"Development Field Included or Required":/Included/.toString(),"Action":/Activate/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Find Owner Idea1/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Find Owner Idea1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/New Step/.toString(),"Action":/Change Step/.toString())
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/View All/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Verify in Which List (optional)":/My Action Items/.toString(),"Title":/Find Owner Idea1/.toString(),"Pipeline":/Suggest Pipeline/.toString(),"Step":/New Step/.toString(),"Type":/Development/.toString(),"Number of Matches":/1/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/View All/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/View All/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Verify in Which List (optional)":/My Action Items/.toString(),"Title":/Find Owner Idea1/.toString(),"Pipeline":/Suggest Pipeline/.toString(),"Step":/New Step/.toString(),"Type":/Development/.toString(),"Number of Matches":/0/.toString())
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