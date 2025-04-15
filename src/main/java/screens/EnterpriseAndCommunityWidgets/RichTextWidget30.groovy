package screens.EnterpriseAndCommunityWidgets;

import org.openqa.selenium.By

class RichTextWidget30{
    	//Header
        public static By titleTextbox = By.xpath("//input[contains(@id,'_title_edit')]")
        public static By menuTools = By.xpath("//button[contains(@class,'tox-mbtn tox-mbtn--select') and .='Tools']")
        public static By menuTools_SourceCode = By.xpath("//div[contains(@title,'Source code')]")
    
    	//SourceCode Dialog Box
        public static By sourceCode_Text = By.xpath("//textarea[contains(@class,'tox-textarea')]")
        public static By sourceCode_SaveButton = By.xpath("//button[contains(@class,'tox-button') and @title='Save']")
    
    	//Editor
        public static By editorIFrame = By.xpath("//iframe[contains(@id,'tiny-react_')]")



    // Constructor
    public RichTextWidget30(){
        
    }
    public static By getActionButton(String buttonName){
       return By.xpath("//div[contains(@class,'f-edit-tinymce-widget-action-btns')]//button[.='${buttonName}']") 
    }   
    public static By getWidgetEditButton(String widgetTitle){
       return By.xpath("//*[contains(@class,'widget_container rich_texthtml_widget widget_container_editing')]//*[@class='widget_title_text' and text()='${widgetTitle}']/../..//A[@class='widget_edit_icon']") 
    }   
    public static By getwidgetTitleTextNotEditable(String widgetTitle){
       return By.xpath("//*[contains(@class,'widget_title_text')][.='${widgetTitle}']") 
    } 
    public static By getwidgetBoxContentTextNotEditable(String text){
       return By.xpath("//*[contains(@class,'widget_container rich_texthtml_widget')]//div[@class='boxcontent']//*[text()='${text}']") 
    } 
}