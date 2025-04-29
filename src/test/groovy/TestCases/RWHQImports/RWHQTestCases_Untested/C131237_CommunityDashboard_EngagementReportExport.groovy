import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C131237 - Community Dashboard - Engagement Report Export
class C131237_CommunityDashboard_EngagementReportExport
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
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Add User in People page
        new actions.People.AddUserinPeoplepage().run("Email Address":/brightc131237_2@mailinator.com/.toString(),"First Name":/ABCommunity/.toString(),"Last Name":/Admin/.toString(),"Screen Name":/ABCommunity Admin/.toString(),"Administrator":true,"Action":/Add User/.toString())
        //Get Registration Link from Email
        variables."link" = new actions.Mailinator.GetRegistrationLinkfromEmail().run("Email Address":/brightc131237_2/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        //Complete User Registration
        new actions.general.CompleteUserRegistration().run("Password":/brightidea1/.toString(),"Confirm Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Add Community
        new actions.SetupEnterpriseCommunities.AddCommunity().run("Community Name":/Test1 Community/.toString(),"Action":/Create/.toString())
        //Select Community
        new actions.SetupEnterpriseCommunities.SelectCommunity().run("Community Name":/Test1 Community/.toString())
        //Update Community
        new actions.SetupEnterpriseCommunities.UpdateCommunity().run("Apps":/Custom App/.toString(),"Checkbox Check":/TRUE/.toString())
        //Update Community
        new actions.SetupEnterpriseCommunities.UpdateCommunity().run("Apps":/Solve App/.toString(),"Checkbox Check":/TRUE/.toString())
        //Go to Community
        new actions.SetupEnterpriseCommunities.GotoCommunity().run("Community Name to go to":/Test1 Community/.toString())
        //Copy Current URL
        variables."link" = new actions.selenium.CopyCurrentURL().run([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Add Community
        new actions.SetupEnterpriseCommunities.AddCommunity().run("Community Name":/Test2 Community/.toString(),"Action":/Create/.toString())
        //Select Community
        new actions.SetupEnterpriseCommunities.SelectCommunity().run("Community Name":/Test2 Community/.toString())
        //Update Community
        new actions.SetupEnterpriseCommunities.UpdateCommunity().run("Apps":/Evaluators app/.toString(),"Checkbox Check":/TRUE/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/brightc131237_2@mailinator.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        //Navigate Community Admin Bar Dropdown
        new actions.general.NavigateCommunityAdminBar().run("Area to Navigate to":/Dashboard/.toString())
        //Navigate To Analytics Dashboard and Tab
        new actions.NGAAnalyticsDashboard.NavigateToAnalyticsDashboardandTab().run("Dashboard":/Engagement Dashboard/.toString())
        //Export Community Dashboard Report
        new actions.PipelineDashBoard.ExportCommunityDashboardReport().run("Action":/Export/.toString())
        //Get Download Link from Email
        variables."downloadURL" = new actions.Mailinator.GetDownloadLinkfromEmail().run("Email Address":/brightc131237_2/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."downloadURL"}/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/3/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Test1 Community-Engagement*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["User Id","Email Address","Date Created","Last Visited","Department","Location","Innovations Submitted","Votes Submitted"],"Number of Matches":/1/.toString(),"Total Number of Rows":/1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."downloadURL"}/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Test1 Community-Engagement*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Last Participated"],"Number of Matches":/1/.toString(),"Total Number of Rows":/1/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Navigate to Community in Community Dashboard
        new actions.NGAAnalyticsDashboard.NavigateCommunityCommunityDashboard().run("Select Community":/Test2 Community/.toString())
        //Export Community Dashboard Report
        new actions.PipelineDashBoard.ExportCommunityDashboardReport().run("Action":/Export/.toString())
        //Get Download Link from Email
        variables."downloadURL" = new actions.Mailinator.GetDownloadLinkfromEmail().run("Email Address":/brightc131237_2/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."downloadURL"}/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/3/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Test2 Community-Engagement*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["User Id","Email Address","Date Created","Last Visited","Department","Location","Innovations Submitted","Votes Submitted"],"Number of Matches":/1/.toString(),"Total Number of Rows":/1/.toString())
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