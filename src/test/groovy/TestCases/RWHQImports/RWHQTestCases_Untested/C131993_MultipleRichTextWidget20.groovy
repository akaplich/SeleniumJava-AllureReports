package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C131993 - Multiple Rich Text Widget 2.0
class C131993_MultipleRichTextWidget20
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Unlimited Brightidea Administrator License Type":/1/.toString(),"Unlimited Idea Box Manager License Type":/1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Select Product in Apps Pillar Page
        new actions.AppsPillar.SelectProductinAppsPillarPage().run("Product":/Labs/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Monitor/.toString(),"Sponsor Name":/Sri/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Ideabox Pipeline/.toString(),"Description":/desc/.toString(),"Action":/Create/.toString())
        //Set Widget Controller
        new actions.Widgets.SetWidgetController().run("Widget Edit Mode":/Enable/.toString(),"Add Widget from Selection":/Rich Text\/HTML 2.0/.toString())
        //Set Widget
        new actions.Widgets.SetWidget().run("Name of Widget to Modify":/Title/.toString(),"New Title name":/Rich Text1/.toString(),"Click on Edit while editing the title":false)
        //Set Rich Text Widget Editor 2.0
        new actions.Widgets.SetRichTextWidgetEditor2().run("Action":/Save Changes/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Set Rich Text Widget Editor 2.0
        new actions.Widgets.SetRichTextWidgetEditor2().run("Widget Title":/Rich Text1/.toString(),"Click on Edit Icon":true,"Click on Input Field":true,"Text":/Hello for testing1/.toString(),"Action":/Save Changes/.toString())
        //Verify Rich Text Widget 2.0
        new actions.Widgets.VerifyRichTextWidget2().run("Widget Title":/Rich Text1/.toString(),"Body":/Hello for testing1/.toString(),"Number of Matches":/1/.toString())
        //Set Widget Controller
        new actions.Widgets.SetWidgetController().run("Add Widget from Selection":/Rich Text\/HTML 2.0/.toString())
        //Set Widget
        new actions.Widgets.SetWidget().run("Name of Widget to Modify":/Title/.toString(),"New Title name":/Rich Text2/.toString(),"Click on Edit while editing the title":false)
        //Set Rich Text Widget Editor 2.0
        new actions.Widgets.SetRichTextWidgetEditor2().run("Action":/Save Changes/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Set Rich Text Widget Editor 2.0
        new actions.Widgets.SetRichTextWidgetEditor2().run("Widget Title":/Rich Text2/.toString(),"Click on Edit Icon":true,"Click on Input Field":true,"Text":/Testing for making sure it has separate ID/.toString(),"Action":/Save Changes/.toString())
        //Verify Rich Text Widget 2.0
        new actions.Widgets.VerifyRichTextWidget2().run("Widget Title":/Rich Text1/.toString(),"Body":/Hello for testing1/.toString(),"Number of Matches":/1/.toString())
        //Verify Rich Text Widget 2.0
        new actions.Widgets.VerifyRichTextWidget2().run("Widget Title":/Rich Text2/.toString(),"Body":/Testing for making sure it has separate ID/.toString(),"Number of Matches":/1/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Verify Rich Text Widget 2.0
        new actions.Widgets.VerifyRichTextWidget2().run("Widget Title":/Rich Text1/.toString(),"Body":/Hello for testing1/.toString(),"Number of Matches":/1/.toString())
        //Verify Rich Text Widget 2.0
        new actions.Widgets.VerifyRichTextWidget2().run("Widget Title":/Rich Text2/.toString(),"Body":/Testing for making sure it has separate ID/.toString(),"Number of Matches":/1/.toString())
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