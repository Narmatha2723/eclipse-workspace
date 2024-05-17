Feature: validate get request

#Scenario: verify current weather data

#Given url 'https://api.openweathermap.org/data/2.5/weather?lat=44.34&lon=10.99&appid=77f1468b3cb0accb888c9ee585b125b5'
#When method get
#Then status 200
#And match response.weather[0].description contains 'overcast clouds'
#And match response.weather[0].description == '#string'




Scenario Outline: verify current weather data
Given url '<url>'
And request '{"name":"narmatha","salary":"123459876","age":"23"}'
When method post
Then status 200
And def des = response.weather[0].description
Then print des

Examples:
|url|
|https://api.openweathermap.org/data/2.5/weather?lat=44.34&lon=10.99&appid=77f1468b3cb0accb888c9ee585b125b5|