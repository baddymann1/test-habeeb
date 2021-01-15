@create_test_habeeb
Feature: When I create a TestHabeeb, then I create a TestHabeeb

  Scenario: When I call the endpoint a new TestHabeeb is created
    Given I use the following body parameter of type SATestHabeeb:
      | description           |
      | description-session() |
    When I call TestHabeeb.doTestHabeeb endpoint
    Then the test_habeeb table has rows where description is equal to description-session() and contains the following data:
      | version |
      | 0       |
