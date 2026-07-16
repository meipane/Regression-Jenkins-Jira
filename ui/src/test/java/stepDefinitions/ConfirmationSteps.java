package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ConfirmationPage;

public class ConfirmationSteps {
    ConfirmationPage confirmationPage = new ConfirmationPage();

    @Then("I should see the message {string}")
    public void i_should_see_the_message(String message) {
        // Assert confirmation message
        confirmationPage.getThankYouText();
        Assert.assertEquals(message, "Thank you for your order!");
        confirmationPage.isBackToProductsVisible();
    }
}