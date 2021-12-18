package PlayPen;

import BaseClass.OpenBrowser;
import PropertiesFile.ReadPropertiesFile;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.io.IOException;

public class BrowserNav_01 {
@Test
public void test01() throws IOException {
        OpenBrowser.NavToWebsite(ReadPropertiesFile.PropFile("GoodGuysHomePage"));
        OpenBrowser.driver.findElement(By.xpath("//a[@class='my-account-icon disp-block']")).click();



        //get title
        String ActualTitle = OpenBrowser.driver.getTitle();
        System.out.println("title : " + ActualTitle);
        String ExpectedTitle = "The Good Guys - Online Electrical & Home Appliances";
//        //Assertion version-1
        Assert.assertEquals(ExpectedTitle, ActualTitle);
    }

}