import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131662 - Apply - Widget On VI3 Modal - PL View, Whiteboard, Idea Boards
class C131662_Apply_WidgetOnVI3Modal_PLView_Whiteboard_IdeaBoards
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
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Users Administrators page
        new actions.SetupUsers.SetEnterpriseSetupUsersAdministratorspage().run("System Administrators":/NonBI System Admin/.toString(),"System Administrators Add or Remove":/Add/.toString())
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
        new actions.WebstormCreation.CreatePipelineWithSchedulerV3().run("App Name (optional)":/Hackathon/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Title":/Hack/.toString(),"Description":/Hack Event description/.toString(),"Administrator Field Title":/Pipeline Administrator/.toString(),"Administrator Field Value":/Pipeline Admin/.toString(),"Administrator Field Value Add or Remove":/Add/.toString(),"Moderator Field Title":/Pipeline Moderator/.toString(),"Moderator Field Value":/Moderator/.toString(),"Moderator Field Value Add or Remove":/Add/.toString(),"Phase 1 Title":/Plan & Setup/.toString(),"Phase 1 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 2 Title":/Incubate/.toString(),"Phase 2 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 3 Title":/Build\/Hack/.toString(),"Phase 3 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 4 Title":/Presentation & Judging/.toString(),"Phase 4 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 5 Title":/Recognize/.toString(),"Phase 5 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 6 Title":/Close Out & Review /.toString(),"Phase 6 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Action on Site Schedule Page":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Idea Title Question - Title":/Title/.toString(),"Idea Title Question - Value":/test/.toString(),"Description Question - Title":/Description/.toString(),"Description Question - Value":/test/.toString(),"Category Question - Title":/Category/.toString(),"Category Question - Value":/Theme 1/.toString(),"Action":/Submit Idea/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/*[@id='content-inside']\/DIV\/\/P[contains(.,'test')]\/\/A[normalize-space()='D111']/.toString())
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/*[@id='f-gig-app-btn-trigger-modal']/.toString(),"Should Element Exist":false,"Number of Matches":/0/.toString())
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Close Idea Modal":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/nonbisysadmin@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/*[@id='content-inside']\/DIV\/\/P[contains(.,'test')]\/\/A[normalize-space()='D111']/.toString())
        //Compare Images
        new actions.selenium.CompareImages().run("Element ID (optional)":/\/\/*[contains(@class,'f-idea-modal-container')]\/\/DIV[contains(@class,'f-gig-vI3-wrapper')]\/BUTTON/.toString(),"Expected Image File":/C131662_1_expected.png/.toString(),"Actual Image Name":/C131662_1_actual.png/.toString(),"Allowed Number of Different Pixels":/10/.toString(),"Temporary Pause Verification; Email Screenshot to":"","Do Not Scroll":true)
        //Apply on View Idea 30
        new actions.ViewIdea30.ApplyOnViewIdea30().run("Message":/I'd like to be part of the team/.toString(),"Expertise":/MySQL,Automation/.toString(),"Expertise Add or Remove":/Add,Add/.toString(),"Action":/Apply/.toString())
        //Compare Images
        new actions.selenium.CompareImages().run("Element ID (optional)":/\/\/*[contains(@class,'f-idea-modal-container')]\/\/DIV[contains(@class,'f-gig-application-widget')]\/\/DIV[contains(@class,'f-gig-cancel-wrapper')]\/BUTTON/.toString(),"Expected Image File":/C131662_2_expected1.png/.toString(),"Actual Image Name":/C131662_2_actual.png/.toString(),"Allowed Number of Different Pixels":/10/.toString(),"Temporary Pause Verification; Email Screenshot to":"","Do Not Scroll":true)
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Close Idea Modal":true)
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test/.toString())
        //Send Idea(s) to Whiteboard/Smart Matrix from Pipeline Steps/List View
        new actions.Whiteboards.SendIdeaToWhiteboardFromPipelineSteps().run("Existing Whiteboard or New Whiteboard":/New Whiteboard/.toString(),"Whiteboard Title":/C131662/.toString(),"Format":/Stickies/.toString(),"Sort by":/Status/.toString(),"Action":/Send/.toString())
        //Verify Toast Message in Pipeline Steps/List
        new actions.PipelineStepsView.VerifyToastMessageInPipelineStepsList().run("Message":/The selected ideas were sent successfully to the whiteboard: C131662/.toString(),"Click on the link":true)
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/1/.toString())
        //Copy Current URL
        variables."copiedURL" = new actions.selenium.CopyCurrentURL().run([:])
        //Go Back From Whiteboard
        new actions.Whiteboards.GoBackFromWhiteboard().run([:])
        //Log Out
        new actions.general.LogOut().run([:])
        //Close All Browsers
        new actions.selenium.CloseBrowser().run([:])
        //Open Browser
        new actions.selenium.Browser().run("URL":/${variables."affiliateURL"}/.toString(),"Browser Type":/Chrome/.toString())
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Create Whiteboard or Edit Template
        new actions.Whiteboards.CreateWhiteboardFromUserhome().run("Create New or Choose Template":/New Blank Whiteboard/.toString())
        //Set Whiteboard Title
        new actions.Whiteboards.EditTitleOfWhiteboard().run("Title":/C131662 Apply/.toString(),"Action":/Submit/.toString())
        //Click on Whiteboard Tool
        new actions.Whiteboards.ClickOnWhiteboardTool().run("Tool Type":/Sticky Note/.toString())
        //Add Sticky Note to Whiteboard
        new actions.Whiteboards.AddStickyNoteToWhiteboard().run("Add via Double Click or Drag and Drop":/Single Click/.toString(),"X coordinate":/740/.toString(),"Y coordinate":/657/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Idea1/.toString())
        //Add Sticky Note to Whiteboard
        new actions.Whiteboards.AddStickyNoteToWhiteboard().run("Add via Double Click or Drag and Drop":/Single Click/.toString(),"X coordinate":/50/.toString(),"Y coordinate":/20/.toString())
        //Whiteboard - Set Right Click on Object
        new actions.Whiteboards.SetRightClickonStickyNote().run("Add to pipeline":/Hack/.toString(),"Add to pipeline Action":/Add/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/30/.toString())
        //Whiteboard - Set Right Click on Object
        new actions.Whiteboards.SetRightClickonStickyNote().run("View idea details":true)
        //Set Submitter in View Idea 3 Using Submitter Modal
        new actions.ViewIdea30.SetSubmitterinViewIdea3().run("User":/End User 2/.toString(),"User Name on the List":/End User 2/.toString(),"Add or Remove or Set Owner":/Add/.toString(),"Action":/Update/.toString())
        //Set Submitter in View Idea 3 Using Submitter Modal
        new actions.ViewIdea30.SetSubmitterinViewIdea3().run("User":/End User 2/.toString(),"User Name on the List":/End User 2/.toString(),"Add or Remove or Set Owner":/Set Owner/.toString(),"Action":/Update/.toString())
        //Set Submitter in View Idea 3 Using Submitter Modal
        new actions.ViewIdea30.SetSubmitterinViewIdea3().run("User":/End User/.toString(),"User Name on the List":/End User/.toString(),"Add or Remove or Set Owner":/Remove/.toString(),"Action":/Update/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/2/.toString())
        //Compare Images
        new actions.selenium.CompareImages().run("Element ID (optional)":/\/\/*[contains(@class,'f-idea-modal-container')]\/\/DIV[contains(@class,'f-gig-vI3-wrapper')]\/BUTTON/.toString(),"Expected Image File":/C131662_3_expected1.png/.toString(),"Actual Image Name":/C131662_3_actual.png/.toString(),"Allowed Number of Different Pixels":/10/.toString(),"Temporary Pause Verification; Email Screenshot to":"","Do Not Scroll":true)
        //Apply on View Idea 30
        new actions.ViewIdea30.ApplyOnViewIdea30().run("Message":/I'd like to be part of the team/.toString(),"Expertise":/MySQL,Automation/.toString(),"Expertise Add or Remove":/Add,Add/.toString(),"Action":/Apply/.toString())
        //Compare Images
        new actions.selenium.CompareImages().run("Element ID (optional)":/\/\/*[contains(@class,'f-idea-modal-container')]\/\/DIV[contains(@class,'f-gig-application-widget')]\/\/DIV[contains(@class,'f-gig-cancel-wrapper')]\/BUTTON/.toString(),"Expected Image File":/C131662_4_expected2.png/.toString(),"Actual Image Name":/C131662_4_actual.png/.toString(),"Allowed Number of Different Pixels":/100/.toString(),"Temporary Pause Verification; Email Screenshot to":"")
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Close Idea Modal":true)
        //Go Back From Whiteboard
        new actions.Whiteboards.GoBackFromWhiteboard().run([:])
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser2@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test/.toString())
        //Compare Images
        new actions.selenium.CompareImages().run("Element ID (optional)":/\/\/*[contains(@class,'f-idea-modal-container')]\/\/DIV[contains(@class,'f-gig-vI3-wrapper')]\/BUTTON/.toString(),"Expected Image File":/C131662_5_expected2.png/.toString(),"Actual Image Name":/C131662_5_actual.png/.toString(),"Allowed Number of Different Pixels":/100/.toString(),"Temporary Pause Verification; Email Screenshot to":"","Do Not Scroll":true)
        //Apply on View Idea 30
        new actions.ViewIdea30.ApplyOnViewIdea30().run("Message":/I'd like to be part of the team/.toString(),"Expertise":/MySQL,Automation/.toString(),"Expertise Add or Remove":/Add,Add/.toString(),"Action":/Apply/.toString())
        //Compare Images
        new actions.selenium.CompareImages().run("Element ID (optional)":/\/\/*[contains(@class,'f-idea-modal-container')]\/\/DIV[contains(@class,'f-gig-application-widget')]\/\/DIV[contains(@class,'f-gig-cancel-wrapper')]\/BUTTON/.toString(),"Expected Image File":/C131662_6_expected1.png/.toString(),"Actual Image Name":/C131662_6_actual.png/.toString(),"Allowed Number of Different Pixels":/100/.toString(),"Temporary Pause Verification; Email Screenshot to":"","Do Not Scroll":true)
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
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C131662_1_actual.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C131662_2_actual.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C131662_3_actual.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C131662_4_actual.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C131662_5_actual.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C131662_6_actual.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/difference.png/.toString())
        }
       catch(all){}catch(Error err){}
        //Afterstate
        Action581259c8fa4ee77809f46905([:])
    }
}