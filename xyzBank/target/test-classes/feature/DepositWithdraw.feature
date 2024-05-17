Feature:  deposite and withdrawing the amount

Scenario: Verify whether Customer is able to deposit and withdraw the amount
Given launch xyz bank url in browser
When click on Customer Login button 
And Select name from --Your Name-- dropdown button and click login button
And  Click on Deposit tile 
And  enter deposit amount and Click on Deposit button
And Validate amount deposited is correctly displayed in Balance
And  Click on Withdrawal tile
And enter withdrawn amount and click on withdraw button
And Validate that user gets Transaction successful message
And Validate that user is able to see correct balance after withdrawal
Then Go to Transactions Take a screenshot