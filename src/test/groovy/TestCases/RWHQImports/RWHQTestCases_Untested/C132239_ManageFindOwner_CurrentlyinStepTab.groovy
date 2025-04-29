package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132239 - Manage Find Owner > Currently in Step Tab
class C132239_ManageFindOwner_CurrentlyinStepTab
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
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Suggest/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Suggest for Manage Title/.toString(),"Description":/Suggest for Manage Desc/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Suggest for Manage Title/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Find Owner Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureFindOwnerinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Find Owner/.toString(),"Category":/Business Development,Engineering,Finance,HR,IT,Legal,Marketing,Operations,Product,R&D,Sales,Other,Quick Add\/New Categories/.toString(),"Owner":/System Admin,Pipeline Admin,System Admin,System Admin,System Admin,System Admin,System Admin,System Admin,System Admin,System Admin,System Admin,System Admin,System Admin/.toString(),"Owner Add or Remove":/Add,Add,Add,Add,Add,Add,Add,Add,Add,Add,Add,Add,Add/.toString(),"Action":/Activate/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/Quick Add Idea for Find Owner1/.toString(),"Action":/Submit/.toString())
        //Verify Currently in Step table for Find Owner
        new actions.PipelineManageSteps.VerifyCurrentlyinSteptableforFindOwner().run("Step Name to Manage (optional)":/Find Owner/.toString(),"Title":/Quick Add Idea for Find Owner1/.toString(),"Category":/Quick Add/.toString(),"Category Assignee":/System Admin/.toString(),"Current Assignee":/System Admin/.toString(),"Number of Matches":/1/.toString())
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/Quick Add Idea for Find Owner1/.toString())
        //Set Find Owner for an Idea in Action Items page
        new actions.ActionItems.SetFindOwnerforanIdeainActionItemspage().run("Do you own the decision to implement this idea":/No/.toString(),"Can you help us find the appropriate owner for this idea":/Yes - I can forward this idea to the correct Category/.toString(),"Reassign Find Owner Action Item to the right category":/Engineering/.toString(),"Action":/Confirm/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Suggest for Manage Title/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Verify Currently in Step table for Find Owner
        new actions.PipelineManageSteps.VerifyCurrentlyinSteptableforFindOwner().run("Step Name to Manage (optional)":/Find Owner/.toString(),"Title":/Quick Add Idea for Find Owner1/.toString(),"Category":/Engineering/.toString(),"Category Assignee":/Pipeline Admin/.toString(),"Current Assignee":/Pipeline Admin/.toString(),"Number of Matches":/1/.toString())
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