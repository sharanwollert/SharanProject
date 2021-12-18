package StepDefinations;

import BaseClass.OpenBrowser;
import CucumberScripts.AT02_NavigateToLogin;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class SD02_NavigateToLoginScreen {

    @Then("click on account link")
    public void click_on_account_link() {
        OpenBrowser.driver.findElement(By.xpath("//a[@class='my-account-icon disp-block']")).click();
        AT02_NavigateToLogin.NavLogin();

    }
}
