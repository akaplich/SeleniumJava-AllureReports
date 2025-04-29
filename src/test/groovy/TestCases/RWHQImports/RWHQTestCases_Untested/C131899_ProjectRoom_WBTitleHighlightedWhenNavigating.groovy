import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131899 - Project Room > WB Title Highlighted When Navigating
class C131899_ProjectRoom_WBTitleHighlightedWhenNavigating
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
        //Click on Whiteboard Tool
        new actions.Whiteboards.ClickOnWhiteboardTool().run("Tool Type":/Templates/.toString())
        //Set Add Template on Whiteboard Page
        new actions.Whiteboards.SetAddTemplateWhiteboardPage().run("Template Title":/5 Whys/.toString(),"Action":/Add Template/.toString())
        //Go Back From Whiteboard
        new actions.Whiteboards.GoBackFromWhiteboard().run([:])
        //Create Whiteboard or Edit Template
        new actions.Whiteboards.CreateWhiteboardFromUserhome().run("Create New or Choose Template":/New Blank Whiteboard/.toString())
        //Set Whiteboard Title
        new actions.Whiteboards.EditTitleOfWhiteboard().run("Title":/WB2/.toString(),"Action":/Submit/.toString())
        //Click on Whiteboard Tool
        new actions.Whiteboards.ClickOnWhiteboardTool().run("Tool Type":/Templates/.toString())
        //Set Add Template on Whiteboard Page
        new actions.Whiteboards.SetAddTemplateWhiteboardPage().run("Template Title":/Assumptions Grid/.toString(),"Action":/Add Template/.toString())
        //Go Back From Whiteboard
        new actions.Whiteboards.GoBackFromWhiteboard().run([:])
        //Create Whiteboard or Edit Template
        new actions.Whiteboards.CreateWhiteboardFromUserhome().run("Create New or Choose Template":/New Blank Whiteboard/.toString())
        //Set Whiteboard Title
        new actions.Whiteboards.EditTitleOfWhiteboard().run("Title":/WB3/.toString(),"Action":/Submit/.toString())
        //Click on Whiteboard Tool
        new actions.Whiteboards.ClickOnWhiteboardTool().run("Tool Type":/Templates/.toString())
        //Set Add Template on Whiteboard Page
        new actions.Whiteboards.SetAddTemplateWhiteboardPage().run("Template Title":/Brainwriting/.toString(),"Action":/Add Template/.toString())
        //Go Back From Whiteboard
        new actions.Whiteboards.GoBackFromWhiteboard().run([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Project Room - Create Project Room
        new actions.ProjectRoom.ProjectRoomCreateProjectRoom().run([:])
        //Set and Verify Project Room Title
        new actions.ProjectRoom.SetProjectRoomTitle().run("Title":/C131899/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Whiteboard/.toString())
        //Set Add Whiteboard Modal
        new actions.ProjectRoom.SetAddWhiteboardModal().run("Existing or New":/Existing/.toString(),"Title":/WB1/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Whiteboard/.toString())
        //Set Add Whiteboard Modal
        new actions.ProjectRoom.SetAddWhiteboardModal().run("Existing or New":/Existing/.toString(),"Title":/WB2/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Whiteboard/.toString())
        //Set Add Whiteboard Modal
        new actions.ProjectRoom.SetAddWhiteboardModal().run("Existing or New":/Existing/.toString(),"Title":/WB3/.toString(),"Action":/Submit/.toString())
        try{
            //Compare Images
            new actions.selenium.CompareImages().run("Element ID (optional)":/\/\/DIV[contains(@class,'f-room-items')]/.toString(),"Expected Image File":/C131899_1_expected-new.png/.toString(),"Actual Image Name":/C131899_1_actual.png/.toString(),"Allowed Number of Different Pixels":/100/.toString(),"Do Not Scroll":true)
        }
       catch(all){println all}catch(Error err){println err}
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Room Item":/WB2/.toString())
        try{
            //Compare Images
            new actions.selenium.CompareImages().run("Element ID (optional)":/\/\/DIV[contains(@class,'f-room-items')]/.toString(),"Expected Image File":/C131899_2_expected-new.png/.toString(),"Actual Image Name":/C131899_2_actual.png/.toString(),"Allowed Number of Different Pixels":/100/.toString(),"Do Not Scroll":true)
        }
       catch(all){println all}catch(Error err){println err}
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Go Back
        new actions.selenium.GoBack().run([:])
        //Wait
        new actions.general.Wait().run("Seconds":/1/.toString())
        try{
            //Compare Images
            new actions.selenium.CompareImages().run("Element ID (optional)":/\/\/DIV[contains(@class,'f-room-items')]/.toString(),"Expected Image File":/C131899_1_expected-new.png/.toString(),"Actual Image Name":/C131899_1_actual.png/.toString(),"Allowed Number of Different Pixels":/100/.toString(),"Do Not Scroll":true)
        }
       catch(all){println all}catch(Error err){println err}
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
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C131899_1_actual.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C131899_2_actual.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/difference.png/.toString())
        }
       catch(all){}catch(Error err){}
    }
}