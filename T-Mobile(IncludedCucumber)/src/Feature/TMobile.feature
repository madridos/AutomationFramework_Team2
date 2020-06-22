
# cucumber test
Feature: navigate Tmobile

  Scenario: Tmobil open as expected
    Given Online Experiences
    When User Navigate to LogIn Page
    And User enters UserName and Password
   Then Message displayed Login Successfully

