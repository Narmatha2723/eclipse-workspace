Feature: User is able to create the new customer, add account and serach for customer using newly created account number
Scenario: create the new customer, add account and serach for customer
    Given enter xyz bank url in browser
    When click on Bank Manager Login button
    And user gives customer details
    And Click on Add Customer button
    And validate popup and click ok
    And go to  Open Account tile
    And Click on Customer Name dropdown and select newly added customer
    And click currency dropdwon and add currency
    And click Process button
    And Validate that pop-up is displayed with successful message
    And Go to Customers tile
    And Search customer based on newly created account number
    Then take screenshot and validate 