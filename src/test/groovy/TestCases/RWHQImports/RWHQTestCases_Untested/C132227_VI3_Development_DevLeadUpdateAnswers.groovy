package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132227 - VI3 - Development - Dev Lead Update Answers
class C132227_VI3_Development_DevLeadUpdateAnswers
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
        //Delete this when Scheduler feature is enabled for everyone
        Action66ec7933e12425a91ee5d983([:])
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
        //Create Mailinator User
        new actions.Mailinator.CreateMailinatorUser().run("Email":/brightc132227_lead/.toString(),"Finally Login as What User":/bi.adminuser1@brightidea.com/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for Beta tab
        new actions.SetupBeta.SetEnterpriseSetupforBetatab().run("View Idea 3 in Action Items and Manage Pages":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Apply Filter on Apps Pillar 2.0
        new actions.AppsPillar.ApplyFilterAppsPillar20().run("Filter Option":/Programs/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Hackathon/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Hack/.toString(),"Description":/Hack Event description/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Disable Scheduler
        new actions.SetupScheduler.SetDisableScheduler().run("Status":/Active/.toString(),"Enable Submission":true,"Enable Voting":true,"Enable Commenting":true,"Action":/Disable Schedule/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Development Parent Dropdown Question/.toString(),"Additional Question Type":/Dropdown/.toString(),"Development Field":true,"Save Form":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Hack/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Edit Step in Pipeline Steps page
        new actions.PipelineStepsView.EditStepinPipelineStepspage().run("Step to Edit":/Hack on Projects/.toString(),"Step Name":/Development/.toString(),"Tool Type":/Development/.toString(),"Action":/Save/.toString())
        //Configure Development Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureDevelopmentinNewModalinPipelineStepspage().run("Assignment Method":/Individual Assignment/.toString(),"Development Lead":/Select a user/.toString(),"Selected user":/brightc132227_lead@mailinator.com/.toString(),"Selected Users Add or Remove":/Add/.toString(),"Development Field":/Development Parent Dropdown Question/.toString(),"Development Field Included or Required":/Included/.toString(),"Action":/Activate/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/Development Idea Save/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/Development Idea Done/.toString(),"Action":/Submit/.toString())
        //Select Multiple Ideas in Pipeline Steps
        new actions.PipelineStepsView.SelectMultipleIdeasinPipelineSteps().run("Idea Names":["Development Idea Save","Development Idea Done"])
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/Development/.toString(),"Action":/Change Step/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/brightc132227_lead@mailinator.com/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/Development Idea Save/.toString())
        //Set Development for Idea in Action Items page
        new actions.ActionItems.SetDevelopmentforIdeainActionItemspage().run("Development Parent Dropdown Question":/Answer 2/.toString(),"Development Child Checkbox Question":[],"Action":/Save/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Verify and Access Revision History Development for Idea in Action Items page
        new actions.ActionItems.VerifyRevisionHistoryDevelopmentforIdeainActionItemspage().run("Revision History":/Current Version/.toString(),"Development Parent Dropdown Question":/Answer 2/.toString())
        //Set Tab in View Idea 3
        new actions.ViewIdea30.SetTabinViewIdea3().run("Tab":/Development/.toString())
        //Verify View Idea3 Description Tab Field Value
        new actions.ViewIdea3Fields.VerifyViewIdea3DescriptionTabFieldValue().run("Field Name":/Development Parent Dropdown Question/.toString(),"Field Value":/Answer 2/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/Development Idea Done/.toString())
        //Set Development for Idea in Action Items page
        new actions.ActionItems.SetDevelopmentforIdeainActionItemspage().run("Development Parent Dropdown Question":/Answer 3/.toString(),"Development Child Checkbox Question":[],"Action":/Mark Complete/.toString(),"Action on Mark Development Form Complete":/Mark Complete/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Verify and Access Revision History Development for Idea in Action Items page
        new actions.ActionItems.VerifyRevisionHistoryDevelopmentforIdeainActionItemspage().run("Revision History":/Current Version/.toString(),"Development Parent Dropdown Question":/Answer 3/.toString())
        //Set Tab in View Idea 3
        new actions.ViewIdea30.SetTabinViewIdea3().run("Tab":/Development/.toString())
        //Verify View Idea3 Description Tab Field Value
        new actions.ViewIdea3Fields.VerifyViewIdea3DescriptionTabFieldValue().run("Field Name":/Development Parent Dropdown Question/.toString(),"Field Value":/Answer 3/.toString())
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
    //Delete this when Scheduler feature is enabled for everyone
    public static def Action66ec7933e12425a91ee5d983(def params){
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for BIOnly Beta tab
        new actions.SetupBI.SetEnterpriseSetupforBIOnlyBetatab().run("Scheduler updates":true,"Sync Phase and Scheduler Content":true)

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