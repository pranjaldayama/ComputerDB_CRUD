Feature: User should be able to Delete the Computer added 
    Verify is user is able to edit the Computer added to the Computer DB
  
    Scenario Outline: Editing Computer Name in Computer DB
    Given user is on Computer DB application
    When user clicks on the button 'Add a new computer'
    And user enters "<ComputerName>","<IntroducedDate>","<DiscontinuedDate>" and "<Company>" then clicks on button 'Create this Computer'
    And user enters "<ComputerName>" in the 'Filter By Computer Name' text box and clicks on button 'Filter By Name'
    When user clicks on the link "<ComputerName>"
    Then user should be able to view and click the button 'Delete this Computer'
    And user enters "<ComputerName>" in the 'Filter By Computer Name' text box and clicks on button 'Filter By Name'
    Then user should not be able to view the "<ComputerName>" listed below
 		Examples:
 		|ComputerName|IntroducedDate|DiscontinuedDate|Company|
 		|DELL PER8   |2008-09-09    |2015-07-06      |OMRON  |