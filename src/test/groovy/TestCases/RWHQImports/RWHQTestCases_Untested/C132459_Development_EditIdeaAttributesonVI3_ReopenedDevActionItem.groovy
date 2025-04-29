import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132459 - Development - Edit Idea Attributes on VI3 - Reopened Dev Action Item
class C132459_Development_EditIdeaAttributesonVI3_ReopenedDevActionItem
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
        new actions.PostIdea.SetHackAppPostIdea().run("Title":/test idea2/.toString(),"Image File":/ava.png/.toString(),"Submitter":/Yourself/.toString(),"Description":/Idea Description/.toString(),"Expertise":/expertise1/.toString(),"Expertise Add or Remove":/Add/.toString(),"Tags Add or Remove":"","What problem are you addressing with your project?":/this is for testing purpose/.toString(),"Please describe the technologies being used in your project.":/this is for testing purpose2/.toString(),"Action":/Submit Idea/.toString(),"Category":/Theme 1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Hack App Post Idea
        new actions.PostIdea.SetHackAppPostIdea().run("Title":/test idea3/.toString(),"Image File":/ava.png/.toString(),"Submitter":/Yourself/.toString(),"Description":/Idea Description/.toString(),"Tag Name":/testtag1/.toString(),"Tags Add or Remove":/Add/.toString(),"What problem are you addressing with your project?":/this is for testing purpose/.toString(),"Please describe the technologies being used in your project.":/this is for testing purpose2/.toString(),"Action":/Submit Idea/.toString(),"Category":/Theme 1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Edit Step in Pipeline Steps page
        new actions.PipelineStepsView.EditStepinPipelineStepspage().run("Step to Edit":/Hack on Projects/.toString(),"Tool Type":/Development/.toString())
        //Configure Development Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureDevelopmentinNewModalinPipelineStepspage().run("Assignment Method":/Individual Assignment/.toString(),"Development Lead":/Idea Submitter/.toString(),"Development Team":/Evaluator/.toString(),"Development Team Add or Remove":/Add/.toString(),"Development Field":/Development Short Answer Question/.toString(),"Development Field Included or Required":/Included/.toString(),"Allow Assignees to Edit Idea Attributes":true,"Allow action item assignees to view Private Comments":false,"Action":/Activate/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea3/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Hack on Projects/.toString(),"Action":/Change Step/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/test idea3/.toString())
        //Set Development for Idea in Action Items page
        new actions.ActionItems.SetDevelopmentforIdeainActionItemspage().run("Development Short Answer Question":/short answer for development/.toString(),"Development Child Checkbox Question":[],"Action":/Save/.toString(),"Action on Mark Development Form Done":/Mark Done/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/test idea3/.toString())
        //Set Development for Idea in Action Items page
        new actions.ActionItems.SetDevelopmentforIdeainActionItemspage().run("Development Child Checkbox Question":[],"Action":/Mark Complete/.toString(),"Action on Mark Development Form Complete":/Mark Complete/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Action Items Manager/.toString())
        //Verify Completed table for Action Items page
        new actions.ActionItems.VerifyCompletedtableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Completed Tab Value":/2/.toString(),"Title":/test idea3/.toString(),"Assignee":/Evaluator/.toString(),"Row number":/2/.toString(),"Number of Matches":/1/.toString())
        //Set Actions Dropdown in the Action Items Manager
        new actions.ActionItemsManager.SetActionsDropdownintheActionItemsManager().run("Select Ideas":/test idea3/.toString(),"Assignee":/Evaluator/.toString(),"Check":/TRUE/.toString(),"Action":/Reopen/.toString(),"Sub Action":/Reopen Action Item/.toString())
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
        //Set Tags in View Idea 3.0 Page
        new actions.ViewIdea30.SetTagsinViewIdea30Page().run("Set Tab":/Tags/.toString(),"Tag Name":/testtag1/.toString(),"Add or Remove":/Remove/.toString())
        //Set Action Menu in View Idea 3.0 Page
        new actions.ViewIdea30.SetCopyLinkOnViewIdea30Page().run("Menu Option Name":/Copy Link/.toString(),"Should the option be displayed":true,"Click the Option":true)
        //Set View Idea 3 Description Tab Text Field
        new actions.ViewIdea3Fields.SetViewIdea3DescriptionTabTextField().run("Field Name":/Description/.toString(),"Field Value":/description edited/.toString(),"Action":/Save/.toString())
        //Set Cover Image in View Idea 3 page
        new actions.ViewIdea30.SetCoverImageinViewIdea3page().run([:])
        //Set Change Background or Other Modal Tab
        new actions.WebstormHomepage.SetChangeBackgroundmodal().run("Tab":/Search Photos/.toString())
        //Set Preset or Unsplash Background Image in the Header
        new actions.WebstormHomepage.SetPresetBackgroundImageintheHeader().run("Unsplash Image Text":/development/.toString(),"Unpslash Image Number":/1/.toString(),"Action":/Add Image/.toString())
        //Set View Idea 3 Dropdown Text Field
        new actions.ViewIdea3Fields.SetViewIdea3DropdownTextField().run("Column":/Right/.toString(),"Field Name":/Category/.toString(),"Field Value":/Theme 2/.toString())
        //Set View Idea 3 Dropdown Text Field
        new actions.ViewIdea3Fields.SetViewIdea3DropdownTextField().run("Column":/Right/.toString(),"Field Name":/Status/.toString(),"Field Value":/Under Review/.toString())
        //Set View Idea 3 Description Tab Text Field
        new actions.ViewIdea3Fields.SetViewIdea3DescriptionTabTextField().run("Field Name":/Title/.toString(),"Field Value":/development action item/.toString(),"Action":/Save/.toString())
        //Set Linked Ideas on VI3
        new actions.ViewIdea30.SetLinkedIdeasVI3().run("Idea Title":/test idea2/.toString(),"Link or Unlink":/Link/.toString(),"Action":/Submit/.toString())
        //Set Submitter in View Idea 3 Using Submitter Modal
        new actions.ViewIdea30.SetSubmitterinViewIdea3().run("User":/Evaluator/.toString(),"User Name on the List":/Evaluator/.toString(),"Add or Remove or Set Owner":/Add/.toString(),"Action":/Update/.toString())
        //Set Attachment in View Idea 3 page
        new actions.ViewIdea30.SetAttachmentinViewIdea3page().run("Load From":/Link/.toString(),"Attachment File":/ava.png/.toString(),"Attachment Add or Remove":/Add/.toString())
        //Set View Idea 3 Description Tab Text Field
        new actions.ViewIdea3Fields.SetViewIdea3DescriptionTabTextField().run("Field Name":/What problem are you addressing with your project?/.toString(),"Field Value":/edit by evaluator/.toString(),"Action":/Save/.toString())
        //Set Tab in View Idea 3
        new actions.ViewIdea30.SetTabinViewIdea3().run("Tab":/Business Impact/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Add or Update":/Add/.toString(),"Access Business Impact From":/View Idea 3/.toString())
        //Set Date Version and Notes for Financial Summary in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetDateandNotesforFinancialSummaryinBusinessImpacttab().run("Date":/05\/09\/2018/.toString())
        //Set Benefits in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetBenefitsinBusinessImpacttab().run("Add or Edit Benefits":/Add,Add/.toString(),"Year":/2018,2019/.toString(),"Current Year":/2018/.toString(),"Benefit Type":/Revenue,Revenue/.toString(),"Projected Benefit":/5000,15000/.toString(),"Actual Benefit":/4000,14000/.toString(),"Row Number of the Benefit":/1,1/.toString())
        //Set Costs in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetCostsinBusinessImpacttab().run("Add or Edit Costs":/Add,Add/.toString(),"Year":/2018,2019/.toString(),"Current Year":/2018/.toString(),"Cost Title":/Current Assets,Current Assets/.toString(),"Projected Cost":/300,23890/.toString(),"Actual Cost":/10000,789/.toString(),"Row Number":/1,1/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Action":/Save Version/.toString())
        //Set Tab in View Idea 3
        new actions.ViewIdea30.SetTabinViewIdea3().run("Tab":/Development/.toString())
        //Set View Idea 3 Description Tab Text Field
        new actions.ViewIdea3Fields.SetViewIdea3DescriptionTabTextField().run("Field Name":/Development Short Answer Question/.toString(),"Field Value":/edit dev answer/.toString(),"Action":/Save/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board 20 page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage().run("Idea Name":/development action item/.toString())
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Access Idea":/Idea Title/.toString())
        //Verify Idea on View Idea 30
        new actions.ViewIdea30.VerifyIdeaonViewIdea3().run("Template":/Medium Header/.toString(),"View As":/Admin/.toString(),"Idea Name":/development action item/.toString(),"Description":/description edited/.toString(),"Category":/Theme 2/.toString(),"Status":/Under Review/.toString(),"Submitter Name":/Team - System Admin/.toString(),"Tag":/testtag1/.toString(),"Tag Should Exist":/FALSE/.toString())
        //Verify Description Tab Text Field on View Idea 30
        new actions.ViewIdea3Fields.VerifyViewIdea3DescriptionTabFieldValue().run("Field Name":/What problem are you addressing with your project?/.toString(),"Field Value":/edit by evaluator/.toString(),"Should Exist":/TRUE/.toString())
        //Set Tab in View Idea 3
        new actions.ViewIdea30.SetTabinViewIdea3().run("Tab":/Business Impact/.toString())
        //Verify Projected and Actual Costs in Business Impact tab for View Idea page
        new actions.ViewIdea.BusinessImpact.VerifyProjectedandActualCostsinBusinessImpacttabforViewIdeapage().run("Year":/2018;2019/.toString(),"Current Year":/2018/.toString(),"Costs Title":/Current Assets;Current Assets/.toString(),"Row Number":/1;1/.toString(),"Projected Cost":/300;23,890;6,300;14,000/.toString(),"Actual Cost":/10,000;789;1,000;7,800/.toString())
        //Verify Projected and Actual Benefits in Business Impact tab for View Idea page
        new actions.ViewIdea.BusinessImpact.VerifyProjectedandActualBenefitsinBusinessImpacttabforViewIdeapage().run("Year":/2018;2019/.toString(),"Current Year":/2018/.toString(),"Benefit Type":/Revenue;Revenue;Revenue;Revenue/.toString(),"Row Number of the Benefit":/1;1/.toString(),"Projected Benefit":/5,000;15,000/.toString(),"Actual Benefit":/4,000;14,000/.toString())
        //Set Tab in View Idea 3
        new actions.ViewIdea30.SetTabinViewIdea3().run("Tab":/Development/.toString())
        //Verify Description Tab Text Field on View Idea 30
        new actions.ViewIdea3Fields.VerifyViewIdea3DescriptionTabFieldValue().run("Field Name":/Development Short Answer Question/.toString(),"Field Value":/edit dev answer/.toString(),"Should Exist":/TRUE/.toString())
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