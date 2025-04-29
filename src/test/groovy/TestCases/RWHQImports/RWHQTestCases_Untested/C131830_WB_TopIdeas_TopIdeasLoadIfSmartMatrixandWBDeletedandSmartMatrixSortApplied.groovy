import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131830 - WB - Top Ideas > Top Ideas Load If Smart Matrix and WB Deleted and Smart Matrix Sort Applied
class C131830_WB_TopIdeas_TopIdeasLoadIfSmartMatrixandWBDeletedandSmartMatrixSortApplied
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
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Whiteboards/.toString())
        //Create Whiteboard or Edit Template
        new actions.Whiteboards.CreateWhiteboardFromUserhome().run("Create New or Choose Template":/New Blank Whiteboard/.toString())
        //Set Whiteboard Title
        new actions.Whiteboards.EditTitleOfWhiteboard().run("Title":/C131830/.toString(),"Action":/Submit/.toString())
        //Go Back From Whiteboard
        new actions.Whiteboards.GoBackFromWhiteboard().run([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Apply Filter on Apps Pillar 2.0
        new actions.AppsPillar.ApplyFilterAppsPillar20().run("Filter Option":/Programs/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Hackathon/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Hack/.toString(),"Description":/Hack Event description/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Action":/Create/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Disable Scheduler
        new actions.SetupScheduler.SetDisableScheduler().run("Status":/Active/.toString(),"Enable Submission":true,"Action":/Disable Schedule/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Top Ideas/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/test idea1/.toString(),"Category":/Theme 1/.toString(),"Action":/Submit/.toString())
        //Select Idea(s) In Top Ideas
        new actions.PipelineTopIdeas.SelectIdeasInTopIdeas().run("Idea Title(s)":["test idea1"])
        //Right Click on Idea in Top Ideas
        new actions.PipelineTopIdeas.RightClickOnIdeaInTopIdeas().run("Idea Title":/test idea1/.toString())
        //Send Idea(s) to Whiteboard/Smart Matrix from Pipeline Steps/List View
        new actions.Whiteboards.SendIdeaToWhiteboardFromPipelineSteps().run("Send to Whiteboard or Smart Matrix":/Send to Smart Matrix/.toString(),"Existing Whiteboard or New Whiteboard":/Existing Whiteboard/.toString(),"Whiteboard Title":/C131830/.toString(),"Format":/Stickies/.toString(),"Smart Matrix Name":/from Top Ideas/.toString(),"Action":/Send/.toString())
        //Verify Toast Message for Linking and Unlinking Pipeline
        new actions.Whiteboards.VerifyToastMessageforLinkingandUnlinkingPipeline().run("Message":/The selected ideas were sent successfully to the whiteboard: C131830/.toString(),"Click on Idea Code":true)
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/1/.toString())
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
        new actions.Whiteboards.ClickOnWhiteboardCanvas().run("X coordinate":/-110/.toString(),"Y coordinate":/40/.toString(),"Single Double or Right Click":/Single Click/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/2/.toString())
        //Set Marker or Move Tool in Whiteboard
        new actions.Whiteboards.SetMarkerToolToWhiteboard().run("X coordinate1":/0/.toString(),"Y coordinate1":/0/.toString(),"X coordinate2":/300/.toString(),"Y coordinate2":/345/.toString(),"X coordinate3":/5/.toString(),"Y coordinate3":/5/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Set Right Click on Smart Matrix
        new actions.Whiteboards.SetRightClickonSmartMatrix().run("X Coordinate":/-30/.toString(),"Y Coordinate":/-30/.toString(),"Menu Option":/Go to Top Ideas/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/2/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Set Sort in Top Ideas
        new actions.PipelineTopIdeas.SetSortInTopIdeas().run("Sort By":/Smart Matrix (from Top Ideas)/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/1/.toString())
        //Set Right Click on Smart Matrix
        new actions.Whiteboards.SetRightClickonSmartMatrix().run("X Coordinate":/0/.toString(),"Y Coordinate":/0/.toString(),"Menu Option":/Remove Smart Matrix/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/2/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/test idea1/.toString(),"Stack Name Memo belongs to":/Theme 1/.toString(),"Score":/1/.toString(),"Number of Matches":/1/.toString())
        //Select Idea(s) In Top Ideas
        new actions.PipelineTopIdeas.SelectIdeasInTopIdeas().run("Idea Title(s)":["test idea1"])
        //Right Click on Idea in Top Ideas
        new actions.PipelineTopIdeas.RightClickOnIdeaInTopIdeas().run("Idea Title":/test idea1/.toString())
        //Send Idea(s) to Whiteboard/Smart Matrix from Pipeline Steps/List View
        new actions.Whiteboards.SendIdeaToWhiteboardFromPipelineSteps().run("Send to Whiteboard or Smart Matrix":/Send to Smart Matrix/.toString(),"Existing Whiteboard or New Whiteboard":/New Whiteboard/.toString(),"Whiteboard Title":/C131830 delete/.toString(),"Format":/Stickies/.toString(),"Smart Matrix Name":/from Top Ideas2/.toString(),"Action":/Send/.toString())
        //Verify Toast Message for Linking and Unlinking Pipeline
        new actions.Whiteboards.VerifyToastMessageforLinkingandUnlinkingPipeline().run("Message":/The selected ideas were sent successfully to the whiteboard: C131830 delete/.toString(),"Click on Idea Code":true)
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/3/.toString())
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
        new actions.Whiteboards.ClickOnWhiteboardCanvas().run("X coordinate":/-115/.toString(),"Y coordinate":/30/.toString(),"Single Double or Right Click":/Single Click/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/2/.toString())
        //Set Marker or Move Tool in Whiteboard
        new actions.Whiteboards.SetMarkerToolToWhiteboard().run("X coordinate1":/0/.toString(),"Y coordinate1":/0/.toString(),"X coordinate2":/300/.toString(),"Y coordinate2":/345/.toString(),"X coordinate3":/5/.toString(),"Y coordinate3":/5/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Set Right Click on Smart Matrix
        new actions.Whiteboards.SetRightClickonSmartMatrix().run("X Coordinate":/-30/.toString(),"Y Coordinate":/-30/.toString(),"Menu Option":/Go to Top Ideas/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/4/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/4/.toString())
        //Set Sort in Top Ideas
        new actions.PipelineTopIdeas.SetSortInTopIdeas().run("Sort By":/Smart Matrix (from Top Ideas2)/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/3/.toString())
        //Set Whiteboard Top Bar
        new actions.Whiteboards.SetWhiteboardMenuDropdowninTopBar().run("Menu Option":/Edit/.toString(),"Sub Option":/Delete.../.toString(),"Delete Modal Action":/Submit/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/4/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Verify Idea in Top Ideas
        new actions.Memo.VerifyMemoinTopIdeas().run("Title":/test idea1/.toString(),"Stack Name Memo belongs to":/Theme 1/.toString(),"Score":/1/.toString(),"Number of Matches":/1/.toString())
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