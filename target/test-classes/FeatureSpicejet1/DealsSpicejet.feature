Feature: Search and Place The Select for Deals

Scenario: Search Experience for Deals Search n Both Home and Next Page

Given User is on Spicejet Landing Page
When User Click With Deals_1 and Actual Name of Deals_1
Then User Click For Deals_1 in Next Page if Deal Exist
And Validate Deals name in next page matches with landing page