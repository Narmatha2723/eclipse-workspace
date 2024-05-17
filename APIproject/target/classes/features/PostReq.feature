Feature: validate post request

Scenario Outline: creating new data
Given url '<url>'
And request '{"name":"narmatha","salary":"123345445","age":"23"}'
When method post
Then match response.status contains "success"

Examples:
|url|
|https://dummy.restapiexample.com/api/v1/create|
