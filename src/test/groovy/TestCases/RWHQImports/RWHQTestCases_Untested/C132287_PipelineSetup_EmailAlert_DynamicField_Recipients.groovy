import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C132287 - Pipeline Setup - Email Alert - Dynamic Field, Recipients
class C132287_PipelineSetup_EmailAlert_DynamicField_Recipients
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
        //Return Affiliate Name
        variables."affName" = new actions.general.ReturnAffiliateName().run("Affiliate URL":/${variables."affiliateURL"}/.toString())
        //Create Mailinator User
        new actions.Mailinator.CreateMailinatorUser().run("Email":/brightC132287_1/.toString(),"Finally Login as What User":/bi.adminuser1@brightidea.com/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Site Setup Newsletter
        new actions.SetupSite.SetSiteSetupNewsletter().run([:])
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/*[@id='newsletter-moved']\/\/A/.toString())
        //Switch to Browser Window
        new actions.selenium.SwitchWindow().run("Tab (start from 0)":/1/.toString())
        //Create Email Alert in Pipeline Setup
        new actions.PipelineSetup.CreateNewsletterinPipelineSetup().run("Create Email Alert":true,"Enter Subject":/1 - Newsletter Subject Test /.toString(),"Select Dynamic Field":/Initiative Name/.toString())
        //Create Email Alert in Pipeline Setup
        new actions.PipelineSetup.CreateNewsletterinPipelineSetup().run("Email Body":/Yours, /.toString(),"Select Dynamic Field":/Screen Name/.toString())
        //Create Email Alert in Pipeline Setup
        new actions.PipelineSetup.CreateNewsletterinPipelineSetup().run("Recipients":/Autofirst Autolast/.toString(),"Recipients Add Remove":/Add/.toString(),"Action":/Send Now/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Verify Email
        new actions.Mailinator.VerifyEmail().run("Email Address":/brightC132287_1/.toString(),"Subject":/1 - Newsletter Subject Test Custom App/.toString(),"Email Should Be Received":true)
        //Create Email Alert in Pipeline Setup
        new actions.PipelineSetup.CreateNewsletterinPipelineSetup().run("Create Email Alert":true,"Enter Subject":/2 - Newsletter Body Test /.toString(),"Email Body":/Initiative Name:/.toString(),"Select Dynamic Field":/Initiative Name/.toString())
        //Create Email Alert in Pipeline Setup
        new actions.PipelineSetup.CreateNewsletterinPipelineSetup().run("Email Body":/First Name:/.toString(),"Select Dynamic Field":/First Name/.toString())
        //Create Email Alert in Pipeline Setup
        new actions.PipelineSetup.CreateNewsletterinPipelineSetup().run("Email Body":/Last Name:/.toString(),"Select Dynamic Field":/Last Name/.toString())
        //Create Email Alert in Pipeline Setup
        new actions.PipelineSetup.CreateNewsletterinPipelineSetup().run("Email Body":/Affiliate Name:/.toString(),"Select Dynamic Field":/Affiliate Name/.toString())
        //Create Email Alert in Pipeline Setup
        new actions.PipelineSetup.CreateNewsletterinPipelineSetup().run("Email Body":/Contact Name:/.toString(),"Select Dynamic Field":/Contact Name/.toString())
        //Create Email Alert in Pipeline Setup
        new actions.PipelineSetup.CreateNewsletterinPipelineSetup().run("Email Body":/Contact Email:/.toString(),"Select Dynamic Field":/Contact Email/.toString())
        //Create Email Alert in Pipeline Setup
        new actions.PipelineSetup.CreateNewsletterinPipelineSetup().run("Email Body":/Initiative URL:/.toString(),"Select Dynamic Field":/Initiative URL/.toString())
        //Create Email Alert in Pipeline Setup
        new actions.PipelineSetup.CreateNewsletterinPipelineSetup().run("Email Body":/Idea Boards URL:/.toString(),"Select Dynamic Field":/Idea Boards URL/.toString())
        //Create Email Alert in Pipeline Setup
        new actions.PipelineSetup.CreateNewsletterinPipelineSetup().run("Email Body":/NUMBER_SUBMISSIONS: [NUMBER_SUBMISSIONS]/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/3/.toString())
        //Send Keyboard Action
        new actions.selenium.SendKeyboardAction().run("Button":/ENTER/.toString())
        //Create Email Alert in Pipeline Setup
        new actions.PipelineSetup.CreateNewsletterinPipelineSetup().run("Recipients":/Autofirst Autolast/.toString(),"Recipients Add Remove":/Add/.toString(),"Action":/Send Now/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Verify Body of Email
        new actions.Mailinator.VerifyBodyofEmail().run("Email Address":/brightC132287_1/.toString(),"Contains Text":/CustomAppFirstName:AutofirstLastName: AutolastAffiliateName: ${variables."affName"}ContactName: noreply@brightidea.comContactEmail: noreply@brightidea.comInitiativeURL: ${variables."affiliateURL"}\/CustomAppIdeaBoardsURL: ${variables."affiliateURL"}\/CustomApp\/boardsNUMBER_SUBMISSIONS:2/.toString())
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