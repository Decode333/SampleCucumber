Feature: validating Adactin Hotel App Login

Scenario: validating with valid username and valid password

Given user needs to launch "https://adactinhotelapp.com/index.php" on chrome
When user needs to enter valid username "nithinraje" and valid password "9876543210"
And user needs to click on the login button
Then user needs to validate login functionality