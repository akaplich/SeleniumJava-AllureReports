package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C130915 - WB - Go To Top Ideas (Smart Matrix locked)
class C130915_WB_GoToTopIdeas_SmartMatrixlocked
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
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Whiteboards/.toString())
        //Create Whiteboard or Edit Template
        new actions.Whiteboards.CreateWhiteboardFromUserhome().run("Create New or Choose Template":/New Blank Whiteboard/.toString(),"Should it wait for page to load":true)
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
        //Add Sticky Note to Whiteboard
        new actions.Whiteboards.AddStickyNoteToWhiteboard().run("Add via Double Click or Drag and Drop":/Single Click/.toString(),"X coordinate":/25/.toString(),"Y coordinate":/0/.toString())
        //Whiteboard - Set Right Click on Object
        new actions.Whiteboards.SetRightClickonStickyNote().run("Right Click on Sticky Note":true,"Add to pipeline":/Custom App/.toString(),"Add to pipeline Action":/Add/.toString())
        //Verify Toast Message for Linking and Unlinking Pipeline
        new actions.Whiteboards.VerifyToastMessageforLinkingandUnlinkingPipeline().run("Message":/Added to pipeline successfully. D113/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Set Right Click on Smart Matrix
        new actions.Whiteboards.SetRightClickonSmartMatrix().run("X Coordinate":/200/.toString(),"Y Coordinate":/15/.toString(),"Menu Option":/Smart Matrix Settings/.toString(),"Smart Matrix Name":/Test Smart Matrix/.toString(),"X Axis Labels":/Market/.toString(),"Y Axis Labels":/Difficulty/.toString(),"Connect to Activity":/Custom App/.toString(),"Matrix Settings Action":/Save/.toString())
        //Set Right Click on Smart Matrix
        new actions.Whiteboards.SetRightClickonSmartMatrix().run("X Coordinate":/150/.toString(),"Y Coordinate":/15/.toString(),"Menu Option":/Lock/.toString())
        //Set Right Click on Smart Matrix
        new actions.Whiteboards.SetRightClickonSmartMatrix().run("X Coordinate":/0/.toString(),"Y Coordinate":/0/.toString(),"Menu Option":/Go to Top Ideas/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Window Name":/Custom App: Submissions/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/Idea1/.toString(),"Idea Code":/D113/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/quick add1/.toString(),"Stack Name Memo belongs to":/Quick Add/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/test idea1/.toString(),"Stack Name Memo belongs to":/New Product/.toString(),"Idea Code":/D102/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/test idea2/.toString(),"Stack Name Memo belongs to":/Operations/.toString(),"Idea Code":/D107/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Step Result in Top Ideas
        new actions.PipelineTopIdeas.VerifyStepResultInTopIdeas().run("Idea Title":/Idea1/.toString(),"Idea Code":/113/.toString(),"Score":/9.6/.toString(),"Number of Matches":/1/.toString())
        //Verify Step Result in Top Ideas
        new actions.PipelineTopIdeas.VerifyStepResultInTopIdeas().run("Idea Title":/test idea1/.toString(),"Idea Code":/102/.toString(),"Score":/-/.toString(),"Number of Matches":/1/.toString())
        //Verify Step Result in Top Ideas
        new actions.PipelineTopIdeas.VerifyStepResultInTopIdeas().run("Idea Title":/test idea2/.toString(),"Idea Code":/107/.toString(),"Score":/-/.toString(),"Number of Matches":/1/.toString())
        //Verify Smart Matrix in Top Ideas
        new actions.PipelineTopIdeas.VerifySmartMatrixinTopIdeas().run("Idea":/Idea1/.toString(),"Score":/9.6/.toString(),"X Axis":/Market/.toString(),"X coordinate":/1.5/.toString(),"Y Axis":/Difficulty/.toString(),"Y coordinate":/6.4/.toString())
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