import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131511 - WB - Export Selection, Print to PDF - Whiteboard With & Without Contents
class C131511_WB_ExportSelection_PrinttoPDF_WhiteboardWithAndWithoutContents
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
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup Site User Homepage 
        new actions.SetupSite.SetEnterpriseSetupSiteUserHomepage().run("User Homepage options":/User Homepage/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/User Homepage/.toString())
        //Navigate Tab User Homepage or MTS
        new actions.Enterprise.UserHomepage.NavigateTabUserHomepage().run("Tab":/Whiteboards/.toString())
        //Create Whiteboard or Edit Template
        new actions.Whiteboards.CreateWhiteboardFromUserhome().run("Create New or Choose Template":/New Blank Whiteboard/.toString())
        //Set Whiteboard Title
        new actions.Whiteboards.EditTitleOfWhiteboard().run("Title":/C131511/.toString(),"Action":/Submit/.toString())
        //Set Whiteboard Top Bar
        new actions.Whiteboards.SetWhiteboardMenuDropdowninTopBar().run("Menu Option":/Export/.toString(),"Sub Option":/Export Full Board to PDF/.toString())
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/UL[contains(@class,'f-dropdown-options')]\/LI[contains(@class,'f-disabled')]\/\/SPAN[contains(.,'Export Full Board to PDF')]/.toString(),"Should Element Exist":true,"Number of Matches":/2/.toString())
        //Click on Whiteboard Tool
        new actions.Whiteboards.ClickOnWhiteboardTool().run("Click on ToolKit":true,"Tool Type":/Place Image - I/.toString())
        //Set Change Background or Other Modal Tab
        new actions.WebstormHomepage.SetChangeBackgroundmodal().run("Tab":/Search Photos/.toString())
        //Set Preset or Unsplash Background Image in the Header
        new actions.WebstormHomepage.SetPresetBackgroundImageintheHeader().run("Unsplash Image Text":/tree/.toString(),"Unpslash Image Number":/1/.toString(),"Action":/Add Image/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/3/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Escape/.toString())
        //Collab Editor, Whiteboard - Set File Menu
        new actions.Memo.ColabEditorSetTopBarDropdown().run("Click on the Bar?":true,"Main Option":/Export/.toString(),"Sub Option":/Export Selection to PNG/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/C131511*.png/.toString(),"File Location":/Downloads/.toString(),"Should file exist":false,"Row Values":[])
        //Go Back From Whiteboard
        new actions.Whiteboards.GoBackFromWhiteboard().run([:])
        //Select Existing Whiteboard from Userhome Whiteboards
        new actions.Whiteboards.OpenExistingWhiteboardOnWhiteboardsPage().run("Name of Whiteboard":/C131511/.toString())
        //Click on Whiteboard Canvas
        new actions.Whiteboards.ClickOnWhiteboardCanvas().run("X coordinate":/250/.toString(),"Y coordinate":/250/.toString(),"Single Double or Right Click":/Single Click/.toString())
        //Send Key(s) To Whiteboard
        new actions.Whiteboards.SendKeysToWhiteboard().run("Key(s) to send":/Control + A/.toString())
        //Collab Editor, Whiteboard - Set File Menu
        new actions.Memo.ColabEditorSetTopBarDropdown().run("Click on the Bar?":true,"Main Option":/Export/.toString(),"Sub Option":/Export Selection to PNG/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/3/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/C131511*.png/.toString(),"File Location":/Downloads/.toString(),"Row Values":[])
        //Collab Editor, Whiteboard - Set File Menu
        new actions.Memo.ColabEditorSetTopBarDropdown().run("Click on the Bar?":true,"Main Option":/Export/.toString(),"Sub Option":/Export Selection to PDF/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/3/.toString())
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/C131511*.pdf/.toString(),"File Location":/Downloads/.toString(),"Row Values":[])
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