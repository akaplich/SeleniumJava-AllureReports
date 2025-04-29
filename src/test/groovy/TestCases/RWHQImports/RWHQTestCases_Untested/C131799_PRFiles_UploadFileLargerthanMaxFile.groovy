package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C131799 - PR Files > Upload File Larger than Max File
class C131799_PRFiles_UploadFileLargerthanMaxFile
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
        //Set Enterprise Setup for BIOnly Beta tab
        new actions.SetupBI.SetEnterpriseSetupforBIOnlyBetatab().run("Attachment Max Upload Filesize":/2/.toString())
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
        new actions.ViewIdea.TeamWorkspace.SetFilesinTeamWorkspace().run("Verify in Which Tab (optional)":/Files/.toString(),"Attachment File":/ImageOver1MBAndLessThan2MB.png/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Set Files in Team Workspace
        new actions.ViewIdea.TeamWorkspace.SetFilesinTeamWorkspace().run("Verify in Which Tab (optional)":/Files/.toString(),"Attachment File":/NonVideoFileOver1MBAndLessThan2MB.SLDASM/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Set Files in Team Workspace
        new actions.ViewIdea.TeamWorkspace.SetFilesinTeamWorkspace().run("Verify in Which Tab (optional)":/Files/.toString(),"Attachment File":/VideoFileOver1MBAndLessThan2MB.mp4/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Verify Files in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyFilesinTeamWorkspace().run("Attachment Name":/VideoFileOver1MBAndLessThan2MB.mp4/.toString(),"Number of Matches":/1/.toString())
        //Verify Files in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyFilesinTeamWorkspace().run("Attachment Name":/NonVideoFileOver1MBAndLessThan2MB.SLDASM/.toString(),"Number of Matches":/1/.toString())
        //Verify Files in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyFilesinTeamWorkspace().run("Attachment Name":/ImageOver1MBAndLessThan2MB.png/.toString(),"Number of Matches":/1/.toString())
        //Set Files in Team Workspace
        new actions.ViewIdea.TeamWorkspace.SetFilesinTeamWorkspace().run("Verify in Which Tab (optional)":/Files/.toString(),"Attachment File":/ImageOver2MB.jpg/.toString(),"Wait for attachment":false)
        //Verify Error Toast Message for Files
        new actions.ProjectRoom.VerifyErrorToastMessageforFiles().run("Message":/File is too large. Limit is 2MB./.toString())
        //Verify Files in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyFilesinTeamWorkspace().run("Attachment Name":/ImageOver2MB.jpg/.toString(),"Number of Matches":/0/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Set Files in Team Workspace
        new actions.ViewIdea.TeamWorkspace.SetFilesinTeamWorkspace().run("Verify in Which Tab (optional)":/Files/.toString(),"Attachment File":/NonVideoFileOver2MB.pptx/.toString(),"Wait for attachment":false)
        //Verify Error Toast Message for Files
        new actions.ProjectRoom.VerifyErrorToastMessageforFiles().run("Message":/File is too large. Limit is 2MB./.toString())
        //Verify Files in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyFilesinTeamWorkspace().run("Attachment Name":/NonVideoFileOver2MB.pptx/.toString(),"Number of Matches":/0/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Set Files in Team Workspace
        new actions.ViewIdea.TeamWorkspace.SetFilesinTeamWorkspace().run("Verify in Which Tab (optional)":/Files/.toString(),"Attachment File":/VideoOver2MB.mp4/.toString(),"Wait for attachment":false)
        //Verify Error Toast Message for Files
        new actions.ProjectRoom.VerifyErrorToastMessageforFiles().run("Message":/File is too large. Limit is 2MB./.toString())
        //Verify Files in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyFilesinTeamWorkspace().run("Attachment Name":/VideoOver2MB.mp4/.toString(),"Number of Matches":/0/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Verify Files in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyFilesinTeamWorkspace().run("Attachment Name":/VideoFileOver1MBAndLessThan2MB.mp4/.toString(),"Number of Matches":/1/.toString())
        //Verify Files in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyFilesinTeamWorkspace().run("Attachment Name":/ImageOver2MB.jpg/.toString(),"Number of Matches":/0/.toString())
        //Verify Files in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyFilesinTeamWorkspace().run("Attachment Name":/NonVideoFileOver2MB.pptx/.toString(),"Number of Matches":/0/.toString())
        //Verify Files in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyFilesinTeamWorkspace().run("Attachment Name":/VideoOver2MB.mp4/.toString(),"Number of Matches":/0/.toString())
        //Verify Files in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyFilesinTeamWorkspace().run("Attachment Name":/NonVideoFileOver1MBAndLessThan2MB.SLDASM/.toString(),"Number of Matches":/1/.toString())
        //Verify Files in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyFilesinTeamWorkspace().run("Attachment Name":/ImageOver1MBAndLessThan2MB.png/.toString(),"Number of Matches":/1/.toString())
        //Set Files in Team Workspace
        new actions.ViewIdea.TeamWorkspace.SetFilesinTeamWorkspace().run("Verify in Which Tab (optional)":/Files/.toString(),"Attachment File":/VideoOver2MB.mp4/.toString(),"Wait for attachment":false)
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Files/.toString())
        //Set Edit Menu for Room Pages in Project Room
        new actions.ProjectRoom.SetEditMenuforRoomPagesinProjectRoom().run("Room Page":/Files/.toString(),"Menu Options":/Rename/.toString(),"Placement Number Of Folder or Page":/2/.toString())
        //Set Rename Page in Project Room
        new actions.ProjectRoom.SetRenamePageinProjectRoom().run("New Page Name":/Files2/.toString(),"Action":/Rename Files/.toString())
        //Set Files in Team Workspace
        new actions.ViewIdea.TeamWorkspace.SetFilesinTeamWorkspace().run("Verify in Which Tab (optional)":/Files2/.toString(),"Attachment File":/VideoOver2MB.mp4,ImageOver1MBAndLessThan2MB.png,NonVideoFileOver1MBAndLessThan2MB.SLDASM,VideoFileOver1MBAndLessThan2MB.mp4/.toString(),"Wait for attachment":false)
        //Verify Error Toast Message for Files
        new actions.ProjectRoom.VerifyErrorToastMessageforFiles().run("Message":/File is too large. Limit is 2MB./.toString())
        //Verify Files in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyFilesinTeamWorkspace().run("Attachment Name":/ImageOver1MBAndLessThan2MB.png/.toString(),"Number of Matches":/1/.toString())
        //Verify Files in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyFilesinTeamWorkspace().run("Attachment Name":/VideoFileOver1MBAndLessThan2MB.mp4/.toString(),"Number of Matches":/1/.toString())
        //Verify Files in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyFilesinTeamWorkspace().run("Attachment Name":/VideoOver2MB.mp4/.toString(),"Number of Matches":/0/.toString())
        //Verify Files in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyFilesinTeamWorkspace().run("Attachment Name":/NonVideoFileOver1MBAndLessThan2MB.SLDASM/.toString(),"Number of Matches":/1/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Verify Files in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyFilesinTeamWorkspace().run("Attachment Name":/ImageOver1MBAndLessThan2MB.png/.toString(),"Number of Matches":/1/.toString())
        //Verify Files in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyFilesinTeamWorkspace().run("Attachment Name":/VideoFileOver1MBAndLessThan2MB.mp4/.toString(),"Number of Matches":/1/.toString())
        //Verify Files in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyFilesinTeamWorkspace().run("Attachment Name":/NonVideoFileOver1MBAndLessThan2MB.SLDASM/.toString(),"Number of Matches":/1/.toString())
        //Verify Files in Team Workspace
        new actions.ViewIdea.TeamWorkspace.VerifyFilesinTeamWorkspace().run("Attachment Name":/VideoOver2MB.mp4/.toString(),"Number of Matches":/0/.toString())
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