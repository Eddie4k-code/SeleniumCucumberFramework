Feature: AddCustomer

Scenario Outline: Add Customer
  Given User Launches Chrome WebDriver
  When User opens URL "http://admin-demo.nopcommerce.com/login"
  And User enters Email as "<email>" and Password as "<password>"
  And Click on Login
  Then Page Title should be "Dashboard / nopCommerce administration"
  And User clicks on Customers Panel
  Then User clicks Customer button
  And User clicks Add New
  Then User enters Email
  And Close browser
  
  
    Examples:
    | email                 | password |
    | admin@yourstore.com   | admin    |
    

