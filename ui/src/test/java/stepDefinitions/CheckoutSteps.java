package stepDefinitions;

import io.cucumber.java.en.And;
import pages.CheckoutPage;

public class CheckoutSteps {
    CheckoutPage checkoutPage = new CheckoutPage();

    @And("I enter first name {string}, last name {string}, and postal code {string}")
    public void i_enter_checkout_information(String firstName, String lastName, String postalCode) {
        // Fill checkout form
        checkoutPage.fillInformation(firstName, lastName, postalCode);
    }

    @And("I complete the checkout")
    public void i_complete_the_checkout() {
        // Finish checkout
        checkoutPage.finishOrder();
    }
}
