import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C128065 - Cross-Collaboration chart within Pipeline Dashboard
class C128065_Cross_CollaborationchartwithinPipelineDashboard
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
        //Open Browser
        new actions.selenium.Browser().run("Browser Type":/Chrome/.toString())
        //Navigate to Other Affiliate
        new actions.general.NavigatetoSSOAffiliate().run("DomainName":/ssoaffiliateforautomation/.toString())
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/New Custom App1/.toString(),"Area to Navigate to":/Pipeline Dashboard/.toString())
        //Navigate To Pipeline DashBoard Tab
        new actions.PipelineDashBoard.NavigateToPipelineDashBoardTab().run("Tab":/Engagement/.toString())
        //Verify Cross Collaboration Map in Engagement tab in Pipeline Dashboard
        new actions.PipelineDashBoard.VerifyCrossCollaborationMapinEngagementtabinPipelineDashboard().run("View By":/Department/.toString(),"Location or Department":/Autom.../.toString(),"ToolTip Location or Department":/Automation/.toString(),"ToolTip Collaborator Section Value":/1/.toString(),"ToolTip Collaboration Section Title":/Departments/.toString(),"ToolTip Cross-Collaborations":/2/.toString(),"Collaborator Link Count":/2/.toString(),"Collaborator Link Name":/Innovation/.toString(),"ToolTip Cross-Collaborators":/2/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/New Custom App1/.toString(),"Area to Navigate to":/Pipeline Dashboard/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Navigate To Pipeline DashBoard Tab
        new actions.PipelineDashBoard.NavigateToPipelineDashBoardTab().run("Tab":/Engagement/.toString())
        //Verify Cross Collaboration Map in Engagement tab in Pipeline Dashboard
        new actions.PipelineDashBoard.VerifyCrossCollaborationMapinEngagementtabinPipelineDashboard().run("View By":/Location/.toString(),"Location or Department":/Europe/.toString(),"ToolTip Location or Department":/Europe/.toString(),"ToolTip Collaborator Section Value":/1/.toString(),"ToolTip Collaboration Section Title":/Locations/.toString(),"ToolTip Cross-Collaborations":/1/.toString(),"Collaborator Link Count":/1/.toString(),"Collaborator Link Name":/United States/.toString(),"ToolTip Cross-Collaborators":/1/.toString())
    }
    @AfterMethod
    public void afterState(){
        //Close All Browsers
        new actions.selenium.CloseBrowser().run([:])
    }
}