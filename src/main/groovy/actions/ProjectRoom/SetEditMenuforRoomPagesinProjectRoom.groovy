package actions.ProjectRoom;

import actions.selenium.*

class SetEditMenuforRoomPagesinProjectRoom{
    public void run(def params){
        
         if(params."Room Page"){
            if(params."Parent Folder Name if the Folder to edit Page is Child Folder"){
            	SetFocus.run(ID:"//*[contains(@class,'f-rooms-item-wrapper')]//*[text()='${params."Parent Folder Name if the Folder to edit Page is Child Folder"}']/../../../..//*[contains(@class,'f-rooms-folder-dropzone')]/LI[${params."Placement Number Of Folder or Page"}]//*[text()='${params."Room Page"}']/../..")
                Click.run(ID:"//*[contains(@class,'f-rooms-edit')]")
            } else {
                MouseOver.run(ID:"//LI[contains(@class,'f-room-item')][${params."Placement Number Of Folder or Page"}]//*[text()='${params."Room Page"}']/../..")
                //SetFocus.run(ID:"//LI[contains(@class,'f-room-item')][${params."Placement Number Of Folder or Page"}]//*[text()='${params."Room Page"}']/../..")
                sleep(1000)
            	Click.run(ID:"//*[contains(@class,'f-rooms-edit')]")
            }
         }
        if(params."Menu Options"){
            Click.run(ID:"//*[contains(@class,'edit-menu')]//*[text()='${params."Menu Options"}']/..")
        }   
        if(params."Menu Options" == "Add to My Favorites"){
            Refresh.run()
        } 
    }
}