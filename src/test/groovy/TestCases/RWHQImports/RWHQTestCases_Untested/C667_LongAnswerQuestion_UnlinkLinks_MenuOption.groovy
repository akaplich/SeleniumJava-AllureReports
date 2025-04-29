import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C667 - Long Answer Question - Unlink Links, Menu Option
class C667_LongAnswerQuestion_UnlinkLinks_MenuOption
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
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/Test Idea Links Edit\/Unlink/.toString(),"Description":/Description/.toString(),"Category":/New Product/.toString(),"Long Answer Question":/long /.toString())
        //Set Post Idea Link for Text Field
        new actions.SetIdeaFields.SetPostIdeaLinkforTextField().run("Field Name":/Long Answer Question/.toString(),"Link, Unlink or Edit":/Link/.toString(),"Text":/Test Link/.toString(),"URL":/www.google.com/.toString(),"Open link in new tab":true,"Link Action":/Insert/.toString())
        //Set Post Idea Link for Text Field
        new actions.SetIdeaFields.SetPostIdeaLinkforTextField().run("Field Name":/Long Answer Question/.toString(),"Link, Unlink or Edit":/Unlink/.toString(),"Text":/Test Link/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Required Short Question":/short/.toString(),"Action":/Submit Idea/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Test Idea Links Edit\/Unlink/.toString())
        //Click on Element and Verify Element exists in other Tab
        new actions.general.ClickonElementandVerifyElementexistsinotherTab().run("XPATH of an element to click on":/\/\/*[contains(text(), 'Test Link')]/.toString(),"XPATH of element to verify":/\/\/*[@id='bi-page-ct-a-view-idea']/.toString(),"Tab (optional)":/0/.toString())
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