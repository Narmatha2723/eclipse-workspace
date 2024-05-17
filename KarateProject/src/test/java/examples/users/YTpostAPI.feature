Feature: Create user using POST API

  Background: 
    * url 'https://gorest.co.in'
    * def requestPayload =
      """
      {
       
         "name" : "jerry",
         "email" : "jerry15@gmail.com",
         "gender" : "female",
         "status" : "active"
      }

      """

  Scenario: create user with the given data
    Given path '/public/v2/users'
    And request requestPayload
    And header Authorization = 'Bearer '+TokenId
    When method post
    Then status 201
     And match $.id == '#present'
    And match response.name == 'jerry'
    And match response.email == 'jerry15@gmail.com'
