import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132505 - WB Ecommerce - Remove licensed user from people pillar details page
class C132505_WBEcommerce_Removelicenseduserfrompeoplepillardetailspage
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Unlimited Brightidea Administrator License Type":/6/.toString(),"Idea Box Manager License Type Purchased Count":/10/.toString(),"Run Browser in Incognito":/TRUE/.toString())
        //Delete this when hackathon and WB ecommerce licensing is enabled for everyone
        Action679be619a533ece10d855622([:])
        //Navigate to Other Affiliate
        new actions.general.NavigatetoSSOAffiliate().run("DomainName":/licenseManager/.toString())
        try{
            //Set SSO Login
            new actions.SSOLogin.SetSSOLogin().run("Username":/bi.adminuser1@brightidea.com/.toString(),"Password":/Brightidea!16/.toString())
        }
       catch(all){}catch(Error err){}
        //Set License Manager
        new actions.general.SetLicenseManager().run("System":/${variables."affiliateURL"}/.toString(),"Enable Whiteboard License":true,"Unlimited Board Creation":/25/.toString(),"Unlicensed Board limit count":/2/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString(),"Activities":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/moderator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Whiteboards/.toString())
        //Create Whiteboard or Edit Template
        new actions.Whiteboards.CreateWhiteboardFromUserhome().run("Create New or Choose Template":/New Blank Whiteboard/.toString())
        //Set Whiteboard Title
        new actions.Whiteboards.EditTitleOfWhiteboard().run("Title":/Whiteboard1/.toString(),"Action":/Submit/.toString())
        //Go Back From Whiteboard
        new actions.Whiteboards.GoBackFromWhiteboard().run([:])
        //Create Whiteboard or Edit Template
        new actions.Whiteboards.CreateWhiteboardFromUserhome().run("Create New or Choose Template":/New Blank Whiteboard/.toString(),"Should it wait for page to load":true)
        //Set Whiteboard Title
        new actions.Whiteboards.EditTitleOfWhiteboard().run("Title":/Whiteboard2/.toString(),"Action":/Submit/.toString())
        //Go Back From Whiteboard
        new actions.Whiteboards.GoBackFromWhiteboard().run([:])
        //Create Whiteboard or Edit Template
        new actions.Whiteboards.CreateWhiteboardFromUserhome().run("Create New or Choose Template":/Brainwriting/.toString())
        //Set Buy Additional Licenses
        new actions.People.SetBuyAdditionalLicenses().run("Checkout":true)
        //Set FastSpring Modal
        new actions.common.SetFastSpringModal().run("Card Number":/4242 4242 4242 4242/.toString(),"Submit":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Verify Licenses Metrics in People Pillar
        new actions.People.VerifyLicensesMetricsinPeoplePillar().run("License Type":/Whiteboard License Type/.toString(),"Metric Text":/Purchased/.toString(),"Metric Value":/26/.toString(),"Number of Matches":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Verify User in Users tab for People page
        new actions.People.VerifyUserinUserstabforPeoplepage().run("Email Address":/moderator@test.com/.toString(),"Screen Name":/Moderator/.toString(),"Administrative Roles":/Whiteboard Creator/.toString(),"Number of Matches":/1/.toString())
        //Access User From User List in People Pillar
        new actions.People.AccessUserFromUserListinPeoplePillar().run("User Email or Screen Name":/Moderator/.toString())
        //Verify Licenses and Roles
        new actions.People.VerifyLicensesandRoles().run("Role and Area Displayed":true,"Role":/Whiteboard License/.toString(),"Area":/Whiteboard/.toString(),"Click on Area":true)
        //Verify Whiteboard Licenses in Use
        new actions.People.VerifyWhiteboardLicensesinUse().run("Expand License Breakdown":false,"Licenses in Use":/Moderator/.toString(),"Number of Whiteboards":/2/.toString()," Last Login":/Todays date/.toString(),"Remove Tooltip":/Cannot remove, this license was purchased by the user./.toString(),"Number of Matches":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Access User From User List in People Pillar
        new actions.People.AccessUserFromUserListinPeoplePillar().run("User Email or Screen Name":/Moderator/.toString())
        //Set Remove All Roles
        new actions.People.SetRemoveAllRoles().run("Action":/Remove/.toString())
        //Verify Licenses and Roles
        new actions.People.VerifyLicensesandRoles().run("Role and Area Displayed":false,"Role":/Whiteboard License/.toString(),"Area":/Whiteboard/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Verify Licenses Metrics in People Pillar
        new actions.People.VerifyLicensesMetricsinPeoplePillar().run("License Type":/Whiteboard License Type/.toString(),"Metric Text":/Purchased/.toString(),"Metric Value":/26/.toString(),"Number of Matches":/1/.toString())
        //Verify Whiteboard Licenses in Use
        new actions.People.VerifyWhiteboardLicensesinUse().run("Expand License Breakdown":true,"Licenses in Use":/Moderator/.toString(),"Number of Whiteboards":/2/.toString()," Last Login":/Todays date/.toString(),"Remove Tooltip":/Cannot remove, this license was purchased by the user./.toString(),"Number of Matches":/0/.toString())
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
    //Delete this when hackathon and WB ecommerce licensing is enabled for everyone
    public static def Action679be619a533ece10d855622(def params){
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for BIOnly Beta tab
        new actions.SetupBI.SetEnterpriseSetupforBIOnlyBetatab().run("Purchase ability for Hackathon":true,"Whiteboard Ecommerce":true)

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