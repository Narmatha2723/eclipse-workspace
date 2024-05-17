Feature: Validating The Get Request Using Karate Framework

Scenario: Automating the dummy API of Employee List from Reqres 

Given url 'https://reqres.in/api/users?page=2'
When method GET
Then status 200
