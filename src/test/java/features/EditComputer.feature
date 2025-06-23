Feature: User should be able to Edit the Computer added 
    Verify is user is able to edit the Computer added to the Computer DB
    
    Scenario Outline: Editing Computer Name in Computer DB
    Given user is on Computer DB application
    When user clicks on the button 'Add a new computer'
    And user enters "<ComputerName>","<IntroducedDate>","<DiscontinuedDate>" and "<Company>" then clicks on button 'Create this Computer'
    And user enters "<ComputerName>" in the 'Filter By Computer Name' text box and clicks on button 'Filter By Name'
    When user clicks on the link "<ComputerName>"
    Then user should be able to edit the details like "<ComputerName_Edited>" and click on button 'Save this Computer'
    And user enters "<ComputerName_Edited>" in the 'Filter By Computer Name' text box and clicks on button 'Filter By Name'
    Then should be able to view the "<ComputerName_Edited>" listed below
 		Examples:
 		|ComputerName|ComputerName_Edited|IntroducedDate|DiscontinuedDate|Company|
 		|DELL PER4   |DELL INSPIRON      |2008-09-09    |2015-07-06      |OMRON  |