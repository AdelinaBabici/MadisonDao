package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.lang.reflect.InvocationTargetException;

@RunWith(SerenityRunner.class)
public class Test001ManageCartProducts extends BaseTest{

    @Test
    public void test001ManageCustomerCartProducts() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        loginSteps.login();
        cartSteps.emptyCartIfIsNotAlreadyEmpty();

        productFlowSteps.addProductToCart("Chelsea Tee",3);
        productFlowSteps.addProductToCart("Slim fit Dobby Oxford Shirt", 2);
        cartSteps.verifyNoTaxesCartDetails();

        cartSteps.updateCartProductQuantity("Slim fit Dobby Oxford Shirt", 10);
        cartSteps.verifyNoTaxesCartDetails();

        cartSteps.removeCartProduct("Chelsea Tee");
        cartSteps.verifyNoTaxesCartDetails();

        cartSteps.emptyCart();
        cartSteps.verifyCartIsEmpty();
    }
}
