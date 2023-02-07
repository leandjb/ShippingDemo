package com.ups.shippingdemo.steps;

import com.codeborne.selenide.Configuration;
import com.ups.shippingdemo.MainPage;
import com.ups.shippingdemo.task.SelectShippingOptionTask;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ShippingSteps {
    MainPage mainPage = new MainPage();

    @Given("is on homepage")
    public void isOnHomepage() {
        open("https://www.ups.com/co/es/Home.page?");
    }

    @When("complete the form")
    public void completeTheForm() {
        SelectShippingOptionTask selectShippingOptionTask = new SelectShippingOptionTask();
        selectShippingOptionTask.doSelection();

    }

    @Then("the order is scheduled")
    public void theOrderIsScheduled() {
    }
}
