import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131823 - Project Room > Message on deleted or private project room link
class C131823_ProjectRoom_Messageondeletedorprivateprojectroomlink
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
        new actions.ProjectRoom.SetProjectRoomTitle().run("Title":/Project room1/.toString(),"Action":/Submit/.toString())
        //Copy Current URL
        variables."currentURL" = new actions.selenium.CopyCurrentURL().run([:])
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Top Link":/Project Room Settings/.toString())
        //Set Tab in Room Settings in Project Room
        new actions.ProjectRoom.SetTabinRoomSettingsinProjectRoom().run("Tab":/Settings/.toString())
        //Set Room Settings In Project Room
        new actions.ProjectRoom.SetRoomSettingsInProjectRoom().run("Action":/Delete Room/.toString(),"Delete Project Room Action":/Delete/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."currentURL"}/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Either this Project Room no longer exists or you don't have permission to view it. Ask the owner to verify the link and update the permissions./.toString(),"Should Exist":true)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Project Room not found/.toString(),"Should Exist":true)
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/A[text()='Take me to my Project Rooms']/.toString(),"ID Type":/XPath/.toString())
        //Verify & Return Current URL Value
        new actions.selenium.VerifyURL().run("Contains Value":/${variables."affiliateURL"}\/userhome\/project_room/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/You have no available Project Rooms/.toString(),"Should Exist":true)
        //Project Room - Create Project Room
        new actions.ProjectRoom.ProjectRoomCreateProjectRoom().run([:])
        //Set and Verify Project Room Title
        new actions.ProjectRoom.SetProjectRoomTitle().run("Title":/Project room2/.toString(),"Action":/Submit/.toString())
        //Copy Current URL
        variables."currentURL1" = new actions.selenium.CopyCurrentURL().run([:])
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."currentURL1"}/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Either this Project Room no longer exists or you don't have permission to view it. Ask the owner to verify the link and update the permissions./.toString(),"Should Exist":true)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Project Room not found/.toString(),"Should Exist":true)
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/A[text()='Take me to my Project Rooms']/.toString(),"ID Type":/XPath/.toString())
        //Verify & Return Current URL Value
        new actions.selenium.VerifyURL().run("Contains Value":/${variables."affiliateURL"}\/userhome\/project_room/.toString())
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