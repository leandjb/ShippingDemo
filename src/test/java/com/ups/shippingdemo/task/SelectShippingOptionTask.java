package com.ups.shippingdemo.task;

import com.ups.shippingdemo.pages.HomePage;

public class SelectShippingOptionTask {
    HomePage homePage = new HomePage();

    public void doSelection(){
        homePage.linkUpsMenuLinks.click();
        homePage.emPaqueteCarga.click();

    }


}
