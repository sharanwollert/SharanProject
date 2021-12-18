package SeleniumConcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.util.List;

public class AT05_Iframe {


        @Test
        public void iframeListSelect() throws IOException {
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
            driver.get("https://www.harveynorman.com.au/signup");

            //get iframes in the page
            List<WebElement> ListofLinks = driver.findElements(By.tagName("iframe"));
            int iframecount = ListofLinks.size();
            System.out.println("iframe count is : "+iframecount);
            //switch to frame 0
            driver.switchTo().frame(0);
            //enter firstname
            driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("softwaretetslab");


        }
    }