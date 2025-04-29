import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C117278 - Certification Quick Wins: Edit Certificate
class C117278_CertificationQuickWins_EditCertificate
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
        //Access User From User List in People Pillar
        new actions.People.AccessUserFromUserListinPeoplePillar().run("User Email or Screen Name":/bi.enduser1@brightidea.com/.toString())
        //Add Certifications to a User
        new actions.People.AddCertificationstoaUser().run("Certifications":/Business Model Canvas/.toString(),"Add or Remove":/Add/.toString(),"Action":/Update/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Access User From User List in People Pillar
        new actions.People.AccessUserFromUserListinPeoplePillar().run("User Email or Screen Name":/bi.enduser1@brightidea.com/.toString())
        //Set Certification tab
        new actions.People.SetCertificationtab().run("Add or Update or Remove":/Update/.toString(),"Certificate":/Business Model Canvas/.toString(),"Updated Certificate":/Edited Business Model Canvas/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Access User From User List in People Pillar
        new actions.People.AccessUserFromUserListinPeoplePillar().run("User Email or Screen Name":/bi.enduser1@brightidea.com/.toString())
        //Add Certifications to a User
        new actions.People.AddCertificationstoaUser().run("Certifications":/Lean Startup/.toString(),"Add or Remove":/Add/.toString(),"Action":/Update/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Profile/.toString())
        //Set Tab on User Profile page
        new actions.UserProfile.SetTabonUserProfilepage().run("Tab":/Info/.toString())
        //Verify Certifications On Info tab on Profile page
        new actions.UserProfile.VerifyCertificationsOnInfotabonProfilepage().run("Certification":/Edited Business Model Canvas/.toString(),"Number of Matches":/1/.toString())
        //Verify Certifications On Info tab on Profile page
        new actions.UserProfile.VerifyCertificationsOnInfotabonProfilepage().run("Certification":/Lean Startup/.toString(),"Number of Matches":/1/.toString())
        //Verify Certifications On Info tab on Profile page
        new actions.UserProfile.VerifyCertificationsOnInfotabonProfilepage().run("Certification":/Business Model Canvas/.toString(),"Number of Matches":/0/.toString())
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