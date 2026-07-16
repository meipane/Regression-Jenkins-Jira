package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseTest;

public class HomePage {
    WebDriver driver = BaseTest.getDriver();
    By cartIcon = By.className("shopping_cart_link");

    public void addItemToCart(String productName) {
        String productId = "add-to-cart-" + productName.toLowerCase().replace(" ", "-");
        driver.findElement(By.id(productId)).click();
    }

    public void goToCart() {
        driver.findElement(cartIcon).click();
    }
}