@regression

Feature: Product Search
Registered user can search for product
 
 Scenario: Product Search
 
 Given navigate to HomePage
 When user enter the valid email and new password
 And search for product in search box
 Then product details appears
 
 