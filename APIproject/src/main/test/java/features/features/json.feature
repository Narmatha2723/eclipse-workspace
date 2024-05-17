Feature: json feature testing 

Scenario:  jason reader parser

* def jsonObject = 
"""
[
{
  "name" : "Tom",
  "city" : "Bangalore",
  "Age"  : 25
},
{
  "name" : "Tobia",
  "city" : "chennai",
  "Age"  : 15
}  
]
"""
* print jsonObject
* print jsonObject[0]