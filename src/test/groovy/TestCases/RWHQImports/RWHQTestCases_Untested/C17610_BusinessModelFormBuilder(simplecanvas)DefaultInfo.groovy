import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C17610 - Business Model Form Builder (simple canvas) Default Info
class C17610_BusinessModelFormBuilder(simplecanvas)DefaultInfo
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
        new actions.WebstormCreation.CreateCustomWebstorm().run("Webstorm Title":/Custom Test/.toString(),"Description":/desc/.toString(),"Action":/Create/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom Test/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Webstorm Setup Ideas for Team Workspace Tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforTeamWorkspaceTab().run("Team Workspace":true,"Business Model Tab":true,"Type of Model":/Simple Business Model/.toString(),"Scroll To Top":true)
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Webstorm Setup Business Model for Ideas tab 
        new actions.SetupIdeas.SetWebstormSetupBusinessModelforIdeasTab().run("Navigate to Business Model Tab":true,"Launch Business Model Form Builder":true,"Navigate to New Tab":true,"Field to Edit":/Market\/Demand/.toString())
        //Verify Text in Element
        new actions.selenium.VerifyText().run("ID":/\/\/*[@class='business-model-editor-question']\/\/*[@class='question-name' and text()='Market\/Demand']\/..\/..\/\/*[contains(@class,'fractal-input text-input')]\/label[text()='Question Title:']\/..\/input/.toString(),"Input Field Text":/Market\/Demand/.toString())
        //Verify Text in Element
        new actions.selenium.VerifyText().run("ID":/\/\/*[@class='business-model-editor-question']\/\/*[@class='question-name' and text()='Market\/Demand']\/..\/..\/\/*[contains(@class,'fractal-input text-input')]\/label[text()='Question Default Text:']\/..\/input/.toString(),"Input Field Text":/TBD/.toString())
        //Set Webstorm Setup Business Model for Ideas tab 
        new actions.SetupIdeas.SetWebstormSetupBusinessModelforIdeasTab().run("Field to Edit":/Market\/Demand/.toString(),"Action":/Done/.toString())
        //Set Webstorm Setup Business Model for Ideas tab 
        new actions.SetupIdeas.SetWebstormSetupBusinessModelforIdeasTab().run("Field to Edit":/Product\/Tech/.toString())
        //Verify Text in Element
        new actions.selenium.VerifyText().run("ID":/\/\/*[@class='business-model-editor-question']\/\/*[@class='question-name' and text()='Product\/Tech']\/..\/..\/\/*[contains(@class,'fractal-input text-input')]\/label[text()='Question Title:']\/..\/input/.toString(),"Input Field Text":/Product\/Tech/.toString())
        //Verify Text in Element
        new actions.selenium.VerifyText().run("ID":/\/\/*[@class='business-model-editor-question']\/\/*[@class='question-name' and text()='Product\/Tech']\/..\/..\/\/*[contains(@class,'fractal-input text-input')]\/label[text()='Question Default Text:']\/..\/input/.toString(),"Input Field Text":/TBD/.toString())
        //Set Webstorm Setup Business Model for Ideas tab 
        new actions.SetupIdeas.SetWebstormSetupBusinessModelforIdeasTab().run("Field to Edit":/Product\/Tech/.toString(),"Action":/Done/.toString())
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