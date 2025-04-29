import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C132454 - Development - Edit Idea Attributes - Single Scale Eval, No Action Item For This Idea
class C132454_Development_EditIdeaAttributes_SingleScaleEval_NoActionItemForThisIdea
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
        //Delete this Action when View Idea 30 is Enabled
        Action6018a1600aed291c14413fd2([:])
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/test idea3/.toString(),"Image File":/Image5.jpg/.toString(),"Image Crop or Cancel":/Crop/.toString(),"Description":/test/.toString(),"Expertise":/QA/.toString(),"Expertise Add or Remove":/Add/.toString(),"Attachments File":/plaintext.txt/.toString(),"Attachment Add or Remove":/Add/.toString(),"Tag Name":/Tag1/.toString(),"Tag Add or Remove":/Add/.toString(),"Category":/New Product/.toString(),"Multiple Choice Question":/Answer 1/.toString(),"Checkbox Question Name":/Answer 1/.toString(),"Checkbox Check":/TRUE/.toString(),"Short Answer Question":/short/.toString(),"Long Answer Question":/long/.toString(),"Dropdown Question":/Answer 1/.toString(),"Date Question":/01\/01\/2020/.toString(),"Number Question":/12345/.toString(),"User Selection Question Name":/End User/.toString(),"User Selection Question Add or Remove":/Add/.toString(),"Required Short Question":/short/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Edit Step in Pipeline Steps page
        new actions.PipelineStepsView.EditStepinPipelineStepspage().run("Step to Edit":/Single Scale/.toString(),"Step Name":/SingleScaleEndUser/.toString(),"Action":/Save/.toString())
        //Configure Single Scale Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureSingleScaleStepinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/SingleScaleEndUser/.toString(),"Assignment Method":/Individual Assignment/.toString(),"Individual Assignment User":/End User 2/.toString(),"Individual Assignment User Add or Remove":/Add/.toString(),"Idea Editing":true,"Cancel Open Action Item":true,"Action":/Update/.toString())
        //Edit Step in Pipeline Steps page
        new actions.PipelineStepsView.EditStepinPipelineStepspage().run("Step to Edit":/Development/.toString(),"Step Name":/DevelopmentEvaluator/.toString(),"Tool Type":/Development/.toString(),"Action":/Save/.toString())
        //Configure Development Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureDevelopmentinNewModalinPipelineStepspage().run("Assignment Method":/Individual Assignment/.toString(),"Development Lead":/Idea Submitter/.toString(),"Development Team":/Evaluator/.toString(),"Development Team Add or Remove":/Add/.toString(),"Development Field":/Development Multiple Choice Question/.toString(),"Development Field Included or Required":/Included/.toString(),"Allow Assignees to Edit Idea Attributes":true,"Action":/Update/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea3/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/DevelopmentEvaluator/.toString(),"Action":/Change Step/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser2@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea3/.toString())
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Access Idea":/Idea Title/.toString())
        //Verify Element
        new actions.general.VerifyElement().run("ID":/*\/\/[contains(@class,'pencil')]/.toString(),"Should Element Exist":false,"Number of Matches":/0/.toString())
        try{
            //Set Cover Image in View Idea 3 page
            new actions.ViewIdea30.SetCoverImageinViewIdea3page().run([:])
        }
       catch(all){}catch(Error err){}
        try{
            //Set Change Background or Other Modal Tab
            new actions.WebstormHomepage.SetChangeBackgroundmodal().run("Tab":/Generate Image/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Set Generate AI Image
            new actions.WebstormHomepage.SetGenerateAIImage().run("Text to Search":/toddler brain development/.toString(),"Action to Generate Images":/Click on Generate button/.toString(),"AI Image Number to Click":/1/.toString(),"Action":/Add Image/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Set Linked Ideas on VI3
            new actions.ViewIdea30.SetLinkedIdeasVI3().run("Idea Title":/test idea1/.toString(),"Link or Unlink":/Link/.toString(),"Action":/Submit/.toString())
        }
       catch(all){}catch(Error err){}
        //Set Action Menu in View Idea 3.0 Page
        new actions.ViewIdea30.SetCopyLinkOnViewIdea30Page().run("Menu Option Name":/Copy Link/.toString(),"Should the option be displayed":true,"Click the Option":true)
        //Set Action Menu in View Idea 3.0 Page
        new actions.ViewIdea30.SetCopyLinkOnViewIdea30Page().run("Menu Option Name":/Hide/.toString(),"Should the option be displayed":false)
        try{
            //Set Attachment in View Idea 3 page
            new actions.ViewIdea30.SetAttachmentinViewIdea3page().run("Load From":/Link/.toString(),"Attachment File":/ava.png/.toString(),"Attachment Add or Remove":/Add/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Set View Idea 3 Dropdown Text Field
            new actions.ViewIdea3Fields.SetViewIdea3DropdownTextField().run("Column":/Left/.toString(),"Field Name":/Dropdown Question/.toString(),"Field Value":/Answer 2/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Verify Element
            new actions.general.VerifyElement().run("ID":/\/\/*[contains(@class,'f-tab-business_impact')]/.toString(),"Should Element Exist":false,"Number of Matches":/0/.toString())
        }
       catch(all){}catch(Error err){}
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
    //Delete this Action when View Idea 30 is Enabled
    public static def Action6018a1600aed291c14413fd2(def params){
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Ideas tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforIdeastab().run("View Idea 3.0":true,"Business impact tab":true)

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