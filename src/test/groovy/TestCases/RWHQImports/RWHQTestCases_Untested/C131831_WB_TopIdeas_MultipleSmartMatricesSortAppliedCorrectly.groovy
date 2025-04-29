import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131831 - WB - Top Ideas > Multiple Smart Matrices Sort Applied Correctly
class C131831_WB_TopIdeas_MultipleSmartMatricesSortAppliedCorrectly
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
        //Delete this when Scheduler feature is enabled for everyone
        Action66ec7933e12425a91ee5d983([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString())
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
        new actions.WebstormCreation.CreatePipelineWithSchedulerV3().run("App Name (optional)":/Hackathon/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Title":/Hack/.toString(),"Description":/Hack Event description/.toString(),"Moderator Field Title":/Pipeline Moderator/.toString(),"Moderator Field Value":/Moderator/.toString(),"Moderator Field Value Add or Remove":/Add/.toString(),"Phase 1 Title":/Plan & Setup/.toString(),"Phase 1 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 2 Title":/Incubate/.toString(),"Phase 2 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 3 Title":/Build\/Hack/.toString(),"Phase 3 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 4 Title":/Presentation & Judging/.toString(),"Phase 4 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 5 Title":/Recognize/.toString(),"Phase 5 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Phase 6 Title":/Close Out & Review /.toString(),"Phase 6 (Start Date, Start Time, End Date, End Time)":/${variables."today"}, ${variables."now"}, ${variables."end"}, ${variables."now"}/.toString(),"Action on Site Schedule Page":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Top Ideas/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/test idea1/.toString(),"Category":/Theme 1/.toString(),"Action":/Submit/.toString())
        //Select Idea(s) In Top Ideas
        new actions.PipelineTopIdeas.SelectIdeasInTopIdeas().run("Idea Title(s)":["test idea1"])
        //Right Click on Idea in Top Ideas
        new actions.PipelineTopIdeas.RightClickOnIdeaInTopIdeas().run("Idea Title":/test idea1/.toString())
        //Send Idea(s) to Whiteboard/Smart Matrix from Pipeline Steps/List View
        new actions.Whiteboards.SendIdeaToWhiteboardFromPipelineSteps().run("Send to Whiteboard or Smart Matrix":/Send to Smart Matrix/.toString(),"Existing Whiteboard or New Whiteboard":/New Whiteboard/.toString(),"Whiteboard Title":/C131831/.toString(),"Format":/Stickies/.toString(),"Smart Matrix Name":/from Top Ideas/.toString(),"Action":/Send/.toString())
        //Verify Toast Message for Linking and Unlinking Pipeline
        new actions.Whiteboards.VerifyToastMessageforLinkingandUnlinkingPipeline().run("Message":/The selected ideas were sent successfully to the whiteboard: C131831/.toString(),"Click on Idea Code":true)
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/1/.toString())
        //Wait for Whiteboard
        new actions.Whiteboards.WaitForWhiteboard().run([:])
        //Verify Smart Matrix & Other Elements Exists On Whiteboard
        new actions.Whiteboards.VerifySmartMatrixExists().run("Verify This Actual Text":/Added from "Hack" by System Admin on/.toString(),"Should Exist":true)
        //Verify Smart Matrix & Other Elements Exists On Whiteboard
        new actions.Whiteboards.VerifySmartMatrixExists().run("Verify This Actual Text":/test idea1/.toString(),"Should Exist":true)
        //Click on Whiteboard Canvas
        new actions.Whiteboards.ClickOnWhiteboardCanvas().run("X coordinate":/100/.toString(),"Y coordinate":/100/.toString(),"Single Double or Right Click":/Single Click/.toString())
        //Click on Whiteboard Canvas
        new actions.Whiteboards.ClickOnWhiteboardCanvas().run("X coordinate":/-350/.toString(),"Y coordinate":/-300/.toString(),"Single Double or Right Click":/Single Click/.toString())
        //Click on Whiteboard Canvas
        new actions.Whiteboards.ClickOnWhiteboardCanvas().run("X coordinate":/0/.toString(),"Y coordinate":/-250/.toString(),"Single Double or Right Click":/Single Click/.toString())
        //Click on Whiteboard Canvas
        new actions.Whiteboards.ClickOnWhiteboardCanvas().run("X coordinate":/0/.toString(),"Y coordinate":/-120/.toString(),"Single Double or Right Click":/Single Click/.toString())
        //Click on Whiteboard Canvas
        new actions.Whiteboards.ClickOnWhiteboardCanvas().run("X coordinate":/0/.toString(),"Y coordinate":/-100/.toString(),"Single Double or Right Click":/Single Click/.toString())
        //Click on Whiteboard Canvas
        new actions.Whiteboards.ClickOnWhiteboardCanvas().run("X coordinate":/-105/.toString(),"Y coordinate":/35/.toString(),"Single Double or Right Click":/Single Click/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/2/.toString())
        //Set Marker or Move Tool in Whiteboard
        new actions.Whiteboards.SetMarkerToolToWhiteboard().run("X coordinate1":/0/.toString(),"Y coordinate1":/0/.toString(),"X coordinate2":/280/.toString(),"Y coordinate2":/325/.toString(),"X coordinate3":/5/.toString(),"Y coordinate3":/5/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Set Right Click on Smart Matrix
        new actions.Whiteboards.SetRightClickonSmartMatrix().run("X Coordinate":/0/.toString(),"Y Coordinate":/-50/.toString(),"Menu Option":/Go to Top Ideas/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/2/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Set Sort in Top Ideas
        new actions.PipelineTopIdeas.SetSortInTopIdeas().run("Sort By":/Smart Matrix (from Top Ideas)/.toString())
        //Verify Smart Matrix in Top Ideas
        new actions.PipelineTopIdeas.VerifySmartMatrixinTopIdeas().run("Idea":/test idea1/.toString(),"Score":/28.4/.toString(),"X Axis":/Impact/.toString(),"X coordinate":/8.1/.toString(),"Y Axis":/Feasibility/.toString(),"Y coordinate":/3.5/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/1/.toString())
        //Click on Whiteboard Tool
        new actions.Whiteboards.ClickOnWhiteboardTool().run("Tool Type":/Toolkit/.toString())
        //Set Toolkit from left Toolbar
        new actions.Whiteboards.SetToolkitfromleftToolbar().run("Toolkit Option":/Smart Matrix/.toString())
        //Click on Whiteboard Canvas
        new actions.Whiteboards.ClickOnWhiteboardCanvas().run("X coordinate":/540/.toString(),"Y coordinate":/350/.toString(),"Single Double or Right Click":/Single Click/.toString())
        //Click on Whiteboard Canvas
        new actions.Whiteboards.ClickOnWhiteboardCanvas().run("X coordinate":/540/.toString(),"Y coordinate":/0/.toString(),"Single Double or Right Click":/Single Click/.toString())
        //Set Marker or Move Tool in Whiteboard
        new actions.Whiteboards.SetMarkerToolToWhiteboard().run("X coordinate1":/0/.toString(),"Y coordinate1":/0/.toString(),"X coordinate2":/250/.toString(),"Y coordinate2":/0/.toString(),"X coordinate3":/250/.toString(),"Y coordinate3":/0/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/1/.toString())
        //Move Mouse Cursor in Whiteboard
        new actions.Whiteboards.MoveCursorWhiteboard().run("X coordinate1":/-250/.toString(),"Y coordinate1":/0/.toString(),"X coordinate2":/-250/.toString(),"Y coordinate2":/0/.toString())
        //Set Right Click on Smart Matrix
        new actions.Whiteboards.SetRightClickonSmartMatrix().run("X Coordinate":/0/.toString(),"Y Coordinate":/0/.toString(),"Menu Option":/Smart Matrix Settings/.toString(),"Smart Matrix Name":/from WB/.toString(),"X Axis Labels":/Market/.toString(),"Y Axis Labels":/Difficulty/.toString(),"Connect to Activity":/Hack/.toString(),"Matrix Settings Action":/Save/.toString())
        //Click on Whiteboard Tool
        new actions.Whiteboards.ClickOnWhiteboardTool().run("Tool Type":/Sticky Note/.toString())
        //Add Sticky Note to Whiteboard
        new actions.Whiteboards.AddStickyNoteToWhiteboard().run("Add via Double Click or Drag and Drop":/Single Click/.toString(),"X coordinate":/0/.toString(),"Y coordinate":/-100/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/test idea2/.toString())
        //Click on Whiteboard Canvas
        new actions.Whiteboards.ClickOnWhiteboardCanvas().run("X coordinate":/25/.toString(),"Y coordinate":/0/.toString(),"Single Double or Right Click":/Right Click/.toString())
        //Whiteboard - Set Right Click on Object
        new actions.Whiteboards.SetRightClickonStickyNote().run("Add to pipeline":/Hack/.toString(),"Add to pipeline Action":/Add/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/2/.toString())
        //Set Right Click on Smart Matrix
        new actions.Whiteboards.SetRightClickonSmartMatrix().run("X Coordinate":/0/.toString(),"Y Coordinate":/-100/.toString(),"Menu Option":/Go to Top Ideas/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/3/.toString())
        //Verify Smart Matrix in Top Ideas
        new actions.PipelineTopIdeas.VerifySmartMatrixinTopIdeas().run("Idea":/test idea2/.toString(),"Score":/1.4/.toString(),"X Axis":/Market/.toString(),"X coordinate":/0.5/.toString(),"Y Axis":/Difficulty/.toString(),"Y coordinate":/2.8/.toString())
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
    //Delete this when Scheduler feature is enabled for everyone
    public static def Action66ec7933e12425a91ee5d983(def params){
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for BIOnly Beta tab
        new actions.SetupBI.SetEnterpriseSetupforBIOnlyBetatab().run("Scheduler updates":true,"Sync Phase and Scheduler Content":true)

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