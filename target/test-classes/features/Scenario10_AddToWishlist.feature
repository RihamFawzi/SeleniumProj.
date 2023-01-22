@regression

Feature: AddToWishlist
Registered user can add differnet products to wishlist
 
 Scenario: Add differnet products to wishlist
 
 When navigate to HomePage
 And search for product in search box
 And  user add product to Wishlist
 Then user can add different products to Wishlist