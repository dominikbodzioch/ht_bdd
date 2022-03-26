Feature: Add/Remove Item functionality test

  Scenario: Add Item to Cart
    Given User is on "Home Page"

    When User chooses any category on "Home Page"
    And User chooses any item on "Category Page"
    And User adds item to cart on "Item Page"

    Then User info "Added to Cart" and "1" item in the cart on "Added To Cart Page"

  Scenario: Remove Item from Cart
    Given User is on "Home Page"

    When User chooses any category on "Home Page"
    And User chooses any item on "Category Page"
    And User adds item to cart on "Item Page"
    And User opens "Cart Page" and deletes item from cart

    Then User info "Your Amazon Cart is empty." on "Cart Page"
    And Subtotal is "0.00" on "Cart Page"