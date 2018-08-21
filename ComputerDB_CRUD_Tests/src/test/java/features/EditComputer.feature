Feature: Login Logout Feature
  Verify if user is able to Login in to the Gurukula site

  Scenario: Login as a authenticated user
    Given user is on gurukula welcome page
    When user navigates to login page
    And user enters "admin" and "admin"
    And user clicks on Authenticate button
    Then success message is displayed
    
  #Scenario: Logout from the Gurukula website
    #Given user click on logout link
    #Then user is logged out of the system
    
  