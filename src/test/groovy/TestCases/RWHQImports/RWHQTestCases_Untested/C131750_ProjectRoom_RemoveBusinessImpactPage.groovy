package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131750 - Project Room > Remove Business Impact Page
class C131750_ProjectRoom_RemoveBusinessImpactPage
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
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
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
        //Add or Delete Year in Business Impact Tab
        new actions.ViewIdea.BusinessImpact.AddorDeleteYearinBusinessImpactTab().run("Add or Delete":/Add/.toString())
        //Set Benefits in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetBenefitsinBusinessImpacttab().run("Add or Edit Benefits":/Add,Add,Add/.toString(),"Year":/2024,2025,2026/.toString(),"Current Year":/2024/.toString(),"Benefit Type":/Revenue,Revenue,Revenue/.toString(),"Projected Benefit":/5000,15000,2000/.toString(),"Actual Benefit":/4000,14000,100/.toString(),"Row Number of the Benefit":/1,1,1/.toString())
        //Set Costs in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetCostsinBusinessImpacttab().run("Add or Edit Costs":/Add,Add,Add/.toString(),"Year":/2024,2025,2026/.toString(),"Current Year":/2024/.toString(),"Cost Title":/Current Assets,Current Assets,Current Assets/.toString(),"Projected Cost":/100,200,300/.toString(),"Actual Cost":/10,20,30/.toString(),"Row Number":/1,1,1/.toString())
        //Set Non Financial Benefit in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetNonFinancialBenefitinBusinessImpacttab().run("Add or Edit":/Add/.toString(),"Benefit Title":/Product Launch/.toString(),"Benefit Type":/Brand Awareness/.toString(),"Description":/A Product Launch is a marketing strategy consisting of a carefully planned and scheduled sequence of events./.toString(),"Row Number":/1/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Action":/Save Version/.toString())
        //Verify Projected and Actual Benefits in Business Impact tab for View Idea page
        new actions.ViewIdea.BusinessImpact.VerifyProjectedandActualBenefitsinBusinessImpacttabforViewIdeapage().run("Year":/2024;2025;2026/.toString(),"Current Year":/2024/.toString(),"Benefit Type":/Revenue;Revenue;Revenue/.toString(),"Row Number of the Benefit":/1;1;1/.toString(),"Projected Benefit":/5,000;15,000;2,000/.toString(),"Actual Benefit":/4,000;14,000;100/.toString())
        //Verify Projected and Actual Costs in Business Impact tab for View Idea page
        new actions.ViewIdea.BusinessImpact.VerifyProjectedandActualCostsinBusinessImpacttabforViewIdeapage().run("Year":/2024;2025;2026/.toString(),"Current Year":/2024/.toString(),"Costs Title":/Current Assets;Current Assets;Current Assets/.toString(),"Row Number":/1;1;1/.toString(),"Projected Cost":/100;200;300/.toString(),"Actual Cost":/10;20;30/.toString())
        //Verify Non Financial Benefits in Business Impact tab for View Idea page
        new actions.ViewIdea.BusinessImpact.VerifyNonFinancialBenefitsinBusinessImpacttabforViewIdeapage().run("Benefit Title":/Product Launch/.toString(),"Benefit Type":/Brand Awareness/.toString(),"Description":/A Product Launch is a marketing strategy consisting of a carefully planned and scheduled sequence of events./.toString(),"Row Number":/1/.toString())
        //Set Edit Menu for Room Pages in Project Room
        new actions.ProjectRoom.SetEditMenuforRoomPagesinProjectRoom().run("Room Page":/Business Impact/.toString(),"Menu Options":/Delete/.toString(),"Placement Number Of Folder or Page":/2/.toString())
        //Set Remove Page on Project room
        new actions.ProjectRoom.SetRemovePageonProjectRoom().run("Action":/Delete/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Business Impact/.toString(),"Should Exist":false)
        //Set Room Page in the Project Room
        new actions.ProjectRoom.SetRoomPageintheProjectRoom().run("Type of Room Page":/Business Impact/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Show this/.toString(),"Should Exist":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Project Room/.toString())
        //Verify and Access Project Room Card in Userhome
        new actions.ProjectRoom.VerifyProjectRoomCard().run("Title":/Testing project room/.toString(),"Color of the Project Room Icon":/rgb(52, 152, 219)/.toString(),"Updated":/An object was added/.toString(),"Updated By":/End User/.toString(),"Member count":/3/.toString(),"Total Objects":/2/.toString(),"Total Tasks":/0/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString(),"Access Project Room":true)
        //Navigate to Top Link or Page in Project Room
        new actions.ProjectRoom.NavigateRoomItems().run("Room Item":/Business Impact/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Show this/.toString(),"Should Exist":true)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Add Impact/.toString(),"Should Exist":true)
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