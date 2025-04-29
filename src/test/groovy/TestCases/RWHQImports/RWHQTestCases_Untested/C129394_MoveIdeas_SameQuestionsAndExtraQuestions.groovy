import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C129394 - Move Ideas - Same Questions & Extra Questions
class C129394_MoveIdeas_SameQuestionsAndExtraQuestions
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
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Pipeline A/.toString(),"Description":/desc/.toString(),"Action":/Create/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Pipeline B/.toString(),"Description":/desc/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pipeline A/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Same Checkbox Question/.toString(),"Additional Question Type":/Checkbox/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Same Short Question/.toString(),"Additional Question Type":/Short Answer/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Same Multi Question/.toString(),"Additional Question Type":/Multiple Choice/.toString(),"Save Form":true)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Same Dd Question/.toString(),"Additional Question Type":/Dropdown/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Date Question A/.toString(),"Additional Question Type":/Date/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Checkbox Question A/.toString(),"Additional Question Type":/Checkbox/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Long Question A/.toString(),"Additional Question Type":/Long Answer/.toString(),"Save Form":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pipeline B/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Same Checkbox Question/.toString(),"Additional Question Type":/Checkbox/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Same Short Question/.toString(),"Additional Question Type":/Short Answer/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Same Dd Question/.toString(),"Additional Question Type":/Dropdown/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Same Multi Question/.toString(),"Additional Question Type":/Multiple Choice/.toString(),"Save Form":true)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Date Question B/.toString(),"Additional Question Type":/Date/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Long Question B/.toString(),"Additional Question Type":/Long Answer/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Checkbox Question B/.toString(),"Additional Question Type":/Checkbox/.toString(),"Save Form":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pipeline A/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Wait for Page to Load":true,"Idea Title Question - Title":/Title/.toString(),"Idea Title Question - Value":/idea A1/.toString(),"Description Question - Title":/Description/.toString(),"Description Question - Value":/descA1/.toString(),"Category Question - Title":/Category/.toString(),"Category Question - Value":/Operations/.toString(),"Checkbox Question - Title":/Same Checkbox Question/.toString(),"Checkbox Question - Value":/Answer 1/.toString(),"Checkbox Check":/TRUE/.toString(),"Multiple Choice - Title":/Same Multi Question/.toString(),"Multiple Choice - Value":/Answer 3/.toString(),"Dropdown Question - Title":/Same Dd Question/.toString(),"Dropdown Question - Value":/Answer 2/.toString(),"Short Answer - Title":/Same Short Question/.toString(),"Short Answer - Value":/ShortA1/.toString())
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Checkbox Question - Title":/Checkbox Question A/.toString(),"Checkbox Question - Value":/Answer 3/.toString(),"Checkbox Check":/TRUE/.toString(),"Date Question - Title":/Date Question A/.toString(),"Date Question - Value":/01\/01\/2022/.toString(),"Long Answer - Title":/Long Question A/.toString(),"Long Answer - Value":/LongA1/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pipeline A/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Wait for Page to Load":true,"Idea Title Question - Title":/Title/.toString(),"Idea Title Question - Value":/idea A2/.toString(),"Description Question - Title":/Description/.toString(),"Description Question - Value":/descA2/.toString(),"Category Question - Title":/Category/.toString(),"Category Question - Value":/Operations/.toString(),"Checkbox Question - Title":/Checkbox Question A/.toString(),"Checkbox Question - Value":/Answer 2/.toString(),"Checkbox Check":/TRUE/.toString(),"Date Question - Title":/Date Question A/.toString(),"Date Question - Value":/02\/02\/2022/.toString(),"Long Answer - Title":/Long Question A/.toString(),"Long Answer - Value":/LongA2/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pipeline A/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Wait for Page to Load":true,"Idea Title Question - Title":/Title/.toString(),"Idea Title Question - Value":/idea A3/.toString(),"Description Question - Title":/Description/.toString(),"Description Question - Value":/descA3/.toString(),"Category Question - Title":/Category/.toString(),"Category Question - Value":/Operations/.toString(),"Checkbox Question - Title":/Same Checkbox Question/.toString(),"Checkbox Question - Value":/Answer 3/.toString(),"Checkbox Check":/TRUE/.toString(),"Multiple Choice - Title":/Same Multi Question/.toString(),"Multiple Choice - Value":/Answer 1/.toString(),"Dropdown Question - Title":/Same Dd Question/.toString(),"Dropdown Question - Value":/Answer 3/.toString(),"Short Answer - Title":/Same Short Question/.toString(),"Short Answer - Value":/ShortA3/.toString())
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Checkbox Question - Title":/Checkbox Question A/.toString(),"Checkbox Question - Value":/Answer 3/.toString(),"Checkbox Check":/TRUE/.toString(),"Date Question - Title":/Date Question A/.toString(),"Date Question - Value":/03\/03\/2022/.toString(),"Long Answer - Title":/Long Question A/.toString(),"Long Answer - Value":/LongA3/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pipeline A/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Wait for Page to Load":true,"Idea Title Question - Title":/Title/.toString(),"Idea Title Question - Value":/idea A4/.toString(),"Description Question - Title":/Description/.toString(),"Description Question - Value":/descA4/.toString(),"Category Question - Title":/Category/.toString(),"Category Question - Value":/Operations/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pipeline A/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Select Multiple Ideas in Pipeline Steps
        new actions.PipelineStepsView.SelectMultipleIdeasinPipelineSteps().run("Idea Names":["idea A1","idea A2","idea A3","idea A4"])
        //Set New Move Ideas in Pipeline Steps page
        new actions.PipelineStepsView.NewMoveIdeasinPipelineStepspage().run("Move To Pipeline":/Pipeline B/.toString(),"Category":/Marketing & Branding/.toString(),"Status":/Submitted/.toString(),"Action":/Move Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pipeline B/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/idea A1/.toString())
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Access Idea":/Idea Title/.toString())
        //Verify Idea on View Idea 30
        new actions.ViewIdea30.VerifyIdeaonViewIdea3().run("View As":/Admin/.toString(),"Idea Name":/idea A1/.toString(),"Description":/descA1 Extra Questions Date Question A 01\/01\/2022 Checkbox Question A Answer 3 Long Question A LongA1/.toString(),"Category":/Marketing & Branding/.toString(),"Status":/Submitted/.toString(),"Submitter Name":/System Admin/.toString())
        //Verify Description Tab Text Field on View Idea 30
        new actions.ViewIdea3Fields.VerifyViewIdea3DescriptionTabFieldValue().run("Field Name":/Same Short Question/.toString(),"Field Value":/ShortA1/.toString(),"Should Exist":/TRUE/.toString())
        //Verify View Idea3 Description Tab Field Value
        new actions.ViewIdea3Fields.VerifyViewIdea3DescriptionTabFieldValue().run("Field Name":/Same Checkbox Question/.toString(),"Field Value":/Answer 1/.toString(),"Should Exist":true)
        //Verify View Idea3 Description Tab Field Value
        new actions.ViewIdea3Fields.VerifyViewIdea3DescriptionTabFieldValue().run("Field Name":/Same Dd Question/.toString(),"Field Value":/Answer 2/.toString(),"Should Exist":true)
        //Verify View Idea3 Description Tab Field Value
        new actions.ViewIdea3Fields.VerifyViewIdea3DescriptionTabFieldValue().run("Field Name":/Same Multi Question/.toString(),"Field Value":/Answer 3/.toString(),"Should Exist":true)
        //Verify View Idea3 Description Tab Field Value
        new actions.ViewIdea3Fields.VerifyViewIdea3DescriptionTabFieldValue().run("Field Name":/Checkbox Question B/.toString(),"Field Value":/No answer/.toString(),"Should Exist":true)
        //Verify View Idea3 Description Tab Field Value
        new actions.ViewIdea3Fields.VerifyViewIdea3DescriptionTabFieldValue().run("Field Name":/Long Question B/.toString(),"Field Value":/No answer/.toString(),"Should Exist":true)
        //Verify View Idea3 Description Tab Field Value
        new actions.ViewIdea3Fields.VerifyViewIdea3DescriptionTabFieldValue().run("Field Name":/Date Question B/.toString(),"Field Value":/No date/.toString(),"Should Exist":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pipeline B/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/idea A2/.toString())
        //Verify Idea on View Idea 30
        new actions.ViewIdea30.VerifyIdeaonViewIdea3().run("View As":/Admin/.toString(),"Idea Name":/idea A2/.toString(),"Description":/descA2 Extra Questions Date Question A 02\/02\/2022 Checkbox Question A Answer 2 Long Question A LongA2/.toString(),"Category":/Marketing & Branding/.toString(),"Status":/Submitted/.toString(),"Submitter Name":/System Admin/.toString())
        //Verify View Idea3 Description Tab Field Value
        new actions.ViewIdea3Fields.VerifyViewIdea3DescriptionTabFieldValue().run("Field Name":/Same Short Question/.toString(),"Field Value":/No answer/.toString(),"Should Exist":true)
        //Verify View Idea3 Description Tab Field Value
        new actions.ViewIdea3Fields.VerifyViewIdea3DescriptionTabFieldValue().run("Field Name":/Same Checkbox Question/.toString(),"Field Value":/No answer/.toString(),"Should Exist":true)
        //Verify View Idea3 Description Tab Field Value
        new actions.ViewIdea3Fields.VerifyViewIdea3DescriptionTabFieldValue().run("Field Name":/Same Dd Question/.toString(),"Field Value":/No answer/.toString(),"Should Exist":true)
        //Verify View Idea3 Description Tab Field Value
        new actions.ViewIdea3Fields.VerifyViewIdea3DescriptionTabFieldValue().run("Field Name":/Same Multi Question/.toString(),"Field Value":/No answer/.toString(),"Should Exist":true)
        //Verify View Idea3 Description Tab Field Value
        new actions.ViewIdea3Fields.VerifyViewIdea3DescriptionTabFieldValue().run("Field Name":/Checkbox Question B/.toString(),"Field Value":/No answer/.toString(),"Should Exist":true)
        //Verify View Idea3 Description Tab Field Value
        new actions.ViewIdea3Fields.VerifyViewIdea3DescriptionTabFieldValue().run("Field Name":/Long Question B/.toString(),"Field Value":/No answer/.toString(),"Should Exist":true)
        //Verify View Idea3 Description Tab Field Value
        new actions.ViewIdea3Fields.VerifyViewIdea3DescriptionTabFieldValue().run("Field Name":/Date Question B/.toString(),"Field Value":/No date/.toString(),"Should Exist":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pipeline B/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/idea A3/.toString())
        //Verify Idea on View Idea 30
        new actions.ViewIdea30.VerifyIdeaonViewIdea3().run("View As":/Admin/.toString(),"Idea Name":/idea A3/.toString(),"Description":/descA3 Extra Questions Date Question A 03\/03\/2022 Checkbox Question A Answer 3 Long Question A LongA3/.toString(),"Category":/Marketing & Branding/.toString(),"Status":/Submitted/.toString(),"Submitter Name":/System Admin/.toString())
        //Verify View Idea3 Description Tab Field Value
        new actions.ViewIdea3Fields.VerifyViewIdea3DescriptionTabFieldValue().run("Field Name":/Same Short Question/.toString(),"Field Value":/ShortA3/.toString(),"Should Exist":true)
        //Verify View Idea3 Description Tab Field Value
        new actions.ViewIdea3Fields.VerifyViewIdea3DescriptionTabFieldValue().run("Field Name":/Same Checkbox Question/.toString(),"Field Value":/Answer 3/.toString(),"Should Exist":true)
        //Verify View Idea3 Description Tab Field Value
        new actions.ViewIdea3Fields.VerifyViewIdea3DescriptionTabFieldValue().run("Field Name":/Same Dd Question/.toString(),"Field Value":/Answer 3/.toString(),"Should Exist":true)
        //Verify View Idea3 Description Tab Field Value
        new actions.ViewIdea3Fields.VerifyViewIdea3DescriptionTabFieldValue().run("Field Name":/Same Multi Question/.toString(),"Field Value":/Answer 1/.toString(),"Should Exist":true)
        //Verify View Idea3 Description Tab Field Value
        new actions.ViewIdea3Fields.VerifyViewIdea3DescriptionTabFieldValue().run("Field Name":/Checkbox Question B/.toString(),"Field Value":/No answer/.toString(),"Should Exist":true)
        //Verify View Idea3 Description Tab Field Value
        new actions.ViewIdea3Fields.VerifyViewIdea3DescriptionTabFieldValue().run("Field Name":/Long Question B/.toString(),"Field Value":/No answer/.toString(),"Should Exist":true)
        //Verify View Idea3 Description Tab Field Value
        new actions.ViewIdea3Fields.VerifyViewIdea3DescriptionTabFieldValue().run("Field Name":/Date Question B/.toString(),"Field Value":/No date/.toString(),"Should Exist":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pipeline B/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/idea A4/.toString())
        //Verify Idea on View Idea 30
        new actions.ViewIdea30.VerifyIdeaonViewIdea3().run("View As":/Admin/.toString(),"Idea Name":/idea A4/.toString(),"Description":/descA4/.toString(),"Category":/Marketing & Branding/.toString(),"Status":/Submitted/.toString(),"Submitter Name":/System Admin/.toString())
        //Verify View Idea3 Description Tab Field Value
        new actions.ViewIdea3Fields.VerifyViewIdea3DescriptionTabFieldValue().run("Field Name":/Same Short Question/.toString(),"Field Value":/No answer/.toString(),"Should Exist":true)
        //Verify View Idea3 Description Tab Field Value
        new actions.ViewIdea3Fields.VerifyViewIdea3DescriptionTabFieldValue().run("Field Name":/Same Checkbox Question/.toString(),"Field Value":/No answer/.toString(),"Should Exist":true)
        //Verify View Idea3 Description Tab Field Value
        new actions.ViewIdea3Fields.VerifyViewIdea3DescriptionTabFieldValue().run("Field Name":/Same Dd Question/.toString(),"Field Value":/No answer/.toString(),"Should Exist":true)
        //Verify View Idea3 Description Tab Field Value
        new actions.ViewIdea3Fields.VerifyViewIdea3DescriptionTabFieldValue().run("Field Name":/Same Multi Question/.toString(),"Field Value":/No answer/.toString(),"Should Exist":true)
        //Verify View Idea3 Description Tab Field Value
        new actions.ViewIdea3Fields.VerifyViewIdea3DescriptionTabFieldValue().run("Field Name":/Checkbox Question B/.toString(),"Field Value":/No answer/.toString(),"Should Exist":true)
        //Verify View Idea3 Description Tab Field Value
        new actions.ViewIdea3Fields.VerifyViewIdea3DescriptionTabFieldValue().run("Field Name":/Long Question B/.toString(),"Field Value":/No answer/.toString(),"Should Exist":true)
        //Verify View Idea3 Description Tab Field Value
        new actions.ViewIdea3Fields.VerifyViewIdea3DescriptionTabFieldValue().run("Field Name":/Date Question B/.toString(),"Field Value":/No date/.toString(),"Should Exist":true)
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