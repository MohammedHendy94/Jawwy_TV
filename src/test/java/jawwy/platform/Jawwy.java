package jawwy.platform;

import jawwy.driver.DriverSingleton;
import jawwy.pages.HomePage;

public class Jawwy {


    public HomePage homePage;

    public Jawwy(){
        homePage = new HomePage();
    }
}
