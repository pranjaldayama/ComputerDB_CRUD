Feature: Verify that user should not be able to add a duplicate Computer
    User should not be able to add duplicate Computer to the Computer DB
    
    Scenario Outline: User should not be allowed to enter duplicate computer into the Computer DB
    Given user is on Computer DB application
    When user clicks on the button 'Add a new computer'
    And user enters "<ComputerName>","<IntroducedDate>","<DiscontinuedDate>" and "<Company>" then clicks on button 'Create this Computer'
    And user enters "<ComputerName>" in the 'Filter By Computer Name' text box and clicks on button 'Filter By Name'
    Then verify that user should be able to add a "<ComputerName>" only once
 		Examples:
 		|ComputerName|IntroducedDate|DiscontinuedDate|Company|
 		|DELL ESP    |2008-09-09    |2015-07-06      |OMRON  |
 		|DELL ESP    |2008-09-09    |2015-07-06      |OMRON  |