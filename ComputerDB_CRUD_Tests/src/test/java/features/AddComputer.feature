Feature: Create a new Branch in the system
    Verify is user is able to create a new branch in the system

    Scenario: Navigate to Branch Page verify if able to create a new branch
    Given Login using credentials "admin" and "admin"
    When User navigates to Branch Page and clicks on button Create New Branch
    And a new popup is displayed where user enters branchDetails
 		|Name     | Code|
  	|PHYSICS  | B1  | 
    Then view the branch record added to the Branches page
    |Name     | Code|
  	|PHYSICS  | B1  |
   
   
    
    
    