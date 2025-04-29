import org.testng.annotations.BeforeSuite
import org.testng.annotations.AfterMethod
import org.testng.annotations.Test

//C132179 - Create Folder as Pipeline Admin, Moderator and Analyst
class C132179_CreateFolderasPipelineAdmin_ModeratorandAnalyst
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
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/pipelineadmin@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Create Folder in Pipeline Sidebar
        new actions.PipelineSidebar.CreateFolderinPipelineSidebar().run("Folder Name":/Pipeline Admin Folder/.toString())
        //Drag And Drop to Element
        new actions.selenium.DragAndDrop().run("From ID":/\/\/*[@id='sidebar-pipelines']\/\/DIV[text()='Custom App']/.toString(),"To ID":/\/\/*[@id='sidebar-pipelines']\/\/DIV[text()='Pipeline Admin Folder']/.toString())
        //Verify Pipeline Sidebar Pipelines and Folders
        new actions.PipelineSidebar.VerifyPipelineSidebarPipelines().run("Pipeline or Folder Name":/Custom App/.toString(),"Number of Matches":/0/.toString())
        //Expand/Collapse Pipeline Sidebar Folder
        new actions.PipelineSidebar.ExpandCollapsePipelineSidebarFolder().run("Folder Name":/Pipeline Admin Folder/.toString(),"Expand or Collapse":/Expand/.toString())
        //Verify Pipeline Sidebar Pipelines and Folders
        new actions.PipelineSidebar.VerifyPipelineSidebarPipelines().run("Pipeline or Folder Name":/Custom App/.toString(),"Placement Number":/2/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/moderator@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Create Folder in Pipeline Sidebar
        new actions.PipelineSidebar.CreateFolderinPipelineSidebar().run("Folder Name":/Moderator Folder/.toString())
        //Drag And Drop to Element
        new actions.selenium.DragAndDrop().run("From ID":/\/\/*[@id='sidebar-pipelines']\/\/DIV[text()='Evaluators app']/.toString(),"To ID":/\/\/*[@id='sidebar-pipelines']\/\/DIV[text()='Moderator Folder']/.toString())
        //Drag And Drop to Element
        new actions.selenium.DragAndDrop().run("From ID":/\/\/*[@id='sidebar-pipelines']\/\/DIV[text()='Custom App']/.toString(),"To ID":/\/\/*[@id='sidebar-pipelines']\/\/DIV[text()='Moderator Folder']/.toString())
        //Verify Pipeline Sidebar Pipelines and Folders
        new actions.PipelineSidebar.VerifyPipelineSidebarPipelines().run("Pipeline or Folder Name":/Evaluators app/.toString(),"Number of Matches":/0/.toString())
        //Verify Pipeline Sidebar Pipelines and Folders
        new actions.PipelineSidebar.VerifyPipelineSidebarPipelines().run("Pipeline or Folder Name":/Custom App/.toString(),"Number of Matches":/0/.toString())
        //Expand/Collapse Pipeline Sidebar Folder
        new actions.PipelineSidebar.ExpandCollapsePipelineSidebarFolder().run("Folder Name":/Moderator Folder/.toString(),"Expand or Collapse":/Expand/.toString())
        //Verify Pipeline Sidebar Pipelines and Folders
        new actions.PipelineSidebar.VerifyPipelineSidebarPipelines().run("Pipeline or Folder Name":/Custom App/.toString(),"Placement Number":/3/.toString())
        //Verify Pipeline Sidebar Pipelines and Folders
        new actions.PipelineSidebar.VerifyPipelineSidebarPipelines().run("Pipeline or Folder Name":/Evaluators app/.toString(),"Placement Number":/2/.toString())
        //Log Out
        new actions.general.LogOut().run([:])
        //Login
        new actions.general.Login().run("Email":/analyst@test.com/.toString(),"Password":/brightidea1/.toString())
        //Navigate WebStorm or MTS
        new actions.general.NavigateWebStormAdminBar().run("WebStorm Name":/Custom App/.toString(),"Area to Navigate to":/Pipeline Steps/.toString())
        //Verify Element
        new actions.general.VerifyElement().run("ID":/\/\/*[@id='menu-create-folder']/.toString(),"Should Element Exist":false,"Number of Matches":/1/.toString())
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