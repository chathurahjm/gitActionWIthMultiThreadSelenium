package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


@Test
public class GoogleNavigation {

    protected WebDriver driver;
    
   
    @Test
    public void testActions()throws InterruptedException {

           ExecutorService executorService = Executors.newFixedThreadPool(15);

        // Submit tasks to the executor

                    long startTime = System.currentTimeMillis();
                    while (System.currentTimeMillis() - startTime < TimeUnit.HOURS.toMillis(20)) {
                        // Set ChromeDriver path
                        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

                        // Configure ChromeOptions
                        ChromeOptions chromeOptions = new ChromeOptions();
                        chromeOptions.addArguments("--headless");

                        // Create a WebDriver instance (ChromeDriver)
                        WebDriver driver = new ChromeDriver(chromeOptions);

                        // Navigate to Google
                        driver.get("https://gplus.lk/");

                        // Thread.sleep(8000); // Sleep
                        // WebElement element = driver.findElement(By.xpath("(//*[@class='yt-simple-endpoint style-scope ytd-playlist-thumbnail'])[4]"));

                        // // Simulate pressing the space button on the element
                        // element.click();

                        // Sleep for 15 minutes
                        Thread.sleep(TimeUnit.MINUTES.toMillis(2));

                         driver.get("https://gplus.lk/");
                         Thread.sleep(8000); // Sleep

                        driver.quit();
                    }

        

        // Shutdown the executor once all tasks are completed
        executorService.shutdown();
        
    }
}
