package CucumberScripts;

import BaseClass.OpenBrowser;
import org.junit.Test;
import org.openqa.selenium.By;

public class AT02_NavigateToLogin {

    @Test
    public static void NavLogin(){
        OpenBrowser.driver.findElement(By.xpath("//a[@class='my-account-icon disp-block']")).click();
    }
}
