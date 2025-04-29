import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//(RunOnOldChrome)C129021 - Category Dependent - Configure Categories
class C129021_CategoryDependent_ConfigureCategories
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
        //Create Custom Webstorm
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Test App/.toString(),"Description":/desc/.toString(),"Action":/Create/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Webstorm Setup Category for Ideas Tab 
        new actions.SetupIdeas.SetWebstormSetupCategoryIdeasTab().run("Action":/Delete/.toString(),"Original Category Name":/Strategy/.toString(),"Delete Category Action":/OK/.toString())
        //Set Webstorm Setup Category for Ideas Tab 
        new actions.SetupIdeas.SetWebstormSetupCategoryIdeasTab().run("Action":/Add/.toString(),"New Category Name":/Test Category/.toString(),"Delete Category Action":/OK/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Dependent Test Category/.toString(),"Additional Question Type":/Checkbox/.toString())
        //Edit Additional Questions in Submission Form tab
        new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Dependent Test Category/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Set Dependent Answer":true,"Set Dependent Answer Dropdown":/Category: Test Category/.toString(),"Save Form":true)
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Webstorm Setup Ideas for Submission Form Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforSubmissionFormTab().run("Additional Question Name":/Dependent Strategy/.toString(),"Additional Question Type":/Dropdown/.toString(),"Save Form":true)
        try{
            //Edit Additional Questions in Submission Form tab
            new actions.SetupIdeas.EditAdditionalQuestionsinSubmissionFormtab().run("Question":/Dependent Strategy/.toString(),"Edit or Hide or Remove":/Edit/.toString(),"Set Dependent Answer":true,"Set Dependent Answer Dropdown":/Category: Strategy/.toString(),"Save Form":true)
        }
       catch(all){}catch(Error err){}
        //Wait
        new actions.general.Wait().run("Seconds":/2/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Handle Alert
        new actions.selenium.HandleAlert().run("Accept":true)
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Test App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Dependent Test Category/.toString(),"Should Exist":false)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/Dependent Strategy/.toString(),"Should Exist":true)
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