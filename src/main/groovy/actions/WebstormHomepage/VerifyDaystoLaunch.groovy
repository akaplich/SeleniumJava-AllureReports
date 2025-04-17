package actions.WebstormHomepage;

import actions.selenium.*

class VerifyDaystoLaunch{
    public void run(def params){
       
        sleep(2000)
        VerifyText.run(ID:"//*[@id='days-left']",Text:params."Days")
        VerifyText.run(ID:"//*[@id='hours-left']",Text:params."Hours")
        VerifyText.run(ID:"//*[@id='minutes-left']",Text:params."Minutes")
        VerifyText.run(ID:"//*[@id='seconds-left']",Text:params."Seconds")

    }
}