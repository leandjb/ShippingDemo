package com.ups.shippingdemo;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.ups.shippingdemo.pages.HomePage;
import com.ups.shippingdemo.task.SelectShippingOptionTask;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPageTest {
//    @BeforeAll
//    public static void setUpAll() {
//        Configuration.browserSize = "1280x800";
//    }
//
//    @BeforeEach
//    public void setUp() {
//        open("https://www.ups.com/co/es/Home.page?");
//    }
//
//    @Test
//    public void search() {
//
//
//
//        $("[data-test='search-input']").sendKeys("Selenium");
//        $("button[data-test='full-search-button']").click();
//
//        $("input[data-test='search-input']").shouldHave(attribute("value", "Selenium"));
//    }
//
//    @Test
//    public void toolsMenu() {
//
//
//    }
//
//    @Test
//    public void navigationToAllTools() {
//        mainPage.seeDeveloperToolsButton.click();
//        mainPage.findYourToolsButton.click();
//
//        $("#products-page").shouldBe(visible);
//
//        assertEquals("All Developer Tools and Products by JetBrains", Selenide.title());
//    }
}
