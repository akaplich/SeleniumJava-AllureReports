import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132167 - PR > Delete Folder,Stage,Gate > Pages inside the objects
class C132167_PR_DeleteFolder_Stage_Gate_Pagesinsidetheobjects
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
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Whiteboards/.toString())
        //Create Whiteboard or Edit Template
        new actions.Whiteboards.CreateWhiteboardFromUserhome().run("Create New or Choose Template":/New Blank Whiteboard/.toString())
        //Set Whiteboard Title
        new actions.Whiteboards.EditTitleOfWhiteboard().run("Title":/WB1/.toString(),"Action":/Submit/.toString())
        //Go Back From Whiteboard
        new actions.Whiteboards.GoBackFromWhiteboard().run([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Project Room - Create Project Room
        new actions.ProjectRoom.ProjectRoomCreateProjectRoom().run([:])
        //Set and Verify Project Room Title
        new actions.ProjectRoom.SetProjectRoomTitle().run("Title":/Testing project room/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Folder/.toString())
        //Set Stage or Gate Name in Project Room
        new actions.ProjectRoom.SetStageorGateNameinProjectRoom().run("Stage or Gate Name":/Folder With Items/.toString(),"Action":/Add Folder/.toString())
        //Drag and Drop Left Panel Items in Project Room
        new actions.ProjectRoom.DragDropLeftPanelItemsProjectRoom().run("Item to Drag":/Tasks/.toString(),"Or Folder Name":/Folder With Items/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Stage/.toString())
        //Set Stage or Gate Name in Project Room
        new actions.ProjectRoom.SetStageorGateNameinProjectRoom().run("Stage or Gate Name":/Stage/.toString(),"Action":/Add Stage/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Gate/.toString())
        //Set Stage or Gate Name in Project Room
        new actions.ProjectRoom.SetStageorGateNameinProjectRoom().run("Stage or Gate Name":/Gate1/.toString(),"Action":/Add Gate/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Whiteboard/.toString())
        //Set Add Whiteboard Modal
        new actions.ProjectRoom.SetAddWhiteboardModal().run("Existing or New":/Existing/.toString(),"Title":/WB1/.toString(),"Action":/Submit/.toString())
        //Drag and Drop Left Panel Items in Project Room
        new actions.ProjectRoom.DragDropLeftPanelItemsProjectRoom().run("Item to Drag":/WB1/.toString(),"Or Folder Name":/Stage/.toString())
        //Verify Folder Or Room Page In Project Room in Root Folder
        new actions.ProjectRoom.VerifyFolderOrRoomPageInProjectRoom().run("Placement Number of Parent Page or Folder":/1/.toString(),"Placement Number of Child Page or Folder":/1/.toString(),"Parent Folder Name":/Folder With Items/.toString(),"Child Page or Folder":/Tasks/.toString(),"Number of Matches":/1/.toString())
        //Verify Folder Or Room Page In Project Room in Root Folder
        new actions.ProjectRoom.VerifyFolderOrRoomPageInProjectRoom().run("Placement Number of Parent Page or Folder":/2/.toString(),"Placement Number of Child Page or Folder":/1/.toString(),"Parent Folder Name":/Stage/.toString(),"Child Page or Folder":/WB1/.toString(),"Number of Matches":/1/.toString())
        //Verify Folder Or Room Page In Project Room in Root Folder
        new actions.ProjectRoom.VerifyFolderOrRoomPageInProjectRoom().run("Placement Number of Child Page or Folder":/3/.toString(),"Child Page or Folder":/Gate1/.toString(),"Number of Matches":/1/.toString())
        //Set Edit Menu for Room Pages in Project Room
        new actions.ProjectRoom.SetEditMenuforRoomPagesinProjectRoom().run("Room Page":/Folder With Items/.toString(),"Menu Options":/Delete/.toString(),"Placement Number Of Folder or Page":/1/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Are you sure you want to delete this object? As a note, once this is done, the object will be deleted, but all items underneath the object will be removed and kept within your Project Room./.toString(),"Should Exist":true)
        //Set Remove Page on Project room
        new actions.ProjectRoom.SetRemovePageonProjectRoom().run("Action":/Delete Folder/.toString())
        //Verify Folder Or Room Page In Project Room in Root Folder
        new actions.ProjectRoom.VerifyFolderOrRoomPageInProjectRoom().run("Placement Number of Parent Page or Folder":/1/.toString(),"Placement Number of Child Page or Folder":/1/.toString(),"Parent Folder Name":/Folder With Items/.toString(),"Child Page or Folder":/Tasks/.toString(),"Number of Matches":/0/.toString())
        //Verify Folder Or Room Page In Project Room in Root Folder
        new actions.ProjectRoom.VerifyFolderOrRoomPageInProjectRoom().run("Placement Number of Child Page or Folder":/1/.toString(),"Child Page or Folder":/Tasks/.toString(),"Number of Matches":/1/.toString())
        //Set Edit Menu for Room Pages in Project Room
        new actions.ProjectRoom.SetEditMenuforRoomPagesinProjectRoom().run("Room Page":/Stage/.toString(),"Menu Options":/Delete/.toString(),"Placement Number Of Folder or Page":/2/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Are you sure you want to delete this object? It will be deleted even if there are open action items assigned. All items underneath the object will be removed and kept within your Project Room./.toString(),"Should Exist":true)
        //Set Remove Page on Project room
        new actions.ProjectRoom.SetRemovePageonProjectRoom().run("Action":/Delete Stage/.toString())
        //Verify Folder Or Room Page In Project Room in Root Folder
        new actions.ProjectRoom.VerifyFolderOrRoomPageInProjectRoom().run("Placement Number of Parent Page or Folder":/2/.toString(),"Placement Number of Child Page or Folder":/1/.toString(),"Parent Folder Name":/Stage/.toString(),"Child Page or Folder":/WB1/.toString(),"Number of Matches":/0/.toString())
        //Verify Folder Or Room Page In Project Room in Root Folder
        new actions.ProjectRoom.VerifyFolderOrRoomPageInProjectRoom().run("Placement Number of Child Page or Folder":/2/.toString(),"Child Page or Folder":/WB1/.toString(),"Number of Matches":/1/.toString())
        //Set Edit Menu for Room Pages in Project Room
        new actions.ProjectRoom.SetEditMenuforRoomPagesinProjectRoom().run("Room Page":/Gate1/.toString(),"Menu Options":/Delete/.toString(),"Placement Number Of Folder or Page":/3/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Are you sure you want to delete this object? It will be deleted even if there are open action items assigned. All items underneath the object will be removed and kept within your Project Room./.toString(),"Should Exist":true)
        //Set Remove Page on Project room
        new actions.ProjectRoom.SetRemovePageonProjectRoom().run("Action":/Delete Gate/.toString())
        //Verify Folder Or Room Page In Project Room in Root Folder
        new actions.ProjectRoom.VerifyFolderOrRoomPageInProjectRoom().run("Placement Number of Child Page or Folder":/3/.toString(),"Child Page or Folder":/Gate1/.toString(),"Number of Matches":/0/.toString())
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