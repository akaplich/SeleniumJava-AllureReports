import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C128256 - Business Impact Updates - List View Export Updates
class C128256_BusinessImpactUpdates_ListViewExportUpdates
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
        //Add User in People page
        new actions.People.AddUserinPeoplepage().run("Email Address":/brightc128256_1@mailinator.com/.toString(),"First Name":/Autouserfirst/.toString(),"Last Name":/Autouserlast/.toString(),"Screen Name":/Autouserscreen/.toString(),"Administrator":true,"Action":/Add User/.toString())
        //Get Registration Link from Email
        variables."link" = new actions.Mailinator.GetRegistrationLinkfromEmail().run("Email Address":/brightc128256_1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        //Complete User Registration
        new actions.general.CompleteUserRegistration().run("Password":/brightidea1/.toString(),"Confirm Password":/brightidea1/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Add or Update":/Add/.toString(),"Access Business Impact From":/View Idea/.toString())
        //Set Date Version and Notes for Financial Summary in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetDateandNotesforFinancialSummaryinBusinessImpacttab().run("Date":/12\/15\/2019/.toString())
        //Set Benefits in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetBenefitsinBusinessImpacttab().run("Add or Edit Benefits":/Add,Add/.toString(),"Year":/2019,2020/.toString(),"Current Year":/2019/.toString(),"Benefit Type":/Cost Savings,Cost Savings/.toString(),"Projected Benefit":/99980,12345/.toString(),"Actual Benefit":/98760,54321/.toString(),"Row Number of the Benefit":/1,1/.toString())
        //Set Costs in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetCostsinBusinessImpacttab().run("Add or Edit Costs":/Add,Add/.toString(),"Year":/2019,2020/.toString(),"Current Year":/2019/.toString(),"Cost Title":/Cost1,Cost1/.toString(),"Projected Cost":/99,45/.toString(),"Actual Cost":/76,54/.toString(),"Row Number":/1,1/.toString())
        //Set Non Financial Benefit in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetNonFinancialBenefitinBusinessImpacttab().run("Add or Edit":/Add/.toString(),"Benefit Title":/New Data/.toString(),"Benefit Type":/Brand Awareness/.toString(),"Start Date":/12\/15\/2019/.toString(),"End Date":/12\/15\/2020/.toString(),"Description":/Description1/.toString(),"Row Number":/1/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Action":/Save Version/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/brightc128256_1@mailinator.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline List/.toString())
        //Export Ideas from Pipeline List View
        new actions.PipelineList.ExportIdeasfromPipelineListView().run([:])
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Custom_App-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Title","Code","Stage","Step","Submitted","Submitter","Submission Team","Category","Status","Innovation State","Points","Views","Visible"],"Number of Matches":/1/.toString(),"Total Number of Rows":/6/.toString())
        //Export Ideas from Pipeline List View
        new actions.PipelineList.ExportIdeasfromPipelineListView().run([:])
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Custom_App-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["test idea1","D102","Collection","Review","New Product","Under Review","Idea","1","Yes"],"Number of Matches":/1/.toString(),"Total Number of Rows":/6/.toString())
        //Export Ideas from Pipeline List View
        new actions.PipelineList.ExportIdeasfromPipelineListView().run([:])
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Custom_App-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["test idea1","112325","-144","153081","-130","1"],"Number of Matches":/1/.toString(),"Total Number of Rows":/6/.toString())
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