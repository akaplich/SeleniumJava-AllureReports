package screens.Apps;
import org.openqa.selenium.By;

public class AppsPillarLocators{

	 private static String appCardName(String appName) {
        return "//*[@class='app-card-name' and text()='" + appName + "']"
    }
    
 	public static By takeQuiz = By.xpath("//*[contains(@class,'fractal-button f-btn-sm f-btn-standard') and .='Take the Quiz']")
    public static By duplicateInitiative = By.xpath("//*[contains(@class,'f-btn-sm f-btn-standard f-btn-duplicate')]")
    public static By searchField = By.xpath("//*[contains(@id,'filter-search')]")
    public static By closeIconOnSearchField = By.xpath("//*[contains(@data-tooltip-id,'fractal-input-clear')]/I")
    public static By sortDropdown = By.xpath("//*[contains(@class,'f-products-order')]/*[@data-test='f-test-dropdown']")
    public static By filterDropdown = By.xpath("//*[contains(@class,'f-products-filter')]/*[@data-test='f-test-dropdown']")
	public static By clearFilter = By.xpath("//*[@class='filter-text']//A")
    public static By bookADemoModal = By.xpath("//*[contains(@class,'hbspt-form fractal-modal')]/FORM")
    
    public static By productNameDisabled(String name) {
        return By.xpath("//*[contains(@class,'f-filter-section')]/BUTTON[contains(@class,'f-tile-gray')]/H5[text()='" + name + "']")
    }
    
    public static By productName(String name) {
        return By.xpath("//*[contains(@class,'f-filter-section')]/BUTTON[not(contains(@class,'f-tile-gray'))]/H5[text()='" + name + "']")
    }
    
    public static By productIcon(String icon) {
        return By.xpath("./..//IMG[contains(@src,'" + icon + "')]")
    }
    
    public static By productDescription(String description) {
        return By.xpath("./..//P[contains(text(),'" + description + "')]")
    } 
    
    public static By productWithPlacementNumber(String name,String number) {
        return By.xpath("//*[contains(@class,'f-filter-section')]/BUTTON[" + number + "]/H5[text()='" + name + "']")
    }
    
    public static By sortOption(String name) {
        return By.xpath("//*[contains(@class,'f-dropdown-options') and contains(@style,'display: block')]//*[text()='" + name + "']")
    }
    
    public static By appNameForTileClick(String name) {
        return By.xpath(appCardName(name) + "/../..//*[contains(@class,'app-card-text')]")
    }
    
    public static By clickOnTileButtons(String name,String option) {
        return By.xpath(appCardName(name) + "/../../..//A[contains(@class,'f-btn-sm f-btn-subtle') and .='" + option + "']")
    }
    
    public static By appName(String productName,String appName) {
        return By.xpath("//*[contains(@class,'filter-text') and text()='" + productName + "']/../../.." + appCardName(appName))
    }
    
    public static By appIcon(String icon) {
        return By.xpath("./../../..//I[contains(@class,'" + icon + "')]")
    }
    
    public static By appDescription(String description) {
        return By.xpath("./../*[@class='app-card-subtitle' and text()='" + description + "']")
    } 
    
    public static By appLeftButton(String button) {
        return By.xpath("./../..//*[contains(@class,'f-btn-sm f-btn-subtle')and .='" + button + "'][1]")
    }
    
    public static By appRightButton(String button) {
        
        return By.xpath("./../..//A[contains(@class,'f-btn-sm f-btn-subtle') and text()='" + button + "']")
    }
    public static By appWithPlacementNumber(String productName,String appName,String number) {
        return By.xpath("//*[contains(@class,'filter-text') and text()='" + productName + "']/../../..//*[contains(@class,'backbone-link app-link')][" + number + "]" + appCardName(appName))
    }
    
    public static By appWithPlacementNumberWithoutProduct(String appName,String number) {
        return By.xpath("//*[contains(@class,'backbone-link app-link')][" + number + "]" + appCardName(appName) )
    }
    
    public static By appNameWithOutProductName(String appName) {
        return By.xpath(appCardName(appName))
    }
}