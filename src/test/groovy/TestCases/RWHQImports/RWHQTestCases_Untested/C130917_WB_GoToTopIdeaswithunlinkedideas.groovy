package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C130917 - WB - Go To Top Ideas with unlinked ideas
class C130917_WB_GoToTopIdeaswithunlinkedideas
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
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString(),"Highlights":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Whiteboards/.toString())
        //Create Whiteboard or Edit Template
        new actions.Whiteboards.CreateWhiteboardFromUserhome().run("Create New or Choose Template":/New Blank Whiteboard/.toString())
        //Set Whiteboard Title
        new actions.Whiteboards.EditTitleOfWhiteboard().run("Title":/Whiteboard with smart matrix/.toString(),"Action":/Submit/.toString())
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
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
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
        //Verify Toast Message for Linking and Unlinking Pipeline
        new actions.Whiteboards.VerifyToastMessageforLinkingandUnlinkingPipeline().run("Message":/Added to pipeline successfully. D113/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Whiteboard - Set Right Click on Object
        new actions.Whiteboards.SetRightClickonStickyNote().run("Right Click on Sticky Note":true,"Unlink from pipeline":true)
        //Click on Whiteboard Canvas
        new actions.Whiteboards.ClickOnWhiteboardCanvas().run("X coordinate":/200/.toString(),"Y coordinate":/15/.toString(),"Single Double or Right Click":/Single Click/.toString())
        //Set Right Click on Smart Matrix
        new actions.Whiteboards.SetRightClickonSmartMatrix().run("X Coordinate":/0/.toString(),"Y Coordinate":/0/.toString(),"Menu Option":/Smart Matrix Settings/.toString(),"Smart Matrix Name":/Test Smart Matrix/.toString(),"X Axis Labels":/Market/.toString(),"Y Axis Labels":/Difficulty/.toString(),"Connect to Activity":/Custom App/.toString(),"Matrix Settings Action":/Save/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Click on Whiteboard Tool
        new actions.Whiteboards.ClickOnWhiteboardTool().run("Tool Type":/Sticky Note/.toString())
        //Add Sticky Note to Whiteboard
        new actions.Whiteboards.AddStickyNoteToWhiteboard().run("Add via Double Click or Drag and Drop":/Single Click/.toString(),"X coordinate":/900/.toString(),"Y coordinate":/200/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Idea3/.toString())
        //Click on Whiteboard Canvas
        new actions.Whiteboards.ClickOnWhiteboardCanvas().run("X coordinate":/10/.toString(),"Y coordinate":/40/.toString(),"Single Double or Right Click":/Right Click/.toString())
        //Whiteboard - Set Right Click on Object
        new actions.Whiteboards.SetRightClickonStickyNote().run("Add to pipeline":/Custom App/.toString(),"Add to pipeline Action":/Add/.toString())
        //Verify Toast Message for Linking and Unlinking Pipeline
        new actions.Whiteboards.VerifyToastMessageforLinkingandUnlinkingPipeline().run("Message":/Added to pipeline successfully. D114/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Set Right Click on Smart Matrix
        new actions.Whiteboards.SetRightClickonSmartMatrix().run("X Coordinate":/-300/.toString(),"Y Coordinate":/-100/.toString(),"Menu Option":/Go to Top Ideas/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Window Name":/Custom App: Submissions/.toString())
        //Verify Step Result in Top Ideas
        new actions.PipelineTopIdeas.VerifyStepResultInTopIdeas().run("Idea Title":/Idea1/.toString(),"Score":/-/.toString(),"Number of Matches":/0/.toString())
        //Verify Step Result in Top Ideas
        new actions.PipelineTopIdeas.VerifyStepResultInTopIdeas().run("Idea Title":/Idea2/.toString(),"Score":/-/.toString(),"Number of Matches":/1/.toString())
        //Verify Step Result in Top Ideas
        new actions.PipelineTopIdeas.VerifyStepResultInTopIdeas().run("Idea Title":/Idea3/.toString(),"Score":/-/.toString(),"Number of Matches":/1/.toString())
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