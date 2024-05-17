Feature: validation of Get request

  #Background: 
    #* url 'https://reqres.in/api/'
    #* header Accept = 'application/json'

  Scenario Outline: Automating <name> using Get Request of test case Id - <ID>
    Given path 'users?page=2'
    When method GET
    And print response
    Then status 200

    Examples: 
      | name    | ID       |
      | 'Reqres | '286851' |

  @WithoutB
  Scenario Outline: Automating <name> using Get Request of test case Id - <ID>
    Given url URL
    When method GET
    And print response
    Then status 200

    Examples: 
      | name    | ID       |
      | 'Reqres | '286851' |

 
  Scenario: Automating URL with patha params
    Given path 'users'
    And param page = 2
    When method GET
    And print response
    And print responseTime
    And print responseHeaders 
    Then status 200
    And match responseStatus == 200
    And match response.data[1].id == 8
    And match $.data[1].email == "lindsay.ferguson@reqres.in"

    
