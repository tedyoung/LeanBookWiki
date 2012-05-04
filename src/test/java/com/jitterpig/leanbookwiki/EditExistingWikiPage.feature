Feature: Edit an existing Wiki page
  As a user
  I want to edit an existing wiki page
  So that I can add information to the wiki

  Scenario: Change contents of a wiki page
    Given a new wiki
     And  I'm on the 'Home' page
    When  I create a new page called 'Test'
     And  I change the contents of 'Test' to be '#Test'
    Then  the page 'Test' contains the markdown '#Test'
     And  the page 'Test' contains the HTML '<h1>Test</h1>'
