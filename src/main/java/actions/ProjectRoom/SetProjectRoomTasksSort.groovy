package actions.ProjectRoom;

import actions.selenium.Click
import actions.selenium.SetFocus

class SetProjectRoomTasksSort{
    public void run(def params){
        
        SetFocus.run(ID:"//*[contains(@class,'f-table-header-sortable')]//*[text()='${params."Column To Sort"}']/..")
        Click.run(ID:"//*[contains(@class,'f-table-header-sortable')]//*[text()='${params."Column To Sort"}']/..//I")
        
    }
}