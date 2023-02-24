Feature: Login

Scenario Outline: Successful Login
  Given User Launches Chrome WebDriver
  When User opens URL "http://admin-demo.nopcommerce.com/login"
  And User enters Email as "<email>" and Password as "<password>"
  And Click on Login
  Then Page Title should be "Dashboard / nopCommerce administration"
  When user clicks on Log Out Link
  Then Page Title should be "Your store. Login"
  And Close browser

  Examples:
    | email                 | password |
    | admin@yourstore.com   | admin    |
    | user@example.com      | password |
    | anotheruser@example.com | pass123 |