package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131294 - Userhome, MTS - Memos - Cross Affiliate
class C131294_Userhome_MTS_Memos_CrossAffiliate
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
        //Open Browser
        new actions.selenium.Browser().run("Run Browser in Incognito":/TRUE/.toString(),"Browser Type":/Chrome/.toString())
        //Navigate to Other Affiliate
        new actions.general.NavigatetoSSOAffiliate().run("DomainName":/crossaffiliatetesting2/.toString())
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Memos/.toString())
        //Set Filter for Memo in Userhomepage
        new actions.Memo.SetFilterforMemo().run("Tab":/All Memos/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/End User Private Memo/.toString(),"User Name":/End User/.toString(),"Status":/Private/.toString(),"Number of Matches":/0/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/End User Batched Memo/.toString(),"User Name":/End User/.toString(),"Status":/Private/.toString(),"Number of Matches":/0/.toString())
        //Set Filter for Memo in Userhomepage
        new actions.Memo.SetFilterforMemo().run("Tab":/Private/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/End User Private Memo/.toString(),"User Name":/End User/.toString(),"Status":/Private/.toString(),"Number of Matches":/0/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/End User Batched Memo/.toString(),"User Name":/End User/.toString(),"Status":/Private/.toString(),"Number of Matches":/0/.toString())
        //Set Filter for Memo in Userhomepage
        new actions.Memo.SetFilterforMemo().run("Tab":/Memos in Batch/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/End User Private Memo/.toString(),"User Name":/End User/.toString(),"Status":/Private/.toString(),"Number of Matches":/0/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/End User Batched Memo/.toString(),"User Name":/End User/.toString(),"Status":/Private/.toString(),"Number of Matches":/0/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Copy Current URL
        variables."currentURL" = new actions.selenium.CopyCurrentURL().run([:])
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."currentURL"}mts\/memo/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/My Memos/.toString())
        //Set Filter for Memo in Userhomepage
        new actions.Memo.SetFilterforMemo().run("Tab":/All Memos/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/End User Private Memo/.toString(),"User Name":/End User/.toString(),"Status":/Private/.toString(),"Number of Matches":/0/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/End User Batched Memo/.toString(),"User Name":/End User/.toString(),"Status":/Private/.toString(),"Number of Matches":/0/.toString())
        //Set Filter for Memo in Userhomepage
        new actions.Memo.SetFilterforMemo().run("Tab":/Memos in Batch/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/End User Private Memo/.toString(),"User Name":/End User/.toString(),"Status":/Private/.toString(),"Number of Matches":/0/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/End User Batched Memo/.toString(),"User Name":/End User/.toString(),"Status":/Private/.toString(),"Number of Matches":/0/.toString())
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