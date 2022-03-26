Feature: Check whether nav main bar links are present

  Scenario Outline: Check main nav bar links (top) v2
    Given User is on "Home Page"

    When User wants to use any main nav bar link

    Then Every of "<navBarLink>" is present

    Examples:
      | navBarLink       |
      | Today's Deals    |
      | Customer Service |
      | Registry         |
      | Gift Cards       |
      | Sell             |