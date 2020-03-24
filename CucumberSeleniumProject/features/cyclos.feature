Feature: Test login for Cyclos

Scenario:Test Cyclos with valid credentials
Given Open Chrome and start application
When I provide valid valid username and password
Then user should be able to login

Scenario: Test to verify whether application allow member to perform system payment

When Enter valid credentials in Member login text box
Then Registered member details should get displayed

When Click on Submit button of Grant loan
Then Grant loan to apurva page should get displayed

When Enter valid credentials in amount text box
Then Entered credentials in amount text box should get displayed

When Enter valid credentials in Description textbox
Then Entered credentials in Description text box should get displayed

When Click on Submit button
Then You are about to grant the following loan: with loan details should get displayed

When Click on Submit button
Then The loan was successfully granted message in pop up window should get displayed

When Click on OK button
Then Member details page should get displayed

When Click on Submit button of View Loans
Then Details of Loans granted to all member should get displayed

