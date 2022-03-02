#gherkin 
#why bdd ===>
@Login_log_out 
Feature: Login Action
@succesful_login
Scenario: Successful Login with Valid Credentials
Given User is on Home Page
When User Navigate to LogIn Page
And User enters UserName and Password
Then Message displayed Login Successfully
@unsuccesful_login
Scenario: Successful Logout
When User Logout from the Application
Then Message displayed Logout Successfully