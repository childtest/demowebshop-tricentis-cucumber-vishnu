@regression
Feature: Login functionality

  As a user
  I want check login functionality

  Background: I am on home page

  @sanity
  Scenario: I should navigate to login page successfully
    When I click on login link
    Then I should see "Welcome, Please Sign In!" message display

  @smoke
  Scenario: I should verify the error message with in valid credentials
    When I click on login link
    And I enter email id "primegfdgdfgtest@test.com" and password "test123" for login
    Then I should see the error message "Login was unsuccessful. Please correct the errors and try again./n No customer account found"


  Scenario: I should login successfully with in valid credentials
    When I click on login link
    And I enter email id "testtest@tests.com" and password "test123" for login
    Then I should see the "Log out" link is displayed

  Scenario: I should logout successfully
    When I click on login link
    And I enter email id "testtest@tests.com" and password "test123" for login
    And I click on logout link
    Then I should see the "Log in" link is displayed