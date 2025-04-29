import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132121 - Project Room - Copy link for folder,stage and gate
class C132121_ProjectRoom_Copylinkforfolder_stageandgate
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
        //Delete this when stage and gate and custom template feature is enabled for everyone
        Action65cff68cd202e7e940131a38([:])
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
        //Set Tab in Room Settings in Project Room
        new actions.ProjectRoom.SetTabinRoomSettingsinProjectRoom().run("Tab":/Members/.toString())
        //Set Members in Project Room
        new actions.ProjectRoom.SetMembersinProjectRoom().run("Member":/End User,Pipeline Admin/.toString(),"Member Add or Remove":/Add,Add/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Stage/.toString())
        //Set Stage or Gate Name in Project Room
        new actions.ProjectRoom.SetStageorGateNameinProjectRoom().run("Stage or Gate Name":/Stage Name1/.toString(),"Action":/Add Stage/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Gate/.toString())
        //Set Stage or Gate Name in Project Room
        new actions.ProjectRoom.SetStageorGateNameinProjectRoom().run("Stage or Gate Name":/Gate Name1/.toString(),"Action":/Add Gate/.toString())
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Folder/.toString())
        //Set Stage or Gate Name in Project Room
        new actions.ProjectRoom.SetStageorGateNameinProjectRoom().run("Stage or Gate Name":/Folder1/.toString(),"Action":/Add Folder/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Verify and Access Project Room Card in Userhome
        new actions.ProjectRoom.VerifyProjectRoomCard().run("Title":/Testing project room/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString(),"Access Project Room":true)
        //Set Edit Menu for Room Pages in Project Room
        new actions.ProjectRoom.SetEditMenuforRoomPagesinProjectRoom().run("Room Page":/Stage Name1/.toString(),"Menu Options":/Copy link/.toString(),"Placement Number Of Folder or Page":/2/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Link has been copied!/.toString(),"Should Exist":true)
        //Get Clipboard Content
        variables."copiedURLForStage" = new actions.selenium.GetClipboardContent().run([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."copiedURLForStage"}/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Stage has not yet been assigned./.toString(),"Should Exist":true)
        //Set Edit Menu for Room Pages in Project Room
        new actions.ProjectRoom.SetEditMenuforRoomPagesinProjectRoom().run("Room Page":/Gate Name1/.toString(),"Menu Options":/Copy link/.toString(),"Placement Number Of Folder or Page":/3/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Link has been copied!/.toString(),"Should Exist":true)
        //Get Clipboard Content
        variables."copiedURLForGate" = new actions.selenium.GetClipboardContent().run([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."copiedURLForGate"}/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Gate Review/.toString(),"Should Exist":true)
        //Set Edit Menu for Room Pages in Project Room
        new actions.ProjectRoom.SetEditMenuforRoomPagesinProjectRoom().run("Room Page":/Folder1/.toString(),"Menu Options":/Copy link/.toString(),"Placement Number Of Folder or Page":/4/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Link has been copied!/.toString(),"Should Exist":true)
        //Get Clipboard Content
        variables."copiedURLForFolder" = new actions.selenium.GetClipboardContent().run([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."copiedURLForFolder"}/.toString())
        //Verify & Return Current URL Value
        new actions.selenium.VerifyURL().run("Value":/${variables."copiedURLForFolder"}/.toString())
        //Verify Folder Page Title in Project Room
        new actions.ProjectRoom.VerifyFolderPageinProjectRoom().run("Folder Name":/Folder: Folder1/.toString())
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
    //Delete this when stage and gate and custom template feature is enabled for everyone
    public static def Action65cff68cd202e7e940131a38(def params){
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for Beta tab
        new actions.SetupBeta.SetEnterpriseSetupforBetatab().run("Stage Gate Action Item":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for BIOnly Beta tab
        new actions.SetupBI.SetEnterpriseSetupforBIOnlyBetatab().run("Fall Stage Gate Updates":true,"Advanced Quick Add":true)
        try{
            //Navigate WebStorm or MTS
            new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/${params."Initiative"}/.toString(),"Area to Navigate to":/Setup/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Set Site Setup for BI Beta tab
            new actions.SetupBI.SetSiteSetupforBIBetatab().run("Stage Gate Workflow":true)
        }
       catch(all){}catch(Error err){}

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