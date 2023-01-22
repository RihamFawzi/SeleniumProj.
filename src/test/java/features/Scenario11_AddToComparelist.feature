@regression

Feature: AddToComparelist
Registered user can add differnet products to compare list
 
 Scenario: Add differnet products to compare list
 
 When navigate to HomePage
 And search for product in search box
 And  user add product to compare list
 Then user can add different products to compare list