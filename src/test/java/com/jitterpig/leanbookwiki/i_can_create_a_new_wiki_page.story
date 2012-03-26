Meta:

Narrative:
As a user
I want to create a new wiki page
So that I can add information to the wiki

Scenario: Go to the wiki and be greeted with an empty home page
Given a new wiki
When I go to the 'Home' page
Then the page 'Home' is shown
And the page 'Home' is empty

Scenario: Create a new wiki page with valid name
Given that the wiki is empty
When a new wiki page called 'Test' is created
Then the wiki page 'Test' exists
And the page 'Test' is empty
