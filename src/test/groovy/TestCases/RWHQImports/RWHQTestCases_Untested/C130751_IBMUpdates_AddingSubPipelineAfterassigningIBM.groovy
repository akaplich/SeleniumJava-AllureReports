import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C130751 - IBM Updates - Adding Sub Pipeline After assigning IBM
class C130751_IBMUpdates_AddingSubPipelineAfterassigningIBM
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Idea Box Manager License Type Purchased Count":/10/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Instance Ideabox/.toString(),"Sponsor Name":/pipelinesponsor@mailinator.com/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Ideabox/.toString(),"Description":/this is idea box app Test App/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Idea Box Managers":/Community Admin/.toString(),"Idea Box Managers Add or Remove":/Add/.toString(),"Action":/Create/.toString(),"Action on General Information Tab":/Continue/.toString(),"Action on Design Tab":/Continue/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Select Product in Apps Pillar Page
        new actions.AppsPillar.SelectProductinAppsPillarPage().run("Product":/Build/.toString())
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/SubPipeline1/.toString(),"Description":/Custom Initiative description/.toString(),"Submission Name":/Submission/.toString(),"Submission Plural Name":/Submissions/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/SubPipeline1/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Site Setup for BI Beta tab
        new actions.SetupBI.SetSiteSetupforBIBetatab().run("This pipeline is an Idea Box Sub-pipeline":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Go to Community
        new actions.SetupEnterpriseCommunities.GotoCommunity().run("Community Name to go to":/Ideabox/.toString())
        //Navigate Community
        new actions.SetupEnterpriseCommunities.NavigateCommunity().run("Community Page":/Setup/.toString())
        //Set Community Admin in Community Setup
        new actions.SetupUsers.SetCommunityAdmininCommunitySetup().run("Field Name":/Idea Box Managers/.toString(),"Community Admin or Idea Box Manager":/Pipeline Admin/.toString(),"Add or Remove":/Add/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/communityadmin@test.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Ideabox/.toString(),"Area to Navigate to":/Pipeline Setup/.toString())
        //Set Roles in Pipeline Setup Page
        new actions.PipelineSetup.SetRolesinPipelineSetupPage().run("Type of Licensing Model":/Standard Licensing Model/.toString(),"Navigate to Tab":true,"Idea Box Managers":/Moderator/.toString(),"Idea Box Managers Add or Remove":/Add/.toString(),"Click Save":true)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/User roles successfully saved!/.toString(),"Should Exist":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Select Community
        new actions.SetupEnterpriseCommunities.SelectCommunity().run("Community Name":/Ideabox/.toString())
        //Update Community
        new actions.SetupEnterpriseCommunities.UpdateCommunity().run("Apps":/SubPipeline1/.toString(),"Checkbox Check":/TRUE/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Verify Licenses User in People Pillar Licenses tab
        new actions.People.VerifyLicensesUserinPeoplePillarLicensesTab().run("License Type":/Idea Box Manager License Type/.toString(),"Expand License Breakdown":true,"User":/Pipeline Admin/.toString(),"Roles":/Idea Box Manager,Pipeline Manager/.toString(),"Number of Matches":/1/.toString())
        //Verify License Details in People Pillar Page
        new actions.People.VerifyLicenseDetailsinPeoplePillarPage().run("Open Details":true,"Member Name":/Pipeline Admin/.toString(),"Member Image":false,"License Type":/Idea Box Manager License/.toString(),"Role":/Idea Box Manager/.toString(),"Area":/Ideabox/.toString())
        //Verify License Details in People Pillar Page
        new actions.People.VerifyLicenseDetailsinPeoplePillarPage().run("Open Details":false,"Member Name":/Pipeline Admin/.toString(),"Member Image":false,"License Type":/Idea Box Manager License/.toString(),"Role":/Pipeline Manager/.toString(),"Area":/Ideabox/.toString())
        //Verify License Details in People Pillar Page
        new actions.People.VerifyLicenseDetailsinPeoplePillarPage().run("Open Details":false,"Member Name":/Pipeline Admin/.toString(),"Member Image":false,"License Type":/Idea Box Manager License/.toString(),"Role":/Pipeline Manager/.toString(),"Area":/SubPipeline1/.toString(),"Click on the area":true)
        //Verify License Type of User in Fields
        new actions.PipelineSetup.VerifyLicenseTypeofUserinFields().run("Field":/Pipeline Managers/.toString(),"User":/Pipeline Admin/.toString(),"License Type":/Ideabox Manager/.toString(),"Number of Matches":/1/.toString())
        //Verify License Type of User in Fields
        new actions.PipelineSetup.VerifyLicenseTypeofUserinFields().run("Field":/Pipeline Managers/.toString(),"User":/Community Admin/.toString(),"License Type":/Ideabox Manager/.toString(),"Number of Matches":/1/.toString())
        //Verify License Type of User in Fields
        new actions.PipelineSetup.VerifyLicenseTypeofUserinFields().run("Field":/Pipeline Managers/.toString(),"User":/Moderator/.toString(),"License Type":/Ideabox Manager/.toString(),"Number of Matches":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Verify Licenses User in People Pillar Licenses tab
        new actions.People.VerifyLicensesUserinPeoplePillarLicensesTab().run("License Type":/Idea Box Manager License Type/.toString(),"Expand License Breakdown":true,"User":/Moderator/.toString(),"Roles":/Idea Box Manager,Pipeline Manager/.toString(),"Number of Matches":/1/.toString())
        //Verify License Details in People Pillar Page
        new actions.People.VerifyLicenseDetailsinPeoplePillarPage().run("Open Details":true,"Member Name":/Moderator/.toString(),"Member Image":false,"License Type":/Idea Box Manager License/.toString(),"Role":/Idea Box Manager/.toString(),"Area":/Ideabox/.toString())
        //Verify License Details in People Pillar Page
        new actions.People.VerifyLicenseDetailsinPeoplePillarPage().run("Open Details":false,"Member Name":/Moderator/.toString(),"Member Image":false,"License Type":/Idea Box Manager License/.toString(),"Role":/Pipeline Manager/.toString(),"Area":/Ideabox/.toString())
        //Verify License Details in People Pillar Page
        new actions.People.VerifyLicenseDetailsinPeoplePillarPage().run("Open Details":false,"Member Name":/Moderator/.toString(),"Member Image":false,"License Type":/Idea Box Manager License/.toString(),"Role":/Pipeline Manager/.toString(),"Area":/SubPipeline1/.toString(),"Click on the area":false)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Verify Licenses User in People Pillar Licenses tab
        new actions.People.VerifyLicensesUserinPeoplePillarLicensesTab().run("License Type":/Idea Box Manager License Type/.toString(),"Expand License Breakdown":true,"User":/Community Admin/.toString(),"Roles":/Idea Box Manager,Pipeline Manager/.toString(),"Number of Matches":/1/.toString())
        //Verify License Details in People Pillar Page
        new actions.People.VerifyLicenseDetailsinPeoplePillarPage().run("Open Details":true,"Member Name":/Community Admin/.toString(),"Member Image":false,"License Type":/Idea Box Manager License/.toString(),"Role":/Idea Box Manager/.toString(),"Area":/Ideabox/.toString())
        //Verify License Details in People Pillar Page
        new actions.People.VerifyLicenseDetailsinPeoplePillarPage().run("Open Details":false,"Member Name":/Community Admin/.toString(),"Member Image":false,"License Type":/Idea Box Manager License/.toString(),"Role":/Pipeline Manager/.toString(),"Area":/Ideabox/.toString())
        //Verify License Details in People Pillar Page
        new actions.People.VerifyLicenseDetailsinPeoplePillarPage().run("Open Details":false,"Member Name":/Community Admin/.toString(),"Member Image":false,"License Type":/Idea Box Manager License/.toString(),"Role":/Pipeline Manager/.toString(),"Area":/SubPipeline1/.toString(),"Click on the area":false)
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