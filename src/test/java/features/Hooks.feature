Feature: Home Page
  Background: flow till home page
    Given user is on Application home page

  @web
  Scenario: Home Page Default content on Web
    Then user gets a GitHub Bootcamp section

  @rest
  Scenario: GitHub account REST Service
    When user sends a GET request
    Then user sends a GET request to aut