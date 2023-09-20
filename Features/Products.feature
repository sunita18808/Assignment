Feature: List of Products

  Scenario: Products should be sorted order
    Given User Launch Chrome browser
    When User open URL "https://www.michaelkors.co.uk/"
    And navigate to HANDBAGS Category
    Then Click on Featured
    And select Price HIGH to LOW
    Then I validate the order of products should be sorted
    And close the browser

