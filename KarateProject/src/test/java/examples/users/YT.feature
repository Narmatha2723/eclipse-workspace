Feature: Validating gorest API

  Scenario: validating get request
  
    Given url 'https://gorest.co.in/public/v2/users'
    And path '5536174'
    When method GET
    Then status 200
    * print response
    * def jsonResponse = response
    * print jsonResponse
    * match jsonResponse.email == 'dwivedi_oormila_ii@rau-breitenberg.example'

 
  Scenario: validating with query param
    * def query = {status: 'active', gender: 'male'}
    Given url 'https://gorest.co.in/public/v2/users'
    And params query
    When method GET
    Then status 200
    * print response
    * def jsonResponse = response
    * print jsonResponse
    * def userCount = jsonResponse.length
    * print userCount
