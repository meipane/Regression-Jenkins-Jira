package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

    protected static WebDriver driver;

    public static void initializeDriver() {

        if (driver == null) {

            WebDriverManager.chromedriver().setup();

            ChromeOptions options = new ChromeOptions();

            // Untuk Jenkins Docker
            options.addArguments("--headless=new");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--disable-gpu");
            options.addArguments("--disable-software-rasterizer");
            options.addArguments("--disable-extensions");
            options.addArguments("--window-size=1920,1080");

            // Paksa Chrome menggunakan binary Linux
            options.setBinary("/usr/bin/google-chrome");

            driver = new ChromeDriver(options);
        }
    }


    public static WebDriver getDriver() {

        if (driver == null) {
            initializeDriver();
        }

        return driver;
    }


    public static void quitDriver() {

        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}