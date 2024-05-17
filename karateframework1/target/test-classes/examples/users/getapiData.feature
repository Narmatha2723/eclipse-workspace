Feature: Validating gorest API

  Scenario: validating get request
  
    Given url 'https://api.bestbuy.com/click/5592e2b895800000/12345678/pdp'
    When method GET
    Then status 200