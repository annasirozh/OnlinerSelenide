package com.it_academy.tests.onliner;

import com.it_academy.onliner.framework.BasePage;
import com.it_academy.onliner.pageobject.OnlinerHomePage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.List;

import static com.codeborne.selenide.Selenide.open;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ComputerAndNetworkMenuNavigationTest extends BasePage {
    private OnlinerHomePage onlinerHomePage = new OnlinerHomePage();

    @BeforeAll
    public void navigateTo() {
        open("https://www.onliner.by/");
    }

    @Test
    public void testUserIsAbleToSawSectionsOfCatalog() {
        List<String> computerAndNetworksMenuSectioins  = onlinerHomePage
                .clickOnMainNavigationLink()
                .clickOnCatalogClassifierLink("Компьютеры и\u00a0сети")
                .getCategoryMenuSectionsTitle();
        System.out.println(computerAndNetworksMenuSectioins );
    }
}
