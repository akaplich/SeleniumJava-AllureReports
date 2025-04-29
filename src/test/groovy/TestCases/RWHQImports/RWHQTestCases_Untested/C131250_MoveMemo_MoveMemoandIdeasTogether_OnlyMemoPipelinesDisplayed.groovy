import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131250 - Move Memo - Move Memo and Ideas Together, Only Memo Pipelines Displayed
class C131250_MoveMemo_MoveMemoandIdeasTogether_OnlyMemoPipelinesDisplayed
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
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/MemoSource\/submit/.toString())
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Idea Title Question - Title":/Title/.toString(),"Idea Title Question - Value":/Move Idea Test/.toString(),"Description Question - Title":/Description/.toString(),"Description Question - Value":/Description Move Idea Test/.toString(),"Idea Attachment Question - Title":/Attachments/.toString(),"Idea Attachment Question - Value":/Image5.jpg/.toString(),"Idea Attachment Add or Remove":/Add/.toString(),"Tags Question - Title":/Tags/.toString(),"Tags Question - Value":/testtag/.toString(),"Tag Add or Remove":/Add/.toString(),"Category Question - Title":/Category/.toString(),"Category Question - Value":/Process Improvement/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/MemoSource/.toString(),"Area to Navigate to":/Home/.toString())
        //Verify and Set MTS tab on homepage
        new actions.MTS.SetMTStabonhomepage().run("Heading":/MY STUFF/.toString(),"Tabs":/Memos/.toString(),"Should User Click on Tab":true)
        //Set Memo Template Tile
        new actions.MTS.SetMemoTemplateTile().run("Template":/Blank Document/.toString())
        //Collab Editor - Set Text
        new actions.Memo.ColabEditorSetText().run("Text":/Memo has been successfully moved!/.toString())
        //Collab Editor - Set Memo Title
        new actions.Memo.ColabEditorSetMemoTitle().run("New Title":/My Memo To Move/.toString(),"Action":/Submit/.toString())
        //Collab Editor/Userhome/MTS - Set Submit to Batch
        new actions.Memo.CollabEditorSetSubmitToBatch().run("Via Button or Dropdown?":/Button/.toString(),"Select batch":/MemoSource/.toString(),"Action":/Submit/.toString())
        //Collab Editor - Click Go Back Button
        new actions.Memo.ColabEditorClickGoBackButton().run([:])
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/MemoSource/.toString(),"Area to Navigate to":/Memo Idea Boards/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/List/.toString())
        //Select Ideas in Pipeline List View
        new actions.PipelineList.SelectIdeasPipelineListView().run("Idea Title(s)":/My Memo To Move,Move Idea Test/.toString())
        try{
            //Set New Move Ideas in Pipeline Steps page
            new actions.PipelineStepsView.NewMoveIdeasinPipelineStepspage().run("Move To Pipeline":/Custom App/.toString(),"Category":/New Product/.toString(),"Status":/Submitted/.toString(),"Action":/Move Idea/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/*[@id='f-combobox-list']\/*[text()='Custom App']/.toString(),"Should Element Exist":false)
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Select Ideas in Pipeline List View
        new actions.PipelineList.SelectIdeasPipelineListView().run("Idea Title(s)":/My Memo To Move,Move Idea Test/.toString())
        //Set New Move Ideas in Pipeline Steps page
        new actions.PipelineStepsView.NewMoveIdeasinPipelineStepspage().run("Move To Pipeline":/MemoDestination/.toString(),"Category":/Strategic Initiative/.toString(),"Status":/In-flight 🔥/.toString(),"Action":/Move Idea/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/MemoDestination\/boards/.toString())
        //Set Tab/View on Idea Board
        new actions.IdeaBoard.NavigatetoIdeaBoardsView().run("View":/Gallery/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/My Memo To Move/.toString())
        //Verify Idea on View Idea 30
        new actions.ViewIdea30.VerifyIdeaonViewIdea3().run("Template":/Memo Record/.toString(),"View As":/Admin/.toString(),"Idea Name":/My Memo To Move(D112)/.toString(),"Category":/Strategic Initiative/.toString(),"Status":/In-flight/.toString(),"Tag":/testtag/.toString(),"Tag Should Exist":/FALSE/.toString(),"Owner":/System Admin/.toString())
        //Memo in VI3 - Verify Memo
        new actions.Memo.VerifyMemoInMemoTabVI3().run("Title":/My Memo To Move/.toString(),"Submitter":/System Admin/.toString(),"Memo Icon":true,"Thumbnail":true)
        //Memo in Userhome/VI3 - Set Memo Ellipse Dropdown or Open Document
        new actions.Memo.SetEllipseDropdownForMemo().run("Memo Title (Required)":/My Memo To Move/.toString(),"Click Ellipse Menu":true,"Menu Item":/Open/.toString())
        //Collab Editor - Verify Text
        new actions.Memo.CollabEditorVerifyText().run("Expected Text":/Memo has been successfully moved!/.toString())
        //Collab Editor - Click Go Back Button
        new actions.Memo.ColabEditorClickGoBackButton().run([:])
        //Set Tab/View on Idea Board
        new actions.IdeaBoard.NavigatetoIdeaBoardsView().run("View":/Gallery/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Move Idea Test/.toString())
        //Verify Idea on View Idea 30
        new actions.ViewIdea30.VerifyIdeaonViewIdea3().run("Template":/Memo Record/.toString(),"View As":/Admin/.toString(),"Idea Name":/Move Idea Test(D111)/.toString(),"Category":/Strategic Initiative/.toString(),"Status":/In-flight/.toString(),"Owner":/Unassigned/.toString())
        //Memo in VI3 - Verify Memo
        new actions.Memo.VerifyMemoInMemoTabVI3().run("Title":/Move Idea Test/.toString(),"Submitter":/System Admin/.toString(),"Memo Icon":true,"Thumbnail":true,"Should Exist":false)
        //Memo in VI3 - Verify Memo
        new actions.Memo.VerifyMemoInMemoTabVI3().run("Empty State":true)
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