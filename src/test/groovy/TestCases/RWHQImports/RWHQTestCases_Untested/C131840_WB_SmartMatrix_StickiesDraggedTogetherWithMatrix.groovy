import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131840 - WB - Smart Matrix - Stickies Dragged Together With Matrix
class C131840_WB_SmartMatrix_StickiesDraggedTogetherWithMatrix
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
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Whiteboards/.toString())
        //Create Whiteboard or Edit Template
        new actions.Whiteboards.CreateWhiteboardFromUserhome().run("Create New or Choose Template":/New Blank Whiteboard/.toString())
        //Set Whiteboard Title
        new actions.Whiteboards.EditTitleOfWhiteboard().run("Title":/C131840/.toString(),"Action":/Submit/.toString())
        //Click on Whiteboard Tool
        new actions.Whiteboards.ClickOnWhiteboardTool().run("Tool Type":/Toolkit/.toString())
        //Set Toolkit from left Toolbar
        new actions.Whiteboards.SetToolkitfromleftToolbar().run("Toolkit Option":/Smart Matrix/.toString())
        //Click on Whiteboard Tool
        new actions.Whiteboards.ClickOnWhiteboardTool().run("Tool Type":/Sticky Note/.toString())
        //Add Sticky Note to Whiteboard
        new actions.Whiteboards.AddStickyNoteToWhiteboard().run("Add via Double Click or Drag and Drop":/Single Click/.toString(),"X coordinate":/740/.toString(),"Y coordinate":/350/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Idea1/.toString())
        //Click on Whiteboard Canvas
        new actions.Whiteboards.ClickOnWhiteboardCanvas().run("X coordinate":/25/.toString(),"Y coordinate":/0/.toString(),"Single Double or Right Click":/Right Click/.toString())
        //Whiteboard - Set Right Click on Object
        new actions.Whiteboards.SetRightClickonStickyNote().run("Add to pipeline":/Custom App/.toString(),"Add to pipeline Action":/Add/.toString())
        //Click on Whiteboard Tool
        new actions.Whiteboards.ClickOnWhiteboardTool().run("Tool Type":/Sticky Note/.toString())
        //Add Sticky Note to Whiteboard
        new actions.Whiteboards.AddStickyNoteToWhiteboard().run("Add via Double Click or Drag and Drop":/Single Click/.toString(),"X coordinate":/100/.toString(),"Y coordinate":/200/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Idea2/.toString())
        //Click on Whiteboard Canvas
        new actions.Whiteboards.ClickOnWhiteboardCanvas().run("X coordinate":/25/.toString(),"Y coordinate":/0/.toString(),"Single Double or Right Click":/Right Click/.toString())
        //Whiteboard - Set Right Click on Object
        new actions.Whiteboards.SetRightClickonStickyNote().run("Add to pipeline":/Custom App/.toString(),"Add to pipeline Action":/Add/.toString())
        //Set Right Click on Smart Matrix
        new actions.Whiteboards.SetRightClickonSmartMatrix().run("X Coordinate":/200/.toString(),"Y Coordinate":/15/.toString(),"Menu Option":/Smart Matrix Settings/.toString(),"Smart Matrix Name":/Test Smart Matrix/.toString(),"X Axis Labels":/Market/.toString(),"Y Axis Labels":/Difficulty/.toString(),"Connect to Activity":/Custom App/.toString(),"Matrix Settings Action":/Save/.toString())
        //Set Right Click on Smart Matrix
        new actions.Whiteboards.SetRightClickonSmartMatrix().run("X Coordinate":/200/.toString(),"Y Coordinate":/15/.toString(),"Menu Option":/Go to Top Ideas/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Window Name":/Custom App: Submissions/.toString())
        //Verify Smart Matrix in Top Ideas
        new actions.PipelineTopIdeas.VerifySmartMatrixinTopIdeas().run("Idea":/Idea2/.toString(),"Score":/12.3/.toString(),"X Axis":/Market/.toString(),"X coordinate":/2.5/.toString(),"Y Axis":/Difficulty/.toString(),"Y coordinate":/4.9/.toString(),"Click on Smart Matrix":false)
        //Verify Smart Matrix in Top Ideas
        new actions.PipelineTopIdeas.VerifySmartMatrixinTopIdeas().run("Idea":/Idea1/.toString(),"Score":/9.6/.toString(),"X Axis":/Market/.toString(),"X coordinate":/1.5/.toString(),"Y Axis":/Difficulty/.toString(),"Y coordinate":/6.4/.toString(),"Click on Smart Matrix":true)
        //Click on Whiteboard Canvas
        new actions.Whiteboards.ClickOnWhiteboardCanvas().run("X coordinate":/0/.toString(),"Y coordinate":/0/.toString(),"Single Double or Right Click":/Single Click/.toString())
        //Move Mouse Cursor in Whiteboard
        new actions.Whiteboards.MoveCursorWhiteboard().run("X coordinate1":/500/.toString(),"Y coordinate1":/0/.toString(),"X coordinate2":/500/.toString(),"Y coordinate2":/0/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/2/.toString())
        //Set Marker or Move Tool in Whiteboard
        new actions.Whiteboards.SetMarkerToolToWhiteboard().run("X coordinate1":/0/.toString(),"Y coordinate1":/0/.toString(),"X coordinate2":/250/.toString(),"Y coordinate2":/0/.toString(),"X coordinate3":/250/.toString(),"Y coordinate3":/5/.toString())
        //Set Right Click on Smart Matrix
        new actions.Whiteboards.SetRightClickonSmartMatrix().run("X Coordinate":/0/.toString(),"Y Coordinate":/0/.toString(),"Menu Option":/Go to Top Ideas/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Window Name":/Custom App: Submissions/.toString())
        //Verify Smart Matrix in Top Ideas
        new actions.PipelineTopIdeas.VerifySmartMatrixinTopIdeas().run("Idea":/Idea2/.toString(),"Score":/12.3/.toString(),"X Axis":/Market/.toString(),"X coordinate":/2.5/.toString(),"Y Axis":/Difficulty/.toString(),"Y coordinate":/4.9/.toString(),"Click on Smart Matrix":false)
        //Verify Smart Matrix in Top Ideas
        new actions.PipelineTopIdeas.VerifySmartMatrixinTopIdeas().run("Idea":/Idea1/.toString(),"Score":/9.6/.toString(),"X Axis":/Market/.toString(),"X coordinate":/1.5/.toString(),"Y Axis":/Difficulty/.toString(),"Y coordinate":/6.4/.toString(),"Click on Smart Matrix":true)
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