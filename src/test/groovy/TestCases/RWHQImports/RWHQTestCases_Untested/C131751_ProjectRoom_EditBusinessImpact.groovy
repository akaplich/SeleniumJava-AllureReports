package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131751 - Project Room > Edit Business Impact
class C131751_ProjectRoom_EditBusinessImpact
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Unlimited Brightidea Administrator License Type":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Configure Business Impact Fields
        new actions.SetupIdeas.SetConfigureBusinessImpactFields().run("Action":/Add,Add/.toString(),"Type":/financial-benefits,non-financial-benefits/.toString(),"Benefit Title":/financialbenefit,nonfinancialbenefit/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString(),"Activities":true,"My Ideas":true,"Submissions":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Project Room - Create Project Room
        new actions.ProjectRoom.ProjectRoomCreateProjectRoom().run([:])
        //Set and Verify Project Room Title
        new actions.ProjectRoom.SetProjectRoomTitle().run("Title":/Testing project room/.toString(),"Action":/Submit/.toString())
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Top Link":/Project Room Settings/.toString())
        //Set Tab in Room Settings in Project Room
        new actions.ProjectRoom.SetTabinRoomSettingsinProjectRoom().run("Tab":/Members/.toString())
        //Set Members in Project Room
        new actions.ProjectRoom.SetMembersinProjectRoom().run("Member":/End User,Pipeline Admin/.toString(),"Member Add or Remove":/Add,Add/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Verify and Access Project Room Card in Userhome
        new actions.ProjectRoom.VerifyProjectRoomCard().run("Title":/Testing project room/.toString(),"Color of the Project Room Icon":/rgb(52, 152, 219)/.toString(),"Updated":/A member was added/.toString(),"Updated By":/System Admin/.toString(),"Member count":/3/.toString(),"Total Objects":/1/.toString(),"Total Tasks":/0/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString(),"Access Project Room":true)
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Business Impact/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Add or Update":/Add/.toString())
        //Set Date Version and Notes for Financial Summary in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetDateandNotesforFinancialSummaryinBusinessImpacttab().run("Date":/05\/09\/2024/.toString())
        //Set Benefits in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetBenefitsinBusinessImpacttab().run("Add or Edit Benefits":/Add,Add,Add,Add/.toString(),"Year":/2024,2025,2024,2025/.toString(),"Current Year":/2024/.toString(),"Benefit Type":/Cost Savings,Cost Savings,financialbenefit,financialbenefit/.toString(),"Projected Benefit":/5000,15000,1000,2000/.toString(),"Actual Benefit":/4000,14000,3000,1000/.toString(),"Row Number of the Benefit":/1,1,2,2/.toString())
        //Set Non Financial Benefit in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetNonFinancialBenefitinBusinessImpacttab().run("Add or Edit":/Add/.toString(),"Benefit Title":/Product Launch/.toString(),"Benefit Type":/nonfinancialbenefit/.toString(),"Description":/A Product Launch is a marketing strategy consisting of a carefully planned and scheduled sequence of events with the goal to make a big happening out of the release and, of course, make as much sales as possible in a short time span. To achieve this the launch is scheduled to a specific date and time./.toString(),"Row Number":/1/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Action":/Save Version/.toString())
        //Verify Projected and Actual Benefits in Business Impact tab for View Idea page
        new actions.ViewIdea.BusinessImpact.VerifyProjectedandActualBenefitsinBusinessImpacttabforViewIdeapage().run("Year":/2024;2025/.toString(),"Current Year":/2024/.toString(),"Benefit Type":/Cost Savings;Cost Savings;financialbenefit;financialbenefit/.toString(),"Row Number of the Benefit":/1;1;2;2/.toString(),"Projected Benefit":/5,000;15,000;1,000;2,000/.toString(),"Actual Benefit":/4,000;14,000;3,000;1,000/.toString())
        //Verify Non Financial Benefits in Business Impact tab for View Idea page
        new actions.ViewIdea.BusinessImpact.VerifyNonFinancialBenefitsinBusinessImpacttabforViewIdeapage().run("Benefit Title":/Product Launch/.toString(),"Benefit Type":/nonfinancialbenefit/.toString(),"Description":/A Product Launch is a marketing strategy consisting of a carefully planned and scheduled sequence of events with the goal to make a big happening out of the release and, of course, make as much sales as possible in a short time span. To achieve this the launch is scheduled to a specific date and time./.toString(),"Row Number":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Verify and Access Project Room Card in Userhome
        new actions.ProjectRoom.VerifyProjectRoomCard().run("Title":/Testing project room/.toString(),"Color of the Project Room Icon":/rgb(52, 152, 219)/.toString(),"Updated":/An object was added/.toString(),"Updated By":/End User/.toString(),"Member count":/3/.toString(),"Total Objects":/2/.toString(),"Total Tasks":/0/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString(),"Access Project Room":true)
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Room Item":/Business Impact/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Add or Update":/Update/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/10/.toString())
        //Set Costs in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetCostsinBusinessImpacttab().run("Add or Edit Costs":/Add,Add/.toString(),"Year":/2024,2025/.toString(),"Current Year":/2024/.toString(),"Cost Title":/Future Assets,Future Assets/.toString(),"Projected Cost":/6300,14000/.toString(),"Actual Cost":/1000,7800/.toString(),"Row Number":/1,1/.toString())
        //Set Benefits in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetBenefitsinBusinessImpacttab().run("Add or Edit Benefits":/Edit,Edit/.toString(),"Year":/2024,2025/.toString(),"Current Year":/2024/.toString(),"Benefit Type":/Other,Other,financialbenefit,financialbenefit/.toString(),"Projected Benefit":/85000,400,9000,189/.toString(),"Actual Benefit":/74000,300,14000,4000/.toString(),"Row Number of the Benefit":/1,1,2,2/.toString())
        //Set Non Financial Benefit in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetNonFinancialBenefitinBusinessImpacttab().run("Add or Edit":/Edit/.toString(),"Benefit Title":/Product Launch Canceled/.toString(),"Benefit Type":/nonfinancialbenefit/.toString(),"Description":/Changed Description/.toString(),"Row Number":/1/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Action":/Save Version/.toString())
        //Verify Projected and Actual Benefits in Business Impact tab for View Idea page
        new actions.ViewIdea.BusinessImpact.VerifyProjectedandActualBenefitsinBusinessImpacttabforViewIdeapage().run("Year":/2024;2025/.toString(),"Current Year":/2024/.toString(),"Benefit Type":/Other;Other;financialbenefit;financialbenefit/.toString(),"Row Number of the Benefit":/1;1;2;2/.toString(),"Projected Benefit":/85,000;400;9,000;189/.toString(),"Actual Benefit":/74,000;300;14,000;4,000/.toString())
        //Verify Projected and Actual Costs in Business Impact tab for View Idea page
        new actions.ViewIdea.BusinessImpact.VerifyProjectedandActualCostsinBusinessImpacttabforViewIdeapage().run("Year":/2024;2025/.toString(),"Current Year":/2024/.toString(),"Costs Title":/Future Assets;Future Assets/.toString(),"Row Number":/1;1/.toString(),"Projected Cost":/6,300;14,000/.toString(),"Actual Cost":/1,000;7,800/.toString())
        //Verify Total Cost and Benefits in Business Impact tab
        new actions.ViewIdea.BusinessImpact.VerifyTotalCostandBenefitsinBusinessImpacttab().run("Year":/2024;2025/.toString(),"Current Year":/2024/.toString(),"Total Projected Benefit":/86,000;2,400/.toString(),"Total Actual Benefit":/77,000;1,300/.toString(),"Total Projected Cost":/6,300;14,000/.toString(),"Total Actual Cost":/1,000;7,800/.toString(),"Projected Net Benefit":/79,700;-11,600/.toString(),"Actual Net Benefit":/76,000;-6,500/.toString())
        //Verify Non Financial Benefits in Business Impact tab for View Idea page
        new actions.ViewIdea.BusinessImpact.VerifyNonFinancialBenefitsinBusinessImpacttabforViewIdeapage().run("Benefit Title":/Product Launch Canceled/.toString(),"Benefit Type":/nonfinancialbenefit/.toString(),"Description":/Changed Description/.toString(),"Row Number":/1/.toString())
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