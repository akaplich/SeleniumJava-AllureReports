package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132010 - Project Room > Whiteboard No Permissions
class C132010_ProjectRoom_WhiteboardNoPermissions
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
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString(),"Activities":true,"My Ideas":true,"Submissions":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Project Room - Create Project Room
        new actions.ProjectRoom.ProjectRoomCreateProjectRoom().run([:])
        //Set and Verify Project Room Title
        new actions.ProjectRoom.SetProjectRoomTitle().run("Title":/C132010/.toString(),"Action":/Submit/.toString())
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Top Link":/Project Room Settings/.toString())
        //Set Tab in Room Settings in Project Room
        new actions.ProjectRoom.SetTabinRoomSettingsinProjectRoom().run("Tab":/Members/.toString())
        //Set Members in Project Room
        new actions.ProjectRoom.SetMembersinProjectRoom().run("Member":/Pipeline Admin,End User/.toString(),"Member Add or Remove":/Add,Add/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Whiteboard/.toString())
        //Set Add Whiteboard Modal
        new actions.ProjectRoom.SetAddWhiteboardModal().run("Existing or New":/New/.toString(),"Title":/No Permissions/.toString(),"Action":/Submit/.toString())
        //Set Add Template on Whiteboard Page
        new actions.Whiteboards.SetAddTemplateWhiteboardPage().run("Template Title":/New Blank Whiteboard/.toString(),"Action":/Add Template/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Whiteboard/.toString())
        //Set Add Whiteboard Modal
        new actions.ProjectRoom.SetAddWhiteboardModal().run("Existing or New":/New/.toString(),"Title":/Anyone Can View/.toString(),"Action":/Submit/.toString())
        //Set Add Template on Whiteboard Page
        new actions.Whiteboards.SetAddTemplateWhiteboardPage().run("Template Title":/New Blank Whiteboard/.toString(),"Action":/Add Template/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Whiteboard/.toString())
        //Set Add Whiteboard Modal
        new actions.ProjectRoom.SetAddWhiteboardModal().run("Existing or New":/New/.toString(),"Title":/Pipeline Admin Only Can Edit/.toString(),"Action":/Submit/.toString())
        //Set Add Template on Whiteboard Page
        new actions.Whiteboards.SetAddTemplateWhiteboardPage().run("Template Title":/New Blank Whiteboard/.toString(),"Action":/Add Template/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Whiteboard/.toString())
        //Set Add Whiteboard Modal
        new actions.ProjectRoom.SetAddWhiteboardModal().run("Existing or New":/New/.toString(),"Title":/Anyone Can Edit/.toString(),"Action":/Submit/.toString())
        //Set Add Template on Whiteboard Page
        new actions.Whiteboards.SetAddTemplateWhiteboardPage().run("Template Title":/New Blank Whiteboard/.toString(),"Action":/Add Template/.toString())
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Room Item":/No Permissions/.toString())
        //Whiteboard - Set Share
        new actions.Whiteboards.SetShareWhiteboard().run("Click Share Button":true,"User to Remove":/Pipeline Admin,End User/.toString(),"Toggle anyone with link":false,"Action":/Close/.toString())
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Room Item":/Anyone Can View/.toString())
        //Whiteboard - Set Share
        new actions.Whiteboards.SetShareWhiteboard().run("Click Share Button":true,"User to Remove":/Pipeline Admin,End User/.toString(),"Anyone with link...":/can view/.toString(),"Action":/Close/.toString())
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Room Item":/Pipeline Admin Only Can Edit/.toString())
        //Whiteboard - Set Share
        new actions.Whiteboards.SetShareWhiteboard().run("Click Share Button":true,"User to Remove":/End User/.toString(),"Action":/Close/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/pipelineadmin@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Verify and Access Project Room Card in Userhome
        new actions.ProjectRoom.VerifyProjectRoomCard().run("Title":/C132010/.toString(),"Access Project Room":true)
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Room Item":/No Permissions/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Whiteboard not found/.toString(),"Should Exist":true)
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Room Item":/Anyone Can View/.toString())
        try{
            //Set Whiteboard Title
            new actions.Whiteboards.EditTitleOfWhiteboard().run("Title":/updated/.toString(),"Action":/Submit/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Whiteboard Title
        new actions.Whiteboards.VerifyWhiteboardTitle().run("Title":/Anyone Can View/.toString())
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Room Item":/Pipeline Admin Only Can Edit/.toString())
        //Click on Whiteboard Tool
        new actions.Whiteboards.ClickOnWhiteboardTool().run("Tool Type":/Templates/.toString())
        //Set Add Template on Whiteboard Page
        new actions.Whiteboards.SetAddTemplateWhiteboardPage().run("Template Title":/5 Whys/.toString(),"Action":/Add Template/.toString())
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Room Item":/Anyone Can Edit/.toString())
        //Click on Whiteboard Tool
        new actions.Whiteboards.ClickOnWhiteboardTool().run("Tool Type":/Templates/.toString())
        //Set Add Template on Whiteboard Page
        new actions.Whiteboards.SetAddTemplateWhiteboardPage().run("Template Title":/5 Whys/.toString(),"Action":/Add Template/.toString())
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