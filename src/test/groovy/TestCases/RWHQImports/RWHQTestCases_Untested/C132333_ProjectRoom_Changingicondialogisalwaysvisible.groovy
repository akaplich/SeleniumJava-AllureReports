import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132333 - Project Room > Changing icon dialog is always visible
class C132333_ProjectRoom_Changingicondialogisalwaysvisible
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
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Project Room - Create Project Room
        new actions.ProjectRoom.ProjectRoomCreateProjectRoom().run([:])
        //Set and Verify Project Room Title
        new actions.ProjectRoom.SetProjectRoomTitle().run("Title":/Testing project room/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Link/.toString())
        //Set Add External Link in Project Room
        new actions.ProjectRoom.SetAddExternalLinkinProjectRoom().run("Link Name":/PR link 1/.toString(),"Link URL":/https:\/\/masteraffiliate.brightideatest.com\/ct\/c_e_login.php?a=OD3334#login/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Link/.toString())
        //Set Add External Link in Project Room
        new actions.ProjectRoom.SetAddExternalLinkinProjectRoom().run("Link Name":/PR link 2/.toString(),"Link URL":/https:\/\/masteraffiliate.brightideatest.com\/ct\/c_e_login.php?a=OD3334#login/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Link/.toString())
        //Set Add External Link in Project Room
        new actions.ProjectRoom.SetAddExternalLinkinProjectRoom().run("Link Name":/PR link 3/.toString(),"Link URL":/https:\/\/masteraffiliate.brightideatest.com\/ct\/c_e_login.php?a=OD3334#login/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Link/.toString())
        //Set Add External Link in Project Room
        new actions.ProjectRoom.SetAddExternalLinkinProjectRoom().run("Link Name":/PR link 4/.toString(),"Link URL":/https:\/\/masteraffiliate.brightideatest.com\/ct\/c_e_login.php?a=OD3334#login/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Link/.toString())
        //Set Add External Link in Project Room
        new actions.ProjectRoom.SetAddExternalLinkinProjectRoom().run("Link Name":/PR link 5/.toString(),"Link URL":/https:\/\/masteraffiliate.brightideatest.com\/ct\/c_e_login.php?a=OD3334#login/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Link/.toString())
        //Set Add External Link in Project Room
        new actions.ProjectRoom.SetAddExternalLinkinProjectRoom().run("Link Name":/PR link 6/.toString(),"Link URL":/https:\/\/masteraffiliate.brightideatest.com\/ct\/c_e_login.php?a=OD3334#login/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Link/.toString())
        //Set Add External Link in Project Room
        new actions.ProjectRoom.SetAddExternalLinkinProjectRoom().run("Link Name":/PR link 7/.toString(),"Link URL":/https:\/\/masteraffiliate.brightideatest.com\/ct\/c_e_login.php?a=OD3334#login/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Link/.toString())
        //Set Add External Link in Project Room
        new actions.ProjectRoom.SetAddExternalLinkinProjectRoom().run("Link Name":/PR link 8/.toString(),"Link URL":/https:\/\/masteraffiliate.brightideatest.com\/ct\/c_e_login.php?a=OD3334#login/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Link/.toString())
        //Set Add External Link in Project Room
        new actions.ProjectRoom.SetAddExternalLinkinProjectRoom().run("Link Name":/PR link 9/.toString(),"Link URL":/https:\/\/masteraffiliate.brightideatest.com\/ct\/c_e_login.php?a=OD3334#login/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Link/.toString())
        //Set Add External Link in Project Room
        new actions.ProjectRoom.SetAddExternalLinkinProjectRoom().run("Link Name":/PR link 10/.toString(),"Link URL":/https:\/\/masteraffiliate.brightideatest.com\/ct\/c_e_login.php?a=OD3334#login/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Link/.toString())
        //Set Add External Link in Project Room
        new actions.ProjectRoom.SetAddExternalLinkinProjectRoom().run("Link Name":/PR link 11/.toString(),"Link URL":/https:\/\/masteraffiliate.brightideatest.com\/ct\/c_e_login.php?a=OD3334#login/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Link/.toString())
        //Set Add External Link in Project Room
        new actions.ProjectRoom.SetAddExternalLinkinProjectRoom().run("Link Name":/PR link 12/.toString(),"Link URL":/https:\/\/masteraffiliate.brightideatest.com\/ct\/c_e_login.php?a=OD3334#login/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Link/.toString())
        //Set Add External Link in Project Room
        new actions.ProjectRoom.SetAddExternalLinkinProjectRoom().run("Link Name":/PR link 13/.toString(),"Link URL":/https:\/\/masteraffiliate.brightideatest.com\/ct\/c_e_login.php?a=OD3334#login/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Link/.toString())
        //Set Add External Link in Project Room
        new actions.ProjectRoom.SetAddExternalLinkinProjectRoom().run("Link Name":/PR link 14/.toString(),"Link URL":/https:\/\/masteraffiliate.brightideatest.com\/ct\/c_e_login.php?a=OD3334#login/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Link/.toString())
        //Set Add External Link in Project Room
        new actions.ProjectRoom.SetAddExternalLinkinProjectRoom().run("Link Name":/PR link 15/.toString(),"Link URL":/https:\/\/masteraffiliate.brightideatest.com\/ct\/c_e_login.php?a=OD3334#login/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Link/.toString())
        //Set Add External Link in Project Room
        new actions.ProjectRoom.SetAddExternalLinkinProjectRoom().run("Link Name":/PR link 16/.toString(),"Link URL":/https:\/\/masteraffiliate.brightideatest.com\/ct\/c_e_login.php?a=OD3334#login/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Link/.toString())
        //Set Add External Link in Project Room
        new actions.ProjectRoom.SetAddExternalLinkinProjectRoom().run("Link Name":/PR link 17/.toString(),"Link URL":/https:\/\/masteraffiliate.brightideatest.com\/ct\/c_e_login.php?a=OD3334#login/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Link/.toString())
        //Set Add External Link in Project Room
        new actions.ProjectRoom.SetAddExternalLinkinProjectRoom().run("Link Name":/PR link 18/.toString(),"Link URL":/https:\/\/masteraffiliate.brightideatest.com\/ct\/c_e_login.php?a=OD3334#login/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Link/.toString())
        //Set Add External Link in Project Room
        new actions.ProjectRoom.SetAddExternalLinkinProjectRoom().run("Link Name":/PR link 19/.toString(),"Link URL":/https:\/\/masteraffiliate.brightideatest.com\/ct\/c_e_login.php?a=OD3334#login/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Link/.toString())
        //Set Add External Link in Project Room
        new actions.ProjectRoom.SetAddExternalLinkinProjectRoom().run("Link Name":/PR link 20/.toString(),"Link URL":/https:\/\/masteraffiliate.brightideatest.com\/ct\/c_e_login.php?a=OD3334#login/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Link/.toString())
        //Set Add External Link in Project Room
        new actions.ProjectRoom.SetAddExternalLinkinProjectRoom().run("Link Name":/PR link 21/.toString(),"Link URL":/https:\/\/masteraffiliate.brightideatest.com\/ct\/c_e_login.php?a=OD3334#login/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Link/.toString())
        //Set Add External Link in Project Room
        new actions.ProjectRoom.SetAddExternalLinkinProjectRoom().run("Link Name":/PR link 22/.toString(),"Link URL":/https:\/\/masteraffiliate.brightideatest.com\/ct\/c_e_login.php?a=OD3334#login/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Link/.toString())
        //Set Add External Link in Project Room
        new actions.ProjectRoom.SetAddExternalLinkinProjectRoom().run("Link Name":/PR link 23/.toString(),"Link URL":/https:\/\/masteraffiliate.brightideatest.com\/ct\/c_e_login.php?a=OD3334#login/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Link/.toString())
        //Set Add External Link in Project Room
        new actions.ProjectRoom.SetAddExternalLinkinProjectRoom().run("Link Name":/PR link 24/.toString(),"Link URL":/https:\/\/masteraffiliate.brightideatest.com\/ct\/c_e_login.php?a=OD3334#login/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Link/.toString())
        //Set Add External Link in Project Room
        new actions.ProjectRoom.SetAddExternalLinkinProjectRoom().run("Link Name":/PR link 25/.toString(),"Link URL":/https:\/\/masteraffiliate.brightideatest.com\/ct\/c_e_login.php?a=OD3334#login/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Link/.toString())
        //Set Add External Link in Project Room
        new actions.ProjectRoom.SetAddExternalLinkinProjectRoom().run("Link Name":/PR link 26/.toString(),"Link URL":/https:\/\/masteraffiliate.brightideatest.com\/ct\/c_e_login.php?a=OD3334#login/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Link/.toString())
        //Set Add External Link in Project Room
        new actions.ProjectRoom.SetAddExternalLinkinProjectRoom().run("Link Name":/PR link 27/.toString(),"Link URL":/https:\/\/masteraffiliate.brightideatest.com\/ct\/c_e_login.php?a=OD3334#login/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Link/.toString())
        //Set Add External Link in Project Room
        new actions.ProjectRoom.SetAddExternalLinkinProjectRoom().run("Link Name":/PR link 28/.toString(),"Link URL":/https:\/\/masteraffiliate.brightideatest.com\/ct\/c_e_login.php?a=OD3334#login/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Link/.toString())
        //Set Add External Link in Project Room
        new actions.ProjectRoom.SetAddExternalLinkinProjectRoom().run("Link Name":/PR link 29/.toString(),"Link URL":/https:\/\/masteraffiliate.brightideatest.com\/ct\/c_e_login.php?a=OD3334#login/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Link/.toString())
        //Set Add External Link in Project Room
        new actions.ProjectRoom.SetAddExternalLinkinProjectRoom().run("Link Name":/PR link 30/.toString(),"Link URL":/https:\/\/masteraffiliate.brightideatest.com\/ct\/c_e_login.php?a=OD3334#login/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Link/.toString())
        //Set Add External Link in Project Room
        new actions.ProjectRoom.SetAddExternalLinkinProjectRoom().run("Link Name":/PR link 31/.toString(),"Link URL":/https:\/\/masteraffiliate.brightideatest.com\/ct\/c_e_login.php?a=OD3334#login/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Link/.toString())
        //Set Add External Link in Project Room
        new actions.ProjectRoom.SetAddExternalLinkinProjectRoom().run("Link Name":/PR link 32/.toString(),"Link URL":/https:\/\/masteraffiliate.brightideatest.com\/ct\/c_e_login.php?a=OD3334#login/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Link/.toString())
        //Set Add External Link in Project Room
        new actions.ProjectRoom.SetAddExternalLinkinProjectRoom().run("Link Name":/PR link 33/.toString(),"Link URL":/https:\/\/masteraffiliate.brightideatest.com\/ct\/c_e_login.php?a=OD3334#login/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Link/.toString())
        //Set Add External Link in Project Room
        new actions.ProjectRoom.SetAddExternalLinkinProjectRoom().run("Link Name":/PR link 34/.toString(),"Link URL":/https:\/\/masteraffiliate.brightideatest.com\/ct\/c_e_login.php?a=OD3334#login/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Link/.toString())
        //Set Add External Link in Project Room
        new actions.ProjectRoom.SetAddExternalLinkinProjectRoom().run("Link Name":/PR link 35/.toString(),"Link URL":/https:\/\/masteraffiliate.brightideatest.com\/ct\/c_e_login.php?a=OD3334#login/.toString(),"Action":/Submit/.toString())
        //Set Folder or Room Page Icon
        new actions.ProjectRoom.SetFolderorRoomPageIcon().run("Folder or Room Name":/PR link 35/.toString(),"Skip Emoji Selection":true)
        //Compare Images
        new actions.selenium.CompareImages().run("Expected Image File":/C132333_Expected.png/.toString(),"Actual Image Name":/C132333_Actual.png/.toString(),"Crop Screenshot Start at X":/1/.toString(),"Crop Screenshot Start at Y":/500/.toString(),"Crop Screenshot Width":/500/.toString(),"Crop Screenshot Height":/700/.toString(),"Allowed Number of Different Pixels":/100/.toString(),"Do Not Scroll":true)
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
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C132333_Actual.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/difference.png/.toString())
        }
       catch(all){}catch(Error err){}
    }
}