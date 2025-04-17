package screens;
import org.openqa.selenium.By
import org.openqa.selenium.support.pagefactory.ByChained 

public class ViewIdea30Locators {  
    
   	public static By VI3Modal = By.xpath("//*[contains(@class, 'ReactModal__Content ReactModal__Content--after-open')]")

    // Header
    public static By header_Title = new ByChained(VI3Modal, By.xpath("//*[contains(@class, 'f-static-title')]"));
    public static By header_IdeaCodeInTitle = By.xpath("//*[contains(@class, 'ReactModal__Content ReactModal__Content--after-open')]//*[contains(@class, 'f-static-title')]//a")
    public static By header_IdeaCode = By.xpath("//*[contains(@class, 'ReactModal__Content ReactModal__Content--after-open')]//*[contains(@class, 'fractal-modal-header ')]//*[contains(@class, 'title')]//a")
	public static By header_IdeaImage = By.xpath("//*[contains(@class, 'ReactModal__Content ReactModal__Content--after-open')]//*[contains(@class, 'f-idea-image ')]")
    public static By header_PromoteButton = By.xpath("//*[contains(@class, 'ReactModal__Content ReactModal__Content--after-open')]//BUTTON[contains(@class,'f-promote-btn')]")
	public static By header_ViewVotersLink = By.xpath("//*[contains(@class, 'ReactModal__Content ReactModal__Content--after-open')]//*[contains(@class,'f-votes-btn-link')][text()='View Voters']")
	public static By header_IdeaDropdown = By.xpath("//*[contains(@class, 'ReactModal__Content ReactModal__Content--after-open')]//*[contains(@class, 'f-idea-dropdown')]//*[contains(@class, 'f-dropdown-btn fractal-button')]")
    public static By header_FavoriteSelector = new ByChained(VI3Modal, By.xpath("//*[contains(@class, 'f-idea-favorite')]"));
    public static By ideaDescription = By.xpath("//DIV[@id='f-edit-description']")
    public static By ideaDescriptionTextedit = By.xpath("//*[contains(@class,'redactor-in')]")
	public static By header_closebutton = new ByChained(VI3Modal, By.xpath("//*[@class='close-button']"));
    
    
    //Submission Form Questions:
    //Title
    public static By getSubFormQuestionByTitle(String questionTitle){
       return By.xpath("//*[contains(@class,'f-component-title') and contains(.,'${questionTitle}')]") 
    }    
    //Answer Field (Click to edit)
    public static By getSubFormQuestionAnswerByTitle(String questionTitle){
        return new ByChained(getSubFormQuestionByTitle(questionTitle), By.xpath("./../..//*[contains(@class,'fractal-htmlpreview')]"))
    }
    //Pencil Icon
    public static By getSubFormQuestionEditIconByTitle(String questionTitle){
        return new ByChained(getSubFormQuestionByTitle(questionTitle), By.xpath("./../..//*[@class='far fa-pencil']"))
    }
    //Text area for text fields
    public static By getSubFormQuestionTextareaByTitle(String questionTitle){
        return new ByChained(getSubFormQuestionByTitle(questionTitle), By.xpath("./../..//*[contains(@id,'edit') or contains(@class,'redactor-in')]"))
    }
     //error field
    public static By getErrorFieldByTitle(String questionTitle){
    	return new ByChained(getSubFormQuestionByTitle(questionTitle), By.xpath("./../..//*[contains(@class,'f-answer-error')]"))
    }
      
    // Whiteboard Widget
    public static By header_CanvasName = By.xpath("//*[contains(@class, 'f-canvas-name')]")

    // Team Workspace Widget
    public static By createTeamWorkspaceButton = By.xpath("//*[contains(@class,'f-create-workspace-btn')]")
    public static By teamWorkspaceButton = By.xpath("//a[.='View Workspace']")

    
    
    //********************************************************************************************************************************
    
    // Constructor to initialize the driver and instantiate elements
    public ViewIdea30Locators() {
    }
    
}    