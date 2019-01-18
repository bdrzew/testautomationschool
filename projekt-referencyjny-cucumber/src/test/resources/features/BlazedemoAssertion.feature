Feature: Blazedemo assertion test
  Blazedemo tests showing usage of assertions

  Background:
    Given Blazedemo choose flight page opened

  Scenario: Verify Flights Order
    When Flight picked up from "Paris" to "Buenos Aires"
    Then Displayed flights order is as follows:
      | 43   |
      | 234  |
      | 9696 |
      | 12   |
      | 4346 |

  Scenario Outline: Verify Flights Order Submit
    When Flight picked up from "<From>" to "<To>"
    And Flight 0 is selected
    And Purchase form is submitted using name "Adam"
    Then Text is displayed: "Thank you"
    Examples:
      | From   | To           |
      | Paris  | Buenos Aires |
      | Boston | Rome         |



