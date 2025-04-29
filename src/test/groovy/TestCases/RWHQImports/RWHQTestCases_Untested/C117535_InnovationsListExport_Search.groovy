package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C117535 - Innovations List Export - Search
class C117535_InnovationsListExport_Search
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
        //Create Mailinator User
        new actions.Mailinator.CreateMailinatorUser().run("Email":/brightC117535_1/.toString(),"Enterprise System Administrator":true,"Finally Login as What User":/brightC117535_1@mailinator.com/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Innovations/.toString())
        //Search Innovation List
        new actions.NGAInnovationList.SearchInnovationList().run("Search Field":/test idea/.toString())
        //Export Ideas from Innovations List/Export from People
        new actions.NGAInnovationList.ExportIdeasfromInnovationsList().run("Action":/Export/.toString())
        //Get Download Link from Email
        variables."link" = new actions.Mailinator.GetDownloadLinkfromEmail().run("Email Address":/brightC117535_1/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/3/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Innovations-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["test idea1","test idea1 desc","D102","Collection","Review","Sri","New Product","Idea","1","0","Yes"],"Number of Matches":/1/.toString(),"Total Number of Rows":/5/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Innovations-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["test idea2","test idea2 desc","D107"],"Number of Matches":/1/.toString(),"Total Number of Rows":/5/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Innovations-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["solve test idea1"],"Number of Matches":/1/.toString(),"Total Number of Rows":/5/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Innovations-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["solve test idea2"],"Number of Matches":/1/.toString(),"Total Number of Rows":/5/.toString())
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