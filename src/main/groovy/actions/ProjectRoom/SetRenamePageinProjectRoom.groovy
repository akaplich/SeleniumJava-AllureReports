package actions.ProjectRoom;

import actions.selenium.*
import actions.selenium.SendKeyboardAction

class SetRenamePageinProjectRoom{
    public void run(def params){
        
         SetText.run(ID:"//*[contains(@class,'f-room-item')]//INPUT", Text:params."New Page Name", "Type of Clear":"Cut")
         if(params."Action"=="Cancel"){
            Click.run(ID:"//*[@data-test='modal-footer-cancel']")
        } else {
            SendKeyboardAction.run("Button":"ENTER")
//            Click.run(ID:"//*[@data-test='modal-footer-submit']/*[text()='${params."Action"}']")
            sleep(2000)
        }
    }
}