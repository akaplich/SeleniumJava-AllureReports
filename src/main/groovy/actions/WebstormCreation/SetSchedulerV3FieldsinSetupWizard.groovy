package actions.WebstormCreation;

import actions.selenium.utils.Elements
import actions.selenium.Browser
import org.openqa.selenium.WebElement
import screens.SetupWizard.WizardLocators
import actions.selenium.SelectItem
import actions.selenium.*

class SetSchedulerV3FieldsinSetupWizard{
    public static void run(def params){
        def fieldTitle	
        def numberOfPhasesInScheduler = 6			//update if number of params for the fiels is more than 6
        
        for (int i = 1; i <= numberOfPhasesInScheduler; i++) {			// get fields titles so we can get the webelements
            if(params."Phase ${i} Title"){
                fieldTitle = params."Phase ${i} Title"
                //get weblement locators 
                def phaseGroupElementsBy = WizardLocators.getSchedulerPhaseGroup(fieldTitle)
                
                //locate and populate Dates and Times
                //start Date
                def startDate = params."Phase ${i} (Start Date, Start Time, End Date, End Time)".split(",")[0].trim()
                SetText.run("ID Type":"By", By:phaseGroupElementsBy[0], Text:startDate) //start date

                //start Time
                def startTime = params."Phase ${i} (Start Date, Start Time, End Date, End Time)".split(",")[1].trim()
                Click.run("ID Type":"By", By:phaseGroupElementsBy[1])
                SelectItem.run("ID Type":"By", By:phaseGroupElementsBy[1], "Visible Text":startTime)

                //end Date
                def endDate = params."Phase ${i} (Start Date, Start Time, End Date, End Time)".split(",")[2].trim()
                SetText.run("ID Type":"By", By:phaseGroupElementsBy[2], Text:endDate) //start date

                //end Time
                def endTime = params."Phase ${i} (Start Date, Start Time, End Date, End Time)".split(",")[3].trim()
                Click.run("ID Type":"By", By:phaseGroupElementsBy[3])
                SelectItem.run("ID Type":"By", By:phaseGroupElementsBy[3], "Visible Text":endTime)
        	}
            //println("i = ${i}")
        } 
    }
}