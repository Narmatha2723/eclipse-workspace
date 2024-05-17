Feature: Validating grocery API

  Scenario: validating get request
    Given url 'https://simple-grocery-store-api.glitch.me/products'
    When method GET
    Then status 200
    * print response
    * def jsonResponse = response
    * print jsonResponse

  Scenario: validating queryParams
    * def query = {category: "dairy"}
    Given url   'https://simple-grocery-store-api.glitch.me/products'
    And params query
    When method GET
    Then status 200
    * def jasonResponse = response
    * print jsonResponse
    * def productCount = jsonResponse.length
    * print productCount
