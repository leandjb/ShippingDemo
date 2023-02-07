package com.ups.shippingdemo.task;

import com.github.javafaker.Faker;
import com.ups.shippingdemo.pages.WherePage;

import java.util.Locale;

import static com.github.javafaker.Faker.instance;

public class WhereTask {
        WherePage wherePage = new WherePage();
        Faker faker = instance(new Locale("es", "CO"));

    public void doOriginForm(){

        wherePage.inputOriginFullName.setValue(faker.name().fullName());
        wherePage.inputOriginContactName.setValue(faker.name().lastName());
        wherePage.inputOriginAddressAddSuite.click();

        wherePage.inputOriginAddressLine1.setValue(faker.address().streetAddressNumber());
        wherePage.inputOriginState.setValue(faker.address().state());
        wherePage.inputOriginCity.setValue(faker.address().cityName());
        wherePage.inputOriginPostalCode.setValue(faker.phoneNumber().subscriberNumber(7));


        wherePage.inputOriginEmail.setValue(faker.internet().emailAddress());
        wherePage.inputOriginPhone.setValue(faker.phoneNumber().cellPhone());
        wherePage.inputOriginExtension.setValue(faker.phoneNumber().extension());

        wherePage.linkSendStatus.click();
        wherePage.checkSameAddress.scrollTo();
        wherePage.buttonOriginContinue.click();

    }

    public void doDestinationForm(){
        wherePage.inputDestinationFullName.setValue(faker.name().fullName());
        wherePage.inputDestinationContactName.scrollTo().setValue(faker.name().lastName());

//        wherePage.inputDestinationAddressAddSuite.click();

//        wherePage.inputDestinationAddressLine1.setValue(faker.address().fullAddress());
//        wherePage.inputDestinationAddressLine2.setValue(faker.address().fullAddress());
//        wherePage.inputDestinationCity.setValue(faker.address().cityName());
//        wherePage.inputDestinationState.setValue(faker.address().state());
//        wherePage.inputDestinationExtension.setValue(faker.phoneNumber().extension());


        wherePage.inputDestinationEmail.setValue(faker.internet().emailAddress());
        wherePage.inputDestinationPhone.setValue(faker.phoneNumber().cellPhone());
        wherePage.inputOriginExtension.setValue(faker.phoneNumber().extension());

        wherePage.buttonDestinationContinue.click();

    }

}

