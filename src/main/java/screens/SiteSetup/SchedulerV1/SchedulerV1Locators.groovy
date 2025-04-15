package screens.SiteSetup.SchedulerV1;

import org.openqa.selenium.By

class SchedulerV1Locators{
        
        public static By status(String status) {
            return By.xpath("//*[@id='scheduling_content']//*[@id='calendar']//*[@id='scheduler-header-left']//*[@id='scheduler-webstorm-status-wrapper' and contains(.,'Status: " + status + "')]")
    	}
        
        public static By activeStartAndEndDate(String activeStartAndEndDate) {
            activeStartAndEndDate = activeStartAndEndDate.replaceAll("\\s+", "")
            
            //return By.xpath("//*[@class='fc-content']//SPAN[@class='fc-event-title' and contains(text(),'Jan 15')]")
                
            return By.xpath("//*[@class='fc-content']//SPAN[@class='fc-event-title' and contains(translate(text(), ' ', ''),'${activeStartAndEndDate}')]")
        }
        
        public static By tooltip(String tooltip) {
        	return By.xpath("//*[contains(@id,'tiptip_holder_white') and contains(@style,'display: block') and contains(normalize-space(.), '${tooltip}')]")
    	}
}