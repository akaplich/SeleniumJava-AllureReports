import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C128067 - Cross-Collaboration metric within Pipeline Dashboard
class C128067_Cross_CollaborationmetricwithinPipelineDashboard
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
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/New Custom App1/.toString(),"Area to Navigate to":/Pipeline Dashboard/.toString())
        //Navigate To Pipeline DashBoard Tab
        new actions.PipelineDashBoard.NavigateToPipelineDashBoardTab().run("Tab":/Engagement/.toString())
        //Verify the Cross Collaboration Metric in Engagement tab in Pipeline Dashboard
        new actions.PipelineDashBoard.VerifytheCrossCollaborationMetricinEngagementtabinPipelineDashboard().run("View By":/Department/.toString(),"Metric Label":/Total Cross-Collaborations/.toString(),"Value":/2/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify the Cross Collaboration Metric in Engagement tab in Pipeline Dashboard
        new actions.PipelineDashBoard.VerifytheCrossCollaborationMetricinEngagementtabinPipelineDashboard().run("Metric Label":/Cross-Collaborators/.toString(),"Value":/2/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify the Cross Collaboration Metric in Engagement tab in Pipeline Dashboard
        new actions.PipelineDashBoard.VerifytheCrossCollaborationMetricinEngagementtabinPipelineDashboard().run("Metric Label":/Cross-Collaborating Departments/.toString(),"Value":/2/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify the Cross Collaboration Metric in Engagement tab in Pipeline Dashboard
        new actions.PipelineDashBoard.VerifytheCrossCollaborationMetricinEngagementtabinPipelineDashboard().run("View By":/Location/.toString(),"Metric Label":/Total Cross-Collaborations/.toString(),"Value":/2/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify the Cross Collaboration Metric in Engagement tab in Pipeline Dashboard
        new actions.PipelineDashBoard.VerifytheCrossCollaborationMetricinEngagementtabinPipelineDashboard().run("Metric Label":/Cross-Collaborators/.toString(),"Value":/1/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify the Cross Collaboration Metric in Engagement tab in Pipeline Dashboard
        new actions.PipelineDashBoard.VerifytheCrossCollaborationMetricinEngagementtabinPipelineDashboard().run("Metric Label":/Cross-Collaborating Locations/.toString(),"Value":/1/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
    }
    @AfterMethod
    public void afterState(){
        //Close All Browsers
        new actions.selenium.CloseBrowser().run([:])
    }
}