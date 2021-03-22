Feature: SF2 Scenario

  Scenario Outline: Create an client in SF2
    Given I navigate to the Homepage
    And Enter <userName> and <Password>
    And User Click on Clients
    Then Create an client
    Then Click on account and create the account for the client
    Then Add debts
    Then Add Bank
    Examples:
      | userName                      | Password    |
      | pawan.jogi@mindzcloud.com.uat | Aaibaba@123 |