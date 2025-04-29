package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C17693 - Forward Idea to Category Find owner
class C17693_ForwardIdeatoCategoryFindowner
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
        //Disable Apps V3
        Action67d84bbf3e876c6a0e91b2a2([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Suggest/.toString(),"Sponsor Name":/Sri/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Suggest Pipeline/.toString(),"Description":/Desc/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString(),"Action on General Information Tab":/Continue/.toString(),"Action on Design Tab":/Continue/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Suggest Pipeline/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Configure Find Owner Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureFindOwnerinNewModalinPipelineStepspage().run("Step Name to Configure (optional)":/Find Owner/.toString(),"Category":/Business Development,Engineering,Finance,HR,IT,Legal,Marketing,Operations,Product,R&D,Sales,Other,Quick Add\/New Categories/.toString(),"Owner":/System Admin,End User,System Admin,System Admin,System Admin,System Admin,System Admin,System Admin,System Admin,System Admin,System Admin,System Admin,System Admin/.toString(),"Owner Add or Remove":/Add,Add,Add,Add,Add,Add,Add,Add,Add,Add,Add,Add,Add/.toString(),"Action":/Activate/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/Find Owner Idea1/.toString(),"Action":/Submit/.toString())
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/View All/.toString())
        //Access Action Item in My Action Items/Action Items Manager table
        new actions.ActionItems.AccessActionIteminMyActionItemsActionItemsManagertable().run("Access in Which List":/My Action Items/.toString(),"Title":/Find Owner Idea1/.toString(),"Pipeline":/Suggest Pipeline/.toString(),"Step":/Find Owner/.toString())
        //Set Find Owner for an Idea in Action Items page
        new actions.ActionItems.SetFindOwnerforanIdeainActionItemspage().run("Do you own the decision to implement this idea":/No/.toString(),"Can you help us find the appropriate owner for this idea":/Yes - I can forward this idea to the correct Category/.toString(),"Reassign Find Owner Action Item to the right category":/Engineering/.toString(),"Action":/Confirm/.toString())
        //Verify Completed table for Action Items page
        new actions.ActionItems.VerifyCompletedtableforActionItemspage().run("Verify in Which List (optional)":/My Action Items/.toString(),"Title":/Find Owner Idea1/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Verify in Which List (optional)":/My Action Items/.toString(),"Title":/Find Owner Idea1/.toString(),"Assignee":/System Admin/.toString(),"Step":/Find Owner/.toString(),"Number of Matches":/0/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Suggest Pipeline/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Find Owner Idea1/.toString())
        //Verify Idea in View Idea page
        new actions.ViewIdea.VerifyIdeainViewIdeapage().run("Idea Name":/Find Owner Idea1/.toString(),"Category":/Engineering/.toString(),"Linked Submissions":[])
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/View All/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Verify in Which List (optional)":/My Action Items/.toString(),"Title":/Find Owner Idea1/.toString(),"Number of Matches":/1/.toString())
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
    //Disable Apps V3
    public static def Action67d84bbf3e876c6a0e91b2a2(def params){
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for BIOnly Beta tab
        new actions.SetupBI.SetEnterpriseSetupforBIOnlyBetatab().run("Activate Apps V3":false,"Apps v3 Pre-launch Enhancements":false)

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