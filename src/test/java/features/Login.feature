Feature: Application Login

  @Regression
  Scenario: Home page default login
    Given User is on net banking landing page
    When User login into application with username "usr123" and password "test123"
    Then Home page is displayed
    And Cards are "true"

  @Regression
  Scenario: Home page invalid user login
    Given User is on net banking landing page
    When User login into application with username "usr321" and password "test321"
    Then Home page is displayed
    And Cards are "false"
