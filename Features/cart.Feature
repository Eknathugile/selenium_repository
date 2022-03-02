#gherkin
#why bdd===>
  @add_to_cart
 Feature: Shopping cart Action
 Scenario:Add computer in shopping cart
 Given Open Home Page
 When Navigate to LogIn Page
 And User enters Email,Password and click on login button
 Then Search for computer 
 Then add computer in cart
 And Change the feature as per need
 Then add into the shopping cart
 Then Message displayed The product has been added to your shopping cart
 
 