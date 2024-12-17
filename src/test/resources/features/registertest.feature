@regression
Feature: Register

  As a user
  I want to check register functionality

  Background: I am on home page

  @sanity
  Scenario: I should navigate to Register page successfully
    Given I click on Register Link
    Then I should see the "Register" text

  @smoke
  Scenario: User should click on register button with empty field
    When I click on Register Link
    And I click on Register button
    And I should see first name error message "First name is required."
    And I should see last name error message "Last name is required."
    And I should see email error message "Email is required."
    And I should see password error message "Password is required."
    Then I should see confirm password error message "Password is required."

  Scenario: User should create account successfully
    When I click on Register Link
    And I select gender Female
    And I enter first name "prime"
    And I enter last name "test"
    And I enter email "primetest@gmail.com"
    And I enter password "test123"
    And I enter confirm password "test123"
    And I click on Register button
    Then I should see register message "Your registration completed"
