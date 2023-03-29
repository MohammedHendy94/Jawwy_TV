package jawwy.Bases;

import jawwy.Browser.Browser;
import jawwy.driver.DriverSingleton;

public class TestBase {

    protected static DriverSingleton driverSingleton;
    protected static Browser browser = new Browser();
    public TestBase(){
        driverSingleton=DriverSingleton.setDriverSingleTon();
    }
}
