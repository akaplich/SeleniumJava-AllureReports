package actions.Grid;

import actions.selenium.SetText
import actions.selenium.Click
import actions.selenium.SetCheckBox
import actions.selenium.utils.Elements
import org.openqa.selenium.JavascriptExecutor
import actions.selenium.Browser
import org.openqa.selenium.WebElement

class FilterGridColumn{
    public static void run(def params){
        if(params."Open Filter"==true | params."Open Filter" == null){
            println("Opening Filter...")
            Click.run(ID:"//TH/A[text()='${params."Column Name"}']/..//*[@class='fa fa-filter']","Type of Click":"Javascript")
        }
        sleep(1000)
        if(params."Filter Select All or Clear"){
            if(params."Filter Select All or Clear"=="Select All"){Click.run(ID:"//TH/A[text()='${params."Column Name"}']/..//*[@id='grid-filter-all-btn']")}
            else{
                println("Clicking Clear All")
                Click.run(ID:"//TH/A[text()='${params."Column Name"}']/..//*[@id='grid-filter-clear-btn']","Type of Click":"Javascript")            
            }
        }
        sleep(1000)
        println("Will type in '${params."Filter Search"}'")
        SetText.run(ID:"//TH/A[text()='${params."Column Name"}']/..//*[@id='grid-filter-search']",Text:params."Filter Search")
        sleep(1000)
        if(params."Value"){
            params."Value".split(",").eachWithIndex{ name, x ->
                println("Will check '${name}'")
                SetCheckBox.run(ID:"//TH/A[text()='${params."Column Name"}']/..//INPUT[@type='checkbox' and @value='${name}']",Check:params."Value Check".split(",")[x].toBoolean())
            }
        }
        if(params."Start Date"){
            String startDate = params."Start Date"
            WebElement dateInputStart = Elements.find(ID:"//TH/A[text()='${params."Column Name"}']/..//INPUT[contains(@id,'filter_start_date')]",Browser.Driver)
            //WebElement dateInputStart = Elements.find(ID:"//INPUT[contains(@id,'filter_start_date')]",Browser.Driver)
			JavascriptExecutor jsStart = (JavascriptExecutor) Browser.Driver;
            jsStart.executeScript("arguments[0].setAttribute('value', arguments[1]);", dateInputStart, startDate);
            jsStart.executeScript("arguments[0].dispatchEvent(new Event('change'));", dateInputStart);
            
        }
        if(params."End Date"){
            String endDate = params."End Date"
            WebElement dateInputEnd = Elements.find(ID:"//TH/A[text()='${params."Column Name"}']/..//INPUT[contains(@id,'filter_end_date')]",Browser.Driver)
			//WebElement dateInputEnd = Elements.find(ID:"//INPUT[contains(@id,'filter_end_date')]",Browser.Driver)
			JavascriptExecutor jsEnd = (JavascriptExecutor) Browser.Driver;
            jsEnd.executeScript("arguments[0].setAttribute('value', arguments[1]);", dateInputEnd, endDate);
            jsEnd.executeScript("arguments[0].dispatchEvent(new Event('change'));", dateInputEnd);
        }
        sleep(1000)
        if(params."Clear Keywords"==true){Click.run(ID:"//TH/A[text()='${params."Column Name"}']/..//*[@class='input-group-addon closeWrapper']/I")}
        if(params.Action=="Apply" || params.Action=="OK"){Click.run(ID:"//TH/A[text()='${params."Column Name"}']/..//*[@id='filter-btn-ok']","Type of Click":"Javascript")}
        else if(params.Action=="Cancel"){Click.run(ID:"//TH/A[text()='${params."Column Name"}']/..//*[@id='filter-btn-cancel']","Type of Click":"Javascript")}
    }
}