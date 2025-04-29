import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C118253 - Import Group: No emails for Existing Certifications
class C118253_ImportGroup_NoemailsforExistingCertifications
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
        //Create Mailinator User
        new actions.Mailinator.CreateMailinatorUser().run("Email":/brightendUser8/.toString(),"Finally Login as What User":/bi.adminuser1@brightidea.com/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Discuss/.toString(),"Sponsor Name":/Sri/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/New Forum/.toString(),"Description":/New Forum Description/.toString(),"Import Group as":/Early Access/.toString(),"Import File":/TestCaseC118253_4.xls/.toString(),"Add or Remove Group":/Add/.toString(),"Import Group Action":/Import/.toString(),"Group Name":/TestCase118253/.toString(),"Action":/Create/.toString(),"Action on General Information Tab":/Continue/.toString(),"Action on Design Tab":/Continue/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/8/.toString())
        try{
            //Get Link From Category Subscription Email
            variables."link" = new actions.Mailinator.GetLinkFromCategorySubscriptionEmail().run("Email Address":/brightendUser8/.toString())
        }
       catch(all){}catch(Error err){}
        //Log Out
        new actions.general.LogOut().run([:])
        //Close All Browsers
        new actions.selenium.CloseBrowser().run([:])
        //Open Browser
        new actions.selenium.Browser().run("URL":/${variables."affiliateURL"}/.toString(),"Browser Type":/Chrome/.toString())
        //Login
        new actions.general.Login().run("Email":/brightendUser8@mailinator.com/.toString(),"Password":/brightidea1/.toString())
        try{
            //Navigate to URL
            new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Set Tab on User Profile page
            new actions.UserProfile.SetTabonUserProfilepage().run("Tab":/Info/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Certifications On Info tab on Profile page
        new actions.UserProfile.VerifyCertificationsOnInfotabonProfilepage().run("Certification":/Disruptive Innovation/.toString(),"Number of Matches":/0/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        try{
            //Get Link From Category Subscription Email
            variables."link" = new actions.Mailinator.GetLinkFromCategorySubscriptionEmail().run("Email Address":/brightideaC118253_4/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Navigate to URL
            new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        }
       catch(all){}catch(Error err){}
        //Login
        new actions.general.Login().run("Email":/brightideaC118253_4@mailinator.com/.toString(),"Password":/brightidea1/.toString())
        try{
            //Set Tab on User Profile page
            new actions.UserProfile.SetTabonUserProfilepage().run("Tab":/Info/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Certifications On Info tab on Profile page
        new actions.UserProfile.VerifyCertificationsOnInfotabonProfilepage().run("Certification":/Lean Startup/.toString(),"Number of Matches":/0/.toString())
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