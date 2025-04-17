package actions.WebstormHomepage.HackathonOnboarding;

import actions.selenium.*

class VerifyJoinEventButton{
    public void run(def params){
        
        if(params."Button Displayed"==true){
            assert Exists.run(ID:"//*[@id='join_event_widget']//button[normalize-space()='${params."Button Text"}']")==1, "Error - Button is NOT displayed in Join Event Widget"
        } else if(params."Button Displayed"==false){
           assert Exists.run(ID:"//*[@id='join_event_widget']//button[normalize-space()='${params."Button Text"}']")==0, "Error - Button is displayed in Join Event Widget" 
        }        
    }
}