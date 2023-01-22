@regression

Feature: Login
 User can login with valid email and password
 
 Scenario: Login
 
 Given The user click on login link
 When The user enter the valid email and password
 Then The user can login successfully