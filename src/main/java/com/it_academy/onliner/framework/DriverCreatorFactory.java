package com.it_academy.onliner.framework;

public final class DriverCreatorFactory {

    public static WebDriverCreator getDriverCreator(String driverType){
        switch(driverType){
            case "chrome":
                return new ChromeDriverCreator();
            case "firefox":
                return new FireFoxDriverCreator();
            default:
                return new ChromeDriverCreator();
        }
    }

}
