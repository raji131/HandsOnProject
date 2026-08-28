Feature: Flipkart Product Search

Scenario: Search and print all Apple iPhone products

Given User opens Flipkart website
When User closes the popup
And User searches for "iPhone"
And User SEARCHES AND PRINT ALL "Apple iphone" products
Then Apple iPhone products should be displayed