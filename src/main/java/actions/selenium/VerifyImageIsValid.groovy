package actions.selenium;
import actions.selenium.utils.Elements
import actions.selenium.Browser
import org.openqa.selenium.WebElement

// This class is a work in progress
// At the moment I'm unable to get a property that contains the image url
// Issue isn't the highest priority so I've moved to other issues for now.

class VerifyImageIsValid{
    public void run(def params){
        if(params."Alt"){
            params."ID" = "//img[@alt='${params."Alt"}']"
        }
        WebElement element = Elements.find(params,Browser.Driver)
        println("Element: ${element}")
        //src = element.getAttribute("currentSrc")
        alt = element.getDomProperty("alt")
        println("Checking Img Alt: ${alt}")
        src = element.getDomProperty("src")

        println("Checking Img Src: ${src}")
        assert isImageBroken(src) == true, "Error, image ${alt} has an invalid url: ${src}"
    }
    
	// See https://tinyurl.com/45ybtnuc for more details on this method
    private boolean isImageBroken(String imageUrl) {
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(imageUrl).openConnection();
            connection.setRequestMethod("HEAD");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            connection.connect();

            int responseCode = connection.getResponseCode();
            return responseCode == 404 || responseCode >= 400; // Check for 404 and any 4xx or 5xx errors
        } catch (IOException e) {
            return true; // Treat any exception as a broken image
        }
    }
}