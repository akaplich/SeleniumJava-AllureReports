package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C65676 - Votes - Chips Voting
class C65676_Votes_ChipsVoting
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
        //Set Webstorm Setup Ideas for Voting tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforNewVotingtab().run("Type of Voting":/Chips/.toString(),"Total number of chips per user":/10/.toString(),"Number of chips a user can give to an idea":/10/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Set Chips in View Idea page
        new actions.ViewIdea.SetChipsinViewIdeapage().run("Add or Edit Chips":/Add Chips/.toString(),"Custom Amount":/10/.toString(),"Custom Chip Amount Action":/Submit Chips/.toString())
        //Set Scrolling on Page to Top or Bottom
        new actions.Utils.ScrollPagetoToporBottom().run("Top or Bottom":/Top/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Webstorm Setup Exports for Votes tab
        new actions.SetupExports.SetWebstormSetupExportsforVotestab().run("Report Options":/Votes/.toString(),"Format":/xlsx/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Votes/.toString(),"Report Name Starts with":/Votes/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Votes-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Screen Name","Email Address","Title","Code","Chips","Vote Date"],"Number of Matches":/1/.toString(),"Total Number of Rows":/2/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Votes/.toString(),"Report Name Starts with":/Votes/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Votes-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["System Admin","bi.adminuser1@brightidea.com","test idea1","D102","10"],"Number of Matches":/1/.toString(),"Total Number of Rows":/2/.toString())
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