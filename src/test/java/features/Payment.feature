Feature: Make Payment

  @payment
  Scenario: User makes a successful payment with a valid credit card
    Given the user is logged into their account
    When the user navigates to the "Make Payment" page
    And the user enters a valid credit card number
    And the user enters the expiration date
    And the user enters the CVV code
    And the user enters a valid payment amount
    And the user clicks "Pay"
    Then the user should see a confirmation message stating the payment was successful
    And the user's account balance should reflect the payment



