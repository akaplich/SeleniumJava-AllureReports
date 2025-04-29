package TestCases.RWHQImports.RWHQTestCases_Untested

import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C10764 - Challenge Brief Q&A Load More
class C10764_ChallengeBriefQRedwoodHQTestCaseALoadMore
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
        new actions.general.Navigate().run("Area to Navigate to":/Apps/.toString())
        //Create Solve Webstorm
        new actions.WebstormCreation.CreateSolveWebstorm().run("App Name":/Solve/.toString(),"Sponsor Name":/Sri/.toString(),"Sponsor Add or Remove":/Add/.toString(),"Webstorm Title":/New Solve Challenge/.toString(),"Challenge Brief":/Description/.toString(),"Action on General Information Tab":/Continue/.toString(),"Action on Design Tab":/Continue/.toString(),"General Access":/End User/.toString(),"General Access Add or Remove":/Add/.toString(),"Early Access":/End User/.toString(),"Early Access Add or Remove":/Add/.toString(),"Action on Participants Tab":/Continue/.toString(),"Action on Site Schedule Tab":/Continue/.toString(),"Action on Communications Tab":/Continue/.toString(),"Action on Process Tab":/Continue/.toString(),"Action":/Create/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.enduser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/New Solve Challenge/.toString(),"Area to Navigate to":/Home/.toString())
        //Set Challenge Brief QAndA
        new actions.Webstorm.SetChallengeBriefQAndA().run("Question or Answer":/Question/.toString(),"Text":/Question11/.toString())
        //Set Challenge Brief QAndA
        new actions.Webstorm.SetChallengeBriefQAndA().run("Question or Answer":/Question/.toString(),"Text":/Question10/.toString())
        //Set Challenge Brief QAndA
        new actions.Webstorm.SetChallengeBriefQAndA().run("Question or Answer":/Question/.toString(),"Text":/Question9/.toString())
        //Set Challenge Brief QAndA
        new actions.Webstorm.SetChallengeBriefQAndA().run("Question or Answer":/Question/.toString(),"Text":/Question8/.toString())
        //Set Challenge Brief QAndA
        new actions.Webstorm.SetChallengeBriefQAndA().run("Question or Answer":/Question/.toString(),"Text":/Question7/.toString())
        //Set Challenge Brief QAndA
        new actions.Webstorm.SetChallengeBriefQAndA().run("Question or Answer":/Question/.toString(),"Text":/Question6/.toString())
        //Set Challenge Brief QAndA
        new actions.Webstorm.SetChallengeBriefQAndA().run("Question or Answer":/Question/.toString(),"Text":/Question5/.toString())
        //Set Challenge Brief QAndA
        new actions.Webstorm.SetChallengeBriefQAndA().run("Question or Answer":/Question/.toString(),"Text":/Question4/.toString())
        //Set Challenge Brief QAndA
        new actions.Webstorm.SetChallengeBriefQAndA().run("Question or Answer":/Question/.toString(),"Text":/Question3/.toString())
        //Set Challenge Brief QAndA
        new actions.Webstorm.SetChallengeBriefQAndA().run("Question or Answer":/Question/.toString(),"Text":/Question2/.toString())
        //Set Challenge Brief QAndA
        new actions.Webstorm.SetChallengeBriefQAndA().run("Question or Answer":/Question/.toString(),"Text":/Question1/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/bi.adminuser1@brightidea.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/New Solve Challenge/.toString(),"Area to Navigate to":/Home/.toString())
        //Set Challenge Brief QAndA
        new actions.Webstorm.SetChallengeBriefQAndA().run("Question or Answer":/Answer/.toString(),"Text":/Answer1 to Question1/.toString(),"Question whose answer to be posted":/Question1/.toString())
        //Set Challenge Brief QAndA
        new actions.Webstorm.SetChallengeBriefQAndA().run("Question or Answer":/Answer/.toString(),"Text":/Answer2 to Question1/.toString(),"Question whose answer to be posted":/Question1/.toString())
        //Set Challenge Brief QAndA
        new actions.Webstorm.SetChallengeBriefQAndA().run("Question or Answer":/Answer/.toString(),"Text":/Answer3 to Question1/.toString(),"Question whose answer to be posted":/Question1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/New Solve Challenge/.toString(),"Area to Navigate to":/Home/.toString())
        //Wait
        new actions.general.Wait().run("Seconds":/2/.toString())
        //Verify Challenge Brief Question for a Webstorm
        new actions.Webstorm.VerifyChallengeBriefQuestionforaWebstorm().run("Question":/Question1/.toString(),"User":/End User/.toString(),"Total Answers":/3/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Challenge Brief Answer for a Webstorm
        new actions.Webstorm.VerifyChallengeBriefAnswerforaWebstorm().run("Question":/Question1/.toString(),"Answer":/Answer1 to Question1/.toString(),"User":/System Admin/.toString(),"Administrator or Sponsor":/Administrator/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Challenge Brief Answer for a Webstorm
        new actions.Webstorm.VerifyChallengeBriefAnswerforaWebstorm().run("Question":/Question1/.toString(),"Answer":/Answer2 to Question1/.toString(),"User":/System Admin/.toString(),"Administrator or Sponsor":/Administrator/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Challenge Brief Answer for a Webstorm
        new actions.Webstorm.VerifyChallengeBriefAnswerforaWebstorm().run("Question":/Question1/.toString(),"Answer":/Answer3 to Question1/.toString(),"User":/System Admin/.toString(),"Administrator or Sponsor":/Administrator/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Challenge Brief Question for a Webstorm
        new actions.Webstorm.VerifyChallengeBriefQuestionforaWebstorm().run("Question":/Question2/.toString(),"User":/End User/.toString(),"Total Answers":/0/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Challenge Brief Question for a Webstorm
        new actions.Webstorm.VerifyChallengeBriefQuestionforaWebstorm().run("Question":/Question3/.toString(),"User":/End User/.toString(),"Total Answers":/0/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Challenge Brief Question for a Webstorm
        new actions.Webstorm.VerifyChallengeBriefQuestionforaWebstorm().run("Question":/Question4/.toString(),"User":/End User/.toString(),"Total Answers":/0/.toString(),"Placement Number":/4/.toString(),"Number of Matches":/1/.toString())
        //Verify Challenge Brief Question for a Webstorm
        new actions.Webstorm.VerifyChallengeBriefQuestionforaWebstorm().run("Question":/Question5/.toString(),"User":/End User/.toString(),"Total Answers":/0/.toString(),"Placement Number":/5/.toString(),"Number of Matches":/1/.toString())
        //Verify Challenge Brief Question for a Webstorm
        new actions.Webstorm.VerifyChallengeBriefQuestionforaWebstorm().run("Question":/Question6/.toString(),"User":/End User/.toString(),"Total Answers":/0/.toString(),"Number of Matches":/0/.toString())
        //Click on Element
        new actions.selenium.Click().run("ID":/\/\/*[@id='comments-comment-list']\/div[@class='load-more-btn']/.toString(),"ID Type":/XPath/.toString())
        //Verify Challenge Brief Question for a Webstorm
        new actions.Webstorm.VerifyChallengeBriefQuestionforaWebstorm().run("Question":/Question1/.toString(),"User":/End User/.toString(),"Total Answers":/3/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Challenge Brief Answer for a Webstorm
        new actions.Webstorm.VerifyChallengeBriefAnswerforaWebstorm().run("Question":/Question1/.toString(),"Answer":/Answer1 to Question1/.toString(),"User":/System Admin/.toString(),"Administrator or Sponsor":/Administrator/.toString(),"Placement Number":/1/.toString(),"Number of Matches":/1/.toString())
        //Verify Challenge Brief Answer for a Webstorm
        new actions.Webstorm.VerifyChallengeBriefAnswerforaWebstorm().run("Question":/Question1/.toString(),"Answer":/Answer2 to Question1/.toString(),"User":/System Admin/.toString(),"Administrator or Sponsor":/Administrator/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Challenge Brief Answer for a Webstorm
        new actions.Webstorm.VerifyChallengeBriefAnswerforaWebstorm().run("Question":/Question1/.toString(),"Answer":/Answer3 to Question1/.toString(),"User":/System Admin/.toString(),"Administrator or Sponsor":/Administrator/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Challenge Brief Question for a Webstorm
        new actions.Webstorm.VerifyChallengeBriefQuestionforaWebstorm().run("Question":/Question2/.toString(),"User":/End User/.toString(),"Total Answers":/0/.toString(),"Placement Number":/2/.toString(),"Number of Matches":/1/.toString())
        //Verify Challenge Brief Question for a Webstorm
        new actions.Webstorm.VerifyChallengeBriefQuestionforaWebstorm().run("Question":/Question3/.toString(),"User":/End User/.toString(),"Total Answers":/0/.toString(),"Placement Number":/3/.toString(),"Number of Matches":/1/.toString())
        //Verify Challenge Brief Question for a Webstorm
        new actions.Webstorm.VerifyChallengeBriefQuestionforaWebstorm().run("Question":/Question4/.toString(),"User":/End User/.toString(),"Total Answers":/0/.toString(),"Placement Number":/4/.toString(),"Number of Matches":/1/.toString())
        //Verify Challenge Brief Question for a Webstorm
        new actions.Webstorm.VerifyChallengeBriefQuestionforaWebstorm().run("Question":/Question5/.toString(),"User":/End User/.toString(),"Total Answers":/0/.toString(),"Placement Number":/5/.toString(),"Number of Matches":/1/.toString())
        //Verify Challenge Brief Question for a Webstorm
        new actions.Webstorm.VerifyChallengeBriefQuestionforaWebstorm().run("Question":/Question6/.toString(),"User":/End User/.toString(),"Total Answers":/0/.toString(),"Placement Number":/6/.toString(),"Number of Matches":/1/.toString())
        //Verify Challenge Brief Question for a Webstorm
        new actions.Webstorm.VerifyChallengeBriefQuestionforaWebstorm().run("Question":/Question7/.toString(),"User":/End User/.toString(),"Total Answers":/0/.toString(),"Placement Number":/7/.toString(),"Number of Matches":/1/.toString())
        //Verify Challenge Brief Question for a Webstorm
        new actions.Webstorm.VerifyChallengeBriefQuestionforaWebstorm().run("Question":/Question8/.toString(),"User":/End User/.toString(),"Total Answers":/0/.toString(),"Placement Number":/8/.toString(),"Number of Matches":/1/.toString())
        //Verify Challenge Brief Question for a Webstorm
        new actions.Webstorm.VerifyChallengeBriefQuestionforaWebstorm().run("Question":/Question9/.toString(),"User":/End User/.toString(),"Total Answers":/0/.toString(),"Placement Number":/9/.toString(),"Number of Matches":/1/.toString())
        //Verify Challenge Brief Question for a Webstorm
        new actions.Webstorm.VerifyChallengeBriefQuestionforaWebstorm().run("Question":/Question10/.toString(),"User":/End User/.toString(),"Total Answers":/0/.toString(),"Placement Number":/10/.toString(),"Number of Matches":/1/.toString())
        //Verify Challenge Brief Question for a Webstorm
        new actions.Webstorm.VerifyChallengeBriefQuestionforaWebstorm().run("Question":/Question11/.toString(),"User":/End User/.toString(),"Number of Matches":/0/.toString())
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