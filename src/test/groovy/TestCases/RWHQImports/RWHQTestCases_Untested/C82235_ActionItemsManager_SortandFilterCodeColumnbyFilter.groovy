import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C82235 - Action Items Manager - Sort and Filter Code Column by Filter
class C82235_ActionItemsManager_SortandFilterCodeColumnbyFilter
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
        //Access Action Item in Actions Items Global Navigation
        new actions.ActionItems.AccessActionIteminActionsItemsGlobalNavigation().run("Action Item":/View All/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Verify in Which List (optional)":/Action Items Manager/.toString(),"Title":/test idea1/.toString(),"Number of Matches":/1/.toString())
        //Set the Density and Column in Action Items page
        new actions.ActionItems.SettheDensityandColumninActionItemspage().run("Columns":/Code/.toString(),"Check":/TRUE/.toString())
        //Sort or Filter Action Items Manager table
        new actions.ActionItemsManager.SortorFilterActionItemsManagertable().run("Sort Or Filter":/Sort/.toString(),"Column":/Code/.toString(),"Sort Ascending or Descending":/Descending/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/test idea2/.toString(),"Row Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/quick add1/.toString(),"Row Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/test idea1/.toString(),"Row Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Sort or Filter Action Items Manager table
        new actions.ActionItemsManager.SortorFilterActionItemsManagertable().run("Sort Or Filter":/Filter/.toString(),"Column":/Code/.toString(),"Keyword to Search":/D105/.toString(),"Action":/Cancel/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/test idea1/.toString(),"Row Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/test idea2/.toString(),"Row Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/quick add1/.toString(),"Row Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Sort or Filter Action Items Manager table
        new actions.ActionItemsManager.SortorFilterActionItemsManagertable().run("Sort Or Filter":/Filter/.toString(),"Column":/Code/.toString(),"Keyword to Search":/D107/.toString(),"Action":/Apply/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/test idea2/.toString(),"Row Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/quick add1/.toString(),"Number of Matches":/0/.toString())
        //Verify Open table for Action Items page
        new actions.ActionItems.VerifyOpentableforActionItemspage().run("Title":/test idea1/.toString(),"Number of Matches":/0/.toString())
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