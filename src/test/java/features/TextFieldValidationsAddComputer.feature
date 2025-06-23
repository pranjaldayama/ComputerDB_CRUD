Feature: User should not be able to input the invalid Computer Details 
    Verfiy that there should be proper text field validation for Adding a New Computer 
    # Verify that date should be in format YYYY-MM-DD
    # Verfiy that MM field cannot be greater than 12 and less than 01
    # Verify that DD Fieled should contain a valid date
    # Verify that YYYY Field should contain a valid Year
    # Verify that there should not be special characters in the Date / Computer Name field
    # Verify that Introduced date should not be future date
    # Verify that Discontinued date should be less that current date
    
    Scenario Outline: There should be proper text field validation for Adding a New Computer 
    Given user is on Computer DB application
    When user clicks on the button 'Add a new computer'
    And user enters "<ComputerName>","<IntroducedDate>","<DiscontinuedDate>" and "<Company>" then clicks on button 'Create this Computer'
    Then verify the valid / invalid text fields data according to the "<Status>"
    Examples:
 		|ComputerName|IntroducedDate|DiscontinuedDate|Company|Status |
 		|DELL ESP    |2008-09-09    |2015-07-06      |OMRON  |SUCCESS|
 		|DELL #$%    |2008-16-32    |2008-16-32      |OMRON  |FAILURE|
 		|DELL        |2008-16-32    |200-6-32        |OMRON  |FAILURE|
 		|ACE $%      |2008-16-32    |200-6-32        |OMRON  |FAILURE|
 		
 		