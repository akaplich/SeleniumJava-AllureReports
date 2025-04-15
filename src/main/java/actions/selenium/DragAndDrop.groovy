package actions.selenium

import actions.selenium.utils.Elements
import org.openqa.selenium.JavascriptExecutor
import actions.selenium.Browser
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.By

class DragAndDrop{

    public static void run(def params){
        
        WebElement element
        WebElement target
        // Check if the ID Type is "By", then use the By locator directly
        if (params."From ID Type" == "By") {
            element = Browser.Driver.findElement(params."From ID")  // `params."From ID"` is a By object
        } else {
            element = Elements.find(["ID":params."From ID","ID Type":params."From ID Type"],Browser.Driver)
        }

        if (params."To ID Type" == "By") {
            target = Browser.Driver.findElement(params."To ID")  // `params."To ID"` is a By object
        } else {
            target = Elements.find(["ID":params."To ID","ID Type":params."To ID Type"],Browser.Driver)
        }
        Actions builder = new Actions(Browser.Driver)
        if(params."Type of Drag and Drop"=="Dragging"){
             builder.dragAndDrop(element,target);        
        } else{
             builder.clickAndHold(element);
        	 builder.moveToElement(target, 15, 5);
        	 builder.perform();
        	 sleep(1000)
        	 builder.release(element);            
         }
         builder.perform()
    }
}