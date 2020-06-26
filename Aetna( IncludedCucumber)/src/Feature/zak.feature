# cucumber test
Feature: navigate aetnahomepage

  Scenario: aetna open as expected
    Given Clikc loginToaetna
    When Click Reisteraetna
    And Click MemberIDaetna
    Then Clik aetnasearchBoxValidation