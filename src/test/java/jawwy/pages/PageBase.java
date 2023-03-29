package jawwy.pages;

import jawwy.driver.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;


public class PageBase {

    static WebDriver webDriver = DriverSingleton.getWebDriver();
    public Actions actions;
    public WebDriverWait wait;
    public PageBase(){
        actions = new Actions(webDriver);
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(15));
    }


    public String getTextFromElement(By element){
        return webDriver.findElement(element).getText();
    }

    public void clickOnElement(By element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        webDriver.findElement(element).click();
    }
    public void navigateToUrl(String url){
        webDriver.navigate().to(url);
    }
    public WebElement getWebElement(By element){return webDriver.findElement(element);}
    public void clickElementByActions(By element){
        WebElement wElement =getWebElement(element);
        actions.moveToElement(wElement).click().build().perform();
    }

}
