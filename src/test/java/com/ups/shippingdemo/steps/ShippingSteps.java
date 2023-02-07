package com.ups.shippingdemo.steps;

import com.codeborne.selenide.Configuration;
import com.ups.shippingdemo.MainPage;
import com.ups.shippingdemo.task.SelectShippingOptionTask;
import com.ups.shippingdemo.task.WhereTask;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ShippingSteps {
    MainPage mainPage = new MainPage();
    SelectShippingOptionTask selectShippingOptionTask = new SelectShippingOptionTask();
    WhereTask whereTask = new WhereTask();
    @Given("is on homepage")
    public void isOnHomepage() {
        Configuration.browserSize = "1200x900";
        open("https://www.ups.com/co/es/Home.page?");
    }

    @When("complete the form")
    public void completeTheForm() {
        selectShippingOptionTask.doSelection();
        whereTask.doOriginForm();
        whereTask.doDestinationForm();

    }

    @Then("the order is scheduled")
    public void theOrderIsScheduled() {
    }
}
