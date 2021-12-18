package CucumberScripts;

import BaseClass.OpenBrowser;
import org.junit.Test;
import org.openqa.selenium.By;

public class AT04_CreateAccount {

    @Test
    public static void Click_on_Create_An_Acc_Btn(){
        //Click on Create an account button
        OpenBrowser.driver.findElement(By.xpath("//*[@id='btn_register']")).click();
    }

    @Test
    public static void FirstName(String FirstName){
// enter FirstName
        OpenBrowser.driver.findElement(By.xpath("//*[@id='regAddForm_firstName']")).sendKeys(FirstName);

    }
    @Test
    public static void LastNameName(String LastName){
        //enter lastname
        OpenBrowser.driver.findElement(By.xpath("//*[@id='regAddForm_lastName']")).sendKeys(LastName);
    }

}
