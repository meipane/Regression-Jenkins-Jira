package stepDefinitions;

import io.cucumber.java.en.And;
import pages.CartPage;

public class CartSteps {
    CartPage cartPage = new CartPage();

    @And("I proceed to checkout")
    public void i_proceed_to_checkout() {
        // Click checkout button
        cartPage.proceedToCheckout();
    }
}
