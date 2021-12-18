package StepDefinations;

import BaseClass.OpenBrowser;
import CucumberScripts.AT04_CreateAccount;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class SD04_ScenarioExamplesLearning {

    @Then("click on create an account button")
    public void click_on_create_an_account_button() {
        // click on crate an account button, this code is called from class ->AT04_CreateAccount
       // AT04_CreateAccount.Click_on_Create_An_Acc_Btn();
      //  or you can directly enter code here
        OpenBrowser.driver.findElement(By.xpath("//*[@id='btn_register']")).click();
    }
    @Then("Customer enters FirstName as {string}")
    public void customer_enters_first_name_as(String FirstName) {
        AT04_CreateAccount.FirstName(FirstName);
    }
    @Then("Customer enters LastName as {string}")
    public void customer_enters_last_name_as(String LastName) {
        AT04_CreateAccount.LastNameName(LastName);
    }
}
