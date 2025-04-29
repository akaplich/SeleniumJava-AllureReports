import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C128075 - Submission Form - Add New Required Dropdown, Multi Choice and Checkbox Questions
class C128075_SubmissionForm_AddNewRequiredDropdown_MultiChoiceandCheckboxQuestions
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
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Checkbox Required/.toString(),"Additional Question Type":/Checkbox/.toString(),"Additional Question Required":true)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Checkbox Not Required/.toString(),"Additional Question Type":/Checkbox/.toString(),"Additional Question Required":false)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Multiple Choice Required/.toString(),"Additional Question Type":/Multiple Choice/.toString(),"Additional Question Required":true)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Multiple Choice Not Required/.toString(),"Additional Question Type":/Multiple Choice/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Dropdown Required/.toString(),"Additional Question Type":/Dropdown/.toString(),"Additional Question Required":true)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Dropdown Not Required/.toString(),"Additional Question Type":/Dropdown/.toString(),"Save Form":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Required Test/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Idea Title Question - Title":/Title/.toString(),"Idea Title Question - Value":/test idea3/.toString(),"Description Question - Title":/Description/.toString(),"Description Question - Value":/description for test idea3/.toString(),"Image Question - Title":/Image/.toString(),"Image File":/Image5.jpg/.toString(),"Image Crop or Cancel":/Crop/.toString(),"Idea Attachment Question - Title":/Attachments/.toString(),"Idea Attachment Question - Value":/Sample_PPT.pptx/.toString(),"Idea Attachment Add or Remove":/Add/.toString(),"Tags Question - Title":/Tags/.toString(),"Tags Question - Value":/tag1,tag2/.toString(),"Tag Add or Remove":/Add,Add/.toString(),"Category Question - Title":/Category/.toString(),"Category Question - Value":/New Product/.toString(),"Checkbox Question - Title":/Checkbox Not Required/.toString(),"Checkbox Question - Value":/Answer 1/.toString(),"Checkbox Check":/TRUE/.toString(),"Multiple Choice - Title":/Multiple Choice Not Required/.toString(),"Multiple Choice - Value":/Answer 2/.toString(),"Dropdown Question - Title":/Dropdown Not Required/.toString(),"Dropdown Question - Value":/Answer 3/.toString(),"Action":/Submit Idea/.toString())
        //Verify Error Field in Post Idea page
        new actions.PostIdea.VerifyErrorFieldinPostIdeapage().run("Field Name":/Checkbox Required/.toString(),"Should Error Exist":true)
        //Verify Error Field in Post Idea page
        new actions.PostIdea.VerifyErrorFieldinPostIdeapage().run("Field Name":/Multiple Choice Required/.toString(),"Should Error Exist":true)
        //Verify Error Field in Post Idea page
        new actions.PostIdea.VerifyErrorFieldinPostIdeapage().run("Field Name":/Dropdown Required/.toString(),"Should Error Exist":true)
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Checkbox Question - Title":/Checkbox Required/.toString(),"Checkbox Question - Value":/Answer 3/.toString(),"Checkbox Check":/TRUE/.toString(),"Action":/Submit Idea/.toString())
        //Verify Error Field in Post Idea page
        new actions.PostIdea.VerifyErrorFieldinPostIdeapage().run("Field Name":/Checkbox Required/.toString(),"Should Error Exist":false)
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Multiple Choice - Title":/Multiple Choice Required/.toString(),"Multiple Choice - Value":/Answer 2/.toString(),"Action":/Submit Idea/.toString())
        //Verify Error Field in Post Idea page
        new actions.PostIdea.VerifyErrorFieldinPostIdeapage().run("Field Name":/Multiple Choice Required/.toString(),"Should Error Exist":false)
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Dropdown Question - Title":/Dropdown Required/.toString(),"Dropdown Question - Value":/Answer 3/.toString(),"Action":/Submit Idea/.toString())
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