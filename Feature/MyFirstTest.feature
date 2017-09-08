Feature: Check login page 

Scenario: Enter username and check validation error
Given Launch browser and enter username 
When Enter username 
Then It should through invalid error 
 