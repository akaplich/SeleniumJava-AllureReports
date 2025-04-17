package screens.People;

import org.openqa.selenium.By

class UserDetails{
    
    public static By removeAllUsers = By.xpath("//DIV[@data-test='f-test-idea-page-Dropdown-links']")
    public static By removeDropdownOption = By.xpath("//DIV[@class='f-admin-dropdown-options']/..")
    public static By confirmCheckbox = By.xpath("//*[contains(@class,'f-confirm-warning-model-checkbox')]//INPUT/..")
    public static By getRoleAndLicense(String role, String area){
        return By.xpath("//*[contains(@class,'f-administrators-column-left') and text()='${role}']/../*[contains(@class,'f-administrators-column-right')]//A[text()='${area}']")
    }
}