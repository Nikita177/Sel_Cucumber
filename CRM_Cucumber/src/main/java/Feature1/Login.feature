Feature: Free CRM login Feature

  Scenario: Free CRM Login Test Scenario
    Given User is already on Login page
    When Title of login page is Free CRM
    Then User enter username and password
    And User click on login button
    Then User is in Homepage
