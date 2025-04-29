import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131758 - Apply - Applicants Tab - Declined Emails to Applicant
class C131758_Apply_ApplicantsTab_DeclinedEmailstoApplicant
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
        //Return Affiliate Name
        variables."affiliateName" = new actions.general.ReturnAffiliateName().run("Affiliate URL":/${variables."affiliateURL"}/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Apply Filter on Apps Pillar 2.0
        new actions.AppsPillar.ApplyFilterAppsPillar20().run("Filter Option":/Transformation/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Gig/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Gig/.toString(),"Description":/Gig description/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"General Access":/ALL/.toString(),"General Access Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Site Setup Ideas Team Configuration
        new actions.SetupIdeas.SetSiteSetupIdeasTeamConfiguration().run("Section":/Team Building/.toString(),"Multiple Submitters":true,"Add Accepted Users to Workspace Team":false)
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Webstorm Setup Ideas for Ideas tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforIdeastab().run("View Idea 3.0":true)
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/Gig\/submit/.toString())
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Idea Title Question - Title":/Title/.toString(),"Idea Title Question - Value":/Decline Email Body With Message/.toString(),"Description Question - Title":/Description/.toString(),"Description Question - Value":/test/.toString(),"Category Question - Title":/Job Type/.toString(),"Category Question - Value":/Accounting/.toString(),"Action":/Submit Idea/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/Gig\/submit/.toString())
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Idea Title Question - Title":/Title/.toString(),"Idea Title Question - Value":/Decline Email Subject With Message/.toString(),"Description Question - Title":/Description/.toString(),"Description Question - Value":/test/.toString(),"Category Question - Title":/Job Type/.toString(),"Category Question - Value":/Accounting/.toString(),"Action":/Submit Idea/.toString())
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/Gig\/submit/.toString())
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Idea Title Question - Title":/Title/.toString(),"Idea Title Question - Value":/Decline Email Body Without Message/.toString(),"Description Question - Title":/Description/.toString(),"Description Question - Value":/test/.toString(),"Category Question - Title":/Job Type/.toString(),"Category Question - Value":/Accounting/.toString(),"Action":/Submit Idea/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Decline Email Body With Message/.toString())
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Access Idea":/Decline Email Body With Message/.toString())
        //Set Widget Controller
        new actions.Widgets.SetWidgetController().run("Widget Edit Mode":/Enable/.toString())
        //Drag Widget Onto View Idea 3
        new actions.ViewIdea30.DragWidgetOnViewIdea3().run("Widget Title":/Apply/.toString(),"Above What Existing Widget":/Status/.toString())
        //Set Widget Controller
        new actions.Widgets.SetWidgetController().run("Widget Edit Mode":/Disable/.toString())
        //Create Mailinator User
        new actions.Mailinator.CreateMailinatorUser().run("Email":/brightC131758/.toString(),"Enterprise System Administrator":false,"Finally Login as What User":/brightC131758@mailinator.com/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Gig/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Decline Email Body With Message/.toString())
        //Apply on View Idea 30
        new actions.ViewIdea30.ApplyOnViewIdea30().run("Message":/I would like to be part of the team/.toString(),"Expertise":/MySQL,Automation/.toString(),"Expertise Add or Remove":/Add,Add/.toString(),"Contact - Include my contact email":false,"Action":/Apply/.toString())
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Close Idea Modal":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Gig/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Decline Email Body With Message/.toString())
        //Accept/Decline Applicant, Send Message on View Idea 3
        new actions.ViewIdea30.AcceptDeclineApplicantSendMessageonViewIdea3().run("Applicant's Username":/Autofirst Autolast/.toString(),"Accept or Reject or Send Message":/Reject/.toString(),"Message (optional)":/You are declined/.toString(),"Action":/Reject/.toString())
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Close Idea Modal":true)
        //Verify Body of Email
        new actions.Mailinator.VerifyBodyofEmail().run("Email Address":/brightC131758@mailinator.com/.toString(),"Contains Text":/DearAuto,Unfortunately,youhavenotbeenselectedforDeclineEmailBodyWithMessage"${variables."affiliateURL"}\/D111"AdditionalmessagefromSystemAdmin:"Youaredeclined"/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/brightC131758@mailinator.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Gig/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Decline Email Body Without Message/.toString())
        //Apply on View Idea 30
        new actions.ViewIdea30.ApplyOnViewIdea30().run("Message":/I would like to be part of the team/.toString(),"Expertise":/MySQL,Automation/.toString(),"Expertise Add or Remove":/Add,Add/.toString(),"Contact - Include my contact email":false,"Action":/Apply/.toString())
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Close Idea Modal":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Gig/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Decline Email Body Without Message/.toString())
        //Accept/Decline Applicant, Send Message on View Idea 3
        new actions.ViewIdea30.AcceptDeclineApplicantSendMessageonViewIdea3().run("Applicant's Username":/Autofirst Autolast/.toString(),"Accept or Reject or Send Message":/Reject/.toString(),"Action":/Reject/.toString())
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Close Idea Modal":true)
        //Verify Body of Email
        new actions.Mailinator.VerifyBodyofEmail().run("Email Address":/brightC131758@mailinator.com/.toString(),"Contains Text":/DearAuto,Unfortunately,youhavenotbeenselectedforDeclineEmailBodyWithoutMessage"${variables."affiliateURL"}\/D113"/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/brightC131758@mailinator.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Gig/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Decline Email Subject With Message/.toString())
        //Apply on View Idea 30
        new actions.ViewIdea30.ApplyOnViewIdea30().run("Message":/I would like to be part of the team/.toString(),"Expertise":/MySQL,Automation/.toString(),"Expertise Add or Remove":/Add,Add/.toString(),"Contact - Include my contact email":false,"Action":/Apply/.toString())
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Close Idea Modal":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Gig/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Decline Email Subject With Message/.toString())
        //Accept/Decline Applicant, Send Message on View Idea 3
        new actions.ViewIdea30.AcceptDeclineApplicantSendMessageonViewIdea3().run("Applicant's Username":/Autofirst Autolast/.toString(),"Accept or Reject or Send Message":/Reject/.toString(),"Message (optional)":/You are declined/.toString(),"Action":/Reject/.toString())
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Close Idea Modal":true)
        //Verify Email
        new actions.Mailinator.VerifyEmail().run("Email Address":/brightC131758@mailinator.com/.toString(),"Subject":/You have an update to your application for Decline Email Subject With Message/.toString(),"Email Should Be Received":true)
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