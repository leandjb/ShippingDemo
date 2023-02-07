package com.ups.shippingdemo.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class WherePage {
    public SelenideElement inputOriginFullName = $("input[id*='companyOrName']");
    public SelenideElement inputOriginContactName = $("input[id$='contactName']");
    public SelenideElement inputOriginAddressAddSuite = $("button[id='origin-singleLineAddressEditButton'] span");
    public SelenideElement inputOriginPhone = $("input[id$='phone']");
    public SelenideElement inputOriginEmail = $("input[id$='email']");
    public SelenideElement inputOriginExtension = $("input[id$='extension']");
    public SelenideElement linkSendStatus = $("label[for='origin-agent_emailCheckbox']");
    public SelenideElement inputOriginAddressLine1 = $("#origin-cac_addressLine1");
    public SelenideElement inputOriginState = $("input[id='origin-cac_state']");
    public SelenideElement inputOriginCity = $("input[id='origin-cac_city']");
    public SelenideElement inputOriginPostalCode = $("input[id$='postalCode']");
    public SelenideElement checkSameAddress = $("label[for='returnSwitch'] span[class$='switch']");

    public SelenideElement buttonOriginContinue = $("#nbsBackForwardNavigationContinueButton");
    

//    public SelenideElement buttonOriginContinue = $x("//button[@class='ups-cta ups-cta_primary ng-star-inserted']");



    
}
