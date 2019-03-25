Feature: Test Cucumber Picocontainer

  @sucess
  Scenario: Test Softpost Success
    Given I am on the www.softpost.org home page
    Then I verify that title contains tutorials

  @error
  Scenario: Test Softpost Error
    Given I am on the www.softpost.org home page
    Then I verify that title contains tutooorials