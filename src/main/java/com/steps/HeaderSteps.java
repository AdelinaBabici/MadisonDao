package com.steps;

import com.pages.HeaderPage;
import net.thucydides.core.annotations.Step;

public class HeaderSteps extends AbstractSteps{
    private HeaderPage headerPage;
    @Step
    public void openAccountSection(String section) {
        basePage.clickOnWebElementWithText("Account");
        basePage.clickOnWebElementWithText(section);
    }

    @Step
    public void navigateToSubmenu(String menuItem, String submenuItem) {
        basePage.moveToElementWithText(menuItem);
        basePage.clickOnWebElementWithText(submenuItem);
    }

    @Step
    public void searchForProduct(String productName) {
        headerPage.inputSearchTerm(productName);
        headerPage.clickSearchIcon();
    }
}
