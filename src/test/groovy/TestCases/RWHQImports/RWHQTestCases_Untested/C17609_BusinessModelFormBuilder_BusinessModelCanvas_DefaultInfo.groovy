package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C17609 - Business Model Form Builder (Business Model Canvas) Default Info
class C17609_BusinessModelFormBuilder_BusinessModelCanvas_DefaultInfo
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
        new actions.SetupIdeas.SetWebstormSetupBusinessModelforIdeasTab().run("Navigate to Business Model Tab":true,"Launch Business Model Form Builder":true,"Navigate to New Tab":true,"Field to Edit":/Value Proposition/.toString())
        //Verify Text in Element
        new actions.selenium.VerifyText().run("ID":/\/\/*[@class='business-model-editor-question']\/\/*[@class='question-name' and text()='Value Proposition']\/..\/..\/\/*[contains(@class,'fractal-input text-input')]\/label[text()='Question Title:']\/..\/input/.toString(),"Input Field Text":/Value Proposition/.toString())
        //Verify Text in Element
        new actions.selenium.VerifyText().run("ID":/\/\/*[@class='business-model-editor-question']\/\/*[@class='question-name' and text()='Value Proposition']\/..\/..\/\/*[contains(@class,'fractal-input text-input')]\/label[text()='Question Default Text:']\/..\/input/.toString(),"Input Field Text":/What value do we deliver to the customer? Which one of our customers' problems are we helping to solve? What bundles of products and services are we offering to each segment? Which customer needs are we satisfying? What is the minimum viable product?/.toString())
        //Set Webstorm Setup Business Model for Ideas tab 
        new actions.SetupIdeas.SetWebstormSetupBusinessModelforIdeasTab().run("Field to Edit":/Value Proposition/.toString(),"Action":/Done/.toString())
        //Set Webstorm Setup Business Model for Ideas tab 
        new actions.SetupIdeas.SetWebstormSetupBusinessModelforIdeasTab().run("Field to Edit":/Customer Segment(s)/.toString())
        //Verify Text in Element
        new actions.selenium.VerifyText().run("ID":/\/\/*[@class='business-model-editor-question']\/\/*[@class='question-name' and text()='Customer Segment(s)']\/..\/..\/\/*[contains(@class,'fractal-input text-input')]\/label[text()='Question Title:']\/..\/input/.toString(),"Input Field Text":/Customer Segment(s)/.toString())
        //Verify Text in Element
        new actions.selenium.VerifyText().run("ID":/\/\/*[@class='business-model-editor-question']\/\/*[@class='question-name' and text()='Customer Segment(s)']\/..\/..\/\/*[contains(@class,'fractal-input text-input')]\/label[text()='Question Default Text:']\/..\/input/.toString(),"Input Field Text":/For whom are we creating value? Who are our most important customers? What are the customer archetypes?/.toString())
        //Set Webstorm Setup Business Model for Ideas tab 
        new actions.SetupIdeas.SetWebstormSetupBusinessModelforIdeasTab().run("Field to Edit":/Customer Segment(s)/.toString(),"Action":/Done/.toString())
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