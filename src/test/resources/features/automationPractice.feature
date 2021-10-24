Feature: test script demo
This feature demonstrates how to validate the add to wish list and add to cart journey

Scenario Outline: Validate that user is able to search and add lowest price item to cart and verify in the cart

Given I access the application url "https://testscriptdemo.com/"
When I search for the product "<productName>"
Then I should navigate to the search results page
And sort the result based on price low to high
When I add the trousers to cart
Then check in cart

Examples:
	|productName |
	| trousers   |

Scenario Outline: Validate that user is able to add four different products to wish list and verify in the wishlist

When I add four different products to the wishlist
And I navigate to the wishlist
Then I should find total four selected items in my wishlist