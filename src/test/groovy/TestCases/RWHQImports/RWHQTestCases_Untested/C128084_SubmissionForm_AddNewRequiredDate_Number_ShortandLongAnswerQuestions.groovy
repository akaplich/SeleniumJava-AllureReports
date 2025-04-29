import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C128084 - Submission Form - Add New Required Date, Number, Short and Long Answer Questions
class C128084_SubmissionForm_AddNewRequiredDate_Number_ShortandLongAnswerQuestions
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
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Required Test/.toString(),"Description":/desc/.toString(),"Action":/Create/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Date Required/.toString(),"Additional Question Type":/Date/.toString(),"Additional Question Required":true)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Date Not Required/.toString(),"Additional Question Type":/Date/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Number Required/.toString(),"Additional Question Type":/Number/.toString(),"Additional Question Required":true)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Number Not Required/.toString(),"Additional Question Type":/Number/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Short Answer Required/.toString(),"Additional Question Type":/Short Answer/.toString(),"Additional Question Required":true)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Short Answer Not Required/.toString(),"Additional Question Type":/Short Answer/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Long Answer Required/.toString(),"Additional Question Type":/Long Answer/.toString(),"Additional Question Required":true)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Long Answer Not Required/.toString(),"Additional Question Type":/Long Answer/.toString(),"Additional Question Required":false,"Save Form":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Required Test/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Idea Title Question - Title":/Title/.toString(),"Idea Title Question - Value":/test idea3/.toString(),"Description Question - Title":/Description/.toString(),"Description Question - Value":/description for test idea3/.toString(),"Image Question - Title":/Image/.toString(),"Image File":/Image5.jpg/.toString(),"Image Crop or Cancel":/Crop/.toString(),"Idea Attachment Question - Title":/Attachments/.toString(),"Idea Attachment Question - Value":/Sample_PPT.pptx/.toString(),"Idea Attachment Add or Remove":/Add/.toString(),"Tags Question - Title":/Tags/.toString(),"Tags Question - Value":/tag1,tag2/.toString(),"Tag Add or Remove":/Add,Add/.toString(),"Category Question - Title":/Category/.toString(),"Category Question - Value":/New Product/.toString(),"Date Question - Title":/Date Not Required/.toString(),"Date Question - Value":/01\/01\/2020/.toString(),"Number Question - Title":/Number Not Required/.toString(),"Number Question - Value":/777/.toString(),"Short Answer - Title":/Short Answer Not Required/.toString(),"Short Answer - Value":/test1/.toString(),"Long Answer - Title":/Long Answer Not Required/.toString(),"Long Answer - Value":/test2/.toString(),"Action":/Submit Idea/.toString())
        //Verify Error Field in Post Idea page
        new actions.PostIdea.VerifyErrorFieldinPostIdeapage().run("Field Name":/Date Required/.toString(),"Should Error Exist":true)
        //Verify Error Field in Post Idea page
        new actions.PostIdea.VerifyErrorFieldinPostIdeapage().run("Field Name":/Number Required/.toString(),"Should Error Exist":true)
        //Verify Error Field in Post Idea page
        new actions.PostIdea.VerifyErrorFieldinPostIdeapage().run("Field Name":/Short Answer Required/.toString(),"Should Error Exist":true)
        //Verify Error Field in Post Idea page
        new actions.PostIdea.VerifyErrorFieldinPostIdeapage().run("Field Name":/Long Answer Required/.toString(),"Should Error Exist":true)
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Date Question - Title":/Date Required/.toString(),"Date Question - Value":/01\/01\/2020/.toString(),"Action":/Submit Idea/.toString())
        //Verify Error Field in Post Idea page
        new actions.PostIdea.VerifyErrorFieldinPostIdeapage().run("Field Name":/Date Required/.toString(),"Should Error Exist":false)
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Number Question - Title":/Number Required/.toString(),"Number Question - Value":/777/.toString(),"Action":/Submit Idea/.toString())
        //Verify Error Field in Post Idea page
        new actions.PostIdea.VerifyErrorFieldinPostIdeapage().run("Field Name":/Number Required/.toString(),"Should Error Exist":false)
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Short Answer - Title":/Short Answer Required/.toString(),"Short Answer - Value":/test1/.toString(),"Action":/Submit Idea/.toString())
        //Verify Error Field in Post Idea page
        new actions.PostIdea.VerifyErrorFieldinPostIdeapage().run("Field Name":/Short Answer Required/.toString(),"Should Error Exist":false)
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Long Answer - Title":/Long Answer Required/.toString(),"Long Answer - Value":/test1/.toString(),"Action":/Submit Idea/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea3/.toString())
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