
# cucumber test
Feature: navigate airbnb

  Scenario: airbnb open as expected
    Given Online Experiences
    When User Navigate to LogIn Page
    And User enters UserName and Password
   Then Message displayed Login Successfully

 Scenario: view date
   Given homepae
   When clickdate
   Then date exists


  Scenario: price
    Given test3
    When pricetitle
    Then clickprice exists


  Scenario: clickshareall
    Given homepages
    When clicksharealla
    Then clickshareallb

  Scenario: hostyourhome
    Given hostyourhomehomepages
    When hostyourhometa
    Then hostyourhometb



  Scenario: openday
    Given openmainpage
    When clicday
    Then setday


  Scenario: selectdate
    Given date
    When datea
    Then dateb

  Scenario: openimage
    Given getimage
    When imagea
    Then imageb


  Scenario: getimage
    Given image
    When imagee
    Then imagec

  Scenario: clickarrow
    Given arrowopen
    When arrowa
    Then arrowb

  Scenario: maxprice
    Given mprice
    When bprice
    Then aprice


  Scenario: save
    Given clicksave
    When savea
    Then saveb

  Scenario: checkbox
    Given selectcheckbox
    When checkboxa
    Then checkboxb


  Scenario: selectdate
    Given datex
    When da
    Then dax

  Scenario: exeldoc
    Given excelsheet
    When exela
    Then execte
