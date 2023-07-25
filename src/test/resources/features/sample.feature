Feature: Calculator
  Scenario: Add two numbers
    Given I have a calculator
    When I add 10 and 20
    Then the result should be 30
