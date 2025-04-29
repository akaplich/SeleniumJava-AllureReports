import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C132495 - Hackathon Dashboard - Event Overview - ssoaffiliateforautomation
class C132495_HackathonDashboard_EventOverview_ssoaffiliateforautomation
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
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hackathon Dashboard Alpha/.toString(),"Area to Navigate to":/Pipeline Dashboard/.toString())
        //Navigate To Pipeline DashBoard Tab
        new actions.PipelineDashBoard.NavigateToPipelineDashBoardTab().run("Tab":/Event Overview/.toString())
        try{
            //Verify Hackathon Dashboard Event Overview
            new actions.PipelineDashBoard.VerifyHackathonDashboardEventOverviewPipelineDashboard().run("Visitors":/4/.toString(),"Participants":/3/.toString(),"Teams":/2/.toString(),"Ideas":/3/.toString(),"Votes":/4/.toString(),"Comments":/2/.toString(),"User Engagement Funnel Label":/23.1% of permitted users have participated./.toString(),"Submitted Ideas Per User Label":/The average participant submitted 1.0 ideas./.toString(),"Participants Per Team":/The average team has 1.5 participants./.toString(),"Percent of Highly Engaged Users":/66.67%/.toString(),"Percent Of Total Ideas in Draft":/25/.toString(),"Participants on Multiple Teams":/4/.toString(),"Heatmap Level 1 Count":/0/.toString(),"Heatmap Level 2 Count":/0/.toString(),"Heatmap Level 3 Count":/1/.toString(),"Heatmap Level 4 Count":/0/.toString(),"Heatmap Level 5 Count":/1/.toString())
        }
       catch(all){println all}catch(Error err){println err}
    }
    @AfterMethod
    public void afterState(){
    }
}