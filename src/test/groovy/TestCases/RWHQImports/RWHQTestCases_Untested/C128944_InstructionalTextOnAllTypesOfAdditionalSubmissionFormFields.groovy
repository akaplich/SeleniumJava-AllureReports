import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C128944 - Instructional Text On All Types Of Additional Submission Form Fields
class C128944_InstructionalTextOnAllTypesOfAdditionalSubmissionFormFields
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
        //Set Enterprise Setup for BIOnly Beta tab
        new actions.SetupBI.SetEnterpriseSetupforBIOnlyBetatab().run("Instructional Text for Post Idea 2.0":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Multiple Choice Question/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Action on Edit, Hide or Remove":/Submit/.toString(),"Body":/Instructional Text for Multiple Choice Question/.toString())
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Checkbox Question/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Action on Edit, Hide or Remove":/Submit/.toString(),"Body":/Instructional Text for Checkbox Question/.toString())
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Short Answer Question/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Action on Edit, Hide or Remove":/Submit/.toString(),"Body":/Instructional Text for Short Answer Question/.toString())
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Long Answer Question/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Action on Edit, Hide or Remove":/Submit/.toString(),"Body":/Instructional Text for Long Answer Question/.toString())
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Dropdown Question/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Action on Edit, Hide or Remove":/Submit/.toString(),"Body":/Instructional Text for Dropdown Question/.toString())
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Date Question/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Action on Edit, Hide or Remove":/Submit/.toString(),"Body":/Instructional Text for Date Question/.toString())
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Number Question/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Action on Edit, Hide or Remove":/Submit/.toString(),"Body":/Instructional Text for Number Question/.toString())
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/User Selection Question/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Action on Edit, Hide or Remove":/Submit/.toString(),"Body":/Instructional Text for User Selection Question/.toString(),"Save Form":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Wait for Page to Load":true,"Title":/just to get scroll to the bottom/.toString(),"Description":/desc/.toString(),"Category":/Operations/.toString(),"Multiple Choice Question":/Answer 1/.toString(),"Short Answer Question":/short/.toString(),"Long Answer Question":/no so short/.toString(),"Number Question":/12345/.toString(),"User Selection Question Name":/End User 2/.toString(),"User Selection Question Add or Remove":/Add/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Instructional Text for User Selection Question/.toString(),"Should Exist":true)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Instructional Text for Number Question/.toString(),"Should Exist":true)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Instructional Text for Date Question/.toString(),"Should Exist":true)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Instructional Text for Dropdown Question/.toString(),"Should Exist":true)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Instructional Text for Long Answer Question/.toString(),"Should Exist":true)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Instructional Text for Short Answer Question/.toString(),"Should Exist":true)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Instructional Text for Checkbox Question/.toString(),"Should Exist":true)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Instructional Text for Multiple Choice Question/.toString(),"Should Exist":true)
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