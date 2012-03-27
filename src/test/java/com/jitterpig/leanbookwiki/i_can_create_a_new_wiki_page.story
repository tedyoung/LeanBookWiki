Meta:

Narrative:
As a user
I want to create a new wiki page
So that I can add information to the wiki

Scenario: Go to the wiki and be greeted with an empty home page
Given a new wiki
When I go to the 'Home' page
Then the 'Home' page is shown
And the page 'Home' is empty

Scenario: Create a new wiki page with valid name
Given I'm on the 'Home' page
When I create a new page called 'Test'
Then the 'Test' page is shown
And the page 'Test' is empty

Scenario: