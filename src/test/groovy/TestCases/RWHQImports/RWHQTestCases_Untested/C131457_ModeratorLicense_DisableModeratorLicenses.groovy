import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131457 - Moderator License - Disable Moderator Licenses
class C131457_ModeratorLicense_DisableModeratorLicenses
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Brightidea Administrator License Type Purchased Count":/6/.toString())
        //Navigate to Other Affiliate
        new actions.general.NavigatetoSSOAffiliate().run("DomainName":/licenseManager/.toString())
        try{
            //Set SSO Login
            new actions.SSOLogin.SetSSOLogin().run("Username":/bi.adminuser1@brightidea.com/.toString(),"Password":/Brightidea!16/.toString())
        }
       catch(all){}catch(Error err){}
        //Set License Manager
        new actions.general.SetLicenseManager().run("System":/${variables."affiliateURL"}/.toString(),"Enable Brightidea Moderator License Type":true,"Verify Disable Moderator License Message":/Disabling the Moderator license type will revoke Moderator licenses from 4 users. Users whose Moderator licenses have been revoked will be automatically granted Brightidea Administrator licenses and will maintain their software role assignments. If no Brightidea Administrator licenses are available, additional “Overage” licenses will be automatically added./.toString(),"Purchased Moderator Licenses":/4/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/20/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Verify Values in License Manager
        new actions.general.VerifyValuesLicenseManager().run("Brightidea Moderator Licenses - Purchased":/4/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Add User in People page
        new actions.People.AddUserinPeoplepage().run("Email Address":/adminBI_1@test.com/.toString(),"Action":/Add User/.toString())
        //Add User in People page
        new actions.People.AddUserinPeoplepage().run("Email Address":/adminBI_2@test.com/.toString(),"Action":/Add User/.toString())
        //Add User in People page
        new actions.People.AddUserinPeoplepage().run("Email Address":/adminBI_3@test.com/.toString(),"Action":/Add User/.toString())
        //Add User in People page
        new actions.People.AddUserinPeoplepage().run("Email Address":/adminBI_4@test.com/.toString(),"Action":/Add User/.toString())
        //Add User in People page
        new actions.People.AddUserinPeoplepage().run("Email Address":/adminBI_5@test.com/.toString(),"Action":/Add User/.toString())
        //Add User in People page
        new actions.People.AddUserinPeoplepage().run("Email Address":/moderatorBI_1@test.com/.toString(),"Action":/Add User/.toString())
        //Add User in People page
        new actions.People.AddUserinPeoplepage().run("Email Address":/moderatorBI_2@test.com/.toString(),"Action":/Add User/.toString())
        //Add User in People page
        new actions.People.AddUserinPeoplepage().run("Email Address":/moderatorBI_3@test.com/.toString(),"Action":/Add User/.toString())
        //Add User in People page
        new actions.People.AddUserinPeoplepage().run("Email Address":/moderatorBI_4@test.com/.toString(),"Action":/Add User/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Select Product in Apps Pillar Page
        new actions.AppsPillar.SelectProductinAppsPillarPage().run("Product":/Ecosystem/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Accelerate/.toString(),"Sponsor Name":/pipelinesponsor@mailinator.com/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Custom App - 1/.toString(),"Description":/test/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Pipeline Administrators":/System Admin,adminBI_1@test.com,adminBI_2@test.com/.toString(),"Administrators Add or Remove":/Remove,Add,Add/.toString(),"Moderators":/moderatorBI_1@test.com,moderatorBI_2@test.com/.toString(),"Moderators Add or Remove":/Add,Add/.toString(),"Action":/Create/.toString(),"Action on General Information Tab":/Continue/.toString(),"Action on Design Tab":/Continue/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Select Product in Apps Pillar Page
        new actions.AppsPillar.SelectProductinAppsPillarPage().run("Product":/Ecosystem/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Accelerate/.toString(),"Sponsor Name":/pipelinesponsor@mailinator.com/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Custom App - 2/.toString(),"Description":/test/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Pipeline Administrators":/System Admin,adminBI_3@test.com,adminBI_4@test.com,adminBI_5@test.com/.toString(),"Administrators Add or Remove":/Remove,Add,Add,Add/.toString(),"Moderators":/moderatorBI_3@test.com,moderatorBI_4@test.com/.toString(),"Moderators Add or Remove":/Add,Add/.toString(),"Action":/Create/.toString(),"Action on General Information Tab":/Continue/.toString(),"Action on Design Tab":/Continue/.toString())
        //Navigate to Other Affiliate
        new actions.general.NavigatetoSSOAffiliate().run("DomainName":/licenseManager/.toString())
        //Set License Manager
        new actions.general.SetLicenseManager().run("System":/${variables."affiliateURL"}/.toString(),"Enable Brightidea Moderator License Type":false)
        //Wait
        new actions.general.Wait().run("Seconds":/20/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Verify Values in License Manager
        new actions.general.VerifyValuesLicenseManager().run("Brightidea Administrator Licenses - Purchased":/6/.toString(),"Brightidea Administrator Licenses - Overage":/3/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Verify Licenses Metrics in People Pillar
        new actions.People.VerifyLicensesMetricsinPeoplePillar().run("License Type":/Brightidea Administrator License Type/.toString(),"Metric Text":/Purchased/.toString(),"Metric Value":/6/.toString(),"Number of Matches":/1/.toString())
        //Verify Licenses Metrics in People Pillar
        new actions.People.VerifyLicensesMetricsinPeoplePillar().run("License Type":/Brightidea Administrator License Type/.toString(),"Metric Text":/In Use/.toString(),"Metric Value":/9/.toString(),"Number of Matches":/1/.toString())
        //Verify Licenses Metrics in People Pillar
        new actions.People.VerifyLicensesMetricsinPeoplePillar().run("License Type":/Brightidea Administrator License Type/.toString(),"Metric Text":/Allocated/.toString(),"Metric Value":/9/.toString(),"Number of Matches":/1/.toString())
        //Verify Licenses Metrics in People Pillar
        new actions.People.VerifyLicensesMetricsinPeoplePillar().run("License Type":/Brightidea Administrator License Type/.toString(),"Metric Text":/Available/.toString(),"Metric Value":/0/.toString(),"Number of Matches":/1/.toString())
        //Verify Licenses Metrics in People Pillar
        new actions.People.VerifyLicensesMetricsinPeoplePillar().run("License Type":/Brightidea Administrator License Type/.toString(),"Metric Text":/Overage/.toString(),"Metric Value":/3/.toString(),"Number of Matches":/1/.toString())
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