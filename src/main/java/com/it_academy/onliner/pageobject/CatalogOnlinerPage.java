package com.it_academy.onliner.pageobject;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.it_academy.onliner.framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static java.time.Duration.ofSeconds;

public class CatalogOnlinerPage extends BasePage {
    private ElementsCollection CATALOG_LIST_TITLE_MENU_SECTIONS =
            $$x( "//*[@class='catalog-navigation-classifier__item-title-wrapper']");
    private static final String CATALOG_CLASSIFIER_LINK_XPATH_PATTERN =
            "//*[contains(@class, 'catalog-navigation-classifier__item ')]//*[contains(text(), '%s')]";
    private ElementsCollection CATEGORY_MENU_SECTIONS_TITLE =
            $$x("//*[@class='catalog-navigation-list__category' and @data-id='2']//*[@class='catalog-navigation-list__aside-item']");
    private static final String CATEGORY_CLASSIFIER_LINK_XPATH_PATTERN =
            "//*[@class='catalog-navigation-list__aside-title' and contains(text(), '%s')]";
    private ElementsCollection PRODUCT_TITLE_LIST=
            $$x("//div[@class='catalog-navigation-list__aside-title' and contains(text(), 'Комплектующие') and not (contains(text(), 'Комплектующие для'))]//following-sibling::div[@class='catalog-navigation-list__dropdown']//a//*[contains(@class, 'title')]");
    private ElementsCollection PRODUCT_DESCRIPTION_LIST=
            $$x("//div[@class='catalog-navigation-list__aside-title' and contains(text(), 'Комплектующие') and not (contains(text(), 'Комплектующие для'))]//following-sibling::div[@class='catalog-navigation-list__dropdown']//a//*[contains(@class, 'description')and contains(text(),'товар')]");


    public List<String>getCatalogMenuSectionsTitle(){
        List<String> catalogElementsTitles = new ArrayList<>();
        CATALOG_LIST_TITLE_MENU_SECTIONS.shouldHave(CollectionCondition.sizeGreaterThan(0));
        CATALOG_LIST_TITLE_MENU_SECTIONS.stream().map(WebElement::getText).forEach(catalogElementsTitles::add);
        return catalogElementsTitles;
    }
    public CatalogOnlinerPage clickOnCatalogClassifierLink(String link){
        $x(String.format(CATALOG_CLASSIFIER_LINK_XPATH_PATTERN,link))
                .shouldBe(visible).click();
        return this;
    }
    public List<String> getCategoryMenuSectionsTitle() {
        List<String> categoryElementsTitles = new ArrayList<>();
        CATEGORY_MENU_SECTIONS_TITLE.shouldHave(CollectionCondition.sizeGreaterThan(0));
        CATEGORY_MENU_SECTIONS_TITLE.stream().map(WebElement::getText).forEach(categoryElementsTitles::add);
        CATEGORY_MENU_SECTIONS_TITLE.contains("Ноутбуки, компьютеры, мониторы,Комплектующие,Хранение данных, Сетевое оборудование");
        return categoryElementsTitles;
    }

    public CatalogOnlinerPage clickOnComputerAndNetworkClassifierLink(String link){
        $x(String.format(CATEGORY_CLASSIFIER_LINK_XPATH_PATTERN,link))
                .shouldBe(visible).click();
        return this;
    }

    public List<String> getProductListSectioinsAccessoriesTitle(){
        List<String> productElementsTitles = new ArrayList<>();
        PRODUCT_TITLE_LIST.shouldHave(CollectionCondition.sizeGreaterThan(0));
        PRODUCT_TITLE_LIST.stream().map(WebElement::getText).forEach(productElementsTitles::add);
        return productElementsTitles;
    }
    public List<String> getProductListSectioinsAccessoriesDescriptions(){
        List<String> productElementsTitles = new ArrayList<>();
        PRODUCT_DESCRIPTION_LIST.shouldHave(CollectionCondition.sizeGreaterThan(0));
        PRODUCT_DESCRIPTION_LIST.stream().map(WebElement::getText).forEach(productElementsTitles::add);
        return productElementsTitles;
    }
}
