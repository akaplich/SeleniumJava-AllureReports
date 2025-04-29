import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131513 - WB - Save As Template - Template Modal - Create From Custom, Pinned & System Templates
class C131513_WB_SaveAsTemplate_TemplateModal_CreateFromCustom_PinnedAndSystemTemplates
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
        //Create Whiteboard or Edit Template
        new actions.Whiteboards.CreateWhiteboardFromUserhome().run("Create New or Choose Template":/View All Templates/.toString())
        //Set Change Background or Other Modal Tab
        new actions.WebstormHomepage.SetChangeBackgroundmodal().run("Tab":/System Templates/.toString())
        //Create Whiteboard or Edit Template
        new actions.Whiteboards.CreateWhiteboardFromUserhome().run("From Userhome or from Add Template Modal":/Add Template Modal/.toString(),"Create New or Choose Template":/Brainwriting/.toString())
        //Set Whiteboard Title
        new actions.Whiteboards.EditTitleOfWhiteboard().run("Title":/C131513 - custom/.toString(),"Action":/Submit/.toString())
        //Set Whiteboard Top Bar
        new actions.Whiteboards.SetWhiteboardMenuDropdowninTopBar().run("Menu Option":/File/.toString(),"Preferences Option":/Save as Template.../.toString())
        //Whiteboard - Set Save As Template
        new actions.Whiteboards.WhiteboardSetSaveAsTemplate().run("Save a copy of the whiteboard as a template":false,"Action":/Save Template/.toString())
        //Whiteboard Template - Share Dialog - Set/Remove Participants
        new actions.Whiteboards.WhiteboardTemplateShareDialogSetParticipants().run("Action":/Close/.toString())
        //Go Back From Whiteboard
        new actions.Whiteboards.GoBackFromWhiteboard().run([:])
        //Create Whiteboard or Edit Template
        new actions.Whiteboards.CreateWhiteboardFromUserhome().run("From Userhome or from Add Template Modal":/Userhome/.toString(),"Create New or Choose Template":/C131513 - custom/.toString())
        //Set Whiteboard Title
        new actions.Whiteboards.EditTitleOfWhiteboard().run("Title":/C131513 - pinned/.toString(),"Action":/Submit/.toString())
        //Set Whiteboard Top Bar
        new actions.Whiteboards.SetWhiteboardMenuDropdowninTopBar().run("Menu Option":/File/.toString(),"Preferences Option":/Save as Template.../.toString())
        //Whiteboard - Set Save As Template
        new actions.Whiteboards.WhiteboardSetSaveAsTemplate().run("Save a copy of the whiteboard as a template":false,"Action":/Save Template/.toString())
        //Whiteboard Template - Share Dialog - Set/Remove Participants
        new actions.Whiteboards.WhiteboardTemplateShareDialogSetParticipants().run("Action":/Close/.toString())
        //Go Back From Whiteboard
        new actions.Whiteboards.GoBackFromWhiteboard().run([:])
        //Whiteboard - Pin/Unpin Whiteboard Template
        new actions.Whiteboards.WhiteboardPinUnpinWhiteboardTemplate().run("Custom Template Title":/C131513 - pinned/.toString(),"Pin/Unpin Custom Template":/Pin/.toString())
        //Create Whiteboard or Edit Template
        new actions.Whiteboards.CreateWhiteboardFromUserhome().run("From Userhome or from Add Template Modal":/Userhome/.toString(),"Create New or Choose Template":/View All Templates/.toString())
        //Set Change Background or Other Modal Tab
        new actions.WebstormHomepage.SetChangeBackgroundmodal().run("Tab":/Custom Templates/.toString())
        //Whiteboard - Verify Template Tile
        new actions.Whiteboards.WhiteboardVerifyTemplateTile().run("Template Title":/C131513 - pinned/.toString(),"Placement Number":/1/.toString(),"Pinned/Unpinned":/Pinned/.toString(),"Number of Matches":/1/.toString())
        //Whiteboard - Verify Template Tile
        new actions.Whiteboards.WhiteboardVerifyTemplateTile().run("Template Title":/C131513 - custom/.toString(),"Placement Number":/2/.toString(),"Pinned/Unpinned":/Unpinned/.toString(),"Number of Matches":/1/.toString())
        //Set Change Background or Other Modal Tab
        new actions.WebstormHomepage.SetChangeBackgroundmodal().run("Tab":/Pinned/.toString())
        //Whiteboard - Verify Template Tile
        new actions.Whiteboards.WhiteboardVerifyTemplateTile().run("Template Title":/C131513 - pinned/.toString(),"Placement Number":/1/.toString(),"Pinned/Unpinned":/Pinned/.toString(),"Number of Matches":/1/.toString())
        //Set Change Background or Other Modal Tab
        new actions.WebstormHomepage.SetChangeBackgroundmodal().run("Tab":/System Templates/.toString())
        //Whiteboard - Verify Template Tile
        new actions.Whiteboards.WhiteboardVerifyTemplateTile().run("Template Title":/5 Whys/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
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