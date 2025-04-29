package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C129439 - Move Ideas - Required Fields
class C129439_MoveIdeas_RequiredFields
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
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Pipeline B/.toString(),"Description":/desc/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pipeline B/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Same Required Short/.toString(),"Additional Question Type":/Short Answer/.toString(),"Additional Question Required":true)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/PL B Required Multi/.toString(),"Additional Question Type":/Multiple Choice/.toString(),"Additional Question Required":true,"Save Form":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Pipeline A/.toString(),"Description":/desc/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pipeline A/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Same Required Short/.toString(),"Additional Question Type":/Short Answer/.toString(),"Additional Question Required":true)
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/PL A Required Multi/.toString(),"Additional Question Type":/Multiple Choice/.toString(),"Additional Question Required":true,"Save Form":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pipeline A/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Idea Title Question - Title":/Title/.toString(),"Idea Title Question - Value":/idea1/.toString(),"Description Question - Title":/Description/.toString(),"Description Question - Value":/desc/.toString(),"Category Question - Title":/Category/.toString(),"Category Question - Value":/New Product/.toString(),"Multiple Choice - Title":/PL A Required Multi/.toString(),"Multiple Choice - Value":/Answer 1/.toString(),"Short Answer - Title":/Same Required Short/.toString(),"Short Answer - Value":/short test/.toString(),"Action":/Submit Idea/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Steps/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/idea1/.toString())
        //Set New Move Ideas in Pipeline Steps page
        new actions.PipelineStepsView.NewMoveIdeasinPipelineStepspage().run("Move To Pipeline":/Pipeline B/.toString(),"Category":/New Product/.toString(),"Status":/Submitted/.toString(),"Action":/Move Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Pipeline B/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/idea1/.toString())
        //Verify Idea on View Idea 30
        new actions.ViewIdea30.VerifyIdeaonViewIdea3().run("Description":/desc Extra Questions PL A Required Multi Answer 1/.toString())
        //Verify Description Tab Text Field on View Idea 30
        new actions.ViewIdea3Fields.VerifyViewIdea3DescriptionTabFieldValue().run("Field Name":/Same Required Short/.toString(),"Field Value":/short test/.toString(),"Should Exist":/TRUE/.toString())
        //Verify Description Tab Text Field on View Idea 30
        new actions.ViewIdea3Fields.VerifyViewIdea3DescriptionTabFieldValue().run("Field Name":/Same Required Short/.toString(),"Field Value":/short test/.toString(),"Should Exist":/TRUE/.toString())
        //Set View Idea 3 Description Tab Text Field
        new actions.ViewIdea3Fields.SetViewIdea3DescriptionTabTextField().run("Field Name":/Same Required Short/.toString(),"Field Value":/<EMPTY>/.toString(),"Action":/Save/.toString())
        //Verify Error Field On View Idea 3
        new actions.ViewIdea30.VerifyVideaIdea3ErrorField().run("Field Name":/Same Required Short/.toString(),"Should Error Exist":true)
        //Verify Description Tab Text Field on View Idea 30
        new actions.ViewIdea3Fields.VerifyViewIdea3DescriptionTabFieldValue().run("Field Name":/PL B Required Multi/.toString(),"Field Value":/No answer/.toString(),"Should Exist":/TRUE/.toString())
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