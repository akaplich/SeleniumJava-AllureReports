package actions.Widgets;

import screens.EnterpriseAndCommunityWidgets.VisualLargeWebstormsListLocators
import actions.selenium.SetCheckBox
import actions.selenium.Click
import actions.selenium.utils.Elements
import actions.selenium.Browser
import org.openqa.selenium.interactions.Actions
import java.awt.Robot;	
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebElement
import actions.selenium.DragAndDrop

class SetVisualWebstormListLarge{
    public void run(def params){
		Click.run("ID Type":"By",By:VisualLargeWebstormsListLocators.getWidgetSetEditIconLocatorByName(params."Widget Name"),"Type of Click":"Javascript")
        SetCheckBox.run("ID Type":"By",By:VisualLargeWebstormsListLocators.showPhaseCheckboxLocator,Check:params."Show Phases")
        if (params."WebStorms from List"){
            params."WebStorms from List".split(",").eachWithIndex{ pipeline, x ->
                SetCheckBox.run(ID:"//*[@class='vwl-edit-view-ws-title' and text()='${pipeline}']/..//DIV/INPUT[@id='vwl-show-from-list-checkbox']",Check:params."WebStorm Checkbox Check".split(",")[x].toBoolean())
            }
        }
        
       if (params."Initiative to Drag"){
            DragAndDrop.run("From ID Type":"By",
                            "From ID":VisualLargeWebstormsListLocators.getInitiativeHandleLocatorByName(params."Initiative to Drag"), 
                            "To ID Type":"By",
                            "To ID":VisualLargeWebstormsListLocators.getRowLocator(params."New Row Number of the Initiative"), "Type of Drag and Drop":"Dragging") 

       }
		Click.run("ID Type":"By",By:VisualLargeWebstormsListLocators.getWidgetCloseEditIconLocatorByName(params."Widget Name"),"Type of Click":"Javascript")

    }
}