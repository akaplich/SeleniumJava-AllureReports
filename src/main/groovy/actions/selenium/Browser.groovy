package actions.selenium

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver

import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.firefox.FirefoxDriverService;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.firefox.FirefoxBinary
import org.openqa.selenium.firefox.FirefoxProfile
import org.openqa.selenium.firefox.FirefoxOptions;

import org.openqa.selenium.ie.InternetExplorerDriver
import org.openqa.selenium.ie.InternetExplorerDriverService

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeDriverService

import org.openqa.selenium.remote.RemoteWebDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import utils.Settings

import java.awt.Robot
import java.awt.event.KeyEvent
import org.openqa.selenium.JavascriptExecutor
import actions.selenium.SendKeys
import org.openqa.selenium.Dimension
import org.openqa.selenium.Keys
import org.openqa.selenium.*
import org.openqa.selenium.chrome.*
import actions.selenium.utils.GetIPAddress

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

//import org.openqa.selenium.manager.SeleniumManager;

class Browser{

//test
    public static WebDriver Driver = null
    public static MainWinHandle = null
    private static final Logger logger = LoggerFactory.getLogger(Browser.class);

    //start browser
    public static void run(def params){
        // Clear the Selenium driver cache
        //WebDriver.clearDriverCache();
        //SeleniumManager.getInstance().clearDriverCache();

        System.setProperty("webdriver.chrome.verboseLogging", "true");

        def os = System.getProperty("os.name").toLowerCase();

        if (params."Browser Type" == "Chrome") {

            logger.debug("Downloading ChromeDriver");
            WebDriverManager.chromedriver().setup();

            ChromeOptions options = new ChromeOptions()
            options.addArguments(
                    "--ignore-ssl-errors=true",
                    "ignore-certificate-errors=false",
                    "--no-sandbox",
                    "--start-maximized",
                    "--disable-popup-blocking"
            )

            // See if we should run headless
            boolean isHeadless = Boolean.parseBoolean(System.getProperty("headless", "false"))
            if(isHeadless){
                options.addArguments(
                        "--headless",
                        "--disable-gpu"
                )
            }

            /* - Legacy Options, adding all of them results in a failure, adding them as needed
                    "--user-data-dir=/tmp/rwhq",
                    "--display=:10",
                    "--window-size=2560,1440",
                    "--enable-chrome-browser-cloud-management",
                    "--remote-debugging-port=9222",
                    "--enable-automation",
                    "--xkb",
                    "--noxrecord",
                    "--noxfixes",
                    "--noxdamage",
                    "--use-gl=swiftshader",
                    "--enable-logging",
                    "--log-file=/var/log/rwhq/chromium-debug.log",
                    "--skip-force-online-signin-for-testing",
             */



            if (params."Run Browser in Incognito" == "TRUE") {
                options.addArguments("--incognito")
                println("Incognito Mode")
            }

            // Legacy Prefs
            def prefs = [:]
            prefs.put("profile.exit_type", "Normal")
            prefs.put("safebrowsing.enabled", "true")
            prefs.put("credentials_enable_service", false)
            prefs.put("profile.password_manager_enabled", false)
            prefs.put("download.default_directory", "/root/Downloads")
            prefs.put("profile.default_content_setting_values.notifications", 1) // Allow notifications
            prefs.put("profile.default_content_setting_values.popups", 1)  // Allow pop-ups
            prefs.put("profile.default_content_setting_values.clipboard", true) // Added to enable paste from clipboard
            prefs.put("profile.default_content_setting_values.clipboard_read", true)
            prefs.put("profile.default_content_setting_values.clipboard_write", true)
            prefs.put("profile.content_settings.exceptions.clipboard", getClipBoardSettingsMap(1));
            options.setExperimentalOption("prefs", prefs)

            //prefs.put("enableTracing", false)
            if (params."Add BI Memo Review extension" == true) {
                String extensionFilePath = System.getProperty("user.home") + "\\Downloads\\meleppchnoelbgpcodloaeonnmmjikdd.crx"
                options.addExtensions(new File(extensionFilePath))
            }
            //options.setCapability("enableTracing", false);
           //options.setExperimentalOption("prefs", prefs)

            // Set driver using chromedriver or remotewebdriver depending on settings value
            if(Settings.getProperty("environment.target") == "local"){
                Driver = new ChromeDriver(options)
            }else if (Settings.getProperty("environment.target") == "docker"){
                Driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options)
            }

        }



        if (params.URL){
            if (params.URL.startsWith("http://") || params.URL.startsWith("https://")){
                Driver.get(params.URL)
            }
            else{
                Driver.get("http://"+params.URL)
            }

        }
        if(!os.contains("mac")){Driver.manage().window().maximize()}
        Driver.manage().timeouts().implicitlyWait(50, java.util.concurrent.TimeUnit.SECONDS)
        Driver.manage().timeouts().setScriptTimeout(60, java.util.concurrent.TimeUnit.SECONDS)
        MainWinHandle = Driver.getWindowHandle()

    }
    // Contructs the json needed to enable pasting from clipboard
    private static Map<String,Object> getClipBoardSettingsMap(int settingValue) throws JsonProcessingException {
        Map<String,Object> map = new HashMap<>();
        map.put("last_modified",String.valueOf(System.currentTimeMillis()));
        map.put("setting", settingValue);
        Map<String,Object> cbPreference = new HashMap<>();
        cbPreference.put("[*.],*",map);
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(cbPreference);
        return cbPreference;
    }
}