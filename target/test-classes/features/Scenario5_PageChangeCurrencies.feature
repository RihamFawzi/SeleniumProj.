@regression

Feature: CurrenciesChange
Registered user can change currencies
 
 Scenario: CurrenciesChange
 
 Given navigate to HomePage
 When select another currency from DDL
 Then currency is changed successfully