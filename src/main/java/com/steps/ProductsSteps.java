package com.steps;

import com.pages.ProductsPage;
import net.thucydides.core.annotations.Step;

public class ProductsSteps extends AbstractSteps{
    private ProductsPage productsPage;

    @Step
    public void openProductsDetailsPage(String productName){
        productsPage.openProductDetailsPage(productName);
    }
}
