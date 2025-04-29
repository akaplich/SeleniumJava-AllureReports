import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132436 - Project Room > Left Rail - Favorites - Rename BI, Link and Tasks
class C132436_ProjectRoom_LeftRail_Favorites_RenameBI_LinkandTasks
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
        new actions.ProjectRoom.SetProjectRoomTitle().run("Title":/C132023/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Business Impact/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/10/.toString())
        //Set Edit Menu for Room Pages in Project Room
        new actions.ProjectRoom.SetEditMenuforRoomPagesinProjectRoom().run("Room Page":/Business Impact/.toString(),"Menu Options":/Add to My Favorites/.toString(),"Placement Number Of Folder or Page":/2/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Link/.toString())
        //Set Add External Link in Project Room
        new actions.ProjectRoom.SetAddExternalLinkinProjectRoom().run("Link Name":/Link/.toString(),"Link URL":/www.google.com/.toString(),"Action":/Submit/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/10/.toString())
        //Set Edit Menu for Room Pages in Project Room
        new actions.ProjectRoom.SetEditMenuforRoomPagesinProjectRoom().run("Room Page":/Link/.toString(),"Menu Options":/Add to My Favorites/.toString(),"Placement Number Of Folder or Page":/3/.toString())
        //Set Edit Menu for Room Pages in Project Room
        new actions.ProjectRoom.SetEditMenuforRoomPagesinProjectRoom().run("Room Page":/Tasks/.toString(),"Menu Options":/Add to My Favorites/.toString(),"Placement Number Of Folder or Page":/1/.toString())
        //Verify Room Page In Favorites Tab In Project Room
        new actions.ProjectRoom.VerifyRoomPageInFavoritesTabInProjectRoom().run("Placement Number of Page":/1/.toString(),"Room Page":/Tasks/.toString(),"Number of Matches":/1/.toString())
        //Verify Room Page In Favorites Tab In Project Room
        new actions.ProjectRoom.VerifyRoomPageInFavoritesTabInProjectRoom().run("Placement Number of Page":/2/.toString(),"Room Page":/Link/.toString(),"Number of Matches":/1/.toString())
        //Verify Room Page In Favorites Tab In Project Room
        new actions.ProjectRoom.VerifyRoomPageInFavoritesTabInProjectRoom().run("Placement Number of Page":/3/.toString(),"Room Page":/Business Impact/.toString(),"Number of Matches":/1/.toString())
        //Set Edit Menu for Room Pages in Project Room
        new actions.ProjectRoom.SetEditMenuforRoomPagesinProjectRoom().run("Room Page":/Business Impact/.toString(),"Menu Options":/Rename/.toString(),"Placement Number Of Folder or Page":/2/.toString())
        //Set Rename Page in Project Room
        new actions.ProjectRoom.SetRenamePageinProjectRoom().run("New Page Name":/Renamed BI/.toString(),"Action":/Rename Files/.toString())
        //Set Edit Menu for Room Pages in Project Room
        new actions.ProjectRoom.SetEditMenuforRoomPagesinProjectRoom().run("Room Page":/Link/.toString(),"Menu Options":/Rename/.toString(),"Placement Number Of Folder or Page":/3/.toString())
        //Set Rename Page in Project Room
        new actions.ProjectRoom.SetRenamePageinProjectRoom().run("New Page Name":/Renamed Link/.toString(),"Action":/Rename Files/.toString())
        //Set Edit Menu for Room Pages in Project Room
        new actions.ProjectRoom.SetEditMenuforRoomPagesinProjectRoom().run("Room Page":/Tasks/.toString(),"Menu Options":/Rename/.toString(),"Placement Number Of Folder or Page":/1/.toString())
        //Set Rename Page in Project Room
        new actions.ProjectRoom.SetRenamePageinProjectRoom().run("New Page Name":/Renamed Tasks/.toString(),"Action":/Rename Files/.toString())
        //Verify Room Page In Favorites Tab In Project Room
        new actions.ProjectRoom.VerifyRoomPageInFavoritesTabInProjectRoom().run("Room Page":/Business Impact/.toString(),"Number of Matches":/0/.toString())
        //Verify Room Page In Favorites Tab In Project Room
        new actions.ProjectRoom.VerifyRoomPageInFavoritesTabInProjectRoom().run("Room Page":/Link/.toString(),"Number of Matches":/0/.toString())
        //Verify Room Page In Favorites Tab In Project Room
        new actions.ProjectRoom.VerifyRoomPageInFavoritesTabInProjectRoom().run("Room Page":/Tasks/.toString(),"Number of Matches":/0/.toString())
        //Verify Room Page In Favorites Tab In Project Room
        new actions.ProjectRoom.VerifyRoomPageInFavoritesTabInProjectRoom().run("Placement Number of Page":/1/.toString(),"Room Page":/Renamed Tasks/.toString(),"Number of Matches":/1/.toString())
        //Verify Room Page In Favorites Tab In Project Room
        new actions.ProjectRoom.VerifyRoomPageInFavoritesTabInProjectRoom().run("Placement Number of Page":/2/.toString(),"Room Page":/Renamed Link/.toString(),"Number of Matches":/1/.toString())
        //Verify Room Page In Favorites Tab In Project Room
        new actions.ProjectRoom.VerifyRoomPageInFavoritesTabInProjectRoom().run("Placement Number of Page":/3/.toString(),"Room Page":/Renamed BI/.toString(),"Number of Matches":/1/.toString())
        //Verify Folder Or Room Page In Project Room in Root Folder
        new actions.ProjectRoom.VerifyFolderOrRoomPageInProjectRoom().run("Placement Number of Child Page or Folder":/1/.toString(),"Child Page or Folder":/Renamed Tasks/.toString(),"Number of Matches":/2/.toString())
        //Verify Folder Or Room Page In Project Room in Root Folder
        new actions.ProjectRoom.VerifyFolderOrRoomPageInProjectRoom().run("Placement Number of Child Page or Folder":/2/.toString(),"Child Page or Folder":/Renamed BI/.toString(),"Number of Matches":/1/.toString())
        //Verify Folder Or Room Page In Project Room in Root Folder
        new actions.ProjectRoom.VerifyFolderOrRoomPageInProjectRoom().run("Placement Number of Child Page or Folder":/3/.toString(),"Child Page or Folder":/Renamed Link/.toString(),"Number of Matches":/1/.toString())
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