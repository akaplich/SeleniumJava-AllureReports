import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C130166 - Standard Licensing - IT Manager (Min one user assigned to IT Manager)
class C130166_StandardLicensing_ITManager_MinoneuserassignedtoITManager
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Idea Box Manager License Type Purchased Count":/2/.toString())
        //Navigate to Other Affiliate
        new actions.general.NavigatetoSSOAffiliate().run("DomainName":/licenseManager/.toString())
        try{
            //Set SSO Login
            new actions.SSOLogin.SetSSOLogin().run("Username":/bi.adminuser1@brightidea.com/.toString(),"Password":/Brightidea!16/.toString())
        }
       catch(all){}catch(Error err){}
        //Set License Manager
        new actions.general.SetLicenseManager().run("System":/${variables."affiliateURL"}/.toString(),"Enable IT System Admin role overlay":true)
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Select Product in Apps Pillar Page
        new actions.AppsPillar.SelectProductinAppsPillarPage().run("Product":/Programs/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Advanced Ideabox/.toString(),"Sponsor Name":/Sri/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Advanced Ideabox/.toString(),"Description":/desc/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Admin Field Name":/Pipeline Managers/.toString(),"Pipeline Administrators":/Pipeline Admin/.toString(),"Administrators Add or Remove":/Add/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Set IT Manager in People Pillar
        new actions.People.SetITManagerinPeoplePillar().run("User":/Pipeline Admin/.toString(),"IT Manager":true)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Pipeline Admin's IT System Admin setting has been updated/.toString(),"Should Exist":true)
        //Set IT Manager in People Pillar
        new actions.People.SetITManagerinPeoplePillar().run("User":/Moderator/.toString(),"Expand License Breakdown":false,"IT Manager":true)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Moderator's IT System Admin setting has been updated/.toString(),"Should Exist":true)
        //Set IT Manager in People Pillar
        new actions.People.SetITManagerinPeoplePillar().run("User":/Pipeline Admin/.toString(),"Expand License Breakdown":false,"IT Manager":false)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Pipeline Admin's IT System Admin setting has been updated/.toString(),"Should Exist":true)
        try{
            //Set IT Manager in People Pillar
            new actions.People.SetITManagerinPeoplePillar().run("User":/Moderator/.toString(),"Expand License Breakdown":false,"IT Manager":false)
        }
       catch(all){}catch(Error err){}
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Moderator's IT System Admin setting has been updated/.toString(),"Should Exist":false)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/pipelineadmin@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Command Center/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Key Program Results/.toString(),"Should Exist":false)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/moderator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Verify Licenses Metrics in People Pillar
        new actions.People.VerifyLicensesMetricsinPeoplePillar().run("License Type":/Idea Box Manager License Type/.toString(),"Metric Text":/In Use/.toString(),"Metric Value":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Licenses User in People Pillar Licenses tab
        new actions.People.VerifyLicensesUserinPeoplePillarLicensesTab().run("License Type":/Idea Box Manager License Type/.toString(),"Expand License Breakdown":true,"User":/Pipeline Admin/.toString(),"Roles":/Pipeline Manager/.toString(),"Placement Number":/1/.toString())
        //Verify Licenses User in People Pillar Licenses tab
        new actions.People.VerifyLicensesUserinPeoplePillarLicensesTab().run("License Type":/Idea Box Manager License Type/.toString(),"Expand License Breakdown":false,"User":/Moderator/.toString(),"Roles":/Pipeline Moderator/.toString(),"Placement Number":/2/.toString())
        //Set IT Manager in People Pillar
        new actions.People.SetITManagerinPeoplePillar().run("User":/Pipeline Admin/.toString(),"Expand License Breakdown":false,"IT Manager":true)
        //Set IT Manager in People Pillar
        new actions.People.SetITManagerinPeoplePillar().run("User":/Moderator/.toString(),"Expand License Breakdown":false,"IT Manager":false)
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