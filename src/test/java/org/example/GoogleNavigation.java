package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleNavigation {
    public static void main(String[] args) {
        // Setup WebDriverManager for Chrome
        WebDriverManager.chromedriver().setup();

        // Create a WebDriver instance (ChromeDriver)
        WebDriver driver = new ChromeDriver();

        // Navigate to Google
        driver.get("https://www.google.com");

        // Close the browser
        driver.quit();
    }
}
