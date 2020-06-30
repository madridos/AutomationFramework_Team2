
# cucumber test
Feature: navigate airbnb
#T1
  Scenario: airbnb open as expected
    Given Online Experiences
    When User Navigate to LogIn Page
    And User enters UserName and Password
   Then Message displayed Login Successfully
#T2
 Scenario: view date
   Given homepage
   When clickdate
   And anddatea
   Then date exists
#T3
  Scenario: price
    Given test3
    When pricetitle
    And andprice
    Then clickprice exists
#T4
  Scenario: clickshareall
    Given homepages
    When clicksharealla
    And andshareall
    Then clickshareallb
#T5
  Scenario: hostyourhome
    Given hostyourhomehomepages
    When hostyourhometa
    And andhostyourhome
    Then hostyourhometb
#T6
  Scenario: openday
    Given openmainpage
    When clicday
    And andopenday
    Then setday

#start from her
#T7
  Scenario: selectdate
    Given selectdate
    When datea
    And anddate
    Then dateb
#T8
  Scenario: openimage
    Given getimage
    When imagea
    And andopenimage
    Then imageb
#T9
  Scenario: getimage
    Given image
    When imagee
    And andgetimage
    Then imagec
#T10
  Scenario: clickarrow
    Given arrowopen
    When arrowa
    And andarrow
    Then arrowb
#T11
  Scenario: maxprice
    Given mprice
    When bprice
    And andmaxprice
    Then aprice

#T12
  Scenario: save
    Given clicksave
    When savea
    And andsave
    Then saveb
#T13
  Scenario: checkbox
    Given selectcheckbox
    When checkboxa
    And andcheckbox
    Then checkboxb
#T14
  Scenario: selectdate
    Given datex
    When da
    And andselectdate
    Then dax
#T15
  Scenario: exeldoc
    Given excelsheet
    When exela
    And andexeldoc
    Then execte
