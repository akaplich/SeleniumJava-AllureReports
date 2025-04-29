package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132036 - WB - NNL - Break Into Stacks
class C132036_WB_NNL_BreakIntoStacks
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
        new actions.Whiteboards.CreateWhiteboardFromUserhome().run("Create New or Choose Template":/New Blank Whiteboard/.toString(),"Should it wait for page to load":true)
        //Set Whiteboard Title
        new actions.Whiteboards.EditTitleOfWhiteboard().run("Title":/C132036/.toString(),"Action":/Submit/.toString())
        //Click on Whiteboard Tool
        new actions.Whiteboards.ClickOnWhiteboardTool().run("Tool Type":/Toolkit/.toString())
        //Set Toolkit from left Toolbar
        new actions.Whiteboards.SetToolkitfromleftToolbar().run("Toolkit Option":/Now, Next, Later/.toString())
        //Click on Whiteboard Canvas
        new actions.Whiteboards.ClickOnWhiteboardCanvas().run("X coordinate":/1200/.toString(),"Y coordinate":/670/.toString(),"Single Double or Right Click":/Right Click/.toString())
        //Verify Smart Matrix & Other Elements Exists On Whiteboard
        new actions.Whiteboards.VerifySmartMatrixExists().run("Element (skip if verifying text)":/Kanban 1/.toString(),"Should Exist":true)
        //Verify Smart Matrix & Other Elements Exists On Whiteboard
        new actions.Whiteboards.VerifySmartMatrixExists().run("Element (skip if verifying text)":/Kanban 2/.toString(),"Should Exist":false)
        //Whiteboard - Set Right Click on Object
        new actions.Whiteboards.SetRightClickonStickyNote().run("Break into Stacks":true)
        //Verify Smart Matrix & Other Elements Exists On Whiteboard
        new actions.Whiteboards.VerifySmartMatrixExists().run("Element (skip if verifying text)":/Kanban 2/.toString(),"Should Exist":true)
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