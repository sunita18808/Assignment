Feature: Countries with curencies

  Scenario: Products should be sorted order
    Given User Launch Chrome browser
    When User open URL "https://www.michaelkors.co.uk/"
    And Click on country flag
    Then Country selector open
    And now click on each country
    And validate currency
    