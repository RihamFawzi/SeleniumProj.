@regression

Feature: DifferentTagSelection
Registered user can select different tag
 
 Scenario: DifferentTagSelection


When navigate to HomePage
And user hover category and select subcategory
And user can select different tag
Then selected tag is displayed