package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C118914 - Initiatives Export
class C118914_InitiativesExport
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
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Go to Community
        new actions.SetupEnterpriseCommunities.GotoCommunity().run("Community Name to go to":/Developers Community/.toString())
        //Navigate Community
        new actions.SetupEnterpriseCommunities.NavigateCommunity().run("Community Page":/Setup/.toString())
        //Set Enterprise and Community Setup Exports for Initiatives tab
        new actions.SetupEnterpriseExports.SetEnterpriseExportsforInitiativestab().run("Report Options":/Initiatives/.toString(),"Format":/csv/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Initiatives/.toString(),"Report Name Starts with":/Developers Community_Initiatives/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Developers Community_Initiatives*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Initiative ID","Description","Active Users","Access Group","Sponsor","Administrators","URL","Submissions","Communities","Meta Keywords"],"Number of Matches":/1/.toString(),"Total Number of Rows":/2/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Initiatives/.toString(),"Report Name Starts with":/Developers Community/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Developers Community_Initiatives*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Active","Custom App"],"Number of Matches":/1/.toString(),"Total Number of Rows":/2/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Initiatives/.toString(),"Report Name Starts with":/Developers Community_Initiatives/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Developers Community_Initiatives*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Custom App Desc","0","All","Sri"],"Number of Matches":/1/.toString(),"Total Number of Rows":/2/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Initiatives/.toString(),"Report Name Starts with":/Developers Community_Initiatives/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Developers Community_Initiatives*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["3","Developers Community"],"Number of Matches":/1/.toString(),"Total Number of Rows":/2/.toString())
        //Remove Report from Enterprise and Community Setup Exports
        new actions.SetupEnterpriseExports.RemoveReportfromEnterpriseSetupExports().run("Section":/Initiatives/.toString(),"Instance":/1/.toString(),"Report Name Starts with":/Developers Community/.toString(),"Action":/Delete Report/.toString())
        //Verify Generated Report in any Setup Exports
        new actions.SetupExports.VerifyGeneratedReportinSetupExports().run("Report Name Starts with":/Developers Community__Initiatives/.toString(),"Number of Matches":/0/.toString())
        //Set Enterprise and Community Setup Exports for Initiatives tab
        new actions.SetupEnterpriseExports.SetEnterpriseExportsforInitiativestab().run("Report Options":/Initiatives/.toString(),"Format":/xlsx/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Initiatives/.toString(),"Report Name Starts with":/Developers Community_Initiatives/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Developers Community_Initiatives*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Initiative ID","Description","Active Users","Access Group","Sponsor","Administrators","URL","Submissions","Communities","Meta Keywords"],"Number of Matches":/1/.toString(),"Total Number of Rows":/2/.toString())
        //Download Generated Report From Enterprise and Community Exports
        new actions.SetupEnterpriseExports.DownloadGeneratedReportEnterpriseExports().run("Section":/Initiatives/.toString(),"Report Name Starts with":/Developers Community_Initiatives/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Developers Community_Initiatives*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Custom App Desc","0","All","Sri"],"Number of Matches":/1/.toString(),"Total Number of Rows":/2/.toString())
        //Remove Report from Enterprise and Community Setup Exports
        new actions.SetupEnterpriseExports.RemoveReportfromEnterpriseSetupExports().run("Section":/Initiatives/.toString(),"Instance":/1/.toString(),"Report Name Starts with":/Developers Community_Initiatives/.toString(),"Action":/Delete Report/.toString())
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