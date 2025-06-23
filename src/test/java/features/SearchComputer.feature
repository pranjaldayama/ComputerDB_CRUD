Feature: Search a computer added in the database
    Verify is user is able to search a computer added to the Computer DB
    
    Scenario Outline: User should be able to Search the Computer added into the Computer DB
    Given user is on Computer DB application
    When user clicks on the button 'Add a new computer'
    And user enters "<ComputerName>","<IntroducedDate>","<DiscontinuedDate>" and "<Company>" then clicks on button 'Create this Computer'
    And user enters "<ComputerName>" in the 'Filter By Computer Name' text box and clicks on button 'Filter By Name'
    Then should be able to view the "<ComputerName>" listed below
 		Examples:
 		|ComputerName|IntroducedDate|DiscontinuedDate|Company|
 		|DELL PER3   |2008-09-09    |2015-07-06      |OMRON  |
 		|ACE  PER3   |2008-09-09    |2015-07-06      |IBM    |