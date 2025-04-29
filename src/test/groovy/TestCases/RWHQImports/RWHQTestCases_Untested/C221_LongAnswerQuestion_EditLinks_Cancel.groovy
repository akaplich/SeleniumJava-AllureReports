package TestCases.RWHQImports.RWHQTestCases_Untested

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C221 - Long Answer Question - Edit Links, Cancel
class C221_LongAnswerQuestion_EditLinks_Cancel
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
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Wait for Page to Load":true,"Description":/ test /.toString(),"Long Answer Question":/ test /.toString())
        //Set Post Idea Link for Text Field
        new actions.SetIdeaFields.SetPostIdeaLinkforTextField().run("Field Name":/Long Answer Question/.toString(),"Link, Unlink or Edit":/Link/.toString(),"Text":/Testing link editing/.toString(),"URL":/www.google.com/.toString(),"Open link in new tab":true,"Link Action":/Insert/.toString())
        //Set Post Idea Link for Text Field
        new actions.SetIdeaFields.SetPostIdeaLinkforTextField().run("Field Name":/Long Answer Question/.toString(),"Text of Link to Edit":/Testing link editing/.toString(),"Link, Unlink or Edit":/Edit/.toString(),"Text":/Test_edit/.toString(),"URL":/www.yahoo.com/.toString(),"Open link in new tab":true,"Link Action":/Cancel/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/Edit Links Cancel/.toString(),"Description":/Description/.toString(),"Category":/New Product/.toString(),"Required Short Question":/Required short/.toString(),"Action":/Submit Idea/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Edit Links Cancel/.toString())
        //Click on Element and Verify Element exists in other Tab
        new actions.general.ClickonElementandVerifyElementexistsinotherTab().run("XPATH of an element to click on":/\/\/A[text()='Testing link editing']/.toString(),"XPATH of element to verify":/\/\/textarea[@name='q']/.toString(),"Tab (optional)":/1/.toString())
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