package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksDefinitions {

    @Given("user is on Application home page")
    public void user_is_on_application_home_page() {
        System.out.println("user is on Application home page");
    }
    @Then("user gets a GitHub Bootcamp section")
    public void user_gets_a_git_hub_bootcamp_section() {
        System.out.println("user gets a GitHub Bootcamp section");
    }
    @When("user sends a GET request")
    public void user_sends_a_get_request() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user sends a GET request");
    }

    
    public void user_sends_a_get_request_to_aut() {
        System.out.println("user sends a GET request to aut");
    }

    @Then("user sends a GET request to aut")
    public void userSendsAGETRequestToAut() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user sends a GET request to aut");
    }
}
