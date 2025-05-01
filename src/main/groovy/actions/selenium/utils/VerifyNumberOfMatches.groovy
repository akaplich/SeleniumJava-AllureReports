package actions.selenium.utils;

import actions.selenium.Exists
import actions.selenium.Browser
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.FluentWait
import org.openqa.selenium.WebElement
import actions.selenium.utils.Elements
import java.time.Duration

class VerifyNumberOfMatches{
    public static void run(def params){
        //Verifies number of matches of a specific element that exists
        //ID = xpath of an element (considered as parent element)
        //IDChildren (array)(optional) = xpaths of children that are associated with the parent (ID) to see if this whole object exists
        //Number of Matches (integer)(optional) = how many instances of that object is expected, if null this means any amount
        //Timeout (optional, integer) = How long to wait for before giving up, default timeout is 50 seconds
        //Is Displayed (optional) = false by default
        if(params.Timeout==null){params.Timeout=30}
        if(params."Is Displayed"){params."Is Displayed"=true}
        else{params."Is Displayed"=false}
        def parentElements = []
        def wait = new WebDriverWait(Browser.Driver, Duration.ofSeconds(params.Timeout))
       try {
            // Wait for at least one parent to exist
            wait.until {
                parentElements = Browser.Driver.findElements(By.xpath(params.ID))
                return parentElements.size() > 0
            }
        } catch (Exception e) {
            parentElements = []
        }

        def validMatches = 0

        parentElements.each { parent ->
            boolean allChildrenMatch = true

            if (params.IDChildren && params.IDChildren instanceof List) {
                for (childXPath in params.IDChildren) {
                    def children = parent.findElements(By.xpath(childXPath))
                    if (children.isEmpty()) {
                        allChildrenMatch = false
                        break
                    }
                }
            }

            if (allChildrenMatch) {
                validMatches++
            }
        }

        println("Valid Matches with all children: ${validMatches}")

        if (params."Number of Matches" != null) {
            assert validMatches == params."Number of Matches" : 
                "Error - Expected number of matches ${params."Number of Matches"} not found, actual valid matches found: ${validMatches}"
        } else {
            assert validMatches > 0 : "Error - Expected instance not found"
        }
    }
}