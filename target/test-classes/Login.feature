Feature: Login Functionality
  In order to do internet banking
  As a valid Para Bank customer
  I want to login successfully

  #1
  #Scenario: Login Successful
    #Given I am in the login page
    #When I enter valid credentials
    #Then I should be taken to the Overview page

  #Scenario: Login Successful
   #Given I am in the login pagee
   # When I enter valid credentials
   # Then I should be taken to the Overview page

  #2
  Scenario Outline: Login Successful
    Given I am in the login page
    When I enter valid username as "<username>" and password as "<password>"
    Then I should be taken to the Overview page

    Examples:
      |username|password|
      |tomsmith|SuperSecretPassword!|
      |tomsmith|SuperSecretPassword!|