package TestCases

import io.github.bonigarcia.wdm.WebDriverManager
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

import java.nio.file.Files
import java.nio.file.Path;

public class FirstGroovyScriptTest {
    @Test
    public void main() {
        //System.setProperty("webdriver.chrome.driver", "/Users/Brightidea/Documents/chromedriver-mac-arm64/chromedriver");
        WebDriverManager.chromedriver().setup();
        // Create a unique temporary directory for user data
        Path tempDir = Files.createTempDirectory("chrome-user-data");

        // Set Chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--user-data-dir=" + tempDir.toAbsolutePath().toString());

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}