import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131688 - WB on VI3 > Whiteboard Menu Options - Submitter Can Access, End User, Analyst Cannot
class C131688_WBonVI3_WhiteboardMenuOptions_SubmitterCanAccess_EndUser_AnalystCannot
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
        //Delete this Action when View Idea 30 is Enabled
        Action6018a1600aed291c14413fd2([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for BIOnly Beta tab
        new actions.SetupBI.SetEnterpriseSetupforBIOnlyBetatab().run("Whiteboard on View Idea 3.0":true,"Whiteboard on Submission Form":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/test/.toString(),"Description":/test/.toString(),"Category":/New Product/.toString(),"Required Short Question":/short/.toString(),"Action":/Submit Idea/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test/.toString())
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Access Idea":/test/.toString())
        //Set Widget Controller
        new actions.Widgets.SetWidgetController().run("Widget Edit Mode":/Enable/.toString())
        //Drag Widget Onto View Idea 3
        new actions.ViewIdea30.DragWidgetOnViewIdea3().run("Widget Title":/Whiteboard/.toString(),"Above What Existing Widget":/Status/.toString())
        //Set Widget Controller
        new actions.Widgets.SetWidgetController().run("Widget Edit Mode":/Disable/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Create Whiteboard or Edit Template
        new actions.Whiteboards.CreateWhiteboardFromUserhome().run("Create New or Choose Template":/New Blank Whiteboard/.toString())
        //Set Whiteboard Title
        new actions.Whiteboards.EditTitleOfWhiteboard().run("Title":/EU1 Whiteboard - 1/.toString(),"Action":/Submit/.toString())
        //Copy Current URL
        variables."whiteboardURL" = new actions.selenium.CopyCurrentURL().run([:])
        //Go Back From Whiteboard
        new actions.Whiteboards.GoBackFromWhiteboard().run([:])
        //Create Whiteboard or Edit Template
        new actions.Whiteboards.CreateWhiteboardFromUserhome().run("Create New or Choose Template":/New Blank Whiteboard/.toString())
        //Set Whiteboard Title
        new actions.Whiteboards.EditTitleOfWhiteboard().run("Title":/EU1 Whiteboard - 2/.toString(),"Action":/Submit/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/Idea With Whiteboard/.toString(),"Submitter":/Team/.toString(),"Submitter Team User":/End User 2/.toString(),"Submitter Team User Add or Remove":/Add/.toString(),"Description":/description/.toString(),"Category":/Operations/.toString(),"Required Short Question":/short/.toString(),"Action":/Submit Idea/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Idea With Whiteboard/.toString())
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Access Idea":/Idea With Whiteboard/.toString())
        //Set Whiteboard Widget on View Idea 3
        new actions.ViewIdea30.SetWhiteboardOnViewIdea3().run("Add Whiteboard":true,"Whiteboard Title":/EU1 Whiteboard - 1/.toString(),"Action":/Submit/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Set Whiteboard Widget on View Idea 3
        new actions.ViewIdea30.SetWhiteboardOnViewIdea3().run("Menu Option":/Remove Whiteboard/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Set Whiteboard Widget on View Idea 3
        new actions.ViewIdea30.SetWhiteboardOnViewIdea3().run("Add Whiteboard":true,"Whiteboard Title":/EU1 Whiteboard - 2/.toString(),"Action":/Submit/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Set Whiteboard Widget on View Idea 3
        new actions.ViewIdea30.SetWhiteboardOnViewIdea3().run("Menu Option":/Open Whiteboard/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Window Name":/EU1 Whiteboard - 2 - Whiteboard/.toString())
        //Verify Whiteboard Title
        new actions.Whiteboards.VerifyWhiteboardTitle().run("Title":/EU1 Whiteboard - 2/.toString())
        //Go Back From Whiteboard
        new actions.Whiteboards.GoBackFromWhiteboard().run([:])
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser2@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."whiteboardURL"}/.toString())
        //Go Back From Whiteboard
        new actions.Whiteboards.GoBackFromWhiteboard().run([:])
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Idea With Whiteboard/.toString())
        //Set Whiteboard Widget on View Idea 3
        new actions.ViewIdea30.SetWhiteboardOnViewIdea3().run("Menu Option":/Remove Whiteboard/.toString())
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Access Idea":/Idea With Whiteboard/.toString())
        //Set Whiteboard Widget on View Idea 3
        new actions.ViewIdea30.SetWhiteboardOnViewIdea3().run("Add Whiteboard":true,"Whiteboard Title":/EU1 Whiteboard - 1/.toString(),"Action":/Submit/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Set Whiteboard Widget on View Idea 3
        new actions.ViewIdea30.SetWhiteboardOnViewIdea3().run("Menu Option":/Open Whiteboard/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Window Name":/EU1 Whiteboard - 1 - Whiteboard/.toString())
        //Verify Whiteboard Title
        new actions.Whiteboards.VerifyWhiteboardTitle().run("Title":/EU1 Whiteboard - 1/.toString())
        //Go Back From Whiteboard
        new actions.Whiteboards.GoBackFromWhiteboard().run([:])
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/${variables."TCData.User"}/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Idea With Whiteboard/.toString())
        try{
            //Set Whiteboard Widget on View Idea 3
            new actions.ViewIdea30.SetWhiteboardOnViewIdea3().run("Menu Option":/Remove Whiteboard/.toString())
        }
       catch(all){}catch(Error err){}
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Access Idea":/Idea With Whiteboard/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/DIV[contains(@class,'f-component')]\/\/SPAN[contains(@class,'f-component-title') and starts-with(.,'Whiteboard')]\/..\/DIV[contains(@class,'f-whiteboard-container')]/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Window Name":/EU1 Whiteboard - 1 - Whiteboard/.toString())
        //Verify Whiteboard Title
        new actions.Whiteboards.VerifyWhiteboardTitle().run("Title":/EU1 Whiteboard - 1/.toString())
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
    //Delete this Action when View Idea 30 is Enabled
    public static def Action6018a1600aed291c14413fd2(def params){
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Ideas tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforIdeastab().run("View Idea 3.0":true,"Business impact tab":true)

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