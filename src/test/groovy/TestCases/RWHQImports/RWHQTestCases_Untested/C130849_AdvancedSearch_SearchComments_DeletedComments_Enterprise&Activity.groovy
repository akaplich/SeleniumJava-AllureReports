import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C130849 - Advanced Search - Search Comments, Deleted Comments, Enterprise & Activity
class C130849_AdvancedSearch_SearchComments_DeletedComments_EnterpriseAndActivity
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
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site Global Navigation Page
        new actions.SetupSite.SetEnterpriseSetupSiteGlobalNavigationPage().run("Global Navigation Search":/Show Personalized Quick Results with Search/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test idea1/.toString())
        //Add Comment in View Idea page
        new actions.ViewIdeaComment.AddCommentinViewIdeapage().run("Comment":/Yet another Comment/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser2@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Quick or Advance Search in Global Nav
        new actions.Search.QuickOrAdvanceSearchInGlobalNav().run("Tab (optional)":/Advanced Search/.toString(),"Search Input":/Yet another Comment/.toString())
        //Verify Quick or Advanced Search Result
        new actions.Search.VerifyQuickOrAdvancedSearchResult().run("Tab":/Advanced Search/.toString(),"Name of the searched item":/test comment/.toString(),"Type":/Comments/.toString(),"Number of Total (for Advanced Search)":/2 of 2/.toString(),"Number of Matches":/1/.toString())
        //Verify Quick or Advanced Search Result
        new actions.Search.VerifyQuickOrAdvancedSearchResult().run("Tab":/Advanced Search/.toString(),"Name of the searched item":/Yet another Comment/.toString(),"Type":/Comments/.toString(),"Number of Total (for Advanced Search)":/2 of 2/.toString(),"Number of Matches":/1/.toString(),"Click on result":true)
        //Verify Comment in View Idea page
        new actions.ViewIdeaComment.VerifyCommentinViewIdeapage().run("Comment Section":/Comments/.toString(),"Type of Comment":/General Access/.toString(),"Comment":/Yet another Comment/.toString(),"User":/System Admin/.toString(),"Number of Matches":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Solve App/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Quick or Advance Search in Global Nav
        new actions.Search.QuickOrAdvanceSearchInGlobalNav().run("Tab (optional)":/Advanced Search/.toString(),"Search Input":/Yet another Comment/.toString())
        //Verify Quick or Advanced Search Result
        new actions.Search.VerifyQuickOrAdvancedSearchResult().run("Tab":/Advanced Search/.toString(),"No Search Results":true,"Name of the searched item":/Yet another Comment/.toString(),"Number of Matches":/1/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
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
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Home/.toString())
        //Quick or Advance Search in Global Nav
        new actions.Search.QuickOrAdvanceSearchInGlobalNav().run("Tab (optional)":/Advanced Search/.toString(),"Search Input":/test comment/.toString())
        //Verify Quick or Advanced Search Result
        new actions.Search.VerifyQuickOrAdvancedSearchResult().run("Tab":/Advanced Search/.toString(),"Name of the searched item":/Yet another Comment/.toString(),"Type":/Comments/.toString(),"Number of Total (for Advanced Search)":/1 of 1/.toString(),"Number of Matches":/1/.toString())
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