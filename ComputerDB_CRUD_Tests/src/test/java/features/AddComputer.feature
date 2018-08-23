Feature: User should be able to add a new Computer into the Computer DB
    Verify is user is able to add a new computer in the Computer DB

    Scenario Outline: Adding a new Computer to the Computer DB
    Given user is on Computer DB application
    When user clicks on the button 'Add a new computer'
    And user enters "<ComputerName>","<IntroducedDate>","<DiscontinuedDate>" and "<Company>" then clicks on button 'Create this Computer'
    Then verify that the new computer is added with name "<ComputerName>"
 		Examples:
 		|ComputerName|IntroducedDate|DiscontinuedDate|Company|
 		|DELL ESP    |2008-09-09    |2015-07-06      |OMRON  |
 		|ACE         |2008-09-09    |2015-07-06      |IBM    |