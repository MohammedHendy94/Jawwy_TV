package jawwy.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverSingleton {

 private static WebDriver webDriver;
 private static DriverSingleton driverSingleton = null;

    private DriverSingleton (){setChromeDriver(); }

    public static DriverSingleton setDriverSingleTon(){
        if (driverSingleton == null)
            driverSingleton = new DriverSingleton();
        return driverSingleton;
    }

    private void setChromeDriver(){
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
         WebDriverManager.chromedriver().setup();
         webDriver = new ChromeDriver(option);
         webDriver.manage().window().maximize();
    }

    public static WebDriver getWebDriver (){
        return webDriver;
    }

}
