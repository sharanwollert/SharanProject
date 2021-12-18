/*
Automation Test case: Navigating to HN website
Author : Software Testlab
Date : 28/11/2021
 */
package SeleniumConcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AT02_Locators {

    @Test
    public void NavHN() throws IOException {
        //setting up chromedriver
        WebDriverManager.chromedriver().setup();
        //options
        ChromeOptions chromeOptions = new ChromeOptions();
        //we create an object of WebDriver
        WebDriver driver = new ChromeDriver(chromeOptions);
        //At this point browser will be opened
        //maximize browser
        driver.manage().window().maximize();
        //Navigate to HN website
        driver.get("https://www.harveynorman.com.au");
        //implict wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // locator-id
        //driver.findElement(By.id("top-cart")).click();
        //locator- name
       // driver.findElement(By.name("q")).sendKeys("computer");
        //locator- linktext
       // driver.findElement(By.linkText("Sitemap")).click();
        //locator- linktext
         //driver.findElement(By.partialLinkText("Newsletter")).click();
        //locator-xpath
       // driver.findElement(By.xpath("//*[@id='outer-wrap']/footer/div/div/div/div/div[2]/div[1]/ul/li[13]/a")).click();
        //classname
        //driver.findElement(By.className("form-control input-lg ui-autocomplete-input")).sendKeys("test");
        //cssselector
        driver.findElement(By.cssSelector("#search_form > div > div > input")).sendKeys("test");
    }

}
