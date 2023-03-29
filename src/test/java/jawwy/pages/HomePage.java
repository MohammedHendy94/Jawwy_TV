package jawwy.pages;

import org.openqa.selenium.By;

public class HomePage extends PageBase{

   private static By LanguageButton = By.id("translation-btn");
   private static By LITEpackageType = By.xpath("(//strong[@class ='plan-title'])[1]");
    private static By CLASSICpackageType = By.xpath("(//strong[@class ='plan-title'])[2]");
    private static By PREMIUMpackageType = By.xpath("(//strong[@class ='plan-title'])[3]");
    private static By LitePriceTxt = By.xpath("(//div[@class ='price'])[1]");
   private static By CLASSICPriceTxt = By.xpath("(//div[@class ='price'])[2]");
   private static By PREMIUMPriceTxt = By.xpath("(//div[@class ='price'])[3]");
    private static By countryLabel = By.xpath("//div[@class='country-current']");
    private static By UAELabel = By.id("ae-contry-lable");
    private static By AlgeriaLabel = By.id("dz-contry-lable");
    private static By PalestineLabel = By.id("ps-contry-lable");





    public void changeSiteLanguage(){
        clickOnElement(LanguageButton);
    }

    public void showSiteCountries(){
        clickOnElement(countryLabel);
    }

    public void chooseCountry(String country){
        switch (country){
            case "UAE":
                clickElementByActions(UAELabel);
                break;
            case "Algeria":
                clickElementByActions(AlgeriaLabel);
                break;
            case "Palestine":
                clickElementByActions(PalestineLabel);
                break;
        }
    }

   public void openJawwyHomePage(String url){
       navigateToUrl(url);
   }

   public String getPackageTiltle(String packageType) {
       switch (packageType) {
           case "LITE":
               return getTextFromElement(LITEpackageType);
           case "CLASSIC":
               return getTextFromElement(CLASSICpackageType);
           case "PREMIUM":
               return getTextFromElement(PREMIUMpackageType);
       }
       return null;
   }

    public String getPackagePrice(String packageType) {
        switch (getPackageTiltle(packageType)) {
            case "LITE":
                return getTextFromElement(LitePriceTxt);
            case "CLASSIC":
                return getTextFromElement(CLASSICPriceTxt);
            case "PREMIUM":
                return getTextFromElement(PREMIUMPriceTxt);
        }
        return null;
    }

}