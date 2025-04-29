import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131243 - Move Memo - Keep Visibility Setting in Destination Pipeline
class C131243_MoveMemo_KeepVisibilitySettinginDestinationPipeline
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Unlimited Brightidea Administrator License Type":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString(),"Activities":true)
        //Use this action to enable Memo Updates in System Manager Affiliates
        Action6388ddf31dac76f4246846d6([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Memo Webstorm
        new actions.WebstormCreation.CreateMemoWebstorm().run("Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/MemoDestination/.toString(),"Description":/Test Description/.toString(),"Vanity URL":/MemoDestination/.toString(),"Action on Design Tab":/Continue/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"General Access":/ALL/.toString(),"General Access Add or Remove":/Add/.toString(),"Admin Field Name":/Pipeline Administrators/.toString(),"Pipeline Administrators":/Pipeline Admin,System Admin/.toString(),"Administrators Add or Remove":/Add,Remove/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Memo Webstorm
        new actions.WebstormCreation.CreateMemoWebstorm().run("Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/MemoSource/.toString(),"Description":/Test Description/.toString(),"Vanity URL":/MemoSource/.toString(),"Action on Design Tab":/Continue/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"General Access":/ALL/.toString(),"General Access Add or Remove":/Add/.toString(),"Admin Field Name":/Pipeline Administrators/.toString(),"Pipeline Administrators":/Pipeline Admin,System Admin/.toString(),"Administrators Add or Remove":/Add,Remove/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Memos/.toString())
        //Set Memo Template Tile
        new actions.MTS.SetMemoTemplateTile().run("Template":/Blank Document/.toString())
        //Collab Editor - Set Memo Title
        new actions.Memo.ColabEditorSetMemoTitle().run("New Title":/My Memo To Move/.toString(),"Action":/Submit/.toString())
        //Collab Editor/Userhome/MTS - Set Submit to Batch
        new actions.Memo.CollabEditorSetSubmitToBatch().run("Via Button or Dropdown?":/Button/.toString(),"Select batch":/MemoSource/.toString(),"Action":/Submit/.toString())
        //Collab Editor - Click Go Back Button
        new actions.Memo.ColabEditorClickGoBackButton().run([:])
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Pipeline/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/1/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/My Memo To Move/.toString())
        //Change Idea Visibility in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaVisibilityinPipelineStepspage().run("Visibility":/Hidden/.toString(),"Action":/Change Visibility/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/My Memo To Move/.toString())
        //Set New Move Ideas in Pipeline Steps page
        new actions.PipelineStepsView.NewMoveIdeasinPipelineStepspage().run("Move To Pipeline":/MemoDestination/.toString(),"Category":/Strategic Initiative/.toString(),"Status":/In-flight 🔥/.toString(),"Action":/Move Idea/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/MemoDestination\/boards/.toString())
        //Verify Idea in Pipeline Steps View for End Users
        new actions.IdeaBoard.VerifyIdeainPipelineStepsViewforEndUsers().run("Idea Name":/My Memo To Move/.toString(),"Number of Matches":/0/.toString())
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