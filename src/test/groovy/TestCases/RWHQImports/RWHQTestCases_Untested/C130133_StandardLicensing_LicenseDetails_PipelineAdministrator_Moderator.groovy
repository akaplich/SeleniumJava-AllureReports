import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C130133 - Standard Licensing - License Details (Pipeline Administrator,Moderator)
class C130133_StandardLicensing_LicenseDetails_PipelineAdministrator_Moderator
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Brightidea Administrator License Type Purchased Count":/3/.toString(),"Idea Box Manager License Type Purchased Count":/5/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/moderator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Profile/.toString())
        //Edit Your Profile
        new actions.UserProfile.EditYourProfile().run("Display Picture":/Image3.jpg/.toString(),"Display Picture Change or Remove":/Change/.toString(),"First Name":/John/.toString(),"Last Name":/Doe/.toString(),"Job Title":/QA/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Select Product in Apps Pillar Page
        new actions.AppsPillar.SelectProductinAppsPillarPage().run("Product":/Build/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Custom Pipeline/.toString(),"Description":/desc/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Admin Field Name":/Pipeline Administrators/.toString(),"Pipeline Administrators":/Pipeline Admin/.toString(),"Administrators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Select Product in Apps Pillar Page
        new actions.AppsPillar.SelectProductinAppsPillarPage().run("Product":/Programs/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Advanced Ideabox/.toString(),"Sponsor Name":/Sri/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Advanced Ideabox/.toString(),"Description":/desc/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Admin Field Name":/Pipeline Managers/.toString(),"Pipeline Administrators":/Pipeline Admin/.toString(),"Administrators Add or Remove":/Add/.toString(),"Moderators":/moderator@test.com/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString(),"Action on General Information Tab":/Continue/.toString(),"Action on Design Tab":/Continue/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Verify Licenses User in People Pillar Licenses tab
        new actions.People.VerifyLicensesUserinPeoplePillarLicensesTab().run("License Type":/Brightidea Administrator License Type/.toString(),"Expand License Breakdown":true,"User":/Pipeline Admin/.toString(),"Roles":/Pipeline Administrator,Pipeline Manager/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify License Details in People Pillar Page
        new actions.People.VerifyLicenseDetailsinPeoplePillarPage().run("Member Name":/Pipeline Admin/.toString(),"Member Image":false,"License Type":/Brightidea Administrator License/.toString(),"Role":/Pipeline Administrator/.toString(),"Area":/Custom Pipeline/.toString(),"Click on the area":true)
        //Verify License Type of User in Fields
        new actions.PipelineSetup.VerifyLicenseTypeofUserinFields().run("Field":/Pipeline Administrators/.toString(),"User":/Pipeline Admin/.toString(),"License Type":/Brightidea Administrator/.toString(),"Number of Matches":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        try{
            //Verify Licenses User in People Pillar Licenses tab
            new actions.People.VerifyLicensesUserinPeoplePillarLicensesTab().run("License Type":/Brightidea Administrator License Type/.toString(),"Expand License Breakdown":true)
        }
       catch(all){}catch(Error err){}
        //Verify License Details in People Pillar Page
        new actions.People.VerifyLicenseDetailsinPeoplePillarPage().run("Member Name":/Pipeline Admin/.toString(),"Member Image":false,"License Type":/Brightidea Administrator License/.toString(),"Role":/Pipeline Manager/.toString(),"Area":/Advanced Ideabox/.toString(),"Click on the area":true)
        //Verify License Type of User in Fields
        new actions.PipelineSetup.VerifyLicenseTypeofUserinFields().run("Field":/Pipeline Managers/.toString(),"User":/Pipeline Admin/.toString(),"License Type":/Brightidea Administrator/.toString(),"Number of Matches":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Verify Licenses User in People Pillar Licenses tab
        new actions.People.VerifyLicensesUserinPeoplePillarLicensesTab().run("License Type":/Idea Box Manager License Type/.toString(),"Expand License Breakdown":true,"User":/John Doe/.toString(),"Roles":/Pipeline Moderator/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify License Details in People Pillar Page
        new actions.People.VerifyLicenseDetailsinPeoplePillarPage().run("Member Name":/John Doe/.toString(),"Member Image":true,"Title":/QA/.toString(),"License Type":/Idea Box Manager License/.toString(),"Role":/Pipeline Moderator/.toString(),"Area":/Advanced Ideabox/.toString(),"Click on the area":true)
        //Verify License Type of User in Fields
        new actions.PipelineSetup.VerifyLicenseTypeofUserinFields().run("Field":/Pipeline Moderators/.toString(),"User":/John Doe/.toString(),"License Type":/Ideabox Manager/.toString(),"Number of Matches":/1/.toString())
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