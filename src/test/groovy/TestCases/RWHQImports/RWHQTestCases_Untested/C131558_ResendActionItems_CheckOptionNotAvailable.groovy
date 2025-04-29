import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131558 - Resend Action Items - Check Option Not Available
class C131558_ResendActionItems_CheckOptionNotAvailable
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
        //Delete this after  Resend Action Items Part 1 toggle is Enabled
        Action64fbb434c9d98c8414b3179d([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Suggest/.toString(),"Sponsor Name":/Sri/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Suggest for Resend Action Items/.toString(),"Description":/Description/.toString(),"Action":/Create/.toString(),"Action on General Information Tab":/Continue/.toString(),"Action on Design Tab":/Continue/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Suggest for Resend Action Items/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Find Owner Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureFindOwnerinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Find Owner/.toString())
        //Send Keyboard Action
        new actions.selenium.SendKeyboardAction().run("Button":/PAGE DOWN/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Reassign new action items when submissions return to Step/.toString(),"Should Exist":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Suggest for Resend Action Items/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Implementation Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureImplementationinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Implementation/.toString())
        //Send Keyboard Action
        new actions.selenium.SendKeyboardAction().run("Button":/PAGE DOWN/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Reassign new action items when submissions return to Step/.toString(),"Should Exist":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Review Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureReviewStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Review/.toString())
        //Send Keyboard Action
        new actions.selenium.SendKeyboardAction().run("Button":/PAGE DOWN/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Reassign new action items when submissions return to Step/.toString(),"Should Exist":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Stack Rank Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureStackRankinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Stack Rank/.toString())
        //Send Keyboard Action
        new actions.selenium.SendKeyboardAction().run("Button":/PAGE DOWN/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Reassign new action items when submissions return to Step/.toString(),"Should Exist":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Pairwise Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigurePairwiseinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Pairwise/.toString())
        //Send Keyboard Action
        new actions.selenium.SendKeyboardAction().run("Button":/PAGE DOWN/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Reassign new action items when submissions return to Step/.toString(),"Should Exist":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Project Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureProjectStepinPipelineStepspage().run("Step Name to Configure (optional)":/Project Prep/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Reassign new action items when submissions return to Step/.toString(),"Should Exist":false)
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
    //Delete this after  Resend Action Items Part 1 toggle is Enabled
    public static def Action64fbb434c9d98c8414b3179d(def params){
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for Beta tab
        new actions.SetupBeta.SetEnterpriseSetupforBetatab().run("Resend Action Items - Single Scale, Scorecard, and Development Steps":true)

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