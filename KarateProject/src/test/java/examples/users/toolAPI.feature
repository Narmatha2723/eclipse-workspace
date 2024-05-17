Feature: Validating grocery API

  Scenario: validating get request
    Given url 'https://simple-tool-rental-api.glitch.me/tools'
    When method GET
    Then status 200
    * print response
    * def jsonResponse = response
    * print jsonResponse