package StepDefinations;

import CucumberScripts.AT01_NaviagateToGGwebsite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class SD01_NavigateToHNWebsite {

    @Given("open the Browser and enter url and press enter key")
    public void open_the_browser_and_enter_url_and_press_enter_key() throws IOException {
        AT01_NaviagateToGGwebsite.Nav();
    }
    @Then("system should navigate to HomePage of HN Website")
    public void system_should_navigate_to_home_page_of_hn_website() throws IOException {
            AT01_NaviagateToGGwebsite.AssertHomePage();

    }
}
