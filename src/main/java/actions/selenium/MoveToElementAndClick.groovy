package actions.selenium;

import actions.selenium.utils.Elements
import actions.selenium.Browser
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions

class MoveToElementAndClick{
     public static void run(def params){
         
        //Unlike Click this will not check for if the element is displayed
        WebElement element = Elements.find(params,Browser.Driver)
        //new Actions(Browser.Driver).moveToElement(element).click().perform()
        def size = element.getSize();
        int halfWidth = size.width/2
        int halfHeight = (size.height/2)*(-1)
        //println("In move to element")
        //println("halfHeight: ${halfHeight}")
        new Actions(Browser.Driver).moveToElement(element, halfWidth, halfHeight).click().perform()
    }
}