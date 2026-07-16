package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseTest;

public class LoginPage {
    WebDriver driver = BaseTest.getDriver();
    By loginLogo = By.className("login_logo");
    By username = By.id("user-name");
    By password = By.id("password");
    By loginButton = By.id("login-button");
    By errorMessage = By.cssSelector("button.error-button");

    public void open() {
        driver.get("https://www.saucedemo.com/");
    }

    public void showLoginLogo() {
        driver.findElement(loginLogo).isDisplayed();
    }

    public void login(String user, String pass) {
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginButton).click();
    }

    public void showErrorMessage() {
        driver.findElement(errorMessage).isDisplayed();
    }
}
