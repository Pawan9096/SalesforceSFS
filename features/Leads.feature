Feature: Leads

  Scenario Outline: Convert the Leads into the opportunity
    Given I navigate to the Salesforce
    And I enter <userName> and <password>
    And Click on Global search
    Then Enter the '<Client Name>'
  #  Then Select Lead from the search result

    Examples:
      | userName                                 | password          | Client Name  |
      | mz-sfdc-devs@mindzcloud.com.sfs.prizmuat | MzPrizmUAT@123456 | Test LeadTen |