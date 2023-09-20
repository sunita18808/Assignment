Feature: Countries with their langauges

  Scenario: Products should be sorted order
    Given User Launch Chrome browser
    When User open URL "https://www.michaelkors.co.uk/"
    And Click on country flag
    Then Country selector open
    And now hover over to each country name
    And validate the list of countries with langauges
    Then close the browser