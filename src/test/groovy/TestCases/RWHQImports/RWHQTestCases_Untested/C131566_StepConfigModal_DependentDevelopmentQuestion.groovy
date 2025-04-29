import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131566 - Step Config Modal - Dependent Development Question
class C131566_StepConfigModal_DependentDevelopmentQuestion
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
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Custom1/.toString(),"Description":/test/.toString(),"Action":/Create/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Do we require a design review based on the information in the idea?/.toString(),"Additional Question Type":/Multiple Choice/.toString(),"Additional Question Answers":/Yes design review is required,No design review is not equired/.toString(),"Additional Question Answers Actions":/Add,Add/.toString(),"Development Field":true)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Please provide a list of questions on information outstanding requiring a design review/.toString(),"Additional Question Type":/Long Answer/.toString(),"Development Field":true,"Save Form":true)
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Please provide a list of questions on information outstanding requiring a design review/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Set Dependent Answer":true,"Set Dependent Answer Dropdown":/Yes design review is required/.toString(),"Click on Done":true,"Save Form":true)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Has the design review been completed? Outstanding questions asked\/answerred?/.toString(),"Additional Question Type":/Multiple Choice/.toString(),"Additional Question Answers":/Yes design review has been completed,No design review has not been completed/.toString(),"Additional Question Answers Actions":/Add,Add/.toString(),"Development Field":true,"Save Form":true)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Provide responses to all outstanding information required/.toString(),"Additional Question Type":/Long Answer/.toString(),"Development Field":true,"Save Form":true)
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Steps/.toString())
        //Edit Step in Pipeline Steps page
        new actions.PipelineStepsView.EditStepinPipelineStepspage().run("Step to Edit":/Initial Screen/.toString(),"Tool Type":/Development/.toString(),"Action":/Update/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Configure Development Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureDevelopmentinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Initial Screen/.toString(),"Development Field":/Do we require a design review based on the information in the idea?/.toString(),"Development Field Included or Required":/Included/.toString())
        //Configure Development Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureDevelopmentinNewModalinPipelineStepspage().run("Development Field":/Please provide a list of questions on information outstanding requiring a design review/.toString(),"Development Field Included or Required":/Included/.toString())
        //Configure Development Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureDevelopmentinNewModalinPipelineStepspage().run("Development Field":/Has the design review been completed? Outstanding questions asked\/answerred?/.toString(),"Development Field Included or Required":/Included/.toString())
        //Configure Development Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureDevelopmentinNewModalinPipelineStepspage().run("Development Field":/Provide responses to all outstanding information required/.toString(),"Development Field Included or Required":/Included/.toString(),"Action":/Activate/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/dev questions - idea/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/dev questions - idea/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Initial Screen/.toString(),"Action":/Change Step/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/dev questions - idea/.toString())
        //Set Development Action Item Page Fields
        new actions.ActionItems.SetDevelopmentActionItemPageFields().run([:])
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Please provide a list of questions on information outstanding requiring a design review/.toString(),"Should Exist":false)
        //Set Development Action Item Page Fields
        new actions.ActionItems.SetDevelopmentActionItemPageFields().run("Multiple Choice - Title":/Do we require a design review based on the information in the idea?/.toString(),"Multiple Choice - Answer":/Yes/.toString())
        //Set Development Action Item Page Fields
        new actions.ActionItems.SetDevelopmentActionItemPageFields().run("Long Answer - Title":/Please provide a list of questions on information outstanding requiring a design review/.toString(),"Long Answer - Answer":/test1, test2, test3 C131566/.toString())
        //Set Development Action Item Page Fields
        new actions.ActionItems.SetDevelopmentActionItemPageFields().run("Multiple Choice - Title":/Has the design review been completed? Outstanding questions asked\/answerred?/.toString(),"Multiple Choice - Answer":/Yes/.toString())
        //Set Development Action Item Page Fields
        new actions.ActionItems.SetDevelopmentActionItemPageFields().run("Long Answer - Title":/Provide responses to all outstanding information required/.toString(),"Long Answer - Answer":/test1, test2, test3 C131566/.toString(),"Action":/Mark Complete/.toString())
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