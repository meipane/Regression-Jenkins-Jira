package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.GoogleHomePage;

public class GoogleTest {

    @Test
    public void testGoogleHomePage() {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        WebDriver driver = new ChromeDriver(options);

        GoogleHomePage googlePage = new GoogleHomePage(driver);
        googlePage.navigateToHomePage();

        System.out.println("Current URL: " + googlePage.getCurrentUrl());
        System.out.println("Page Title: " + googlePage.getPageTitle());

        Assert.assertTrue(
                googlePage.getCurrentUrl().contains("google.com")
        );

        driver.quit();
    }
}