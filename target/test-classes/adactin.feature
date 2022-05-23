Feature: Validate the Hotel Booking Functionality
Scenario: Validate the booking function by passing all valid arguments
Given user needs to initiate "chrome" and launch "https://adactinhotelapp.com/index.php"
Given user needs to enter valid username "nithinraje" and valid password "9876543210"
And user needs to click on the login button
Then user needs to enter location "Paris", select hotel "Hotel Creek", select roomtype "Super Deluxe", no of rooms "1", checkin date "13/05/2022", checkout date "15/05/2022", no of adults "2", no of children "0"
Then user needs to click on the search button
Then user needs to select the radio button of the hotel and click continue button
Then user needs to enter firstname "Nithin", lastname "Raj", address "Vadipatti, Madurai", credit card number "6398521456328745", credit card type "VISA", expiry month "3", expiry year "2022" and cvv no "963"
Then user needs to click book now button
Then user validates the order id generated