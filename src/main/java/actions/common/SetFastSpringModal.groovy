package actions.common;

import actions.selenium.SetText
import actions.selenium.Click
import actions.selenium.*
    
class SetFastSpringModal{
    public void run(def params){
        
        sleep(5000)
        SwitchToFrame.run(ID:"//iframe[@id='fsc-popup-frame']")
        SetText.run(ID:"//*[@id='contact-first-name']",Text:"Test")
        SetText.run(ID:"//*[@id='contact-last-name']",Text:"User")
        SetText.run(ID:"//*[@id='contact-company']",Text:"Brightidea")
        SetText.run(ID:"//*[@id='card-number']",Text:params."Card Number")
        SetText.run(ID:"//*[@id='card-expire-month']",Text:"12")
        SetText.run(ID:"//*[@id='card-expire-year']",Text:"50")
        SetText.run(ID:"//*[@id='card-security']",Text:"*B3MF")
        SetText.run(ID:"//*[@id='postal']",Text:"95133")
        Click.run(ID:"//*[contains(@class,'btn pay-button ng-binding ng-scope')]")
        sleep(2000)
        Click.run(ID:"//*[contains(@class,'btn btn-primary continue-button full-width ng-binding ng-scope')]")
        sleep(2000)
        SwitchToDefaultContent.run()
    }
}