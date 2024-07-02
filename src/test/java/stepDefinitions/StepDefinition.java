package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
    @Given("User is on net banking landing page")
    public void User_is_on_net_banking_landing_page(){
        System.out.println("User is on net banking landing page");
    }

    @When("^User login into application with username (.+) and password (.+)$")
    public void  User_log_in_into_application_with_username__and_password(String Username, String Password) {
        System.out.println("Username:" + Username);
        System.out.println("Password:"  + Password);
    }

    @When("User log in into application with username {string} and password {string}")
    public void user_log_in_into_application_with_username_and_password(String Username, String Password) {
        System.out.println("Username:" + Username);
        System.out.println("Password:"  + Password);
    }

    @Then("Home page is displayed")
    public void Home_page_is_displayed(){
        System.out.println("Home page is displayed");
    }

    @And("Cards are {string}")
    public void cards_are(String flag) {
        System.out.println("Card enabled: " + flag);
    }


}
