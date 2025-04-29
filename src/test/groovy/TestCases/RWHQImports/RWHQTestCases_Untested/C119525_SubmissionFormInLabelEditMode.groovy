package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C119525 - Submission Form In Label Edit Mode
class C119525_SubmissionFormInLabelEditMode
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
        //Return Affiliate Name
        variables."affName" = new actions.general.ReturnAffiliateName().run("Affiliate URL":/${variables."affiliateURL"}/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Home/.toString())
        //Set Widget Controller
        new actions.Widgets.SetWidgetController().run("Label Edit Mode":/Enable/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Title Question Title":/Name Your Idea/.toString(),"Title Placeholder Text":/Your Title Here/.toString(),"Title Similar Ideas Section":/Existing Titles/.toString(),"Image Question Title":/Picture/.toString(),"Submitter Title":/Idea Owner/.toString(),"Submitter Individual Submitter Text":/Individual/.toString(),"Submitter Team Submitter Text":/Department/.toString(),"Submitter Team Info Banner":/You will be the team lead/.toString(),"Submitter Team Placeholder Text":/Team members are listed here/.toString(),"Submitter Anonymous Submitter Text":/Incognito/.toString(),"Submitter Anonymous Info Banner":/No one will see your username except Admin/.toString(),"Description Question Title":/Idea Details/.toString(),"Attachments Title":/Files to Attach/.toString(),"Tags Question Title":/Keywords/.toString(),"Tags Placeholder Text":/Enter Your Keywords/.toString(),"Tags Help Text":/Keywords help others to find your idea/.toString(),"Category Question Title":/Type/.toString(),"Category Default Text":/Choose idea type/.toString(),"Expertise Help Text":/Add desired expert skills to your idea/.toString(),"Additional Question Name":/New Checkbox Question/.toString(),"Additional Question Type":/Checkbox/.toString(),"Additional Question Answers":/Selection 1,Selection 2,Selection 3,Selection 4/.toString(),"Additional Question Answers Actions":/Add,Add,Add,Add,Add/.toString(),"Additional Question Tooltip":/Tooltip Test/.toString(),"Save Form":true)
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