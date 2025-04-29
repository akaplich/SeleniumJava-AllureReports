import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131813 - File Upload on Post Idea 2 Attachment > File size site limit over enterprise limit
class C131813_FileUploadonPostIdea2Attachment_Filesizesitelimitoverenterpriselimit
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
        //Set Enterprise Setup for BIOnly Beta tab
        new actions.SetupBI.SetEnterpriseSetupforBIOnlyBetatab().run("Attachment Max Upload Filesize":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Site Setup for BI Beta tab
        new actions.SetupBI.SetSiteSetupforBIBetatab().run("Attachment Max Upload Filesize":/2/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Only upload attachment":true,"Attachments File":/VideoOver2MB.mp4/.toString(),"Attachment Add or Remove":/Add/.toString(),"Wait for Attachment to load":/FALSE/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/File is too large. Limit is 2MB./.toString(),"Should Exist":true)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/VideoOver2MB.mp4/.toString(),"Should Exist":false)
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Only upload attachment":true,"Attachments File":/NonVideoFileOver2MB.pptx/.toString(),"Attachment Add or Remove":/Add/.toString(),"Wait for Attachment to load":/FALSE/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/File is too large. Limit is 2MB./.toString(),"Should Exist":true)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/NonVideoFileOver2MB.pptx/.toString(),"Should Exist":false)
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Only upload attachment":true,"Attachments File":/ImageOver2MB.jpg/.toString(),"Attachment Add or Remove":/Add/.toString(),"Wait for Attachment to load":/FALSE/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/File is too large. Limit is 2MB./.toString(),"Should Exist":true)
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/ImageOver2MB.jpg/.toString(),"Should Exist":false)
        //Set Custom and Other App Post Idea
        new actions.PostIdea.SetCustomAppPostIdea().run("Title":/Idea Title/.toString(),"Description":/Idea Description/.toString(),"Attachments File":/ImageOver1MBAndLessThan2MB.png,NonVideoFileOver1MBAndLessThan2MB.SLDASM,VideoFileOver1MBAndLessThan2MB.mp4/.toString(),"Attachment Add or Remove":/Add,Add,Add/.toString(),"Wait for Attachment to load":/TRUE,TRUE,TRUE/.toString(),"Category":/Operations/.toString(),"Required Short Question":/short/.toString(),"Action":/Submit Idea/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Idea Title/.toString())
        //Verify Attachment in Attachments tab for View Idea page
        new actions.ViewIdea.VerifyAttachmentinAttachmentstabforViewIdeapage().run("Attachment File":/VideoOver2MB.mp4/.toString(),"Number of Matches":/0/.toString())
        //Verify Attachment in Attachments tab for View Idea page
        new actions.ViewIdea.VerifyAttachmentinAttachmentstabforViewIdeapage().run("Attachment File":/NonVideoFileOver2MB.pptx/.toString(),"Number of Matches":/0/.toString())
        //Verify Attachment in Attachments tab for View Idea page
        new actions.ViewIdea.VerifyAttachmentinAttachmentstabforViewIdeapage().run("Attachment File":/ImageOver2MB.jpg/.toString(),"Number of Matches":/0/.toString())
        //Verify Attachment in Attachments tab for View Idea page
        new actions.ViewIdea.VerifyAttachmentinAttachmentstabforViewIdeapage().run("Attachment File":/NonVideoFileOver1MBAndLessThan2MB.SLDASM/.toString(),"Number of Matches":/1/.toString())
        //Verify Attachment in Attachments tab for View Idea page
        new actions.ViewIdea.VerifyAttachmentinAttachmentstabforViewIdeapage().run("Attachment File":/ImageOver1MBAndLessThan2MB.png/.toString(),"Number of Matches":/1/.toString())
        //Verify Attachment in Attachments tab for View Idea page
        new actions.ViewIdea.VerifyAttachmentinAttachmentstabforViewIdeapage().run("Attachment File":/VideoFileOver1MBAndLessThan2MB.mp4/.toString(),"Number of Matches":/1/.toString())
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