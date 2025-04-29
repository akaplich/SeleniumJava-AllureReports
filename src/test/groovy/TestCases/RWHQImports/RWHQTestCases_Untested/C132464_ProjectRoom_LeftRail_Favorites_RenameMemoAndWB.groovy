import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C132464 - Project Room > Left Rail - Favorites - Rename Memo & WB
class C132464_ProjectRoom_LeftRail_Favorites_RenameMemoAndWB
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
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Memo/.toString())
        //Set Idea Memo or Whiteboard in Project Room
        new actions.ProjectRoom.SetIdeaMemoorWhiteboardinProjectRoom().run("Existing or New":/New/.toString(),"New Whiteboard or Memo Name":/memo1/.toString(),"Action":/Select/.toString())
        //Set Memo Template Tile
        new actions.MTS.SetMemoTemplateTile().run("Template":/Create Blank Memo/.toString())
        //Set Edit Menu for Room Pages in Project Room
        new actions.ProjectRoom.SetEditMenuforRoomPagesinProjectRoom().run("Room Page":/memo1/.toString(),"Menu Options":/Add to My Favorites/.toString(),"Placement Number Of Folder or Page":/2/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Whiteboard/.toString())
        //Set Add Whiteboard Modal
        new actions.ProjectRoom.SetAddWhiteboardModal().run("Existing or New":/New/.toString(),"Title":/C132436 WB/.toString(),"Action":/Submit/.toString())
        //Set Add Template on Whiteboard Page
        new actions.Whiteboards.SetAddTemplateWhiteboardPage().run("Template Title":/New Blank Whiteboard/.toString(),"Action":/Update/.toString())
        //Set Shapes Tool in Whiteboard
        new actions.Whiteboards.SetShapesToolWhiteboard().run("Add via Single Click or Drag and Drop":/Single Click/.toString(),"X coordinate":/250/.toString(),"Y coordinate":/250/.toString())
        //Set Edit Menu for Room Pages in Project Room
        new actions.ProjectRoom.SetEditMenuforRoomPagesinProjectRoom().run("Room Page":/C132436 WB/.toString(),"Menu Options":/Add to My Favorites/.toString(),"Placement Number Of Folder or Page":/3/.toString())
        //Verify Room Page In Favorites Tab In Project Room
        new actions.ProjectRoom.VerifyRoomPageInFavoritesTabInProjectRoom().run("Placement Number of Page":/1/.toString(),"Room Page":/C132436 WB/.toString(),"Number of Matches":/1/.toString())
        //Verify Room Page In Favorites Tab In Project Room
        new actions.ProjectRoom.VerifyRoomPageInFavoritesTabInProjectRoom().run("Placement Number of Page":/2/.toString(),"Room Page":/memo1/.toString(),"Number of Matches":/1/.toString())
        //Set Edit Menu for Room Pages in Project Room
        new actions.ProjectRoom.SetEditMenuforRoomPagesinProjectRoom().run("Room Page":/memo1/.toString(),"Menu Options":/Rename/.toString(),"Placement Number Of Folder or Page":/2/.toString())
        //Set Rename Page in Project Room
        new actions.ProjectRoom.SetRenamePageinProjectRoom().run("New Page Name":/Renamed memo1/.toString(),"Action":/Rename Files/.toString())
        //Set Edit Menu for Room Pages in Project Room
        new actions.ProjectRoom.SetEditMenuforRoomPagesinProjectRoom().run("Room Page":/C132436 WB/.toString(),"Menu Options":/Rename/.toString(),"Placement Number Of Folder or Page":/1/.toString())
        //Set Rename Page in Project Room
        new actions.ProjectRoom.SetRenamePageinProjectRoom().run("New Page Name":/Renamed WB C131893/.toString(),"Action":/Rename Files/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/1/.toString())
        //Verify Room Page In Favorites Tab In Project Room
        new actions.ProjectRoom.VerifyRoomPageInFavoritesTabInProjectRoom().run("Room Page":/memo1/.toString(),"Number of Matches":/0/.toString())
        //Verify Room Page In Favorites Tab In Project Room
        new actions.ProjectRoom.VerifyRoomPageInFavoritesTabInProjectRoom().run("Room Page":/C131893 Test/.toString(),"Number of Matches":/0/.toString())
        //Verify Room Page In Favorites Tab In Project Room
        new actions.ProjectRoom.VerifyRoomPageInFavoritesTabInProjectRoom().run("Placement Number of Page":/1/.toString(),"Room Page":/Renamed WB C131893/.toString(),"Number of Matches":/1/.toString())
        //Verify Room Page In Favorites Tab In Project Room
        new actions.ProjectRoom.VerifyRoomPageInFavoritesTabInProjectRoom().run("Placement Number of Page":/2/.toString(),"Room Page":/Renamed memo1/.toString(),"Number of Matches":/1/.toString())
        //Verify Folder Or Room Page In Project Room in Root Folder
        new actions.ProjectRoom.VerifyFolderOrRoomPageInProjectRoom().run("Placement Number of Child Page or Folder":/2/.toString(),"Child Page or Folder":/Renamed memo1/.toString(),"Number of Matches":/2/.toString())
        //Verify Folder Or Room Page In Project Room in Root Folder
        new actions.ProjectRoom.VerifyFolderOrRoomPageInProjectRoom().run("Placement Number of Child Page or Folder":/3/.toString(),"Child Page or Folder":/Renamed WB C131893/.toString(),"Number of Matches":/1/.toString())
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