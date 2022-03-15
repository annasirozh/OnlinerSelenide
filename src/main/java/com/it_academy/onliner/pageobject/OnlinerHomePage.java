package com.it_academy.onliner.pageobject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.it_academy.onliner.framework.BasePage;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static java.time.Duration.ofSeconds;

public class OnlinerHomePage{
    private SelenideElement CATALOGLINK =
            $x("//*[contains(@class, 'main-navigation__text') and contains(text(), 'Каталог')]");
    private static final String CATALOGS_LINK_XPATH_PATTERN = "//*[contains(@class, 'main-navigation__text') and contains(text(), '%s')]";
    private static final String MAIN_NAVIGATION_LINK_XPATH_PATTERN =
            "//*[contains(@class, 'main-navigation__text') and contains(text(), '%s')]";

   public CatalogOnlinerPage clickOnMainNavigationLink(){
       CATALOGLINK.shouldBe(visible,ofSeconds(20)).click();
     return new CatalogOnlinerPage();
    }








    /*public void dosomething(String link) {
        $x(String.format(MAIN_NAVIGATION_LINK_XPATH_PATTERN,link))
                .shouldBe(visible).click();
    }
    public CatalogOnlinerPage dosomething(){
        dosomething("Каталог");
        return new CatalogOnlinerPage();
    }
    /*public OnlinerHomePage dosomething(String link) {
        $x(String.format(MAIN_NAVIGATION_LINK_XPATH_PATTERN,link))
                .shouldBe(visible,ofSeconds(20));
        return this;
    }*/





   /* private static final String MAIN_NAVIGATION_LINK_XPATH_PATTERN =
            "//*[contains(@class, 'main-navigation__text') and contains(text(), '%s')]";

    public void clickOnMainNavigationLink(String link) {
        waitForElementVisible(By.xpath(String.format(MAIN_NAVIGATION_LINK_XPATH_PATTERN, link)))
                .click();
    }
    public CatalogOnlinerPage clickOnCatalogNavigationLink() {
        clickOnMainNavigationLink("Каталог");
        return new CatalogOnlinerPage();
    }*/
}
