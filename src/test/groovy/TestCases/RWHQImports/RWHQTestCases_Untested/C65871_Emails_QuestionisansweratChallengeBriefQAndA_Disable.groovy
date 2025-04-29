import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C65871 - Emails - Question is answer at Challenge Brief Q&A - Disable
class C65871_Emails_QuestionisansweratChallengeBriefQAndA_Disable
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
        new actions.Mailinator.CreateMailinatorUser().run("Email":/brightC65871test1/.toString(),"Enterprise System Administrator":true,"Finally Login as What User":/brightC65871test1@mailinator.com/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Solve Webstorm
        new actions.WebstormCreation.CreateSolveWebstorm().run("App Name":/Solve/.toString(),"Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Test Email Solve/.toString(),"Challenge Brief":/About/.toString(),"Action on General Information Tab":/Continue/.toString(),"Action on Design Tab":/Continue/.toString(),"General Access":/ALL/.toString(),"General Access Add or Remove":/Add/.toString(),"Early Access":/ALL/.toString(),"Early Access Add or Remove":/Add/.toString(),"Action on Participants Tab":/Continue/.toString(),"Action on Site Schedule Tab":/Continue/.toString(),"Action on Communications Tab":/Continue/.toString(),"Action on Process Tab":/Continue/.toString(),"Action":/Create/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Test Email Solve/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Pipeline Setup/.toString())
        //Set Pipeline Setup Communications Tab
        new actions.PipelineCommunications.SetPipelineCommunicationsTab().run("Select Tab":/Emails/.toString(),"Email":/Challenge Brief Question Answered/.toString(),"Email Recipient":/Question Submitter/.toString(),"Email Subject":/Challenge Brief Q&A_C65871/.toString(),"Enable this email alert":false,"Action":/Save/.toString())
        //Set Pipeline Setup Communications Tab
        new actions.PipelineCommunications.SetPipelineCommunicationsTab().run("Select Tab":/Settings/.toString(),"Contact Name":/Bi Test Noreply/.toString(),"Contact Email":/bitestnoreply@brightidea.com/.toString(),"Action":/Save/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Test Email Solve/.toString(),"Area to Navigate to":/Home/.toString())
        //Set Challenge Brief QAndA
        new actions.Webstorm.SetChallengeBriefQAndA().run("Question or Answer":/Question/.toString(),"Text":/TestTeamplateQuestion1/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Test Email Solve/.toString(),"Area to Navigate to":/Home/.toString())
        //Set Challenge Brief QAndA
        new actions.Webstorm.SetChallengeBriefQAndA().run("Question or Answer":/Answer/.toString(),"Text":/TestTemplateAnswer1/.toString(),"Question whose answer to be posted":/TestTeamplateQuestion1/.toString())
        //Verify Email
        new actions.Mailinator.VerifyEmail().run("Email Address":/brightC65871test1/.toString(),"Subject":/Challenge Brief Q&A_C65871/.toString(),"Email Should Be Received":false)
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