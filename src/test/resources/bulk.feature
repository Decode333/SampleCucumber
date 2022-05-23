Feature: Validate the Hotel Booking Functionality

  Scenario Outline: Validate the booking function by passing all valid arguments
    Given user needs to initiate "chrome" and launch "https://adactinhotelapp.com/index.php"
    Given user needs to enter valid username "nithinraje" and valid password "9876543210"
    And user needs to click on the login button
    Then user needs to enter "<location>", select "<hotel>", select "<roomtype>", "<no of rooms>", "<checkin>" date, "<checkout>" date , "<no of adults>", "<no of children>"
    Then user needs to click on the search button
    Then user needs to select the radio button of the hotel and click continue button
    Then user needs to enter "<firstname>", "<lastname>", "<address>", "<credit card number>", "<credit card type>", expiry "<month>", expiry "<year>" and "<cvv>" no
    Then user needs to click book now button
    Then user validates the order id generated

    Examples: 
      | location  | hotel          | roomtype     | no of rooms | checkin    | checkout   | no of adults | no of children | firstname | lastname  | address                    | credit card number | credit card type | month | year | cvv |
      | Paris     | Hotel Creek    | Standard     |           2 | 13/05/2022 | 14/05/2022 |            1 |              1 | NITHIN    | RAJ       | VADIPATTI, MADURAI         |   9632587412065741 | VISA             |     5 | 2022 | 235 |
      | Melbourne | Hotel Sunshine | Double       |           4 | 15/05/2022 | 16/05/2022 |            2 |              2 | AADHIL    | GREENS    | RASIPURAM, NAMAKKAL        |   5268749301456328 | AMEX             |     6 | 2022 | 412 |
      | Sydney    | Hotel Hervey   | Deluxe       |           6 | 17/05/2022 | 18/05/2022 |            3 |              3 | RAGUL     | GREENS    | PERAMBALUR, TRICHY         |   6357410986325417 | MAST             |     2 | 2022 | 785 |
      | Brisbane  | Hotel Cornice  | Super Deluxe |           8 | 19/05/2022 | 20/05/2022 |            4 |              4 | ABI       | SHEIK     | OOTY, NILGIRIS             |   6325412789632541 | OTHR             |     4 | 2022 | 415 |
      | Adelaide  | Hotel Creek    | Standard     |           9 | 21/05/2022 | 22/05/2022 |            2 |              0 | SANTHOSH  | KUMAR     | CHROMEPET, CHENNAI         |   8563214780156324 | VISA             |     8 | 2022 | 986 |
      | London    | Hotel Sunshine | Double       |          10 | 23/05/2022 | 24/05/2022 |            2 |              0 | DINESH    | KUMAR     | MELAMASI STREET, MADURAI   |   9632587412065741 | MAST             |     9 | 2022 | 486 |
      | New York  | Hotel Hervey   | Super Deluxe |           7 | 25/05/2022 | 26/05/2022 |            2 |              0 | MAREEE    | VERA MARI | SRIVILLIPUTUR, RAJAPALAYAM |   9632587412065741 | AMEX             |    10 | 2022 | 564 |
