import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131526 - View As Ordinary User - Hide Admin Bar, Biz Impact, Linked Ideas
class C131526_ViewAsOrdinaryUser_HideAdminBar_BizImpact_LinkedIdeas
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
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        try{
            //Set Widget Controller
            new actions.Widgets.SetWidgetController().run("Widget Edit Mode":/Enable/.toString(),"Preview as Ordinary User":true)
        }
       catch(all){}catch(Error err){}
        //Wait for Element
        new actions.selenium.WaitForElement().run("ID":/\/\/*[@id='warning-title']\/\/A[contains(.,'Disable this view')]/.toString(),"Timeout In Seconds":/15/.toString())
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/*[contains(@id,'business')]/.toString(),"Should Element Exist":false,"Number of Matches":/0/.toString())
        try{
            //Verify Element
            new actions.general.VerifyElement().run("ID":/\/\/*[contains(@id,'adminNav')]/.toString(),"Should Element Exist":false,"Number of Matches":/0/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/A[@id='inline-edit-icon-link_ideas']/.toString(),"Should Element Exist":false,"Number of Matches":/0/.toString())
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