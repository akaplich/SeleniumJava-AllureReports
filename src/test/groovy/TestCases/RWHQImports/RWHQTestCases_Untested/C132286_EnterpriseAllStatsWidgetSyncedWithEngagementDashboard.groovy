import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132286 - Enterprise All Stats Widget Synced With Engagement Dashboard
class C132286_EnterpriseAllStatsWidgetSyncedWithEngagementDashboard
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
        new actions.general.NavigatetoSSOAffiliate().run("DomainName":/crossaffiliatetesting2/.toString())
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Analytics/.toString())
        //Navigate To Analytics Dashboard and Tab
        new actions.NGAAnalyticsDashboard.NavigateToAnalyticsDashboardandTab().run("Dashboard":/Engagement Dashboard/.toString(),"Tab":/Overall/.toString())
        //Verify Engagement Tab - Participation by Activity
        new actions.PipelineDashBoard.VerifyParticipationbyActivity().run("Chart View":/Month to Date/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Verify Engagement Tab - Participation by Activity
        new actions.PipelineDashBoard.VerifyParticipationbyActivity().run("Chart View":/All Time/.toString(),"Submitted":/1/.toString(),"Submitted - Subtitle":/(6 Innovations)/.toString(),"Commented":/1/.toString(),"Commented - Subtitle":/(1 Comments)/.toString(),"Voted":/1/.toString(),"Voted - Subtitle":/(6 Votes)/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Verify Widget Enterprise All Stats
        new actions.Widgets.VerifyWidgetEnterpriseAllStats().run("submissions":/6/.toString(),"comment":/1/.toString(),"votes":/6/.toString(),"users":/1/.toString())
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