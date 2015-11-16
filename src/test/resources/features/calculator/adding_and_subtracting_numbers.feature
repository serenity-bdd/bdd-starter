Feature: Adding and subtracting numbers

  Scenario Outline: Adding two numbers
    Given Jane want to add two numbers <a> and <b>
    When she add <a> and <b>
    Then she should get <a_plus_b>
    Examples:
      | a | b | a_plus_b |
      | 1 | 0 | 1        |
      | 0 | 1 | 0        |
      | 3 | 5 | 8        |

