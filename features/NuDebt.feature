Feature: NuDebt Scenario

  Scenario Outline: Create an Nudebt Program
    Given I navigate to the Salesforce
    And I enter <userName> and <password>
    And User Click on Prospects
    Then User Creates New Prospects
    Then Fill banking information
    Then Fill creditors
    Then Fill program details
    Then Click on Convert
    Then Fill SFS balance
    Then Click on Client Details
    Examples:
      | userName                            | password  |
      | mz-sfdc-devs@mindzcloud.com.sfs.uat | Mz@123456 |