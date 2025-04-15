package screens.common;

import org.openqa.selenium.By

class ModalButtonLocators{
    
    // Static class-level variables
    static By saveButton
    static By cancelButton
    static By confirmOKButton
    static By confirmCancelButton
    static By closeButton
    static By closeOnModalButton
    public static By actionOnModal = By.xpath("//*[contains(@class,'ui-draggable ui-draggable-handle') and not(contains(@style,'display: none'))]//*[contains(@class,'green_btn_center')]")
    public static By cancelOnModal = By.xpath("//*[contains(@class,'ui-draggable ui-draggable-handle') and not(contains(@style,'display: none'))]//*[contains(@class,'bimodal-secondary')]")
    
     public static void run(def params) {
      
        saveButton = By.xpath("//*[contains(@data-test,'modal-footer-submit')]")
        cancelButton = By.xpath("//*[contains(@data-test,'modal-footer-cancel')]")
        confirmOKButton = By.xpath("//*[contains(@id,'clickToConfirmOkButton')]")
        confirmCancelButton = By.xpath("//*[contains(@id,'clickToConfirmCancelButton')]")
        closeButton = By.xpath("//BUTTON[contains(@class,'close-button')]")
        closeOnModalButton  = By.xpath("//*[contains(@data-tooltip-id,'close')]")
        closeOnModalButton  = By.xpath("//*[contains(@data-tooltip-id,'close')]")
     }
}