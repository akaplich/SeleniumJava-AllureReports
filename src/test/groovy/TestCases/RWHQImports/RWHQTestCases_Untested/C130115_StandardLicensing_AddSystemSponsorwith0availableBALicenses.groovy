import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C130115 - Standard Licensing - Add System Sponsor with 0 available BA Licenses
class C130115_StandardLicensing_AddSystemSponsorwith0availableBALicenses
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Brightidea Administrator License Type Purchased Count":/1/.toString(),"Idea Box Manager License Type Purchased Count":/4/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Verify Info Message for Standard Licensing
        new actions.SetupUsers.VerifyInfoMessageonPeoplePillarandAdministratorTab().run("Area":/System Setup/.toString(),"Info Message":/Assigning a user to either the Affiliate Sponsor or System Administrator role requires granting the user a Brightidea Administrator License (1 Available). Any other license will be removed from the user; role assignments will not be affected.Get more licenses/.toString(),"Info Message Exists":true)
        //Set Enterprise Setup Users Administrators page
        new actions.SetupUsers.SetEnterpriseSetupUsersAdministratorspage().run("Affiliate Sponsor":/NonBI System Admin/.toString())
        //Verify Info Message for Standard Licensing
        new actions.SetupUsers.VerifyInfoMessageonPeoplePillarandAdministratorTab().run("Info Message":/There are no Brightidea Administrator Licenses available. Assigning a user to either the Affiliate Sponsor or System Administrator role requires granting the user a Brightidea Administrator License. Only users that have already been granted a license will display in the search results.Get more licenses/.toString(),"Info Message Exists":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Select Product in Apps Pillar Page
        new actions.AppsPillar.SelectProductinAppsPillarPage().run("Product":/Programs/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Advanced Ideabox/.toString(),"Sponsor Name":/Sri/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Advanced Ideabox Pipeline/.toString(),"Description":/desc/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Advanced Ideabox Pipeline/.toString(),"Area to Navigate to":/Pipeline Setup/.toString())
        //Set Roles in Pipeline Setup Page
        new actions.PipelineSetup.SetRolesinPipelineSetupPage().run("Type of Licensing Model":/Standard Licensing Model/.toString(),"Navigate to Tab":true,"Admin Field Name":/Pipeline Managers/.toString(),"Administrators":/Pipeline Admin/.toString(),"Administrators Add or Remove":/Add/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Verify Licenses Metrics in People Pillar
        new actions.People.VerifyLicensesMetricsinPeoplePillar().run("License Type":/Brightidea Administrator License Type/.toString(),"Metric Text":/Purchased/.toString(),"Metric Value":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Licenses Metrics in People Pillar
        new actions.People.VerifyLicensesMetricsinPeoplePillar().run("License Type":/Brightidea Administrator License Type/.toString(),"Metric Text":/In Use/.toString(),"Metric Value":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Licenses Metrics in People Pillar
        new actions.People.VerifyLicensesMetricsinPeoplePillar().run("License Type":/Idea Box Manager License Type/.toString(),"Metric Text":/In Use/.toString(),"Metric Value":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Licenses User in People Pillar Licenses tab
        new actions.People.VerifyLicensesUserinPeoplePillarLicensesTab().run("License Type":/Brightidea Administrator License Type/.toString(),"Expand License Breakdown":true,"User":/NonBI System Admin/.toString(),"Roles":/System Sponsor/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Set Back to Licenses on Licenses Tab
        new actions.People.SetBacktoLicensesonLicensesTab().run([:])
        //Verify Licenses User in People Pillar Licenses tab
        new actions.People.VerifyLicensesUserinPeoplePillarLicensesTab().run("License Type":/Idea Box Manager License Type/.toString(),"Expand License Breakdown":true,"User":/Pipeline Admin/.toString(),"Roles":/Pipeline Manager/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Verify Info Message for Standard Licensing
        new actions.SetupUsers.VerifyInfoMessageonPeoplePillarandAdministratorTab().run("Area":/System Setup/.toString(),"Info Message":/There are no Brightidea Administrator Licenses available. Assigning a user to either the Affiliate Sponsor or System Administrator role requires granting the user a Brightidea Administrator License. Only users that have already been granted a license will display in the search results.Get more licenses/.toString(),"Info Message Exists":true)
        //Set Enterprise Setup Users Administrators page
        new actions.SetupUsers.SetEnterpriseSetupUsersAdministratorspage().run("Affiliate Sponsor":/Moderator/.toString())
        //Verify Info Message for Standard Licensing
        new actions.SetupUsers.VerifyInfoMessageonPeoplePillarandAdministratorTab().run("Area":/System Setup/.toString(),"Info Message":/There are no Brightidea Administrator Licenses available. Assigning a user to either the Affiliate Sponsor or System Administrator role requires granting the user a Brightidea Administrator License. Only users that have already been granted a license will display in the search results.Get more licenses/.toString(),"Info Message Exists":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Verify Licenses Metrics in People Pillar
        new actions.People.VerifyLicensesMetricsinPeoplePillar().run("License Type":/Brightidea Administrator License Type/.toString(),"Metric Text":/In Use/.toString(),"Metric Value":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Licenses Metrics in People Pillar
        new actions.People.VerifyLicensesMetricsinPeoplePillar().run("License Type":/Idea Box Manager License Type/.toString(),"Metric Text":/In Use/.toString(),"Metric Value":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Licenses User in People Pillar Licenses tab
        new actions.People.VerifyLicensesUserinPeoplePillarLicensesTab().run("License Type":/Brightidea Administrator License Type/.toString(),"Expand License Breakdown":true,"User":/Moderator/.toString(),"Roles":/System Sponsor/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Licenses User in People Pillar Licenses tab
        new actions.People.VerifyLicensesUserinPeoplePillarLicensesTab().run("License Type":/Brightidea Administrator License Type/.toString(),"Expand License Breakdown":false,"User":/NonBI System Admin/.toString(),"Roles":/System Sponsor/.toString(),"Number of Matches":/0/.toString())
        //Set Back to Licenses on Licenses Tab
        new actions.People.SetBacktoLicensesonLicensesTab().run([:])
        //Verify Licenses User in People Pillar Licenses tab
        new actions.People.VerifyLicensesUserinPeoplePillarLicensesTab().run("License Type":/Idea Box Manager License Type/.toString(),"Expand License Breakdown":true,"User":/Pipeline Admin/.toString(),"Roles":/Pipeline Manager/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Verify Info Message for Standard Licensing
        new actions.SetupUsers.VerifyInfoMessageonPeoplePillarandAdministratorTab().run("Area":/System Setup/.toString(),"Info Message":/There are no Brightidea Administrator Licenses available. Assigning a user to either the Affiliate Sponsor or System Administrator role requires granting the user a Brightidea Administrator License. Only users that have already been granted a license will display in the search results.Get more licenses/.toString(),"Info Message Exists":true)
        //Set Enterprise Setup Users Administrators page
        new actions.SetupUsers.SetEnterpriseSetupUsersAdministratorspage().run("Affiliate Sponsor":/Pipeline Admin/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Verify Licenses Metrics in People Pillar
        new actions.People.VerifyLicensesMetricsinPeoplePillar().run("License Type":/Brightidea Administrator License Type/.toString(),"Metric Text":/In Use/.toString(),"Metric Value":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Licenses Metrics in People Pillar
        new actions.People.VerifyLicensesMetricsinPeoplePillar().run("License Type":/Idea Box Manager License Type/.toString(),"Metric Text":/In Use/.toString(),"Metric Value":/0/.toString(),"Number of Matches":/1/.toString())
        //Verify Licenses User in People Pillar Licenses tab
        new actions.People.VerifyLicensesUserinPeoplePillarLicensesTab().run("License Type":/Brightidea Administrator License Type/.toString(),"Expand License Breakdown":true,"User":/Moderator/.toString(),"Roles":/System Sponsor/.toString(),"Number of Matches":/0/.toString())
        //Verify Licenses User in People Pillar Licenses tab
        new actions.People.VerifyLicensesUserinPeoplePillarLicensesTab().run("License Type":/Brightidea Administrator License Type/.toString(),"Expand License Breakdown":false,"User":/Pipeline Admin/.toString(),"Roles":/System Sponsor,Pipeline Manager/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Users Administrators page
        new actions.SetupUsers.SetEnterpriseSetupUsersAdministratorspage().run("Affiliate Sponsor":/End User/.toString())
        //Verify Info Message for Standard Licensing
        new actions.SetupUsers.VerifyInfoMessageonPeoplePillarandAdministratorTab().run("Info Message":/There are no Brightidea Administrator Licenses available. Assigning a user to either the Affiliate Sponsor or System Administrator role requires granting the user a Brightidea Administrator License. Only users that have already been granted a license will display in the search results.Get more licenses/.toString(),"Info Message Exists":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Verify Licenses Metrics in People Pillar
        new actions.People.VerifyLicensesMetricsinPeoplePillar().run("License Type":/Brightidea Administrator License Type/.toString(),"Metric Text":/In Use/.toString(),"Metric Value":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Licenses Metrics in People Pillar
        new actions.People.VerifyLicensesMetricsinPeoplePillar().run("License Type":/Idea Box Manager License Type/.toString(),"Metric Text":/In Use/.toString(),"Metric Value":/0/.toString(),"Number of Matches":/1/.toString())
        //Verify Licenses User in People Pillar Licenses tab
        new actions.People.VerifyLicensesUserinPeoplePillarLicensesTab().run("License Type":/Brightidea Administrator License Type/.toString(),"Expand License Breakdown":true,"User":/Pipeline Admin/.toString(),"Roles":/Pipeline Manager/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
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