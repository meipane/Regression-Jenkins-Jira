package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseTest;

public class ConfirmationPage {
    WebDriver driver = BaseTest.getDriver();
    By thankYouMessage = By.cssSelector("h2.complete-header");
    By backBtn = By.id("back-to-products");

    public String getThankYouText() {
        return driver.findElement(thankYouMessage).getText();
    }

    public boolean isBackToProductsVisible() {
        return driver.findElement(backBtn).isDisplayed();
    }
}
