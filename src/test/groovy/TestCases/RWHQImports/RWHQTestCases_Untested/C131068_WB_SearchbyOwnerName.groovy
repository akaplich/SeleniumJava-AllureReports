package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131068 - WB - Search by Owner Name
class C131068_WB_SearchbyOwnerName
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
        new actions.general.Navigate().run("Area to Navigate to":/Profile/.toString())
        //Edit Your Profile
        new actions.UserProfile.EditYourProfile().run("First Name":/Nicolas/.toString(),"Last Name":/Cage/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString(),"Highlights":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Whiteboards/.toString())
        //Create Whiteboard or Edit Template
        new actions.Whiteboards.CreateWhiteboardFromUserhome().run("Create a Whiteboard":/Brainwriting/.toString())
        //Set Whiteboard Title
        new actions.Whiteboards.EditTitleOfWhiteboard().run("Title":/whiteboard1/.toString(),"Action":/Submit/.toString())
        //Whiteboard - Set Share
        new actions.Whiteboards.SetShareWhiteboard().run("Click Share Button":true,"User(s)":/analyst@test.com/.toString(),"User Add or Remove":/Add/.toString(),"Send Invite":true,"Action":/Close/.toString())
        //Go Back From Whiteboard
        new actions.Whiteboards.GoBackFromWhiteboard().run([:])
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Whiteboards/.toString())
        //Create Whiteboard or Edit Template
        new actions.Whiteboards.CreateWhiteboardFromUserhome().run("Create a Whiteboard":/Brainwriting/.toString())
        //Set Whiteboard Title
        new actions.Whiteboards.EditTitleOfWhiteboard().run("Title":/Random/.toString(),"Action":/Submit/.toString())
        //Go Back From Whiteboard
        new actions.Whiteboards.GoBackFromWhiteboard().run([:])
        //Set Tab in Whiteboard List
        new actions.Whiteboards.SetTabinWhiteboardList().run("Tab":/Shared with Me/.toString())
        //Set Search whiteboard on Userhomepage
        new actions.Whiteboards.SetSearchWhiteboardOnUserhomepage().run("Search Field":/Cage/.toString())
        //Verify Whiteboard Card in Userhomepage
        new actions.Whiteboards.VerifyWhiteboard().run("Whiteboard Name":/Random/.toString(),"Last Edited Displayed":true,"Number of Matches":/0/.toString())
        //Verify Whiteboard Card in Userhomepage
        new actions.Whiteboards.VerifyWhiteboard().run("Whiteboard Name":/whiteboard1/.toString(),"Last Edited Displayed":true,"Number of Matches":/0/.toString())
        //Set Tab in Whiteboard List
        new actions.Whiteboards.SetTabinWhiteboardList().run("Tab":/My Whiteboards/.toString())
        //Set Search whiteboard on Userhomepage
        new actions.Whiteboards.SetSearchWhiteboardOnUserhomepage().run("Search Field":/Nicolas/.toString(),"Clear Field":true)
        //Verify Whiteboard Card in Userhomepage
        new actions.Whiteboards.VerifyWhiteboard().run("Whiteboard Name":/whiteboard1/.toString(),"Last Edited Displayed":true,"Number of Matches":/1/.toString())
        //Verify Whiteboard Card in Userhomepage
        new actions.Whiteboards.VerifyWhiteboard().run("Whiteboard Name":/Random/.toString(),"Last Edited Displayed":true,"Number of Matches":/1/.toString())
        //Set Search whiteboard on Userhomepage
        new actions.Whiteboards.SetSearchWhiteboardOnUserhomepage().run("Search Field":/bi.adminuser1@brightidea.com/.toString(),"Clear Field":true)
        //Verify Whiteboard Card in Userhomepage
        new actions.Whiteboards.VerifyWhiteboard().run("Whiteboard Name":/Random/.toString(),"Last Edited Displayed":true,"Number of Matches":/0/.toString())
        //Verify Whiteboard Card in Userhomepage
        new actions.Whiteboards.VerifyWhiteboard().run("Whiteboard Name":/whiteboard1/.toString(),"Last Edited Displayed":true,"Number of Matches":/0/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/analyst@test.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Whiteboards/.toString())
        //Create Whiteboard or Edit Template
        new actions.Whiteboards.CreateWhiteboardFromUserhome().run("Create a Whiteboard":/Brainwriting/.toString())
        //Set Whiteboard Title
        new actions.Whiteboards.EditTitleOfWhiteboard().run("Title":/whiteboard2/.toString(),"Action":/Submit/.toString())
        //Go Back From Whiteboard
        new actions.Whiteboards.GoBackFromWhiteboard().run([:])
        //Set Tab in Whiteboard List
        new actions.Whiteboards.SetTabinWhiteboardList().run("Tab":/Shared with Me/.toString())
        //Set Search whiteboard on Userhomepage
        new actions.Whiteboards.SetSearchWhiteboardOnUserhomepage().run("Search Field":/System Admin/.toString())
        //Verify Whiteboard Card in Userhomepage
        new actions.Whiteboards.VerifyWhiteboard().run("Whiteboard Name":/whiteboard1/.toString(),"Last Edited Displayed":true,"Number of Matches":/1/.toString())
        //Set Tab in Whiteboard List
        new actions.Whiteboards.SetTabinWhiteboardList().run("Tab":/All Whiteboards/.toString())
        //Set Search whiteboard on Userhomepage
        new actions.Whiteboards.SetSearchWhiteboardOnUserhomepage().run("Search Field":/Nicolas Cage/.toString(),"Clear Field":true)
        //Verify Whiteboard Card in Userhomepage
        new actions.Whiteboards.VerifyWhiteboard().run("Whiteboard Name":/whiteboard1/.toString(),"Last Edited Displayed":true,"Number of Matches":/1/.toString())
        //Verify Whiteboard Card in Userhomepage
        new actions.Whiteboards.VerifyWhiteboard().run("Whiteboard Name":/whiteboard2/.toString(),"Last Edited Displayed":true,"Number of Matches":/0/.toString())
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