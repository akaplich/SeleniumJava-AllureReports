import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

//C132412 - Pipeline List View - Export List - Visible Field
class C132412_PipelineListView_ExportList_VisibleField
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
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/Visible Idea One/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/Visible Idea Two/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/Visible Idea Three/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/Hidden Idea One/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/Hidden Idea Two/.toString(),"Action":/Submit/.toString())
        //Quick Add an Idea in Pipeline Steps page
        new actions.PipelineStepsView.SetQuickAddMemoorIdea().run("Title":/Hidden Idea Three/.toString(),"Action":/Submit/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Hidden Idea One/.toString())
        //Change Idea Visibility in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaVisibilityinPipelineStepspage().run("Visibility":/Hidden/.toString(),"Action":/Change Visibility/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Hidden Idea Two/.toString())
        //Change Idea Visibility in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaVisibilityinPipelineStepspage().run("Visibility":/Hidden/.toString(),"Action":/Change Visibility/.toString())
        //Select Idea in Pipeline Steps page
        new actions.PipelineStepsView.SelectIdeainPipelineStepsViewpage().run("Idea Name":/Hidden Idea Three/.toString())
        //Change Idea Visibility in Pipeline Steps page
        new actions.PipelineStepsView.ChangeIdeaVisibilityinPipelineStepspage().run("Visibility":/Hidden/.toString(),"Action":/Change Visibility/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline List/.toString())
        //Verify Idea in Pipeline List page
        new actions.PipelineList.VerifyIdeainPipelineListpage().run("Title":/Hidden Idea Three/.toString(),"Image":false,"Code":/D118/.toString(),"Stage":/Collection/.toString(),"Step":/Review/.toString(),"Submitter":/System Admin/.toString(),"Category":/Quick Add/.toString(),"Status":/Submitted/.toString(),"Innovation State":/Idea/.toString(),"Views":/0/.toString(),"Visible":/False/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Pipeline List page
        new actions.PipelineList.VerifyIdeainPipelineListpage().run("Title":/Hidden Idea Two/.toString(),"Image":false,"Code":/D117/.toString(),"Stage":/Collection/.toString(),"Step":/Review/.toString(),"Submitter":/System Admin/.toString(),"Category":/Quick Add/.toString(),"Status":/Submitted/.toString(),"Innovation State":/Idea/.toString(),"Views":/0/.toString(),"Visible":/False/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Pipeline List page
        new actions.PipelineList.VerifyIdeainPipelineListpage().run("Title":/Hidden Idea One/.toString(),"Image":false,"Code":/D116/.toString(),"Stage":/Collection/.toString(),"Step":/Review/.toString(),"Submitter":/System Admin/.toString(),"Category":/Quick Add/.toString(),"Status":/Submitted/.toString(),"Innovation State":/Idea/.toString(),"Views":/0/.toString(),"Visible":/False/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Pipeline List page
        new actions.PipelineList.VerifyIdeainPipelineListpage().run("Title":/Hidden Idea One/.toString(),"Image":false,"Code":/D116/.toString(),"Stage":/Collection/.toString(),"Step":/Review/.toString(),"Submitter":/System Admin/.toString(),"Category":/Quick Add/.toString(),"Status":/Submitted/.toString(),"Innovation State":/Idea/.toString(),"Views":/0/.toString(),"Visible":/True/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Pipeline List page
        new actions.PipelineList.VerifyIdeainPipelineListpage().run("Title":/Visible Idea One/.toString(),"Image":false,"Code":/D113/.toString(),"Stage":/Collection/.toString(),"Step":/Review/.toString(),"Submitter":/System Admin/.toString(),"Category":/Quick Add/.toString(),"Status":/Submitted/.toString(),"Innovation State":/Idea/.toString(),"Views":/0/.toString(),"Visible":/False/.toString(),"Number of Matches":/0/.toString())
        //Verify Idea in Pipeline List page
        new actions.PipelineList.VerifyIdeainPipelineListpage().run("Title":/Visible Idea One/.toString(),"Image":false,"Code":/D113/.toString(),"Stage":/Collection/.toString(),"Step":/Review/.toString(),"Submitter":/System Admin/.toString(),"Category":/Quick Add/.toString(),"Status":/Submitted/.toString(),"Innovation State":/Idea/.toString(),"Views":/0/.toString(),"Visible":/True/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Pipeline List page
        new actions.PipelineList.VerifyIdeainPipelineListpage().run("Title":/Visible Idea Two/.toString(),"Image":false,"Code":/D114/.toString(),"Stage":/Collection/.toString(),"Step":/Review/.toString(),"Submitter":/System Admin/.toString(),"Category":/Quick Add/.toString(),"Status":/Submitted/.toString(),"Innovation State":/Idea/.toString(),"Views":/0/.toString(),"Visible":/True/.toString(),"Number of Matches":/1/.toString())
        //Verify Idea in Pipeline List page
        new actions.PipelineList.VerifyIdeainPipelineListpage().run("Title":/Visible Idea Three/.toString(),"Image":false,"Code":/D115/.toString(),"Stage":/Collection/.toString(),"Step":/Review/.toString(),"Submitter":/System Admin/.toString(),"Category":/Quick Add/.toString(),"Status":/Submitted/.toString(),"Innovation State":/Idea/.toString(),"Views":/0/.toString(),"Visible":/True/.toString(),"Number of Matches":/1/.toString())
        //Export Ideas from Pipeline List View
        new actions.PipelineList.ExportIdeasfromPipelineListView().run([:])
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Custom_App-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Title","Code","Stage","Step","Submitter","Category","Status","Innovation State","Visible"],"Number of Matches":/1/.toString(),"Total Number of Rows":/12/.toString())
        //Export Ideas from Pipeline List View
        new actions.PipelineList.ExportIdeasfromPipelineListView().run([:])
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Custom_App-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Hidden Idea Three","D118","Collection","Review","System Admin","Quick Add","Submitted","Idea","No"],"Number of Matches":/1/.toString(),"Total Number of Rows":/12/.toString())
        //Export Ideas from Pipeline List View
        new actions.PipelineList.ExportIdeasfromPipelineListView().run([:])
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Custom_App-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Hidden Idea Two","D117","Collection","Review","System Admin","Quick Add","Submitted","Idea","No"],"Number of Matches":/1/.toString(),"Total Number of Rows":/12/.toString())
        //Export Ideas from Pipeline List View
        new actions.PipelineList.ExportIdeasfromPipelineListView().run([:])
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Custom_App-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Hidden Idea One","D116","Collection","Review","System Admin","Quick Add","Submitted","Idea","No"],"Number of Matches":/1/.toString(),"Total Number of Rows":/12/.toString())
        //Export Ideas from Pipeline List View
        new actions.PipelineList.ExportIdeasfromPipelineListView().run([:])
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Custom_App-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Visible Idea Three","D115","Collection","Review","System Admin","Quick Add","Submitted","Idea","Yes"],"Number of Matches":/1/.toString(),"Total Number of Rows":/12/.toString())
        //Export Ideas from Pipeline List View
        new actions.PipelineList.ExportIdeasfromPipelineListView().run([:])
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Custom_App-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Visible Idea Two","D114","Collection","Review","System Admin","Quick Add","Submitted","Idea","Yes"],"Number of Matches":/1/.toString(),"Total Number of Rows":/12/.toString())
        //Export Ideas from Pipeline List View
        new actions.PipelineList.ExportIdeasfromPipelineListView().run([:])
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Custom_App-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["Visible Idea One","D113","Collection","Review","System Admin","Quick Add","Submitted","Idea","Yes"],"Number of Matches":/1/.toString(),"Total Number of Rows":/12/.toString())
        //Export Ideas from Pipeline List View
        new actions.PipelineList.ExportIdeasfromPipelineListView().run([:])
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Custom_App-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["test idea2","D107","Collection","Review","Sri","Operations","Submitted","Idea","Yes"],"Number of Matches":/1/.toString(),"Total Number of Rows":/12/.toString())
        //Export Ideas from Pipeline List View
        new actions.PipelineList.ExportIdeasfromPipelineListView().run([:])
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Custom_App-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["quick add1","D105","Collection","Review","Sri","Quick Add","Submitted","Idea","No"],"Number of Matches":/1/.toString(),"Total Number of Rows":/12/.toString())
        //Export Ideas from Pipeline List View
        new actions.PipelineList.ExportIdeasfromPipelineListView().run([:])
        //Verify File Data
        new actions.general.VerifyFileData().run("File Name":/Custom_App-*.csv/.toString(),"File Location":/Downloads/.toString(),"Row Values":["test idea1","D102","Collection","Review","Sri","New Product","Under Review","Idea","Yes"],"Number of Matches":/1/.toString(),"Total Number of Rows":/12/.toString())
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