import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C116996 - Submissions with Outcome Details - Include Outcome Recorder Profile Data
class C116996_SubmissionswithOutcomeDetails_IncludeOutcomeRecorderProfileData
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
        //Set Webstorm Setup Ideas for Ideas tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforIdeastab().run("Submitter access to Business Impact Tab":true)
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Profile/.toString())
        //Edit Your Profile
        new actions.UserProfile.EditYourProfile().run("Screen Name":/Screen Name for System Admin/.toString(),"First Name":/FNSystem/.toString(),"Last Name":/LNAdmin/.toString(),"Job Title":/IPM/.toString(),"Department":/Innovation/.toString(),"Location":/United States/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea2/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Add or Update":/Add/.toString(),"Access Business Impact From":/View Idea/.toString())
        //Set Benefits in Business Impact tab
        new actions.ViewIdea.BusinessImpact.SetBenefitsinBusinessImpacttab().run("Add or Edit Benefits":/Add/.toString(),"Year":/2018/.toString(),"Current Year":/2018/.toString(),"Benefit Type":/Revenue/.toString(),"Projected Benefit":/1000/.toString(),"Actual Benefit":/2000/.toString(),"Row Number of the Benefit":/1/.toString())
        //Set Business Impact Tab
        new actions.ViewIdea.BusinessImpact.SetBusinessImpactForViewIdeaPage().run("Action":/Save Version/.toString(),"Access Business Impact From":/View Idea/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Exports for Submissions tab
        new actions.SetupExports.SetWebstormSetupExportsforSubmissionstab().run("Report Options":/Submissions with Outcomes Details/.toString(),"Include outcome recorder profile data":true,"Format":/xlsx/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Submissions/.toString(),"Report Name Starts with":/Outcomes Details/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Outcomes Details-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Outcome Recorder Screen Name","Outcome Recorder Email","First Name","Last Name","Job Title","Department","Location","Expertise","Photo","External/Member ID"],"Number of Matches":/1/.toString(),"Total Number of Rows":/2/.toString())
        //Download Generated Report
        new actions.SetupExports.DownloadGeneratedReport().run("Section":/Submissions/.toString(),"Report Name Starts with":/Outcomes Details/.toString(),"Instance":/1/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Outcomes Details-*.xlsx/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Screen Name for System Admin","bi.adminuser1@brightidea.com","FNSystem","LNAdmin","IPM","Innovation","United States"],"Number of Matches":/1/.toString(),"Total Number of Rows":/2/.toString())
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