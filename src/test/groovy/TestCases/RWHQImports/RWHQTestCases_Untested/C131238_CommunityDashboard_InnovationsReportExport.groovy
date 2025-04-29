import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131238 - Community Dashboard - Innovations Report Export
class C131238_CommunityDashboard_InnovationsReportExport
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
        new actions.People.AddUserinPeoplepage().run("Email Address":/brightc131238@mailinator.com/.toString(),"First Name":/ABCommunity/.toString(),"Last Name":/Admin/.toString(),"Screen Name":/ABCommunity Admin/.toString(),"Administrator":true,"Action":/Add User/.toString())
        //Get Registration Link from Email
        variables."link" = new actions.Mailinator.GetRegistrationLinkfromEmail().run("Email Address":/brightc131238/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        //Complete User Registration
        new actions.general.CompleteUserRegistration().run("Password":/brightidea1/.toString(),"Confirm Password":/brightidea1/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Test App/.toString(),"Description":/desc/.toString(),"Action":/Create/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Select Community
        new actions.SetupEnterpriseCommunities.SelectCommunity().run("Community Name":/End User Community/.toString())
        //Update Community
        new actions.SetupEnterpriseCommunities.UpdateCommunity().run("Apps":/Test App/.toString(),"Checkbox Check":/TRUE/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Go to Community
        new actions.SetupEnterpriseCommunities.GotoCommunity().run("Community Name to go to":/Developers Community/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/test idea3/.toString(),"Description":/desc/.toString(),"Category":/New Product/.toString(),"Required Short Question":/short/.toString(),"Action":/Submit Idea/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser2@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Test App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/test idea5/.toString(),"Description":/desc/.toString(),"Category":/New Product/.toString(),"Action":/Submit Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Test App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/test idea4/.toString(),"Description":/desc/.toString(),"Category":/New Product/.toString(),"Action":/Submit Idea/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/brightc131238@mailinator.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Go to Community
        new actions.SetupEnterpriseCommunities.GotoCommunity().run("Community Name to go to":/End User Community/.toString())
        //Navigate Community Admin Bar Dropdown
        new actions.general.NavigateCommunityAdminBar().run("Area to Navigate to":/Dashboard/.toString())
        //Navigate To Analytics Dashboard and Tab
        new actions.NGAAnalyticsDashboard.NavigateToAnalyticsDashboardandTab().run("Dashboard":/Innovations Dashboard/.toString(),"Tab":/Overall/.toString())
        //Export Community Dashboard Report
        new actions.PipelineDashBoard.ExportCommunityDashboardReport().run("Action":/Export/.toString())
        //Get Download Link from Email
        variables."downloadURL" = new actions.Mailinator.GetDownloadLinkfromEmail().run("Email Address":/brightc131238/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."downloadURL"}/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/3/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/End User Community-Created-Innovations*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Innovation Id","Title","Description","Innovation Date Created","Submitter","Submitters Email"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."downloadURL"}/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/End User Community-Created-Innovations*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Submitters Department","Submitters Location","Actual Benefit","Projected Net Benefit","Comment Count"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."downloadURL"}/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/End User Community-Created-Innovations*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Vote Count","Innovation State","Step","Stage","Tags","Status","Challenge Open Date","Challenge Close Date"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."downloadURL"}/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/End User Community-Created-Innovations*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["D115","test idea4","desc","End User 2","bi.enduser2@brightidea.com","idea","Submitted","Collection","Active","Test App"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."downloadURL"}/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/End User Community-Created-Innovations*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["D114","test idea5","desc","End User 2","bi.enduser2@brightidea.com","idea","Submitted","Collection","Active","Test App"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Go to Community
        new actions.SetupEnterpriseCommunities.GotoCommunity().run("Community Name to go to":/Developers Community/.toString())
        //Navigate Community Admin Bar Dropdown
        new actions.general.NavigateCommunityAdminBar().run("Area to Navigate to":/Dashboard/.toString())
        //Navigate To Analytics Dashboard and Tab
        new actions.NGAAnalyticsDashboard.NavigateToAnalyticsDashboardandTab().run("Dashboard":/Innovations Dashboard/.toString(),"Tab":/Overall/.toString())
        //Export Community Dashboard Report
        new actions.PipelineDashBoard.ExportCommunityDashboardReport().run("Action":/Export/.toString())
        //Get Download Link from Email
        variables."downloadURL" = new actions.Mailinator.GetDownloadLinkfromEmail().run("Email Address":/brightc131238/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."downloadURL"}/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/3/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Developers Community-Created-Innovations*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Innovation Id","Title","Description","Innovation Date Created","Submitter","Submitters Email"],"Number of Matches":/1/.toString(),"Total Number of Rows":/5/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."downloadURL"}/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Developers Community-Created-Innovations*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["D113","test idea3","desc","End User","bi.enduser1@brightidea.com","Custom App"],"Number of Matches":/1/.toString(),"Total Number of Rows":/5/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."downloadURL"}/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Developers Community-Created-Innovations*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Test App"],"Number of Matches":/0/.toString(),"Total Number of Rows":/5/.toString())
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