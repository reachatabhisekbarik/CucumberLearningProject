package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {

    @Given("Validate the browser")
    public void validate_the_browser() {
        System.out.println("Validate the browser");
    }
    @When("Browser is triggered")
    public void browser_is_triggered() {
        System.out.println("Browser is triggered");
    }
    @Then("Check if browser is started or not")
    public void check_if_browser_is_started_or_not() {
        System.out.println("Check if browser is started or not");
    }

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("User is on Login Page");
    }
    @When("the user enters username {string} and password {string}")
    public void the_user_enters_username_and_password(String username, String password) {
        System.out.println("User credentials are: Username "  +  username + "Password: " +  password);
    }
    @And("clicks the login button")
    public void clicks_the_login_button() {
        System.out.println("user clicks on login button.");
    }
    @Then("the user should be redirected to the dashboard")
    public void the_user_should_be_redirected_to_the_dashboard() {
        System.out.println("the user should be redirected to the dashboard");
    }

    @Given("the user is on dashboard page")
    public void the_user_is_on_dashboard_page() {
        System.out.println("User is on Dashboard Page.");
    }
    @When("clicks on logout button")
    public void clicks_on_logout_button() {
        System.out.println("clicked on logout button");
    }
    @Then("the user should be redirected to the login page")
    public void the_user_should_be_redirected_to_the_login_page() {
        System.out.println("User redirected to login page.");
    }

    public static class HooksStepDefinition {
    }
}
