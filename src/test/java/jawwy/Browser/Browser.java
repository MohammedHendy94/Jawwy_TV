package jawwy.Browser;

import jawwy.driver.DriverSingleton;
import jawwy.platform.Jawwy;

public class Browser {

    private final DriverSingleton driverSingleton =  DriverSingleton.setDriverSingleTon();

    public Jawwy jawwy;

public Browser(){
    jawwy = new Jawwy();
}


}
