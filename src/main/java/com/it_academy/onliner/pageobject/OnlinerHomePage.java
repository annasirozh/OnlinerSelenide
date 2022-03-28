package com.it_academy.onliner.pageobject;

import com.codeborne.selenide.SelenideElement;



import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static java.time.Duration.ofSeconds;

public class OnlinerHomePage{
    private SelenideElement CATALOGLINK =
            $x("//*[contains(@class, 'main-navigation__text') and contains(text(), 'Каталог')]");
   // private static final String CATALOGS_LINK_XPATH_PATTERN = "//*[contains(@class, 'main-navigation__text') and contains(text(), '%s')]";
    //private static final String MAIN_NAVIGATION_LINK_XPATH_PATTERN =
     //       "//*[contains(@class, 'main-navigation__text') and contains(text(), '%s')]";

   public CatalogOnlinerPage clickOnMainNavigationLink(){
       CATALOGLINK.shouldBe(visible,ofSeconds(20)).click();
     return new CatalogOnlinerPage();
    }
}
