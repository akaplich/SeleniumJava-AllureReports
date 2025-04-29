import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131815 - File Upload on View Idea 3 Attachment > File size site limit over enterprise limit
class C131815_FileUploadonViewIdea3Attachment_Filesizesitelimitoverenterpriselimit
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
        Action58123c20fa4ee77809f468f6("Licensing Model":/Standard Licensing Model/.toString(),"Idea Box Manager License Type Purchased Count":/7/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Instance Ideabox/.toString(),"Sponsor Name":/Sri/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Instance/.toString(),"Description":/this is idea box app Test App/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"Idea Box Managers":/Community Admin/.toString(),"Idea Box Managers Add or Remove":/Add/.toString(),"Admin Field Name":/Pipeline Managers/.toString(),"Pipeline Administrators":/Pipeline Admin/.toString(),"Administrators Add or Remove":/Add/.toString(),"Moderators":/Moderator/.toString(),"Moderators Add or Remove":/Add/.toString(),"Action":/Create/.toString(),"Action on General Information Tab":/Continue/.toString(),"Action on Design Tab":/Continue/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Enterprise Setup/.toString())
        //Set Enterprise Setup for BIOnly Beta tab
        new actions.SetupBI.SetEnterpriseSetupforBIOnlyBetatab().run("Attachment Max Upload Filesize":/1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Instance/.toString(),"Area to Navigate to":/Setup/.toString())
        //Set Site Setup for BI Beta tab
        new actions.SetupBI.SetSiteSetupforBIBetatab().run("Attachment Max Upload Filesize":/2/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Instance/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Idea Name":/Idea Title/.toString(),"Action":/Submit/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Instance/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Idea Title/.toString())
        //Set Attachment in View Idea 3 page
        new actions.ViewIdea30.SetAttachmentinViewIdea3page().run("Attachment File":/VideoOver2MB.mp4/.toString(),"Attachment Add or Remove":/Add/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/File is too large. Limit is 2MB./.toString(),"Should Exist":true)
        //Verify Attachment in View Idea 3 Page
        new actions.ViewIdea30.VerifyAttachmentinViewIdea3Page().run("Attachment Header Count":/0/.toString(),"Attachment File":/VideoOver2MB.mp4/.toString(),"Number of Matches":/0/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Idea Title/.toString())
        //Set Attachment in View Idea 3 page
        new actions.ViewIdea30.SetAttachmentinViewIdea3page().run("Attachment File":/NonVideoFileOver2MB.pptx/.toString(),"Attachment Add or Remove":/Add/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/File is too large. Limit is 2MB./.toString(),"Should Exist":true)
        //Verify Attachment in View Idea 3 Page
        new actions.ViewIdea30.VerifyAttachmentinViewIdea3Page().run("Attachment Header Count":/0/.toString(),"Attachment File":/NonVideoFileOver2MB.pptx/.toString(),"Number of Matches":/0/.toString())
        //Refresh
        new actions.selenium.Refresh().run([:])
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Idea Title/.toString())
        //Set Attachment in View Idea 3 page
        new actions.ViewIdea30.SetAttachmentinViewIdea3page().run("Attachment File":/ImageOver2MB.jpg/.toString(),"Attachment Add or Remove":/Add/.toString())
        //Verify Message
        new actions.general.VerifyMessage().run("Message Text":/File is too large. Limit is 2MB./.toString(),"Should Exist":true)
        //Verify Attachment in View Idea 3 Page
        new actions.ViewIdea30.VerifyAttachmentinViewIdea3Page().run("Attachment Header Count":/0/.toString(),"Attachment File":/ImageOver2MB.jpg/.toString(),"Number of Matches":/0/.toString())
        //Set Attachment in View Idea 3 page
        new actions.ViewIdea30.SetAttachmentinViewIdea3page().run("Attachment File":/NonVideoFileOver1MBAndLessThan2MB.SLDASM,ImageOver1MBAndLessThan2MB.png,VideoFileOver1MBAndLessThan2MB.mp4/.toString(),"Attachment Add or Remove":/Add,Add,Add/.toString(),"Wait For Attachment To be Uploaded":/TRUE,TRUE,TRUE/.toString())
        //Verify Attachment in View Idea 3 Page
        new actions.ViewIdea30.VerifyAttachmentinViewIdea3Page().run("Attachment Header Count":/3/.toString(),"Attachment File":/NonVideoFileOver1MBAndLessThan2MB.SLDASM/.toString(),"Number of Matches":/1/.toString())
        //Verify Attachment in View Idea 3 Page
        new actions.ViewIdea30.VerifyAttachmentinViewIdea3Page().run("Attachment Header Count":/3/.toString(),"Attachment File":/ImageOver1MBAndLessThan2MB.png/.toString(),"Number of Matches":/1/.toString())
        //Verify Attachment in View Idea 3 Page
        new actions.ViewIdea30.VerifyAttachmentinViewIdea3Page().run("Attachment Header Count":/3/.toString(),"Attachment File":/VideoFileOver1MBAndLessThan2MB.mp4/.toString(),"Number of Matches":/1/.toString())
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Access Idea":/Modal Header/.toString())
        //Verify Attachment in View Idea 3 Page
        new actions.ViewIdea30.VerifyAttachmentinViewIdea3Page().run("Attachment Header Count":/3/.toString(),"Attachment File":/NonVideoFileOver1MBAndLessThan2MB.SLDASM/.toString(),"Number of Matches":/1/.toString())
        //Verify Attachment in View Idea 3 Page
        new actions.ViewIdea30.VerifyAttachmentinViewIdea3Page().run("Attachment Header Count":/3/.toString(),"Attachment File":/ImageOver1MBAndLessThan2MB.png/.toString(),"Number of Matches":/1/.toString())
        //Verify Attachment in View Idea 3 Page
        new actions.ViewIdea30.VerifyAttachmentinViewIdea3Page().run("Attachment Header Count":/3/.toString(),"Attachment File":/VideoFileOver1MBAndLessThan2MB.mp4/.toString(),"Number of Matches":/1/.toString())
        //Verify Attachment in View Idea 3 Page
        new actions.ViewIdea30.VerifyAttachmentinViewIdea3Page().run("Attachment File":/ImageOver2MB.jpg/.toString(),"Number of Matches":/0/.toString())
        //Verify Attachment in View Idea 3 Page
        new actions.ViewIdea30.VerifyAttachmentinViewIdea3Page().run("Attachment File":/NonVideoFileOver2MB.pptx/.toString(),"Number of Matches":/0/.toString())
        //Verify Attachment in View Idea 3 Page
        new actions.ViewIdea30.VerifyAttachmentinViewIdea3Page().run("Attachment File":/VideoOver2MB.mp4/.toString(),"Number of Matches":/0/.toString())
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