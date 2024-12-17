@regression
Feature: Computer test
  As a user
  I want check computer functionality

  Background: i am on home page

  @sanity
  Scenario: I should navigate to computer page successfully
    When I click on computer tab
    Then I should see the text "Computers"

  @smoke
  Scenario: I should navigate to desktop page successfully
    When I click on computer tab
    And I click on desktop link
    Then I should see the title as "Desktops"


  Scenario Outline: User should add product to cart successfully
    When I click on computer tab
    And I click on desktop link
    And I click on the product name "Build your own computer"
    And I select processor "<processor>"
    And I select RAM "<ram>"
    And I select HDD "<hdd>"
    And I select OS "<os>"
    And I select Software "<software>"
    And I click on ADD TO CART Button
    Then I should see the message "The product has been added to your shopping cart"

    Examples:
      | processor                                      | ram          | hdd              | os                  | software                  |
      | 2.2 GHz Intel Pentium Dual-Core E2200          | 2 GB         | 320 GB           | Windows 7 [+50.00]  | Microsoft Office [+50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+15.00] | 4GB [+20.00] | 400 GB [+100.00] | Windows 10 [+60.00] | Acrobat Reader [+10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+15.00] | 8GB [+60.00] | 320 GB           | Ubuntu              | Total Commander [+5.00]   |