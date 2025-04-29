import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C117057 - Analyst - Export Business Impact tab dashboard
class C117057_Analyst_ExportBusinessImpacttabdashboard
{
//    private static def variables = [:]
//
//    @BeforeSuite
//    public void beforeState(){
//        variables."URL" = /https:\/\/test.brightideatest.com/
//        variables."Browser" = /Chrome/
//        variables."TestRail_RunName" = null
//        variables."TestRail_ExecutionName" = null
//        variables."CodeEnvironment" = /Default/
//        variables."Database" = null
//    }
//    @Test
//    public void testcase(){
//        //Basestate
//        Action58123c20fa4ee77809f468f6([:])
//        //Navigate
//        new actions.general.Navigate().run("Area to Navigate to":/People/.toString())
//        //Add User in People page
//        new actions.People.AddUserinPeoplepage().run("Email Address":/brightc17057_8@mailinator.com/.toString(),"First Name":/Autouserfirst/.toString(),"Last Name":/Autouserlast/.toString(),"Screen Name":/Autouserscreen/.toString(),"Action":/Add User/.toString())
//        //Get Registration Link from Email
//        variables."link" = new actions.Mailinator.GetRegistrationLinkfromEmail().run("Email Address":/brightc17057_8/.toString())
//        //Navigate to URL
//        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
//        //Complete User Registration
//        new actions.general.CompleteUserRegistration().run("Password":/brightidea1/.toString(),"Confirm Password":/brightidea1/.toString())
//        //Log Out
//        new actions.general.LogOut().run([:])
//        //Login
//        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
//        //Navigate WebStorm or MTS
//        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
//        //Access Idea in Idea Board page
//        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
//        //Set Business Impact Tab
//        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Add or Update":/Add/.toString(),"Access Business Impact From":/View Idea/.toString())
//        //Set Date Version and Notes for Financial Summary in Business Impact tab
//        new actions.ViewIdea.BusinessImpact.SetDateandNotesforFinancialSummaryinBusinessImpacttab().run("Date":/08\/07\/2017/.toString())
//        //Set Benefits in Business Impact tab
//        new actions.ViewIdea.BusinessImpact.SetBenefitsinBusinessImpacttab().run("Add or Edit Benefits":/Add,Add/.toString(),"Year":/2017,2018/.toString(),"Current Year":/2017/.toString(),"Benefit Type":/Cost Avoidance,Cost Avoidance/.toString(),"Projected Benefit":/10000,19000/.toString(),"Actual Benefit":/9500,19500/.toString(),"Row Number of the Benefit":/1,1/.toString())
//        //Set Business Impact Tab
//        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Action":/Save Version/.toString())
//        //Navigate WebStorm or MTS
//        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
//        //Access Idea in Idea Board page
//        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea2/.toString())
//        //Set Business Impact Tab
//        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Add or Update":/Add/.toString(),"Access Business Impact From":/View Idea/.toString())
//        //Set Date Version and Notes for Financial Summary in Business Impact tab
//        new actions.ViewIdea.BusinessImpact.SetDateandNotesforFinancialSummaryinBusinessImpacttab().run("Date":/08\/07\/2017/.toString())
//        //Set Benefits in Business Impact tab
//        new actions.ViewIdea.BusinessImpact.SetBenefitsinBusinessImpacttab().run("Add or Edit Benefits":/Add,Add/.toString(),"Year":/2017,2018/.toString(),"Current Year":/2017/.toString(),"Benefit Type":/Cost Avoidance,Cost Avoidance/.toString(),"Projected Benefit":/15000,29000/.toString(),"Actual Benefit":/19500,10500/.toString(),"Row Number of the Benefit":/1,1/.toString())
//        //Set Business Impact Tab
//        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Action":/Save Version/.toString())
//        //Navigate WebStorm or MTS
//        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Setup/.toString())
//        //Set Roles in Pipeline Setup Page
//        new actions.PipelineSetup.SetRolesinPipelineSetupPage().run("Navigate to Tab":true,"Analysts":/Autouserscreen/.toString(),"Analysts Add or Remove":/Add/.toString())
//        //Log Out
//        new actions.general.LogOut().run([:])
//        //Login
//        new actions.general.Login().run("Email":/brightc17057_8@mailinator.com/.toString(),"Password":/brightidea1/.toString())
//        //Navigate WebStorm or MTS
//        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Dashboard/.toString())
//        //Navigate To Pipeline DashBoard Tab
//        new actions.PipelineDashBoard.NavigateToPipelineDashBoardTab().run("Tab":/Business Impact Tab/.toString())
//        //Export Ideas from Pipeline Dashboard Business Impact Tab
//        new actions.PipelineDashBoard.ExportIdeasfromPipelineDashboardBusinessImpactTab().run("Action":/Export/.toString())
//        //Get Download Link from Email
//        variables."link" = new actions.Mailinator.GetDownloadLinkfromEmail().run("Email Address":/brightc17057_8/.toString())
//        //Navigate to URL
//        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
//        //Wait
//        new actions.general.Wait().run("Seconds":/3/.toString())
//        //Verify File Data
//        new actions.general.VerifyFileData().run("File Name":/auto*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Idea Title","Category","Stage","Outcome Period Start","Outcome Type","Outcome Title"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
//        //Navigate to URL
//        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
//        //Wait
//        new actions.general.Wait().run("Seconds":/3/.toString())
//        //Verify File Data
//        new actions.general.VerifyFileData().run("File Name":/auto*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["2017 Projected Benefit ($)","2017 Projected Cost ($)","2017 Actual Benefit ($)","2017 Actual Cost ($)","2018 Projected Benefit ($)","2018 Projected Cost ($)","2018 Actual Benefit ($)","2018 Actual Cost ($)"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
//        //Navigate to URL
//        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
//        //Wait
//        new actions.general.Wait().run("Seconds":/3/.toString())
//        //Verify File Data
//        new actions.general.VerifyFileData().run("File Name":/auto*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Code","Status","Description","Submitted Date","Submitter","Submitter Email","Step","Associated Tags","Required Short Question"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
//        //Navigate to URL
//        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
//        //Wait
//        new actions.general.Wait().run("Seconds":/3/.toString())
//        //Verify File Data
//        new actions.general.VerifyFileData().run("File Name":/auto*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["test idea1","New Product","Collection","Benefit","Cost Avoidance","10000","0","9500"],"Number of Matches":/1/.toString(),"Total Number of Rows":/3/.toString())
//    }
//    //Basestate
//    public static def Action58123c20fa4ee77809f468f6(def params){
//        //Create Affiliate based on Master Affiliate
//        variables."affiliateURL" = new actions.API.Utils.CopyAffiliate().run("Licensing Model":/${params."Licensing Model"}/.toString(),"Unlimited Brightidea Administrator License Type":/${params."Unlimited Brightidea Administrator License Type"}/.toString(),"Brightidea Administrator License Type Purchased Count":/${params."Brightidea Administrator License Type Purchased Count"}/.toString(),"Unlimited Idea Box Manager License Type":/${params."Unlimited Idea Box Manager License Type"}/.toString(),"Idea Box Manager License Type Purchased Count":/${params."Idea Box Manager License Type Purchased Count"}/.toString())
//        //Open Browser
//        new actions.selenium.Browser().run("Run Browser in Incognito":/${params."Run Browser in Incognito"}/.toString(),"URL":/${variables."affiliateURL"}/.toString(),"Browser Type":/${variables."Browser"}/.toString())
//        //Login
//        new actions.general.Login().run("Email":/${params."Username Email"}/.toString(),"Password":/brightidea1/.toString())
//        //Set to Lab Environment
//        new actions.Utils.SettoLabEnvironment().run("Email":/${params."Username Email"}/.toString())
//
//    }
//    //Afterstate
//    public static def Action581259c8fa4ee77809f46905(def params){
//        try{
//            //Close Current Window
//            new actions.selenium.CloseWindow().run([:])
//        }
//       catch(all){}catch(Error err){}
//        //Delete Affiliate
//        new actions.API.Utils.DeleteAffiliate().run([:])
//
//    }
//    @AfterMethod
//    public void afterState(){
//        //Afterstate
//        Action581259c8fa4ee77809f46905([:])
//    }
}