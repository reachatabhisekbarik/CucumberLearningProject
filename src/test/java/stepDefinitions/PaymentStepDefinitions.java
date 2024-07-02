package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaymentStepDefinitions {


    @Given("the user is logged into their account")
    public void theUserIsLoggedIntoTheirAccount() {
        System.out.println("the user is logged into their account");
    }
    @When("the user navigates to the {string} page")
    public void theUserNavigatesToThePage(String string) {
        System.out.println("the user navigates to the " +string +" page");
    }
    @When("the user enters a valid credit card number")
    public void theUserEntersAValidCreditCardNumber() {
        System.out.println("the user enters a valid credit card number");
    }
    @When("the user enters the expiration date")
    public void theUserEntersTheExpirationDate() {

        System.out.println("the user enters the expiration date");
    }
    @When("the user enters the CVV code")
    public void theUserEntersTheCVVCode() {
        System.out.println("the user enters the CVV code");
    }
    @When("the user enters a valid payment amount")
    public void theUserEntersAValidPaymentAmount() {
        System.out.println("the user enters a valid payment amount");
    }
    @When("the user clicks {string}")
    public void theUserClicks(String string) {
        System.out.println("the user clicks" +  string);
    }
    @Then("the user should see a confirmation message stating the payment was successful")
    public void theUserShouldSeeAConfirmationMessageStatingThePaymentWasSuccessful() {
        System.out.println("the user should see a confirmation message stating the payment was successful");
    }
    @Then("the user's account balance should reflect the payment")
    public void theUserSAccountBalanceShouldReflectThePayment() {
        System.out.println("the user's account balance should reflect the payment");
    }

}
