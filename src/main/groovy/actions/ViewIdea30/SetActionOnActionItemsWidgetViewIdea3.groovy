package actions.ViewIdea30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement
//import screens.ViewIdea3.WidgetLocatorsViewIdea3


class SetActionOnActionItemsWidgetViewIdea3{
    
    WebElement widget, callToAction
    
    public void run(def params){
        
        widget = Elements.find("ID Type":"By",By:WidgetLocatorsViewIdea3.getWidgetLocatorByTitle("Action Items"),Browser.Driver)

    }
    private void switchTab(String tab){
    	tab = widget.findElement(By.xpath("//*[contains(text(),'${tab}')]"))
    	tab.click()
   	}
    private void completeDevelopment(){
    	button = widget.findElement(By.xpath("//*[contains(text(),'Complete Development')]"))
        button.click()
    }
    private void completeSingleScale(){
            rating = widget.findElement(By.xpath("//*[contains(@class,'f-rating')]"))
    }

    
}