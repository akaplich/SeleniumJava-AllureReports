import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C129841 - Visibility Administrator & Evaluator - System Admin on NGA View Idea (Manage Page)
class C129841_VisibilityAdministratorAndEvaluator_SystemAdminonNGAViewIdea_ManagePage
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
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Create Step in Pipeline Steps page
        new actions.PipelineStepsView.CreateStepinPipelineStepspage().run("Step Name":/New Dev Step/.toString(),"Select Tool Type":/Development/.toString(),"Select Stage":/Evaluation/.toString(),"Action":/Create/.toString())
        //Configure Development Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureDevelopmentinNewModalinPipelineStepspage().run("Assignment Method":/Category Assignment/.toString(),"Development Lead Category":/New Product,Operations,Marketing & Branding,Strategy,Quick Add\/New Categories/.toString(),"Development Lead":/Select a user,Select a user,Select a user,Select a user,Select a user/.toString(),"Selected user":/Evaluator,Evaluator,Evaluator,Evaluator,Evaluator/.toString(),"Selected Users Add or Remove":/Add,Add,Add,Add,Add/.toString(),"Development Field":/Development Multiple Choice Question,Development Long Answer Question,Development Attachment Question,Development User Select Question,Development Parent Dropdown Question,Development Child Checkbox Question/.toString(),"Development Field Included or Required":/Included,Included,Included,Included,Included,Included/.toString(),"Action":/Activate/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/New Dev Step/.toString(),"Action":/Change Step/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/test idea1/.toString())
        //Set Development for Idea in Action Items page
        new actions.ActionItems.SetDevelopmentforIdeainActionItemspage().run("Development Multiple Choice Question":/Answer 1/.toString(),"Development Long Answer Question":/This to test development question field in view idea/.toString(),"Development Attachment Question":/Image4.jpg/.toString(),"Development User Select Question":/Pipeline Admin/.toString(),"Development User Select Question Add or Remove":/Add/.toString(),"Development Parent Dropdown Question":/Parent Dropdown Answer 2/.toString(),"Development Child Checkbox Question":["Child Checkbox Answer 1"],"Action":/Mark Complete/.toString(),"Action on Mark Development Form Complete":/Mark Complete/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Access Pipeline Manage Steps for a Step
        new actions.PipelineStepsView.AccessPipelineManageStepsforaStep().run("Step Name":/New Dev Step/.toString())
        //Access Idea in Pipeline Manage Currently in Step Page
        new actions.PipelineManageSteps.AccessIdeainPipelineManageCurrentlyinStepPage().run("Idea name":/test idea1/.toString())
        //Verify NGA View Idea Description Tab Field Value
        new actions.NGAViewIdea.VerifyNGAViewIdeaDescriptionTabFieldValue().run("Field Name":/Development Multiple Choice Question/.toString(),"Field Value":/Answer 1/.toString())
        //Verify NGA View Idea Description Tab Field Value
        new actions.NGAViewIdea.VerifyNGAViewIdeaDescriptionTabFieldValue().run("Field Name":/Development Long Answer Question/.toString(),"Field Value":/This to test development question field in view idea/.toString())
        //Verify NGA View Idea Description Tab Field Value
        new actions.NGAViewIdea.VerifyNGAViewIdeaDescriptionTabFieldValue().run("Field Name":/Development User Select Question/.toString(),"Field Value":/Pipeline Admin/.toString())
        //Verify NGA View Idea Description Tab Field Value
        new actions.NGAViewIdea.VerifyNGAViewIdeaDescriptionTabFieldValue().run("Field Name":/Development Parent Dropdown Question/.toString(),"Field Value":/Parent Dropdown Answer 2/.toString())
        //Verify NGA View Idea Description Tab Field Value
        new actions.NGAViewIdea.VerifyNGAViewIdeaDescriptionTabFieldValue().run("Field Name":/Development Child Checkbox Question/.toString(),"Field Value":/Child Checkbox Answer 1/.toString())
        //Verify NGA View Idea Description Tab Field Value
        new actions.NGAViewIdea.VerifyNGAViewIdeaDescriptionTabFieldValue().run("Field Name":/Development Attachment Question/.toString(),"Field Value":/Image4.jpg/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/pipelineadmin@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Access Pipeline Manage Steps for a Step
        new actions.PipelineStepsView.AccessPipelineManageStepsforaStep().run("Step Name":/New Dev Step/.toString())
        //Access Idea in Pipeline Manage Currently in Step Page
        new actions.PipelineManageSteps.AccessIdeainPipelineManageCurrentlyinStepPage().run("Idea name":/test idea1/.toString())
        //Verify NGA View Idea Description Tab Field Value
        new actions.NGAViewIdea.VerifyNGAViewIdeaDescriptionTabFieldValue().run("Field Name":/Development Multiple Choice Question/.toString(),"Field Value":/Answer 1/.toString())
        //Verify NGA View Idea Description Tab Field Value
        new actions.NGAViewIdea.VerifyNGAViewIdeaDescriptionTabFieldValue().run("Field Name":/Development Long Answer Question/.toString(),"Field Value":/This to test development question field in view idea/.toString())
        //Verify NGA View Idea Description Tab Field Value
        new actions.NGAViewIdea.VerifyNGAViewIdeaDescriptionTabFieldValue().run("Field Name":/Development User Select Question/.toString(),"Field Value":/Pipeline Admin/.toString())
        //Verify NGA View Idea Description Tab Field Value
        new actions.NGAViewIdea.VerifyNGAViewIdeaDescriptionTabFieldValue().run("Field Name":/Development Parent Dropdown Question/.toString(),"Field Value":/Parent Dropdown Answer 2/.toString())
        //Verify NGA View Idea Description Tab Field Value
        new actions.NGAViewIdea.VerifyNGAViewIdeaDescriptionTabFieldValue().run("Field Name":/Development Child Checkbox Question/.toString(),"Field Value":/Child Checkbox Answer 1/.toString())
        //Verify NGA View Idea Description Tab Field Value
        new actions.NGAViewIdea.VerifyNGAViewIdeaDescriptionTabFieldValue().run("Field Name":/Development Attachment Question/.toString(),"Field Value":/Image4.jpg/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/moderator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Access Pipeline Manage Steps for a Step
        new actions.PipelineStepsView.AccessPipelineManageStepsforaStep().run("Step Name":/New Dev Step/.toString())
        //Access Idea in Pipeline Manage Currently in Step Page
        new actions.PipelineManageSteps.AccessIdeainPipelineManageCurrentlyinStepPage().run("Idea name":/test idea1/.toString())
        //Verify NGA View Idea Description Tab Field Value
        new actions.NGAViewIdea.VerifyNGAViewIdeaDescriptionTabFieldValue().run("Field Name":/Development Multiple Choice Question/.toString(),"Field Value":/Answer 1/.toString())
        //Verify NGA View Idea Description Tab Field Value
        new actions.NGAViewIdea.VerifyNGAViewIdeaDescriptionTabFieldValue().run("Field Name":/Development Long Answer Question/.toString(),"Field Value":/This to test development question field in view idea/.toString())
        //Verify NGA View Idea Description Tab Field Value
        new actions.NGAViewIdea.VerifyNGAViewIdeaDescriptionTabFieldValue().run("Field Name":/Development User Select Question/.toString(),"Field Value":/Pipeline Admin/.toString())
        //Verify NGA View Idea Description Tab Field Value
        new actions.NGAViewIdea.VerifyNGAViewIdeaDescriptionTabFieldValue().run("Field Name":/Development Parent Dropdown Question/.toString(),"Field Value":/Parent Dropdown Answer 2/.toString())
        //Verify NGA View Idea Description Tab Field Value
        new actions.NGAViewIdea.VerifyNGAViewIdeaDescriptionTabFieldValue().run("Field Name":/Development Child Checkbox Question/.toString(),"Field Value":/Child Checkbox Answer 1/.toString())
        //Verify NGA View Idea Description Tab Field Value
        new actions.NGAViewIdea.VerifyNGAViewIdeaDescriptionTabFieldValue().run("Field Name":/Development Attachment Question/.toString(),"Field Value":/Image4.jpg/.toString())
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