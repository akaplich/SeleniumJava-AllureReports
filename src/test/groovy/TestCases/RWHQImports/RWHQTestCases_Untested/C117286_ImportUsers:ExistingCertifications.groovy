package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C117286 - Import Users: Existing Certifications
class C117286_ImportUsers:ExistingCertifications
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
        //Import User in People page
        new actions.People.ImportUserinPeoplepage().run("Import File":/TestCaseC117286.xls/.toString(),"Action":/Import/.toString())
        //Verify User in Users tab for People page
        new actions.People.VerifyUserinUserstabforPeoplepage().run("Email Address":/brightideaC117286@mailinator.com/.toString(),"Screen Name":/New User/.toString(),"Department":/Innovation/.toString(),"Location":/United States/.toString(),"Expertise":/New Expertise/.toString(),"Certification":/Business Model Canvas,Lean Startup/.toString(),"Number of Matches":/1/.toString())
        //Verify User in Users tab for People page
        new actions.People.VerifyUserinUserstabforPeoplepage().run("Email Address":/bi.enduser1@brightidea.com/.toString(),"Screen Name":/End User/.toString(),"Certification":/Disruptive Innovation/.toString(),"Number of Matches":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Search Global Enterprise/Webstorm/Community
        new actions.Search.SearchEnterpriseWebstorm().run("Search Value":/New User/.toString(),"Click View All Results after search":true)
        //Click link on Search Page results section
        new actions.Search.ClicklinkonSearchPageresultssection().run("Search Results Type":/Users/.toString(),"Link name":/New User/.toString())
        //Set Tab on User Profile page
        new actions.UserProfile.SetTabonUserProfilepage().run("Tab":/Info/.toString())
        //Verify Certifications On Info tab on Profile page
        new actions.UserProfile.VerifyCertificationsOnInfotabonProfilepage().run("Certification":/Business Model Canvas/.toString(),"Number of Matches":/1/.toString())
        //Verify Certifications On Info tab on Profile page
        new actions.UserProfile.VerifyCertificationsOnInfotabonProfilepage().run("Certification":/Lean Startup/.toString(),"Number of Matches":/1/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Profile/.toString())
        //Set Tab on User Profile page
        new actions.UserProfile.SetTabonUserProfilepage().run("Tab":/Info/.toString())
        //Verify Certifications On Info tab on Profile page
        new actions.UserProfile.VerifyCertificationsOnInfotabonProfilepage().run("Certification":/Disruptive Innovation/.toString(),"Number of Matches":/1/.toString())
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