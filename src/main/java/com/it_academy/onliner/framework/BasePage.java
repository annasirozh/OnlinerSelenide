package com.it_academy.onliner.framework;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.open;


public abstract class BasePage {

 public BasePage(){
    Configuration.browser=WebDriverDiscovery.class.getName();
     Configuration.pageLoadTimeout= 20000;
     Configuration.startMaximized = true;
 }
}
