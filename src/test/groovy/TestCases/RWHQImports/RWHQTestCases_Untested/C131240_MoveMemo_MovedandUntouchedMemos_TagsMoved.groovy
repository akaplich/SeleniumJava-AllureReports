import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131240 - Move Memo - Moved and Untouched Memos, Tags Moved
class C131240_MoveMemo_MovedandUntouchedMemos_TagsMoved
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
        Action58123c20fa4ee77809f468f6("Username Email":/bi.adminuser1@brightidea.com/.toString(),"Licensing Model":/Standard Licensing Model/.toString(),"Brightidea Administrator License Type Purchased Count":/2/.toString(),"Idea Box Manager License Type Purchased Count":/2/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString(),"Activities":true)
        //Use this action to enable Memo Updates in System Manager Affiliates
        Action6388ddf31dac76f4246846d6([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Memo Webstorm
        new actions.WebstormCreation.CreateMemoWebstorm().run("Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/MemoDestination/.toString(),"Description":/Test Description/.toString(),"Vanity URL":/MemoDestination/.toString(),"Action on Design Tab":/Continue/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"General Access":/ALL/.toString(),"General Access Add or Remove":/Add/.toString(),"Pipeline Administrators":/Pipeline Admin,System Admin/.toString(),"Administrators Add or Remove":/Add,Remove/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Memo Webstorm
        new actions.WebstormCreation.CreateMemoWebstorm().run("Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/MemoSource/.toString(),"Description":/Test Description/.toString(),"Vanity URL":/MemoSource/.toString(),"Action on Design Tab":/Continue/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"General Access":/ALL/.toString(),"General Access Add or Remove":/Add/.toString(),"Pipeline Administrators":/Pipeline Admin,System Admin/.toString(),"Administrators Add or Remove":/Add,Remove/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("Area to Navigate to":/Memo Team Site/.toString(),"Memo Team Site Link":/MemoSource/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Memos/.toString())
        //Set Memo Template Tile
        new actions.MTS.SetMemoTemplateTile().run("Template":/Blank Document/.toString())
        //Collab Editor -  Set ToolBar Options
        new actions.Memo.CollabEditorSetToolBarOptions().run("Text Font":/Lato/.toString(),"Font Size":/20/.toString(),"Bold, Italic, Underlined etc":/Bold/.toString(),"Hex Font Color":/E74C3C/.toString(),"Hex Color for Font Highlight":/F1C40F/.toString())
        //Collab Editor -  Set ToolBar Options
        new actions.Memo.CollabEditorSetToolBarOptions().run("Text Font":/Lato/.toString())
        //Collab Editor - Set Text
        new actions.Memo.ColabEditorSetText().run("Text":/Memo has been successfully moved!/.toString())
        //Collab Editor -  Set ToolBar Options
        new actions.Memo.CollabEditorSetToolBarOptions().run("Insert Image":true)
        //Set Change Background or Other Modal Tab
        new actions.WebstormHomepage.SetChangeBackgroundmodal().run("Tab":/Upload/.toString())
        //Set Upload your Own Background
        new actions.WebstormHomepage.SetUploadyourOwnBackground().run("Choose File":/Image3.jpg/.toString(),"Wait for Image to load":true,"Action":/Add Image/.toString())
        //Collab Editor - Set Memo Title
        new actions.Memo.ColabEditorSetMemoTitle().run("New Title":/My Memo To Move/.toString(),"Action":/Submit/.toString())
        //Collab Editor/Userhome/MTS - Set Submit to Batch
        new actions.Memo.CollabEditorSetSubmitToBatch().run("Via Button or Dropdown?":/Button/.toString(),"Select batch":/MemoSource/.toString(),"Action":/Submit/.toString())
        //Collab Editor - Click Go Back Button
        new actions.Memo.ColabEditorClickGoBackButton().run([:])
        //Set Memo Template Tile
        new actions.MTS.SetMemoTemplateTile().run("Template":/Blank Document/.toString())
        //Collab Editor - Set Memo Title
        new actions.Memo.ColabEditorSetMemoTitle().run("New Title":/My Memo Stays Here/.toString(),"Action":/Submit/.toString())
        //Collab Editor -  Set ToolBar Options
        new actions.Memo.CollabEditorSetToolBarOptions().run("Text Font":/Roboto/.toString(),"Font Size":/24/.toString(),"Bold, Italic, Underlined etc":/Italic/.toString(),"Hex Font Color":/3498DB/.toString(),"Hex Color for Font Highlight":/9B59B6/.toString())
        //Collab Editor -  Set ToolBar Options
        new actions.Memo.CollabEditorSetToolBarOptions().run("Text Font":/Roboto/.toString())
        //Collab Editor - Set Text
        new actions.Memo.ColabEditorSetText().run("Text":/My data stays the same when other memos being moved/.toString())
        //Collab Editor/Userhome/MTS - Set Submit to Batch
        new actions.Memo.CollabEditorSetSubmitToBatch().run("Via Button or Dropdown?":/Button/.toString(),"Select batch":/MemoSource/.toString(),"Action":/Submit/.toString())
        //Collab Editor - Click Go Back Button
        new actions.Memo.ColabEditorClickGoBackButton().run([:])
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/pipelineadmin@test.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("Area to Navigate to":/Memo Team Site/.toString(),"Memo Team Site Link":/MemoSource/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Pipeline/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/1/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/My Memo Stays Here/.toString())
        //Add Admin Idea Tag in Pipeline Steps page
        new actions.PipelineStepsView.AddAdminIdeaTaginPipelineStepspage().run("Tag Name":/testadmintagstay/.toString(),"Tag Add or Remove":/Add/.toString(),"Action":/Add Admin Tags/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/My Memo Stays Here/.toString())
        //Add Idea Tag in Pipeline Steps page
        new actions.PipelineStepsView.AddIdeaTaginPipelineStepspage().run("Tag Name":/testtagstay/.toString(),"Tag Add or Remove":/Add/.toString(),"Action":/Add Tags/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/My Memo To Move/.toString())
        //Add Admin Idea Tag in Pipeline Steps page
        new actions.PipelineStepsView.AddAdminIdeaTaginPipelineStepspage().run("Tag Name":/testadmintagmove/.toString(),"Tag Add or Remove":/Add/.toString(),"Action":/Add Admin Tags/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/My Memo To Move/.toString())
        //Add Idea Tag in Pipeline Steps page
        new actions.PipelineStepsView.AddIdeaTaginPipelineStepspage().run("Tag Name":/testtagmove/.toString(),"Tag Add or Remove":/Add/.toString(),"Action":/Add Tags/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/My Memo To Move/.toString())
        //Set New Move Ideas in Pipeline Steps page
        new actions.PipelineStepsView.NewMoveIdeasinPipelineStepspage().run("Move To Pipeline":/MemoDestination/.toString(),"Category":/Strategic Initiative/.toString(),"Status":/In-flight 🔥/.toString(),"Action":/Move Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/MemoDestination/.toString(),"Area to Navigate to":/Memo Idea Boards/.toString(),"Memo Team Site Link":"")
        //Set Tab/View on Idea Board
        new actions.IdeaBoard.NavigatetoIdeaBoardsView().run("View":/Gallery/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/My Memo To Move/.toString())
        //Verify Idea on View Idea 30
        new actions.ViewIdea30.VerifyIdeaonViewIdea3().run("Template":/Memo Record/.toString(),"View As":/Admin/.toString(),"Idea Name":/My Memo To Move(D111)/.toString(),"Category":/Strategic Initiative/.toString(),"Status":/In-flight/.toString(),"Tag":/testtagstay,testtagmove/.toString(),"Tag Should Exist":/FALSE,TRUE/.toString(),"Admin Tag":/testadmintagstay,testadmintagmove/.toString(),"Admin Tag Should Exist":/FALSE,TRUE/.toString(),"Owner":/System Admin/.toString())
        //Memo in VI3 - Verify Memo
        new actions.Memo.VerifyMemoInMemoTabVI3().run("Title":/My Memo To Move/.toString(),"Submitter":/System Admin/.toString(),"Memo Icon":true,"Thumbnail":true)
        //Memo in Userhome/VI3 - Set Memo Ellipse Dropdown or Open Document
        new actions.Memo.SetEllipseDropdownForMemo().run("Memo Title (Required)":/My Memo To Move/.toString(),"Click Ellipse Menu":true,"Menu Item":/Open/.toString())
        //Collab Editor - Verify Text
        new actions.Memo.CollabEditorVerifyText().run("Expected Text":/Memo has been successfully moved!/.toString(),"Text Font":/lato/.toString(),"Font Size":/20/.toString(),"Font Style":/normal/.toString(),"Font Weight":/bold/.toString(),"Font Color":/rgb(231,76,60)/.toString())
        //Collab Editor - Verify Image
        new actions.Memo.CollabEditorVerifyImage().run("Should Image Exist":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/MemoSource/.toString(),"Area to Navigate to":/Memo Idea Boards/.toString())
        //Set Tab/View on Idea Board
        new actions.IdeaBoard.NavigatetoIdeaBoardsView().run("View":/Gallery/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/My Memo Stays Here/.toString(),"Status":/Incubate 🐣/.toString())
        //Verify Idea on View Idea 30
        new actions.ViewIdea30.VerifyIdeaonViewIdea3().run("Template":/Memo Record/.toString(),"View As":/Admin/.toString(),"Idea Name":/My Memo Stays Here(D112)/.toString(),"Category":/Quick Add/.toString(),"Status":/Incubate/.toString(),"Tag":/testtagmove,testtagstay/.toString(),"Tag Should Exist":/FALSE,TRUE/.toString(),"Admin Tag":/testadmintagmove,testadmintagstay/.toString(),"Admin Tag Should Exist":/FALSE,TRUE/.toString(),"Owner":/System Admin/.toString())
        //Memo in VI3 - Verify Memo
        new actions.Memo.VerifyMemoInMemoTabVI3().run("Title":/My Memo Stays Here/.toString(),"Submitter":/System Admin/.toString(),"Memo Icon":true,"Thumbnail":true)
        //Memo in Userhome/VI3 - Set Memo Ellipse Dropdown or Open Document
        new actions.Memo.SetEllipseDropdownForMemo().run("Memo Title (Required)":/My Memo Stays Here/.toString(),"Click Ellipse Menu":true,"Menu Item":/Open/.toString())
        //Collab Editor - Verify Text
        new actions.Memo.CollabEditorVerifyText().run("Expected Text":/My data stays the same when other memos being moved/.toString(),"Text Font":/roboto/.toString(),"Font Size":/24/.toString(),"Font Style":/italic/.toString(),"Font Color":/rgb(52,152,219)/.toString())
        //Collab Editor - Verify Image
        new actions.Memo.CollabEditorVerifyImage().run("Should Image Exist":false)
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
    //Use this action to enable Memo Updates in System Manager Affiliates
    public static def Action6388ddf31dac76f4246846d6(def params){
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for BIOnly Beta tab
        new actions.SetupBI.SetEnterpriseSetupforBIOnlyBetatab().run("Enable memos on Userhome":true,"Create Memo Wizard":true,"Memo BI Templates":true,"Show Memo tab in system setup":true,"Memo AI, Content Updates":true)
        //Wait
        new actions.general.Wait().run("Seconds":/15/.toString())

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