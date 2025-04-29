import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C128078 - Submission Form Builder - Hidden Submission Questions
class C128078_SubmissionFormBuilder_HiddenSubmissionQuestions
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
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Invisible/.toString(),"Additional Question Type":/Short Answer/.toString(),"Save Form":true)
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Multiple Choice Question/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Action on Edit, Hide or Remove":/Submit/.toString(),"New Question Title":/Multiple Choice Hidden/.toString())
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Multiple Choice Hidden/.toString(),"Edit or Hide or Remove":/Hide/.toString(),"Action on Edit, Hide or Remove":/Submit/.toString(),"Save Form":true)
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Invisible/.toString(),"Edit or Hide or Remove":/Hide/.toString(),"Action on Edit, Hide or Remove":/Submit/.toString(),"Save Form":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Multiple Choice Hidden/.toString(),"Should Exist":false)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Invisible/.toString(),"Should Exist":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Multiple Choice Hidden/.toString(),"Should Exist":false)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Invisible/.toString(),"Should Exist":false)
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