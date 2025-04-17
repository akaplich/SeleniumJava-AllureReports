package actions.PipelineSetup;

import screens.PipelineSetup.EmailConfigurationsLocators
import actions.WebstormHomepage.SetPresetBackgroundImageintheHeader
import actions.WebstormHomepage.SetChangeBackgroundmodal
import actions.WebstormHomepage.SetUploadyourOwnBackground
import actions.WebstormHomepage.SetGenerateAIImage
import actions.WebstormHomepage.SetPresetBackgroundImageintheHeader
import actions.selenium.Click
import actions.selenium.SetText
import java.lang.Exception

class SetEmailConfigurationinPipelineSetup{
    public static void run(def params){
        
        if(params."Contact Name"){
            SetText.run("ID Type":"By","By":EmailConfigurationsLocators.contactName, Text:params."Contact Name")
        }
        if(params."Contact Email"){
            SetText.run("ID Type":"By","By":EmailConfigurationsLocators.contactEmail, Text:params."Contact Email")
        }
        if(params."Enable or disable sending Email Alerts to your Pipeline participants"==true){
            Click.run("ID Type":"By","By":EmailConfigurationsLocators.toggleEmailsOFF)
        }else if(params."Enable or disable sending Email Alerts to your Pipeline participants"==false){
            println("Turning off the toggle")
            Click.run("ID Type":"By","By":EmailConfigurationsLocators.toggleEmailsON)
		}
        
        if(params."Custom Email Design Header Background"=="Choose Pattern"){
			Click.run("ID Type":"By","By":EmailConfigurationsLocators.choosePattern)
            SetPresetBackgroundImageintheHeader.run("Preset Image Name":params."Preset Background", "Action":"Add Image")
            
        }else if (params."Custom Email Design Header Background"=="Background"){
			Click.run("ID Type":"By","By":EmailConfigurationsLocators.background)
            Click.run("ID Type":"By", "By":EmailConfigurationsLocators.colorPickerTrigger)
            SetText.run(ID:"//input[contains(@id,'rc-editable-input')]", Text:params."Background Color")
            Click.run("ID Type":"By","By":EmailConfigurationsLocators.background)
        }
        if(params."Custom Email Design - Header Image"){
            Click.run("ID Type":"By", "By":EmailConfigurationsLocators.uploadZone)
            SetChangeBackgroundmodal.run("Tab":params."Custom Email Design - Header Image")
            switch(params."Custom Email Design - Header Image"){
            	case "Upload":
            		SetUploadyourOwnBackground.run("Choose File":params."Choose File", Action:"Add Image")
            		break
            	case "Generate Image":
            		SetGenerateAIImage.run("Text to Search":params."Generate Prompt", Action:"Add Image")
            		break
            	case "Search Photos":
            		SetPresetBackgroundImageintheHeader.run("Unsplash Image Text":params."Unsplash Image Text",
                                                        "Unpslash Image Number": params."Unpslash Image Number",
                                                        Action:"Add Image")
            	break  
            }
        }
        
        sleep(1000)
        if(params."Action"=="Save"){
            Click.run("ID Type":"By","By":EmailConfigurationsLocators.saveButton)
        }
        sleep(3000)
        if(params."Send Test Email"){
            Click.run("ID Type":"By","By":EmailConfigurationsLocators.sendTestEmailButton)
        }
    }
}