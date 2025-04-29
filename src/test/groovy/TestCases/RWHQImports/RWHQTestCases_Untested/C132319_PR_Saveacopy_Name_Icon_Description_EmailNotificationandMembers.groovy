import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C132319 - PR > Save a copy > Name,Icon,Description,Email Notification and Members 
class C132319_PR_Saveacopy_Name_Icon_Description_EmailNotificationandMembers
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
        //Set Project Room Image from Sidebar
        new actions.ProjectRoom.SetProjectRoomImagefromSidebar().run("Project Room Icon":/rgb(52, 152, 219)/.toString(),"Click on Icon":true)
        //Set Upload your Own Background
        new actions.WebstormHomepage.SetUploadyourOwnBackground().run("Choose File":/SamplePNG.png/.toString(),"Wait for Image to load":true,"Action":/Add Image/.toString())
        //Set Crop Image in Post Idea
        new actions.PostIdea.SetCropImageinPostIdea().run("Action":/Crop/.toString())
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Top Link":/Project Room Settings/.toString())
        //Set Tab in Room Settings in Project Room
        new actions.ProjectRoom.SetTabinRoomSettingsinProjectRoom().run("Tab":/Members/.toString())
        //Set Members in Project Room
        new actions.ProjectRoom.SetMembersinProjectRoom().run("Member":/analyst,End User/.toString(),"Member Add or Remove":/Add,Add/.toString())
        //Set Tab in Room Settings in Project Room
        new actions.ProjectRoom.SetTabinRoomSettingsinProjectRoom().run("Tab":/Settings/.toString())
        //Set Room Settings In Project Room
        new actions.ProjectRoom.SetRoomSettingsInProjectRoom().run("Project Description":/test this description is copied/.toString(),"Action":/Save/.toString())
        //Set Tab in Room Settings in Project Room
        new actions.ProjectRoom.SetTabinRoomSettingsinProjectRoom().run("Tab":/Notifications/.toString())
        //Set Room Settings In Project Room
        new actions.ProjectRoom.SetRoomSettingsInProjectRoom().run("Email Notification":false,"Action":/Save/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Set Action Menu on Project Room Card
        new actions.ProjectRoom.SetActionMenuonProjectRoomCard().run("Project Room Title":/Testing project room/.toString(),"Option":/Save a Copy/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/10/.toString())
        //Verify and Access Project Room Card in Userhome
        new actions.ProjectRoom.VerifyProjectRoomCard().run("Title":/Copy of Testing project room/.toString(),"Member count":/1/.toString(),"Total Objects":/1/.toString(),"Total Tasks":/0/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString(),"Access Project Room":true)
        //Verify and Set Project Room Updates
        new actions.ProjectRoom.VerifyandSetProjectRoomUpdates().run("Project Description":/test this description is copied/.toString(),"All Project Room Members":/System Admin/.toString(),"Should Project Room Member be Displayed":/True/.toString(),"Profile Picture Displayed for Members":/False/.toString(),"Project Room Owner Name":/System Admin/.toString())
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Top Link":/Project Room Settings/.toString())
        //Set Tab in Room Settings in Project Room
        new actions.ProjectRoom.SetTabinRoomSettingsinProjectRoom().run("Tab":/Members/.toString())
        //Verify Project Room Member in Members Tab
        new actions.ProjectRoom.VerifyProjectRoomMemberinMembersTab().run("Member Name":/System Admin/.toString(),"Member Display Picture":false,"Type of Member":/owner/.toString(),"Number of Matches":/1/.toString())
        //Verify Project Room Member in Members Tab
        new actions.ProjectRoom.VerifyProjectRoomMemberinMembersTab().run("Member Name":/End User/.toString(),"Type of Member":/team member/.toString(),"Number of Matches":/0/.toString())
        //Verify Project Room Member in Members Tab
        new actions.ProjectRoom.VerifyProjectRoomMemberinMembersTab().run("Member Name":/analyst/.toString(),"Member Display Picture":false,"Type of Member":/team member/.toString(),"Number of Matches":/0/.toString())
        //Set Tab in Room Settings in Project Room
        new actions.ProjectRoom.SetTabinRoomSettingsinProjectRoom().run("Tab":/Notifications/.toString())
        //Set Room Settings In Project Room
        new actions.ProjectRoom.SetRoomSettingsInProjectRoom().run("Email Notification":false,"Action":/Save/.toString())
        //Return Element ID of Project Room Image
        variables."elementLocation" = new actions.ProjectRoom.ReturnElementIDofProjectRoomImage().run("Project Image Location":/Left Bar Top/.toString())
        //Compare Images
        new actions.selenium.CompareImages().run("Element ID (optional)":/${variables."elementLocation"}/.toString(),"Expected Image File":/C132080_TopBar_ExpectedImage.png/.toString(),"Actual Image Name":/C132319_TopBar_ActualImage.png/.toString())
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
            new actions.selenium.DeleteFile().run("File Name":/difference.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Name":/C132319_TopBar_ActualImage.png/.toString())
        }
       catch(all){}catch(Error err){}
        //Afterstate
        Action581259c8fa4ee77809f46905([:])
    }
}