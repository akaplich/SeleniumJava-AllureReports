package TestCases.RWHQImports.SmokeTests

import BaseClasses.TestBase
import BaseClasses.FailureCaptureExtension
import actions.API.Utils.CopyAffiliate
import actions.IdeaBoard.AccessIdeainIdeaBoardpage30
import actions.IdeaBoard.VerifyIdeainIdeaBoardpage30
import actions.PostIdea.SetCustomAppPostIdea
import actions.Utils.SettoLabEnvironment
import actions.ViewIdea.VerifyIdeainViewIdeapage
import actions.general.Login
import actions.general.NavigateWebStormAdminBar
import actions.general.Wait
import actions.selenium.Browser
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.slf4j.Logger
import org.slf4j.LoggerFactory

//C44 - Submit new valid Idea with all Required fields
//@ExtendWith(FailureCaptureExtension.class)
class C44_SubmitNewValidIdeaWithAllRequiredFields extends TestBase {
    private static def variables = [:]
    private static final Logger logger = LoggerFactory.getLogger(C44_SubmitNewValidIdeaWithAllRequiredFields.class);


    @BeforeAll
    public static void beforeState() {
        logger.debug("Before State");
        variables."Browser" = /Chrome/
        variables."TestRail_RunName" = null
        variables."TestRail_ExecutionName" = null
        variables."CodeEnvironment" = /Default/
        variables."Database" = null
        variables."Licensing Model" = null
        variables."Unlimited Brightidea Administrator License Type" = null
        variables."Brightidea Administrator License Type Purchased Count" = null
        variables."Unlimited Idea Box Manager License Type" = null
        variables."Idea Box Manager License Type Purchased Count" = null
        variables."New Affiliate Name" = "auto" + System.currentTimeMillis().toString() + (100000 + new Random().nextInt(900000)).toString()
    }

    @Test
    @Tag("Smoke")
    @Tag("ShardRun")
    public void testcase(){
        logger.debug("TestCase");
        //Basestate
        Action58123c20fa4ee77809f468f6(variables)
        //Navigate WebStorm or MTS
        logger.debug("NavigateWebStormAdminBar");
        new NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Post Idea/.toString())
        //Set Custom and Other App Post Idea
        logger.debug("SetCustomAppPostIdea");
        new SetCustomAppPostIdea().run("Title":/Idea Title/.toString(),"Description":/Idea Description/.toString(),"Category":/New Product/.toString(),"Required Short Question":/required short/.toString(),"Action":/Submit Idea/.toString())
        //Wait
        new Wait().run("Seconds":/10/.toString())
        //Verify Idea in Idea Board page
        new VerifyIdeainIdeaBoardpage30().run("Idea Name":/Idea Title/.toString(),"Image":true,"Status":/Submitted/.toString(),"Username":/System Admin/.toString(),"Description":/Idea Description/.toString(),"Votes":/1/.toString(),"Comments":/0/.toString(),"Number of Matches":/1/.toString())
        //Access Idea in Idea Board page
        new AccessIdeainIdeaBoardpage30().run("Idea Name":/Idea Title/.toString())
        //Verify Idea in View Idea page
        new VerifyIdeainViewIdeapage().run("Idea Name":/Idea Title/.toString(),"Idea Image":true,"Creator username":/System Admin/.toString(),"Category":/New Product/.toString(),"Status":/Submitted/.toString(),"Description":/Idea Description/.toString(),"Stage":/Collection/.toString(),"Points":/1/.toString(),"Votes":/1/.toString(),"Rank":/1/.toString(),"Comments":/0/.toString(),"Favorited":/0/.toString(),"Linked Submissions":[])
    }
    //Basestate
    public static def Action58123c20fa4ee77809f468f6(def params){
        //Create Affiliate based on Master Affiliate
        logger.debug("CopyAffiliate");
        variables."affiliateURL" = new CopyAffiliate().run(params)
        logger.debug("Affiliate URL: ${variables."affiliateURL"}");
        //Open Browser
        logger.debug("Browser");
        new Browser().run("Run Browser in Incognito":/${params."Run Browser in Incognito"}/.toString(),"URL":/${variables."affiliateURL"}/.toString(),"Browser Type":/${variables."Browser"}/.toString())
        //Login
        logger.debug("Browser");
        new Wait().run("Seconds":/5/.toString())
        new Login().run("Email":/${params."Username Email"}/.toString(),"Password":/brightidea1delete/.toString())
        //Set to Lab Environment
        logger.debug("SettoLabEnvironment");
        new SettoLabEnvironment().run("Email":/${params."Username Email"}/.toString())

    }

    @AfterEach
    public void afterState(){

    }
}

