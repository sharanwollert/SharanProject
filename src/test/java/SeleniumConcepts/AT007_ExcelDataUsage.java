package SeleniumConcepts;

import PropertiesFile.ReadPropertiesFile;
import excelReader.Xls_Reader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AT007_ExcelDataUsage {

    @Test
    public void ExeclLearn() throws IOException, InterruptedException {
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
        driver.get(ReadPropertiesFile.PropFile("GoodGuysurl"));
        //implict wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Here we have to give the path of excel file
        Xls_Reader reader = new Xls_Reader(ReadPropertiesFile.PropFile("excelread"));
        // now lets read data from excel sheet
        int rowcount=reader.getRowCount("logins");
        for(int j=2;j<=rowcount;j++) {
            //we are getting data drom excell sheet -- username
           String Username= reader.getCellData("logins","username",j);
           //we are getting data drom excell sheet -- password
            String Password= reader.getCellData("logins","password",j);

            //useranme
            driver.findElement(By.xpath("//input[contains(@name,'logonId')]")).clear();
            driver.findElement(By.xpath("//input[contains(@name,'logonId')]")).sendKeys(Username);
            //password
            driver.findElement(By.xpath("//input[contains(@name,'logonPassword')]")).clear();
            driver.findElement(By.xpath("//input[contains(@name,'logonPassword')]")).sendKeys(Password);
            //putting data back into excel sheet
            reader.setCellData("logins","Result",j,"PASS");
            //Thread.sleep(10000);

        }


    }
}