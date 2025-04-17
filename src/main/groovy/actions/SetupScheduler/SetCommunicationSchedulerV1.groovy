package actions.SetupScheduler;

import actions.selenium.SelectItem
import actions.selenium.utils.Elements
import actions.selenium.Browser
import actions.selenium.Click
import org.openqa.selenium.WebElement
import org.openqa.selenium.JavascriptExecutor

class SetCommunicationSchedulerV1{
    public void run(def params){
        Click.run(ID:"//*[@id='btnAddCommunication']")
        
        if(params."Communication Type"){
            SelectItem.run(ID:"//*[@id='schedule_communication_type']", "Visible Text":params."Communication Type")
        }
        if(params."Newsletter Template"){
            SelectItem.run(ID:"//*[@id='schedule_communication_title_newsletter']", "Visible Text":params."Newsletter Template")
        }
        if(params."Send Date"){
            Click.run(ID:"//*[@id='schedule_communication_send_date']")
			WebElement inputEnd = Elements.find(ID:"//*[@id='schedule_communication_send_date']",Browser.Driver)       
            JavascriptExecutor jsEnd = (JavascriptExecutor) Browser.Driver;
            jsEnd.executeScript("arguments[0].setAttribute('value', arguments[1]);", inputEnd, params."Send Date");
            jsEnd.executeScript("arguments[0].dispatchEvent(new Event('change'));", inputEnd);
        }
        if(params."Send Time"){
            SelectItem.run(ID:"//*[@id='schedule_communication_send_time']", "Visible Text":params."Send Time")
        }
        sleep(5000)
        if(params.Action=="Save Schedule"){
            Click.run(ID:"//*[@id='bi-modal-button']")
        }
        if(params.Action=="Cancel"){
            Click.run(ID:"//A[@class='bimodal-secondary']")
        }
    }
}