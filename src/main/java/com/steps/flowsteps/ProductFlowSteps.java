package com.steps.flowsteps;

import com.steps.AbstractSteps;
import com.steps.HeaderSteps;
import com.steps.ProductDetailsSteps;
import com.steps.ProductsSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ProductFlowSteps extends AbstractSteps {
    @Steps
    private HeaderSteps headerSteps;
    @Steps
    private ProductsSteps productsSteps;
    @Steps
    private ProductDetailsSteps productDetailsSteps;

    @Step
    public void addProductToCart(String productName, int quantity) {
        headerSteps.searchForProduct(productName);
        productsSteps.openProductsDetailsPage(productName);
        productDetailsSteps.addProductToCart(3);
    }



}
