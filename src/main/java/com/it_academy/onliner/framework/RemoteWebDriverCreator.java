package com.it_academy.onliner.framework;

import com.codeborne.selenide.WebDriverProvider;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;

public class RemoteWebDriverCreator implements WebDriverProvider {

    @Override
    public RemoteWebDriver createDriver(@Nonnull DesiredCapabilities desiredCapabilities){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        String driverType = System.getProperty("driverType");
        capabilities.setBrowserName(driverType);
        capabilities.setCapability("os","Windows");
        capabilities.setCapability("os_version","10");
        return new RemoteWebDriver(getGridUrl(), capabilities);
    }

    private URL getGridUrl(){
        try {
            return new URL(System.getProperty("gridUrl"));
        } catch (MalformedURLException e) {
            throw new IllegalStateException(e.getMessage(),e);
        }
    }
}
