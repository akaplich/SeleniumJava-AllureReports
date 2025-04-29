package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C119157 - Owner Updates - Owner Column
class C119157_OwnerUpdates_OwnerColumn
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
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Ideas tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforIdeastab().run("Idea Owner":false)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for BIOnly Beta tab
        new actions.SetupBI.SetEnterpriseSetupforBIOnlyBetatab().run("Display Find Owner Tool Option":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline List/.toString())
        //Verify Idea in Pipeline List page
        new actions.PipelineList.VerifyIdeainPipelineListpage().run("Title":/test idea2/.toString(),"Code":/D107/.toString(),"Stage":/Collection/.toString(),"Step":/Review/.toString(),"Submitter":/Sri/.toString(),"Owner":/Not assigned/.toString(),"Category":/Operations/.toString(),"Status":/Submitted/.toString(),"Innovation State":/Idea/.toString(),"Points":/1/.toString(),"Visible":/True/.toString(),"Projected Benefit":/0/.toString(),"Actual Benefit":/0/.toString(),"Non-Financial Benefit":/0/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Pipeline List page
        new actions.PipelineList.VerifyIdeainPipelineListpage().run("Title":/test idea2/.toString(),"Code":/D107/.toString(),"Stage":/Collection/.toString(),"Step":/Review/.toString(),"Submitter":/Sri/.toString(),"Category":/Operations/.toString(),"Status":/Submitted/.toString(),"Innovation State":/Idea/.toString(),"Points":/1/.toString(),"Visible":/True/.toString(),"Projected Benefit":/0/.toString(),"Actual Benefit":/0/.toString(),"Non-Financial Benefit":/0/.toString(),"Number of Matches":/1/.toString(),"Row Number":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Site Setup for BI Beta tab
        new actions.SetupBI.SetSiteSetupforBIBetatab().run("Find Owner Tool Type":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Ideas tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforIdeastab().run("Idea Owner":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline List/.toString())
        //Verify Idea in Pipeline List page
        new actions.PipelineList.VerifyIdeainPipelineListpage().run("Title":/test idea2/.toString(),"Owner":/Not assigned/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Pipeline List page
        new actions.PipelineList.VerifyIdeainPipelineListpage().run("Title":/test idea1/.toString(),"Owner":/Not assigned/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Pipeline List page
        new actions.PipelineList.VerifyIdeainPipelineListpage().run("Title":/quick add1/.toString(),"Owner":/Not assigned/.toString(),"Number of Matches":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Create Step in Pipeline Steps page
        new actions.PipelineStepsView.CreateStepinPipelineStepspage().run("Step Name":/Find Owner Custom/.toString(),"Select Tool Type":/Find Owner/.toString(),"Select Stage":/Collection/.toString(),"Action":/Create/.toString())
        //Configure Find Owner Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureFindOwnerinNewModalinPipelineStepspage().run("Assignment Method":/Category Assignment/.toString(),"Category":/New Product,Operations,Marketing & Branding,Strategy,Quick Add\/New Categories/.toString(),"Owner":/System Admin,System Admin,System Admin,System Admin,Pipeline Admin/.toString(),"Owner Add or Remove":/Add,Add,Add,Add,Add/.toString(),"Action":/Activate/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/test idea1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Find Owner Custom/.toString(),"Action":/Change Step/.toString())
        //Access Action Item in Actions Items React Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsReactGlobalNavigation().run("Action Item":/View All/.toString())
        //Access Action Item in My Action Items/Action Items Manager table
        new actions.ActionItems.AccessActionIteminMyActionItemsActionItemsManagertable().run("Access in Which List":/My Action Items/.toString(),"Title":/test idea1/.toString(),"Pipeline":/Custom App/.toString(),"Step":/Find Owner Custom/.toString())
        //Set Find Owner for an Idea in Action Items page
        new actions.ActionItems.SetFindOwnerforanIdeainActionItemspage().run("Do you own the decision to implement this idea":/Yes/.toString(),"Do you plan to implement this idea":/Yes - I am considering implementing this idea./.toString(),"Action":/Confirm/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline List/.toString())
        //Verify Idea in Pipeline List page
        new actions.PipelineList.VerifyIdeainPipelineListpage().run("Title":/test idea2/.toString(),"Code":/D107/.toString(),"Stage":/Collection/.toString(),"Step":/Review/.toString(),"Submitter":/Sri/.toString(),"Owner":/Not assigned/.toString(),"Category":/Operations/.toString(),"Status":/Submitted/.toString(),"Innovation State":/Idea/.toString(),"Points":/1/.toString(),"Visible":/True/.toString(),"Projected Benefit":/0/.toString(),"Actual Benefit":/0/.toString(),"Non-Financial Benefit":/0/.toString(),"Number of Matches":/1/.toString(),"Row Number":/1/.toString())
        //Verify Idea in Pipeline List page
        new actions.PipelineList.VerifyIdeainPipelineListpage().run("Title":/test idea1/.toString(),"Code":/D102/.toString(),"Stage":/Evaluation/.toString(),"Step":/Single Scale/.toString(),"Submitter":/Sri/.toString(),"Owner":/System Admin/.toString(),"Category":/New Product/.toString(),"Status":/Under Review/.toString(),"Innovation State":/Idea/.toString(),"Points":/1/.toString(),"Visible":/True/.toString(),"Projected Benefit":/0/.toString(),"Actual Benefit":/0/.toString(),"Non-Financial Benefit":/0/.toString(),"Number of Matches":/1/.toString(),"Row Number":/3/.toString())
        //Verify Idea in Pipeline List page
        new actions.PipelineList.VerifyIdeainPipelineListpage().run("Title":/quick add1/.toString(),"Code":/D105/.toString(),"Stage":/Collection/.toString(),"Step":/Review/.toString(),"Submitter":/Sri/.toString(),"Owner":/Not assigned/.toString(),"Category":/Quick Add/.toString(),"Status":/Submitted/.toString(),"Innovation State":/Idea/.toString(),"Points":/1/.toString(),"Visible":/False/.toString(),"Projected Benefit":/0/.toString(),"Actual Benefit":/0/.toString(),"Non-Financial Benefit":/0/.toString(),"Number of Matches":/1/.toString(),"Row Number":/2/.toString())
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