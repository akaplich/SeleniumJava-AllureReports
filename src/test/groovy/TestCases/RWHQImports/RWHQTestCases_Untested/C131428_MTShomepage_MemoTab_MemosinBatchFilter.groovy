import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C131428 - MTS homepage > Memo Tab > Memos in Batch Filter
class C131428_MTShomepage_MemoTab_MemosinBatchFilter
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
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/app\/apps/.toString())
        //Create Memo Webstorm
        new actions.WebstormCreation.CreateMemoWebstorm().run("Sponsor Name":/Pipeline Sponsor/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Memo Program testing/.toString(),"Description":/desc/.toString(),"Vanity URL":/teamsite1/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"General Access":/ALL/.toString(),"General Access Add or Remove":/Add/.toString(),"Admin Field Name":/Pipeline Administrators/.toString(),"Pipeline Administrators":/Pipeline Admin/.toString(),"Administrators Add or Remove":/Add/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Verify and Set MTS tab on homepage
        new actions.MTS.SetMTStabonhomepage().run("Should Tab Exist":true,"Heading":/MY STUFF/.toString(),"Tabs":/Memos/.toString(),"Placement Number of Tab":/3/.toString(),"Should User Click on Tab":true)
        //Set Hover Menu on Memo Template Tiles
        new actions.MTS.SetHoverMenuonMemoTemplateTiles().run("Template":/Blank Document/.toString(),"Menu Option":/Advanced create.../.toString())
        //Set Advanced Create Memo
        new actions.MTS.SetAdvancedCreateMemo().run("Select visibility for your memo":/Private Memo/.toString(),"Action on Select visibility for your memo slide":/Done/.toString())
        //Collab Editor - Set Memo Title
        new actions.Memo.ColabEditorSetMemoTitle().run("New Title":/Private Shared Memo/.toString(),"Action":/Submit/.toString())
        //Collab Editor/Userhome - Memo Share Dialog -  Set Participants
        new actions.Memo.MemoShareDialogSetParticipants().run("Click Share Button":true,"User(s)":/End User/.toString(),"Permission (required)":/can edit/.toString(),"Send Invite":/TRUE/.toString(),"Anyone With Link":/can view/.toString(),"Action":/Close/.toString())
        //Collab Editor/Userhome - Memo Share Dialog -  Set Participants
        new actions.Memo.MemoShareDialogSetParticipants().run("Click Share Button":true,"User(s)":/Moderator/.toString(),"Permission (required)":/can view/.toString(),"Send Invite":/TRUE/.toString(),"Anyone With Link":/can view/.toString(),"Action":/Close/.toString())
        //Collab Editor/Userhome - Memo Share Dialog -  Set Participants
        new actions.Memo.MemoShareDialogSetParticipants().run("Click Share Button":true,"User(s)":/Pipeline Admin/.toString(),"Permission (required)":/can comment/.toString(),"Send Invite":/TRUE/.toString(),"Anyone With Link":/can view/.toString(),"Action":/Close/.toString())
        //Collab Editor - Click Go Back Button
        new actions.Memo.ColabEditorClickGoBackButton().run([:])
        //Set Hover Menu on Memo Template Tiles
        new actions.MTS.SetHoverMenuonMemoTemplateTiles().run("Template":/Blank Document/.toString(),"Menu Option":/Advanced create.../.toString())
        //Set Advanced Create Memo
        new actions.MTS.SetAdvancedCreateMemo().run("Select visibility for your memo":/Add to Batch/.toString(),"Action on Select visibility for your memo slide":/Done/.toString())
        //Collab Editor - Set Memo Title
        new actions.Memo.ColabEditorSetMemoTitle().run("New Title":/Batched Shared Memo/.toString(),"Action":/Submit/.toString())
        //Collab Editor/Userhome - Memo Share Dialog -  Set Participants
        new actions.Memo.MemoShareDialogSetParticipants().run("Click Share Button":true,"User(s)":/End User/.toString(),"Permission (required)":/can edit/.toString(),"Send Invite":/TRUE/.toString(),"Anyone With Link":/can view/.toString())
        //Collab Editor/Userhome - Memo Share Dialog -  Set Participants
        new actions.Memo.MemoShareDialogSetParticipants().run("User(s)":/Moderator/.toString(),"Permission (required)":/can view/.toString(),"Send Invite":/TRUE/.toString())
        //Collab Editor/Userhome - Memo Share Dialog -  Set Participants
        new actions.Memo.MemoShareDialogSetParticipants().run("User(s)":/Pipeline Admin/.toString(),"Permission (required)":/can comment/.toString(),"Send Invite":/TRUE/.toString(),"Action":/Close/.toString())
        //Collab Editor - Click Go Back Button
        new actions.Memo.ColabEditorClickGoBackButton().run([:])
        //Set Filter for Memo in Userhomepage
        new actions.Memo.SetFilterforMemo().run("Tab":/Memos in Batch/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/Private Shared Memo/.toString(),"Memo Icon Type":/Brightidea/.toString(),"User Name":/System Admin/.toString(),"Status":/Private/.toString(),"Thumbnail Image Displayed":true,"Number of Matches":/0/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/Batched Shared Memo/.toString(),"Memo Icon Type":/Brightidea/.toString(),"User Name":/System Admin/.toString(),"Status":/Incubate 🐣/.toString(),"Thumbnail Image Displayed":true,"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/mts\/teamsite1/.toString())
        //Verify and Set MTS tab on homepage
        new actions.MTS.SetMTStabonhomepage().run("Should Tab Exist":true,"Heading":/MY STUFF/.toString(),"Tabs":/Memos/.toString(),"Placement Number of Tab":/3/.toString(),"Should User Click on Tab":true)
        //Set Filter for Memo in Userhomepage
        new actions.Memo.SetFilterforMemo().run("Tab":/Memos in Batch/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/Private Shared Memo/.toString(),"Memo Icon Type":/Brightidea/.toString(),"User Name":/System Admin/.toString(),"Status":/Private/.toString(),"Thumbnail Image Displayed":true,"Number of Matches":/0/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/Batched Shared Memo/.toString(),"Memo Icon Type":/Brightidea/.toString(),"User Name":/System Admin/.toString(),"Status":/Incubate 🐣/.toString(),"Thumbnail Image Displayed":true,"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/pipelineadmin@test.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/mts\/teamsite1/.toString())
        //Verify and Set MTS tab on homepage
        new actions.MTS.SetMTStabonhomepage().run("Should Tab Exist":true,"Heading":/MY STUFF/.toString(),"Tabs":/Memos/.toString(),"Placement Number of Tab":/3/.toString(),"Should User Click on Tab":true)
        //Set Filter for Memo in Userhomepage
        new actions.Memo.SetFilterforMemo().run("Tab":/Memos in Batch/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/Private Shared Memo/.toString(),"Memo Icon Type":/Brightidea/.toString(),"User Name":/System Admin/.toString(),"Status":/Private/.toString(),"Thumbnail Image Displayed":true,"Number of Matches":/0/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/Batched Shared Memo/.toString(),"Memo Icon Type":/Brightidea/.toString(),"User Name":/System Admin/.toString(),"Status":/Incubate 🐣/.toString(),"Thumbnail Image Displayed":true,"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/moderator@test.com/.toString(),"Password":/brightidea1/.toString(),"Verify if Logged In On Enterprise homepage":false)
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/mts\/teamsite1/.toString())
        //Verify and Set MTS tab on homepage
        new actions.MTS.SetMTStabonhomepage().run("Should Tab Exist":true,"Heading":/MY STUFF/.toString(),"Tabs":/Memos/.toString(),"Placement Number of Tab":/3/.toString(),"Should User Click on Tab":true)
        //Set Filter for Memo in Userhomepage
        new actions.Memo.SetFilterforMemo().run("Tab":/Memos in Batch/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/Private Shared Memo/.toString(),"Memo Icon Type":/Brightidea/.toString(),"User Name":/System Admin/.toString(),"Status":/Private/.toString(),"Thumbnail Image Displayed":true,"Number of Matches":/0/.toString())
        //Verify Memo Card in Userhomepage
        new actions.Memo.VerifyMemoCardinUserhomepage().run("Memo Title":/Batched Shared Memo/.toString(),"Memo Icon Type":/Brightidea/.toString(),"User Name":/System Admin/.toString(),"Status":/Incubate 🐣/.toString(),"Thumbnail Image Displayed":true,"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
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