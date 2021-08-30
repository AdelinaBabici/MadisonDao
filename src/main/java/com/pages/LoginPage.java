package com.pages;

import com.tools.constants.EnvironmentConstants;
import org.openqa.selenium.WebDriver;

public class LoginPage extends  BasePage{
    public LoginPage(WebDriver driver){super(driver);}
    public void login(){
        clickOnWebElementWithText("Account");
        clickOnWebElementWithText("Log In");
        typeInInputWithTitle("Email Address", EnvironmentConstants.EMAIL);
        typeInInputWithTitle("Password", EnvironmentConstants.PASS);
        clickOnWebElementWithText("Login");
    }

}
