Feature: Login Functionality to test parallel excution
  In order to do internet banking
  As a valid Para Bank customer
  I want to login successfully


  Scenario Outline: Login Successful
    Given I am in the login page
    When I enter valid username as "<username>" and password as "<password>"
    Then I should be taken to the Overview page

    Examples:
      |username|password|
      |tomsmith|SuperSecretPassword!|
      |tomsmith|SuperSecretPassword!|