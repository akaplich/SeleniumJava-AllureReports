import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131532 - WB - Unlimited Send To Whiteboard (600 ideas)
class C131532_WB_UnlimitedSendToWhiteboard_600ideas
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
        //Open Browser
        new actions.selenium.Browser().run("URL":/https:\/\/anna81.brightideatest.com\//.toString(),"Browser Type":/Chrome/.toString())
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack - 600 ideas/.toString(),"Area to Navigate to":/Pipeline List/.toString())
        //Select Ideas in Pipeline List View
        new actions.PipelineList.SelectIdeasPipelineListView().run("Click Select All Checkbox":true,"Click Select All Link":true)
        //Send Idea(s) to Whiteboard/Smart Matrix from Pipeline Steps/List View
        new actions.Whiteboards.SendIdeaToWhiteboardFromPipelineSteps().run("Existing Whiteboard or New Whiteboard":/New Whiteboard/.toString(),"Whiteboard Title":/C131532 Unsorted/.toString(),"Action":/Send/.toString())
        //Verify Toast Message in Pipeline Steps/List
        new actions.PipelineStepsView.VerifyToastMessageInPipelineStepsList().run("Message":/The selected ideas were sent successfully to the whiteboard: C131532 Unsorted/.toString(),"Click on the link":true)
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/1/.toString())
        //Verify Smart Matrix & Other Elements Exists On Whiteboard
        new actions.Whiteboards.VerifySmartMatrixExists().run("Verify This Actual Text":/Added from "Hack - 600 ideas" by System Admin on/.toString(),"Should Exist":true)
        //Verify Smart Matrix & Other Elements Exists On Whiteboard
        new actions.Whiteboards.VerifySmartMatrixExists().run("Verify This Actual Text":/600 Egg Minder/.toString(),"Should Exist":true)
        //Verify Smart Matrix & Other Elements Exists On Whiteboard
        new actions.Whiteboards.VerifySmartMatrixExists().run("Element (skip if verifying text)":/Sticky Note/.toString(),"Should Exist":true)
        //Verify Element
        new actions.general.VerifyElement().run("ID":/(\/\/UL\/LI\/\/*[@class='f-canvas-list-item']\/\/I[contains(@class,'sticky-note')])[600]\/..\/..\/..\/..\/..\/../.toString(),"Should Element Exist":true,"Number of Matches":/1/.toString())
        //Set Whiteboard Top Bar
        new actions.Whiteboards.SetWhiteboardMenuDropdowninTopBar().run("Menu Option":/Edit/.toString(),"Sub Option":/Delete.../.toString(),"Delete Modal Action":/Submit/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack - 600 ideas/.toString(),"Area to Navigate to":/Pipeline List/.toString())
        //Select Ideas in Pipeline List View
        new actions.PipelineList.SelectIdeasPipelineListView().run("Click Select All Checkbox":true,"Click Select All Link":true)
        //Send Idea(s) to Whiteboard/Smart Matrix from Pipeline Steps/List View
        new actions.Whiteboards.SendIdeaToWhiteboardFromPipelineSteps().run("Existing Whiteboard or New Whiteboard":/New Whiteboard/.toString(),"Whiteboard Title":/C131532 Sorted/.toString(),"Sort by":/Status/.toString(),"Organized in":/Horizontal swimlanes/.toString(),"Action":/Send/.toString())
        //Verify Toast Message in Pipeline Steps/List
        new actions.PipelineStepsView.VerifyToastMessageInPipelineStepsList().run("Message":/The selected ideas were sent successfully to the whiteboard: C131532 Sorted/.toString(),"Click on the link":true)
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/2/.toString())
        //Verify Smart Matrix & Other Elements Exists On Whiteboard
        new actions.Whiteboards.VerifySmartMatrixExists().run("Verify This Actual Text":/Added from "Hack - 600 ideas" by System Admin on/.toString(),"Should Exist":true)
        //Verify Smart Matrix & Other Elements Exists On Whiteboard
        new actions.Whiteboards.VerifySmartMatrixExists().run("Verify This Actual Text":/Pending/.toString(),"Should Exist":true)
        //Verify Smart Matrix & Other Elements Exists On Whiteboard
        new actions.Whiteboards.VerifySmartMatrixExists().run("Verify This Actual Text":/600 Egg Minder/.toString(),"Should Exist":true)
        //Verify Smart Matrix & Other Elements Exists On Whiteboard
        new actions.Whiteboards.VerifySmartMatrixExists().run("Element (skip if verifying text)":/Sticky Note/.toString(),"Should Exist":true)
        //Verify Element
        new actions.general.VerifyElement().run("ID":/(\/\/UL\/LI\/\/*[@class='f-canvas-list-item']\/\/I[contains(@class,'sticky-note')])[600]\/..\/..\/..\/..\/..\/../.toString(),"Should Element Exist":true,"Number of Matches":/1/.toString())
        //Set Whiteboard Top Bar
        new actions.Whiteboards.SetWhiteboardMenuDropdowninTopBar().run("Menu Option":/Edit/.toString(),"Sub Option":/Delete.../.toString(),"Delete Modal Action":/Submit/.toString())
        //Create Whiteboard or Edit Template
        new actions.Whiteboards.CreateWhiteboardFromUserhome().run("Create New or Choose Template":/New Blank Whiteboard/.toString())
        //Set Whiteboard Title
        new actions.Whiteboards.EditTitleOfWhiteboard().run("Title":/C131532 Existing/.toString(),"Action":/Submit/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack - 600 ideas/.toString(),"Area to Navigate to":/Pipeline List/.toString())
        //Select Ideas in Pipeline List View
        new actions.PipelineList.SelectIdeasPipelineListView().run("Click Select All Checkbox":true,"Click Select All Link":true)
        //Send Idea(s) to Whiteboard/Smart Matrix from Pipeline Steps/List View
        new actions.Whiteboards.SendIdeaToWhiteboardFromPipelineSteps().run("Existing Whiteboard or New Whiteboard":/Existing Whiteboard/.toString(),"Whiteboard Title":/C131532 Existing/.toString(),"Sort by":/Step/.toString(),"Organized in":/Vertical swimlanes/.toString(),"Action":/Send/.toString())
        //Verify Toast Message in Pipeline Steps/List
        new actions.PipelineStepsView.VerifyToastMessageInPipelineStepsList().run("Message":/The selected ideas were sent successfully to the whiteboard: C131532 Existing/.toString(),"Click on the link":true)
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/3/.toString())
        //Verify Smart Matrix & Other Elements Exists On Whiteboard
        new actions.Whiteboards.VerifySmartMatrixExists().run("Verify This Actual Text":/Rate Submissions/.toString(),"Should Exist":true)
        //Verify Smart Matrix & Other Elements Exists On Whiteboard
        new actions.Whiteboards.VerifySmartMatrixExists().run("Verify This Actual Text":/Added from "Hack - 600 ideas" by System Admin on/.toString(),"Should Exist":true)
        //Verify Smart Matrix & Other Elements Exists On Whiteboard
        new actions.Whiteboards.VerifySmartMatrixExists().run("Verify This Actual Text":/Live scan technology/.toString(),"Should Exist":true)
        //Verify Smart Matrix & Other Elements Exists On Whiteboard
        new actions.Whiteboards.VerifySmartMatrixExists().run("Element (skip if verifying text)":/Sticky Note/.toString(),"Should Exist":true)
        //Verify Element
        new actions.general.VerifyElement().run("ID":/(\/\/UL\/LI\/\/*[@class='f-canvas-list-item']\/\/I[contains(@class,'sticky-note')])[600]\/..\/..\/..\/..\/..\/../.toString(),"Should Element Exist":true,"Number of Matches":/1/.toString())
        //Set Whiteboard Top Bar
        new actions.Whiteboards.SetWhiteboardMenuDropdowninTopBar().run("Menu Option":/Edit/.toString(),"Sub Option":/Delete.../.toString(),"Delete Modal Action":/Submit/.toString())
    }
    @AfterMethod
    public void afterState(){
        //Close All Browsers
        new actions.selenium.CloseBrowser().run([:])
    }
}