Feature: Application login - Feature
  Inorder to test the login feature,
  As a test analyst i want to pass the below credentials to the application to check the behaviour of the application.

  Background:
   Given Validate the browser
   When Browser is triggered
   Then Check if browser is started or not

  @Sanity
  Scenario Outline: Successful login with valid credentials
    Given the user is on the login page
    When the user enters username "<username>" and password "<password>"
    And clicks the login button
    Then the user should be redirected to the dashboard

    Examples:
      | username | password |
      | user1 | password123 |
      | user2 | password456 |
      | user3 | password789 |

  @Sanity
  Scenario: Successful login with valid credentials
    Given the user is on dashboard page
    When clicks on logout button
    Then the user should be redirected to the login page




