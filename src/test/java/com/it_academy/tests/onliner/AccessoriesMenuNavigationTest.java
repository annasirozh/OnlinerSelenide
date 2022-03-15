package com.it_academy.tests.onliner;

import com.it_academy.onliner.framework.BasePage;
import com.it_academy.onliner.pageobject.CatalogOnlinerPage;
import com.it_academy.onliner.pageobject.OnlinerHomePage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.List;

import static com.codeborne.selenide.Selenide.open;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AccessoriesMenuNavigationTest extends BasePage {
    private OnlinerHomePage onlinerHomePage = new OnlinerHomePage();
    private CatalogOnlinerPage catalogOnlinerPage = new CatalogOnlinerPage();

    @BeforeAll
    public void navigateTo() {
        open("https://www.onliner.by/");
    }

    @Test
    public void testUserIsAbleToSawSectionsOfCatalog() {
        List<String> productsTitlesOfSectioinsAccessories = onlinerHomePage
                .clickOnMainNavigationLink()
                .clickOnCatalogClassifierLink("Компьютеры и\u00a0сети")
                .clickOnComputerAndNetworkClassifierLink("Комплектующие")
                .getProductListSectioinsAccessoriesTitle();
        System.out.println(productsTitlesOfSectioinsAccessories);
        List<String> productsDescriptionsOfSectioinsAccessories = catalogOnlinerPage
                .getProductListSectioinsAccessoriesDescriptions();
        System.out.println(productsDescriptionsOfSectioinsAccessories);
    }

}
