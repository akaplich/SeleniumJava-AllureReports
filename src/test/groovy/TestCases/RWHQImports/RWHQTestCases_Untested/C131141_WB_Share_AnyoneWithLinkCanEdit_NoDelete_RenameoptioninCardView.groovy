import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131141 - WB - Share - Anyone With Link Can Edit - No Delete, Rename option in Card View
class C131141_WB_Share_AnyoneWithLinkCanEdit_NoDelete_RenameoptioninCardView
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
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Whiteboards/.toString())
        //Create Whiteboard or Edit Template
        new actions.Whiteboards.CreateWhiteboardFromUserhome().run("Create a Whiteboard":/New Blank Whiteboard/.toString())
        //Set Whiteboard Title
        new actions.Whiteboards.EditTitleOfWhiteboard().run("Title":/TestLink/.toString(),"Action":/Submit/.toString())
        //Whiteboard - Set Share
        new actions.Whiteboards.SetShareWhiteboard().run("Click Share Button":true,"Anyone with link...":/can edit/.toString(),"Action":/Close/.toString())
        //Copy Current URL
        variables."currentURL" = new actions.selenium.CopyCurrentURL().run([:])
        //Go Back From Whiteboard
        new actions.Whiteboards.GoBackFromWhiteboard().run([:])
        //Log Out
        new actions.general.LogOut().run([:])
        //Close All Browsers
        new actions.selenium.CloseBrowser().run([:])
        //Open Browser
        new actions.selenium.Browser().run("URL":/${variables."affiliateURL"}/.toString(),"Browser Type":/Chrome/.toString())
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."currentURL"}/.toString())
        //Go Back From Whiteboard
        new actions.Whiteboards.GoBackFromWhiteboard().run([:])
        //Whiteboard Card Action - Delete, Rename
        new actions.Whiteboards.WhiteboardCardActionDeleteRename().run("Whiteboard to Select":/TestLink/.toString(),"Option":/Rename/.toString(),"New Title":/updated title/.toString(),"Action":/Submit/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/5/.toString())
        //Verify Whiteboard Card in Userhomepage
        new actions.Whiteboards.VerifyWhiteboard().run("Whiteboard Name":/updated title/.toString(),"Number of Matches":/1/.toString())
        try{
            //Whiteboard Card Action - Delete, Rename
            new actions.Whiteboards.WhiteboardCardActionDeleteRename().run("Whiteboard to Select":/TestLink/.toString(),"Option":/Delete/.toString(),"Action":/Submit/.toString())
        }
       catch(all){}catch(Error err){}
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/UL[@class='f-dropdown-options']\/LI\/\/SPAN[contains(.,'Delete')]/.toString(),"Should Element Exist":false)
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