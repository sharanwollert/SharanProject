/*
Automation Test case: Navigating to HN website
Author : Software Testlab
Date : 28/11/2021
 */
package SeleniumConcepts;
import BaseClass.OpenBrowser;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AT01_NavigateTitleAssertScreenshot {

    @Test
    public void NavHN() throws IOException {

        OpenBrowser.NavToWebsite("url");

//        //setting up chromedriver
//        WebDriverManager.chromedriver().setup();
//        //options
//        ChromeOptions chromeOptions = new ChromeOptions();
//        //we create an object of WebDriver
//        WebDriver driver = new ChromeDriver(chromeOptions);
//        //At this point browser will be opened
//        //maximize browser
//        driver.manage().window().maximize();
//        //Navigate to HN website
//        driver.get("https://www.harveynorman.com.au");
       // implict wait
        OpenBrowser.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //get title
        String ActualTitle = OpenBrowser.driver.getTitle();
        System.out.println("title : " +ActualTitle);
        String ExpectedTitle="Harvey Norman | Shop Online for Computers, Electrical, Furniture, Bedding, Bathrooms & Flooring | Harvey Norman Australia";
//        //Assertion version-1
       Assert.assertEquals(ExpectedTitle,ActualTitle);

        //Assertion version-2
        Assert.assertTrue(ActualTitle.contains("Computers"));
        //Screenshots
        File screenshotFile = ((TakesScreenshot)OpenBrowser.driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File("C:\\Users\\etikalaj\\screenshot.png"));

        //get this data drom baseclass
        OpenBrowser.closeBrowser();
    }

}
