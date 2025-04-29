import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132172 - Stage > Add Submit stage prompt to Multiple Tasks pages
class C132172_Stage_AddSubmitstageprompttoMultipleTaskspages
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
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString(),"Activities":true,"My Ideas":true,"Submissions":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Select Product in Apps Pillar Page
        new actions.AppsPillar.SelectProductinAppsPillarPage().run("Product":/Ecosystem/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Venture/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Venture title/.toString(),"Description":/Venture description/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Project Room - Create Project Room
        new actions.ProjectRoom.ProjectRoomCreateProjectRoom().run([:])
        //Set and Verify Project Room Title
        new actions.ProjectRoom.SetProjectRoomTitle().run("Title":/Testing project room/.toString(),"Action":/Submit/.toString())
        //Set Edit Menu for Room Pages in Project Room
        new actions.ProjectRoom.SetEditMenuforRoomPagesinProjectRoom().run("Room Page":/Tasks/.toString(),"Menu Options":/Rename/.toString(),"Placement Number Of Folder or Page":/1/.toString())
        //Set Rename Page in Project Room
        new actions.ProjectRoom.SetRenamePageinProjectRoom().run("New Page Name":/Task1/.toString(),"Action":/Rename Tasks/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Placement Number Of Folder Name":/2/.toString(),"Type of Room Page":/Tasks/.toString())
        //Set Edit Menu for Room Pages in Project Room
        new actions.ProjectRoom.SetEditMenuforRoomPagesinProjectRoom().run("Room Page":/Tasks/.toString(),"Menu Options":/Rename/.toString(),"Placement Number Of Folder or Page":/2/.toString())
        //Set Rename Page in Project Room
        new actions.ProjectRoom.SetRenamePageinProjectRoom().run("New Page Name":/Task2/.toString(),"Action":/Rename Tasks/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Placement Number Of Folder Name":/3/.toString(),"Type of Room Page":/Tasks/.toString())
        //Set Edit Menu for Room Pages in Project Room
        new actions.ProjectRoom.SetEditMenuforRoomPagesinProjectRoom().run("Room Page":/Tasks/.toString(),"Menu Options":/Rename/.toString(),"Placement Number Of Folder or Page":/3/.toString())
        //Set Rename Page in Project Room
        new actions.ProjectRoom.SetRenamePageinProjectRoom().run("New Page Name":/Task3/.toString(),"Action":/Rename Tasks/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Stage/.toString())
        //Set Stage or Gate Name in Project Room
        new actions.ProjectRoom.SetStageorGateNameinProjectRoom().run("Stage or Gate Name":/Stage1/.toString(),"Action":/Add Stage/.toString())
        //Drag and Drop Left Panel Items in Project Room
        new actions.ProjectRoom.DragDropLeftPanelItemsProjectRoom().run("Item to Drag":/Task1/.toString(),"Or Folder Name":/Stage1/.toString())
        //Drag and Drop Left Panel Items in Project Room
        new actions.ProjectRoom.DragDropLeftPanelItemsProjectRoom().run("Item to Drag":/Task2/.toString(),"Or Folder Name":/Stage1/.toString())
        //Drag and Drop Left Panel Items in Project Room
        new actions.ProjectRoom.DragDropLeftPanelItemsProjectRoom().run("Item to Drag":/Task3/.toString(),"Or Folder Name":/Stage1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Venture title/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Create Step in Pipeline Steps page
        new actions.PipelineStepsView.CreateStepinPipelineStepspage().run("Step Name":/Stage1/.toString(),"Select Tool Type":/Stage/.toString(),"Action":/Create/.toString())
        //Configure Stage Process Step in Pipeline Steps Page
        new actions.PipelineStepsConfigure.ConfigureStageProcessStepinPipelineStepsPage().run("Assignment Method":/Individual Assignment/.toString(),"Stage Lead":/Select a user/.toString(),"Stage Team":/End User/.toString(),"Stage Team Add or Remove":/Add/.toString(),"Selected user":/Evaluator/.toString(),"Selected Users Add or Remove":/Add/.toString(),"Project Room Template":/Testing project room/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/1/.toString())
        //Set Project Room Templates for Stage Gate or Onboarding
        new actions.PipelineSetup.SetProjectRoomTemplates().run("Tab":/Stage Gate/.toString(),"Template Name":/Testing project room/.toString(),"Action":/Select Project Room/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/0/.toString())
        //Configure Stage Process Step in Pipeline Steps Page
        new actions.PipelineStepsConfigure.ConfigureStageProcessStepinPipelineStepsPage().run("Click on Refresh":true,"Folder mapping":/Stage1/.toString(),"Action":/Activate/.toString())
        //Set Quick Add Memo or Idea
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/Idea1/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Idea1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Stage1/.toString(),"Action":/Change Step/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/evaluator@test.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Verify and Access Project Room Card in Userhome
        new actions.ProjectRoom.VerifyProjectRoomCard().run("Title":/Idea1/.toString(),"Number of Matches":/1/.toString(),"Access Project Room":true)
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Top Link":/Project Room Settings/.toString())
        //Set Tab in Room Settings in Project Room
        new actions.ProjectRoom.SetTabinRoomSettingsinProjectRoom().run("Tab":/Members/.toString())
        //Set Members in Project Room
        new actions.ProjectRoom.SetMembersinProjectRoom().run("Member":/System Admin,Moderator/.toString(),"Member Add or Remove":/Add,Add/.toString())
        //Edit or Remove Team Member in Project Room
        new actions.ProjectRoom.EditorRemoveTeamMemberinProjectRoom().run("Member(s)":/System Admin/.toString(),"Option(s)":/owner/.toString())
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Room Item":/Task3/.toString())
        //Set Stage Process Action Item
        new actions.ProjectRoom.SetStageProcessActionItem().run("Action on Submit stage action item":/Submit Stage/.toString(),"Is the Button Active":true)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Stage Submitted/.toString(),"Should Exist":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Verify and Access Project Room Card in Userhome
        new actions.ProjectRoom.VerifyProjectRoomCard().run("Title":/Idea1/.toString(),"Number of Matches":/1/.toString(),"Access Project Room":true)
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Room Item":/Task2/.toString())
        //Set Stage Process Action Item
        new actions.ProjectRoom.SetStageProcessActionItem().run("Is the Button Active":false)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Mark Stage as Complete/.toString(),"Should Exist":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Verify and Access Project Room Card in Userhome
        new actions.ProjectRoom.VerifyProjectRoomCard().run("Title":/Idea1/.toString(),"Number of Matches":/1/.toString(),"Access Project Room":true)
        //Set Edit Menu for Room Pages in Project Room
        new actions.ProjectRoom.SetEditMenuforRoomPagesinProjectRoom().run("Room Page":/Task3/.toString(),"Parent Folder Name if the Folder to edit Page is Child Folder":/Stage1/.toString(),"Menu Options":/Add to My Favorites/.toString(),"Placement Number Of Folder or Page":/3/.toString())
        //Verify Room Page In Favorites Tab In Project Room
        new actions.ProjectRoom.VerifyRoomPageInFavoritesTabInProjectRoom().run("Room Page":/Task3/.toString(),"Access Page":true)
        //Set Stage Process Action Item
        new actions.ProjectRoom.SetStageProcessActionItem().run("Action on Submit stage action item":/Submit Stage/.toString(),"Is the Button Active":true)
        //Set Stage Process Action Item
        new actions.ProjectRoom.SetStageProcessActionItem().run("Is the Button Active":false)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Stage Submitted/.toString(),"Should Exist":true)
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