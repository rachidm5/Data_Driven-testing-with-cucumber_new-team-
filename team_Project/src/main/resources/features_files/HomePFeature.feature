Feature:Interactions
 Background: Given User lands in jqueryui Home page

  Scenario: Selectable
        When  User clicks on Selectable a list of items should appear
        Then  User should be able to select desired "items"
  Scenario: Sortable
        When  User clicks on Sortable a list of items should appear
        Then  User should be able to move the desired "items" in the desired "position"