package stepDefinitions;

import io.cucumber.java.en.And;
import pages.HomePage;

public class HomeSteps {
    HomePage homePage = new HomePage();

    @And("I add {string} to the cart")
    public void i_add_product_to_the_cart(String productName) {
        // Add product to cart
        homePage.addItemToCart(productName);
        homePage.goToCart();
    }
}