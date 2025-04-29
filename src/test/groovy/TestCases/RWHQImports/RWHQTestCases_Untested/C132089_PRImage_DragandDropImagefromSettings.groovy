package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132089 - PR Image > Drag and Drop Image from Settings
class C132089_PRImage_DragandDropImagefromSettings
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
        new actions.ProjectRoom.SetProjectRoomTitle().run("Title":/Testing project room/.toString(),"Action":/Submit/.toString())
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Top Link":/Project Room Settings/.toString())
        //Set Room Settings In Project Room
        new actions.ProjectRoom.SetRoomSettingsInProjectRoom().run("Click on Generate Link":false,"Icon File":/Image5.jpg/.toString())
        //Set Upload your Own Background
        new actions.WebstormHomepage.SetUploadyourOwnBackground().run("Action":/Add Image/.toString())
        //Set Crop Image in Post Idea
        new actions.PostIdea.SetCropImageinPostIdea().run("Action":/Crop/.toString())
        //Set Project Room Image from Sidebar
        new actions.ProjectRoom.SetProjectRoomImagefromSidebar().run("Project Room Icon":/Image/.toString())
        //Return Element ID of Project Room Image
        variables."barTopElement" = new actions.ProjectRoom.ReturnElementIDofProjectRoomImage().run("Project Image Location":/Left Bar Top/.toString())
        //Compare Images
        new actions.selenium.CompareImages().run("Element ID (optional)":/${variables."barTopElement"}/.toString(),"Expected Image File":/C132089_TopBar_ExpectedImage.png/.toString(),"Actual Image Name":/C132089_TopBar_ActualImage.png/.toString())
        //Return Element ID of Project Room Image
        variables."previewImageElement" = new actions.ProjectRoom.ReturnElementIDofProjectRoomImage().run("Project Image Location":/Preview Image in Room Settings/.toString())
        //Compare Images
        new actions.selenium.CompareImages().run("Element ID (optional)":/${variables."previewImageElement"}/.toString(),"Expected Image File":/C132089_Preview_ExpectedImage.png/.toString(),"Actual Image Name":/C132089_Preview_ActualImage.png/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Compare Images
        new actions.selenium.CompareImages().run("Element ID (optional)":/${variables."barTopElement"}/.toString(),"Expected Image File":/C132089_TopBar_ExpectedImage.png/.toString(),"Actual Image Name":/C132089_TopBar_ActualImage.png/.toString())
        //Compare Images
        new actions.selenium.CompareImages().run("Element ID (optional)":/${variables."previewImageElement"}/.toString(),"Expected Image File":/C132089_Preview_ExpectedImage.png/.toString(),"Actual Image Name":/C132089_Preview_ActualImage.png/.toString())
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
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Name":/C132089_TopBar_ActualImage.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Name":/C132089_Preview_ActualImage.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Name":/difference.png/.toString())
        }
       catch(all){}catch(Error err){}
        //Afterstate
        Action581259c8fa4ee77809f46905([:])
    }
}