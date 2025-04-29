import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C17613 - Business Model Form Builder (Business Model Canvas) edit fields
class C17613_BusinessModelFormBuilder_BusinessModelCanvas_editfields
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
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Incubate/.toString(),"Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Incubate Test/.toString(),"Description":/about/.toString(),"Pipeline Administrators":/Pipeline Admin/.toString(),"Administrators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Webstorm Setup Business Model for Ideas tab 
        new actions.SetupIdeas.SetWebstormSetupBusinessModelforIdeasTab().run("Navigate to Business Model Tab":true,"Launch Business Model Form Builder":true,"Navigate to New Tab":true,"Field to Edit":/Value Proposition/.toString(),"Question Title":/Changed Title for Value Proposition/.toString(),"Question Default Text":/This a default text for Value Proposition/.toString(),"Action":/Done/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Changed Title for Value Proposition/.toString(),"Should Exist":true)
        //Set Webstorm Setup Business Model for Ideas tab 
        new actions.SetupIdeas.SetWebstormSetupBusinessModelforIdeasTab().run("Field to Edit":/Customer Segment(s)/.toString(),"Question Title":/Changed Title for Customer Segment(s)/.toString(),"Question Default Text":/This a default text for Customer Segment(s)/.toString(),"Action":/Done/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Changed Title for Customer Segment(s)/.toString(),"Should Exist":true)
        //Set Webstorm Setup Business Model for Ideas tab 
        new actions.SetupIdeas.SetWebstormSetupBusinessModelforIdeasTab().run("Field to Edit":/Channels/.toString(),"Question Title":/Changed Title Channels1/.toString(),"Action":/Done/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Changed Title Channels1/.toString(),"Should Exist":true)
        //Set Webstorm Setup Business Model for Ideas tab 
        new actions.SetupIdeas.SetWebstormSetupBusinessModelforIdeasTab().run("Field to Edit":/Revenue Streams/.toString(),"Question Title":/@Revenue Streams12/.toString(),"Action":/Done/.toString(),"Form Action":/Save Form/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/@Revenue Streams12/.toString(),"Should Exist":true)
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