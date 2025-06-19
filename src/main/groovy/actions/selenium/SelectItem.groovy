package actions.selenium;


import actions.selenium.utils.Elements
import actions.selenium.Browser
import actions.selenium.Click
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select

class SelectItem{

    public static void run(def params){
        if(params."Visible Text"||params."Value"||params.Index){
            WebElement element = Elements.find(params,Browser.Driver)
            Select selectElement = new Select(element)

            if(params."Visible Text"){
                try {
                    def option = selectElement.getFirstSelectedOption()
                    String selectedLabel = option.getText()

                    // Only select if the current selection doesn't match
                    if (selectedLabel != params."Visible Text") {
                        selectElement.selectByVisibleText(params."Visible Text")
                    }
                } catch (Exception e) {
                    // If we can't get the selected option, just try to select
                    selectElement.selectByVisibleText(params."Visible Text")
                }
                /*//If failed to select an item (Firefox caused this issue), then try to select by clicks
                def option = new Select(element).getFirstSelectedOption()
                String selectedLabel = option.getText()
                if(selectedLabel!=params."Visible Text"){
                    Click.run(params)
                    Click.run(ID:params.ID+"//*[text()='${params."Visible Text"}']")
                }*/
            }
            else if(params."Value"){
                try {
                    def option = selectElement.getFirstSelectedOption()
                    String selectedValue = option.getAttribute("value")

                    if (selectedValue != params."Value") {
                        selectElement.selectByValue(params."Value")
                    }
                } catch (Exception e) {
                    selectElement.selectByValue(params."Value")
                }
            }
            else if (params.Index){
                new Select(element).selectByIndex(params.Index.toInteger())
            }
        }
    }
}