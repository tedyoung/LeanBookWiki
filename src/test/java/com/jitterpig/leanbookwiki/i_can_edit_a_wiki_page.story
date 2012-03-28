Meta:
@author tedyoung@gmail.com

Narrative:
As a user
I want to edit an existing wiki page
So that I can add information to the wiki

Scenario:
Given a new wiki
And I'm on the 'Home' page
When I create a new page called 'Test'
And I click on the edit button
Then the edit area contains '# Test'
