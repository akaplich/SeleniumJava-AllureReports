package actions.selenium;

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

    //start browser
    public static void run(def params){
        // Clear the Selenium driver cache
        //WebDriver.clearDriverCache();
        //SeleniumManager.getInstance().clearDriverCache();

        System.setProperty("webdriver.chrome.verboseLogging", "true");

        def os = System.getProperty("os.name").toLowerCase();
        def agentIp = GetIPAddress.run()."Agent IP"

        sleep(1000)
        if (params."Browser Type" == "Firefox"){
            File geckodriver = new File("geckodriver")
            geckodriver.setExecutable(true)
            System.setProperty(GeckoDriverService.GECKO_DRIVER_EXE_PROPERTY, "geckodriver");
            FirefoxOptions options = new FirefoxOptions();

            options.setBinary("/usr/bin/firefox")
            options.addArguments(
                    "--no-sandbox",
                    "--user-data-dir=/tmp/rwhq",
                    "--display=:10",
                    "--window-size=2560,1440",
                    //"--disable-setuid-sandbox",
                    "--enable-chrome-browser-cloud-management",
                    "--remote-debugging-port=9222",
                    "--start-maximized",
                    //"--disable-infobars",
                    "--enable-automation",
                    "--xkb",
                    "--noxrecord",
                    "--noxfixes",
                    "--noxdamage",
                    "--use-gl=swiftshader",
                    "--enable-logging",
                    "--log-file=/var/log/rwhq/chromium-debug.log",
                    "--skip-force-online-signin-for-testing"
            )
            Driver = new FirefoxDriver()

        }
        else if (params."Browser Type" == "Chrome"){
            def service
            if(os.contains("nix") || os.contains("nux")||os.contains("aix")){ //going here if we are on linux agent
                //for Chrome 131
                File chromedriver
                if(agentIp == "13.0.2.170" |
                        agentIp == "13.0.2.109" |
                        agentIp == "13.0.2.143" |
                        agentIp == "13.0.2.160" |
                        agentIp == "13.0.2.225" |
                        agentIp == "13.0.2.130" |
                        agentIp == "13.0.2.171" |
                        agentIp == "13.0.2.196" |
                        agentIp == "13.0.2.150" |
                        agentIp == "13.0.2.230"){
                    chromedriver = new File("chromedriver131.exe")
                }else if(agentIp == "13.0.2.81"){
                    chromedriver = new File("chromedriver134.exe")
                }else{
                    chromedriver = new File("chromedriver124.exe")
                }
                //File chromedriver = new File("chromedriver124.exe")
                //File chromedriver = new File("chromedriver131.exe")
                if(!chromedriver.exists()){
                    assert false, "Please upload proper linux chromedriver file to bin directory under scripts tab."
                }
                chromedriver.setExecutable(true)
                service = new ChromeDriverService.Builder().withVerbose(false).withWhitelistedIps("13.0.2.69").usingPort(9518).usingDriverExecutable(chromedriver).build()
            }
            else if(os.contains("mac")){
                //File chromedriver = new File("chromedriverMac")
                File chromedriver = new File("/Users/Brightidea/Documents/chromedriver_Mac_135.0.7049.84")
                chromedriver.setExecutable(true)
                service = new ChromeDriverService.Builder().usingPort(9518).usingDriverExecutable(chromedriver).build()
            }
            else{
                service = new ChromeDriverService.Builder().usingPort(9518).usingDriverExecutable(new File("chromedriver119.exe")).build()
            }
            service.start()

            ChromeOptions options = new ChromeOptions()
            if(os.contains("mac")){
                //options.setBinary("/autobrowsers/browser.app/Contents/MacOS/Google Chrome")
                options.setBinary("/Applications/Google Chrome.app/Contents/MacOS")
            } else if (os.contains("nix") || os.contains("nux")||os.contains("aix")){
                options.setBinary("/usr/bin/chromium-browser")
                options.addArguments(
                        "--no-sandbox",
                        "--user-data-dir=/tmp/rwhq",
                        "--display=:10",
                        "--window-size=2560,1440",
                        "--enable-chrome-browser-cloud-management",
                        "--remote-debugging-port=9222",
                        "--start-maximized",
                        "--enable-automation",
                        "--xkb",
                        "--noxrecord",
                        "--noxfixes",
                        "--noxdamage",
                        "--use-gl=swiftshader",
                        "--enable-logging",
                        "--log-file=/var/log/rwhq/chromium-debug.log",
                        "--skip-force-online-signin-for-testing",
                        "--disable-popup-blocking"
                        //"--user-data-dir=/tmp/rwhq/logs",
                        //"--disable-extensions",
                        //"--disable-gpu",
                        //"--enable-gpu",
                        //"--disable-infobars",
                        //"--disable-setuid-sandbox",
                        //"--disable-notifications",
                        //"----disable-popup-window",
                        //"--incognito"
                )
                if(params."Run Browser in Incognito"=="TRUE"){
                    options.addArguments("--incognito")
                    println("Incognito Mode")
                }
            } else {
                options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe")
            }

            def prefs = [:]
            prefs.put("profile.exit_type", "Normal")
            prefs.put("safebrowsing.enabled", "true")
            prefs.put("credentials_enable_service", false)
            prefs.put("profile.password_manager_enabled", false)
            prefs.put("download.default_directory", "/root/Downloads")
            prefs.put("profile.default_content_setting_values.notifications", 1) // Allow notifications
            prefs.put("profile.default_content_setting_values.popups", 1 )  // Allow pop-ups
            prefs.put("profile.default_content_setting_values.clipboard", true) // Added to enable paste from clipboard
            prefs.put("profile.default_content_setting_values.clipboard_read", true)
            prefs.put("profile.default_content_setting_values.clipboard_write", true)
            prefs.put("profile.content_settings.exceptions.clipboard", getClipBoardSettingsMap(1));

            //prefs.put("enableTracing", false)
            if(params."Add BI Memo Review extension"==true){
                String extensionFilePath = System.getProperty("user.home")+"\\Downloads\\meleppchnoelbgpcodloaeonnmmjikdd.crx"
                options.addExtensions(new File(extensionFilePath))
            }
            //options.setCapability("enableTracing", false);
            options.setExperimentalOption("prefs", prefs)

            //capabilities.setCapability(ChromeOptions.CAPABILITY, options)
            //Driver = new RemoteWebDriver(service.getUrl(),capabilities)

            if(Settings.getProperty("environment.target") == "local"){
                Driver = new ChromeDriver(options)
            }else{
                Driver = new RemoteWebDriver(service.getUrl(),options)
            }



            //Driver = new RemoteWebDriver(service.getUrl(),DesiredCapabilities.chrome())
            /*DesiredCapabilities capabilities = DesiredCapabilities.chrome()
            ChromeOptions options = new ChromeOptions()
            if(os.contains("nix") || os.contains("nux")||os.contains("aix")||os.contains("mac")){options.addArguments("--kiosk")}
            else{options.addArguments("--start-maximized")}
            def prefs = [:]
            prefs.put("credentials_enable_service", false);
            prefs.put("profile.password_manager_enabled", false);
            options.setExperimentalOption("prefs", prefs);
            capabilities.setCapability(ChromeOptions.CAPABILITY, options)
            Driver = new RemoteWebDriver(service.getUrl(),capabilities)*/
        }
        else{
            def serviceIE = new InternetExplorerDriverService.Builder().usingPort(9516).usingDriverExecutable(new File("IEDriverServer.exe")).build()
            serviceIE.start()
            DesiredCapabilities d = DesiredCapabilities.internetExplorer()
            d.setCapability("nativeEvents", false)
            d.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);

            Driver = new RemoteWebDriver(serviceIE.getUrl(),d)

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