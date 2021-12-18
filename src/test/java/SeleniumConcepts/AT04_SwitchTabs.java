package SeleniumConcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class AT04_SwitchTabs {
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
        driver.get("https://www.harveynorman.com.au/customer/account/login");
        //implict wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //Click on "CustomiseMe"r link--this link will open in next tab
        driver.findElement(By.partialLinkText("CustomiseMe")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //Getting all tabs into an array list
        ArrayList<String> tabs=new ArrayList<String> (driver.getWindowHandles());
        System.out.println(tabs.size());
        int tabSize= tabs.size();
//        //switch to second tab
//        driver.switchTo().window(tabs.get(1));
//        //refresh the page
//        driver.navigate().refresh();
            int i=0;
//        do{
//            //switch to second tab
//            driver.switchTo().window(tabs.get(tabSize));
//            //refresh the page
//            driver.navigate().refresh();
//            tabSize++;
//            break;
//
//        }while(i<tabSize);

//        for(int i=0; i<tabs.size();i++){
//            driver.switchTo().window(tabs.get(i));
//            break
//        }
        //implict wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.switchTo().window(tabs.get(0));




    }
}
