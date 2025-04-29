import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C131664 - Apply - User Applied - Email & In App Notification to Submitter
class C131664_Apply_UserApplied_EmailAndInAppNotificationtoSubmitter
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
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Apply Filter on Apps Pillar 2.0
        new actions.AppsPillar.ApplyFilterAppsPillar20().run("Filter Option":/Transformation/.toString())
        //Create App Webstorm
        new actions.WebstormCreation.CreateAppWebstorm().run("App Name":/Gig/.toString(),"Sponsor Name":/NonBI System Admin/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/Gig/.toString(),"Description":/Gig description/.toString(),"Type of Licensing Model":/Standard Licensing Model/.toString(),"General Access":/ALL/.toString(),"General Access Add or Remove":/Add/.toString(),"Action":/Create/.toString())
        //Navigate Webstorm via Admin Dropdown Only
        new actions.general.NavigateWebstormviaAdminBarOnly().run("Area to Navigate to":/Site Setup/.toString())
        //Set Webstorm Setup Ideas for Ideas tab
        new actions.SetupIdeas.SetWebstormSetupIdeasforIdeastab().run("View Idea 3.0":true)
        //Navigate to URL
        new actions.selenium.NavigateToURL().run("URL":/${variables."affiliateURL"}\/Gig\/submit/.toString())
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Idea Title Question - Title":/Title/.toString(),"Idea Title Question - Value":/test/.toString(),"Description Question - Title":/Description/.toString(),"Description Question - Value":/test/.toString(),"Category Question - Title":/Job Type/.toString(),"Category Question - Value":/Accounting/.toString(),"Action":/Submit Idea/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/test/.toString())
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Access Idea":/test/.toString())
        //Set Widget Controller
        new actions.Widgets.SetWidgetController().run("Widget Edit Mode":/Enable/.toString())
        //Drag Widget Onto View Idea 3
        new actions.ViewIdea30.DragWidgetOnViewIdea3().run("Widget Title":/Apply/.toString(),"Above What Existing Widget":/Status/.toString())
        //Set Widget Controller
        new actions.Widgets.SetWidgetController().run("Widget Edit Mode":/Disable/.toString())
        //Create Mailinator User
        new actions.Mailinator.CreateMailinatorUser().run("Email":/brightC131664_3/.toString(),"Enterprise System Administrator":false,"Finally Login as What User":/brightC131664_3@mailinator.com/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Gig/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Post Idea Fields
        new actions.PostIdea.SetPostIdeaFields().run("Idea Title Question - Title":/Title/.toString(),"Idea Title Question - Value":/Gig Offer/.toString(),"Description Question - Title":/Description/.toString(),"Description Question - Value":/test/.toString(),"Category Question - Title":/Job Type/.toString(),"Category Question - Value":/Accounting/.toString(),"Action":/Submit Idea/.toString())
        //Verify Email
        new actions.Mailinator.VerifyEmail().run("Email Address":/brightC131664_3/.toString(),"Subject":/Gig: Job Submission Confirmation/.toString(),"Email Should Be Received":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Gig/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Gig Offer/.toString())
        //Apply on View Idea 30
        new actions.ViewIdea30.ApplyOnViewIdea30().run("Message":/I'd like to be part of the team/.toString(),"Expertise":/MySQL,Automation/.toString(),"Expertise Add or Remove":/Add,Add/.toString(),"Contact - Include my contact email":false,"Action":/Apply/.toString())
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Close Idea Modal":true)
        //Verify Email
        new actions.Mailinator.VerifyEmail().run("Email Address":/brightC131664_3/.toString(),"Subject":/End User applied to: Gig Offer/.toString(),"Email Should Be Received":true)
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser2@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate
        new actions.general.Navigate().run("Area to Navigate to":/Profile/.toString())
        //Edit Your Profile
        new actions.UserProfile.EditYourProfile().run("Display Picture":/Image5.jpg/.toString(),"Display Picture Change or Remove":/Change/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Gig/.toString(),"Area to Navigate to":/Idea Board/.toString())
        //Access Idea in Idea Board page
        new actions.IdeaBoard.AccessIdeainIdeaBoardpage30().run("Idea Name":/Gig Offer/.toString())
        //Apply on View Idea 30
        new actions.ViewIdea30.ApplyOnViewIdea30().run("Message":/I'd like to be part of the team/.toString(),"Expertise":/MySQL,Automation/.toString(),"Expertise Add or Remove":/Add,Add/.toString(),"Action":/Apply/.toString())
        //Access or Close Idea from View Idea 3 Modal
        new actions.ViewIdea30.AccessIdeafromViewIdea3Modal().run("Close Idea Modal":true)
        //Verify Body of Email
        new actions.Mailinator.VerifyBodyofEmail().run("Email Address":/brightC131664_3/.toString(),"Contains Text":/DearAuto,EndUser2appliedtoGigOfferEmail:bi.enduser2@brightidea.comI'dliketobepartoftheteamViewmoredetails/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/brightC131664_3@mailinator.com/.toString(),"Password":/brightidea1/.toString())
        //Verify Notifications
        new actions.Notifications.VerifyNotifications().run("Notification message":/End User applied to Gig Offer/.toString(),"Number of Matches":/1/.toString())
        //Verify Notifications
        new actions.Notifications.VerifyNotifications().run("Notification message":/End User 2 subscribed to your Job, Gig Offer./.toString(),"Number of Matches":/1/.toString())
        //Verify Notifications
        new actions.Notifications.VerifyNotifications().run("Notification message":/End User 2 applied to Gig Offer/.toString(),"Number of Matches":/1/.toString())
        //Compare Images
        new actions.selenium.CompareImages().run("Element ID (optional)":/\/\/*[contains(@class,'notifcation-item-unread')]\/\/div[@class='n-profile-img']/.toString(),"Expected Image File":/C131664_expected.png/.toString(),"Actual Image Name":/C131664_actual.png/.toString())
        //Access Notification from Global Navigation
        new actions.Notifications.AccessNotificationfromGlobalNavigation().run("Notification Message":/End User 2 applied to Gig Offer/.toString())
        //Verify Idea on View Idea 30
        new actions.ViewIdea30.VerifyIdeaonViewIdea3().run("Idea Name":/Gig Offer/.toString())
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
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/C131664_actual.png/.toString())
        }
       catch(all){}catch(Error err){}
        try{
            //Delete File
            new actions.selenium.DeleteFile().run("File Location":/Downloads/.toString(),"File Name":/difference.png/.toString())
        }
       catch(all){}catch(Error err){}
    }
}