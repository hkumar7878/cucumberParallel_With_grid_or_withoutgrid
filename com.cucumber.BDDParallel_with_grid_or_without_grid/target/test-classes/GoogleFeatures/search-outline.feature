Feature: Searching on google using scenario outline

  Scenario Outline: Scenario Outline Example
    Given launch browser '<browserName>'
    When user navigates to '<url>'
    Then user enters search term '<searchitem>'
   

    Examples: 
      | browserName | url               | searchitem |
      | chrome      | http://google.com | selenium   |
      | firefox     | http://google.com | cucumber   |
