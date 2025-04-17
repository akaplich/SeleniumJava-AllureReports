package actions.WebstormCreation;

import actions.common.AppsCommon
import actions.selenium.SetText
import actions.selenium.Click
import actions.selenium.SelectItem
import actions.selenium.Exists
import actions.selenium.SendKeys
import actions.selenium.ExecuteJavascript
import actions.selenium.SetReactTags
import actions.WebstormCreation.SetClickOnAppTileInAppsPillarPage
import java.text.SimpleDateFormat;

import screens.SiteSetup.SchedulerV3Locators

class CreateAppWebstorm{
    public void run(def params){

        SetClickOnAppTileInAppsPillarPage instance = new SetClickOnAppTileInAppsPillarPage()
		// Define the parameters as a map
		def apps = [ "App Name": params."App Name" ]
		// Call the run method with the parameters
		instance.run(apps)

        if(params."Sponsor Name"){AppsCommon.UserPickerAddRemove("Field Name":"Sponsor",User:params."Sponsor Name","Add or Remove":params."Sponsor Add or Remove")}
        if(params."Webstorm Title"){SetText.run(Text:params."Webstorm Title",ID:"//*[@id='name']")}
        if(params."Description") {SetText.run(Text:params."Description",ID:"//*[@id='description']")}
        if(params."Action on General Information Tab"== null || params."Action on General Information Tab" == "Continue"){
            Click.run(ID:"//*[@class='bi-button-success-md']")
        }
        else if(params."Action on General Information Tab"== "Cancel"){
            Click.run(ID:"//*[@data-action='cancel']")
        }
        
        //Some have Business Model before going to Desing
        if(Exists.run(ID:"//*[@id='setup-main']//*[text()='SITE DESIGN']")==0){
            if(params."Business Model"){Click.run(ID:"//*[@id='setup-main']//LABEL[text()='${params."Business Model"}']")}
            Click.run(ID:"//BUTTON[@class='bi-button-success-md' and text()='Continue']")
        }
        
        AppsCommon.ChooseDesignTemplate(params)
		AppsCommon.SetDepartmentalIdeaboxSubpipelines("SubPipeline Name":params."SubPipeline Name","SubPipeline Field Name":params."SubPipeline Field Name")
        if(params."Action on Multi Pipeline Configuration"){
           if(params."Action on Multi Pipeline Configuration" == "Continue"){
               Click.run(ID:"//*[@class='bi-button-success-md']")
           } else if(params."Action on Multi Pipeline Configuration"== "Cancel"){
               Click.run(ID:"//*[@data-action='cancel']")
           } else {
               Click.run(ID:"//*[@class='bi-button-standard-md']")
           }
        } 

        AppsCommon.UserPickerAddRemove("Field Name":"Early Access",User:params."Early Access","Add or Remove":params."Early Access Add or Remove")
        AppsCommon.UserPickerAddRemove("Field Name":"General Access",User:params."General Access","Add or Remove":params."General Access Add or Remove")
        
         if(params."Type of Licensing Model" == "Standard Licensing Model"){
            if(params."Idea Box Managers") SetReactTags.setMemberTagsWithAddRemoveNewSetupWizard("Field Name":"Idea Box Managers",User:params."Idea Box Managers","Add or Remove":params."Idea Box Managers Add or Remove")      
			if(params."Pipeline Administrators") SetReactTags.setMemberTagsWithAddRemoveNewSetupWizard("Field Name":params."Admin Field Name",User:params."Pipeline Administrators","Add or Remove":params."Administrators Add or Remove")
            if(params."Moderators") SetReactTags.setMemberTagsWithAddRemoveNewSetupWizard("Field Name":"Pipeline Moderators",User:params."Moderators","Add or Remove":params."Moderators Add or Remove")

			//AppsCommon.NewUserPickerAddRemoveInSetupWizard("Field Name":"Idea Box Managers",User:params."Idea Box Managers","Add or Remove":params."Idea Box Managers Add or Remove")
             //AppsCommon.NewUserPickerAddRemoveInSetupWizard("Field Name":params."Admin Field Name",User:params."Pipeline Administrators","Add or Remove":params."Administrators Add or Remove")
             //AppsCommon.NewUserPickerAddRemoveInSetupWizard("Field Name":"Pipeline Moderators",User:params."Moderators","Add or Remove":params."Moderators Add or Remove")
         } else {
             AppsCommon.UserPickerAddRemove("Field Name":"Pipeline Administrators",User:params."Pipeline Administrators","Add or Remove":params."Administrators Add or Remove")
             AppsCommon.UserPickerAddRemove("Field Name":"Moderators",User:params."Moderators","Add or Remove":params."Moderators Add or Remove")
        }

        AppsCommon.ImportUserGroup("Import User Group As":params."Import Group as","Import Group File":params."Import File","Add or Remove User Group":params."Add or Remove Group","Import User Group Action":params."Import Group Action","Check Complete Modal Action":params."Check Modal Action","Group Name":params."Group Name")
        
        //Some have Create while others Continue, so if Continue exists then click on it
        sleep(5000)
        if(Exists.run(ID:"//BUTTON[@class='bi-button-success-md' and text()='Continue']")>0 && Exists.run(ID:"//*[text()='Participants']")>0){Click.run(ID:"//BUTTON[@class='bi-button-success-md' and text()='Continue']")}
        sleep(3000) //slooooow
        if(params."Enable Site Scheduler for initiative"){
          AppsCommon.setEnableSiteSchedulerforInitiative(params)  
        }
        if(params."Populate Site Scheduler 3.0 for initiative with single day schedule" == true || params."App Name".contains("Hack")){
/*            if(Exists.run("//*[contains(@class,'bi-toggle')]/..")){
                Click.run(ID:"//*[contains(@class,'bi-toggle')]/..")
            }*/
            Calendar calendar = Calendar.getInstance();
        	// Add date to tomorrow's date
        	calendar.add(Calendar.DAY_OF_YEAR, 1);
        	// Get the adjusted date
        	Date adjustedDate = calendar.getTime();
			// Format the adjusted date
        	SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy")
        	String formattedDate = dateFormat.format(adjustedDate)
            //String todayDate = dateFormat.format(new Date());
            println("Setting Scheduler to Tomorrow's date: ${dateFormat}")
            SetText.run("ID Type":"By",By:SchedulerV3Locators.planSetupStart, Text: formattedDate, "Type of Clear": "None")
            SetText.run("ID Type":"By",By:SchedulerV3Locators.planSetupEnd, Text: formattedDate, "Type of Clear": "None")
            SelectItem.run("ID Type":"By",By:SchedulerV3Locators.planSetupStart_timepicker, "Visible Text": "7:00 AM")
			SelectItem.run("ID Type":"By",By:SchedulerV3Locators.planSetupEnd_timepicker, "Visible Text": "8:00 AM")
            
            SetText.run("ID Type":"By",By:SchedulerV3Locators.incubateStart, Text: formattedDate, "Type of Clear": "None")
            SetText.run("ID Type":"By",By:SchedulerV3Locators.incubateEnd, Text: formattedDate, "Type of Clear": "None")     
            SelectItem.run("ID Type":"By",By:SchedulerV3Locators.incubateStart_timepicker, "Visible Text": "8:00 AM")
			SelectItem.run("ID Type":"By",By:SchedulerV3Locators.incubateEnd_timepicker, "Visible Text": "9:00 AM")
            
            SetText.run("ID Type":"By",By:SchedulerV3Locators.buildHackStart, Text: formattedDate, "Type of Clear": "None")
            SetText.run("ID Type":"By",By:SchedulerV3Locators.buildHackEnd, Text: formattedDate, "Type of Clear": "None") 
            SelectItem.run("ID Type":"By",By:SchedulerV3Locators.buildHackStart_timepicker, "Visible Text": "9:00 AM")
			SelectItem.run("ID Type":"By",By:SchedulerV3Locators.buildHackEnd_timepicker, "Visible Text": "10:00 AM")
            
            SetText.run("ID Type":"By",By:SchedulerV3Locators.presentationAndJudgingHackStart, Text: formattedDate, "Type of Clear": "None")
            SetText.run("ID Type":"By",By:SchedulerV3Locators.presentationAndJudgingHackEnd, Text: formattedDate, "Type of Clear": "None")             
            SelectItem.run("ID Type":"By",By:SchedulerV3Locators.presentationAndJudgingStartTimepicker, "Visible Text": "10:00 AM")
			SelectItem.run("ID Type":"By",By:SchedulerV3Locators.presentationAndJudgingEndTimepicker, "Visible Text": "11:00 AM")
            
            SetText.run("ID Type":"By",By:SchedulerV3Locators.recognizeStart, Text: formattedDate, "Type of Clear": "None")
            SetText.run("ID Type":"By",By:SchedulerV3Locators.recognizeEnd, Text: formattedDate, "Type of Clear": "None")             
            SelectItem.run("ID Type":"By",By:SchedulerV3Locators.recognizeStart_timepicker, "Visible Text": "11:00 AM")
			SelectItem.run("ID Type":"By",By:SchedulerV3Locators.recognizeEnd_timepicker, "Visible Text": "12:00 PM")
            
            SetText.run("ID Type":"By",By:SchedulerV3Locators.closeOutReviewStart, Text: formattedDate, "Type of Clear": "None")
            SetText.run("ID Type":"By",By:SchedulerV3Locators.closeOutReviewEnd, Text: formattedDate, "Type of Clear": "None")  
            SelectItem.run("ID Type":"By",By:SchedulerV3Locators.closeOutReviewStart_timepicker, "Visible Text": "12:00 PM")
			SelectItem.run("ID Type":"By",By:SchedulerV3Locators.closeOutReviewEnd_timepicker, "Visible Text": "1:00 PM")            
            sleep(2000)
        }
        if(params."Action"){
            ExecuteJavascript.run(Code:"window.scrollTo(100, 100);")
            if(params."Action"=="Cancel"){
                Click.run(ID:"//*[@data-action='cancel']")
            }
            else if(params."Action"=="Back"){
                Click.run(ID:"//*[@data-action='back']")
            }
            else{
                sleep(5000)
                Click.run(ID:"//*[@data-action='create']")
                sleep(5000)
            }
        }
        sleep(10000)
    }
}