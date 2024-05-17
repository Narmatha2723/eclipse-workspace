Feature: Create user using POST API

  Background: 
    * url 'https://gorest.co.in'
    * def random_String =
      """
      function(s){
      var text = "";
      var pattern = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
      for(var i=0; i<s; i++)
         text += pattern.charAt(Math.floor(Math.random() * pattern.length()));
         return text;
         }
      """
    * def randomString = random_String(10)
    * print randomString
    * def requestPayload =
      """
      {
       
         "name" : "jerry",
         "gender" : "female",
         "status" : "active"
      }

      """
    * requestPayload.email = randomString + "@gmail.com"
    * print requestPayload

  Scenario: create user with the given data
    Given path '/public/v2/users'
    And request requestPayload
    And header Authorization = 'Bearer '+TokenId
    When method post
    Then status 201
    And match $.id == '#present'
    And match response.name == 'jerry'
