@regression

Feature: Password Reset
 User can reset password successfully
 
 Scenario: Password Reset
 
 Given The user enter my account link
 When The user click on change password and enter the new password
 Then The user reset the password successfully