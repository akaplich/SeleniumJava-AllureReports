package screens.SiteSetup;

import org.openqa.selenium.By

class DesignTabLocators{
    
    public static By saveButton = By.xpath("//BUTTON[contains(@id, 'site_design_save_button_top')]")

    //Banner
    public static By siteBannerHideInitiativeBanner = By.xpath("//input[@id='hide_webstrom_banner']")
    public static By siteBannerUploadImageInput = By.xpath("//input[@id='banner_image_input']")
    public static By siteBannerHTMLInitiativeBanner = By.xpath("//input[@id='banner_html_input']")
    public static By siteBannerHTMLInitiativeBannerCode = By.xpath("//textarea[@id='banner_html_code']")
    public static By siteBannerUploadImageIFrame = By.xpath("//iframe[@id='banner_image']")
    public static By siteBannerUploadImageUploadInput = By.xpath("//input[@name='uploaded_banner']")
    public static By siteBannerUploadImageSaveButton = By.xpath("//input[@id='save_uploaded_banner_input']")
   
    // Site Footer HTML
    public static By siteFooterHTMLText = By.xpath("//*[@id='footer_html']")

    // Custom Color & CSS
    public static By siteCustomCSSText = By.xpath("//textarea[@id='ws-design-custom-css']")
    public static By siteCustomCSSColorBodyBackground = By.xpath("//*[@id='css_attr_body_background']")
    public static By siteCustomCSSColorBannerBackground = By.xpath("//*[@id='css_attr_banner_background']")
    public static By siteCustomCSSColorFooterBackground = By.xpath("//*[@id='css_attr_footer_background']")
   
    
    
    // Constructor
    public DesignTabLocators(){
        
    }
}