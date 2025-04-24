package actions.selenium
import actions.selenium.Browser

class CloseWindow{
    public static void run(def params){
        if (Browser.Driver != null) {
            Browser.Driver.quit(); // Ensure the WebDriver quits
        }
    }
}