package TestCases

import io.github.bonigarcia.wdm.WebDriverManager
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstGroovyScriptTest {
    @Test
    public void main() {
        //System.setProperty("webdriver.chrome.driver", "/Users/Brightidea/Documents/chromedriver-mac-arm64/chromedriver");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}