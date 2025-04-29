package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131798 - PR Files > Upload Non Supported File
class C131798_PRFiles_UploadNonSupportedFile
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
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Files/.toString())
        //Set Files in Team Workspace
        new actions.ViewIdea.TeamWorkspace.SetFilesinTeamWorkspace().run("Verify in Which Tab (optional)":/Files/.toString(),"Attachment File":/example1.exe/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/File type not allowed./.toString(),"Should Exist":true)
        //Verify Files in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyFilesinTeamWorkspace().run("Attachment Name":/example1.exe/.toString(),"Number of Matches":/0/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Verify Files in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyFilesinTeamWorkspace().run("Attachment Name":/example1.exe/.toString(),"Number of Matches":/0/.toString())
        //Set Files in Team Workspace
        new actions.ViewIdea.TeamWorkspace.SetFilesinTeamWorkspace().run("Verify in Which Tab (optional)":/Files/.toString(),"Attachment File":/example1.exe,Image5.jpg,SamplePDF.pdf/.toString(),"Wait for attachment":false)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/File type not allowed./.toString(),"Should Exist":true)
        //Verify Files in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyFilesinTeamWorkspace().run("Attachment Name":/example1.exe/.toString(),"Number of Matches":/0/.toString())
        //Verify Files in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyFilesinTeamWorkspace().run("Attachment Name":/Image5.jpg/.toString(),"Number of Matches":/1/.toString())
        //Verify Files in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyFilesinTeamWorkspace().run("Attachment Name":/SamplePDF.pdf/.toString(),"Number of Matches":/1/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Verify Files in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyFilesinTeamWorkspace().run("Attachment Name":/Image5.jpg/.toString(),"Number of Matches":/1/.toString())
        //Verify Files in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyFilesinTeamWorkspace().run("Attachment Name":/SamplePDF.pdf/.toString(),"Number of Matches":/1/.toString())
        //Verify Files in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyFilesinTeamWorkspace().run("Attachment Name":/example1.exe/.toString(),"Number of Matches":/0/.toString())
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