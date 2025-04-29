package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132106 - Project Room - Mandatory External Link
class C132106_ProjectRoom_MandatoryExternalLink
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
        new actions.ProjectRoom.SetProjectRoomTitle().run("Title":/External Link Test/.toString(),"Action":/Submit/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Link/.toString())
        //Set Add External Link in Project Room
        new actions.ProjectRoom.SetAddExternalLinkinProjectRoom().run("Link Name":/Can't add without link/.toString(),"Action":/Submit/.toString())
        //Compare Images
        new actions.selenium.CompareImages().run("Expected Image File":/C132106_1_ExpectedWithPRLeftRailUpdate.png/.toString(),"Actual Image Name":/C132106_actual_1.png/.toString(),"Crop Screenshot Start at X":/10/.toString(),"Crop Screenshot Start at Y":/50/.toString(),"Crop Screenshot Width":/1550/.toString(),"Crop Screenshot Height":/750/.toString(),"Do Not Scroll":true)
        //Set Add External Link in Project Room
        new actions.ProjectRoom.SetAddExternalLinkinProjectRoom().run("Link Name":/This is a very long name for a link field in Project Room/.toString(),"Link URL":/www.brightidea.com/.toString(),"Action":/Submit/.toString())
        //Verify Folder Or Room Page In Project Room in Root Folder
        new actions.ProjectRoom.VerifyFolderOrRoomPageInProjectRoom().run("Placement Number of Child Page or Folder":/2/.toString(),"Child Page or Folder":/This is a very long name for a link field in Project Room/.toString(),"Number of Matches":/1/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/a[contains(@href,'http:\/\/www.brightidea.com')]\/\/div[contains(@class,'f-rooms-item-wrapper')]\/\/div/.toString(),"ID Type":/XPath/.toString(),"Type of Click":/Javascript/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/1/.toString())
        //Compare Images
        new actions.selenium.CompareImages().run("Expected Image File":/C132106_Expected.png/.toString(),"Actual Image Name":/C132106_Actual.png/.toString(),"Crop Screenshot Start at X":/10/.toString(),"Crop Screenshot Start at Y":/10/.toString(),"Crop Screenshot Width":/1800/.toString(),"Crop Screenshot Height":/600/.toString(),"Do Not Scroll":true)
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
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C132106_Actual.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C132106_actual_1.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/difference.png/.toString())
        }
       catch(all){}catch(Error err){}
    }
}