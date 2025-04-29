import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C128603 - Search deleted Comment in an Idea on Initiative Global Navigation
class C128603_SearchdeletedCommentinanIdeaonInitiativeGlobalNavigation
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
        //Add Comment in View Idea page
        new actions.ViewIdeaComment.AddCommentinViewIdeapage().run("Comment":/test comment1/.toString(),"Comment Type":/General Access/.toString())
        //Delete/Remove Comment in View Idea page as Admin
        new actions.ViewIdeaComment.DeleteRemoveCommentinViewIdeapage().run("Comment to Delete or Remove":/test comment/.toString(),"Replace or Permanent":/Replace/.toString(),"Action":/Continue/.toString())
        //Delete/Remove Comment in View Idea page as Admin
        new actions.ViewIdeaComment.DeleteRemoveCommentinViewIdeapage().run("Comment to Delete or Remove":/test comment1/.toString(),"Replace or Permanent":/Permanent/.toString(),"Action":/Continue/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Home/.toString())
        //Search Global Enterprise/Webstorm/Community
        new actions.Search.SearchEnterpriseWebstorm().run("Search Value":/test comment/.toString())
        //Verify On Global Search Result
        new actions.Search.VerifyOnGlobalSearchResult().run("Type":/Comments/.toString(),"Title":/test comment/.toString(),"Number of Matches":/0/.toString())
        //Verify On Global Search Result
        new actions.Search.VerifyOnGlobalSearchResult().run("Type":/Comments/.toString(),"Title":/test comment1/.toString(),"Number of Matches":/0/.toString())
        //Search Global Enterprise/Webstorm/Community
        new actions.Search.SearchEnterpriseWebstorm().run("Search Value":/System Admin/.toString())
        //Verify On Global Search Result
        new actions.Search.VerifyOnGlobalSearchResult().run("Type":/Comments/.toString(),"Title":/test comment1/.toString(),"Number of Matches":/0/.toString())
        //Search Global Enterprise/Webstorm/Community
        new actions.Search.SearchEnterpriseWebstorm().run("Search Value":/End User/.toString())
        //Verify On Global Search Result
        new actions.Search.VerifyOnGlobalSearchResult().run("Type":/Comments/.toString(),"Title":/test comment/.toString(),"Number of Matches":/0/.toString())
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