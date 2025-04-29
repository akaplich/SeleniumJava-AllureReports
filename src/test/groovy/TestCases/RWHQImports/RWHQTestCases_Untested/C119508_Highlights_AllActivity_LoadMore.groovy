package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C119508 - Highlights - All Activity - Load More
class C119508_Highlights_AllActivity_LoadMore
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
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Pipeline Idea1/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Pipeline Idea2/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Pipeline Idea3/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Pipeline Idea4/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Pipeline Idea5/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Pipeline Idea6/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Pipeline Idea7/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Pipeline Idea8/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Pipeline Idea9/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Pipeline Idea10/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Pipeline Idea11/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Pipeline Idea12/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Pipeline Idea13/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Pipeline Idea14/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Pipeline Idea15/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Pipeline Idea16/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Pipeline Idea17/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Pipeline Idea18/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Pipeline Idea19/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Pipeline Idea20/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Pipeline Idea21/.toString(),"Action":/Submit/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString(),"Highlights":true,"Activities":true,"My Ideas":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for BIOnly Beta tab
        new actions.SetupBI.SetEnterpriseSetupforBIOnlyBetatab().run("Userhome Activity Feed Updates":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/nonbisysadmin@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Verify Highlights Item on User Homepage
        new actions.Enterprise.UserHomepage.VerifyHighlightsItemonUserHomepage().run("Highlights Item Header":/System Admin submitted "Pipeline Idea1"/.toString(),"Number of Matches":/0/.toString())
        //Verify Highlights Item on User Homepage
        new actions.Enterprise.UserHomepage.VerifyHighlightsItemonUserHomepage().run("Highlights Item Header":/System Admin submitted "Pipeline Idea2"/.toString(),"Number of Matches":/1/.toString())
        //Verify Highlights Item on User Homepage
        new actions.Enterprise.UserHomepage.VerifyHighlightsItemonUserHomepage().run("Highlights Item Header":/System Admin submitted "Pipeline Idea3"/.toString(),"Number of Matches":/1/.toString())
        //Verify Highlights Item on User Homepage
        new actions.Enterprise.UserHomepage.VerifyHighlightsItemonUserHomepage().run("Highlights Item Header":/System Admin submitted "Pipeline Idea4"/.toString(),"Number of Matches":/1/.toString())
        //Verify Highlights Item on User Homepage
        new actions.Enterprise.UserHomepage.VerifyHighlightsItemonUserHomepage().run("Highlights Item Header":/System Admin submitted "Pipeline Idea5"/.toString(),"Number of Matches":/1/.toString())
        //Verify Highlights Item on User Homepage
        new actions.Enterprise.UserHomepage.VerifyHighlightsItemonUserHomepage().run("Highlights Item Header":/System Admin submitted "Pipeline Idea6"/.toString(),"Number of Matches":/1/.toString())
        //Verify Highlights Item on User Homepage
        new actions.Enterprise.UserHomepage.VerifyHighlightsItemonUserHomepage().run("Highlights Item Header":/System Admin submitted "Pipeline Idea7"/.toString(),"Number of Matches":/1/.toString())
        //Verify Highlights Item on User Homepage
        new actions.Enterprise.UserHomepage.VerifyHighlightsItemonUserHomepage().run("Highlights Item Header":/System Admin submitted "Pipeline Idea8"/.toString(),"Number of Matches":/1/.toString())
        //Verify Highlights Item on User Homepage
        new actions.Enterprise.UserHomepage.VerifyHighlightsItemonUserHomepage().run("Highlights Item Header":/System Admin submitted "Pipeline Idea9"/.toString(),"Number of Matches":/1/.toString())
        //Verify Highlights Item on User Homepage
        new actions.Enterprise.UserHomepage.VerifyHighlightsItemonUserHomepage().run("Highlights Item Header":/System Admin submitted "Pipeline Idea10"/.toString(),"Number of Matches":/1/.toString())
        //Verify Highlights Item on User Homepage
        new actions.Enterprise.UserHomepage.VerifyHighlightsItemonUserHomepage().run("Highlights Item Header":/System Admin submitted "Pipeline Idea11"/.toString(),"Number of Matches":/1/.toString())
        //Verify Highlights Item on User Homepage
        new actions.Enterprise.UserHomepage.VerifyHighlightsItemonUserHomepage().run("Highlights Item Header":/System Admin submitted "Pipeline Idea12"/.toString(),"Number of Matches":/1/.toString())
        //Verify Highlights Item on User Homepage
        new actions.Enterprise.UserHomepage.VerifyHighlightsItemonUserHomepage().run("Highlights Item Header":/System Admin submitted "Pipeline Idea13"/.toString(),"Number of Matches":/1/.toString())
        //Verify Highlights Item on User Homepage
        new actions.Enterprise.UserHomepage.VerifyHighlightsItemonUserHomepage().run("Highlights Item Header":/System Admin submitted "Pipeline Idea14"/.toString(),"Number of Matches":/1/.toString())
        //Verify Highlights Item on User Homepage
        new actions.Enterprise.UserHomepage.VerifyHighlightsItemonUserHomepage().run("Highlights Item Header":/System Admin submitted "Pipeline Idea15"/.toString(),"Number of Matches":/1/.toString())
        //Verify Highlights Item on User Homepage
        new actions.Enterprise.UserHomepage.VerifyHighlightsItemonUserHomepage().run("Highlights Item Header":/System Admin submitted "Pipeline Idea16"/.toString(),"Number of Matches":/1/.toString())
        //Verify Highlights Item on User Homepage
        new actions.Enterprise.UserHomepage.VerifyHighlightsItemonUserHomepage().run("Highlights Item Header":/System Admin submitted "Pipeline Idea17"/.toString(),"Number of Matches":/1/.toString())
        //Verify Highlights Item on User Homepage
        new actions.Enterprise.UserHomepage.VerifyHighlightsItemonUserHomepage().run("Highlights Item Header":/System Admin submitted "Pipeline Idea18"/.toString(),"Number of Matches":/1/.toString())
        //Verify Highlights Item on User Homepage
        new actions.Enterprise.UserHomepage.VerifyHighlightsItemonUserHomepage().run("Highlights Item Header":/System Admin submitted "Pipeline Idea19"/.toString(),"Number of Matches":/1/.toString())
        //Verify Highlights Item on User Homepage
        new actions.Enterprise.UserHomepage.VerifyHighlightsItemonUserHomepage().run("Highlights Item Header":/System Admin submitted "Pipeline Idea20"/.toString(),"Number of Matches":/1/.toString())
        //Verify Highlights Item on User Homepage
        new actions.Enterprise.UserHomepage.VerifyHighlightsItemonUserHomepage().run("Highlights Item Header":/System Admin submitted "Pipeline Idea21"/.toString(),"Number of Matches":/1/.toString())
        //Verify Highlights Item on User Homepage
        new actions.Enterprise.UserHomepage.VerifyHighlightsItemonUserHomepage().run("Highlights Item Header":/Sri submitted "test idea1"/.toString(),"Number of Matches":/0/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/BUTTON[contains(@class,'f-load-more-btn')]/.toString())
        //Verify Highlights Item on User Homepage
        new actions.Enterprise.UserHomepage.VerifyHighlightsItemonUserHomepage().run("Highlights Item Header":/Sri submitted "test idea1"/.toString(),"Number of Matches":/1/.toString())
        //Verify Highlights Item on User Homepage
        new actions.Enterprise.UserHomepage.VerifyHighlightsItemonUserHomepage().run("Highlights Item Header":/Sri submitted "solve test idea2"/.toString(),"Number of Matches":/1/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/0/.toString())
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