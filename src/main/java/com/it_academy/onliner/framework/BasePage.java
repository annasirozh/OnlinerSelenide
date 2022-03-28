package com.it_academy.onliner.framework;

import com.codeborne.selenide.Configuration;

public abstract class BasePage {

 public BasePage(){
    Configuration.browser=WebDriverDiscovery.class.getName();
     Configuration.pageLoadTimeout= 20000;
     Configuration.startMaximized = true;
 }

}
