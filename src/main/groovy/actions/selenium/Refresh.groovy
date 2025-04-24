package actions.selenium

import actions.selenium.Browser
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class Refresh{
  private static final Logger logger = LoggerFactory.getLogger(Refresh.class);

  public static void run(def params){
    logger.debug("Refreshing...")
    Browser.Driver.navigate().refresh()
    sleep(5000)
  }
}