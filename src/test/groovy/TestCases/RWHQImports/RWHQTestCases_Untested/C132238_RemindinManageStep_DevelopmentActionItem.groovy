import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132238 - Remind in Manage Step > Development Action Item
class C132238_RemindinManageStep_DevelopmentActionItem
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
        new actions.Mailinator.CreateMailinatorUser().run("Email":/brightC132238testuser1/.toString(),"Enterprise System Administrator":true,"Finally Login as What User":/bi.adminuser1@brightidea.com/.toString())
        //Create Mailinator User
        new actions.Mailinator.CreateMailinatorUser().run("Email":/brightC132238testuser2/.toString(),"Enterprise System Administrator":true,"Finally Login as What User":/brightC132238testuser1@mailinator.com/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Create Step in Pipeline Steps page
        new actions.PipelineStepsView.CreateStepinPipelineStepspage().run("Step Name":/Development1/.toString(),"Select Tool Type":/Development/.toString(),"Select Stage":/Collection/.toString(),"Action":/Create/.toString())
        //Configure Development Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureDevelopmentinNewModalinPipelineStepspage().run("Assignment Method":/Individual Assignment/.toString(),"Development Team":/brightC132238testuser2@mailinator.com/.toString(),"Development Team Add or Remove":/Add/.toString(),"Development Field":/Development Multiple Choice Question,Development Long Answer Question/.toString(),"Development Field Included or Required":/Included,Included/.toString(),"Action":/Activate/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/Quick Add Idea for Development1/.toString(),"Action":/Submit/.toString())
        //Verify Email
        new actions.Mailinator.VerifyEmail().run("Email Address":/brightC132238testuser1/.toString(),"Subject":/Idea Submission Confirmation/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Quick Add Idea for Development1/.toString(),"Step Name idea belongs to":/Review/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Development1/.toString(),"Action":/Change Step/.toString())
        //Verify Email
        new actions.Mailinator.VerifyEmail().run("Email Address":/brightC132238testuser2/.toString(),"Subject":/You have 1 new Action Items/.toString())
        //Verify Email
        new actions.Mailinator.VerifyEmail().run("Email Address":/brightC132238testuser1/.toString(),"Subject":/You have 1 new Action Items/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        try{
            //Verify Action Items in Progress in Manage Step Page
            new actions.PipelineManageSteps.VerifyActionItemsinProgressinManageStep().run("Step Name to Manage (optional)":/Development1/.toString())
        }
       catch(all){}catch(Error err){}
        //Set Grid Action Dropdown in Progress in Manage Step Page
        new actions.PipelineManageSteps.SetGridActionDropdowninProgressinManageStepPage().run("Idea or Evaluator":/Idea/.toString(),"Name":/Quick Add Idea for Development1/.toString(),"Dropdown Menu Option":/Remind/.toString(),"Remind Action":/Send/.toString())
        //Verify Email
        new actions.Mailinator.VerifyEmail().run("Email Address":/brightC132238testuser2/.toString(),"Subject":/Reminder: You have development questions to complete./.toString(),"Body Contains":/Just a reminder, you have (1) Action Items to complete. Navigate to your open Action Items list by clicking the following URL/.toString())
        //Verify Email
        new actions.Mailinator.VerifyEmail().run("Email Address":/brightC132238testuser1/.toString(),"Subject":/Reminder: You have development questions to complete./.toString(),"Body Contains":/Just a reminder, you have (1) Action Items to complete. Navigate to your open Action Items list by clicking the following URL/.toString())
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