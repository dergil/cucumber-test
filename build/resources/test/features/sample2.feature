Feature: Calculator_Diff
  Scenario: Subtract two numbers
    Given I have a calculator
    When I subtract 10 from 20
    Then the result should be 10

  Scenario: Multiply two numbers
    Given I have a calculator
    When I multiply 5 by 6
    Then the result should be 30

  Scenario: Divide two numbers
    Given I have a calculator
    When I divide 100 by 20
    Then the result should be 5
