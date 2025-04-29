import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131900 - Project Room > Add Whiteboard To Favorites, Stays After Refresh
class C131900_ProjectRoom_AddWhiteboardToFavorites_StaysAfterRefresh
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
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString(),"Activities":true,"My Ideas":true,"Submissions":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Whiteboards/.toString())
        //Create Whiteboard or Edit Template
        new actions.Whiteboards.CreateWhiteboardFromUserhome().run("Create New or Choose Template":/New Blank Whiteboard/.toString())
        //Set Whiteboard Title
        new actions.Whiteboards.EditTitleOfWhiteboard().run("Title":/Favorite WB/.toString(),"Action":/Submit/.toString())
        //Click on Whiteboard Tool
        new actions.Whiteboards.ClickOnWhiteboardTool().run("Tool Type":/Templates/.toString())
        //Set Add Template on Whiteboard Page
        new actions.Whiteboards.SetAddTemplateWhiteboardPage().run("Template Title":/5 Whys/.toString(),"Action":/Add Template/.toString())
        //Go Back From Whiteboard
        new actions.Whiteboards.GoBackFromWhiteboard().run([:])
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Set Action Menu in View Idea 3.0 Page
        new actions.ViewIdea30.SetCopyLinkOnViewIdea30Page().run("Menu Option Name":/Send to Project Room/.toString(),"Click the Option":true)
        //Send to Project Room
        new actions.PipelineStepsView.SendToProjectRoom().run("From the Actions Menu":false,"Existing or New":/Create Project Room/.toString(),"Title":/C131900/.toString(),"Action":/Submit/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/0/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Verify and Access Project Room Card in Userhome
        new actions.ProjectRoom.VerifyProjectRoomCard().run("Title":/C131900/.toString(),"Access Project Room":true)
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Top Link":/Project Room Settings/.toString())
        //Set Tab in Room Settings in Project Room
        new actions.ProjectRoom.SetTabinRoomSettingsinProjectRoom().run("Tab":/Members/.toString())
        //Set Members in Project Room
        new actions.ProjectRoom.SetMembersinProjectRoom().run("Member":/End User,Pipeline Admin/.toString(),"Member Add or Remove":/Add,Add/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Whiteboard/.toString())
        //Set Add Whiteboard Modal
        new actions.ProjectRoom.SetAddWhiteboardModal().run("Existing or New":/New/.toString(),"Title":/Favorite WB/.toString(),"Action":/Submit/.toString())
        //Set Add Template on Whiteboard Page
        new actions.Whiteboards.SetAddTemplateWhiteboardPage().run("Template Title":/New Blank Whiteboard/.toString(),"Action":/Update/.toString())
        //Set Edit Menu for Room Pages in Project Room
        new actions.ProjectRoom.SetEditMenuforRoomPagesinProjectRoom().run("Room Page":/Favorite WB/.toString(),"Menu Options":/Add to My Favorites/.toString(),"Placement Number Of Folder or Page":/3/.toString())
        //Set Edit Menu for Room Pages in Project Room
        new actions.ProjectRoom.SetEditMenuforRoomPagesinProjectRoom().run("Room Page":/test idea1/.toString(),"Menu Options":/Add to My Favorites/.toString(),"Placement Number Of Folder or Page":/2/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Compare Images
        new actions.selenium.CompareImages().run("Element ID (optional)":/\/\/DIV[contains(@class,'f-rooms-favorites ')]/.toString(),"Expected Image File":/C131900_1_NewExpectedImage1.png/.toString(),"Actual Image Name":/C131900_1_actual.png/.toString(),"Do Not Scroll":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Verify and Access Project Room Card in Userhome
        new actions.ProjectRoom.VerifyProjectRoomCard().run("Title":/C131900/.toString(),"Access Project Room":true)
        //Compare Images
        new actions.selenium.CompareImages().run("Element ID (optional)":/\/\/DIV[contains(@class,'f-rooms-sidebar-nav-wrapper')]/.toString(),"Expected Image File":/C131900_2_NewExpectedImage1.png/.toString(),"Actual Image Name":/C131900_3_actual.png/.toString(),"Do Not Scroll":true)
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
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/difference.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C131900_3_actual.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C131900_1_actual.png/.toString())
        }
       catch(all){}catch(Error err){}
    }
}