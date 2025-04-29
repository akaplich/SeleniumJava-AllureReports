import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C132140 - Group Creation - Delete Group from Site Setup
class C132140_GroupCreation_DeleteGroupfromSiteSetup
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Unlimited Brightidea Administrator License Type":/1/.toString(),"Unlimited Idea Box Manager License Type":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Select Product in Apps Pillar Page
        new actions.AppsPillar.SelectProductinAppsPillarPage().run("Product":/Transformation/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Gig/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Gig Marketplace Test/.toString(),"Description":/Description/.toString(),"General Access":/End User,End User 2,Pipeline Admin/.toString(),"General Access Add or Remove":/Add,Add,Add/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Gig Marketplace Test/.toString(),"Area to Navigate to":/Setup/.toString())
        //Verify Groups in the List
        new actions.SetupUsers.VerifyGroupsintheList().run("Navigate to Groups Tab":true,"Enterprise or Site":/Site/.toString(),"Group Name":/Gig Marketplace Test/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Set Create Edit or Delete Group
        new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Create Edit or Delete":/Edit/.toString(),"Group Name to Edit or Delete":/Gig Marketplace Test/.toString())
        //Verify User in Group Modal
        new actions.SetupUsers.VerifyUserinGroupModal().run("User in Left or Right Rail":/Right/.toString(),"User":/End User/.toString(),"Number of Matches":/1/.toString())
        //Verify User in Group Modal
        new actions.SetupUsers.VerifyUserinGroupModal().run("User in Left or Right Rail":/Right/.toString(),"User":/End User 2/.toString(),"Number of Matches":/1/.toString())
        //Verify User in Group Modal
        new actions.SetupUsers.VerifyUserinGroupModal().run("User in Left or Right Rail":/Right/.toString(),"User":/Pipeline Admin/.toString(),"Number of Matches":/1/.toString())
        //Set Group in Setup
        new actions.SetupUsers.SetGroupinSetup().run("Action":/Cancel/.toString())
        try{
            //Set Create Edit or Delete Group
            new actions.SetupUsers.SetCreateEditorDeleteGroup().run("Create Edit or Delete":/Delete/.toString(),"Group Name to Edit or Delete":/Gig Marketplace Test/.toString(),"Delete Action":/Delete/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Groups in the List
        new actions.SetupUsers.VerifyGroupsintheList().run("Group Name":/Gig Marketplace Test/.toString(),"Number of Matches":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Verify Groups in the List
        new actions.SetupUsers.VerifyGroupsintheList().run("Navigate to Groups Tab":true,"Group Name":/Gig Marketplace Test/.toString(),"Number of Matches":/1/.toString())
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