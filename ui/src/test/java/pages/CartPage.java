package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseTest;

public class CartPage {
    WebDriver driver = BaseTest.getDriver();
    By checkoutBtn = By.id("checkout");

    public void proceedToCheckout() {
        driver.findElement(checkoutBtn).click();
    }
}
