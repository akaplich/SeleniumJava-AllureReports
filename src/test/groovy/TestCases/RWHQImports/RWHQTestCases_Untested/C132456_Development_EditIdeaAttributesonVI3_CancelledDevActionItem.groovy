import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132456 - Development - Edit Idea Attributes on VI3 - Cancelled Dev Action Item
class C132456_Development_EditIdeaAttributesonVI3_CancelledDevActionItem
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Unlimited Brightidea Administrator License Type":/1/.toString(),"Unlimited Idea Box Manager License Type":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Apply Filter on Apps Pillar 2.0
        new actions.AppsPillar.ApplyFilterAppsPillar20().run("Filter Option":/Programs/.toString())
        //Return Todays or Other Date in the Requested Format
        variables."today" = new actions.Utils.ReturnTodaysDateintheRequestedFormat().run("Format":/MM\/dd\/yyyy/.toString())
        //Return Current Time
        variables."now" = new actions.Utils.ReturnCurrentTime().run("Format":/h:mm a/.toString())
        //Add Subtract From Date
        variables."end" = new actions.Utils.AddSubstractFromDate().run("Date":/today/.toString(),"Add or Subtract":/Add/.toString(),"Number":/1/.toString(),"Units":/Years/.toString())
        //Create Pipeline with Scheduler V3
        new actions.WebstormCreation.CreatePipelineWithSchedulerV3().run("App Name (optional)":/Hackathon/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Title":/Hack/.toString(),"Description":/Hack Event description/.toString(),"Action on Topic Page":/Continue/.toString(),"Action on Design Page":/Continue/.toString(),"Action on Participants Page":/Continue/.toString(),"Phase 1 Title":/Plan & Setup/.toString(),"Phase 1 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 2 Title":/Incubate/.toString(),"Phase 2 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 3 Title":/Build\/Hack/.toString(),"Phase 3 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 4 Title":/Presentation & Judging/.toString(),"Phase 4 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 5 Title":/Recognize/.toString(),"Phase 5 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 6 Title":/Close Out & Review /.toString(),"Phase 6 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Action on Site Schedule Page":/Create/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Development Short Answer Question/.toString(),"Additional Question Type":/Short Answer/.toString(),"Development Field":true,"Save Form":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Hack App Post Idea
        new actions.PostIdea.SetHackAppPostIdea().run("Title":/test idea3/.toString(),"Image File":/Image5.jpg/.toString(),"Image Crop or Cancel":/Crop/.toString(),"Submitter":/Yourself/.toString(),"Description":/Idea Description/.toString(),"Expertise":/Expertise1/.toString(),"Expertise Add or Remove":/Add/.toString(),"Attachments File":/SampleDoc.docx/.toString(),"Attachment Add or Remove":/Add/.toString(),"Tag Name":/testtag1/.toString(),"Tags Add or Remove":/Add/.toString(),"What problem are you addressing with your project?":/this is for testing purpose/.toString(),"Please describe the technologies being used in your project.":/this is for testing purpose2/.toString(),"Action":/Submit Idea/.toString(),"Category":/Theme 1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Edit Step in Pipeline Steps page
        new actions.PipelineStepsView.EditStepinPipelineStepspage().run("Step to Edit":/Hack on Projects/.toString(),"Step Name":/Hack on Projects/.toString(),"Tool Type":/Development/.toString(),"Action":/Save/.toString())
        //Configure Development Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureDevelopmentinNewModalinPipelineStepspage().run("Assignment Method":/Individual Assignment/.toString(),"Development Lead":/Idea Submitter/.toString(),"Development Team":/Evaluator/.toString(),"Development Team Add or Remove":/Add/.toString(),"Development Field":/Development Short Answer Question/.toString(),"Development Field Included or Required":/Included/.toString(),"Allow Assignees to Edit Idea Attributes":true,"Action":/Activate/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea3/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Hack on Projects/.toString(),"Action":/Change Step/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Action Items Manager/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Open Tab Value":/2/.toString(),"Title":/test idea3/.toString(),"Assignee":/Evaluator/.toString(),"Number of Matches":/1/.toString())
        //Set Actions Dropdown in the Action Items Manager
        new actions.ActionItemsManager.SetActionsDropdownintheActionItemsManager().run("Select Ideas":/test idea3/.toString(),"Assignee":/Evaluator/.toString(),"Check":/TRUE/.toString(),"Action":/Cancel/.toString(),"Sub Action":/Cancel Action Item/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea3/.toString())
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Access Idea":/Idea Title/.toString())
        try{
            //Set View Idea 3 Description Tab Text Field
            new actions.ViewIdea3Fields.SetViewIdea3DescriptionTabTextField().run("Field Name":/Title/.toString(),"Field Value":/updated title/.toString(),"Action":/Save/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Set View Idea 3 Description Tab Text Field
            new actions.ViewIdea3Fields.SetViewIdea3DescriptionTabTextField().run("Field Name":/Description/.toString(),"Field Value":/updated description/.toString(),"Action":/Save/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Set Tags in View Idea 3.0 Page
            new actions.ViewIdea30.SetTagsinViewIdea30Page().run("Tag Name":/testtag1/.toString(),"Add or Remove":/Remove/.toString())
        }
       catch(all){}catch(Error err){}
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
            new actions.ViewIdea3Fields.SetViewIdea3DropdownTextField().run("Column":/Left/.toString(),"Field Name":/What problem are you addressing with your project?/.toString(),"Field Value":/answered by eval/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Set View Idea 3 Dropdown Text Field
            new actions.ViewIdea3Fields.SetViewIdea3DropdownTextField().run("Column":/Right/.toString(),"Field Name":/Category/.toString(),"Field Value":/Theme 2/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Set View Idea 3 Dropdown Text Field
            new actions.ViewIdea3Fields.SetViewIdea3DropdownTextField().run("Column":/Right/.toString(),"Field Name":/Status/.toString(),"Field Value":/Under Review/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Verify Element
            new actions.general.VerifyElement().run("ID":/\/\/*[contains(@class,'f-tab-business_impact')]/.toString(),"Should Element Exist":false,"Number of Matches":/0/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Verify Element
            new actions.general.VerifyElement().run("ID":/\/\/*[contains(@class,'f-tab-questions')]/.toString(),"Should Element Exist":false,"Number of Matches":/0/.toString())
        }
       catch(all){}catch(Error err){}
        //Set Tab in View Idea 3
        new actions.ViewIdea30.SetTabinViewIdea3().run("Tab":/Development/.toString())
        try{
            //Set View Idea 3 Description Tab Text Field
            new actions.ViewIdea3Fields.SetViewIdea3DescriptionTabTextField().run("Field Name":/Development Short Answer Question/.toString(),"Field Value":/should not edit/.toString(),"Action":/Save/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Set Submitter or Owner in View Idea 3 Using Dropdown
            new actions.ViewIdea30.SetSubmitterinViewIdea3UsingDropdown().run("Field":/Submitter/.toString(),"Search User Text":/Evaluator/.toString(),"User":/Evaluator/.toString())
        }
       catch(all){}catch(Error err){}
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board 20 page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage().run("Idea Name":/test idea3/.toString())
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Access Idea":/Idea Title/.toString())
        //Verify Idea on View Idea 30
        new actions.ViewIdea30.VerifyIdeaonViewIdea3().run("Template":/Medium Header/.toString(),"View As":/Admin/.toString(),"Idea Name":/test idea3/.toString(),"Description":/Idea Description/.toString(),"Category":/Theme 1/.toString(),"Status":/Submitted/.toString(),"Submitter Name":/System Admin/.toString(),"Tag":/testtag1/.toString(),"Tag Should Exist":/TRUE/.toString())
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