package actions.PipelineList;

import actions.selenium.Click
import screens.common.ModalButtonLocators


class ExportIdeasfromPipelineListView{
    public void run(def params){
        Click.run(ID:"//*[starts-with(@id,'report')]/I[contains(@class,'fa fa-file-excel-o')]")
        
        //confirm export to email using 'Async Export List View'
        if (params."Async Export Dialog Button" == "Export"){
            println("Clicking Export")
        	//Click.run(ID:"//*[contains(@class, 'green_btn_center') and contains(text(), 'Export')]")
            Click.run("ID Type":"By", By:ModalButtonLocators.actionOnModal) 
            sleep(5000)
    	}else if (params."Async Export Dialog Button" == "Cancel"){
            println("Clicking Cancel")
            //Click.run(ID:"//*[contains(@class, 'bimodal-secondary') and contains(text(), 'Cancel')]")
            Click.run("ID Type":"By", By:ModalButtonLocators.cancelOnModal) 
            sleep(5000)
        }
    }
}