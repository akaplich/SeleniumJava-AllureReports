package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C132084 - PR Image > Idea Image for existing and new PR
class C132084_PRImage_IdeaImageforexistingandnewPR
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
        //Delete this when Scheduler feature is enabled for everyone
        Action66ec7933e12425a91ee5d983([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString(),"Activities":true,"My Ideas":true,"Submissions":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Apply Filter on Apps Pillar 2.0
        new actions.AppsPillar.ApplyFilterAppsPillar20().run("Filter Option":/Programs/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Hackathon/.toString(),"Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Hack/.toString(),"Description":/Hack Desc/.toString(),"Early Access":/ALL/.toString(),"Early Access Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Disable Scheduler
        new actions.SetupScheduler.SetDisableScheduler().run("Status":/Active/.toString(),"Enable Submission":true,"Enable Voting":true,"Enable Commenting":true,"Action":/Disable Schedule/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Wait for Page to Load":true,"Title":/Idea1/.toString(),"Image File":/Image5.jpg/.toString(),"Image Crop or Cancel":/Crop/.toString(),"Description":/desc/.toString(),"Category":/Theme 1/.toString(),"Action":/Submit Idea/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Idea1/.toString())
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Access Idea":/Idea1/.toString())
        //Set Widget Controller
        new actions.Widgets.SetWidgetController().run("Widget Edit Mode":/Enable/.toString())
        //Set Widget On View Idea 3
        new actions.ViewIdea30.SetWidgetOnViewIdea3().run("Widget Title":/Submitted/.toString(),"Remove":true)
        //Set Widget Controller
        new actions.Widgets.SetWidgetController().run("Widget Edit Mode":/Disable/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Steps/.toString())
        //Access Idea in Pipeline Steps View
        new actions.PipelineStepsView.AccessIdeainPipelineStepsView().run("Idea Name":/Idea1/.toString())
        //Set Add Another Project Room in View Idea 3
        new actions.ViewIdea30.SetAddAnotherProjectRoominViewIdea3().run([:])
        //Send to Project Room
        new actions.PipelineStepsView.SendToProjectRoom().run("From the Actions Menu":false,"Existing or New":/Create Project Room/.toString(),"Title":/new pr/.toString(),"Action":/Submit/.toString(),"Wait":false)
        //Wait
        new actions.general.Wait().run("Seconds":/10/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/1/.toString())
        //Return Element ID of Project Room Image
        variables."elementLocation" = new actions.ProjectRoom.ReturnElementIDofProjectRoomImage().run("Project Image Location":/Left Bar Top/.toString())
        //Compare Images
        new actions.selenium.CompareImages().run("Element ID (optional)":/${variables."elementLocation"}/.toString(),"Expected Image File":/C132084_New_TopBar_ExpectedImage1.png/.toString(),"Actual Image Name":/C132084_New_TopBar_ActualImage.png/.toString())
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Top Link":/Project Room Settings/.toString())
        //Return Element ID of Project Room Image
        variables."elementLocation" = new actions.ProjectRoom.ReturnElementIDofProjectRoomImage().run("Project Image Location":/Preview Image in Room Settings/.toString())
        //Compare Images
        new actions.selenium.CompareImages().run("Element ID (optional)":/${variables."elementLocation"}/.toString(),"Expected Image File":/C132084_New_Preview_ExpectedImage2.png/.toString(),"Actual Image Name":/C132084_New_Preview_ActualImage.png/.toString())
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Room Item":/Idea1/.toString())
        try{
            //Compare Images
            new actions.selenium.CompareImages().run("Element ID (optional)":/\/\/*[contains(@class,'f-component f-idea-details')]\/*[contains(@class,'f-component-title') and text()='Stats']\/..\/../.toString(),"Expected Image File":/C132084_New_Widget_ExpectedImage1.png/.toString(),"Actual Image Name":/C132084_New_Widget_ActualImage.png/.toString(),"Allowed Number of Different Pixels":/200/.toString())
        }
       catch(all){println all}catch(Error err){println err}
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Project Room - Create Project Room
        new actions.ProjectRoom.ProjectRoomCreateProjectRoom().run([:])
        //Set and Verify Project Room Title
        new actions.ProjectRoom.SetProjectRoomTitle().run("Title":/Testing project room/.toString(),"Action":/Submit/.toString())
        //Set Project Room Image from Sidebar
        new actions.ProjectRoom.SetProjectRoomImagefromSidebar().run("Project Room Icon":/rgb(52, 152, 219)/.toString())
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Top Link":/Project Room Settings/.toString())
        //Set Room Settings In Project Room
        new actions.ProjectRoom.SetRoomSettingsInProjectRoom().run("Click on Generate Link":true)
        //Set Upload your Own Background
        new actions.WebstormHomepage.SetUploadyourOwnBackground().run("Choose File":/SamplePNG.png/.toString(),"Wait for Image to load":true,"Action":/Add Image/.toString())
        //Set Crop Image in Post Idea
        new actions.PostIdea.SetCropImageinPostIdea().run("Action":/Crop/.toString())
        //Set Project Room Image from Sidebar
        new actions.ProjectRoom.SetProjectRoomImagefromSidebar().run("Project Room Icon":/Image/.toString())
        //Return Element ID of Project Room Image
        variables."topBarElementLocation" = new actions.ProjectRoom.ReturnElementIDofProjectRoomImage().run("Project Image Location":/Left Bar Top/.toString())
        try{
            //Compare Images
            new actions.selenium.CompareImages().run("Element ID (optional)":/${variables."topBarElementLocation"}/.toString(),"Expected Image File":/C132084_Existing_TopBar_ExpectedImage2.png/.toString(),"Actual Image Name":/C132084_Existing_TopBar_ActualImage.png/.toString())
        }
       catch(all){println all}catch(Error err){println err}
        //Return Element ID of Project Room Image
        variables."previewImageElementLocation" = new actions.ProjectRoom.ReturnElementIDofProjectRoomImage().run("Project Image Location":/Preview Image in Room Settings/.toString())
        try{
            //Compare Images
            new actions.selenium.CompareImages().run("Element ID (optional)":/${variables."previewImageElementLocation"}/.toString(),"Expected Image File":/C132084_Existing_Preview_ExpectedImage2.png/.toString(),"Actual Image Name":/C132084_Existing_Preview_ActualImage.png/.toString())
        }
       catch(all){println all}catch(Error err){println err}
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Access Idea in Pipeline Steps View
        new actions.PipelineStepsView.AccessIdeainPipelineStepsView().run("Idea Name":/Idea1/.toString())
        //Set Add Another Project Room in View Idea 3
        new actions.ViewIdea30.SetAddAnotherProjectRoominViewIdea3().run([:])
        //Send to Project Room
        new actions.PipelineStepsView.SendToProjectRoom().run("From the Actions Menu":false,"Existing or New":/Existing Project Room/.toString(),"Title":/Testing project room/.toString(),"Action":/Submit/.toString(),"Wait":false)
        //Verify Toast Message in Tasks In Project Room
        new actions.ProjectRoom.VerifyToastMessageinTasksInProjectRoom().run("Message":/Your Project has been added to your project room. Testing project room/.toString(),"Click on the link":true)
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/2/.toString())
        try{
            //Compare Images
            new actions.selenium.CompareImages().run("Element ID (optional)":/${variables."topBarElementLocation"}/.toString(),"Expected Image File":/C132084_Existing_TopBar_ExpectedImage3.png/.toString(),"Actual Image Name":/C132084_Existing_TopBar_ActualImage.png/.toString())
        }
       catch(all){println all}catch(Error err){println err}
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Top Link":/Project Room Settings/.toString())
        try{
            //Compare Images
            new actions.selenium.CompareImages().run("Element ID (optional)":/${variables."previewImageElementLocation"}/.toString(),"Expected Image File":/C132084_Existing_Preview_ExpectedImage2.png/.toString(),"Actual Image Name":/C132084_Existing_Preview_ActualImage.png/.toString())
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
    //Delete this when Scheduler feature is enabled for everyone
    public static def Action66ec7933e12425a91ee5d983(def params){
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for BIOnly Beta tab
        new actions.SetupBI.SetEnterpriseSetupforBIOnlyBetatab().run("Scheduler updates":true,"Sync Phase and Scheduler Content":true)

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
            new actions.selenium.DeleteFile().run("File Name":/C132084_New_TopBar_ActualImage.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Name":/C132084_New_Preview_ActualImage.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Name":/C132084_New_Widget_ActualImage.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Name":/C132084_Existing_TopBar_ActualImage.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Name":/C132084_Existing_Preview_ActualImage.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Name":/C132084_Existing_Widget_ActualImage.png/.toString())
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