import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C119534 - Development AI Category - Email Alert for Idea Submitter
class C119534_DevelopmentAICategory_EmailAlertforIdeaSubmitter
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
        new actions.Mailinator.CreateMailinatorUser().run("Email":/brightC119534_4/.toString(),"Finally Login as What User":/bi.adminuser1@brightidea.com/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Create Step in Pipeline Steps page
        new actions.PipelineStepsView.CreateStepinPipelineStepspage().run("Step Name":/New Dev Step/.toString(),"Select Tool Type":/Development/.toString(),"Select Stage":/Evaluation/.toString(),"Action":/Create/.toString())
        //Configure Development Step in Pipeline Steps page
        new actions.PipelineStepsConfigure.ConfigureDevelopmentinNewModalinPipelineStepspage().run("Assignment Method":/Category Assignment/.toString(),"Development Lead Category":/New Product,Operations,Marketing & Branding,Strategy,Quick Add\/New Categories/.toString(),"Development Lead":/Idea Submitter,Idea Submitter,Idea Submitter,Idea Submitter,Idea Submitter/.toString(),"Development Field":/Development Multiple Choice Question/.toString(),"Development Field Included or Required":/Included/.toString(),"Action":/Activate/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/brightC119534_4@mailinator.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/dev test idea1/.toString(),"Description":/desc/.toString(),"Category":/Operations/.toString(),"Required Short Question":/short/.toString(),"Action":/Submit Idea/.toString())
        try{
            //Verify Email
            new actions.Mailinator.VerifyEmail().run("Email Address":/brightC119534_4/.toString(),"Subject":/Idea Submission Confirmation/.toString())
        }
       catch(all){}catch(Error err){}
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/dev test idea1/.toString())
        //Change Idea Step in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaStepinPipelineStepspage().run("Step":/New Dev Step/.toString(),"Action":/Change Step/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Get Link from Action Item Email
        variables."link" = new actions.Mailinator.GetLinkfromActionItemEmail().run("Email Address":/brightC119534_4@mailinator.com/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."link"}/.toString())
        try{
            //Login
            new actions.general.Login().run("Email":/brightC119534_4@mailinator.com/.toString(),"Password":/brightidea1/.toString())
        }
       catch(all){}catch(Error err){}
        //Set Development for Idea in Action Items page
        new actions.ActionItems.SetDevelopmentforIdeainActionItemspage().run("Development Multiple Choice Question":/Answer 2/.toString(),"Development Child Checkbox Question":[],"Action":/Mark Complete/.toString(),"Action on Mark Development Form Complete":/Mark Complete/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Action Items/.toString())
        //Verify Completed table for Action Items page
        new actions.ActionItems.VerifyCompletedtableforActionItemspage().run("Completed Tab Value":/1/.toString(),"Title":/dev test idea1/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Open Tab Value":/0/.toString(),"Title":/dev test idea1/.toString(),"Number of Matches":/0/.toString())
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