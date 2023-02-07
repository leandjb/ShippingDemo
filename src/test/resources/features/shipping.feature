Feature: Test for shipping process on UPS website

  @Test
  Scenario: shipping
    Given is on homepage
    When complete the form
    Then the order is scheduled