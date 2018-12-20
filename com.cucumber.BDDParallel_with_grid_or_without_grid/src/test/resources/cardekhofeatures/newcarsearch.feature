#@Search-Cars
Feature: Validation of Car search page

  #@Search-New-Car-Positive
  Scenario Outline: Verifyinng new car search on cardekho.com for scenario outline on diffrent browsers
  
    Given launch browser '<browserName>'
    When user navigates to URL 'https://www.cardekho.com/'
    When user move to the menu
      | New Car      |
      | Used Car     |
      | Sell Car     |
      | Compare Cars |
    When user click on Search new car option
    Then user verify search new car page is displayed
    Then user Select budget
      | 1 Lakh - 5 Lakh |
    Then user Select vehical type
      | Hatchback |
    And user clicked on search button
    Then use see a list of searched cars
    Then user verify the title is "New Hatchback Cars in India Between Rs 1 Lakh to Rs 5 Lakh123 | CarDekho.com"

    Examples: 
      | browserName |
      | chrome      |
      | firefox     |
